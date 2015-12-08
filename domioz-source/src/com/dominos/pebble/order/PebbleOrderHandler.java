// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble.order;

import android.content.Context;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.models.LabsFlavor;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsPayment;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsSize;
import com.dominos.android.sdk.core.models.LabsTopping;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.dominos.pebble.PebbleCommand;
import com.dominos.pebble.PebbleManager;
import com.dominos.pebble.PebbleRequestManager;
import com.dominos.pebble.PebbleSession;
import com.dominos.pebble.order.client.PebbleEasyOrderClient;
import com.dominos.pebble.order.client.PebbleHistoricalOrderClient;
import com.dominos.pebble.order.client.PebbleOrderDetailClient;
import com.dominos.pebble.order.client.PebblePlaceOrderClient;
import com.dominos.pebble.order.client.PebblePriceOrderClient;
import com.dominos.utils.AnalyticsUtil;
import com.getpebble.android.kit.a.a;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PebbleOrderHandler
{

    private static final String BYO = "Build Your Own";
    private static final String BYO_HOAGIE = "S_HGBYO";
    private static final String BYO_PASTA = "S_BUILD";
    private static final String BYO_PIZZA = "S_PIZZA";
    private static final String BYO_SANDWICH = "S_BUILD2";
    private static final String CATEGORY_ARTISAN = "Artisan";
    private static final String CATEGORY_DESSERT = "Dessert";
    private static final String CATEGORY_DRINKS = "Drinks";
    private static final String CATEGORY_PASTA = "Pasta";
    private static final String CATEGORY_PIZZA = "Pizza";
    private static final String CATEGORY_WINGS = "Wings";
    private static final String CREDIT_CARD = "CreditCard";
    private static final String CREDIT_CARD_PAYMENT = "Credit Card";
    private static final String GIFTCARD = "GiftCard";
    private static final String LOG_TAG = com/dominos/pebble/order/PebbleOrderHandler.getName();
    private static final int MAX_LENGTH_DETAIL = 100;
    private static final int MAX_LENGTH_PRODUCT = 30;
    private static final int MAX_LENGTH_PRODUCT_NAME = 18;
    public static final String PEBBLE_CHANNEL = "pebble";
    private boolean mAllowOrder;
    AnalyticsUtil mAnalyticsUtil;
    private Context mContext;
    private MenuManager mMenuManager;
    private LabsOrder mOrder;
    OrderUtil mOrderUtil;
    PebbleManager mPebbleManager;
    PebbleSession mPebbleSession;
    PowerRestClient mPowerRestClient;
    private UserProfileManager mProfileManager;
    PebbleRequestManager mRequestManager;

    public PebbleOrderHandler(Context context)
    {
        mAllowOrder = true;
        mContext = context;
    }

    private boolean containsInvalidCreditCard(LabsOrder labsorder)
    {
        boolean flag;
        labsorder = labsorder.getPaymentList().iterator();
        flag = false;
_L2:
        LabsPayment labspayment;
        if (!labsorder.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        labspayment = (LabsPayment)labsorder.next();
        if (!StringHelper.equals(labspayment.getPaymentType(), "CreditCardToken"))
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag1 = (new SimpleDateFormat("MMyy")).parse(labspayment.getExpiration()).before(new Date());
        if (flag1)
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
        ParseException parseexception;
        parseexception;
        LogUtil.d(LOG_TAG, parseexception.getMessage(), new Object[0]);
        if (true) goto _L2; else goto _L1
_L1:
        return flag;
    }

    private String getProductName(LabsProductLine labsproductline)
    {
        if (StringHelper.equals(labsproductline.getProduct().getImageCode(), "S_PIZZA"))
        {
            return "Pizza";
        } else
        {
            return labsproductline.getProduct().getName().replace("Build Your Own", "");
        }
    }

    private boolean hideToppings(LabsProductLine labsproductline)
    {
        if (isBuildYourOwn(mMenuManager.createProductLineFromVariantCode(labsproductline.getCode())))
        {
            if (labsproductline.getToppingsList() != null && !labsproductline.getToppingsList().isEmpty())
            {
                Iterator iterator = labsproductline.getToppingsList().iterator();
                boolean flag = false;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    LabsTopping labstopping = (LabsTopping)iterator.next();
                    LogUtil.d(LOG_TAG, (new StringBuilder("topping quantity ")).append(labsproductline.getQuantity()).toString(), new Object[0]);
                    if (labstopping.getQuantityForPart(labstopping.getPartWithQuantity()) != 1.0D)
                    {
                        LogUtil.d(LOG_TAG, "topping", new Object[0]);
                        flag = true;
                    }
                    if (!StringHelper.equals(labstopping.getPartWithQuantity(), "1/1"))
                    {
                        LogUtil.d(LOG_TAG, "part", new Object[0]);
                        flag = true;
                    }
                } while (true);
                LogUtil.d(LOG_TAG, "after for", new Object[0]);
                return flag;
            } else
            {
                LogUtil.d(LOG_TAG, "after topinglist.isEmpty", new Object[0]);
                return false;
            }
        } else
        {
            LogUtil.d(LOG_TAG, "no BYO", new Object[0]);
            return labsproductline.getToppingsList().isEmpty();
        }
    }

    private boolean isBuildYourOwn(LabsProductLine labsproductline)
    {
        return StringHelper.equalsIgnoreCase(labsproductline.getProduct().getImageCode(), "S_PIZZA") || StringHelper.equalsIgnoreCase(labsproductline.getProduct().getImageCode(), "S_HGBYO") || StringHelper.equalsIgnoreCase(labsproductline.getProduct().getImageCode(), "S_BUILD2") || StringHelper.equalsIgnoreCase(labsproductline.getProduct().getImageCode(), "S_BUILD");
    }

    protected void onAfterInject()
    {
        mProfileManager = (UserProfileManager)mPebbleSession.getManager("user_manager");
        mMenuManager = (MenuManager)mPebbleSession.getManager("menu_manager");
    }

    public void placeOrder()
    {
        if (mProfileManager.getCurrentUser() != null)
        {
            if (StringHelper.equals(mOrder.getCustomerId(), mProfileManager.getCurrentUser().getCustomerId()))
            {
                if (mAllowOrder)
                {
                    mAllowOrder = false;
                    mOrder.setFeature("pebble");
                    mRequestManager.request("com.dominos.pebble.place-order", mOrder, new PebblePlaceOrderClient(mOrder.getStoreOrderId(), mOrder.getStoreId()));
                }
                return;
            } else
            {
                mPebbleManager.sendErrorToPebble(9);
                return;
            }
        } else
        {
            mPebbleManager.sendErrorToPebble(4);
            return;
        }
    }

    public void priceOrderAndSendToPebble(LabsOrder labsorder, boolean flag)
    {
        if (containsInvalidCreditCard(labsorder))
        {
            mPebbleManager.sendErrorToPebble(6);
            return;
        }
        if (!mProfileManager.isHistoricalOrderPaymentValid(labsorder))
        {
            mPebbleManager.sendErrorToPebble(13);
            return;
        }
        if (!mProfileManager.isAuthorizedToPlaceOrder(labsorder))
        {
            mPebbleManager.sendErrorToPebble(4);
            return;
        } else
        {
            mOrder = labsorder;
            mRequestManager.request("com.dominos.pebble.price-order", labsorder, new PebblePriceOrderClient(flag));
            return;
        }
    }

    public void sendCheckoutInfo()
    {
        Object obj = mOrder.getPaymentType();
        String s = ((String) (obj));
        if (StringHelper.equals(((String) (obj)), "CreditCardToken"))
        {
            s = "Credit Card";
        }
        obj = new a();
        PebbleCommand.GetCheckOutInfo.addCommand(((a) (obj)));
        ((a) (obj)).a(36, mOrder.getEstimatedWaitMinutes());
        ((a) (obj)).a(37, s);
        ((a) (obj)).a(38, (new StringBuilder()).append(mOrder.getStoreAddress().getStreet()).append(mOrder.getStoreAddress().getCity()).toString());
        mPebbleManager.sendToPebble(((a) (obj)));
    }

    public void sendEasyOrder()
    {
        mAnalyticsUtil.postPebbleSendEasyOrder();
        mRequestManager.request("com.dominos.pebble.historical-order", null, new PebbleEasyOrderClient());
    }

    public void sendOrderDataToPebble(LabsOrder labsorder, boolean flag)
    {
        LogUtil.d(LOG_TAG, "sending order data to pebble", new Object[0]);
        int j = 0;
        labsorder.setPaymentList(mOrder.getPaymentList());
        labsorder.setStoreAddress(mOrder.getStoreAddress());
        String s = labsorder.getStoreOrderId();
        String s1 = Double.toString(labsorder.getPrice());
        int l = labsorder.getProductLineList().size();
        Object obj;
        ArrayList arraylist;
        Iterator iterator;
        int i;
        boolean flag1;
        if (labsorder.isCarryout())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        flag1 = false;
        obj = new a();
        if (flag)
        {
            PebbleCommand.GetEasyOrder.addCommand(((a) (obj)));
        } else
        {
            PebbleCommand.GetOrderDetail.addCommand(((a) (obj)));
        }
        ((a) (obj)).a(1, (byte)l);
        ((a) (obj)).a(11, s);
        ((a) (obj)).a(13, (new StringBuilder("$")).append(s1).toString());
        ((a) (obj)).a(35, (byte)i);
        arraylist = new ArrayList();
        arraylist.add(obj);
        iterator = labsorder.getProductLineList().iterator();
        i = ((flag1) ? 1 : 0);
        while (iterator.hasNext()) 
        {
            LabsProductLine labsproductline = (LabsProductLine)iterator.next();
            String s2 = "";
            Object obj1 = "";
            obj = mMenuManager.createProductLineFromVariantCode(labsproductline.getVariant().getCode());
            boolean flag3;
            if (obj == null)
            {
                mPebbleManager.sendErrorToPebble(9);
                boolean flag2 = i;
                i = j;
                j = ((flag2) ? 1 : 0);
            } else
            {
                Object obj2 = ((LabsProductLine) (obj)).getProduct().getName();
                if (((LabsProductLine) (obj)).getSize() != null)
                {
                    s2 = ((LabsProductLine) (obj)).getSize().getName();
                }
                if (((LabsProductLine) (obj)).getFlavor() != null)
                {
                    obj1 = ((LabsProductLine) (obj)).getFlavor().getName();
                }
                String s5 = (new StringBuilder()).append(((LabsProductLine) (obj)).getToppingsList().size()).toString();
                a a1 = new a();
                if (flag)
                {
                    PebbleCommand.GetEasyOrder.addCommand(a1);
                } else
                {
                    PebbleCommand.GetOrderDetail.addCommand(a1);
                }
                if (isBuildYourOwn(((LabsProductLine) (obj))))
                {
                    obj = getProductName(((LabsProductLine) (obj)));
                    StringBuilder stringbuilder = new StringBuilder();
                    int k;
                    if (!s2.isEmpty())
                    {
                        obj2 = (new StringBuilder()).append(s2).append("\n").toString();
                    } else
                    {
                        obj2 = "";
                    }
                    obj2 = stringbuilder.append(((String) (obj2)));
                    if (!((String) (obj1)).isEmpty())
                    {
                        obj1 = (new StringBuilder()).append(((String) (obj1))).append("\n").toString();
                    } else
                    {
                        obj1 = "";
                    }
                    obj2 = ((StringBuilder) (obj2)).append(((String) (obj1)));
                    if (!hideToppings(labsproductline))
                    {
                        obj1 = (new StringBuilder()).append(s5).append(" toppings").toString();
                    } else
                    {
                        obj1 = mContext.getString(0x7f0803cb);
                    }
                    obj1 = ((StringBuilder) (obj2)).append(((String) (obj1))).toString();
                    if (StringHelper.equals(labsproductline.getProduct().getProductType(), "Pasta"))
                    {
                        obj1 = labsproductline.getProduct().getDescription();
                    }
                } else
                {
                    if (StringHelper.equals(labsproductline.getProduct().getProductType(), "Pizza") || StringHelper.equals(labsproductline.getProduct().getProductType(), "Artisan") || StringHelper.equals(labsproductline.getProduct().getProductType(), "Wings"))
                    {
                        obj1 = (new StringBuilder()).append(s2).append("\n").append(((String) (obj1))).toString();
                    } else
                    if (StringHelper.equals(labsproductline.getProduct().getProductType(), "Drinks") || StringHelper.equals(labsproductline.getProduct().getProductType(), "Dessert"))
                    {
                        if (!s2.isEmpty())
                        {
                            obj1 = (new StringBuilder()).append(s2);
                            obj = "\n";
                        } else
                        {
                            obj = new StringBuilder();
                            if (!((String) (obj1)).isEmpty())
                            {
                                String s3 = (new StringBuilder()).append(((String) (obj1))).append("\n").toString();
                                obj1 = obj;
                                obj = s3;
                            } else
                            {
                                String s4 = "";
                                obj1 = obj;
                                obj = s4;
                            }
                        }
                        obj1 = ((StringBuilder) (obj1)).append(((String) (obj))).toString();
                    } else
                    if (labsproductline.getProduct().getDescription().length() <= 30)
                    {
                        obj1 = labsproductline.getProduct().getDescription();
                    } else
                    {
                        obj1 = labsproductline.getProduct().getDescription().substring(0, 30);
                    }
                    if (((LabsProductLine)mOrder.getProductLineList().get(j)).getToppingsList().size() > 0)
                    {
                        obj1 = (new StringBuilder()).append(((String) (obj1))).append("\n").append(mContext.getString(0x7f0803cb)).toString();
                        obj = obj2;
                    } else
                    {
                        obj = obj2;
                    }
                }
                a1.a(2, (byte)i);
                a1.a(31, (byte)labsproductline.getQuantity());
                obj2 = obj;
                if (((String) (obj)).length() >= 18)
                {
                    obj2 = ((String) (obj)).substring(0, 18);
                }
                a1.a(32, ((String) (obj2)));
                a1.a(33, ((String) (obj1)));
                arraylist.add(a1);
                k = j + 1;
                j = i + 1;
                i = k;
            }
            mOrder = labsorder;
            flag3 = i;
            i = j;
            j = ((flag3) ? 1 : 0);
        }
        mPebbleManager.sendToPebbleChunked(arraylist);
    }

    public void sendOrderInfo(String s)
    {
        mRequestManager.request("com.dominos.pebble.historical-order", null, new PebbleOrderDetailClient(s));
    }

    public void sendProductDetail(String s)
    {
        Object obj = mMenuManager.createProductLineFromVariantCode(((LabsProductLine)mOrder.getProductLineList().get(Integer.parseInt(s))).getCode());
        mMenuManager.loadOptionsFromMenu(((LabsProductLine) (obj)));
        String s1 = ((LabsProductLine) (obj)).getProduct().getDescription();
        double d;
        a a1;
        int i;
        if (isBuildYourOwn(((LabsProductLine) (obj))))
        {
            if (StringHelper.equalsIgnoreCase(((LabsProductLine) (obj)).getProduct().getProductType(), "Pizza"))
            {
                s1 = (new StringBuilder()).append(((LabsProductLine) (obj)).getSize().getName()).append(", ").append(((LabsProductLine) (obj)).getFlavor().getName()).append(", ").append(((LabsProductLine)mOrder.getProductLineList().get(Integer.parseInt(s))).getProduct().getDescription()).toString();
            } else
            {
                s1 = ((LabsProductLine)mOrder.getProductLineList().get(Integer.parseInt(s))).getProduct().getDescription();
            }
        } else
        if (StringHelper.equalsIgnoreCase(((LabsProductLine) (obj)).getProduct().getProductType(), "Pizza") || StringHelper.equalsIgnoreCase(((LabsProductLine) (obj)).getProduct().getProductType(), "Wings"))
        {
            s1 = (new StringBuilder()).append(((LabsProductLine) (obj)).getSize().getName()).append(", ").append(((LabsProductLine) (obj)).getFlavor().getName()).append(", ").append(((LabsProductLine)mOrder.getProductLineList().get(Integer.parseInt(s))).getProduct().getDescription()).toString();
        }
        obj = new ArrayList();
        a1 = new a();
        PebbleCommand.GetProductDetail.addCommand(a1);
        d = Math.ceil((double)s1.length() / 100D);
        a1.a(1, (byte)(int)d);
        a1.a(3, (byte)100);
        a1.a(72, ((LabsProductLine)mOrder.getProductLineList().get(Integer.parseInt(s))).getProduct().getName());
        ((List) (obj)).add(a1);
        i = 0;
        while ((double)i < d) 
        {
            a a2 = new a();
            PebbleCommand.GetProductDetail.addCommand(a2);
            if (s1.length() > (i + 1) * 100)
            {
                s = s1.substring(i * 100, (i + 1) * 100);
            } else
            {
                s = s1.substring(i * 100, s1.length());
            }
            a2.a(2, (byte)i);
            a2.a(71, s);
            ((List) (obj)).add(a2);
            i++;
        }
        mPebbleManager.sendToPebbleChunked(((List) (obj)));
    }

    public void sendRecentOrder()
    {
        mAnalyticsUtil.postPebbleSendRecentOrder();
        mRequestManager.request("com.dominos.pebble.historical-order", null, new PebbleHistoricalOrderClient());
    }

    public void sendRecentOrderListToPebble(List list)
    {
        int i = list.size();
        if (list == null || list.isEmpty()) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        Iterator iterator1;
        arraylist = new ArrayList();
        a a1 = new a();
        PebbleCommand.GetOrderHistory.addCommand(a1);
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((LabsOrder)iterator.next()).isEasyOrder())
            {
                i = list.size() - 1;
            }
        } while (true);
        a1.a(1, (byte)i);
        arraylist.add(a1);
        iterator1 = list.iterator();
        i = 0;
_L4:
        String s;
        LabsOrder labsorder;
        String s2;
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        labsorder = (LabsOrder)iterator1.next();
        if (labsorder.isEasyOrder())
        {
            continue; /* Loop/switch isn't completed */
        }
        s2 = labsorder.getStoreOrderId();
        s = null;
        String s1 = (new SimpleDateFormat("EEE M/d")).format((new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")).parse(labsorder.getPlaceOrderTime()));
        s = s1;
_L5:
        LogUtil.d(LOG_TAG, (new StringBuilder("order date ")).append(s).append(" index ").append(i).append(" count ").append(list.size()).toString(), new Object[0]);
        a a2 = new a();
        PebbleCommand.GetOrderHistory.addCommand(a2);
        a2.a(2, (byte)i);
        a2.a(11, s2);
        a2.a(61, (byte)labsorder.getProductLineList().size());
        a2.a(12, s);
        arraylist.add(a2);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        mPebbleManager.sendToPebbleChunked(arraylist);
_L2:
        return;
        ParseException parseexception;
        parseexception;
          goto _L5
    }

    public void setAllowedOrder(boolean flag)
    {
        mAllowOrder = flag;
    }

}

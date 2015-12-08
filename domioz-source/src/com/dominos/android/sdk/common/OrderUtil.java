// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsPayment;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsSide;
import com.dominos.android.sdk.core.models.LabsTopping;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.models.dto.EasyOrder;
import com.dominos.android.sdk.core.models.dto.HistoricalOrder;
import com.dominos.android.sdk.core.models.dto.HistoricalOrderList;
import com.dominos.android.sdk.core.models.dto.Store;
import com.dominos.android.sdk.core.models.dto.TokenizedCards;
import com.dominos.android.sdk.core.models.json.AddressDeserializer;
import com.dominos.android.sdk.core.models.json.AddressSerializer;
import com.dominos.android.sdk.core.models.json.CouponLineDeserializer;
import com.dominos.android.sdk.core.models.json.CouponLineSerializer;
import com.dominos.android.sdk.core.models.json.OrderDeserializer;
import com.dominos.android.sdk.core.models.json.OrderSerializer;
import com.dominos.android.sdk.core.models.json.PartnersDeserializer;
import com.dominos.android.sdk.core.models.json.PartnersSerializer;
import com.dominos.android.sdk.core.models.json.PaymentDeserializer;
import com.dominos.android.sdk.core.models.json.PaymentSerializer;
import com.dominos.android.sdk.core.models.json.ProductLineDeserializer;
import com.dominos.android.sdk.core.models.json.ProductLineSerializer;
import com.dominos.android.sdk.core.models.json.ShopRunnerDeserializer;
import com.dominos.android.sdk.core.models.json.ShopRunnerSerializer;
import com.dominos.android.sdk.core.models.json.ShopRunnerTagDeserializer;
import com.dominos.android.sdk.core.models.json.ShopRunnerTagSerializer;
import com.dominos.android.sdk.core.models.json.SideSerializer;
import com.dominos.android.sdk.core.models.json.ToppingSerializer;
import com.dominos.android.sdk.core.order.PlaceOrderErrorCode;
import com.dominos.android.sdk.core.order.model.PriceOrder;
import com.dominos.android.sdk.extension.model.Partners;
import com.dominos.android.sdk.extension.model.ShopRunnerTag;
import com.dominos.android.sdk.extension.model.Shoprunner;
import com.google.b.ab;
import com.google.b.k;
import com.google.b.r;
import com.google.b.z;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.dominos.android.sdk.common:
//            DeviceCapabilities, StringHelper

public class OrderUtil
{

    private static final String CHANNEL_MOBILE = "Mobile";
    private static final String CHANNEL_TABLET = "Tablet";
    private static final String DRINKS = "Drinks";
    private static final String TAG = com/dominos/android/sdk/common/OrderUtil.getSimpleName();
    private static final double ZERO_VALUE = 0D;
    DeviceCapabilities mDeviceCapabilities;

    public OrderUtil()
    {
    }

    private LabsOrder copyCardToPayment(HistoricalOrder historicalorder)
    {
        LabsOrder labsorder = historicalorder.getOrder();
        if (historicalorder.getCards() != null && historicalorder.getCards().size() > 0)
        {
            HashMap hashmap = new HashMap();
            TokenizedCards tokenizedcards;
            for (Iterator iterator = historicalorder.getCards().iterator(); iterator.hasNext(); hashmap.put(tokenizedcards.getId(), tokenizedcards.getNickName()))
            {
                tokenizedcards = (TokenizedCards)iterator.next();
            }

            List list = labsorder.getPaymentList();
            for (int i = 0; i < list.size(); i++)
            {
                if (hashmap.containsKey(((LabsPayment)list.get(i)).getCardId()))
                {
                    LabsPayment labspayment = (LabsPayment)list.get(i);
                    labspayment.setNickName((String)hashmap.get(labspayment.getCardId()));
                    list.set(i, labspayment);
                }
            }

            labsorder.setPaymentList(list);
        }
        if (historicalorder.getStore() != null)
        {
            labsorder.setStoreAddress(historicalorder.getStore().getAddress());
        }
        return labsorder;
    }

    public void addChannelToOrder(LabsOrder labsorder)
    {
        if (labsorder != null)
        {
            String s;
            if (mDeviceCapabilities.getDeviceTypeByScreenSize() == DeviceCapabilities.DeviceType.MOBILE)
            {
                s = "Mobile";
            } else
            {
                s = "Tablet";
            }
            labsorder.setChannel(s);
        }
    }

    public boolean containsDrink(LabsOrder labsorder)
    {
        for (labsorder = labsorder.getProductLineList().iterator(); labsorder.hasNext();)
        {
            if (StringHelper.equalsIgnoreCase("Drinks", ((LabsProductLine)labsorder.next()).getProduct().getProductType()))
            {
                return true;
            }
        }

        return false;
    }

    public ArrayList createOrderListFromHistoricalOrder(HistoricalOrderList historicalorderlist)
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = historicalorderlist.getCustomerOrders().iterator(); iterator.hasNext(); arraylist.add(copyCardToPayment((HistoricalOrder)iterator.next()))) { }
        if (historicalorderlist.getEasyOrder() != null)
        {
            historicalorderlist = historicalorderlist.getEasyOrder();
            LabsOrder labsorder = copyCardToPayment(historicalorderlist);
            labsorder.setEasyOrder(true);
            labsorder.setEasyOrderNickName(historicalorderlist.getEasyOrderNickName());
            arraylist.add(labsorder);
        }
        return arraylist;
    }

    public LabsOrder fromJson(String s)
    {
        if (s.equals(""))
        {
            return new LabsOrder();
        }
        k k1 = (new r()).a(com/dominos/android/sdk/core/models/LabsOrder, new OrderDeserializer()).a(com/dominos/android/sdk/core/models/LabsPayment, new PaymentDeserializer()).a(com/dominos/android/sdk/core/models/LabsAddress, new AddressDeserializer()).a(com/dominos/android/sdk/core/models/LabsProductLine, new ProductLineDeserializer()).a(com/dominos/android/sdk/core/models/coupon/LabsCouponLine, new CouponLineDeserializer()).a(com/dominos/android/sdk/extension/model/Partners, new PartnersDeserializer()).a(com/dominos/android/sdk/extension/model/Shoprunner, new ShopRunnerDeserializer()).a(com/dominos/android/sdk/extension/model/ShopRunnerTag, new ShopRunnerTagDeserializer()).f();
        new ab();
        z z1 = (z)ab.a(s);
        s = z1;
        if (z1.a("Order"))
        {
            s = z1.d("Order");
        }
        return (LabsOrder)k1.a(s, com/dominos/android/sdk/core/models/LabsOrder);
    }

    public String getAddedProductQuantity(List list)
    {
        list = list.iterator();
        int i;
        for (i = 0; list.hasNext(); i = ((LabsProductLine)list.next()).getQuantity() + i) { }
        return Integer.toString(i);
    }

    public String getHistoricalPaymentType(LabsOrder labsorder)
    {
        if (labsorder.getPaymentList() != null && !labsorder.getPaymentList().isEmpty())
        {
            labsorder = (LabsPayment)labsorder.getPaymentList().get(0);
            if (labsorder.getPaymentType().equalsIgnoreCase("CreditCard"))
            {
                return "CreditCard";
            }
            if (labsorder.getPaymentType().equalsIgnoreCase("CreditCardToken"))
            {
                return labsorder.getCardId();
            }
            if (labsorder.getPaymentType().equalsIgnoreCase("Cash"))
            {
                return "Cash";
            } else
            {
                return "";
            }
        } else
        {
            return null;
        }
    }

    public PlaceOrderErrorCode getPlaceOrderErrorType(LabsOrder labsorder)
    {
        PlaceOrderErrorCode placeordererrorcode = PlaceOrderErrorCode.UNKNOWN;
        Iterator iterator = labsorder.getStatusItemList().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (Map)iterator.next();
            if (((Map) (obj)).containsKey("Code"))
            {
                obj = PlaceOrderErrorCode.getFailureType((String)((Map) (obj)).get("Code"));
                placeordererrorcode = ((PlaceOrderErrorCode) (obj));
                if (obj == PlaceOrderErrorCode.UNKNOWN)
                {
                    placeordererrorcode = ((PlaceOrderErrorCode) (obj));
                    if (labsorder.isPulseError())
                    {
                        if (labsorder.isGenericCreditCardError())
                        {
                            placeordererrorcode = PlaceOrderErrorCode.GENERIC_CREDIT_CARD_ERROR;
                        } else
                        {
                            placeordererrorcode = PlaceOrderErrorCode.GENERIC_PULSE_ERROR;
                        }
                    }
                }
            }
        } while (true);
        return placeordererrorcode;
    }

    public LabsAddress getServiceAddress(LabsOrder labsorder)
    {
        if (labsorder.getServiceMethod().equals("Carryout"))
        {
            return labsorder.getStoreAddress();
        } else
        {
            return labsorder.getAddress();
        }
    }

    public LabsCouponLine getUnfulfilledCouponLine(LabsOrder labsorder)
    {
        for (labsorder = labsorder.getCouponLineList().iterator(); labsorder.hasNext();)
        {
            LabsCouponLine labscouponline = (LabsCouponLine)labsorder.next();
            if (!labscouponline.isFulfilled())
            {
                return labscouponline;
            }
        }

        return null;
    }

    public boolean isHistoricalProductsListEmpty(LabsOrder labsorder)
    {
        return labsorder.getProductLineList() == null || labsorder.getProductLineList().isEmpty();
    }

    public boolean isHistoricalProductsRemoved(LabsOrder labsorder)
    {
        return labsorder.isProductRemoved();
    }

    public boolean isPaymentExpired(LabsOrder labsorder)
    {
label0:
        {
            labsorder = labsorder.getPaymentList();
            if (labsorder == null)
            {
                break label0;
            }
            labsorder = labsorder.iterator();
            do
            {
                if (!labsorder.hasNext())
                {
                    break label0;
                }
            } while (!((LabsPayment)labsorder.next()).isExpired());
            return true;
        }
        return false;
    }

    public boolean isPricedAmountValid(LabsOrder labsorder)
    {
        DecimalFormat decimalformat;
        try
        {
            decimalformat = new DecimalFormat("0.00");
        }
        // Misplaced declaration of an exception variable
        catch (LabsOrder labsorder)
        {
            return false;
        }
        if (labsorder == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        if (!labsorder.isPricingNeeded())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        throw new NullPointerException("Price Null");
        decimalformat.format(labsorder.getPrice());
        return true;
    }

    public boolean isProductsRemovedInHistoricalList(List list)
    {
        boolean flag = false;
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            boolean flag1 = ((LabsOrder)list.next()).isProductRemoved();
            flag = flag1;
            if (!flag1)
            {
                continue;
            }
            flag = flag1;
            break;
        } while (true);
        return flag;
    }

    public ArrayList parseOrderHistory(String s)
    {
        return createOrderListFromHistoricalOrder((HistoricalOrderList)(new r()).a(com/dominos/android/sdk/core/models/LabsOrder, new OrderDeserializer()).a(com/dominos/android/sdk/core/models/LabsProductLine, new ProductLineDeserializer()).a(com/dominos/android/sdk/core/models/coupon/LabsCouponLine, new CouponLineDeserializer()).a(com/dominos/android/sdk/core/models/LabsAddress, new AddressDeserializer()).f().a(s, com/dominos/android/sdk/core/models/dto/HistoricalOrderList));
    }

    public PriceOrder parsePriceOrder(String s)
    {
        return (PriceOrder)(new r()).a(com/dominos/android/sdk/core/models/LabsOrder, new OrderDeserializer()).a(com/dominos/android/sdk/core/models/LabsPayment, new PaymentDeserializer()).a(com/dominos/android/sdk/core/models/LabsAddress, new AddressDeserializer()).a(com/dominos/android/sdk/core/models/LabsProductLine, new ProductLineDeserializer()).a(com/dominos/android/sdk/core/models/coupon/LabsCouponLine, new CouponLineDeserializer()).a(com/dominos/android/sdk/extension/model/Partners, new PartnersDeserializer()).a(com/dominos/android/sdk/extension/model/Shoprunner, new ShopRunnerDeserializer()).a(com/dominos/android/sdk/extension/model/ShopRunnerTag, new ShopRunnerTagDeserializer()).f().a(s, com/dominos/android/sdk/core/order/model/PriceOrder);
    }

    public String toJson(LabsOrder labsorder)
    {
        return (new r()).a(com/dominos/android/sdk/core/models/LabsOrder, new OrderSerializer()).a(com/dominos/android/sdk/core/models/coupon/LabsCouponLine, new CouponLineSerializer()).a(com/dominos/android/sdk/core/models/LabsProductLine, new ProductLineSerializer()).a(com/dominos/android/sdk/core/models/LabsAddress, new AddressSerializer()).a(com/dominos/android/sdk/core/models/LabsPayment, new PaymentSerializer()).a(com/dominos/android/sdk/core/models/LabsTopping, new ToppingSerializer()).a(com/dominos/android/sdk/core/models/LabsSide, new SideSerializer()).a(com/dominos/android/sdk/extension/model/Partners, new PartnersSerializer()).a(com/dominos/android/sdk/extension/model/Shoprunner, new ShopRunnerSerializer()).a(com/dominos/android/sdk/extension/model/ShopRunnerTag, new ShopRunnerTagSerializer()).f().b(labsorder, com/dominos/android/sdk/core/models/LabsOrder);
    }

}

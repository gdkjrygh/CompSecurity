// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import android.content.Context;
import android.content.res.Resources;
import com.dominos.App;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.order.CreditCardType;
import com.dominos.android.sdk.common.dom.order.PaymentType;
import com.dominos.android.sdk.common.dom.order.ServiceMethod;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.constant.PaymentTag;
import com.dominos.android.sdk.core.models.FoodMenu;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsPayment;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsTopping;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.fordsync.FordSyncSession;
import com.dominos.fordsync.StreetAbbreviationSanitizer;
import com.dominos.fordsync.service.AppLinkManager;
import com.dominos.fordsync.service.SyncPowerAPI;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.ResUtils;
import com.google.a.a.aa;
import com.google.a.a.t;
import com.google.a.a.u;
import com.google.a.a.w;
import com.google.a.b.ah;
import com.google.a.b.bt;
import com.google.a.b.cj;
import com.google.a.b.cn;
import com.google.a.b.cy;
import com.google.a.b.db;
import com.google.a.b.z;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.c.d.d;

// Referenced classes of package com.dominos.fordsync.interactions:
//            YesNoInteraction, ErrorHandler_, RestartInteraction_, Upsell_, 
//            ErrorHandler, CallStore_

public abstract class AbstractOrder extends YesNoInteraction
{

    private t labsPaymentToCreditCardType;
    private t labsPaymentToPaymentType;
    AnalyticsUtil mAnalyticsUtil;
    private Context mContext;
    protected LabsOrder mCurrentOrder;
    private MenuManager mMenuManager;
    OrderUtil mOrderUtil;
    protected UserProfileManager mProfileManager;
    ResUtils mResourceUtility;
    private t toppingsByPart;

    public AbstractOrder(Context context)
    {
        labsPaymentToPaymentType = u.a(PaymentType.fromStringFn, LabsPayment.toPaymentTypeStringFn);
        labsPaymentToCreditCardType = u.a(CreditCardType.fromStringFn, LabsPayment.toCreditCardTypeStringFn);
        toppingsByPart = new _cls1();
        mContext = context;
    }

    private boolean doesStoreAllowThis(Set set, List list, t t)
    {
        return !cy.a(set, ah.a(list).a(t).a()).isEmpty();
    }

    private ErrorHandler enforceOrderRestrictions(LabsOrder labsorder, StoreProfile storeprofile)
    {
        if (labsorder.isCouponRemoved())
        {
            LogUtil.e("SyncInteraction", "enforcePaymentRestrictions: order had expired coupon", new Object[0]);
            return ErrorHandler_.getInstance_(getContext()).reason("order_coupon_invalid");
        }
        if (mOrderUtil.isHistoricalProductsRemoved(labsorder))
        {
            LogUtil.e("SyncInteraction", "enforcePaymentRestrictions: order had products removed", new Object[0]);
            return ErrorHandler_.getInstance_(getContext()).reason("order_products_removed");
        }
        List list = labsorder.getPaymentList();
        if (d.isEmpty(list))
        {
            LogUtil.e("SyncInteraction", "enforcePaymentRestrictions: empty payments list", new Object[0]);
            return ErrorHandler_.getInstance_(getContext()).reason("order_payment_invalid");
        }
        Collection collection = z.a(list, LabsPayment.toPaymentTypeStringFn);
        if (collection.contains("GiftCard"))
        {
            LogUtil.e("SyncInteraction", "enforcePaymentRestrictions: gift cards not accepted", new Object[0]);
            return ErrorHandler_.getInstance_(getContext()).reason("order_payment_invalid");
        }
        com.google.a.b.be be = storeprofile.getAcceptablePaymentTypes();
        if (!doesStoreAllowThis(be, list, labsPaymentToPaymentType))
        {
            LogUtil.e("SyncInteraction", "enforcePaymentRestrictions: store does not allow payment type [%s, %s]", new Object[] {
                be, list
            });
            return ErrorHandler_.getInstance_(getContext()).reason("order_payment_invalid");
        }
        if (collection.contains("Cash"))
        {
            return null;
        }
        if (!mProfileManager.isHistoricalOrderPaymentValid(labsorder))
        {
            LogUtil.e("SyncInteraction", "Historical payment invalid", new Object[0]);
            return ErrorHandler_.getInstance_(getContext()).reason("order_payment_invalid");
        }
        if (collection.contains("CreditCard") || collection.contains("CreditCardToken"))
        {
            labsorder = (LabsPayment)list.get(0);
            if (mProfileManager.isCardExpired(labsorder.getCardId()))
            {
                LogUtil.e("SyncInteraction", "enforcePaymentRestrictions: expired credit card", new Object[0]);
                return ErrorHandler_.getInstance_(getContext()).reason("order_credit_card_invalid");
            }
            labsorder = storeprofile.getAcceptableCreditCardTypes();
            if (!doesStoreAllowThis(labsorder, list, labsPaymentToCreditCardType))
            {
                LogUtil.e("SyncInteraction", "enforcePaymentRestrictions: store does not allow credit card type [%s, %s]", new Object[] {
                    labsorder, list
                });
                return ErrorHandler_.getInstance_(getContext()).reason("order_payment_invalid");
            }
        }
        return null;
    }

    private ErrorHandler evaluateAndUpdateOrder(LabsOrder labsorder)
    {
        Object obj = labsorder.getStoreId();
        if (!((String) (obj)).equals(mMenuManager.getMenu().getStoreID()) && restApi.updateMenu(((String) (obj))) == null)
        {
            LogUtil.e("SyncInteraction", "updateMenu failed", new Object[0]);
            labsorder = ErrorHandler_.getInstance_(app).reason("store_or_order_errors");
        } else
        {
            obj = restApi.getStoreProfile(((String) (obj)));
            if (obj == null)
            {
                LogUtil.e("SyncInteraction", "getStoreProfile failed", new Object[0]);
                return ErrorHandler_.getInstance_(app).reason("store_or_order_errors");
            }
            if (((StoreProfile) (obj)).isOnline() && ((StoreProfile) (obj)).isOpen())
            {
                if (ServiceMethod.fromString(labsorder.getServiceMethod()) == ServiceMethod.CARRYOUT && !((StoreProfile) (obj)).isCarryoutAvailable())
                {
                    return ErrorHandler_.getInstance_(app).reason("order_carryout_unavailable");
                }
                if (ServiceMethod.fromString(labsorder.getServiceMethod()) == ServiceMethod.DELIVERY && !((StoreProfile) (obj)).isDeliveryAvailable())
                {
                    return ErrorHandler_.getInstance_(app).reason("order_delivery_unavailable");
                }
                labsorder.setStoreAddress(LabsAddress.fromAddressDescription(((StoreProfile) (obj)).getAddressDescription()));
                mMenuManager.updateOrderFromMenu(labsorder);
                obj = enforceOrderRestrictions(mCurrentOrder, ((StoreProfile) (obj)));
                labsorder = ((LabsOrder) (obj));
                if (obj == null)
                {
                    return null;
                }
            } else
            {
                LogUtil.e("SyncInteraction", "store error [online=%s, open=%s]", new Object[] {
                    Boolean.valueOf(((StoreProfile) (obj)).isOnline()), Boolean.valueOf(((StoreProfile) (obj)).isOpen())
                });
                return RestartInteraction_.getInstance_(app).reason("order_store_closed");
            }
        }
        return labsorder;
    }

    private String getFormattedNameFordSync(String s, double d1)
    {
        String s1;
        if (d1 == 1.0D)
        {
            s1 = "";
        } else
        if (d1 == 0.0D)
        {
            s1 = mContext.getResources().getString(0x7f0801d8);
        } else
        {
            s1 = mResourceUtility.convertOptionQuantityToName(d1);
        }
        return String.format("%s %s", new Object[] {
            s1, s
        });
    }

    private String peelOptions(LabsProductLine labsproductline)
    {
        Object obj = cn.a("1/2", new String[] {
            "2/2", "1/1"
        }).a(toppingsByPart).b(labsproductline.getToppingsList());
        labsproductline = bt.h();
        LabsTopping labstopping;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); labsproductline.a(labstopping.getPartWithQuantity(), getFormattedNameFordSync(labstopping.getName(), labstopping.getQuantityForPart(labstopping.getPartWithQuantity()))))
        {
            labstopping = (LabsTopping)((Iterator) (obj)).next();
        }

        obj = labsproductline.f();
        labsproductline = w.a(", ").c(": ").a(((Map) (obj))).replaceAll("[\\[\\]]", "");
        if (d.isEmpty((Collection)((Map) (obj)).get(Integer.valueOf(0))) && d.isEmpty((Collection)((Map) (obj)).get(Integer.valueOf(2))) && !d.isEmpty((Collection)((Map) (obj)).get(Integer.valueOf(1))))
        {
            labsproductline = labsproductline.replaceAll("1:", "");
        }
        return labsproductline.replaceAll("0:", app.getString(0x7f08018a)).replaceAll("1:", app.getString(0x7f080341)).replaceAll("2:", app.getString(0x7f080283));
    }

    private void readOrderDetails()
    {
        PromptModel promptmodel = genericPrompts.getPrompter("order_details").getRandomPrompt();
        mAppLinkManager.show(promptmodel, new Object[] {
            mCurrentOrder.getServiceMethod(), currency.format(mCurrentOrder.getPrice())
        });
        String s;
        Object obj;
        int i;
        for (Iterator iterator = mCurrentOrder.getProductLineList().iterator(); iterator.hasNext(); mAppLinkManager.speak(promptmodel.getSpeech(new Object[] {
    Integer.valueOf(i), s, obj
})))
        {
            obj = (LabsProductLine)iterator.next();
            LogUtil.v("SyncInteraction", "readOrderDetails: %s", new Object[] {
                obj
            });
            i = ((LabsProductLine) (obj)).getQuantity();
            s = sanitizeProductInformation(((LabsProductLine) (obj)).getFormattedNameFordSync());
            obj = sanitizeProductInformation(peelOptions(((LabsProductLine) (obj))));
        }

        mAppLinkManager.show("");
        mAnalyticsUtil.postFordSyncAbstractOrderDetails();
    }

    private void readOrderSummary()
    {
        LogUtil.v("SyncInteraction", "readOrderSummary", new Object[0]);
        String s = currency.format(mCurrentOrder.getPrice());
        Object obj;
        Object obj1;
        int i;
        if (mCurrentOrder.isCarryout())
        {
            obj = mCurrentOrder.getStoreAddress();
        } else
        {
            obj = mCurrentOrder.getAddress();
        }
        obj = String.format("%1$s, %2$s", new Object[] {
            StreetAbbreviationSanitizer.sanitize(((LabsAddress) (obj)).getStreet()), ((LabsAddress) (obj)).getCity()
        });
        obj1 = mCurrentOrder.getProductLineList().iterator();
        for (i = 0; ((Iterator) (obj1)).hasNext(); i = ((LabsProductLine)((Iterator) (obj1)).next()).getQuantity() + i) { }
        obj1 = app.getResources().getQuantityString(0x7f100000, i, new Object[] {
            Integer.valueOf(i)
        });
        String s1 = LabsOrder.getPaymentTypeFordSync(mCurrentOrder).name();
        PromptModel promptmodel = prompts.getPrompter("order_summary").getPrompt(mCurrentOrder.getServiceMethod().toLowerCase());
        mAppLinkManager.prompt(promptmodel, new Object[] {
            obj, obj1, s, s1
        });
        mAnalyticsUtil.postFordSyncAbstractOrderSummary();
    }

    protected Context getContext()
    {
        return mContext;
    }

    protected void no()
    {
        if (mCurrentOrder != null)
        {
            mAnalyticsUtil.postFordSyncAbstractOrderPromptNo();
            super.no();
            Upsell_.getInstance_(app).setOrder(mCurrentOrder).start();
        }
    }

    public void onAfterInject()
    {
        mProfileManager = (UserProfileManager)mFordSyncSession.getManager("user_manager");
        mMenuManager = (MenuManager)mFordSyncSession.getManager("menu_manager");
    }

    public void setOrder(LabsOrder labsorder)
    {
        ArrayList arraylist = new ArrayList(labsorder.getPaymentList());
        mCurrentOrder = mOrderUtil.fromJson(mOrderUtil.toJson(labsorder));
        String s = mCurrentOrder.getEmail();
        String s1 = mProfileManager.getCurrentUser().getEmail();
        if (!StringHelper.equalsIgnoreCase(s, s1))
        {
            LogUtil.v("SyncInteraction", "Overriding order email %s with user email %s", new Object[] {
                s, s1
            });
            mCurrentOrder.setEmail(s1);
        }
        mCurrentOrder.passOrderHistoryOptions(labsorder);
        mCurrentOrder.setOriginalOrderId(labsorder.getId());
        mCurrentOrder.setPaymentList(arraylist);
        arraylist = new ArrayList();
        for (labsorder = labsorder.getProductLineList().iterator(); labsorder.hasNext(); arraylist.add(new LabsProductLine((LabsProductLine)labsorder.next()))) { }
        mCurrentOrder.setProductLineList(arraylist);
        mCurrentOrder.setSourceOrganizationURI("fordsync-android.dominos.com");
    }

    public void start()
    {
        LogUtil.v("SyncInteraction", "%s:start: %s", new Object[] {
            getClass().getSimpleName(), mOrderUtil.toJson(mCurrentOrder)
        });
        mAppLinkManager.updateLayout("TEXT_WITH_GRAPHIC");
        mAppLinkManager.show(genericPrompts.getPrompter("please_wait"), new Object[0]);
        Object obj = evaluateAndUpdateOrder(mCurrentOrder);
        if (obj == null)
        {
            mAppLinkManager.show(genericPrompts.getPrompter("price_order"), new Object[0]);
            obj = restApi.priceOrder(mCurrentOrder);
            if (obj != null)
            {
                mCurrentOrder = ((LabsOrder) (obj));
                readOrderSummary();
                mAnalyticsUtil.postFordSyncAbstractOrderPrompt();
                super.start();
                return;
            } else
            {
                LogUtil.e("SyncInteraction", "priceOrder failed", new Object[0]);
                ErrorHandler_.getInstance_(app).reason("store_or_order_errors").start();
                return;
            }
        } else
        {
            ((ErrorHandler) (obj)).start();
            LogUtil.e("SyncInteraction", "StoreMenuAndProfile failed", new Object[0]);
            return;
        }
    }

    protected void yes()
    {
        if (mCurrentOrder == null)
        {
            CallStore_.getInstance_(app).start();
            return;
        } else
        {
            mAnalyticsUtil.postFordSyncAbstractOrderPromptYes();
            super.yes();
            readOrderDetails();
            Upsell_.getInstance_(app).setOrder(mCurrentOrder).start();
            return;
        }
    }

    private class _cls1
        implements t
    {

        final AbstractOrder this$0;

        public volatile Object apply(Object obj)
        {
            return apply((LabsTopping)obj);
        }

        public String apply(LabsTopping labstopping)
        {
            return labstopping.getPartWithQuantity();
        }

        _cls1()
        {
            this$0 = AbstractOrder.this;
            super();
        }
    }

}

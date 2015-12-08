// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import android.util.Pair;
import com.dominos.App;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.locator.LocatorResult;
import com.dominos.android.sdk.common.dom.locator.LocatorStore;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.core.models.FoodMenu;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsPayment;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.models.parse.ModelsParse;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.dominos.android.sdk.data.http.power.PowerRestInterface;
import com.dominos.fordsync.FordSyncSession;
import com.google.a.b.ar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.c.d.d;

// Referenced classes of package com.dominos.fordsync.service:
//            AppLinkManager

public class SyncPowerAPI
{

    private static final String LOG_TAG = "SyncPowerAPI";
    protected App app;
    AppLinkManager mAppLinkManager;
    FordSyncSession mFordSyncSession;
    private MenuManager mMenuManager;
    OrderUtil mOrderUtil;
    protected PowerRestClient powerService;
    UserAuthorization userAuth;

    public SyncPowerAPI()
    {
    }

    private boolean isCouponError(LabsOrder labsorder)
    {
        for (labsorder = labsorder.getCouponLineList().iterator(); labsorder.hasNext();)
        {
            if (((LabsCouponLine)labsorder.next()).hasError())
            {
                return true;
            }
        }

        return false;
    }

    private boolean isPricingFailure(LabsOrder labsorder)
    {
        for (labsorder = labsorder.getProductLineList().iterator(); labsorder.hasNext();)
        {
            if (((LabsProductLine)labsorder.next()).getStatus() == -1)
            {
                return true;
            }
        }

        return false;
    }

    public StoreProfile getStoreProfile(String s)
    {
        try
        {
            s = StoreProfile.from(powerService.getRestInterface().storeProfile(StringHelper.defaultIfEmpty(s, "")));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtil.e("SyncPowerAPI", "Unable to fetch store profile", s, new Object[0]);
            return null;
        }
        return s;
    }

    public LocatorStore locateNearestStore()
    {
        Pair pair = mAppLinkManager.getStreetAndZipCode();
        if (pair != null)
        {
            return locateStore((String)pair.first, (String)pair.second);
        } else
        {
            return null;
        }
    }

    public LocatorStore locateStore(String s, String s1)
    {
        LogUtil.v("locateStore", "%s, %s", new Object[] {
            s, s1
        });
        s = LocatorResult.from(powerService.getRestInterface().storeLocator(StringHelper.defaultIfEmpty(s, ""), StringHelper.defaultIfEmpty(s1, ""))).getStores();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (s.isEmpty())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        s = (LocatorStore)s.get(0);
        return s;
        s;
        LogUtil.e("SyncPowerAPI", "Unable to locate stores", s, new Object[0]);
        return null;
    }

    protected void onAfterInject()
    {
        mMenuManager = (MenuManager)mFordSyncSession.getManager("menu_manager");
    }

    public LabsOrder priceOrder(LabsOrder labsorder)
    {
        ArrayList arraylist;
        arraylist = new ArrayList(labsorder.getPaymentList());
        labsorder.clearPayments();
        Object obj;
        obj = mOrderUtil.toJson(labsorder);
        obj = powerService.getRestInterface().priceOrder(String.format("{\"Order\":%s}", new Object[] {
            obj
        }));
        LogUtil.v("SyncPowerAPI", "priceOrder: response => %s", new Object[] {
            obj
        });
        obj = mOrderUtil.fromJson(((String) (obj)));
        mMenuManager.updateOrderFromMenu(((LabsOrder) (obj)));
        ((LabsOrder) (obj)).passOrderHistoryOptions(labsorder);
        ((LabsOrder) (obj)).setPaymentList(arraylist);
        if (!d.isEmpty(arraylist))
        {
            ((LabsPayment)arraylist.get(0)).setAmount(((LabsOrder) (obj)).getPrice());
        }
        if (!isPricingFailure(((LabsOrder) (obj))) && !isCouponError(((LabsOrder) (obj))))
        {
            return ((LabsOrder) (obj));
        }
        try
        {
            LogUtil.d("SyncPowerAPI", "price-order failed: [pricingFailure=%s, couponError=%s]", new Object[] {
                Boolean.valueOf(isPricingFailure(((LabsOrder) (obj)))), Boolean.valueOf(isCouponError(((LabsOrder) (obj))))
            });
        }
        // Misplaced declaration of an exception variable
        catch (LabsOrder labsorder)
        {
            LogUtil.e("SyncPowerAPI", "Unable to price order", labsorder, new Object[0]);
        }
        return null;
    }

    public FoodMenu updateMenu(String s)
    {
        String s1 = powerService.getRestInterface().menu(s, app.getLangSetting());
        LogUtil.v("SyncPowerAPI", "updateMenu(%s): %s", new Object[] {
            s, s1
        });
        s = ModelsParse.fromFoodMenu(s1);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        mMenuManager.setMenu(s);
        return s;
        s;
        LogUtil.e("SyncPowerAPI", "Unable to get store menu", s, new Object[0]);
        return null;
    }
}

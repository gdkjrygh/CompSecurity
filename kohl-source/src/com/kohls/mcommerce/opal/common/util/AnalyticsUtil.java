// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.common.util;

import android.text.TextUtils;
import com.analytics.AnalyticsMain;
import com.analytics.helper.ScreenNameQueue;
import com.analytics.utils.enums.CartType;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.helper.db.custom.DBShoppingBagHelper;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import java.util.HashMap;

// Referenced classes of package com.kohls.mcommerce.opal.common.util:
//            ConfigurationUtils

public class AnalyticsUtil
{

    public AnalyticsUtil()
    {
    }

    public static AnalyticsMain initializeAnalytics()
    {
        return new AnalyticsMain(KohlsPhoneApplication.getContext(), true);
    }

    public static boolean isOmnitureEnabled()
    {
        if (KohlsPhoneApplication.getInstance().getConfigurationUtils() != null && KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig() != null && KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().isOmnitureEnabled() != null)
        {
            if (!KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().isOmnitureEnabled().equals("true"));
        }
        return true;
    }

    private static void sendKohlsAnalytics(HashMap hashmap)
    {
        AnalyticsMain analyticsmain = KohlsPhoneApplication.getInstance().getAnalytics();
        if (KohlsPhoneApplication.getInstance().isEnableAnalyticsCalls() && hashmap != null)
        {
            if (hashmap.get("trackAction") != null && ScreenNameQueue.getLastScreenFromQueue() != null)
            {
                hashmap.put("page.name", hashmap.get("trackAction"));
            }
            if (hashmap.get("page.name") != null)
            {
                ScreenNameQueue.addScreenToQueue((String)hashmap.get("page.name"));
            }
            if (ScreenNameQueue.getSeconLastScreenFromQueue() != null)
            {
                hashmap.put("page.previous", ScreenNameQueue.getSeconLastScreenFromQueue());
            }
            CartType carttype = CartType.NO_CART;
            boolean flag = false;
            if ((new DBShoppingBagHelper()).getItemsCount() > 0)
            {
                flag = true;
                carttype = CartType.GUEST;
            }
            if (KohlsPhoneApplication.getInstance().getAuthenticationUtils() != null && KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn())
            {
                if (flag)
                {
                    carttype = CartType.REGISTERED;
                }
                hashmap.put("user.customerId", KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserID());
                if (!TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref()))
                {
                    hashmap.put("user.loyaltyId", KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref());
                    hashmap.put("user.loggedIn", "kohls logged in|loyalty logged in");
                } else
                {
                    hashmap.put("user.loggedIn", "kohls logged in|loyalty not logged in");
                    hashmap.put("user.loyaltyId", "no loyalty id");
                }
            } else
            {
                hashmap.put("user.loggedIn", "kohls not logged in|loyalty not logged in");
                hashmap.put("user.loyaltyId", "no loyalty id");
                hashmap.put("user.customerId", "no customer id");
            }
            hashmap.put("user.cartType", carttype.toString());
            (new Thread(new _cls1(analyticsmain, hashmap))).run();
        }
    }

    public static void sendTrackAction(String s, HashMap hashmap)
    {
        hashmap.put("trackAction", s);
        sendKohlsAnalytics(hashmap);
    }

    public static void sendTrackState(String s, HashMap hashmap)
    {
        hashmap.put("trackState", s);
        sendKohlsAnalytics(hashmap);
    }

    public static HashMap setScanTypeAndCode(HashMap hashmap)
    {
        String s1;
label0:
        {
            String s = KohlsPhoneApplication.getInstance().getKohlsPref().getString("scanType", null);
            s1 = KohlsPhoneApplication.getInstance().getKohlsPref().getString("scanCode", null);
            if (s1 != null && s != null)
            {
                if (!KohlsPhoneApplication.getInstance().getKohlsPref().getString("scanType", "BARCODE").equalsIgnoreCase("BARCODE"))
                {
                    break label0;
                }
                hashmap.put("scanner.barcode", s1);
            }
            return hashmap;
        }
        hashmap.put("scanner.qrcode", s1);
        return hashmap;
    }

    /* member class not found */
    class _cls1 {}

}

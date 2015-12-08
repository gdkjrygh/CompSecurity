// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.HashMap;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.util:
//            NetworkFailureActivity

public class Appconfig
{

    public static final String ACCOUNT_TYPE = "accountType";
    public static String ACTIVITIES_TAG = "activities";
    public static final String ADJUST_POINTS = "points";
    public static String CHANNEL = "channel=D";
    public static final String CHARITIES_TAG = "charities";
    public static String CHARITY_GET_BY_ID = "loyalty/v1/";
    public static final String CURRENT_ZIPCODE = "zipcodeValue";
    public static final int DEFAULT_CARD_TO_DISPLAY = 0;
    public static final String DELETED_KOHLSCASH_CACHE = "deleted";
    public static String DEVICE_ID = "deviceId";
    public static final String ELIGIBLE_ZIPCODE = "eligiblezipcode";
    public static final String EVENT_TYPE = "events";
    public static final String FAQ_LINK = "faq";
    public static final String GET_ALL_CHARITY = "charities/";
    public static final String GET_CHARITY_INFO = "getCharityInfo/";
    public static String GET_LOYALTY_ZIPCODE_LOOKUP = "loyalty/v1/locations";
    public static final int GIFT_CARD_SIZE = 15;
    public static final int INDICATOR_END = 2;
    public static final int INDICATOR_MIDDLE = 1;
    public static final int INDICATOR_START = 0;
    public static final String LOOKUP_TAG = "lookup";
    public static boolean LOYALTY_RESPONSE_FROM_CACHE = false;
    public static final String NO = "no";
    public static final String OFFSET = "offset";
    public static final String PERIOD = "period";
    public static String POINTS_ADJUSTMENT = "loyalty/v2/points";
    public static String PREFERENCE_ID = "kohlswalletpref";
    public static final String PROGRAM_DETAIL_LINK = "programdetail";
    public static final int REMINDER_ONE_DAY = 1;
    public static final String REMINDER_ONE_DAY_API_VALUE = "1D";
    public static final int REMINDER_ONE_WEEK = 7;
    public static final String REMINDER_ONE_WEEK_API_VALUE = "1W";
    public static final int REMINDER_THREE_DAYS = 3;
    public static final String REMINDER_THREE_DAYS_API_VALUE = "3D";
    public static String REWARD_GET_BY_ID = "loyalty/v1/profiles/";
    public static String REWARD_GET_BY_ID_V2 = "loyalty/v2/profiles/";
    public static String REWARD_REFER_FRIEND = "loyalty/v1/referFriends";
    public static final String TERMS_CONDITION_LINK = "termsnconditions";
    public static final String TRANSACTIONS_ID = "transactions";
    public static final String TYPE = "type";
    public static String TYPECODE = "typeCode";
    public static final String VALID_KEY = "validkey";
    public static final String WALLET_BASE_URL = "https://kwallet.skavaone.com";
    public static final String WALLET_CACHE = "rpwallet";
    public static String WALLET_CREATE_ID = "wallet/v1";
    public static String WALLET_DELETE = "wallet/v1/";
    public static String WALLET_GET_BY_BARCODE = "wallet/v1/items/lookup/";
    public static String WALLET_GET_BY_EMAIL = "wallet/v1/email/";
    public static String WALLET_GET_BY_GIFTCARD = "wallet/v1/items/lookup/giftcard";
    public static String WALLET_GET_BY_ID = "wallet/v1/id/";
    public static String WALLET_GET_BY_TYPE = "wallet/v2_2/items";
    public static String WALLET_HELP_PAGE_FAIL_SAFE = " https://kohls--ms.custhelp.com/app/answers/detail/a_id/50";
    public static String WALLET_ID = "walletId";
    public static final String WALLET_INFO_BUNDLE = "info_bundle";
    public static final String WALLET_INFO_URL = "help_bundle";
    public static String WALLET_KOHLS_CASH_CACHE = "rpcash";
    public static String WALLET_LOYALTY_REWARD_CACHE = "rpreward";
    public static String WALLET_NOTIFICATION = "wallet/v1/";
    public static String WALLET_OFFERS_CACHE = "rpoffer";
    public static final String YES = "yes";
    public static String discalimer = "KOHL'S CASH COUPON NOT VALID UNTIL ACTIVATED AT REGISTER.  REDEEMABLE IN STORE AND AT KOHLS.COM.  Kohl's Cash?????? is not legal tender. No cash back. Customer will receive a $10 Kohl's Cash?????? Coupon for the first $50 in purchases. An additional $10 in value will be added to the coupon for each additional $50 spent in that single transaction. Kohl's Cash?????? Coupon is earned on the amount of customer purchases after all applicable discounts are applied and before tax is imposed. Eligible customer purchases include sale-, regular- and clearance-priced merchandise, but exclude the purchase of Gift Cards. Offer can be redeemed with any other offer, but cannot be redeemed for cash. Kohl's Cash?????? will be applied prior to percent-off total purchase discounts. Kohl's Cash?????? Coupon may not be redeemed (1) on purchases of Kohl's Cares?????? cause merchandise or other charitable items; (2) to reduce customer's Kohl's Charge or any third party charge account balance; (3) as price adjustments on prior purchases; or (4) to purchase Gift Cards. If merchandise purchased earning a Kohl's Cash?????? Coupon is subsequently returned or price adjusted, the value of the Kohl's Cash?????? Coupon previously earned and/or the amount of the merchandise refund may be reduced to reflect any unearned value. Return value of merchandise purchased with a Kohl's Cash?????? Coupon may also be subject to adjustment. Offer is nontransferable";
    public static boolean isSignInShown = false;
    public static HashMap lastVisited = new HashMap();
    public static HashMap map = new HashMap();

    public Appconfig()
    {
    }

    public static String generatePinWithBarcodeNumber(String s)
    {
        if (s.length() > 14)
        {
            return String.format("%d", new Object[] {
                Integer.valueOf(9999 - (1000 - Integer.parseInt(s.substring(11).substring(0, 3))) * 7)
            });
        } else
        {
            return "";
        }
    }

    public static boolean isNetworkAvailable(Context context)
    {
        return isNetworkAvailable(context, false);
    }

    public static boolean isNetworkAvailable(Context context, boolean flag)
    {
        NetworkInfo networkinfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo != null && networkinfo.isConnected()) goto _L2; else goto _L1
_L1:
        if (flag) goto _L4; else goto _L3
_L3:
        context.startActivity((new Intent(context, com/kohls/mcommerce/opal/wallet/util/NetworkFailureActivity)).setFlags(0x10020000));
_L5:
        isSignInShown = true;
        return false;
_L4:
        if (context instanceof Activity)
        {
            ((Activity)context).runOnUiThread(new _cls1());
        }
        if (true) goto _L5; else goto _L2
_L2:
        isSignInShown = false;
        return true;
    }


    /* member class not found */
    class _cls1 {}

}

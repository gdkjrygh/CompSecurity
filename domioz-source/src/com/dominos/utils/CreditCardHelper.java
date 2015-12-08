// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.dominos.utils:
//            AlertType

public class CreditCardHelper
{

    private static final String GW_CARD = "GOOGLE WALLET";

    public CreditCardHelper()
    {
    }

    public static int determineCardImage(String s)
    {
        while ("AMEX".equalsIgnoreCase(s) || "AMERICAN EXPRESS".equalsIgnoreCase(s)) 
        {
            return 0x7f02003d;
        }
        if (s.equalsIgnoreCase("DINERS"))
        {
            return 0x7f0200d8;
        }
        if (s.equalsIgnoreCase("DINER'S CLUB"))
        {
            return 0x7f0200d8;
        }
        if (s.equalsIgnoreCase("DISCOVER"))
        {
            return 0x7f0200d9;
        }
        if (s.equalsIgnoreCase("DISCOVER CARD"))
        {
            return 0x7f0200d9;
        }
        if (s.equalsIgnoreCase("JCB"))
        {
            return 0x7f02013d;
        }
        if (s.equalsIgnoreCase("MASTERCARD"))
        {
            return 0x7f020149;
        }
        if (s.equalsIgnoreCase("VISA"))
        {
            return 0x7f0201ab;
        }
        if (s.equalsIgnoreCase("ENROUTE"))
        {
            return 0x7f0200e1;
        }
        return !s.equalsIgnoreCase("GOOGLE WALLET") ? 0 : 0x7f0200ef;
    }

    public static AlertType matchAlertTypes(com.dominos.android.sdk.core.user.UserProfileManager.CreditCardErrorType creditcarderrortype)
    {
        switch (_cls1..SwitchMap.com.dominos.android.sdk.core.user.UserProfileManager.CreditCardErrorType[creditcarderrortype.ordinal()])
        {
        default:
            return AlertType.GENERAL_CREDIT_CARD_ERROR_DIALOG;

        case 1: // '\001'
            return AlertType.DUPLICATE_NICKNAME_DIALOG;

        case 2: // '\002'
            return AlertType.GET_CARD_LIST_ERROR_DIALOG;

        case 3: // '\003'
            return AlertType.CARD_ON_FILE_LIMIT_EXCEEDED_DIALOG;
        }
    }

    public static AlertType parseJsonForErrorCodes(String s)
    {
        try
        {
            s = (new JSONObject(s)).getJSONArray("error").getJSONObject(0);
            if (s.getString("code").equals("CardOnFileLimitExceeded"))
            {
                return AlertType.CARD_ON_FILE_LIMIT_EXCEEDED_DIALOG;
            }
            if (s.getString("code").equals("InvalidRequest") && s.getString("description").equals("nickname already exists"))
            {
                return AlertType.DUPLICATE_NICKNAME_DIALOG;
            }
            s = AlertType.GENERAL_CREDIT_CARD_ERROR_DIALOG;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return AlertType.GENERAL_CREDIT_CARD_ERROR_DIALOG;
        }
        return s;
    }

    private class _cls1
    {

        static final int $SwitchMap$com$dominos$android$sdk$core$user$UserProfileManager$CreditCardErrorType[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$core$user$UserProfileManager$CreditCardErrorType = new int[com.dominos.android.sdk.core.user.UserProfileManager.CreditCardErrorType.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$user$UserProfileManager$CreditCardErrorType[com.dominos.android.sdk.core.user.UserProfileManager.CreditCardErrorType.DUPLICATE_NICKNAME.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$user$UserProfileManager$CreditCardErrorType[com.dominos.android.sdk.core.user.UserProfileManager.CreditCardErrorType.GET_CARD_LIST_ERROR.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$user$UserProfileManager$CreditCardErrorType[com.dominos.android.sdk.core.user.UserProfileManager.CreditCardErrorType.CARD_ON_FILE_LIMIT_EXCEEDED.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}

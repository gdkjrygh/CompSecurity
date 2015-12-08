// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;


public interface SignInConstants
{
    public static final class AccountType extends Enum
    {

        private static final AccountType $VALUES[];
        public static final AccountType MSA;
        public static final AccountType SKYPE;
        private final int resourceId;

        public static AccountType valueOf(String s)
        {
            return (AccountType)Enum.valueOf(com/skype/android/app/signin/SignInConstants$AccountType, s);
        }

        public static AccountType[] values()
        {
            return (AccountType[])$VALUES.clone();
        }

        public final int getAccountDescriptionResourceId()
        {
            return resourceId;
        }

        static 
        {
            SKYPE = new AccountType("SKYPE", 0, 0x7f08045d);
            MSA = new AccountType("MSA", 1, 0x7f08045a);
            $VALUES = (new AccountType[] {
                SKYPE, MSA
            });
        }

        private AccountType(String s, int i, int j)
        {
            super(s, i);
            resourceId = j;
        }
    }

    public static final class FlowType extends Enum
    {

        private static final FlowType $VALUES[];
        public static final FlowType SIMPLIFIED;
        public static final FlowType UNIFIED;

        public static FlowType valueOf(String s)
        {
            return (FlowType)Enum.valueOf(com/skype/android/app/signin/SignInConstants$FlowType, s);
        }

        public static FlowType[] values()
        {
            return (FlowType[])$VALUES.clone();
        }

        static 
        {
            SIMPLIFIED = new FlowType("SIMPLIFIED", 0);
            UNIFIED = new FlowType("UNIFIED", 1);
            $VALUES = (new FlowType[] {
                SIMPLIFIED, UNIFIED
            });
        }

        private FlowType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class ScreenName extends Enum
    {

        private static final ScreenName $VALUES[];
        public static final ScreenName DISAMBIGUATION_SCREEN;
        public static final ScreenName MSA_SDK_SIGN_IN_SCREEN;
        public static final ScreenName MSA_SIGN_IN_SCREEN;
        public static final ScreenName SKYPE_SIGN_IN_SCREEN;
        public static final ScreenName UNIFIED_ACCOUNT_PICKER_SCREEN;

        public static ScreenName valueOf(String s)
        {
            return (ScreenName)Enum.valueOf(com/skype/android/app/signin/SignInConstants$ScreenName, s);
        }

        public static ScreenName[] values()
        {
            return (ScreenName[])$VALUES.clone();
        }

        static 
        {
            DISAMBIGUATION_SCREEN = new ScreenName("DISAMBIGUATION_SCREEN", 0);
            SKYPE_SIGN_IN_SCREEN = new ScreenName("SKYPE_SIGN_IN_SCREEN", 1);
            MSA_SIGN_IN_SCREEN = new ScreenName("MSA_SIGN_IN_SCREEN", 2);
            MSA_SDK_SIGN_IN_SCREEN = new ScreenName("MSA_SDK_SIGN_IN_SCREEN", 3);
            UNIFIED_ACCOUNT_PICKER_SCREEN = new ScreenName("UNIFIED_ACCOUNT_PICKER_SCREEN", 4);
            $VALUES = (new ScreenName[] {
                DISAMBIGUATION_SCREEN, SKYPE_SIGN_IN_SCREEN, MSA_SIGN_IN_SCREEN, MSA_SDK_SIGN_IN_SCREEN, UNIFIED_ACCOUNT_PICKER_SCREEN
            });
        }

        private ScreenName(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class UnifiedLoginId extends Enum
    {

        private static final UnifiedLoginId $VALUES[];
        public static final UnifiedLoginId MSA_EMAIL;
        public static final UnifiedLoginId NON_MSA_EMAIL;
        public static final UnifiedLoginId PHONE_NUMBER;
        public static final UnifiedLoginId SKYPE_ID;

        public static UnifiedLoginId valueOf(String s)
        {
            return (UnifiedLoginId)Enum.valueOf(com/skype/android/app/signin/SignInConstants$UnifiedLoginId, s);
        }

        public static UnifiedLoginId[] values()
        {
            return (UnifiedLoginId[])$VALUES.clone();
        }

        static 
        {
            PHONE_NUMBER = new UnifiedLoginId("PHONE_NUMBER", 0);
            SKYPE_ID = new UnifiedLoginId("SKYPE_ID", 1);
            MSA_EMAIL = new UnifiedLoginId("MSA_EMAIL", 2);
            NON_MSA_EMAIL = new UnifiedLoginId("NON_MSA_EMAIL", 3);
            $VALUES = (new UnifiedLoginId[] {
                PHONE_NUMBER, SKYPE_ID, MSA_EMAIL, NON_MSA_EMAIL
            });
        }

        private UnifiedLoginId(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String ACCOUNT_TYPE_UNKNOWN = "unknown account";
    public static final String ACTION_ACCOUNT_STATUS = "com.skype.ACTION_ACCOUNT_STATUS";
    public static final String EXTRA_ACCESS_TOKEN = "accessToken";
    public static final String EXTRA_LOGIN_ACCESS_TOKEN = "loginAccessToken";
    public static final String EXTRA_MICROSOFT_ACCOUNTS = "microsoftAccounts";
    public static final String EXTRA_MSA_SIGN_IN = "msasignin";
    public static final String EXTRA_MSA_SIGN_UP = "msasignup";
    public static final String EXTRA_REFRESH_TOKEN = "refreshToken";
    public static final String EXTRA_SHOW_MARKETING_OPTION = "marketing";
    public static final String EXTRA_SUGGESTED_ACCOUNTS = "suggestedAccounts";
    public static final String EXTRA_USERNAME = "username";
    public static final int MS_PARTNER_ID = com.skype.SkyLib.PARTNER_ID.PARTNER_MICROSOFT.toInt();
    public static final String PERMISSION_ACCOUNT = "com.skype.permission.ACCOUNT";
    public static final String UNIFIED_NEXT_BUTTON_TYPE = "next";

}

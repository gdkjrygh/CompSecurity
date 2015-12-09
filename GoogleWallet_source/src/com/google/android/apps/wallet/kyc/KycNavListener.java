// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;


public interface KycNavListener
{
    public static final class NavState extends Enum
    {

        private static final NavState $VALUES[];
        public static final NavState ENTER_ADDRESS;
        public static final NavState ENTER_OOW;
        public static final NavState ENTER_PERSONAL_INFO;
        public static final NavState ENTER_PERSONAL_INFO_RETRY;
        public static final NavState FAILED;
        public static final NavState OOW_INTRO;
        public static final NavState PASSED;
        public static final NavState REFERRED;
        public static final NavState UNINITIALIZED;

        public static NavState valueOf(String s)
        {
            return (NavState)Enum.valueOf(com/google/android/apps/wallet/kyc/KycNavListener$NavState, s);
        }

        public static NavState[] values()
        {
            return (NavState[])$VALUES.clone();
        }

        static 
        {
            UNINITIALIZED = new NavState("UNINITIALIZED", 0);
            ENTER_PERSONAL_INFO = new NavState("ENTER_PERSONAL_INFO", 1);
            ENTER_ADDRESS = new NavState("ENTER_ADDRESS", 2);
            ENTER_PERSONAL_INFO_RETRY = new NavState("ENTER_PERSONAL_INFO_RETRY", 3);
            OOW_INTRO = new NavState("OOW_INTRO", 4);
            ENTER_OOW = new NavState("ENTER_OOW", 5);
            REFERRED = new NavState("REFERRED", 6);
            FAILED = new NavState("FAILED", 7);
            PASSED = new NavState("PASSED", 8);
            $VALUES = (new NavState[] {
                UNINITIALIZED, ENTER_PERSONAL_INFO, ENTER_ADDRESS, ENTER_PERSONAL_INFO_RETRY, OOW_INTRO, ENTER_OOW, REFERRED, FAILED, PASSED
            });
        }

        private NavState(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void onRequestNav(NavState navstate);
}

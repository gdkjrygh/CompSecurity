// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;

import com.snapchat.android.analytics.framework.EasyMetric;

public final class PhoneVerificationAnalytics
{
    public static final class VerificationType extends Enum
    {

        private static final VerificationType $VALUES[];
        public static final VerificationType REGISTERED_NUMBER;
        public static final VerificationType VERIFIED_NEW_NUMBER;
        public static final VerificationType VERIFIED_NUMBER;

        public static VerificationType valueOf(String s)
        {
            return (VerificationType)Enum.valueOf(com/snapchat/android/analytics/PhoneVerificationAnalytics$VerificationType, s);
        }

        public static VerificationType[] values()
        {
            return (VerificationType[])$VALUES.clone();
        }

        static 
        {
            REGISTERED_NUMBER = new VerificationType("REGISTERED_NUMBER", 0);
            VERIFIED_NUMBER = new VerificationType("VERIFIED_NUMBER", 1);
            VERIFIED_NEW_NUMBER = new VerificationType("VERIFIED_NEW_NUMBER", 2);
            $VALUES = (new VerificationType[] {
                REGISTERED_NUMBER, VERIFIED_NUMBER, VERIFIED_NEW_NUMBER
            });
        }

        private VerificationType(String s, int i)
        {
            super(s, i);
        }
    }


    public static void a(boolean flag, boolean flag1)
    {
        boolean flag2 = true;
        EasyMetric easymetric = new EasyMetric("FORCE_PHONE_VERIFICATION_ALERT_SHOWN");
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        easymetric = easymetric.a("selected_verify_number", Integer.valueOf(i));
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        easymetric.a("already_has_number", Integer.valueOf(i)).e();
    }
}

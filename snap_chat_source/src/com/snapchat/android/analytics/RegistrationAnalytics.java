// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;

import Bt;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import iY;
import jI;
import jJ;
import je;
import jm;
import ju;
import jy;
import km;

public final class RegistrationAnalytics
{
    public static final class PhoneVerificationMethod extends Enum
    {

        private static final PhoneVerificationMethod $VALUES[];
        public static final PhoneVerificationMethod CALL;
        public static final PhoneVerificationMethod CANCEL;
        public static final PhoneVerificationMethod TEXT;

        public static PhoneVerificationMethod valueOf(String s)
        {
            return (PhoneVerificationMethod)Enum.valueOf(com/snapchat/android/analytics/RegistrationAnalytics$PhoneVerificationMethod, s);
        }

        public static PhoneVerificationMethod[] values()
        {
            return (PhoneVerificationMethod[])$VALUES.clone();
        }

        static 
        {
            TEXT = new PhoneVerificationMethod("TEXT", 0);
            CALL = new PhoneVerificationMethod("CALL", 1);
            CANCEL = new PhoneVerificationMethod("CANCEL", 2);
            $VALUES = (new PhoneVerificationMethod[] {
                TEXT, CALL, CANCEL
            });
        }

        private PhoneVerificationMethod(String s, int k)
        {
            super(s, k);
        }
    }


    private static boolean mIsRegisteringOnOptionalSteps = false;
    private static final RegistrationAnalytics sInstance = new RegistrationAnalytics();
    public final BlizzardEventLogger mBlizzardEventLogger;

    public RegistrationAnalytics()
    {
        this(BlizzardEventLogger.a());
    }

    private RegistrationAnalytics(BlizzardEventLogger blizzardeventlogger)
    {
        mBlizzardEventLogger = blizzardeventlogger;
    }

    public static RegistrationAnalytics a()
    {
        return sInstance;
    }

    public static void a(boolean flag)
    {
        mIsRegisteringOnOptionalSteps = flag;
    }

    public static boolean b()
    {
        return mIsRegisteringOnOptionalSteps;
    }

    public static void c()
    {
        if (!Bt.B())
        {
            return;
        } else
        {
            (new EasyMetric("R01_AUTO_FILL_PHONE_NUMBER")).e();
            return;
        }
    }

    public static void d()
    {
        if (!Bt.B())
        {
            return;
        } else
        {
            (new EasyMetric("R01_PHONE_NUMBER_INVALID")).e();
            return;
        }
    }

    public static void e()
    {
        if (!Bt.B())
        {
            return;
        } else
        {
            (new EasyMetric("R01_SEND_VERIFICATION_CODE")).e();
            return;
        }
    }

    public static void f()
    {
        if (!Bt.B())
        {
            return;
        } else
        {
            (new EasyMetric("R01_REGISTER_PHONE_NUMBER_TENTATIVE_SUCCESS")).e();
            return;
        }
    }

    public static void g()
    {
        if (!Bt.B())
        {
            return;
        } else
        {
            (new EasyMetric("R01_VERIFY_INVALID")).e();
            return;
        }
    }

    public static void h()
    {
        if (!Bt.B())
        {
            return;
        } else
        {
            (new EasyMetric("R01_CLEAR_PHONE_NUMBER")).e();
            return;
        }
    }

    public static void i()
    {
        if (!Bt.B())
        {
            return;
        } else
        {
            (new EasyMetric("R01_CLEAR_VERIFICATION_CODE")).e();
            return;
        }
    }

    public final void a(PhoneVerificationMethod phoneverificationmethod, int k)
    {
        if (!Bt.B() && !mIsRegisteringOnOptionalSteps)
        {
            return;
        } else
        {
            jy jy1 = new jy();
            jy1.verificationMethod = phoneverificationmethod.toString();
            jy1.attemptCount = Long.valueOf(k);
            mBlizzardEventLogger.a(jy1);
            return;
        }
    }

    public final void a(iY iy, int k)
    {
        ju ju1 = new ju();
        ju1.registrationError = iy;
        ju1.attemptCount = Long.valueOf(k);
        mBlizzardEventLogger.a(ju1);
    }

    public final void a(km km)
    {
        jJ jj = new jJ();
        jj.usernameRegistrationError = km;
        mBlizzardEventLogger.a(jj);
    }

    public final void b(boolean flag)
    {
        jm jm1 = new jm();
        jm1.dialogAction = Boolean.valueOf(flag);
        mBlizzardEventLogger.a(jm1);
    }

    public final void c(boolean flag)
    {
        je je1 = new je();
        je1.dialogAction = Boolean.valueOf(flag);
        mBlizzardEventLogger.a(je1);
    }

    public final void j()
    {
        jI ji = new jI();
        mBlizzardEventLogger.a(ji);
    }


    // Unreferenced inner class com/snapchat/android/analytics/RegistrationAnalytics$1

/* anonymous class */
    public static final class _cls1
    {

        public static final int $SwitchMap$com$snapchat$android$fragments$addfriends$NewUserContactBookFragment$NewUserContactBookPageType[];

        static 
        {
            $SwitchMap$com$snapchat$android$fragments$addfriends$NewUserContactBookFragment$NewUserContactBookPageType = new int[com.snapchat.android.fragments.addfriends.NewUserContactBookFragment.NewUserContactBookPageType.values().length];
            try
            {
                $SwitchMap$com$snapchat$android$fragments$addfriends$NewUserContactBookFragment$NewUserContactBookPageType[com.snapchat.android.fragments.addfriends.NewUserContactBookFragment.NewUserContactBookPageType.SNAPCHATTERS.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$snapchat$android$fragments$addfriends$NewUserContactBookFragment$NewUserContactBookPageType[com.snapchat.android.fragments.addfriends.NewUserContactBookFragment.NewUserContactBookPageType.NON_SNAPCHATTERS.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}

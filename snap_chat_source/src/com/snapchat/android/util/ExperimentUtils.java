// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import Bm;
import LA;
import com.snapchat.android.util.debug.ReleaseManager;

public final class ExperimentUtils
{
    public static final class PhoneVerificationExperiment extends Enum
    {

        private static final PhoneVerificationExperiment $VALUES[];
        public static final PhoneVerificationExperiment NOT_REQUIRED;
        public static final PhoneVerificationExperiment REQUIRED;

        public static PhoneVerificationExperiment valueOf(String s)
        {
            return (PhoneVerificationExperiment)Enum.valueOf(com/snapchat/android/util/ExperimentUtils$PhoneVerificationExperiment, s);
        }

        public static PhoneVerificationExperiment[] values()
        {
            return (PhoneVerificationExperiment[])$VALUES.clone();
        }

        static 
        {
            NOT_REQUIRED = new PhoneVerificationExperiment("NOT_REQUIRED", 0);
            REQUIRED = new PhoneVerificationExperiment("REQUIRED", 1);
            $VALUES = (new PhoneVerificationExperiment[] {
                NOT_REQUIRED, REQUIRED
            });
        }

        private PhoneVerificationExperiment(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String EXPERIMENT_ID_KEY = "experimentId";
    private static final ExperimentUtils INSTANCE = new ExperimentUtils();
    public static final String PHONE_VERIFICATION_EXPERIMENT_STUDY_NAME = "PHONE_VERIFICATION_LATE_PROMPT_V2";
    private static final int SERVER_CHOICE_INDEX = 0;

    protected ExperimentUtils()
    {
    }

    public static ExperimentUtils a()
    {
        return INSTANCE;
    }

    public static void b()
    {
        LA.a();
        int i = LA.o();
        if (ReleaseManager.f() && i != 0)
        {
            return;
        } else
        {
            int j = c();
            Bm.a().b("PHONE_VERIFICATION_LATE_PROMPT_V2", String.valueOf(j));
            return;
        }
    }

    public static int c()
    {
        return Bm.a().a("PHONE_VERIFICATION_LATE_PROMPT_V2", "experimentId", 0);
    }

}

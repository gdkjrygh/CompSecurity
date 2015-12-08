// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;

import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;

// Referenced classes of package com.fitbit.data.bl.exceptions:
//            TrackerBackOffException

public class MobileTrackBackOffException extends TrackerBackOffException
{
    public static final class BackOffType extends Enum
    {

        public static final BackOffType a;
        public static final BackOffType b;
        public static final BackOffType c;
        private static final BackOffType d[];

        public static BackOffType valueOf(String s)
        {
            return (BackOffType)Enum.valueOf(com/fitbit/data/bl/exceptions/MobileTrackBackOffException$BackOffType, s);
        }

        public static BackOffType[] values()
        {
            return (BackOffType[])d.clone();
        }

        static 
        {
            a = new BackOffType("UNKNOWN", 0);
            b = new BackOffType("BACK_OFF_SYNC", 1);
            c = new BackOffType("BACK_OFF_PAIRING", 2);
            d = (new BackOffType[] {
                a, b, c
            });
        }

        private BackOffType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int b = 300;
    private static final long serialVersionUID = 1L;
    private BackOffType backOffType;

    public MobileTrackBackOffException(BackOffType backofftype, String s)
    {
        super(s, d());
        backOffType = backofftype;
    }

    public MobileTrackBackOffException(BackOffType backofftype, String s, int i)
    {
        super(s, i);
        backOffType = backofftype;
    }

    public static int d()
    {
        int i = TrackerSyncPreferencesSavedState.v();
        double d1 = 300;
        double d2 = Math.random();
        return (int)((double)(i * 60) * d2 + d1);
    }

    public void a(BackOffType backofftype)
    {
        backOffType = backofftype;
    }

    public String b()
    {
        return "MobileTrackBackOffException";
    }

    public BackOffType c()
    {
        return backOffType;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MobileTrack backoff error: backOffType = ").append(backOffType).append(", retryInterval = ").append(retryInterval).append(", message = ").append(getMessage()).toString();
    }
}

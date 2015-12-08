// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.internal.q;

// Referenced classes of package com.google.android.gms.drive:
//            Drive

public final class ExecutionOptions
{
    public static final class Builder
    {

        private String Nn;
        private boolean No;
        private int Np;

        public ExecutionOptions build()
        {
            if (Np == 1 && !No)
            {
                throw new IllegalStateException("Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications");
            } else
            {
                return new ExecutionOptions(Nn, No, Np);
            }
        }

        public Builder setConflictStrategy(int i)
        {
            if (!ExecutionOptions.aW(i))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unrecognized value for conflict strategy: ").append(i).toString());
            } else
            {
                Np = i;
                return this;
            }
        }

        public Builder setNotifyOnCompletion(boolean flag)
        {
            No = flag;
            return this;
        }

        public Builder setTrackingTag(String s)
        {
            if (!ExecutionOptions.bh(s))
            {
                throw new IllegalArgumentException(String.format("trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)", new Object[] {
                    Integer.valueOf(0x10000)
                }));
            } else
            {
                Nn = s;
                return this;
            }
        }

        public Builder()
        {
            Np = 0;
        }
    }


    public static final int CONFLICT_STRATEGY_KEEP_REMOTE = 1;
    public static final int CONFLICT_STRATEGY_OVERWRITE_REMOTE = 0;
    public static final int MAX_TRACKING_TAG_STRING_LENGTH = 0x10000;
    private final String Nn;
    private final boolean No;
    private final int Np;

    private ExecutionOptions(String s, boolean flag, int i)
    {
        Nn = s;
        No = flag;
        Np = i;
    }


    public static void a(GoogleApiClient googleapiclient, ExecutionOptions executionoptions)
    {
        googleapiclient = (q)googleapiclient.a(Drive.CU);
        if (executionoptions.hP() && !googleapiclient.ib())
        {
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion");
        } else
        {
            return;
        }
    }

    public static boolean aV(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 1: // '\001'
            return true;
        }
    }

    public static boolean aW(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 0: // '\0'
        case 1: // '\001'
            return true;
        }
    }

    public static boolean bh(String s)
    {
        return s != null && !s.isEmpty() && s.length() <= 0x10000;
    }

    public String hO()
    {
        return Nn;
    }

    public boolean hP()
    {
        return No;
    }

    public int hQ()
    {
        return Np;
    }
}

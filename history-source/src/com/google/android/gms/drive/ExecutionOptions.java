// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.internal.r;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.drive:
//            Drive

public final class ExecutionOptions
{
    public static final class Builder
    {

        private int OA;
        private String Oy;
        private boolean Oz;

        public ExecutionOptions build()
        {
            if (OA == 1 && !Oz)
            {
                throw new IllegalStateException("Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications");
            } else
            {
                return new ExecutionOptions(Oy, Oz, OA);
            }
        }

        public Builder setConflictStrategy(int i)
        {
            if (!ExecutionOptions.bb(i))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unrecognized value for conflict strategy: ").append(i).toString());
            } else
            {
                OA = i;
                return this;
            }
        }

        public Builder setNotifyOnCompletion(boolean flag)
        {
            Oz = flag;
            return this;
        }

        public Builder setTrackingTag(String s)
        {
            if (!ExecutionOptions.bj(s))
            {
                throw new IllegalArgumentException(String.format("trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)", new Object[] {
                    Integer.valueOf(0x10000)
                }));
            } else
            {
                Oy = s;
                return this;
            }
        }

        public Builder()
        {
            OA = 0;
        }
    }


    public static final int CONFLICT_STRATEGY_KEEP_REMOTE = 1;
    public static final int CONFLICT_STRATEGY_OVERWRITE_REMOTE = 0;
    public static final int MAX_TRACKING_TAG_STRING_LENGTH = 0x10000;
    private final int OA;
    private final String Oy;
    private final boolean Oz;

    public ExecutionOptions(String s, boolean flag, int i)
    {
        Oy = s;
        Oz = flag;
        OA = i;
    }

    public static void a(GoogleApiClient googleapiclient, ExecutionOptions executionoptions)
    {
        googleapiclient = (r)googleapiclient.a(Drive.DQ);
        if (executionoptions.iw() && !googleapiclient.iJ())
        {
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion");
        } else
        {
            return;
        }
    }

    public static boolean ba(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 1: // '\001'
            return true;
        }
    }

    public static boolean bb(int i)
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

    public static boolean bj(String s)
    {
        return s != null && !s.isEmpty() && s.length() <= 0x10000;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj != null && obj.getClass() == getClass()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == this) goto _L4; else goto _L3
_L3:
        obj = (ExecutionOptions)obj;
        if (!jv.equal(Oy, ((ExecutionOptions) (obj)).Oy) || OA != ((ExecutionOptions) (obj)).OA)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (Oz == ((ExecutionOptions) (obj)).Oz) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Oy, Integer.valueOf(OA), Boolean.valueOf(Oz)
        });
    }

    public String iv()
    {
        return Oy;
    }

    public boolean iw()
    {
        return Oz;
    }

    public int ix()
    {
        return OA;
    }
}

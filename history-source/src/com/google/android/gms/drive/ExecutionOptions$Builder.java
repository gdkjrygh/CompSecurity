// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;


// Referenced classes of package com.google.android.gms.drive:
//            ExecutionOptions

public static final class OA
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

    public OA setConflictStrategy(int i)
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

    public OA setNotifyOnCompletion(boolean flag)
    {
        Oz = flag;
        return this;
    }

    public Oz setTrackingTag(String s)
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

    public ()
    {
        OA = 0;
    }
}

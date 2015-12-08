// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;


// Referenced classes of package com.google.android.gms.drive:
//            ExecutionOptions

public static final class Np
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
            return new ExecutionOptions(Nn, No, Np, null);
        }
    }

    public Np setConflictStrategy(int i)
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

    public Np setNotifyOnCompletion(boolean flag)
    {
        No = flag;
        return this;
    }

    public No setTrackingTag(String s)
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

    public ()
    {
        Np = 0;
    }
}

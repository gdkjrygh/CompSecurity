// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;


// Referenced classes of package com.google.android.gms.drive:
//            ExecutionOptions

public static final class mConflictStrategy
{

    private int mConflictStrategy;
    public boolean mNotifyOnCompletion;
    private String mTrackingTag;

    public final ExecutionOptions build()
    {
        if (mConflictStrategy == 1 && !mNotifyOnCompletion)
        {
            throw new IllegalStateException("Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications");
        } else
        {
            return new ExecutionOptions(mTrackingTag, mNotifyOnCompletion, mConflictStrategy);
        }
    }

    public final mConflictStrategy setConflictStrategy$4bdbcb8d()
    {
        if (!ExecutionOptions.isValidConflictStrategy(1))
        {
            throw new IllegalArgumentException((new StringBuilder("Unrecognized value for conflict strategy: 1")).toString());
        } else
        {
            mConflictStrategy = 1;
            return this;
        }
    }

    public final mConflictStrategy setTrackingTag(String s)
    {
        if (!ExecutionOptions.isValidTrackingTag(s))
        {
            throw new IllegalArgumentException(String.format("trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)", new Object[] {
                Integer.valueOf(0x10000)
            }));
        } else
        {
            mTrackingTag = s;
            return this;
        }
    }

    public ()
    {
        mConflictStrategy = 0;
    }
}

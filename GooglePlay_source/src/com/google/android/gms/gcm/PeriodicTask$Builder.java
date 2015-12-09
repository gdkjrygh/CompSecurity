// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.gcm:
//            PeriodicTask

public static final class isPersisted extends isPersisted
{

    public long flexInSeconds;
    public long periodInSeconds;

    public final PeriodicTask build()
    {
        checkConditions();
        return new PeriodicTask(this, (byte)0);
    }

    protected final void checkConditions()
    {
        super.ditions();
        if (periodInSeconds == -1L)
        {
            throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
        }
        if (periodInSeconds <= 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("Period set cannot be less or equal to 0: ")).append(periodInSeconds).toString());
        }
        if (flexInSeconds == -1L)
        {
            flexInSeconds = (long)((float)periodInSeconds * 0.1F);
        } else
        if (flexInSeconds > periodInSeconds)
        {
            flexInSeconds = periodInSeconds;
            return;
        }
    }

    public final periodInSeconds setExtras(Bundle bundle)
    {
        extras = bundle;
        return this;
    }

    public final extras setRequiresCharging$24191f8f()
    {
        requiresCharging = true;
        return this;
    }

    public final requiresCharging setService(String s)
    {
        gcmTaskService = s;
        return this;
    }

    public final gcmTaskService setTag(String s)
    {
        tag = s;
        return this;
    }

    public final tag setUpdateCurrent$24191f8f()
    {
        updateCurrent = true;
        return this;
    }

    public ()
    {
        periodInSeconds = -1L;
        flexInSeconds = -1L;
        isPersisted = true;
    }
}

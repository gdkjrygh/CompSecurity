// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.gcm:
//            Task, RetryStrategy

public static abstract class .PRESET_EXPONENTIAL
{

    protected Bundle extras;
    protected String gcmTaskService;
    protected boolean isPersisted;
    protected boolean requiresCharging;
    protected RetryStrategy retryStrategy;
    protected String tag;
    protected boolean updateCurrent;

    protected void checkConditions()
    {
        String s;
        boolean flag;
        if (gcmTaskService != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Must provide an endpoint for this task by calling setService(ComponentName).");
        s = tag;
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Must provide a valid tag.");
        }
        if (100 < s.length())
        {
            throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        }
        Task.validateRetryStrategy(retryStrategy);
        if (isPersisted)
        {
            Task.validateExtras(extras);
        }
    }

    public ()
    {
        retryStrategy = RetryStrategy.PRESET_EXPONENTIAL;
    }
}

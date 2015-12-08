// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.app.Activity;
import com.mopub.common.LifecycleListener;
import com.mopub.common.MoPubLifecycleManager;
import com.mopub.common.logging.MoPubLog;

public abstract class CustomEventRewardedVideo
{

    public CustomEventRewardedVideo()
    {
    }

    protected abstract CustomEventRewardedVideoListener a();

    final void a(Activity activity)
    {
        try
        {
            if (d())
            {
                MoPubLifecycleManager.getInstance(activity).addLifecycleListener(b());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            MoPubLog.e(activity.getMessage());
        }
    }

    protected abstract LifecycleListener b();

    protected abstract String c();

    protected abstract boolean d();

    protected abstract boolean e();
}

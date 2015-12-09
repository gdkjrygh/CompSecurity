// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.bus.events;

import android.app.Activity;

public abstract class ActivityLifecycleEvents
{

    private Activity activity;

    public ActivityLifecycleEvents()
    {
    }

    public ActivityLifecycleEvents(Activity activity1)
    {
        activity = activity1;
    }

    public Activity getActivity()
    {
        return activity;
    }
}

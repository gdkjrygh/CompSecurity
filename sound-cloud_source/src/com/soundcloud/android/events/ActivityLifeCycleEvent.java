// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import android.app.Activity;

public final class ActivityLifeCycleEvent
{

    public static final int ON_CREATE_EVENT = 1;
    public static final int ON_PAUSE_EVENT = 2;
    public static final int ON_RESUME_EVENT = 0;
    private final Class activityClass;
    private final int kind;

    private ActivityLifeCycleEvent(int i, Activity activity)
    {
        activityClass = activity.getClass();
        kind = i;
    }

    public static ActivityLifeCycleEvent forOnCreate(Activity activity)
    {
        return new ActivityLifeCycleEvent(1, activity);
    }

    public static ActivityLifeCycleEvent forOnPause(Activity activity)
    {
        return new ActivityLifeCycleEvent(2, activity);
    }

    public static ActivityLifeCycleEvent forOnResume(Activity activity)
    {
        return new ActivityLifeCycleEvent(0, activity);
    }

    private String lifeCycleMethodName()
    {
        switch (kind)
        {
        default:
            throw new IllegalStateException((new StringBuilder("Attempting to get name of unknown lifecycle method code: ")).append(kind).toString());

        case 1: // '\001'
            return "onCreate";

        case 0: // '\0'
            return "onResume";

        case 2: // '\002'
            return "onPause";
        }
    }

    public final Class getActivityClass()
    {
        return activityClass;
    }

    public final int getKind()
    {
        return kind;
    }

    public final boolean isNotForeground()
    {
        return getKind() != 0;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(activityClass.getSimpleName()).append("#").append(lifeCycleMethodName()).toString();
    }
}

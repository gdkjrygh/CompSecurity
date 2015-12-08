// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.app.Activity;

public interface LifecycleListener
{

    public abstract void onBackPressed(Activity activity);

    public abstract void onCreate(Activity activity);

    public abstract void onDestroy(Activity activity);

    public abstract void onPause(Activity activity);

    public abstract void onRestart(Activity activity);

    public abstract void onResume(Activity activity);

    public abstract void onStart(Activity activity);

    public abstract void onStop(Activity activity);
}

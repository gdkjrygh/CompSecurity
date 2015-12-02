// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ut.mini.core.a;

import android.app.Activity;
import android.os.Bundle;

public interface a
{

    public abstract void onActivityCreated(Activity activity, Bundle bundle);

    public abstract void onActivityDestroyed(Activity activity);

    public abstract void onActivityPaused(Activity activity);

    public abstract void onActivityResumed(Activity activity);

    public abstract void onActivitySaveInstanceState(Activity activity, Bundle bundle);

    public abstract void onSwitchBackground();

    public abstract void onSwitchForeground();
}

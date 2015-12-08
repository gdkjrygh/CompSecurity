// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.lightcycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public interface ActivityLightCycle
{

    public abstract void onCreate(Activity activity, Bundle bundle);

    public abstract void onDestroy(Activity activity);

    public abstract void onNewIntent(Activity activity, Intent intent);

    public abstract boolean onOptionsItemSelected(Activity activity, MenuItem menuitem);

    public abstract void onPause(Activity activity);

    public abstract void onRestoreInstanceState(Activity activity, Bundle bundle);

    public abstract void onResume(Activity activity);

    public abstract void onSaveInstanceState(Activity activity, Bundle bundle);

    public abstract void onStart(Activity activity);

    public abstract void onStop(Activity activity);
}

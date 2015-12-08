// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.lightcycle;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.MenuItem;
import android.view.View;

public interface SupportFragmentLightCycle
{

    public abstract void onAttach(Fragment fragment, Activity activity);

    public abstract void onCreate(Fragment fragment, Bundle bundle);

    public abstract void onDestroy(Fragment fragment);

    public abstract void onDestroyView(Fragment fragment);

    public abstract void onDetach(Fragment fragment);

    public abstract boolean onOptionsItemSelected(Fragment fragment, MenuItem menuitem);

    public abstract void onPause(Fragment fragment);

    public abstract void onRestoreInstanceState(Fragment fragment, Bundle bundle);

    public abstract void onResume(Fragment fragment);

    public abstract void onSaveInstanceState(Fragment fragment, Bundle bundle);

    public abstract void onStart(Fragment fragment);

    public abstract void onStop(Fragment fragment);

    public abstract void onViewCreated(Fragment fragment, View view, Bundle bundle);
}

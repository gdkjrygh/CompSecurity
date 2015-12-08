// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import java.io.File;

// Referenced classes of package com.millennialmedia.android:
//            MMActivity

class MMBaseActivity
{

    MMActivity activity;

    MMBaseActivity()
    {
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return activity.dispatchTouchEventSuper(motionevent);
    }

    public void finish()
    {
        activity.finishSuper();
    }

    public File getCacheDir()
    {
        return activity.getCacheDir();
    }

    public ContentResolver getContentResolver()
    {
        return activity.getContentResolver();
    }

    public Intent getIntent()
    {
        return activity.getIntent();
    }

    public Object getLastNonConfigurationInstance()
    {
        return activity.getLastNonConfigurationInstance();
    }

    public Object getSystemService(String s)
    {
        return activity.getSystemService(s);
    }

    public Window getWindow()
    {
        return activity.getWindow();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        activity.onActivityResultSuper(i, j, intent);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        activity.onConfigurationChangedSuper(configuration);
    }

    protected void onCreate(Bundle bundle)
    {
        activity.onCreateSuper(bundle);
    }

    protected void onDestroy()
    {
        activity.onDestroySuper();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        return activity.onKeyDownSuper(i, keyevent);
    }

    protected void onPause()
    {
        activity.onPauseSuper();
    }

    protected void onRestart()
    {
        activity.onRestartSuper();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        activity.onRestoreInstanceStateSuper(bundle);
    }

    protected void onResume()
    {
        activity.onResumeSuper();
    }

    public Object onRetainNonConfigurationInstance()
    {
        return activity.onRetainNonConfigurationInstanceSuper();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        activity.onSaveInstanceStateSuper(bundle);
    }

    protected void onStart()
    {
        activity.onStartSuper();
    }

    protected void onStop()
    {
        activity.onStopSuper();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        activity.onWindowFocusChangedSuper(flag);
    }

    public Intent registerReceiver(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter)
    {
        return activity.registerReceiver(broadcastreceiver, intentfilter);
    }

    public final boolean requestWindowFeature(int i)
    {
        return activity.requestWindowFeature(i);
    }

    public final void runOnUiThread(Runnable runnable)
    {
        activity.runOnUiThread(runnable);
    }

    public void setContentView(View view)
    {
        activity.setContentView(view);
    }

    public void setRequestedOrientation(int i)
    {
        activity.setRequestedOrientation(i);
    }

    public final void setResult(int i)
    {
        activity.setResult(i);
    }

    public void setTheme(int i)
    {
        activity.setTheme(i);
    }

    public void startActivity(Intent intent)
    {
        activity.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        activity.startActivityForResult(intent, i);
    }

    public void unregisterReceiver(BroadcastReceiver broadcastreceiver)
    {
        activity.unregisterReceiver(broadcastreceiver);
    }
}

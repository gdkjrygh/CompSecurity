// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.api;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.Log;
import java.util.concurrent.ExecutorService;

// Referenced classes of package org.apache.cordova.api:
//            CordovaInterface, CordovaPlugin

public class LegacyContext
    implements CordovaInterface
{

    private static final String LOG_TAG = "Deprecation Notice";
    private CordovaInterface cordova;

    public LegacyContext(CordovaInterface cordovainterface)
    {
        cordova = cordovainterface;
    }

    public boolean bindService(Intent intent, ServiceConnection serviceconnection, int i)
    {
        Log.i("Deprecation Notice", "Replace ctx.bindService() with cordova.getActivity().bindService()");
        return cordova.getActivity().bindService(intent, serviceconnection, i);
    }

    public void cancelLoadUrl()
    {
        Log.i("Deprecation Notice", "Replace ctx.cancelLoadUrl() with cordova.cancelLoadUrl()");
        cordova.cancelLoadUrl();
    }

    public Activity getActivity()
    {
        Log.i("Deprecation Notice", "Replace ctx.getActivity() with cordova.getActivity()");
        return cordova.getActivity();
    }

    public Context getApplicationContext()
    {
        Log.i("Deprecation Notice", "Replace ctx.getApplicationContext() with cordova.getActivity().getApplicationContext()");
        return cordova.getActivity().getApplicationContext();
    }

    public AssetManager getAssets()
    {
        Log.i("Deprecation Notice", "Replace ctx.getAssets() with cordova.getActivity().getAssets()");
        return cordova.getActivity().getAssets();
    }

    public Context getContext()
    {
        Log.i("Deprecation Notice", "Replace ctx.getContext() with cordova.getContext()");
        return cordova.getContext();
    }

    public PackageManager getPackageManager()
    {
        Log.i("Deprecation Notice", "Replace ctx.getPackageManager() with cordova.getActivity().getPackageManager()");
        return cordova.getActivity().getPackageManager();
    }

    public Resources getResources()
    {
        Log.i("Deprecation Notice", "Replace ctx.getResources() with cordova.getActivity().getResources()");
        return cordova.getActivity().getResources();
    }

    public SharedPreferences getSharedPreferences(String s, int i)
    {
        Log.i("Deprecation Notice", "Replace ctx.getSharedPreferences() with cordova.getActivity().getSharedPreferences()");
        return cordova.getActivity().getSharedPreferences(s, i);
    }

    public Object getSystemService(String s)
    {
        Log.i("Deprecation Notice", "Replace ctx.getSystemService() with cordova.getActivity().getSystemService()");
        return cordova.getActivity().getSystemService(s);
    }

    public ExecutorService getThreadPool()
    {
        Log.i("Deprecation Notice", "Replace ctx.getThreadPool() with cordova.getThreadPool()");
        return cordova.getThreadPool();
    }

    public Object onMessage(String s, Object obj)
    {
        Log.i("Deprecation Notice", "Replace ctx.onMessage() with cordova.onMessage()");
        return cordova.onMessage(s, obj);
    }

    public void runOnUiThread(Runnable runnable)
    {
        Log.i("Deprecation Notice", "Replace ctx.runOnUiThread() with cordova.getActivity().runOnUiThread()");
        cordova.getActivity().runOnUiThread(runnable);
    }

    public void setActivityResultCallback(CordovaPlugin cordovaplugin)
    {
        Log.i("Deprecation Notice", "Replace ctx.setActivityResultCallback() with cordova.setActivityResultCallback()");
        cordova.setActivityResultCallback(cordovaplugin);
    }

    public void startActivity(Intent intent)
    {
        Log.i("Deprecation Notice", "Replace ctx.startActivity() with cordova.getActivity().startActivity()");
        cordova.getActivity().startActivity(intent);
    }

    public void startActivityForResult(CordovaPlugin cordovaplugin, Intent intent, int i)
    {
        Log.i("Deprecation Notice", "Replace ctx.startActivityForResult() with cordova.startActivityForResult()");
        cordova.startActivityForResult(cordovaplugin, intent, i);
    }

    public ComponentName startService(Intent intent)
    {
        Log.i("Deprecation Notice", "Replace ctx.startService() with cordova.getActivity().startService()");
        return cordova.getActivity().startService(intent);
    }

    public void unbindService(ServiceConnection serviceconnection)
    {
        Log.i("Deprecation Notice", "Replace ctx.unbindService() with cordova.getActivity().unbindService()");
        cordova.getActivity().unbindService(serviceconnection);
    }

    public void unregisterReceiver(BroadcastReceiver broadcastreceiver)
    {
        Log.i("Deprecation Notice", "Replace ctx.unregisterReceiver() with cordova.getActivity().unregisterReceiver()");
        cordova.getActivity().unregisterReceiver(broadcastreceiver);
    }
}

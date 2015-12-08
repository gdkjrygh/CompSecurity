// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.content.Intent;
import android.os.Debug;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.util.AndroidUtils;

public class DebugMenuItems
{

    private final NetflixActivity activity;
    private final String logTag;

    public DebugMenuItems(String s, NetflixActivity netflixactivity)
    {
        logTag = s;
        activity = netflixactivity;
    }

    private void addFlushDataCacheItem(Menu menu)
    {
        menu.add("Flush Data Cache").setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() {

            final DebugMenuItems this$0;

            public boolean onMenuItemClick(MenuItem menuitem)
            {
                menuitem = activity.getServiceManager();
                if (menuitem != null)
                {
                    menuitem.flushCaches();
                }
                return true;
            }

            
            {
                this$0 = DebugMenuItems.this;
                super();
            }
        });
    }

    private void addHprofDumpItem(Menu menu)
    {
        menu.add("Dump hprof profile").setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() {

            final DebugMenuItems this$0;

            public boolean onMenuItemClick(MenuItem menuitem)
            {
                AndroidUtils.dumpHprofToDisk();
                return true;
            }

            
            {
                this$0 = DebugMenuItems.this;
                super();
            }
        });
    }

    private void addSendCwRefreshBroadcast(Menu menu)
    {
        menu.add("Send Cw Refresh").setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() {

            final DebugMenuItems this$0;

            public boolean onMenuItemClick(MenuItem menuitem)
            {
                Log.d(logTag, "Sending CW refresh: com.netflix.mediaclient.intent.action.BA_CW_REFRESH");
                activity.sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.BA_CW_REFRESH"));
                return true;
            }

            
            {
                this$0 = DebugMenuItems.this;
                super();
            }
        });
    }

    private void addSendHomeRefreshBroadcast(Menu menu)
    {
        menu.add("Send Home Refresh").setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() {

            final DebugMenuItems this$0;

            public boolean onMenuItemClick(MenuItem menuitem)
            {
                Log.d(logTag, "Sending home refresh: com.netflix.mediaclient.intent.action.REFRESH_HOME_LOLOMO");
                activity.sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.REFRESH_HOME_LOLOMO"));
                return true;
            }

            
            {
                this$0 = DebugMenuItems.this;
                super();
            }
        });
    }

    private void addToggleFetchErrorsItem(Menu menu)
    {
        menu.add("Toggle Fetch Errors").setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() {

            final DebugMenuItems this$0;

            public boolean onMenuItemClick(MenuItem menuitem)
            {
                NetflixService.toggleFetchErrorsEnabled();
                activity.showFetchErrorsToast();
                return true;
            }

            
            {
                this$0 = DebugMenuItems.this;
                super();
            }
        });
    }

    private void addTraceviewItem(Menu menu)
    {
        menu.add("5s Traceview").setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() {

            final DebugMenuItems this$0;

            public boolean onMenuItemClick(MenuItem menuitem)
            {
                beginTraceview();
                return true;
            }

            
            {
                this$0 = DebugMenuItems.this;
                super();
            }
        });
    }

    private void beginTraceview()
    {
        Log.i(logTag, "Starting method trace...");
        Debug.startMethodTracing("nflx");
        (new Handler()).postDelayed(new Runnable() {

            final DebugMenuItems this$0;

            public void run()
            {
                Debug.stopMethodTracing();
                Log.i(logTag, "Trace complete.  Get with: adb pull /sdcard/nflx.trace");
                Toast.makeText(activity, "Trace: /sdcard/nflx.trace", 1).show();
            }

            
            {
                this$0 = DebugMenuItems.this;
                super();
            }
        }, 5000L);
    }

    public void addItems(Menu menu)
    {
        addHprofDumpItem(menu);
        addTraceviewItem(menu);
        addToggleFetchErrorsItem(menu);
        addFlushDataCacheItem(menu);
        addSendHomeRefreshBroadcast(menu);
        addSendCwRefreshBroadcast(menu);
    }



}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.appwidget;

import android.content.Intent;
import android.os.IBinder;
import android.widget.RemoteViewsService;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.appwidget:
//            StackRemoteViewsFactory, PWidgetHelper

public class PWidgetService extends RemoteViewsService
{

    public static final String CATEGORY = "welcome";
    private static StackRemoteViewsFactory _factory;

    public PWidgetService()
    {
    }

    public static int getPinCount()
    {
        if (_factory == null)
        {
            return 0;
        } else
        {
            return _factory.getCount();
        }
    }

    private void resetFactory(Intent intent)
    {
        intent = (StackRemoteViewsFactory)onGetViewFactory(intent);
        _factory = intent;
        intent.clearRetry();
        _factory.loadData();
    }

    public IBinder onBind(Intent intent)
    {
        intent = super.onBind(intent);
        PLog.info("PWidgetService.onBind", new Object[0]);
        return intent;
    }

    public android.widget.RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent)
    {
        if (_factory == null)
        {
            _factory = new StackRemoteViewsFactory(getApplicationContext(), intent);
        }
        _factory.updateWidgetId(intent);
        return _factory;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        PLog.info("PWidgetService.onStartCommand", new Object[0]);
        if (intent == null || intent.getBooleanExtra("com.pinterest.EXTRA_MANUAL_UPDATE", false))
        {
            PLog.info("PWidgetService.manual_update", new Object[0]);
            PWidgetHelper.notifyWidgetStateChange(this, -1, -1);
        } else
        {
            resetFactory(intent);
        }
        return super.onStartCommand(intent, i, j);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.viewserver;

import android.app.Activity;
import android.os.Bundle;
import me.lyft.android.development.ViewServerSupport;
import me.lyft.android.infrastructure.activity.ActivityService;

// Referenced classes of package me.lyft.android.infrastructure.viewserver:
//            IViewServerService, IViewServer

public class ViewServerService extends ActivityService
    implements IViewServerService
{

    private final IViewServer viewServer = ViewServerSupport.getViewServer();

    public ViewServerService()
    {
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        super.onActivityCreated(activity, bundle);
        viewServer.addWindow(activity);
    }

    public void onActivityDestroyed(Activity activity)
    {
        viewServer.removeWindow(activity);
        super.onActivityDestroyed(activity);
    }

    public void onActivityResumed(Activity activity)
    {
        super.onActivityResumed(activity);
        viewServer.setFocusedWindow(activity);
    }
}

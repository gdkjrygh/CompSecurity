// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service.capability;

import com.connectsdk.core.AppInfo;
import com.connectsdk.service.capability.listeners.ResponseListener;
import com.connectsdk.service.command.ServiceSubscription;
import com.connectsdk.service.sessions.LaunchSession;

// Referenced classes of package com.connectsdk.service.capability:
//            CapabilityMethods

public interface Launcher
    extends CapabilityMethods
{
    public static interface AppCountListener
        extends ResponseListener
    {
    }

    public static interface AppInfoListener
        extends ResponseListener
    {
    }

    public static interface AppLaunchListener
        extends ResponseListener
    {
    }

    public static interface AppListListener
        extends ResponseListener
    {
    }

    public static class AppState
    {

        public String castChatMessageUrl;
        public boolean running;
        public String state;
        public boolean visible;

        public void setState(String s)
        {
            state = s;
            running = "running".equals(s);
            visible = running;
        }

        public AppState()
        {
            this(false, false);
        }

        public AppState(boolean flag, boolean flag1)
        {
            castChatMessageUrl = null;
            state = null;
            running = flag;
            visible = flag1;
        }
    }

    public static interface AppStateListener
        extends ResponseListener
    {
    }


    public static final String Any = "Launcher.Any";
    public static final String AppState = "Launcher.AppState";
    public static final String AppState_Subscribe = "Launcher.AppState.Subscribe";
    public static final String Application = "Launcher.Application";
    public static final String Application_Close = "Launcher.Application.Close";
    public static final String Application_List = "Launcher.Application.List";
    public static final String Application_Params = "Launcher.Application.Params";
    public static final String Browser = "Launcher.Browser";
    public static final String Browser_Params = "Launcher.Browser.Params";
    public static final String Capabilities[] = {
        "Launcher.Application", "Launcher.Application.Params", "Launcher.Application.Close", "Launcher.Application.List", "Launcher.Browser", "Launcher.Browser.Params", "Launcher.AppState", "Launcher.AppState.Subscribe", "Launcher.RunningApp", "Launcher.RunningApp.Subscribe"
    };
    public static final String RunningApp = "Launcher.RunningApp";
    public static final String RunningApp_Subscribe = "Launcher.RunningApp.Subscribe";

    public abstract void closeApp(LaunchSession launchsession, ResponseListener responselistener);

    public abstract void getAppList(AppListListener applistlistener);

    public abstract void getAppState(LaunchSession launchsession, AppStateListener appstatelistener);

    public abstract void getAppState(String s, AppStateListener appstatelistener);

    public abstract Launcher getLauncher();

    public abstract CapabilityMethods.CapabilityPriorityLevel getLauncherCapabilityLevel();

    public abstract void getRunningApp(AppInfoListener appinfolistener);

    public abstract void launchApp(String s, AppLaunchListener applaunchlistener);

    public abstract void launchAppWithInfo(AppInfo appinfo, AppLaunchListener applaunchlistener);

    public abstract void launchAppWithInfo(AppInfo appinfo, Object obj, AppLaunchListener applaunchlistener);

    public abstract ServiceSubscription subscribeAppState(LaunchSession launchsession, AppStateListener appstatelistener);

    public abstract ServiceSubscription subscribeRunningApp(AppInfoListener appinfolistener);

}

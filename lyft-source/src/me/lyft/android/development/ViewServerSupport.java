// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.development;

import me.lyft.android.infrastructure.viewserver.IViewServer;

public class ViewServerSupport
{

    private static IViewServer instance;

    public ViewServerSupport()
    {
    }

    private static IViewServer createViewServer()
    {
        IViewServer iviewserver;
        try
        {
            iviewserver = (IViewServer)getViewServerProxyClass().newInstance();
        }
        catch (Throwable throwable)
        {
            return new NoOpViewServer();
        }
        return iviewserver;
    }

    public static IViewServer getViewServer()
    {
        if (instance == null)
        {
            instance = createViewServer();
        }
        return instance;
    }

    private static Class getViewServerProxyClass()
    {
        return Class.forName("me.lyft.android.development.proxies.ViewServerProxy");
    }

    private class NoOpViewServer
        implements IViewServer
    {

        public void addWindow(Activity activity)
        {
        }

        public void removeWindow(Activity activity)
        {
        }

        public void setFocusedWindow(Activity activity)
        {
        }

        NoOpViewServer()
        {
        }
    }

}

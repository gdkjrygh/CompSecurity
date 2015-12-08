// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.eureka;

import android.app.Application;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.discovery.DiscoveryManager;
import com.connectsdk.discovery.DiscoveryManagerListener;
import com.connectsdk.service.capability.Launcher;
import com.connectsdk.service.command.ServiceCommandError;
import com.pandora.android.eureka.dialog.f;
import com.pandora.android.provider.b;
import p.df.a;

public class e
    implements DiscoveryManagerListener
{

    public e()
    {
    }

    public void onDeviceAdded(DiscoveryManager discoverymanager, ConnectableDevice connectabledevice)
    {
        a.c("ConnectSDK", (new StringBuilder()).append(connectabledevice.getFriendlyName()).append(" came online").toString());
        connectabledevice.getLauncher().getAppState("pandora", new com.connectsdk.service.capability.Launcher.AppStateListener(connectabledevice) {

            final ConnectableDevice a;
            final e b;

            public void a(com.connectsdk.service.capability.Launcher.AppState appstate)
            {
                if (appstate.castChatMessageUrl != null)
                {
                    a.setCastChatMessageUrl(appstate.castChatMessageUrl);
                    f.a(b.a.h().getApplicationContext()).b(a);
                }
            }

            public void onError(ServiceCommandError servicecommanderror)
            {
                p.df.a.c("ConnectSDK", (new StringBuilder()).append("Failed to get app state: ").append(servicecommanderror).toString(), servicecommanderror);
            }

            public void onSuccess(Object obj)
            {
                a((com.connectsdk.service.capability.Launcher.AppState)obj);
            }

            
            {
                b = e.this;
                a = connectabledevice;
                super();
            }
        });
    }

    public void onDeviceRemoved(DiscoveryManager discoverymanager, ConnectableDevice connectabledevice)
    {
        a.c("ConnectSDK", (new StringBuilder()).append(connectabledevice.getFriendlyName()).append(" went offline").toString());
        f.a(b.a.h().getApplicationContext()).d(connectabledevice);
    }

    public void onDeviceUpdated(DiscoveryManager discoverymanager, ConnectableDevice connectabledevice)
    {
        a.c("ConnectSDK", (new StringBuilder()).append(connectabledevice.getFriendlyName()).append(" updated").toString());
        connectabledevice.getLauncher().getAppState("pandora", new com.connectsdk.service.capability.Launcher.AppStateListener(connectabledevice) {

            final ConnectableDevice a;
            final e b;

            public void a(com.connectsdk.service.capability.Launcher.AppState appstate)
            {
                if (appstate.castChatMessageUrl != null)
                {
                    a.setCastChatMessageUrl(appstate.castChatMessageUrl);
                    f.a(b.a.h().getApplicationContext()).c(a);
                }
            }

            public void onError(ServiceCommandError servicecommanderror)
            {
                p.df.a.c("ConnectSDK", (new StringBuilder()).append("Failed to get app state: ").append(servicecommanderror).toString(), servicecommanderror);
            }

            public void onSuccess(Object obj)
            {
                a((com.connectsdk.service.capability.Launcher.AppState)obj);
            }

            
            {
                b = e.this;
                a = connectabledevice;
                super();
            }
        });
    }

    public void onDiscoveryFailed(DiscoveryManager discoverymanager, ServiceCommandError servicecommanderror)
    {
        a.c("ConnectSDK", (new StringBuilder()).append("Device discovery failed with error: ").append(servicecommanderror.toString()).toString());
    }
}

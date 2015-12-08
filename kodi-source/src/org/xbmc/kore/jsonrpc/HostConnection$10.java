// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc;


// Referenced classes of package org.xbmc.kore.jsonrpc:
//            HostConnection

class r.OnSpeedChanged
    implements Runnable
{

    final HostConnection this$0;
    final org.xbmc.kore.jsonrpc.notification.ged val$apiNotification;
    final yerNotificationsObserver val$observer;

    public void run()
    {
        val$observer.onSpeedChanged(val$apiNotification);
    }

    r.OnSpeedChanged()
    {
        this$0 = final_hostconnection;
        val$observer = yernotificationsobserver;
        val$apiNotification = org.xbmc.kore.jsonrpc.notification.ged.this;
        super();
    }
}

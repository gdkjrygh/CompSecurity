// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc;


// Referenced classes of package org.xbmc.kore.jsonrpc:
//            HostConnection

class n
    implements Runnable
{

    final HostConnection this$0;
    final org.xbmc.kore.jsonrpc.notification.cation val$apiNotification;
    final temNotificationsObserver val$observer;

    public void run()
    {
        val$observer.onQuit(val$apiNotification);
    }

    server()
    {
        this$0 = final_hostconnection;
        val$observer = temnotificationsobserver;
        val$apiNotification = org.xbmc.kore.jsonrpc.notification.cation.this;
        super();
    }
}

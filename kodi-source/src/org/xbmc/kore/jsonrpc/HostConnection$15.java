// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc;


// Referenced classes of package org.xbmc.kore.jsonrpc:
//            HostConnection

class .OnInputRequested
    implements Runnable
{

    final HostConnection this$0;
    final org.xbmc.kore.jsonrpc.notification.sted val$apiNotification;
    final utNotificationsObserver val$observer;

    public void run()
    {
        val$observer.onInputRequested(val$apiNotification);
    }

    .OnInputRequested()
    {
        this$0 = final_hostconnection;
        val$observer = utnotificationsobserver;
        val$apiNotification = org.xbmc.kore.jsonrpc.notification.sted.this;
        super();
    }
}

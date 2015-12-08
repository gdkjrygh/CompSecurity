// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.eventclient;


// Referenced classes of package org.xbmc.kore.eventclient:
//            EventServerConnection

static final class val.result
    implements Runnable
{

    final entServerConnectionCallback val$callback;
    final boolean val$result;

    public void run()
    {
        val$callback.OnConnectResult(val$result);
    }

    entServerConnectionCallback(entServerConnectionCallback entserverconnectioncallback, boolean flag)
    {
        val$callback = entserverconnectioncallback;
        val$result = flag;
        super();
    }
}

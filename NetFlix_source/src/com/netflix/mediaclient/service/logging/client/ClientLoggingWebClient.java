// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client;


// Referenced classes of package com.netflix.mediaclient.service.logging.client:
//            ClientLoggingWebCallback

public interface ClientLoggingWebClient
{

    public abstract boolean isSynchronous();

    public abstract void sendLoggingEvents(String s, String s1, ClientLoggingWebCallback clientloggingwebcallback);
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.ads;


// Referenced classes of package com.netflix.mediaclient.service.logging.ads:
//            AdvertiserIdLoggingCallback

public interface AdvertiserIdLoggingWebClient
{

    public abstract boolean isSynchronous();

    public abstract void sendLoggingEvent(String s, AdvertiserIdLoggingCallback advertiseridloggingcallback);
}

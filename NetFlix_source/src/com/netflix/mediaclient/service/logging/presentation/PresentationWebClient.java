// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.presentation;


// Referenced classes of package com.netflix.mediaclient.service.logging.presentation:
//            PresentationRequest, PresentationWebCallback

public interface PresentationWebClient
{

    public abstract boolean isSynchronous();

    public abstract void sendPresentationEvents(String s, PresentationRequest presentationrequest, PresentationWebCallback presentationwebcallback);
}

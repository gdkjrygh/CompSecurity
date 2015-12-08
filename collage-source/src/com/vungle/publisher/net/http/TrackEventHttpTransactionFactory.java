// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net.http;

import com.vungle.publisher.db.model.Ad;
import dagger.Lazy;

// Referenced classes of package com.vungle.publisher.net.http:
//            TrackEventHttpResponseHandler, MaxRetryAgeHttpResponseHandler, TrackEventHttpRequest, HttpRequest, 
//            HttpTransaction

public class TrackEventHttpTransactionFactory extends HttpTransaction.Factory
{

    TrackEventHttpRequest.Factory a;
    Lazy b;

    public TrackEventHttpTransactionFactory()
    {
    }

    public final HttpTransaction a(Ad ad, com.vungle.publisher.db.model.EventTracking.a a1, String s)
    {
        TrackEventHttpResponseHandler trackeventhttpresponsehandler = (TrackEventHttpResponseHandler)b.get();
    /* anonymous class not found */
    class _anm1 {}

        _cls1.a[a1.ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 96
    //                   2 96;
           goto _L1 _L2 _L2
_L1:
        trackeventhttpresponsehandler.i = 1;
        trackeventhttpresponsehandler.h = 10;
_L4:
        TrackEventHttpRequest trackeventhttprequest = (TrackEventHttpRequest)a.c();
        trackeventhttprequest.e = ad;
        trackeventhttprequest.f = a1;
        trackeventhttprequest.b = s;
        return super.a(trackeventhttprequest, trackeventhttpresponsehandler);
_L2:
        trackeventhttpresponsehandler.a = true;
        if (true) goto _L4; else goto _L3
_L3:
    }
}

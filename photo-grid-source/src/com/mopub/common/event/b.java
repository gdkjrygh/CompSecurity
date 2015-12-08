// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.event;

import com.mopub.network.ScribeRequest;
import java.util.List;

// Referenced classes of package com.mopub.common.event:
//            ScribeEventRecorder

final class b
    implements com.mopub.network.ScribeRequest.ScribeRequestFactory
{

    final List a;
    final ScribeEventRecorder b;

    b(ScribeEventRecorder scribeeventrecorder, List list)
    {
        b = scribeeventrecorder;
        a = list;
        super();
    }

    public final ScribeRequest createRequest(com.mopub.network.ScribeRequest.Listener listener)
    {
        return new ScribeRequest("https://analytics.mopub.com/i/jot/exchange_client_event", a, ScribeEventRecorder.a(b), listener);
    }
}

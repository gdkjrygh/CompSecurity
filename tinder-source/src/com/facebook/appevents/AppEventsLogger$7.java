// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;

import com.facebook.GraphRequest;
import com.facebook.j;

// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger

static final class d
    implements com.facebook.sLogger._cls7
{

    final cessTokenAppIdPair a;
    final GraphRequest b;
    final cessTokenAppIdPair c;
    final cessTokenAppIdPair d;

    public final void a(j j)
    {
        AppEventsLogger.a(a, b, j, c, d);
    }

    cessTokenAppIdPair(cessTokenAppIdPair cesstokenappidpair, GraphRequest graphrequest, cessTokenAppIdPair cesstokenappidpair1, cessTokenAppIdPair cesstokenappidpair2)
    {
        a = cesstokenappidpair;
        b = graphrequest;
        c = cesstokenappidpair1;
        d = cesstokenappidpair2;
        super();
    }
}

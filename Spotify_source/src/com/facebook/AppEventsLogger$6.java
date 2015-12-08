// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import any;
import aob;
import aoo;
import aoz;

// Referenced classes of package com.facebook:
//            AppEventsLogger, Request

final class c
    implements aoo
{

    private cessTokenAppIdPair a;
    private aob b;
    private any c;

    public final void a(aoz aoz)
    {
        AppEventsLogger.a(a, aoz, b, c);
    }

    cessTokenAppIdPair(cessTokenAppIdPair cesstokenappidpair, Request request, aob aob, any any)
    {
        a = cesstokenappidpair;
        b = aob;
        c = any;
        super();
    }
}

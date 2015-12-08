// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley;


// Referenced classes of package com.mopub.volley:
//            Request, f

final class d
    implements Runnable
{

    final String a;
    final long b;
    final Request c;

    d(Request request, String s, long l)
    {
        c = request;
        a = s;
        b = l;
        super();
    }

    public final void run()
    {
        Request.a(c).add(a, b);
        Request.a(c).finish(toString());
    }
}

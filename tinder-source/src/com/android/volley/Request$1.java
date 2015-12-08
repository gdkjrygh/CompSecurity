// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            Request

final class b
    implements Runnable
{

    final String a;
    final long b;
    final Request c;

    public final void run()
    {
        Request.a(c).c(a, b);
        Request.a(c).c(toString());
    }

    (Request request, String s, long l)
    {
        c = request;
        a = s;
        b = l;
        super();
    }
}

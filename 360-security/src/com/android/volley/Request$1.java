// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            Request

class c
    implements Runnable
{

    final Request a;
    private final String b;
    private final long c;

    public void run()
    {
        Request.b(a).a(b, c);
        Request.b(a).a(toString());
    }

    (Request request, String s, long l)
    {
        a = request;
        b = s;
        c = l;
        super();
    }
}

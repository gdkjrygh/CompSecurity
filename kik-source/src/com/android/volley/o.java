// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            n

final class o
    implements Runnable
{

    final String a;
    final long b;
    final n c;

    o(n n1, String s, long l)
    {
        c = n1;
        a = s;
        b = l;
        super();
    }

    public final void run()
    {
        n.a(c).a(a, b);
        n.a(c).a(toString());
    }
}

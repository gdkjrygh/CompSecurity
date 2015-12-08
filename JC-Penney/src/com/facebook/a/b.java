// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;


// Referenced classes of package com.facebook.a:
//            a

final class b
    implements Runnable
{

    final a a;
    final long b;
    final String c;

    b(a a1, long l, String s)
    {
        a = a1;
        b = l;
        c = s;
        super();
    }

    public void run()
    {
        com.facebook.a.a.a(a, b, c);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import kik.a.h.h;

// Referenced classes of package kik.a.j:
//            o

final class p
    implements Runnable
{

    final String a;
    final String b;
    final com.kik.g.p c;
    final o d;

    p(o o, String s, String s1, com.kik.g.p p1)
    {
        d = o;
        a = s;
        b = s1;
        c = p1;
        super();
    }

    public final void run()
    {
        byte abyte0[] = h.a(a, b, "arKrXQAgwtlbijZ");
        c.a(abyte0);
    }
}

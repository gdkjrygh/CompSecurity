// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class jdl
    implements Runnable
{

    private int a;
    private int b;
    private long c;
    private long d;
    private jdk e;

    jdl(jdk jdk1, int i, int j, long l, long l1)
    {
        e = jdk1;
        a = i;
        b = j;
        c = l;
        d = l1;
        super();
    }

    public final void run()
    {
        for (Iterator iterator = jdk.a(e).iterator(); iterator.hasNext(); ((jde)iterator.next()).a(a, b, c, d)) { }
    }
}

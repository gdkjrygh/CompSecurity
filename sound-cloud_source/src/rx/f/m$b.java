// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.f;

import rx.b.a;

// Referenced classes of package rx.f:
//            m

private static final class .Long
    implements Comparable
{

    final a a;
    final Long b;
    final int c;

    public final int compareTo(Object obj)
    {
        obj = ()obj;
        int j = b.compareTo(((.Long) (obj)).b);
        int i = j;
        if (j == 0)
        {
            i = rx.f.m.a(c, ((c) (obj)).c);
        }
        return i;
    }

    private .Long(a a1, Long long1, int i)
    {
        a = a1;
        b = long1;
        c = i;
    }

    .Long(a a1, Long long1, int i, byte byte0)
    {
        this(a1, long1, i);
    }
}

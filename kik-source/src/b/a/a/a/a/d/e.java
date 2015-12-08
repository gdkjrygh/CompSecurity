// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.d;

import java.util.Comparator;

// Referenced classes of package b.a.a.a.a.d:
//            d

final class e
    implements Comparator
{

    final d a;

    e(d d)
    {
        a = d;
        super();
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (d.a)obj;
        obj1 = (d.a)obj1;
        return (int)(((d.a) (obj)).b - ((d.a) (obj1)).b);
    }
}

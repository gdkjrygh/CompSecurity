// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.d;

import java.util.Comparator;

// Referenced classes of package a.a.a.a.a.d:
//            f, d

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
        obj = (f)obj;
        obj1 = (f)obj1;
        return (int)(((f) (obj)).b - ((f) (obj1)).b);
    }
}

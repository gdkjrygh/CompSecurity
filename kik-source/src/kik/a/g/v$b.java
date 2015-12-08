// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import java.util.Comparator;
import kik.a.d.k;
import kik.a.h.i;

// Referenced classes of package kik.a.g:
//            v

private final class <init>
    implements Comparator
{

    final v a;

    public final int compare(Object obj, Object obj1)
    {
        obj = (k)obj;
        obj1 = (k)obj1;
        return i.a(((k) (obj)).c(), ((k) (obj1)).c());
    }

    private ject(v v1)
    {
        a = v1;
        super();
    }

    ject(v v1, byte byte0)
    {
        this(v1);
    }
}

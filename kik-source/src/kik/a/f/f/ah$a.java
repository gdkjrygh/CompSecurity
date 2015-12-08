// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import java.util.Comparator;
import kik.a.f.c.c;

// Referenced classes of package kik.a.f.f:
//            ah

private final class <init>
    implements Comparator
{

    final ah a;

    public final int compare(Object obj, Object obj1)
    {
        obj = (c)obj;
        obj1 = (c)obj1;
        long l = ((c) (obj)).k();
        long l1 = ((c) (obj1)).k();
        if (l == l1)
        {
            return 0;
        }
        return l >= l1 ? 1 : -1;
    }

    private t(ah ah1)
    {
        a = ah1;
        super();
    }

    t(ah ah1, byte byte0)
    {
        this(ah1);
    }
}

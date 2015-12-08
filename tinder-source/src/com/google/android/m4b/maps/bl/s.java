// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.android.m4b.maps.bl:
//            e, h, i

public final class s extends e
{

    public s(i.b b1)
    {
        super(b1);
    }

    public final e.a a(long l, LinkedList linkedlist, List list)
    {
        Object obj = linkedlist.iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        list = (h)((Iterator) (obj)).next();
        if (list.b() != 2) goto _L4; else goto _L3
_L3:
        obj = linkedlist.listIterator(linkedlist.size());
_L8:
        if (!((ListIterator) (obj)).hasPrevious()) goto _L6; else goto _L5
_L5:
        linkedlist = (h)((ListIterator) (obj)).previous();
        if (linkedlist.b() != 2) goto _L8; else goto _L7
_L7:
        if (list == null || linkedlist == null)
        {
            return e.a.a;
        }
        if (linkedlist.a() - l > 300L)
        {
            return e.a.a;
        }
        float f1 = linkedlist.a(0);
        float f2 = list.a(0);
        float f3 = linkedlist.b(0);
        float f4 = list.b(0);
        float f5 = linkedlist.a(1);
        float f6 = list.a(1);
        float f7 = linkedlist.b(1);
        float f8 = list.b(1);
        if (Math.max(Math.max(Math.abs(f1 - f2) / linkedlist.c(), Math.abs(f3 - f4) / linkedlist.d()), Math.max(Math.abs(f5 - f6) / linkedlist.c(), Math.abs(f7 - f8) / linkedlist.d())) > 0.125F)
        {
            return e.a.a;
        } else
        {
            return e.a.c;
        }
_L6:
        linkedlist = null;
        if (true) goto _L7; else goto _L2
_L2:
        list = null;
        if (true) goto _L3; else goto _L9
_L9:
    }

    public final boolean a()
    {
        return true;
    }

    public final boolean b()
    {
        return true;
    }

    protected final boolean b(i i)
    {
        return a.b(i, true);
    }

    public final boolean c()
    {
        return true;
    }

    protected final void d(i i)
    {
        a.c(i, true);
    }

    protected final boolean f(i i)
    {
        return a.a(i, true);
    }
}

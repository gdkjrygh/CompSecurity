// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bl;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.android.m4b.maps.bl:
//            e, h

public abstract class r extends e
{

    protected float c;
    protected float d;
    private float e;
    private float f;

    public r(i.b b1)
    {
        super(b1);
        e = 0.7853982F;
        f = 0.25F;
        c = 0.125F;
        d = 1.0F;
    }

    protected abstract float a(float f1);

    protected abstract float a(h h1, int i);

    public final e.a a(long l, LinkedList linkedlist, List list)
    {
        float f1;
        float f2;
        float f3;
        float f4;
        h h2;
        ListIterator listiterator;
        if (linkedlist.size() < 3)
        {
            return e.a.b;
        }
        h2 = (h)linkedlist.getLast();
        if (h2.b() != 2)
        {
            return e.a.a;
        }
        listiterator = linkedlist.listIterator(linkedlist.size());
        f2 = 0.0F;
        f1 = 0.0F;
        f4 = 0.0F;
        f3 = 0.0F;
        linkedlist = h2;
        list = null;
_L4:
        if (!listiterator.hasPrevious()) goto _L2; else goto _L1
_L1:
        h h1 = (h)listiterator.previous();
        if (h1.b() != h2.b()) goto _L2; else goto _L3
_L3:
        if (a(h1.f()) >= e)
        {
            return e.a.a;
        }
        if (h1.g() / h1.c() < f)
        {
            return e.a.a;
        }
        float f6;
        float f9;
        if (list != null)
        {
            float f11 = Math.abs(a(h1, 0) - a(((h) (list)), 0));
            float f8 = Math.abs(b(h1, 0) - b(list, 0));
            float f12 = Math.abs(a(h1, h1.b() - 1) - a(((h) (list)), list.b() - 1));
            float f5 = Math.abs(b(h1, h1.b() - 1) - b(list, list.b() - 1)) + f4;
            f8 = f3 + f8;
            f4 = f2 + f12;
            f3 = f1 + f11;
            f1 = f8;
            f2 = f5;
        } else
        {
            float f7 = f2;
            float f10 = f1;
            f2 = f4;
            f1 = f3;
            f4 = f7;
            f3 = f10;
        }
        f6 = f4;
        f9 = f3;
        linkedlist = h1;
        list = h1;
        f4 = f2;
        f3 = f1;
        f2 = f6;
        f1 = f9;
        if (true) goto _L4; else goto _L2
_L2:
        if (f1 + f2 > (f3 + f4) * d)
        {
            return e.a.a;
        }
        f1 = b(h2, 0) - b(linkedlist, 0);
        f2 = b(h2, h2.b() - 1) - b(linkedlist, linkedlist.b() - 1);
        if (f1 * f2 < 0.0F)
        {
            return e.a.a;
        }
        if (Math.min(Math.abs(f1) / h2.d(), Math.abs(f2) / h2.d()) < c)
        {
            return e.a.b;
        } else
        {
            return e.a.c;
        }
    }

    public final boolean a()
    {
        return true;
    }

    protected abstract float b(h h1, int i);
}

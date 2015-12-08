// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            j

static final class a
{

    private final List a;
    private final List b;
    private final int c;
    private final float d;
    private final int e;

    private int a()
    {
        return ((a.hashCode() * 31 + b.hashCode()) * 31 + c) * 31 + Float.floatToIntBits(d);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (d)obj;
            if (Float.compare(((d) (obj)).d, d) != 0)
            {
                return false;
            }
            if (c != ((c) (obj)).c)
            {
                return false;
            }
            if (!a.equals(((a) (obj)).a))
            {
                return false;
            }
            if (!b.equals(((b) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return e;
    }

    public ( )
    {
        a = new ArrayList();
        b = new ArrayList();
        d = 0.0F;
        c = 0;
        b.addAll(.b);
        a.addAll(.c);
        e = a();
    }

    public a(List list, float f, int i, boolean flag)
    {
        a = new ArrayList();
        b = new ArrayList();
        d = f;
        c = i;
        if (flag)
        {
            list = (c)list.get(0);
            b.addAll(((b) (list)).b);
            a.addAll(((a) (list)).c);
        } else
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                a a1 = (c)list.next();
                b.addAll(a1.b);
                a.addAll(a1.c);
            }
        }
        e = a();
    }
}

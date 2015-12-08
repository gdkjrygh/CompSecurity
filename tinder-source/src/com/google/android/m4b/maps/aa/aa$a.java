// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.Collection;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            aa, bb, j

static class b extends b
{

    Object a[];
    int b;

    private void a(int i)
    {
        if (a.length < i)
        {
            a = j.b(a, a(a.length, i));
        }
    }

    public a a(Object obj)
    {
        j.a(obj);
        a(b + 1);
        Object aobj[] = a;
        int i = b;
        b = i + 1;
        aobj[i] = obj;
        return this;
    }

    public b a(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            Collection collection = (Collection)iterable;
            int i = b;
            a(collection.size() + i);
        }
        super.a(iterable);
        return this;
    }

    public transient a a(Object aobj[])
    {
        j.a(aobj);
        a(b + aobj.length);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (a)), b, aobj.length);
        b = b + aobj.length;
        return this;
    }

    public b b(Object obj)
    {
        return a(obj);
    }

    ()
    {
        bb.a(4, "initialCapacity");
        a = new Object[4];
        b = 0;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.ag;
import com.google.a.d.c;
import com.google.a.d.d;
import com.google.a.j;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.a.b.a:
//            b, y

public final class a extends af
{

    public static final ag a = new b();
    private final Class b;
    private final af c;

    public a(j j, af af1, Class class1)
    {
        c = new y(j, af1, class1);
        b = class1;
    }

    public void a(d d1, Object obj)
    {
        if (obj == null)
        {
            d1.f();
            return;
        }
        d1.b();
        int i = 0;
        for (int j = Array.getLength(obj); i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            c.a(d1, obj1);
        }

        d1.c();
    }

    public Object b(com.google.a.d.a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        }
        ArrayList arraylist = new ArrayList();
        a1.a();
        for (; a1.e(); arraylist.add(c.b(a1))) { }
        a1.b();
        a1 = ((com.google.a.d.a) (Array.newInstance(b, arraylist.size())));
        for (int i = 0; i < arraylist.size(); i++)
        {
            Array.set(a1, i, arraylist.get(i));
        }

        return a1;
    }

}

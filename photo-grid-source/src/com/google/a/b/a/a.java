// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.an;
import com.google.a.d.e;
import com.google.a.d.f;
import com.google.a.k;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.a.b.a:
//            b, x

public final class a extends am
{

    public static final an a = new b();
    private final Class b;
    private final am c;

    public a(k k, am am1, Class class1)
    {
        c = new x(k, am1, class1);
        b = class1;
    }

    public final Object a(com.google.a.d.a a1)
    {
        if (a1.f() == e.i)
        {
            a1.j();
            return null;
        }
        ArrayList arraylist = new ArrayList();
        a1.a();
        for (; a1.e(); arraylist.add(c.a(a1))) { }
        a1.b();
        a1 = ((com.google.a.d.a) (Array.newInstance(b, arraylist.size())));
        for (int i = 0; i < arraylist.size(); i++)
        {
            Array.set(a1, i, arraylist.get(i));
        }

        return a1;
    }

    public final void a(f f1, Object obj)
    {
        if (obj == null)
        {
            f1.f();
            return;
        }
        f1.b();
        int i = 0;
        for (int j = Array.getLength(obj); i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            c.a(f1, obj1);
        }

        f1.c();
    }

}

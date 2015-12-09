// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.am;
import com.google.b.d.c;
import com.google.b.d.d;
import com.google.b.k;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.b.b.a:
//            b, y

public final class a extends al
{

    public static final am a = new b();
    private final Class b;
    private final al c;

    public a(k k, al al1, Class class1)
    {
        c = new y(k, al1, class1);
        b = class1;
    }

    public final Object a(com.google.b.d.a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        }
        ArrayList arraylist = new ArrayList();
        a1.a();
        for (; a1.e(); arraylist.add(c.a(a1))) { }
        a1.b();
        a1 = ((com.google.b.d.a) (Array.newInstance(b, arraylist.size())));
        for (int i = 0; i < arraylist.size(); i++)
        {
            Array.set(a1, i, arraylist.get(i));
        }

        return a1;
    }

    public final void a(d d1, Object obj)
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

}

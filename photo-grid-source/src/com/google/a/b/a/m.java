// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.an;
import com.google.a.b.v;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;
import com.google.a.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.a.b.a:
//            n, o

public final class m extends am
{

    public static final an a = new n();
    private final k b;

    private m(k k1)
    {
        b = k1;
    }

    m(k k1, byte byte0)
    {
        this(k1);
    }

    public final Object a(a a1)
    {
        e e1 = a1.f();
        switch (com.google.a.b.a.o.a[e1.ordinal()])
        {
        default:
            throw new IllegalStateException();

        case 1: // '\001'
            ArrayList arraylist = new ArrayList();
            a1.a();
            for (; a1.e(); arraylist.add(a(a1))) { }
            a1.b();
            return arraylist;

        case 2: // '\002'
            v v1 = new v();
            a1.c();
            for (; a1.e(); v1.put(a1.g(), a(a1))) { }
            a1.d();
            return v1;

        case 3: // '\003'
            return a1.h();

        case 4: // '\004'
            return Double.valueOf(a1.k());

        case 5: // '\005'
            return Boolean.valueOf(a1.i());

        case 6: // '\006'
            a1.j();
            return null;
        }
    }

    public final void a(f f1, Object obj)
    {
        if (obj == null)
        {
            f1.f();
            return;
        }
        am am1 = b.a(obj.getClass());
        if (am1 instanceof m)
        {
            f1.d();
            f1.e();
            return;
        } else
        {
            am1.a(f1, obj);
            return;
        }
    }

}

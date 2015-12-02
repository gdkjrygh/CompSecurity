// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            ej, ev, fi, ew, 
//            av

class jt extends ej
{

    final transient ev a;
    final transient ej b;

    jt(ev ev1)
    {
        a = ev1;
        ew ew1 = ev.k();
        java.util.Map.Entry entry;
        for (ev1 = ev1.a().iterator(); ev1.hasNext(); ew1.b(entry.getValue(), entry.getKey()))
        {
            entry = (java.util.Map.Entry)ev1.next();
        }

        b = new jt(ew1.b(), this);
    }

    jt(ev ev1, ej ej1)
    {
        a = ev1;
        b = ej1;
    }

    public av b()
    {
        return h();
    }

    boolean d()
    {
        return a.d() || b.g().d();
    }

    ev g()
    {
        return a;
    }

    public ej h()
    {
        return b;
    }
}

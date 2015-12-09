// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.b.b.a;
import com.google.b.b.a.z;
import com.google.b.b.s;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.b:
//            ag, d, ae, v, 
//            s, al, aj, a, 
//            k, j

public final class r
{

    private s a;
    private ag b;
    private j c;
    private final Map d = new HashMap();
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private boolean g;
    private String h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;

    public r()
    {
        a = s.a;
        b = com.google.b.ag.a;
        c = com.google.b.d.a;
        i = 2;
        j = 2;
        m = true;
    }

    public final r a()
    {
        a = a.a();
        return this;
    }

    public final r a(d d1)
    {
        c = d1;
        return this;
    }

    public final r a(Type type, Object obj)
    {
        boolean flag;
        if ((obj instanceof ae) || (obj instanceof v) || (obj instanceof com.google.b.s) || (obj instanceof al))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.b.b.a.a(flag);
        if (obj instanceof com.google.b.s)
        {
            d.put(type, (com.google.b.s)obj);
        }
        if ((obj instanceof ae) || (obj instanceof v))
        {
            com.google.b.c.a a1 = com.google.b.c.a.get(type);
            e.add(aj.b(a1, obj));
        }
        if (obj instanceof al)
        {
            e.add(z.a(com.google.b.c.a.get(type), (al)obj));
        }
        return this;
    }

    public final r b()
    {
        g = true;
        return this;
    }

    public final r c()
    {
        k = true;
        return this;
    }

    public final r d()
    {
        n = true;
        return this;
    }

    public final r e()
    {
        i = 1;
        h = null;
        return this;
    }

    public final k f()
    {
        Object obj;
        ArrayList arraylist;
        int i1;
        int j1;
        arraylist = new ArrayList();
        arraylist.addAll(e);
        Collections.reverse(arraylist);
        arraylist.addAll(f);
        obj = h;
        i1 = i;
        j1 = j;
        if (obj == null || "".equals(((String) (obj)).trim())) goto _L2; else goto _L1
_L1:
        obj = new com.google.b.a(((String) (obj)));
_L6:
        arraylist.add(com.google.b.aj.a(com.google.b.c.a.get(java/util/Date), obj));
        arraylist.add(com.google.b.aj.a(com.google.b.c.a.get(java/sql/Timestamp), obj));
        arraylist.add(com.google.b.aj.a(com.google.b.c.a.get(java/sql/Date), obj));
_L4:
        return new k(a, c, d, g, k, o, m, n, l, b, arraylist);
_L2:
        if (i1 == 2 || j1 == 2) goto _L4; else goto _L3
_L3:
        obj = new com.google.b.a(i1, j1);
        if (true) goto _L6; else goto _L5
_L5:
    }
}

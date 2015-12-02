// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class bjy
{

    private bld a;
    private bkn b;
    private bjv c;
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

    public bjy()
    {
        a = bld.a;
        b = bkn.a;
        c = bju.a;
        i = 2;
        j = 2;
        m = true;
    }

    private static void a(String s, int i1, int j1, List list)
    {
        if (s == null || "".equals(s.trim())) goto _L2; else goto _L1
_L1:
        s = new bjr(s);
_L6:
        list.add(bko.a(bmj.get(java/util/Date), s));
        list.add(bko.a(bmj.get(java/sql/Timestamp), s));
        list.add(bko.a(bmj.get(java/sql/Date), s));
_L4:
        return;
_L2:
        if (i1 == 2 || j1 == 2) goto _L4; else goto _L3
_L3:
        s = new bjr(i1, j1);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final bjy a()
    {
        g = true;
        return this;
    }

    public final bjy a(bju bju1)
    {
        c = bju1;
        return this;
    }

    public final bjy a(bkr bkr)
    {
        e.add(bkr);
        return this;
    }

    public final bjy a(Type type, Object obj)
    {
        bkx.a(true);
        if (obj instanceof bjz)
        {
            d.put(type, (bjz)obj);
        }
        bmj bmj1 = bmj.get(type);
        e.add(bko.b(bmj1, obj));
        if (obj instanceof bkq)
        {
            e.add(bmh.a(bmj.get(type), (bkq)obj));
        }
        return this;
    }

    public final bjy b()
    {
        l = true;
        return this;
    }

    public final bjw c()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(e);
        Collections.reverse(arraylist);
        arraylist.addAll(f);
        a(h, i, j, arraylist);
        return new bjw(a, c, d, g, k, o, m, n, l, b, arraylist);
    }
}

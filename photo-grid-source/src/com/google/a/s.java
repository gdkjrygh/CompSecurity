// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.a.b.a.y;
import com.google.a.b.o;
import com.google.a.c.a;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.a:
//            ah, d, a, ak, 
//            k, t, al, am, 
//            j

public final class s
{

    private o a;
    private ah b;
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

    public s()
    {
        a = o.a;
        b = com.google.a.ah.a;
        c = com.google.a.d.a;
        i = 2;
        j = 2;
        m = true;
    }

    public final k a()
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
        obj = new com.google.a.a(((String) (obj)));
_L6:
        arraylist.add(com.google.a.ak.a(com.google.a.c.a.a(java/util/Date), obj));
        arraylist.add(com.google.a.ak.a(com.google.a.c.a.a(java/sql/Timestamp), obj));
        arraylist.add(com.google.a.ak.a(com.google.a.c.a.a(java/sql/Date), obj));
_L4:
        return new k(a, c, d, g, k, o, m, n, l, b, arraylist);
_L2:
        if (i1 == 2 || j1 == 2) goto _L4; else goto _L3
_L3:
        obj = new com.google.a.a(i1, j1);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final s a(Type type, Object obj)
    {
        com.google.a.b.a.a(true);
        if (obj instanceof t)
        {
            d.put(type, (t)obj);
        }
        a a1 = com.google.a.c.a.a(type);
        List list = e;
        boolean flag;
        if (a1.b() == a1.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        list.add(new al(obj, a1, flag, (byte)0));
        if (obj instanceof am)
        {
            e.add(y.a(com.google.a.c.a.a(type), (am)obj));
        }
        return this;
    }
}

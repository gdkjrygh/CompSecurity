// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.util.Log;
import com.google.android.m4b.maps.a.l;
import com.google.android.m4b.maps.a.r;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.y.j;
import com.google.android.m4b.maps.y.p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bu, bt

final class bv
    implements bu
{

    private static final String a = com/google/android/m4b/maps/cg/bu.getSimpleName();
    private static final com.google.android.m4b.maps.a.m.a j = new com.google.android.m4b.maps.a.m.a() {

        public final void a(r r1)
        {
            if (!p.b(r1.getMessage()) && ab.a(bv.c(), 6))
            {
                Log.e(bv.c(), r1.getMessage());
            }
        }

    };
    private static final com.google.android.m4b.maps.a.m.b k = new com.google.android.m4b.maps.a.m.b() {

        public final volatile void a(Object obj)
        {
        }

    };
    private final k b;
    private final String c;
    private final Map d = ax.b();
    private final boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private bt i;

    bv(k k1, String s, boolean flag, bt bt1)
    {
        b = k1;
        c = s;
        e = flag;
        i = bt1;
    }

    static String c()
    {
        return a;
    }

    public final bu.a a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.y.j.b(f, "Action with name %s not started", new Object[] {
            c
        });
        s = new bu.a(s);
        s.b = com.google.android.m4b.maps.ay.k.c();
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public final void a()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.b(flag, String.format("Action with name %s already started", new Object[] {
            c
        }));
        h = com.google.android.m4b.maps.ay.k.c();
        f = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(bu.a a1)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.y.j.b(f, "Action with name %s not started", new Object[] {
            c
        });
        if (d.get(a1.a) == a1)
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.b(flag, "This event with name %s already ended", new Object[] {
            a1.a
        });
        flag = g;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!d.containsKey(a1.a))
        {
            a1.c = com.google.android.m4b.maps.ay.k.c();
            d.put(a1.a, a1);
        }
        if (true) goto _L1; else goto _L3
_L3:
        a1;
        throw a1;
    }

    public final void b()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (!f || g)
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.b(flag);
        g = true;
        obj = com.google.android.m4b.maps.aa.f.a(d.values());
        d.clear();
        flag = e;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        StringBuilder stringbuilder;
        Iterator iterator;
        stringbuilder = new StringBuilder("https://csi.gstatic.com/csi");
        stringbuilder.append("?s=");
        stringbuilder.append("maps_android_api");
        stringbuilder.append("&v=");
        stringbuilder.append(3);
        stringbuilder.append("&action=");
        stringbuilder.append(c);
        iterator = ((List) (obj)).iterator();
        String s = "&it=";
_L4:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        bu.a a2 = (bu.a)iterator.next();
        stringbuilder.append(s);
        stringbuilder.append(a2.a);
        stringbuilder.append(".");
        stringbuilder.append(a2.a());
        s = ",";
        if (true) goto _L4; else goto _L3
_L3:
        obj = ((List) (obj)).iterator();
        s = "&irt=";
_L6:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        bu.a a1 = (bu.a)((Iterator) (obj)).next();
        stringbuilder.append(s);
        stringbuilder.append(a1.c - h);
        s = ",";
        if (true) goto _L6; else goto _L5
_L5:
        i.b().a(new com.google.android.m4b.maps.am.j(stringbuilder.toString(), k, j, (byte)0));
        if (true) goto _L1; else goto _L7
_L7:
        Exception exception;
        exception;
        throw exception;
    }

}

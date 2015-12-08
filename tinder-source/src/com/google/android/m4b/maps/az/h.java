// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.az;

import android.util.Log;
import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bd.d;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.ap;
import com.google.android.m4b.maps.bo.au;
import com.google.android.m4b.maps.bo.bb;
import com.google.android.m4b.maps.bq.j;
import com.google.android.m4b.maps.bq.l;
import com.google.android.m4b.maps.bw.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.android.m4b.maps.az:
//            g

public final class h
    implements d
{
    public static interface a
    {

        public abstract void b();
    }


    public static final g b = new g(ae.e());
    public final Set a = new CopyOnWriteArraySet();
    private final j c;
    private final com.google.android.m4b.maps.bq.j.a d;
    private final e e;
    private int f;
    private final Set g = new HashSet();

    public h()
    {
        if (l.a(ah.n))
        {
            c = l.b(ah.n);
            e = new e(100);
            d = new com.google.android.m4b.maps.bq.j.a() {

                private h a;

                public final void a()
                {
                    a.a();
                }

                public final void a(aa aa1)
                {
                    if (aa1 != null)
                    {
                        a.a(aa1.a(), 0, aa1);
                    }
                }

            
            {
                a = h.this;
                super();
            }
            };
            c.a(d);
        } else
        {
            c = null;
            e = null;
            d = null;
            if (ab.a("IndoorOutlineFetcher", 3))
            {
                Log.d("IndoorOutlineFetcher", "No indoor tile store registered, doing nothing.");
                return;
            }
        }
    }

    private static g a(ap ap1)
    {
        g.a a1 = new g.a();
        ap1 = ap1.l();
        do
        {
            if (!ap1.hasNext())
            {
                break;
            }
            Object obj = (bb)ap1.next();
            if (obj instanceof au)
            {
                obj = (au)obj;
                if (((au) (obj)).h())
                {
                    obj = ((au) (obj)).b;
                    a1.a.add(obj);
                }
            }
        } while (true);
        return new g(a1.a);
    }

    private void b()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((a)iterator.next()).b()) { }
    }

    private void b(ac ac)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = g.contains(ac);
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        g.add(ac);
        c.a(ac, this);
        if (true) goto _L1; else goto _L3
_L3:
        ac;
        throw ac;
    }

    public final g a(ac ac)
    {
        this;
        JVM INSTR monitorenter ;
        g g1 = (g)e.c(ac);
        if (g1 == null) goto _L2; else goto _L1
_L1:
        ac = g1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ac;
_L2:
        b(ac);
        f = f + 1;
        ac = null;
        if (true) goto _L4; else goto _L3
_L3:
        ac;
        throw ac;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        e.a(0);
        g.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(ac ac, int i, aa aa)
    {
        Object obj;
        Object obj1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag3 = false;
        flag2 = true;
        obj1 = null;
        if (ab.a("IndoorOutlineFetcher", 3))
        {
            String s = String.valueOf(ac);
            Log.d("IndoorOutlineFetcher", (new StringBuilder(String.valueOf(s).length() + 23)).append("handleTile ").append(s).append(",").append(i).toString());
        }
        flag = flag3;
        flag1 = flag2;
        obj = obj1;
        i;
        JVM INSTR tableswitch 0 4: default 116
    //                   0 171
    //                   1 127
    //                   2 206
    //                   3 116
    //                   4 171;
           goto _L1 _L2 _L3 _L4 _L1 _L2
_L1:
        flag1 = false;
        obj = obj1;
        flag = flag3;
_L3:
        if (!flag) goto _L6; else goto _L5
_L5:
        this;
        JVM INSTR monitorenter ;
        e.b(ac, obj);
        this;
        JVM INSTR monitorexit ;
_L6:
        if (!flag1) goto _L8; else goto _L7
_L7:
        b();
        this;
        JVM INSTR monitorenter ;
        g.remove(ac);
        this;
        JVM INSTR monitorexit ;
_L8:
        return;
_L2:
        if (aa instanceof ap)
        {
            aa = a((ap)aa);
        } else
        {
            aa = b;
        }
        flag = true;
        flag1 = flag2;
        obj = aa;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = b;
        flag = true;
        flag1 = flag2;
        if (true) goto _L3; else goto _L9
_L9:
        ac;
        this;
        JVM INSTR monitorexit ;
        throw ac;
        ac;
        this;
        JVM INSTR monitorexit ;
        throw ac;
    }

}

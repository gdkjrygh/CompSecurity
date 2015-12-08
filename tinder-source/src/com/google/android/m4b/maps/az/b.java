// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.az;

import android.util.Log;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.ak.a;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bd.d;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ak;
import com.google.android.m4b.maps.bo.ap;
import com.google.android.m4b.maps.bo.au;
import com.google.android.m4b.maps.bo.ay;
import com.google.android.m4b.maps.bo.bb;
import com.google.android.m4b.maps.bo.bh;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bq.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.az:
//            a

public final class com.google.android.m4b.maps.az.b
    implements com.google.android.m4b.maps.bd.b, d
{
    static final class a
    {

        final com.google.android.m4b.maps.ak.a.c a;
        final ay b = new ay();
        g c;

        public a(au au1)
        {
            a = com.google.android.m4b.maps.ak.a.c.b(au1.a.toString());
            au1.b.a(b);
        }
    }

    public static interface b
    {

        public abstract void a(com.google.android.m4b.maps.az.b b1, Collection collection);
    }


    final j a;
    final ac b;
    volatile b c;
    private final com.google.android.m4b.maps.bq.d d;
    private final Map e = Collections.synchronizedMap(ax.b());
    private final Collection f = Collections.synchronizedList(new ArrayList());
    private volatile boolean g;

    public com.google.android.m4b.maps.az.b(j j, com.google.android.m4b.maps.bq.d d1, ac ac)
    {
        a = j;
        d = d1;
        b = ac;
    }

    private static Collection a(ap ap1)
    {
        ArrayList arraylist = new ArrayList();
        ap1 = ap1.l();
        do
        {
            if (!ap1.hasNext())
            {
                break;
            }
            Object obj = (bb)ap1.next();
            if (((bb) (obj)).a() == 3)
            {
                obj = (au)obj;
                if (com.google.android.m4b.maps.bo.d.a(((au) (obj)).h, 8))
                {
                    com.google.android.m4b.maps.ak.a a1 = ((au) (obj)).a;
                    if (a1 != null && a1 != com.google.android.m4b.maps.ak.a.a)
                    {
                        arraylist.add(obj);
                    }
                }
            }
        } while (true);
        return arraylist;
    }

    private void a()
    {
        if (c == null)
        {
            return;
        }
        if (g)
        {
            c.a(this, null);
            return;
        } else
        {
            c.a(this, f);
            return;
        }
    }

    public final void a(com.google.android.m4b.maps.ak.a.c c1, int i, bh bh1)
    {
        boolean flag;
        synchronized (e)
        {
            c1 = (a)e.remove(c1);
            flag = e.isEmpty();
        }
        if (c1 == null)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_48;
        c1;
        map;
        JVM INSTR monitorexit ;
        throw c1;
        if (bh1 != null)
        {
            c1.c = bh1.d;
            f.add(new com.google.android.m4b.maps.az.a(((a) (c1)).a, ((a) (c1)).b, ((a) (c1)).c, new String[0]));
        }
        if (i == 1)
        {
            g = true;
        }
        if (flag)
        {
            a();
        }
        return;
    }

    public final void a(ac ac, int i, aa aa)
    {
        if (i != 3) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (i != 2) goto _L4; else goto _L3
_L3:
        if (ab.a("BuildingBoundFetcher", 3))
        {
            String s = String.valueOf(ac);
            Log.d("BuildingBoundFetcher", (new StringBuilder(String.valueOf(s).length() + 15)).append("Tile not found ").append(s).toString());
        }
_L6:
        Object obj;
        obj = null;
        if (aa != null)
        {
            aa = a((ap)aa);
            obj = aa;
            if (ab.a("BuildingBoundFetcher", 3))
            {
                ac = String.valueOf(ac);
                i = aa.size();
                Log.d("BuildingBoundFetcher", (new StringBuilder(String.valueOf(ac).length() + 35)).append("Tile ").append(ac).append(" has ").append(i).append(" indoor areas ").toString());
                obj = aa;
            }
        }
        if (obj == null || ((Collection) (obj)).size() == 0)
        {
            a();
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (i == 1)
        {
            if (ab.a("BuildingBoundFetcher", 3))
            {
                obj = String.valueOf(ac);
                Log.d("BuildingBoundFetcher", (new StringBuilder(String.valueOf(obj).length() + 13)).append("IO error for ").append(((String) (obj))).toString());
            }
            g = true;
        }
        if (true) goto _L6; else goto _L5
_L5:
        for (ac = ((Collection) (obj)).iterator(); ac.hasNext(); e.put(((a) (aa)).a, aa))
        {
            aa = new a((au)ac.next());
        }

        ac = com.google.android.m4b.maps.aa.f.a(e.values()).iterator();
        while (ac.hasNext()) 
        {
            aa = (a)ac.next();
            d.a(((a) (aa)).a, this);
        }
        if (true) goto _L1; else goto _L7
_L7:
    }
}

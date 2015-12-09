// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.a;
import com.google.b.e;
import com.google.b.m;
import com.google.b.o;
import com.google.b.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.b.e:
//            q, h, j, z, 
//            x, s

public final class p extends com.google.b.e.q
{

    private final x a[];

    public p(Map map)
    {
        ArrayList arraylist;
        if (map == null)
        {
            map = null;
        } else
        {
            map = (Collection)map.get(e.c);
        }
        arraylist = new ArrayList();
        if (map == null) goto _L2; else goto _L1
_L1:
        if (!map.contains(a.h)) goto _L4; else goto _L3
_L3:
        arraylist.add(new h());
_L6:
        if (map.contains(a.g))
        {
            arraylist.add(new j());
        }
        if (map.contains(a.p))
        {
            arraylist.add(new z());
        }
_L2:
        if (arraylist.isEmpty())
        {
            arraylist.add(new h());
            arraylist.add(new j());
            arraylist.add(new z());
        }
        a = (x[])arraylist.toArray(new x[arraylist.size()]);
        return;
_L4:
        if (map.contains(a.o))
        {
            arraylist.add(new s());
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public q a(int i, com.google.b.b.a a1, Map map)
    {
        int ai[];
        x ax[];
        int k;
        int l;
        ai = com.google.b.e.x.a(a1);
        ax = a;
        l = ax.length;
        k = 0;
_L2:
        Object obj;
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ax[k];
        obj = ((x) (obj)).a(i, a1, ai, map);
        if (((q) (obj)).d() == a.h && ((q) (obj)).a().charAt(0) == '0')
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (map == null)
        {
            a1 = null;
        } else
        {
            a1 = (Collection)map.get(e.c);
        }
        if (a1 == null || a1.contains(a.o))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (i != 0 && k != 0)
        {
            a1 = new q(((q) (obj)).a().substring(1), ((q) (obj)).b(), ((q) (obj)).c(), a.o);
            a1.a(((q) (obj)).e());
            return a1;
        } else
        {
            return ((q) (obj));
        }
        com.google.b.p p1;
        p1;
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        throw m.a();
    }

    public void a()
    {
        x ax[] = a;
        int k = ax.length;
        for (int i = 0; i < k; i++)
        {
            ax[i].a();
        }

    }
}

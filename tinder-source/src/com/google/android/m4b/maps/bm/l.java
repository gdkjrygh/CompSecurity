// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bm;

import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.aa.bo;
import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.bo.ak;
import com.google.android.m4b.maps.bo.g;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class l
{
    static final class a
    {

        final LinkedList a = new LinkedList();

        public final g a()
        {
            return (g)a.getFirst();
        }

        public final boolean a(a a1)
        {
            if (((g)a1.a.getLast()).equals(a.getFirst()))
            {
                a.removeFirst();
                a.addAll(0, a1.a);
                return true;
            }
            if (((g)a1.a.getFirst()).equals(a.getLast()))
            {
                a.removeLast();
                a.addAll(a1.a);
                return true;
            } else
            {
                return false;
            }
        }

        public final g b()
        {
            return (g)a.getLast();
        }

        public a(g g1, g g2)
        {
            a.add(g1);
            a.add(g2);
        }
    }


    public static List a(ak ak1, byte abyte0[])
    {
        java.util.HashMap hashmap = ax.b();
        for (int i = 0; i < ak1.a(); i++)
        {
            g g1 = new g();
            g g2 = new g();
            g g3 = new g();
            ak1.a(i, g1, g2, g3);
            if ((abyte0[i] & 1) != 0)
            {
                a(((Map) (hashmap)), g1, g2);
            }
            if ((abyte0[i] & 2) != 0)
            {
                a(((Map) (hashmap)), g2, g3);
            }
            if ((abyte0[i] & 4) != 0)
            {
                a(((Map) (hashmap)), g3, g1);
            }
        }

        abyte0 = bo.a(hashmap.values());
        ak1 = f.b(abyte0.size());
        com.google.android.m4b.maps.bo.k.a a1;
        for (abyte0 = abyte0.iterator(); abyte0.hasNext(); ak1.add(a1.a()))
        {
            Object obj = (a)abyte0.next();
            a1 = new com.google.android.m4b.maps.bo.k.a(((a) (obj)).a.size());
            for (obj = ((a) (obj)).a.iterator(); ((Iterator) (obj)).hasNext(); a1.a((g)((Iterator) (obj)).next())) { }
        }

        return ak1;
    }

    private static void a(Map map, g g1, g g2)
    {
        a a1 = new a(g1, g2);
        g1 = (a)map.get(g1);
        g2 = (a)map.get(g2);
        if (g1 != null && a1.a(g1))
        {
            map.remove(g1.a());
            map.remove(g1.b());
        }
        if (g2 != null && g2 != g1 && a1.a(g2))
        {
            map.remove(g2.a());
            map.remove(g2.b());
        }
        map.put(a1.a(), a1);
        map.put(a1.b(), a1);
    }
}

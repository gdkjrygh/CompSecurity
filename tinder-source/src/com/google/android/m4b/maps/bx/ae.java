// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.m4b.maps.aa.q;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.aq.j;
import com.google.android.m4b.maps.ax.h;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bf.c;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.bp;
import com.google.android.m4b.maps.bo.bq;
import com.google.android.m4b.maps.bo.br;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.m;
import com.google.android.m4b.maps.cc.f;
import com.google.android.m4b.maps.cg.t;
import com.google.android.m4b.maps.cq.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            l

public final class ae extends l
{

    private static final Comparator a = com.google.android.m4b.maps.aa.q.b().a(new com.google.android.m4b.maps.y.f() {

        public final Object a(Object obj)
        {
            return ((com.google.android.m4b.maps.cc.q)obj).b();
        }

    }).a();
    private final int b;
    private final int q = 31 - Integer.numberOfLeadingZeros(256);

    ae(ah ah, c c, h h, int i, int k, r.a a1, Resources resources, 
            com.google.android.m4b.maps.bw.g g1)
    {
        super(ah, c, h, i, k, 4, a1, 384, false, true, false, false, false, false, g1);
        a(new br(new a(e.h)));
        b = (int)TypedValue.applyDimension(1, 10F, resources.getDisplayMetrics());
    }

    public final List a(g g1, b b1, j j1)
    {
        ArrayList arraylist = new ArrayList();
        HashSet hashset = new HashSet();
        m m1 = m.a(g1, (int)((float)b * b1.g()));
        Object obj = super.g;
        ArrayList arraylist1 = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            com.google.android.m4b.maps.cc.q q1 = (com.google.android.m4b.maps.cc.q)((Iterator) (obj)).next();
            if ((q1 instanceof f) && q1.b().d().a(m1))
            {
                arraylist1.add((f)q1);
            }
        } while (true);
        Collections.sort(arraylist1, a);
        int i = 0;
        do
        {
            if (i >= b)
            {
                break;
            }
            int k1 = (int)b1.g();
            m m2 = m.a(g1, i * k1);
            for (Iterator iterator1 = arraylist1.iterator(); iterator1.hasNext();)
            {
                Iterator iterator2 = ((f)iterator1.next()).b.iterator();
                while (iterator2.hasNext()) 
                {
                    Object obj1 = (bp)iterator2.next();
                    if (!((bp) (obj1)).a.isEmpty())
                    {
                        obj1 = ((bp) (obj1)).a.iterator();
                        while (((Iterator) (obj1)).hasNext()) 
                        {
                            bq bq1 = (bq)((Iterator) (obj1)).next();
                            if (bq1.c != null && bq1.c.a(m2) && !hashset.contains(bq1.a))
                            {
                                arraylist.add(new t(j1.b, bq1.a, com.google.android.m4b.maps.aq.b.a(bq1.b)));
                                hashset.add(bq1.a);
                            }
                        }
                    }
                }
            }

            for (Iterator iterator = arraylist1.iterator(); iterator.hasNext();)
            {
                f f1 = (f)iterator.next();
                int k = -i;
                while (k <= i) 
                {
label0:
                    for (int i1 = -i; i1 <= i; i1++)
                    {
                        if (Math.abs(k) != i && Math.abs(i1) != i)
                        {
                            continue;
                        }
                        g g2 = new g(g1.a + k1 * k, g1.b + k1 * i1);
                        Iterator iterator3 = f1.b.iterator();
label1:
                        do
                        {
                            Object obj2;
                            ac ac1;
                            do
                            {
                                if (!iterator3.hasNext())
                                {
                                    continue label0;
                                }
                                obj2 = ((bp)iterator3.next()).a();
                                ac1 = f1.a;
                            } while (obj2 == null || !ac1.d().a(g2));
                            try
                            {
                                int l1 = q;
                                int i2 = g2.a;
                                int j2 = ac1.e;
                                int k2 = ac1.a;
                                int l2 = q;
                                obj2 = ((com.google.android.m4b.maps.bw.b) (obj2)).a(i2 - j2 >> 30 - k2 - l1, ac1.c().b - g2.b >> 30 - ac1.a - l2).iterator();
                                do
                                {
                                    String s;
                                    do
                                    {
                                        if (!((Iterator) (obj2)).hasNext())
                                        {
                                            continue label1;
                                        }
                                        s = (String)((Iterator) (obj2)).next();
                                    } while (hashset.contains(s));
                                    arraylist.add(new t(j1.b, s, com.google.android.m4b.maps.aq.b.a(g2)));
                                    hashset.add(s);
                                } while (true);
                            }
                            catch (com.google.android.m4b.maps.bw.b.a a1)
                            {
                                if (ab.a("FeatureMapTileOverlay", 6))
                                {
                                    Log.e("FeatureMapTileOverlay", a1.getMessage());
                                }
                            }
                        } while (true);
                    }

                    k++;
                }
            }

            i++;
        } while (true);
        return arraylist;
    }

}

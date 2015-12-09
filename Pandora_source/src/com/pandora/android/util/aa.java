// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import com.pandora.radio.data.StationRecommendation;
import com.pandora.radio.util.i;
import com.pandora.radio.util.k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p.cw.c;
import p.df.a;

// Referenced classes of package com.pandora.android.util:
//            s

public class aa
{
    protected static class a
    {

        public boolean a;
        public boolean b;
        public boolean c;
        public int d;

        public a(int j)
        {
            d = j;
        }
    }


    protected final Map a = new HashMap();
    protected String b;
    protected final com.pandora.radio.util.k.j c;
    protected boolean d;

    public aa(com.pandora.radio.util.k.j j)
    {
        a();
        c = j;
    }

    protected void a()
    {
        UUID uuid = UUID.randomUUID();
        b = (new StringBuilder()).append(Long.toHexString(uuid.getMostSignificantBits())).append(Long.toHexString(uuid.getLeastSignificantBits())).toString().toUpperCase();
    }

    public transient void a(int j, StationRecommendation astationrecommendation[])
    {
        int l = 0;
        for (int i1 = 0; l + i1 < astationrecommendation.length; l++)
        {
            for (; l + i1 < astationrecommendation.length && (astationrecommendation[l + i1].j() == com.pandora.radio.data.StationRecommendations.b.e || astationrecommendation[l + i1].j() == com.pandora.radio.data.StationRecommendations.b.f); i1++) { }
            if (l + i1 < astationrecommendation.length)
            {
                a(astationrecommendation[l + i1], l + j);
            }
        }

    }

    public void a(StationRecommendation stationrecommendation)
    {
        if (d)
        {
            a a1 = (a)a.get(stationrecommendation.n());
            a1.a = true;
            a.put(stationrecommendation.n(), a1);
        }
    }

    public void a(StationRecommendation stationrecommendation, int j)
    {
        if (!a.containsKey(stationrecommendation.n()))
        {
            a a1 = new a(j);
            a.put(stationrecommendation.n(), a1);
        } else
        {
            ((a)a.get(stationrecommendation.n())).d = j;
        }
        d = true;
    }

    public void a(c c1)
    {
        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            a a1 = (a)a.get(s1);
            c1.o().a(b, c, s1, a1.d, a1.a, a1.b, a1.c);
            a1.a = false;
            a1.b = false;
            a1.c = false;
        }

        a.clear();
        c1 = b;
        a();
        d = false;
        p.df.a.a("StationRecommendationStats", (new StringBuilder()).append("Stats flushed ").append(c1).toString());
    }

    public transient void a(StationRecommendation astationrecommendation[])
    {
        a(0, astationrecommendation);
    }

    public void b(StationRecommendation stationrecommendation)
    {
        if (!d)
        {
            if (!i.e())
            {
                throw new IllegalStateException("clicked() called while stats not visible");
            }
        } else
        if (!com.pandora.android.util.s.a(stationrecommendation.n()))
        {
            a a1 = (a)a.get(stationrecommendation.n());
            a1.a = true;
            a1.b = true;
            a.put(stationrecommendation.n(), a1);
        }
    }

    public void c(StationRecommendation stationrecommendation)
    {
        if (!d)
        {
            throw new IllegalStateException("dismissed() called while stats not visible");
        }
        if (!com.pandora.android.util.s.a(stationrecommendation.n()))
        {
            a a1 = (a)a.get(stationrecommendation.n());
            a1.a = true;
            a1.c = true;
            a.put(stationrecommendation.n(), a1);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.jirbo.adcolony:
//            ab, d, ADCStorage, l, 
//            a, b, f, k, 
//            q, ADCDownload

class o
    implements ADCDownload.Listener
{

    d a;
    ArrayList b;
    HashMap c;
    int d;
    ab.b e;
    int f;
    ArrayList g;
    boolean h;
    boolean i;
    double j;

    o(d d1)
    {
        b = new ArrayList();
        c = new HashMap();
        d = 1;
        e = new ab.b(2D);
        g = new ArrayList();
        a = d1;
    }

    String a(String s, int i1)
    {
        int j1 = s.lastIndexOf('.');
        if (j1 == -1)
        {
            return String.valueOf(i1);
        }
        String s1 = s.substring(j1);
        s = s1;
        if (s1.contains("/"))
        {
            s = ".0";
        }
        return (new StringBuilder()).append(i1).append(s).toString();
    }

    void a()
    {
        b();
        h = true;
    }

    void a(String s, String s1)
    {
        if (s != null && !s.equals("")) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s2;
        a a1;
        s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        a1 = (a)c.get(s);
        if (a1 == null) goto _L4; else goto _L3
_L3:
        a1.h = ab.c();
        s1 = a1;
        if (!a1.c.equals(s2))
        {
            break MISSING_BLOCK_LABEL_83;
        }
        if (a1.e || a1.d) goto _L1; else goto _L5
_L5:
        s1 = a1;
_L7:
        if (((a) (s1)).f == 0)
        {
            int i1 = h();
            String s3 = a(s, i1);
            s3 = (new StringBuilder()).append(a.f.c).append(s3).toString();
            s1.f = i1;
            s1.b = s3;
        }
        s1.c = s2;
        s1.d = true;
        s1.e = false;
        l.a.a("Adding ").a(s).b(" to pending downloads.");
        g.add(s);
        i = true;
        e.a(2D);
        com.jirbo.adcolony.a.r = true;
        return;
_L4:
        s1 = new a();
        s1.a = s;
        b.add(s1);
        s1.h = ab.c();
        c.put(s, s1);
        if (true) goto _L7; else goto _L6
_L6:
    }

    boolean a(String s)
    {
        if (s == null || s.equals(""))
        {
            return false;
        }
        s = (a)c.get(s);
        if (s == null)
        {
            a.b.j.a();
            return false;
        }
        if (((a) (s)).e)
        {
            if (((a) (s)).d)
            {
                return false;
            } else
            {
                s.h = ab.c();
                return true;
            }
        }
        if (!((a) (s)).d)
        {
            a.b.j.a();
        }
        return false;
    }

    String b(String s)
    {
        s = (a)c.get(s);
        if (s == null || ((a) (s)).b == null)
        {
            return "(file not found)";
        } else
        {
            s.h = ab.c();
            i = true;
            e.a(2D);
            return ((a) (s)).b;
        }
    }

    void b()
    {
        l.a.b("Loading media info");
        Object obj = k.b(new f("media_info.txt"));
        if (obj == null)
        {
            obj = new ADCData.g();
            l.a.b("No saved media info exists.");
        } else
        {
            l.a.b("Loaded media info");
        }
        d = ((ADCData.g) (obj)).g("next_file_number");
        if (d <= 0)
        {
            d = 1;
        }
        obj = ((ADCData.g) (obj)).c("assets");
        if (obj != null)
        {
            b.clear();
            for (int i1 = 0; i1 < ((ADCData.c) (obj)).i(); i1++)
            {
                ADCData.g g1 = ((ADCData.c) (obj)).b(i1);
                a a1 = new a();
                a1.a = g1.e("url");
                a1.b = g1.e("filepath");
                a1.c = g1.e("last_modified");
                a1.f = g1.g("file_number");
                a1.g = g1.g("size");
                a1.e = g1.h("ready");
                a1.h = g1.f("last_accessed");
                if (a1.f > d)
                {
                    d = a1.f + 1;
                }
                b.add(a1);
            }

        }
        c();
    }

    void c()
    {
        HashMap hashmap = new HashMap();
        String s = a.f.c;
        String as[] = (new File(s)).list();
        if (as == null)
        {
            as = new String[0];
        }
        int i2 = as.length;
        for (int i1 = 0; i1 < i2; i1++)
        {
            String s2 = as[i1];
            s2 = (new StringBuilder()).append(s).append(s2).toString();
            hashmap.put(s2, s2);
        }

        HashMap hashmap1 = new HashMap();
        j = 0.0D;
        ArrayList arraylist = new ArrayList();
        for (int j1 = 0; j1 < b.size(); j1++)
        {
            a a2 = (a)b.get(j1);
            if (a2.d || !a2.e)
            {
                continue;
            }
            String s3 = a2.b;
            if (hashmap.containsKey(s3) && (new File(s3)).length() == (long)a2.g)
            {
                j = j + (double)a2.g;
                arraylist.add(a2);
                hashmap1.put(s3, s3);
            }
        }

        b = arraylist;
        i2 = as.length;
        for (int k1 = 0; k1 < i2; k1++)
        {
            String s1 = as[k1];
            s1 = (new StringBuilder()).append(s).append(s1).toString();
            if (!hashmap1.containsKey(s1))
            {
                l.b.a("Deleting unused media ").b(s1);
                (new File(s1)).delete();
            }
        }

        c.clear();
        for (int l1 = 0; l1 < b.size(); l1++)
        {
            a a1 = (a)b.get(l1);
            c.put(a1.a, a1);
        }

        double d1 = a.b.j.g;
        if (d1 > 0.0D)
        {
            l.b.a("Media pool at ").a(j / 1048576D).a("/").a(d1 / 1048576D).b(" MB");
        }
    }

    void d()
    {
        l.a.b("Saving media info");
        ADCData.c c1 = new ADCData.c();
        for (int i1 = 0; i1 < b.size(); i1++)
        {
            a a1 = (a)b.get(i1);
            if (a1.e && !a1.d)
            {
                ADCData.g g2 = new ADCData.g();
                g2.b("url", a1.a);
                g2.b("filepath", a1.b);
                g2.b("last_modified", a1.c);
                g2.b("file_number", a1.f);
                g2.b("size", a1.g);
                g2.b("ready", a1.e);
                g2.b("last_accessed", a1.h);
                c1.a(g2);
            }
        }

        ADCData.g g1 = new ADCData.g();
        g1.b("next_file_number", d);
        g1.a("assets", c1);
        k.a(new f("media_info.txt"), g1);
        i = false;
    }

    void e()
    {
        f();
        if (i && e.a())
        {
            g();
            d();
        }
    }

    void f()
    {
        if (a.b.j.j.equals("wifi") && !q.a())
        {
            l.a.b("Skipping asset download due to CACHE_FILTER_WIFI");
        } else
        {
            if (a.b.j.j.equals("cell") && !q.b())
            {
                l.a.b("Skipping asset download due to CACHE_FILTER_CELL.");
                return;
            }
            while (f < 3 && g.size() > 0) 
            {
                String s = (String)g.remove(0);
                a a1 = (a)c.get(s);
                if (a1 != null && (s == null || s.equals("")))
                {
                    l.d.b("[ADC ERROR] - NULL URL");
                    (new RuntimeException()).printStackTrace();
                }
                if (a1 != null && s != null && !s.equals(""))
                {
                    com.jirbo.adcolony.a.r = true;
                    f = f + 1;
                    (new ADCDownload(a, s, this, a1.b)).a(a1).b();
                }
            }
        }
    }

    void g()
    {
        double d1 = a.b.j.g;
        if (d1 != 0.0D) goto _L2; else goto _L1
_L1:
        return;
_L7:
        a a1;
        l.b.a("Deleting ").b(a1.b);
        a1.e = false;
        (new File(a1.b)).delete();
        a1.b = null;
        j = j - (double)a1.g;
        l.b.a("Media pool now at ").a(j / 1048576D).a("/").a(d1 / 1048576D).b(" MB");
        i = true;
        e.a(2D);
_L2:
        if (j <= a.b.j.g) goto _L1; else goto _L3
_L3:
        int i1;
        i1 = 0;
        a1 = null;
_L5:
        a a2;
        if (i1 >= b.size())
        {
            continue; /* Loop/switch isn't completed */
        }
        a a3 = (a)b.get(i1);
        if (!a3.e)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        a2 = a3;
        if (a1 != null)
        {
            if (a3.h >= a1.h)
            {
                break MISSING_BLOCK_LABEL_241;
            }
            a2 = a3;
        }
_L8:
        i1++;
        a1 = a2;
        if (true) goto _L5; else goto _L4
_L4:
        if (a1 != null && a1.b != null) goto _L7; else goto _L6
_L6:
        return;
        a2 = a1;
          goto _L8
    }

    int h()
    {
        i = true;
        e.a(2D);
        int i1 = d;
        d = i1 + 1;
        return i1;
    }

    public void on_download_finished(ADCDownload adcdownload)
    {
        a a1 = (a)adcdownload.e;
        f = f - 1;
        i = true;
        e.a(2D);
        a1.e = adcdownload.i;
        a1.d = false;
        if (adcdownload.i)
        {
            a1.g = adcdownload.m;
            j = j + (double)a1.g;
            l.a.a("Downloaded ").b(a1.a);
        }
        com.jirbo.adcolony.a.h();
        f();
    }

    private class a
    {

        String a;
        String b;
        String c;
        boolean d;
        boolean e;
        int f;
        int g;
        double h;

        a()
        {
        }
    }

}

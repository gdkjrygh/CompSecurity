// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            y, aq, p, aa

public class com.google.android.gms.analytics.d
{
    public static class a extends d
    {

        public volatile Map a()
        {
            return super.a();
        }

        public a()
        {
            y.a().a(y.a.ak);
            a("&t", "screenview");
        }
    }

    public static class b extends d
    {

        public b a(long l)
        {
            a("&ev", Long.toString(l));
            return this;
        }

        public b a(String s)
        {
            a("&ec", s);
            return this;
        }

        public volatile Map a()
        {
            return super.a();
        }

        public b b(String s)
        {
            a("&ea", s);
            return this;
        }

        public b c(String s)
        {
            a("&el", s);
            return this;
        }

        public b()
        {
            y.a().a(y.a.Y);
            a("&t", "event");
        }

        public b(String s, String s1)
        {
            this();
            a(s);
            b(s1);
        }
    }

    public static class c extends d
    {

        public c a(String s)
        {
            a("&exd", s);
            return this;
        }

        public c a(boolean flag)
        {
            a("&exf", aa.a(flag));
            return this;
        }

        public volatile Map a()
        {
            return super.a();
        }

        public c()
        {
            y.a().a(y.a.H);
            a("&t", "exception");
        }
    }

    protected static class d
    {

        com.google.android.gms.analytics.a.b a;
        Map b;
        List c;
        List d;
        private Map e;

        public d a(int j, float f1)
        {
            a(aq.b(j), Float.toString(f1));
            return this;
        }

        public d a(int j, String s)
        {
            a(aq.a(j), s);
            return this;
        }

        public d a(com.google.android.gms.analytics.a.a a1)
        {
            if (a1 == null)
            {
                p.d("product should be non-null");
                return this;
            } else
            {
                d.add(a1);
                return this;
            }
        }

        public d a(com.google.android.gms.analytics.a.a a1, String s)
        {
            if (a1 == null)
            {
                p.d("product should be non-null");
                return this;
            }
            String s1 = s;
            if (s == null)
            {
                s1 = "";
            }
            if (!b.containsKey(s1))
            {
                b.put(s1, new ArrayList());
            }
            ((List)b.get(s1)).add(a1);
            return this;
        }

        public d a(com.google.android.gms.analytics.a.b b1)
        {
            a = b1;
            return this;
        }

        public d a(com.google.android.gms.analytics.a.c c1)
        {
            if (c1 == null)
            {
                p.d("promotion should be non-null");
                return this;
            } else
            {
                c.add(c1);
                return this;
            }
        }

        public final d a(String s, String s1)
        {
            y.a().a(y.a.a);
            if (s != null)
            {
                e.put(s, s1);
                return this;
            } else
            {
                p.d(" HitBuilder.set() called with a null paramName.");
                return this;
            }
        }

        public final d a(Map map)
        {
            y.a().a(y.a.b);
            if (map == null)
            {
                return this;
            } else
            {
                e.putAll(new HashMap(map));
                return this;
            }
        }

        public Map a()
        {
            HashMap hashmap = new HashMap(e);
            if (a != null)
            {
                hashmap.putAll(a.a());
            }
            Iterator iterator = c.iterator();
            for (int j = 1; iterator.hasNext(); j++)
            {
                hashmap.putAll(((com.google.android.gms.analytics.a.c)iterator.next()).e(aq.d(j)));
            }

            iterator = d.iterator();
            for (int k = 1; iterator.hasNext(); k++)
            {
                hashmap.putAll(((com.google.android.gms.analytics.a.a)iterator.next()).g(aq.c(k)));
            }

            iterator = b.entrySet().iterator();
            for (int l = 1; iterator.hasNext(); l++)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                Object obj = (List)entry.getValue();
                String s = aq.f(l);
                obj = ((List) (obj)).iterator();
                for (int i1 = 1; ((Iterator) (obj)).hasNext(); i1++)
                {
                    hashmap.putAll(((com.google.android.gms.analytics.a.a)((Iterator) (obj)).next()).g((new StringBuilder()).append(s).append(aq.e(i1)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s).append("nm").toString(), entry.getKey());
                }
            }

            return hashmap;
        }

        public d b()
        {
            a("&sc", "start");
            return this;
        }

        public d b(boolean flag)
        {
            a("&ni", aa.a(flag));
            return this;
        }

        public d d(String s)
        {
            y.a().a(y.a.d);
            s = aa.b(s);
            if (TextUtils.isEmpty(s))
            {
                return this;
            } else
            {
                s = aa.a(s);
                a("&cc", (String)s.get("utm_content"));
                a("&cm", (String)s.get("utm_medium"));
                a("&cn", (String)s.get("utm_campaign"));
                a("&cs", (String)s.get("utm_source"));
                a("&ck", (String)s.get("utm_term"));
                a("&ci", (String)s.get("utm_id"));
                a("&gclid", (String)s.get("gclid"));
                a("&dclid", (String)s.get("dclid"));
                a("&gmob_t", (String)s.get("gmob_t"));
                return this;
            }
        }

        public d e(String s)
        {
            e.put("&promoa", s);
            return this;
        }

        protected d f(String s)
        {
            a("&t", s);
            return this;
        }

        protected String g(String s)
        {
            return (String)e.get(s);
        }

        protected d()
        {
            e = new HashMap();
            b = new HashMap();
            c = new ArrayList();
            d = new ArrayList();
        }
    }

    public static class e extends d
    {

        public e a(double d1)
        {
            a("&ip", Double.toString(d1));
            return this;
        }

        public e a(long l)
        {
            a("&iq", Long.toString(l));
            return this;
        }

        public e a(String s)
        {
            a("&ti", s);
            return this;
        }

        public volatile Map a()
        {
            return super.a();
        }

        public e b(String s)
        {
            a("&in", s);
            return this;
        }

        public e c(String s)
        {
            a("&ic", s);
            return this;
        }

        public e h(String s)
        {
            a("&iv", s);
            return this;
        }

        public e i(String s)
        {
            a("&cu", s);
            return this;
        }

        public e()
        {
            y.a().a(y.a.Z);
            a("&t", "item");
        }
    }

    public static class f extends d
    {

        public volatile Map a()
        {
            return super.a();
        }

        public f()
        {
            y.a().a(y.a.ak);
            a("&t", "screenview");
        }
    }

    public static class g extends d
    {

        public g a(String s)
        {
            a("&sn", s);
            return this;
        }

        public volatile Map a()
        {
            return super.a();
        }

        public g b(String s)
        {
            a("&sa", s);
            return this;
        }

        public g c(String s)
        {
            a("&st", s);
            return this;
        }

        public g()
        {
            y.a().a(y.a.K);
            a("&t", "social");
        }
    }

    public static class h extends d
    {

        public h a(long l)
        {
            a("&utt", Long.toString(l));
            return this;
        }

        public h a(String s)
        {
            a("&utv", s);
            return this;
        }

        public volatile Map a()
        {
            return super.a();
        }

        public h b(String s)
        {
            a("&utc", s);
            return this;
        }

        public h c(String s)
        {
            a("&utl", s);
            return this;
        }

        public h()
        {
            y.a().a(y.a.J);
            a("&t", "timing");
        }

        public h(String s, String s1, long l)
        {
            this();
            a(s1);
            a(l);
            b(s);
        }
    }

    public static class i extends d
    {

        public i a(double d1)
        {
            a("&tr", Double.toString(d1));
            return this;
        }

        public i a(String s)
        {
            a("&ti", s);
            return this;
        }

        public volatile Map a()
        {
            return super.a();
        }

        public i b(double d1)
        {
            a("&tt", Double.toString(d1));
            return this;
        }

        public i b(String s)
        {
            a("&ta", s);
            return this;
        }

        public i c(double d1)
        {
            a("&ts", Double.toString(d1));
            return this;
        }

        public i c(String s)
        {
            a("&cu", s);
            return this;
        }

        public i()
        {
            y.a().a(y.a.G);
            a("&t", "transaction");
        }
    }


    public com.google.android.gms.analytics.d()
    {
    }
}

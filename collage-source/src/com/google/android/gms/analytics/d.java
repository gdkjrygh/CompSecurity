// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.f;
import com.google.android.gms.analytics.internal.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            j

public class com.google.android.gms.analytics.d
{
    public static class a extends b
    {

        public a a(String s)
        {
            a("&exd", s);
            return this;
        }

        public a a(boolean flag)
        {
            a("&exf", n.a(flag));
            return this;
        }

        public volatile Map a()
        {
            return super.a();
        }

        public a()
        {
            a("&t", "exception");
        }
    }

    protected static class b
    {

        com.google.android.gms.analytics.a.b a;
        Map b;
        List c;
        List d;
        private Map e;

        public b a(com.google.android.gms.analytics.a.a a1)
        {
            if (a1 == null)
            {
                f.c("product should be non-null");
                return this;
            } else
            {
                d.add(a1);
                return this;
            }
        }

        public b a(com.google.android.gms.analytics.a.a a1, String s)
        {
            if (a1 == null)
            {
                f.c("product should be non-null");
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

        public b a(com.google.android.gms.analytics.a.b b1)
        {
            a = b1;
            return this;
        }

        public b a(com.google.android.gms.analytics.a.c c1)
        {
            if (c1 == null)
            {
                f.c("promotion should be non-null");
                return this;
            } else
            {
                c.add(c1);
                return this;
            }
        }

        public final b a(String s, String s1)
        {
            if (s != null)
            {
                e.put(s, s1);
                return this;
            } else
            {
                f.c(" HitBuilder.set() called with a null paramName.");
                return this;
            }
        }

        public final b a(Map map)
        {
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
            for (int i = 1; iterator.hasNext(); i++)
            {
                hashmap.putAll(((com.google.android.gms.analytics.a.c)iterator.next()).e(j.e(i)));
            }

            iterator = d.iterator();
            for (int k = 1; iterator.hasNext(); k++)
            {
                hashmap.putAll(((com.google.android.gms.analytics.a.a)iterator.next()).g(j.c(k)));
            }

            iterator = b.entrySet().iterator();
            for (int l = 1; iterator.hasNext(); l++)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                Object obj = (List)entry.getValue();
                String s = j.h(l);
                obj = ((List) (obj)).iterator();
                for (int i1 = 1; ((Iterator) (obj)).hasNext(); i1++)
                {
                    hashmap.putAll(((com.google.android.gms.analytics.a.a)((Iterator) (obj)).next()).g((new StringBuilder()).append(s).append(j.g(i1)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s).append("nm").toString(), entry.getKey());
                }
            }

            return hashmap;
        }

        protected b()
        {
            e = new HashMap();
            b = new HashMap();
            c = new ArrayList();
            d = new ArrayList();
        }
    }

    public static class c extends b
    {

        public volatile Map a()
        {
            return super.a();
        }

        public c()
        {
            a("&t", "screenview");
        }
    }

    public static class d extends b
    {

        public d a(double d1)
        {
            a("&tr", Double.toString(d1));
            return this;
        }

        public d a(String s)
        {
            a("&ti", s);
            return this;
        }

        public volatile Map a()
        {
            return super.a();
        }

        public d b(String s)
        {
            a("&cu", s);
            return this;
        }

        public d()
        {
            a("&t", "transaction");
        }
    }


    public com.google.android.gms.analytics.d()
    {
    }
}

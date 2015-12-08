// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            j

public final class com.google.android.gms.analytics.d
{
    public static final class a extends d
    {

        public final volatile Map a()
        {
            return super.a();
        }

        public a()
        {
            a("&t", "screenview");
        }
    }

    public static final class b extends d
    {

        public final b a(String s)
        {
            a("&ec", s);
            return this;
        }

        public final volatile Map a()
        {
            return super.a();
        }

        public final b b(String s)
        {
            a("&ea", s);
            return this;
        }

        public final b c(String s)
        {
            a("&el", s);
            return this;
        }

        public b()
        {
            a("&t", "event");
        }
    }

    public static final class c extends d
    {

        public final c a(String s)
        {
            a("&exd", s);
            return this;
        }

        public final c a(boolean flag)
        {
            a("&exf", m.a(flag));
            return this;
        }

        public final volatile Map a()
        {
            return super.a();
        }

        public c()
        {
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

        public final d a(com.google.android.gms.analytics.a.a a1)
        {
            if (a1 == null)
            {
                com.google.android.gms.analytics.internal.f.c("product should be non-null");
                return this;
            } else
            {
                d.add(a1);
                return this;
            }
        }

        public final d a(com.google.android.gms.analytics.a.a a1, String s)
        {
            if (a1 == null)
            {
                com.google.android.gms.analytics.internal.f.c("product should be non-null");
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

        public final d a(com.google.android.gms.analytics.a.b b1)
        {
            a = b1;
            return this;
        }

        public final d a(com.google.android.gms.analytics.a.c c1)
        {
            c.add(c1);
            return this;
        }

        public final d a(String s, String s1)
        {
            e.put(s, s1);
            return this;
        }

        public final d a(Map map)
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

        protected d()
        {
            e = new HashMap();
            b = new HashMap();
            c = new ArrayList();
            d = new ArrayList();
        }
    }

    public static final class e extends d
    {

        public final volatile Map a()
        {
            return super.a();
        }

        public e()
        {
            a("&t", "screenview");
        }
    }

    public static final class f extends d
    {

        public final f a(long l)
        {
            a("&utt", Long.toString(l));
            return this;
        }

        public final f a(String s)
        {
            a("&utv", s);
            return this;
        }

        public final volatile Map a()
        {
            return super.a();
        }

        public final f b(String s)
        {
            a("&utc", s);
            return this;
        }

        public final f c(String s)
        {
            a("&utl", s);
            return this;
        }

        public f()
        {
            a("&t", "timing");
        }
    }

}

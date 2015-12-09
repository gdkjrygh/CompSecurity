// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.a.c;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.n;
import com.google.android.gms.analytics.internal.p;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.analytics.internal.t;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.ia;
import com.google.android.gms.internal.ib;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.ie;
import com.google.android.gms.internal.jk;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.js;
import com.google.android.gms.internal.jt;
import com.google.android.gms.internal.ju;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jw;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.jy;
import com.google.android.gms.internal.jz;
import com.google.android.gms.internal.ka;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            j, c

public class i extends q
    implements jp
{

    private static DecimalFormat a;
    private final t b;
    private final String c;
    private final Uri d;
    private final boolean e;
    private final boolean f;

    public i(t t1, String s1)
    {
        this(t1, s1, true, false);
    }

    public i(t t1, String s1, boolean flag, boolean flag1)
    {
        super(t1);
        z.a(s1);
        b = t1;
        c = s1;
        e = flag;
        f = flag1;
        d = a(c);
    }

    static Uri a(String s1)
    {
        z.a(s1);
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(s1);
        return builder.build();
    }

    static String a(double d1)
    {
        if (a == null)
        {
            a = new DecimalFormat("0.######");
        }
        return a.format(d1);
    }

    private static String a(Object obj)
    {
        if (obj == null)
        {
            obj = null;
        } else
        if (obj instanceof String)
        {
            String s1 = (String)obj;
            obj = s1;
            if (TextUtils.isEmpty(s1))
            {
                return null;
            }
        } else
        {
            if (obj instanceof Double)
            {
                obj = (Double)obj;
                if (((Double) (obj)).doubleValue() != 0.0D)
                {
                    return a(((Double) (obj)).doubleValue());
                } else
                {
                    return null;
                }
            }
            if (obj instanceof Boolean)
            {
                if (obj != Boolean.FALSE)
                {
                    return "1";
                } else
                {
                    return null;
                }
            } else
            {
                return String.valueOf(obj);
            }
        }
        return ((String) (obj));
    }

    private static String a(Map map)
    {
        StringBuilder stringbuilder = new StringBuilder();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); stringbuilder.append((String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
            if (stringbuilder.length() != 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((String)entry.getKey());
            stringbuilder.append("=");
        }

        return stringbuilder.toString();
    }

    private static void a(Map map, String s1, double d1)
    {
        if (d1 != 0.0D)
        {
            map.put(s1, a(d1));
        }
    }

    private static void a(Map map, String s1, int k, int l)
    {
        if (k > 0 && l > 0)
        {
            map.put(s1, (new StringBuilder()).append(k).append("x").append(l).toString());
        }
    }

    private static void a(Map map, String s1, String s2)
    {
        if (!TextUtils.isEmpty(s2))
        {
            map.put(s1, s2);
        }
    }

    private static void a(Map map, String s1, boolean flag)
    {
        if (flag)
        {
            map.put(s1, "1");
        }
    }

    public static Map b(jk jk1)
    {
        HashMap hashmap = new HashMap();
        Object obj = (id)jk1.a(com/google/android/gms/internal/id);
        if (obj != null)
        {
            obj = ((id) (obj)).a().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s1 = a(entry.getValue());
                if (s1 != null)
                {
                    hashmap.put(entry.getKey(), s1);
                }
            } while (true);
        }
        obj = (ie)jk1.a(com/google/android/gms/internal/ie);
        if (obj != null)
        {
            a(hashmap, "t", ((ie) (obj)).a());
            a(hashmap, "cid", ((ie) (obj)).b());
            a(hashmap, "uid", ((ie) (obj)).c());
            a(hashmap, "sc", ((ie) (obj)).f());
            a(hashmap, "sf", ((ie) (obj)).h());
            a(hashmap, "ni", ((ie) (obj)).g());
            a(hashmap, "adid", ((ie) (obj)).d());
            a(hashmap, "ate", ((ie) (obj)).e());
        }
        obj = (jy)jk1.a(com/google/android/gms/internal/jy);
        if (obj != null)
        {
            a(hashmap, "cd", ((jy) (obj)).b());
            a(hashmap, "a", ((jy) (obj)).c());
            a(hashmap, "dr", ((jy) (obj)).f());
        }
        obj = (jw)jk1.a(com/google/android/gms/internal/jw);
        if (obj != null)
        {
            a(hashmap, "ec", ((jw) (obj)).a());
            a(hashmap, "ea", ((jw) (obj)).b());
            a(hashmap, "el", ((jw) (obj)).c());
            a(hashmap, "ev", ((jw) (obj)).d());
        }
        obj = (jt)jk1.a(com/google/android/gms/internal/jt);
        if (obj != null)
        {
            a(hashmap, "cn", ((jt) (obj)).a());
            a(hashmap, "cs", ((jt) (obj)).b());
            a(hashmap, "cm", ((jt) (obj)).c());
            a(hashmap, "ck", ((jt) (obj)).d());
            a(hashmap, "cc", ((jt) (obj)).e());
            a(hashmap, "ci", ((jt) (obj)).f());
            a(hashmap, "anid", ((jt) (obj)).g());
            a(hashmap, "gclid", ((jt) (obj)).h());
            a(hashmap, "dclid", ((jt) (obj)).i());
            a(hashmap, "aclid", ((jt) (obj)).j());
        }
        obj = (jx)jk1.a(com/google/android/gms/internal/jx);
        if (obj != null)
        {
            a(hashmap, "exd", ((jx) (obj)).a());
            a(hashmap, "exf", ((jx) (obj)).b());
        }
        obj = (jz)jk1.a(com/google/android/gms/internal/jz);
        if (obj != null)
        {
            a(hashmap, "sn", ((jz) (obj)).a());
            a(hashmap, "sa", ((jz) (obj)).b());
            a(hashmap, "st", ((jz) (obj)).c());
        }
        obj = (ka)jk1.a(com/google/android/gms/internal/ka);
        if (obj != null)
        {
            a(hashmap, "utv", ((ka) (obj)).a());
            a(hashmap, "utt", ((ka) (obj)).b());
            a(hashmap, "utc", ((ka) (obj)).c());
            a(hashmap, "utl", ((ka) (obj)).d());
        }
        obj = (ia)jk1.a(com/google/android/gms/internal/ia);
        if (obj != null)
        {
            obj = ((ia) (obj)).a().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s2 = com.google.android.gms.analytics.j.a(((Integer)entry1.getKey()).intValue());
                if (!TextUtils.isEmpty(s2))
                {
                    hashmap.put(s2, entry1.getValue());
                }
            } while (true);
        }
        obj = (ib)jk1.a(com/google/android/gms/internal/ib);
        if (obj != null)
        {
            obj = ((ib) (obj)).a().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry2 = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s3 = com.google.android.gms.analytics.j.b(((Integer)entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(s3))
                {
                    hashmap.put(s3, a(((Double)entry2.getValue()).doubleValue()));
                }
            } while (true);
        }
        obj = (jv)jk1.a(com/google/android/gms/internal/jv);
        if (obj != null)
        {
            Object obj1 = ((jv) (obj)).a();
            if (obj1 != null)
            {
                for (obj1 = ((b) (obj1)).a().entrySet().iterator(); ((Iterator) (obj1)).hasNext();)
                {
                    java.util.Map.Entry entry4 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                    if (((String)entry4.getKey()).startsWith("&"))
                    {
                        hashmap.put(((String)entry4.getKey()).substring(1), entry4.getValue());
                    } else
                    {
                        hashmap.put(entry4.getKey(), entry4.getValue());
                    }
                }

            }
            obj1 = ((jv) (obj)).d().iterator();
            for (int k = 1; ((Iterator) (obj1)).hasNext(); k++)
            {
                hashmap.putAll(((c)((Iterator) (obj1)).next()).e(j.f(k)));
            }

            obj1 = ((jv) (obj)).b().iterator();
            for (int l = 1; ((Iterator) (obj1)).hasNext(); l++)
            {
                hashmap.putAll(((a)((Iterator) (obj1)).next()).g(j.d(l)));
            }

            obj = ((jv) (obj)).c().entrySet().iterator();
            for (int i1 = 1; ((Iterator) (obj)).hasNext(); i1++)
            {
                java.util.Map.Entry entry3 = (java.util.Map.Entry)((Iterator) (obj)).next();
                Object obj2 = (List)entry3.getValue();
                String s4 = j.i(i1);
                obj2 = ((List) (obj2)).iterator();
                for (int j1 = 1; ((Iterator) (obj2)).hasNext(); j1++)
                {
                    hashmap.putAll(((a)((Iterator) (obj2)).next()).g((new StringBuilder()).append(s4).append(com.google.android.gms.analytics.j.g(j1)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry3.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s4).append("nm").toString(), entry3.getKey());
                }
            }

        }
        obj = (ju)jk1.a(com/google/android/gms/internal/ju);
        if (obj != null)
        {
            a(hashmap, "ul", ((ju) (obj)).f());
            a(hashmap, "sd", ((ju) (obj)).a());
            a(hashmap, "sr", ((ju) (obj)).b(), ((ju) (obj)).c());
            a(hashmap, "vp", ((ju) (obj)).d(), ((ju) (obj)).e());
        }
        jk1 = (js)jk1.a(com/google/android/gms/internal/js);
        if (jk1 != null)
        {
            a(hashmap, "an", jk1.a());
            a(hashmap, "aid", jk1.c());
            a(hashmap, "aiid", jk1.d());
            a(hashmap, "av", jk1.b());
        }
        return hashmap;
    }

    public Uri a()
    {
        return d;
    }

    public void a(jk jk1)
    {
        z.a(jk1);
        z.b(jk1.f(), "Can't deliver not submitted measurement");
        z.c("deliver should be called on worker thread");
        Object obj1 = jk1.a();
        Object obj = (ie)((jk) (obj1)).b(com/google/android/gms/internal/ie);
        if (TextUtils.isEmpty(((ie) (obj)).a()))
        {
            p().a(b(((jk) (obj1))), "Ignoring measurement without type");
        } else
        {
            if (TextUtils.isEmpty(((ie) (obj)).b()))
            {
                p().a(b(((jk) (obj1))), "Ignoring measurement without client id");
                return;
            }
            if (!b.k().f())
            {
                double d1 = ((ie) (obj)).h();
                if (n.a(d1, ((ie) (obj)).b()))
                {
                    b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d1));
                    return;
                }
                obj1 = b(((jk) (obj1)));
                ((Map) (obj1)).put("v", "1");
                ((Map) (obj1)).put("_v", s.b);
                ((Map) (obj1)).put("tid", c);
                if (b.k().e())
                {
                    c("Dry run is enabled. GoogleAnalytics would have sent", a(((Map) (obj1))));
                    return;
                }
                HashMap hashmap = new HashMap();
                n.a(hashmap, "uid", ((ie) (obj)).c());
                Object obj2 = (js)jk1.a(com/google/android/gms/internal/js);
                if (obj2 != null)
                {
                    n.a(hashmap, "an", ((js) (obj2)).a());
                    n.a(hashmap, "aid", ((js) (obj2)).c());
                    n.a(hashmap, "av", ((js) (obj2)).b());
                    n.a(hashmap, "aiid", ((js) (obj2)).d());
                }
                obj2 = ((ie) (obj)).b();
                String s1 = c;
                boolean flag;
                if (!TextUtils.isEmpty(((ie) (obj)).d()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj = new v(0L, ((String) (obj2)), s1, flag, 0L, hashmap);
                ((Map) (obj1)).put("_s", String.valueOf(t().a(((v) (obj)))));
                jk1 = new com.google.android.gms.analytics.internal.c(p(), ((Map) (obj1)), jk1.d(), true);
                t().a(jk1);
                return;
            }
        }
    }
}

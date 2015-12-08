// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.a.c;
import com.google.android.gms.analytics.internal.aa;
import com.google.android.gms.analytics.internal.ab;
import com.google.android.gms.analytics.internal.ae;
import com.google.android.gms.analytics.internal.j;
import com.google.android.gms.analytics.internal.r;
import com.google.android.gms.analytics.internal.t;
import com.google.android.gms.analytics.internal.y;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.d.ak;
import com.google.android.gms.d.al;
import com.google.android.gms.d.am;
import com.google.android.gms.d.an;
import com.google.android.gms.d.ao;
import com.google.android.gms.d.ap;
import com.google.android.gms.d.aq;
import com.google.android.gms.d.ar;
import com.google.android.gms.d.as;
import com.google.android.gms.d.at;
import com.google.android.gms.d.d;
import com.google.android.gms.d.e;
import com.google.android.gms.d.f;
import com.google.android.gms.d.g;
import com.google.android.gms.d.z;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            q, f

public class p extends y
    implements ak
{

    private static DecimalFormat a;
    private final ab b;
    private final String c;
    private final Uri d;
    private final boolean e;
    private final boolean f;

    public p(ab ab1, String s)
    {
        this(ab1, s, true, false);
    }

    public p(ab ab1, String s, boolean flag, boolean flag1)
    {
        super(ab1);
        u.a(s);
        b = ab1;
        c = s;
        e = flag;
        f = flag1;
        d = a(c);
    }

    static Uri a(String s)
    {
        u.a(s);
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(s);
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
            String s = (String)obj;
            obj = s;
            if (TextUtils.isEmpty(s))
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

    private static void a(Map map, String s, double d1)
    {
        if (d1 != 0.0D)
        {
            map.put(s, a(d1));
        }
    }

    private static void a(Map map, String s, int i, int k)
    {
        if (i > 0 && k > 0)
        {
            map.put(s, (new StringBuilder()).append(i).append("x").append(k).toString());
        }
    }

    private static void a(Map map, String s, String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            map.put(s, s1);
        }
    }

    private static void a(Map map, String s, boolean flag)
    {
        if (flag)
        {
            map.put(s, "1");
        }
    }

    public static Map b(z z1)
    {
        HashMap hashmap = new HashMap();
        Object obj = (f)z1.a(com/google/android/gms/d/f);
        if (obj != null)
        {
            obj = ((f) (obj)).a().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s = a(entry.getValue());
                if (s != null)
                {
                    hashmap.put(entry.getKey(), s);
                }
            } while (true);
        }
        obj = (g)z1.a(com/google/android/gms/d/g);
        if (obj != null)
        {
            a(hashmap, "t", ((g) (obj)).a());
            a(hashmap, "cid", ((g) (obj)).b());
            a(hashmap, "uid", ((g) (obj)).c());
            a(hashmap, "sc", ((g) (obj)).f());
            a(hashmap, "sf", ((g) (obj)).h());
            a(hashmap, "ni", ((g) (obj)).g());
            a(hashmap, "adid", ((g) (obj)).d());
            a(hashmap, "ate", ((g) (obj)).e());
        }
        obj = (ar)z1.a(com/google/android/gms/d/ar);
        if (obj != null)
        {
            a(hashmap, "cd", ((ar) (obj)).b());
            a(hashmap, "a", ((ar) (obj)).c());
            a(hashmap, "dr", ((ar) (obj)).d());
        }
        obj = (ap)z1.a(com/google/android/gms/d/ap);
        if (obj != null)
        {
            a(hashmap, "ec", ((ap) (obj)).a());
            a(hashmap, "ea", ((ap) (obj)).b());
            a(hashmap, "el", ((ap) (obj)).c());
            a(hashmap, "ev", ((ap) (obj)).d());
        }
        obj = (am)z1.a(com/google/android/gms/d/am);
        if (obj != null)
        {
            a(hashmap, "cn", ((am) (obj)).a());
            a(hashmap, "cs", ((am) (obj)).b());
            a(hashmap, "cm", ((am) (obj)).c());
            a(hashmap, "ck", ((am) (obj)).d());
            a(hashmap, "cc", ((am) (obj)).e());
            a(hashmap, "ci", ((am) (obj)).f());
            a(hashmap, "anid", ((am) (obj)).g());
            a(hashmap, "gclid", ((am) (obj)).h());
            a(hashmap, "dclid", ((am) (obj)).i());
            a(hashmap, "aclid", ((am) (obj)).j());
        }
        obj = (aq)z1.a(com/google/android/gms/d/aq);
        if (obj != null)
        {
            a(hashmap, "exd", ((aq) (obj)).a());
            a(hashmap, "exf", ((aq) (obj)).b());
        }
        obj = (as)z1.a(com/google/android/gms/d/as);
        if (obj != null)
        {
            a(hashmap, "sn", ((as) (obj)).a());
            a(hashmap, "sa", ((as) (obj)).b());
            a(hashmap, "st", ((as) (obj)).c());
        }
        obj = (at)z1.a(com/google/android/gms/d/at);
        if (obj != null)
        {
            a(hashmap, "utv", ((at) (obj)).a());
            a(hashmap, "utt", ((at) (obj)).b());
            a(hashmap, "utc", ((at) (obj)).c());
            a(hashmap, "utl", ((at) (obj)).d());
        }
        obj = (d)z1.a(com/google/android/gms/d/d);
        if (obj != null)
        {
            obj = ((d) (obj)).a().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s1 = com.google.android.gms.analytics.q.a(((Integer)entry1.getKey()).intValue());
                if (!TextUtils.isEmpty(s1))
                {
                    hashmap.put(s1, entry1.getValue());
                }
            } while (true);
        }
        obj = (e)z1.a(com/google/android/gms/d/e);
        if (obj != null)
        {
            obj = ((e) (obj)).a().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry2 = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s2 = com.google.android.gms.analytics.q.b(((Integer)entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(s2))
                {
                    hashmap.put(s2, a(((Double)entry2.getValue()).doubleValue()));
                }
            } while (true);
        }
        obj = (ao)z1.a(com/google/android/gms/d/ao);
        if (obj != null)
        {
            Object obj1 = ((ao) (obj)).a();
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
            obj1 = ((ao) (obj)).d().iterator();
            for (int i = 1; ((Iterator) (obj1)).hasNext(); i++)
            {
                hashmap.putAll(((c)((Iterator) (obj1)).next()).a(com.google.android.gms.analytics.q.f(i)));
            }

            obj1 = ((ao) (obj)).b().iterator();
            for (int k = 1; ((Iterator) (obj1)).hasNext(); k++)
            {
                hashmap.putAll(((a)((Iterator) (obj1)).next()).a(com.google.android.gms.analytics.q.d(k)));
            }

            obj = ((ao) (obj)).c().entrySet().iterator();
            for (int l = 1; ((Iterator) (obj)).hasNext(); l++)
            {
                java.util.Map.Entry entry3 = (java.util.Map.Entry)((Iterator) (obj)).next();
                Object obj2 = (List)entry3.getValue();
                String s3 = q.i(l);
                obj2 = ((List) (obj2)).iterator();
                for (int i1 = 1; ((Iterator) (obj2)).hasNext(); i1++)
                {
                    hashmap.putAll(((a)((Iterator) (obj2)).next()).a((new StringBuilder()).append(s3).append(com.google.android.gms.analytics.q.g(i1)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry3.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s3).append("nm").toString(), entry3.getKey());
                }
            }

        }
        obj = (an)z1.a(com/google/android/gms/d/an);
        if (obj != null)
        {
            a(hashmap, "ul", ((an) (obj)).f());
            a(hashmap, "sd", ((an) (obj)).a());
            a(hashmap, "sr", ((an) (obj)).b(), ((an) (obj)).c());
            a(hashmap, "vp", ((an) (obj)).d(), ((an) (obj)).e());
        }
        z1 = (al)z1.a(com/google/android/gms/d/al);
        if (z1 != null)
        {
            a(hashmap, "an", z1.a());
            a(hashmap, "aid", z1.c());
            a(hashmap, "aiid", z1.d());
            a(hashmap, "av", z1.b());
        }
        return hashmap;
    }

    public Uri a()
    {
        return d;
    }

    public void a(z z1)
    {
        u.a(z1);
        u.b(z1.f(), "Can't deliver not submitted measurement");
        u.c("deliver should be called on worker thread");
        Object obj1 = z1.a();
        Object obj = (g)((z) (obj1)).b(com/google/android/gms/d/g);
        if (TextUtils.isEmpty(((g) (obj)).a()))
        {
            p().a(b(((z) (obj1))), "Ignoring measurement without type");
        } else
        {
            if (TextUtils.isEmpty(((g) (obj)).b()))
            {
                p().a(b(((z) (obj1))), "Ignoring measurement without client id");
                return;
            }
            if (!b.k().f())
            {
                double d1 = ((g) (obj)).h();
                if (r.a(d1, ((g) (obj)).b()))
                {
                    b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d1));
                    return;
                }
                obj1 = b(((z) (obj1)));
                ((Map) (obj1)).put("v", "1");
                ((Map) (obj1)).put("_v", aa.b);
                ((Map) (obj1)).put("tid", c);
                if (b.k().e())
                {
                    c("Dry run is enabled. GoogleAnalytics would have sent", a(((Map) (obj1))));
                    return;
                }
                HashMap hashmap = new HashMap();
                r.a(hashmap, "uid", ((g) (obj)).c());
                Object obj2 = (al)z1.a(com/google/android/gms/d/al);
                if (obj2 != null)
                {
                    r.a(hashmap, "an", ((al) (obj2)).a());
                    r.a(hashmap, "aid", ((al) (obj2)).c());
                    r.a(hashmap, "av", ((al) (obj2)).b());
                    r.a(hashmap, "aiid", ((al) (obj2)).d());
                }
                obj2 = ((g) (obj)).b();
                String s = c;
                boolean flag;
                if (!TextUtils.isEmpty(((g) (obj)).d()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj = new ae(0L, ((String) (obj2)), s, flag, 0L, hashmap);
                ((Map) (obj1)).put("_s", String.valueOf(t().a(((ae) (obj)))));
                z1 = new com.google.android.gms.analytics.internal.d(p(), ((Map) (obj1)), z1.d(), true);
                t().a(z1);
                return;
            }
        }
    }
}

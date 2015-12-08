// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.a.c;
import com.google.android.gms.analytics.internal.d;
import com.google.android.gms.analytics.internal.l;
import com.google.android.gms.analytics.internal.n;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.analytics.internal.u;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.analytics.internal.y;
import com.google.android.gms.b.ag;
import com.google.android.gms.b.am;
import com.google.android.gms.b.an;
import com.google.android.gms.b.ao;
import com.google.android.gms.b.ap;
import com.google.android.gms.b.aq;
import com.google.android.gms.b.ar;
import com.google.android.gms.b.as;
import com.google.android.gms.b.at;
import com.google.android.gms.b.au;
import com.google.android.gms.b.av;
import com.google.android.gms.b.e;
import com.google.android.gms.b.f;
import com.google.android.gms.b.g;
import com.google.android.gms.b.h;
import com.google.android.gms.common.internal.zzx;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            j, f

public final class i extends s
    implements am
{

    private static DecimalFormat a;
    private final v b;
    private final String c;
    private final Uri d;
    private final boolean e;
    private final boolean f;

    public i(v v1, String s1)
    {
        this(v1, s1, (byte)0);
    }

    private i(v v1, String s1, byte byte0)
    {
        super(v1);
        zzx.zzcs(s1);
        b = v1;
        c = s1;
        e = true;
        f = false;
        d = a(c);
    }

    public static Uri a(String s1)
    {
        zzx.zzcs(s1);
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(s1);
        return builder.build();
    }

    private static String a(double d1)
    {
        if (a == null)
        {
            a = new DecimalFormat("0.######");
        }
        return a.format(d1);
    }

    private static void a(Map map, String s1, double d1)
    {
        if (d1 != 0.0D)
        {
            map.put(s1, a(d1));
        }
    }

    private static void a(Map map, String s1, int k, int i1)
    {
        if (k > 0 && i1 > 0)
        {
            map.put(s1, (new StringBuilder()).append(k).append("x").append(i1).toString());
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

    private static Map b(ag ag1)
    {
        Object obj;
        HashMap hashmap;
        hashmap = new HashMap();
        obj = (g)ag1.a(com/google/android/gms/b/g);
        if (obj == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = Collections.unmodifiableMap(((g) (obj)).a).entrySet().iterator();
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        java.util.Map.Entry entry4;
        entry4 = (java.util.Map.Entry)iterator.next();
        obj = entry4.getValue();
        if (obj != null) goto _L5; else goto _L4
_L4:
        obj = null;
_L6:
        if (obj != null)
        {
            hashmap.put(entry4.getKey(), obj);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (obj instanceof String)
        {
            String s1 = (String)obj;
            obj = s1;
            if (TextUtils.isEmpty(s1))
            {
                obj = null;
            }
        } else
        if (obj instanceof Double)
        {
            obj = (Double)obj;
            if (((Double) (obj)).doubleValue() != 0.0D)
            {
                obj = a(((Double) (obj)).doubleValue());
            } else
            {
                obj = null;
            }
        } else
        if (obj instanceof Boolean)
        {
            if (obj != Boolean.FALSE)
            {
                obj = "1";
            } else
            {
                obj = null;
            }
        } else
        {
            obj = String.valueOf(obj);
        }
        if (true) goto _L6; else goto _L2
_L2:
        Object obj1 = (h)ag1.a(com/google/android/gms/b/h);
        if (obj1 != null)
        {
            a(hashmap, "t", ((h) (obj1)).a);
            a(hashmap, "cid", ((h) (obj1)).b);
            a(hashmap, "uid", ((h) (obj1)).c);
            a(hashmap, "sc", ((h) (obj1)).f);
            a(hashmap, "sf", ((h) (obj1)).h);
            a(hashmap, "ni", ((h) (obj1)).g);
            a(hashmap, "adid", ((h) (obj1)).d);
            a(hashmap, "ate", ((h) (obj1)).e);
        }
        obj1 = (at)ag1.a(com/google/android/gms/b/at);
        if (obj1 != null)
        {
            a(hashmap, "cd", ((at) (obj1)).a);
            a(hashmap, "a", ((at) (obj1)).b);
            a(hashmap, "dr", ((at) (obj1)).c);
        }
        obj1 = (ar)ag1.a(com/google/android/gms/b/ar);
        if (obj1 != null)
        {
            a(hashmap, "ec", ((ar) (obj1)).a);
            a(hashmap, "ea", ((ar) (obj1)).b);
            a(hashmap, "el", ((ar) (obj1)).c);
            a(hashmap, "ev", ((ar) (obj1)).d);
        }
        obj1 = (ao)ag1.a(com/google/android/gms/b/ao);
        if (obj1 != null)
        {
            a(hashmap, "cn", ((ao) (obj1)).a);
            a(hashmap, "cs", ((ao) (obj1)).b);
            a(hashmap, "cm", ((ao) (obj1)).c);
            a(hashmap, "ck", ((ao) (obj1)).d);
            a(hashmap, "cc", ((ao) (obj1)).e);
            a(hashmap, "ci", ((ao) (obj1)).f);
            a(hashmap, "anid", ((ao) (obj1)).g);
            a(hashmap, "gclid", ((ao) (obj1)).h);
            a(hashmap, "dclid", ((ao) (obj1)).i);
            a(hashmap, "aclid", ((ao) (obj1)).j);
        }
        obj1 = (as)ag1.a(com/google/android/gms/b/as);
        if (obj1 != null)
        {
            a(hashmap, "exd", ((as) (obj1)).a);
            a(hashmap, "exf", ((as) (obj1)).b);
        }
        obj1 = (au)ag1.a(com/google/android/gms/b/au);
        if (obj1 != null)
        {
            a(hashmap, "sn", ((au) (obj1)).a);
            a(hashmap, "sa", ((au) (obj1)).b);
            a(hashmap, "st", ((au) (obj1)).c);
        }
        obj1 = (av)ag1.a(com/google/android/gms/b/av);
        if (obj1 != null)
        {
            a(hashmap, "utv", ((av) (obj1)).a);
            a(hashmap, "utt", ((av) (obj1)).b);
            a(hashmap, "utc", ((av) (obj1)).c);
            a(hashmap, "utl", ((av) (obj1)).d);
        }
        obj1 = (e)ag1.a(com/google/android/gms/b/e);
        if (obj1 != null)
        {
            obj1 = Collections.unmodifiableMap(((e) (obj1)).a).entrySet().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
                String s2 = com.google.android.gms.analytics.j.a("cd", ((Integer)entry.getKey()).intValue());
                if (!TextUtils.isEmpty(s2))
                {
                    hashmap.put(s2, entry.getValue());
                }
            } while (true);
        }
        obj1 = (f)ag1.a(com/google/android/gms/b/f);
        if (obj1 != null)
        {
            obj1 = Collections.unmodifiableMap(((f) (obj1)).a).entrySet().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                String s3 = com.google.android.gms.analytics.j.a("cm", ((Integer)entry1.getKey()).intValue());
                if (!TextUtils.isEmpty(s3))
                {
                    hashmap.put(s3, a(((Double)entry1.getValue()).doubleValue()));
                }
            } while (true);
        }
        obj1 = (aq)ag1.a(com/google/android/gms/b/aq);
        if (obj1 != null)
        {
            Object obj2 = ((aq) (obj1)).d;
            if (obj2 != null)
            {
                for (obj2 = (new HashMap(((b) (obj2)).a)).entrySet().iterator(); ((Iterator) (obj2)).hasNext();)
                {
                    java.util.Map.Entry entry3 = (java.util.Map.Entry)((Iterator) (obj2)).next();
                    if (((String)entry3.getKey()).startsWith("&"))
                    {
                        hashmap.put(((String)entry3.getKey()).substring(1), entry3.getValue());
                    } else
                    {
                        hashmap.put(entry3.getKey(), entry3.getValue());
                    }
                }

            }
            obj2 = Collections.unmodifiableList(((aq) (obj1)).b).iterator();
            for (int k = 1; ((Iterator) (obj2)).hasNext(); k++)
            {
                hashmap.putAll(((c)((Iterator) (obj2)).next()).a(com.google.android.gms.analytics.j.a("promo", k)));
            }

            obj2 = Collections.unmodifiableList(((aq) (obj1)).a).iterator();
            for (int i1 = 1; ((Iterator) (obj2)).hasNext(); i1++)
            {
                hashmap.putAll(((a)((Iterator) (obj2)).next()).a(com.google.android.gms.analytics.j.a("pr", i1)));
            }

            obj1 = ((aq) (obj1)).c.entrySet().iterator();
            for (int j1 = 1; ((Iterator) (obj1)).hasNext(); j1++)
            {
                java.util.Map.Entry entry2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                Object obj3 = (List)entry2.getValue();
                String s4 = com.google.android.gms.analytics.j.a("il", j1);
                obj3 = ((List) (obj3)).iterator();
                for (int k1 = 1; ((Iterator) (obj3)).hasNext(); k1++)
                {
                    hashmap.putAll(((a)((Iterator) (obj3)).next()).a((new StringBuilder()).append(s4).append(com.google.android.gms.analytics.j.a("pi", k1)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry2.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s4).append("nm").toString(), entry2.getKey());
                }
            }

        }
        obj1 = (ap)ag1.a(com/google/android/gms/b/ap);
        if (obj1 != null)
        {
            a(hashmap, "ul", ((ap) (obj1)).a);
            a(hashmap, "sd", ((ap) (obj1)).b);
            a(hashmap, "sr", ((ap) (obj1)).c, ((ap) (obj1)).d);
            a(hashmap, "vp", ((ap) (obj1)).e, ((ap) (obj1)).f);
        }
        ag1 = (an)ag1.a(com/google/android/gms/b/an);
        if (ag1 != null)
        {
            a(hashmap, "an", ((an) (ag1)).a);
            a(hashmap, "aid", ((an) (ag1)).c);
            a(hashmap, "aiid", ((an) (ag1)).d);
            a(hashmap, "av", ((an) (ag1)).b);
        }
        return hashmap;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final Uri a()
    {
        return d;
    }

    public final void a(ag ag1)
    {
        zzx.zzv(ag1);
        zzx.zzb(ag1.c, "Can't deliver not submitted measurement");
        zzx.zzci("deliver should be called on worker thread");
        Object obj = ag1.a();
        Object obj1 = (h)((ag) (obj)).b(com/google/android/gms/b/h);
        if (TextUtils.isEmpty(((h) (obj1)).a))
        {
            super.i.a().a(b(((ag) (obj))), "Ignoring measurement without type");
        } else
        {
            if (TextUtils.isEmpty(((h) (obj1)).b))
            {
                super.i.a().a(b(((ag) (obj))), "Ignoring measurement without client id");
                return;
            }
            if (!b.d().d)
            {
                double d1 = ((h) (obj1)).h;
                if (l.a(d1, ((h) (obj1)).b))
                {
                    b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d1));
                    return;
                }
                obj = b(((ag) (obj)));
                ((Map) (obj)).put("v", "1");
                ((Map) (obj)).put("_v", u.b);
                ((Map) (obj)).put("tid", c);
                if (b.d().c)
                {
                    ag1 = new StringBuilder();
                    for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); ag1.append((String)((java.util.Map.Entry) (obj1)).getValue()))
                    {
                        obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                        if (ag1.length() != 0)
                        {
                            ag1.append(", ");
                        }
                        ag1.append((String)((java.util.Map.Entry) (obj1)).getKey());
                        ag1.append("=");
                    }

                    a(4, "Dry run is enabled. GoogleAnalytics would have sent", ag1.toString(), null, null);
                    return;
                }
                HashMap hashmap = new HashMap();
                l.a(hashmap, "uid", ((h) (obj1)).c);
                Object obj2 = (an)ag1.a(com/google/android/gms/b/an);
                if (obj2 != null)
                {
                    l.a(hashmap, "an", ((an) (obj2)).a);
                    l.a(hashmap, "aid", ((an) (obj2)).c);
                    l.a(hashmap, "av", ((an) (obj2)).b);
                    l.a(hashmap, "aiid", ((an) (obj2)).d);
                }
                obj2 = ((h) (obj1)).b;
                String s1 = c;
                boolean flag;
                if (!TextUtils.isEmpty(((h) (obj1)).d))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj1 = new y(((String) (obj2)), s1, flag, 0L, hashmap);
                ((Map) (obj)).put("_s", String.valueOf(super.i.c().a(((y) (obj1)))));
                ag1 = new d(super.i.a(), ((Map) (obj)), ag1.d);
                super.i.c().a(ag1);
                return;
            }
        }
    }
}

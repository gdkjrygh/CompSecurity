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
import com.google.android.gms.analytics.internal.m;
import com.google.android.gms.analytics.internal.o;
import com.google.android.gms.analytics.internal.p;
import com.google.android.gms.analytics.internal.r;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.analytics.internal.u;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.hq;
import com.google.android.gms.internal.hr;
import com.google.android.gms.internal.ht;
import com.google.android.gms.internal.hu;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.jh;
import com.google.android.gms.internal.ji;
import com.google.android.gms.internal.jj;
import com.google.android.gms.internal.jk;
import com.google.android.gms.internal.jl;
import com.google.android.gms.internal.jm;
import com.google.android.gms.internal.jn;
import com.google.android.gms.internal.jo;
import com.google.android.gms.internal.jp;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            j, c

public final class i extends p
    implements jf
{

    private static DecimalFormat a;
    private final s b;
    private final String c;
    private final Uri d;
    private final boolean e;
    private final boolean f;

    public i(s s1, String s2)
    {
        this(s1, s2, (byte)0);
    }

    private i(s s1, String s2, byte byte0)
    {
        super(s1);
        y.a(s2);
        b = s1;
        c = s2;
        e = true;
        f = false;
        d = a(c);
    }

    static Uri a(String s1)
    {
        y.a(s1);
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

    private static Map b(jb jb1)
    {
        Object obj;
        HashMap hashmap;
        hashmap = new HashMap();
        obj = (ht)jb1.a(com/google/android/gms/internal/ht);
        if (obj == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = ((ht) (obj)).a().entrySet().iterator();
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
        Object obj1 = (hu)jb1.a(com/google/android/gms/internal/hu);
        if (obj1 != null)
        {
            a(hashmap, "t", ((hu) (obj1)).a());
            a(hashmap, "cid", ((hu) (obj1)).b());
            a(hashmap, "uid", ((hu) (obj1)).c());
            a(hashmap, "sc", ((hu) (obj1)).f());
            a(hashmap, "sf", ((hu) (obj1)).i());
            a(hashmap, "ni", ((hu) (obj1)).g());
            a(hashmap, "adid", ((hu) (obj1)).d());
            a(hashmap, "ate", ((hu) (obj1)).e());
        }
        obj1 = (jn)jb1.a(com/google/android/gms/internal/jn);
        if (obj1 != null)
        {
            a(hashmap, "cd", ((jn) (obj1)).a());
            a(hashmap, "a", ((jn) (obj1)).b());
            a(hashmap, "dr", ((jn) (obj1)).e());
        }
        obj1 = (jl)jb1.a(com/google/android/gms/internal/jl);
        if (obj1 != null)
        {
            a(hashmap, "ec", ((jl) (obj1)).a());
            a(hashmap, "ea", ((jl) (obj1)).b());
            a(hashmap, "el", ((jl) (obj1)).c());
            a(hashmap, "ev", ((jl) (obj1)).d());
        }
        obj1 = (ji)jb1.a(com/google/android/gms/internal/ji);
        if (obj1 != null)
        {
            a(hashmap, "cn", ((ji) (obj1)).a());
            a(hashmap, "cs", ((ji) (obj1)).b());
            a(hashmap, "cm", ((ji) (obj1)).c());
            a(hashmap, "ck", ((ji) (obj1)).d());
            a(hashmap, "cc", ((ji) (obj1)).e());
            a(hashmap, "ci", ((ji) (obj1)).f());
            a(hashmap, "anid", ((ji) (obj1)).g());
            a(hashmap, "gclid", ((ji) (obj1)).h());
            a(hashmap, "dclid", ((ji) (obj1)).i());
            a(hashmap, "aclid", ((ji) (obj1)).j());
        }
        obj1 = (jm)jb1.a(com/google/android/gms/internal/jm);
        if (obj1 != null)
        {
            a(hashmap, "exd", ((jm) (obj1)).a);
            a(hashmap, "exf", ((jm) (obj1)).b);
        }
        obj1 = (jo)jb1.a(com/google/android/gms/internal/jo);
        if (obj1 != null)
        {
            a(hashmap, "sn", ((jo) (obj1)).a);
            a(hashmap, "sa", ((jo) (obj1)).b);
            a(hashmap, "st", ((jo) (obj1)).c);
        }
        obj1 = (jp)jb1.a(com/google/android/gms/internal/jp);
        if (obj1 != null)
        {
            a(hashmap, "utv", ((jp) (obj1)).a);
            a(hashmap, "utt", ((jp) (obj1)).b);
            a(hashmap, "utc", ((jp) (obj1)).c);
            a(hashmap, "utl", ((jp) (obj1)).d);
        }
        obj1 = (hq)jb1.a(com/google/android/gms/internal/hq);
        if (obj1 != null)
        {
            obj1 = ((hq) (obj1)).a().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
                String s2 = com.google.android.gms.analytics.j.a(((Integer)entry.getKey()).intValue());
                if (!TextUtils.isEmpty(s2))
                {
                    hashmap.put(s2, entry.getValue());
                }
            } while (true);
        }
        obj1 = (hr)jb1.a(com/google/android/gms/internal/hr);
        if (obj1 != null)
        {
            obj1 = ((hr) (obj1)).a().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                String s3 = com.google.android.gms.analytics.j.b(((Integer)entry1.getKey()).intValue());
                if (!TextUtils.isEmpty(s3))
                {
                    hashmap.put(s3, a(((Double)entry1.getValue()).doubleValue()));
                }
            } while (true);
        }
        obj1 = (jk)jb1.a(com/google/android/gms/internal/jk);
        if (obj1 != null)
        {
            Object obj2 = ((jk) (obj1)).a();
            if (obj2 != null)
            {
                for (obj2 = ((b) (obj2)).a().entrySet().iterator(); ((Iterator) (obj2)).hasNext();)
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
            obj2 = ((jk) (obj1)).d().iterator();
            for (int k = 1; ((Iterator) (obj2)).hasNext(); k++)
            {
                hashmap.putAll(((c)((Iterator) (obj2)).next()).e(j.f(k)));
            }

            obj2 = ((jk) (obj1)).b().iterator();
            for (int l = 1; ((Iterator) (obj2)).hasNext(); l++)
            {
                hashmap.putAll(((a)((Iterator) (obj2)).next()).g(j.d(l)));
            }

            obj1 = ((jk) (obj1)).c().entrySet().iterator();
            for (int i1 = 1; ((Iterator) (obj1)).hasNext(); i1++)
            {
                java.util.Map.Entry entry2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                Object obj3 = (List)entry2.getValue();
                String s4 = j.i(i1);
                obj3 = ((List) (obj3)).iterator();
                for (int j1 = 1; ((Iterator) (obj3)).hasNext(); j1++)
                {
                    hashmap.putAll(((a)((Iterator) (obj3)).next()).g((new StringBuilder()).append(s4).append(com.google.android.gms.analytics.j.g(j1)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry2.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s4).append("nm").toString(), entry2.getKey());
                }
            }

        }
        obj1 = (jj)jb1.a(com/google/android/gms/internal/jj);
        if (obj1 != null)
        {
            a(hashmap, "ul", ((jj) (obj1)).a());
            a(hashmap, "sd", ((jj) (obj1)).a);
            a(hashmap, "sr", ((jj) (obj1)).b, ((jj) (obj1)).c);
            a(hashmap, "vp", ((jj) (obj1)).d, ((jj) (obj1)).e);
        }
        jb1 = (jh)jb1.a(com/google/android/gms/internal/jh);
        if (jb1 != null)
        {
            a(hashmap, "an", jb1.a());
            a(hashmap, "aid", jb1.c());
            a(hashmap, "aiid", jb1.d());
            a(hashmap, "av", jb1.b());
        }
        return hashmap;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final Uri a()
    {
        return d;
    }

    public final void a(jb jb1)
    {
        y.a(jb1);
        y.b(jb1.f(), "Can't deliver not submitted measurement");
        y.c("deliver should be called on worker thread");
        Object obj = jb1.a();
        Object obj1 = (hu)((jb) (obj)).b(com/google/android/gms/internal/hu);
        if (TextUtils.isEmpty(((hu) (obj1)).a()))
        {
            n().a(b(((jb) (obj))), "Ignoring measurement without type");
        } else
        {
            if (TextUtils.isEmpty(((hu) (obj1)).b()))
            {
                n().a(b(((jb) (obj))), "Ignoring measurement without client id");
                return;
            }
            if (!b.j().f())
            {
                double d1 = ((hu) (obj1)).i();
                if (m.a(d1, ((hu) (obj1)).b()))
                {
                    b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d1));
                    return;
                }
                obj = b(((jb) (obj)));
                ((Map) (obj)).put("v", "1");
                ((Map) (obj)).put("_v", r.b);
                ((Map) (obj)).put("tid", c);
                if (b.j().d())
                {
                    jb1 = new StringBuilder();
                    for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); jb1.append((String)((java.util.Map.Entry) (obj1)).getValue()))
                    {
                        obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                        if (jb1.length() != 0)
                        {
                            jb1.append(", ");
                        }
                        jb1.append((String)((java.util.Map.Entry) (obj1)).getKey());
                        jb1.append("=");
                    }

                    c("Dry run is enabled. GoogleAnalytics would have sent", jb1.toString());
                    return;
                }
                HashMap hashmap = new HashMap();
                m.a(hashmap, "uid", ((hu) (obj1)).c());
                Object obj2 = (jh)jb1.a(com/google/android/gms/internal/jh);
                if (obj2 != null)
                {
                    m.a(hashmap, "an", ((jh) (obj2)).a());
                    m.a(hashmap, "aid", ((jh) (obj2)).c());
                    m.a(hashmap, "av", ((jh) (obj2)).b());
                    m.a(hashmap, "aiid", ((jh) (obj2)).d());
                }
                obj2 = ((hu) (obj1)).b();
                String s1 = c;
                boolean flag;
                if (!TextUtils.isEmpty(((hu) (obj1)).d()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj1 = new u(((String) (obj2)), s1, flag, 0L, hashmap);
                ((Map) (obj)).put("_s", String.valueOf(r().a(((u) (obj1)))));
                jb1 = new com.google.android.gms.analytics.internal.c(n(), ((Map) (obj)), jb1.d(), true);
                r().a(jb1);
                return;
            }
        }
    }
}

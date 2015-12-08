// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.internal.aa;
import com.google.android.gms.analytics.internal.ad;
import com.google.android.gms.analytics.internal.d;
import com.google.android.gms.analytics.internal.j;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.analytics.internal.x;
import com.google.android.gms.analytics.internal.z;
import com.google.android.gms.c.c;
import com.google.android.gms.c.l;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.sw;
import com.google.android.gms.internal.sx;
import com.google.android.gms.internal.sy;
import com.google.android.gms.internal.sz;
import com.google.android.gms.internal.wu;
import com.google.android.gms.internal.wv;
import com.google.android.gms.internal.ww;
import com.google.android.gms.internal.wx;
import com.google.android.gms.internal.wy;
import com.google.android.gms.internal.wz;
import com.google.android.gms.internal.xa;
import com.google.android.gms.internal.xb;
import com.google.android.gms.internal.xc;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            q, f

public final class p extends x
    implements l
{

    private static DecimalFormat a;
    private final aa b;
    private final String c;
    private final Uri d;
    private final boolean e;
    private final boolean f;

    public p(aa aa1, String s1)
    {
        this(aa1, s1, (byte)0);
    }

    private p(aa aa1, String s1, byte byte0)
    {
        super(aa1);
        bl.a(s1);
        b = aa1;
        c = s1;
        e = true;
        f = false;
        d = a(c);
    }

    static Uri a(String s1)
    {
        bl.a(s1);
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

    private static void a(Map map, String s1, int i, int k)
    {
        if (i > 0 && k > 0)
        {
            map.put(s1, (new StringBuilder()).append(i).append("x").append(k).toString());
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

    private static Map b(c c1)
    {
        Object obj;
        HashMap hashmap;
        hashmap = new HashMap();
        obj = (sy)c1.a(com/google/android/gms/internal/sy);
        if (obj == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = ((sy) (obj)).a().entrySet().iterator();
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
        Object obj1 = (sz)c1.a(com/google/android/gms/internal/sz);
        if (obj1 != null)
        {
            a(hashmap, "t", ((sz) (obj1)).a());
            a(hashmap, "cid", ((sz) (obj1)).b());
            a(hashmap, "uid", ((sz) (obj1)).c());
            a(hashmap, "sc", ((sz) (obj1)).f());
            a(hashmap, "sf", ((sz) (obj1)).i());
            a(hashmap, "ni", ((sz) (obj1)).g());
            a(hashmap, "adid", ((sz) (obj1)).d());
            a(hashmap, "ate", ((sz) (obj1)).e());
        }
        obj1 = (xa)c1.a(com/google/android/gms/internal/xa);
        if (obj1 != null)
        {
            a(hashmap, "cd", ((xa) (obj1)).a());
            a(hashmap, "a", ((xa) (obj1)).b());
            a(hashmap, "dr", ((xa) (obj1)).c());
        }
        obj1 = (wy)c1.a(com/google/android/gms/internal/wy);
        if (obj1 != null)
        {
            a(hashmap, "ec", ((wy) (obj1)).a());
            a(hashmap, "ea", ((wy) (obj1)).b());
            a(hashmap, "el", ((wy) (obj1)).c());
            a(hashmap, "ev", ((wy) (obj1)).d());
        }
        obj1 = (wv)c1.a(com/google/android/gms/internal/wv);
        if (obj1 != null)
        {
            a(hashmap, "cn", ((wv) (obj1)).a());
            a(hashmap, "cs", ((wv) (obj1)).b());
            a(hashmap, "cm", ((wv) (obj1)).c());
            a(hashmap, "ck", ((wv) (obj1)).d());
            a(hashmap, "cc", ((wv) (obj1)).e());
            a(hashmap, "ci", ((wv) (obj1)).f());
            a(hashmap, "anid", ((wv) (obj1)).g());
            a(hashmap, "gclid", ((wv) (obj1)).h());
            a(hashmap, "dclid", ((wv) (obj1)).i());
            a(hashmap, "aclid", ((wv) (obj1)).j());
        }
        obj1 = (wz)c1.a(com/google/android/gms/internal/wz);
        if (obj1 != null)
        {
            a(hashmap, "exd", ((wz) (obj1)).a);
            a(hashmap, "exf", ((wz) (obj1)).b);
        }
        obj1 = (xb)c1.a(com/google/android/gms/internal/xb);
        if (obj1 != null)
        {
            a(hashmap, "sn", ((xb) (obj1)).a);
            a(hashmap, "sa", ((xb) (obj1)).b);
            a(hashmap, "st", ((xb) (obj1)).c);
        }
        obj1 = (xc)c1.a(com/google/android/gms/internal/xc);
        if (obj1 != null)
        {
            a(hashmap, "utv", ((xc) (obj1)).a);
            a(hashmap, "utt", ((xc) (obj1)).b);
            a(hashmap, "utc", ((xc) (obj1)).c);
            a(hashmap, "utl", ((xc) (obj1)).d);
        }
        obj1 = (sw)c1.a(com/google/android/gms/internal/sw);
        if (obj1 != null)
        {
            obj1 = ((sw) (obj1)).a().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
                String s2 = com.google.android.gms.analytics.q.b(((Integer)entry.getKey()).intValue());
                if (!TextUtils.isEmpty(s2))
                {
                    hashmap.put(s2, entry.getValue());
                }
            } while (true);
        }
        obj1 = (sx)c1.a(com/google/android/gms/internal/sx);
        if (obj1 != null)
        {
            obj1 = ((sx) (obj1)).a().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                String s3 = com.google.android.gms.analytics.q.c(((Integer)entry1.getKey()).intValue());
                if (!TextUtils.isEmpty(s3))
                {
                    hashmap.put(s3, a(((Double)entry1.getValue()).doubleValue()));
                }
            } while (true);
        }
        obj1 = (wx)c1.a(com/google/android/gms/internal/wx);
        if (obj1 != null)
        {
            Object obj2 = ((wx) (obj1)).a();
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
            obj2 = ((wx) (obj1)).d().iterator();
            for (int i = 1; ((Iterator) (obj2)).hasNext(); i++)
            {
                hashmap.putAll(((com.google.android.gms.analytics.a.c)((Iterator) (obj2)).next()).a(q.g(i)));
            }

            obj2 = ((wx) (obj1)).b().iterator();
            for (int k = 1; ((Iterator) (obj2)).hasNext(); k++)
            {
                hashmap.putAll(((a)((Iterator) (obj2)).next()).a(q.e(k)));
            }

            obj1 = ((wx) (obj1)).c().entrySet().iterator();
            for (int i1 = 1; ((Iterator) (obj1)).hasNext(); i1++)
            {
                java.util.Map.Entry entry2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                Object obj3 = (List)entry2.getValue();
                String s4 = com.google.android.gms.analytics.q.j(i1);
                obj3 = ((List) (obj3)).iterator();
                for (int j1 = 1; ((Iterator) (obj3)).hasNext(); j1++)
                {
                    hashmap.putAll(((a)((Iterator) (obj3)).next()).a((new StringBuilder()).append(s4).append(q.h(j1)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry2.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s4).append("nm").toString(), entry2.getKey());
                }
            }

        }
        obj1 = (ww)c1.a(com/google/android/gms/internal/ww);
        if (obj1 != null)
        {
            a(hashmap, "ul", ((ww) (obj1)).a());
            a(hashmap, "sd", ((ww) (obj1)).a);
            a(hashmap, "sr", ((ww) (obj1)).b, ((ww) (obj1)).c);
            a(hashmap, "vp", ((ww) (obj1)).d, ((ww) (obj1)).e);
        }
        c1 = (wu)c1.a(com/google/android/gms/internal/wu);
        if (c1 != null)
        {
            a(hashmap, "an", c1.a());
            a(hashmap, "aid", c1.c());
            a(hashmap, "aiid", c1.d());
            a(hashmap, "av", c1.b());
        }
        return hashmap;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final Uri a()
    {
        return d;
    }

    public final void a(c c1)
    {
        bl.a(c1);
        bl.b(c1.f(), "Can't deliver not submitted measurement");
        bl.c("deliver should be called on worker thread");
        Object obj = c1.a();
        Object obj1 = (sz)((c) (obj)).b(com/google/android/gms/internal/sz);
        if (TextUtils.isEmpty(((sz) (obj1)).a()))
        {
            n().a(b(((c) (obj))), "Ignoring measurement without type");
        } else
        {
            if (TextUtils.isEmpty(((sz) (obj1)).b()))
            {
                n().a(b(((c) (obj))), "Ignoring measurement without client id");
                return;
            }
            if (!b.j().e())
            {
                double d1 = ((sz) (obj1)).i();
                if (q.a(d1, ((sz) (obj1)).b()))
                {
                    b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d1));
                    return;
                }
                obj = b(((c) (obj)));
                ((Map) (obj)).put("v", "1");
                ((Map) (obj)).put("_v", z.b);
                ((Map) (obj)).put("tid", c);
                if (b.j().d())
                {
                    c1 = new StringBuilder();
                    for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); c1.append((String)((java.util.Map.Entry) (obj1)).getValue()))
                    {
                        obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                        if (c1.length() != 0)
                        {
                            c1.append(", ");
                        }
                        c1.append((String)((java.util.Map.Entry) (obj1)).getKey());
                        c1.append("=");
                    }

                    c("Dry run is enabled. GoogleAnalytics would have sent", c1.toString());
                    return;
                }
                HashMap hashmap = new HashMap();
                q.a(hashmap, "uid", ((sz) (obj1)).c());
                Object obj2 = (wu)c1.a(com/google/android/gms/internal/wu);
                if (obj2 != null)
                {
                    q.a(hashmap, "an", ((wu) (obj2)).a());
                    q.a(hashmap, "aid", ((wu) (obj2)).c());
                    q.a(hashmap, "av", ((wu) (obj2)).b());
                    q.a(hashmap, "aiid", ((wu) (obj2)).d());
                }
                obj2 = ((sz) (obj1)).b();
                String s1 = c;
                boolean flag;
                if (!TextUtils.isEmpty(((sz) (obj1)).d()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj1 = new ad(((String) (obj2)), s1, flag, 0L, hashmap);
                ((Map) (obj)).put("_s", String.valueOf(r().a(((ad) (obj1)))));
                c1 = new d(n(), ((Map) (obj)), c1.d(), true);
                r().a(c1);
                return;
            }
        }
    }
}

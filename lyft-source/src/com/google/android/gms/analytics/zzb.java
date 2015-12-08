// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.analytics.internal.zzab;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzc;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzh;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzio;
import com.google.android.gms.internal.zzip;
import com.google.android.gms.internal.zzno;
import com.google.android.gms.internal.zznu;
import com.google.android.gms.internal.zznx;
import com.google.android.gms.internal.zzny;
import com.google.android.gms.internal.zznz;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzob;
import com.google.android.gms.internal.zzoc;
import com.google.android.gms.internal.zzod;
import com.google.android.gms.internal.zzoe;
import com.google.android.gms.internal.zzof;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            zzc, GoogleAnalytics

public class zzb extends zzc
    implements zznu
{

    private static DecimalFormat a;
    private final zzf b;
    private final String c;
    private final Uri d;
    private final boolean e;
    private final boolean f;

    public zzb(zzf zzf1, String s)
    {
        this(zzf1, s, true, false);
    }

    public zzb(zzf zzf1, String s, boolean flag, boolean flag1)
    {
        super(zzf1);
        zzu.a(s);
        b = zzf1;
        c = s;
        e = flag;
        f = flag1;
        d = a(c);
    }

    static Uri a(String s)
    {
        zzu.a(s);
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

    private static void a(Map map, String s, int i, int j)
    {
        if (i > 0 && j > 0)
        {
            map.put(s, (new StringBuilder()).append(i).append("x").append(j).toString());
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

    public static Map b(zzno zzno1)
    {
        HashMap hashmap = new HashMap();
        Object obj = (zzio)zzno1.a(com/google/android/gms/internal/zzio);
        if (obj != null)
        {
            obj = ((zzio) (obj)).a().entrySet().iterator();
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
        obj = (zzip)zzno1.a(com/google/android/gms/internal/zzip);
        if (obj != null)
        {
            a(hashmap, "t", ((zzip) (obj)).a());
            a(hashmap, "cid", ((zzip) (obj)).b());
            a(hashmap, "uid", ((zzip) (obj)).c());
            a(hashmap, "sc", ((zzip) (obj)).f());
            a(hashmap, "sf", ((zzip) (obj)).h());
            a(hashmap, "ni", ((zzip) (obj)).g());
            a(hashmap, "adid", ((zzip) (obj)).d());
            a(hashmap, "ate", ((zzip) (obj)).e());
        }
        obj = (zzod)zzno1.a(com/google/android/gms/internal/zzod);
        if (obj != null)
        {
            a(hashmap, "cd", ((zzod) (obj)).b());
            a(hashmap, "a", ((zzod) (obj)).c());
            a(hashmap, "dr", ((zzod) (obj)).d());
        }
        obj = (zzob)zzno1.a(com/google/android/gms/internal/zzob);
        if (obj != null)
        {
            a(hashmap, "ec", ((zzob) (obj)).a());
            a(hashmap, "ea", ((zzob) (obj)).b());
            a(hashmap, "el", ((zzob) (obj)).c());
            a(hashmap, "ev", ((zzob) (obj)).d());
        }
        obj = (zzny)zzno1.a(com/google/android/gms/internal/zzny);
        if (obj != null)
        {
            a(hashmap, "cn", ((zzny) (obj)).a());
            a(hashmap, "cs", ((zzny) (obj)).b());
            a(hashmap, "cm", ((zzny) (obj)).c());
            a(hashmap, "ck", ((zzny) (obj)).d());
            a(hashmap, "cc", ((zzny) (obj)).e());
            a(hashmap, "ci", ((zzny) (obj)).f());
            a(hashmap, "anid", ((zzny) (obj)).g());
            a(hashmap, "gclid", ((zzny) (obj)).h());
            a(hashmap, "dclid", ((zzny) (obj)).i());
            a(hashmap, "aclid", ((zzny) (obj)).j());
        }
        obj = (zzoc)zzno1.a(com/google/android/gms/internal/zzoc);
        if (obj != null)
        {
            a(hashmap, "exd", ((zzoc) (obj)).a());
            a(hashmap, "exf", ((zzoc) (obj)).b());
        }
        obj = (zzoe)zzno1.a(com/google/android/gms/internal/zzoe);
        if (obj != null)
        {
            a(hashmap, "sn", ((zzoe) (obj)).a());
            a(hashmap, "sa", ((zzoe) (obj)).b());
            a(hashmap, "st", ((zzoe) (obj)).c());
        }
        obj = (zzof)zzno1.a(com/google/android/gms/internal/zzof);
        if (obj != null)
        {
            a(hashmap, "utv", ((zzof) (obj)).a());
            a(hashmap, "utt", ((zzof) (obj)).b());
            a(hashmap, "utc", ((zzof) (obj)).c());
            a(hashmap, "utl", ((zzof) (obj)).d());
        }
        obj = (zzim)zzno1.a(com/google/android/gms/internal/zzim);
        if (obj != null)
        {
            obj = ((zzim) (obj)).a().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s1 = zzc.a(((Integer)entry1.getKey()).intValue());
                if (!TextUtils.isEmpty(s1))
                {
                    hashmap.put(s1, entry1.getValue());
                }
            } while (true);
        }
        obj = (zzin)zzno1.a(com/google/android/gms/internal/zzin);
        if (obj != null)
        {
            obj = ((zzin) (obj)).a().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry2 = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s2 = zzc.b(((Integer)entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(s2))
                {
                    hashmap.put(s2, a(((Double)entry2.getValue()).doubleValue()));
                }
            } while (true);
        }
        obj = (zzoa)zzno1.a(com/google/android/gms/internal/zzoa);
        if (obj != null)
        {
            Object obj1 = ((zzoa) (obj)).a();
            if (obj1 != null)
            {
                for (obj1 = ((ProductAction) (obj1)).a().entrySet().iterator(); ((Iterator) (obj1)).hasNext();)
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
            obj1 = ((zzoa) (obj)).d().iterator();
            for (int i = 1; ((Iterator) (obj1)).hasNext(); i++)
            {
                hashmap.putAll(((Promotion)((Iterator) (obj1)).next()).a(zzc.f(i)));
            }

            obj1 = ((zzoa) (obj)).b().iterator();
            for (int j = 1; ((Iterator) (obj1)).hasNext(); j++)
            {
                hashmap.putAll(((Product)((Iterator) (obj1)).next()).a(zzc.d(j)));
            }

            obj = ((zzoa) (obj)).c().entrySet().iterator();
            for (int k = 1; ((Iterator) (obj)).hasNext(); k++)
            {
                java.util.Map.Entry entry3 = (java.util.Map.Entry)((Iterator) (obj)).next();
                Object obj2 = (List)entry3.getValue();
                String s3 = zzc.i(k);
                obj2 = ((List) (obj2)).iterator();
                for (int l = 1; ((Iterator) (obj2)).hasNext(); l++)
                {
                    hashmap.putAll(((Product)((Iterator) (obj2)).next()).a((new StringBuilder()).append(s3).append(zzc.g(l)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry3.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s3).append("nm").toString(), entry3.getKey());
                }
            }

        }
        obj = (zznz)zzno1.a(com/google/android/gms/internal/zznz);
        if (obj != null)
        {
            a(hashmap, "ul", ((zznz) (obj)).f());
            a(hashmap, "sd", ((zznz) (obj)).a());
            a(hashmap, "sr", ((zznz) (obj)).b(), ((zznz) (obj)).c());
            a(hashmap, "vp", ((zznz) (obj)).d(), ((zznz) (obj)).e());
        }
        zzno1 = (zznx)zzno1.a(com/google/android/gms/internal/zznx);
        if (zzno1 != null)
        {
            a(hashmap, "an", zzno1.a());
            a(hashmap, "aid", zzno1.c());
            a(hashmap, "aiid", zzno1.d());
            a(hashmap, "av", zzno1.b());
        }
        return hashmap;
    }

    public Uri a()
    {
        return d;
    }

    public void a(zzno zzno1)
    {
        zzu.a(zzno1);
        zzu.b(zzno1.f(), "Can't deliver not submitted measurement");
        zzu.c("deliver should be called on worker thread");
        Object obj1 = zzno1.a();
        Object obj = (zzip)((zzno) (obj1)).b(com/google/android/gms/internal/zzip);
        if (TextUtils.isEmpty(((zzip) (obj)).a()))
        {
            p().a(b(((zzno) (obj1))), "Ignoring measurement without type");
        } else
        {
            if (TextUtils.isEmpty(((zzip) (obj)).b()))
            {
                p().a(b(((zzno) (obj1))), "Ignoring measurement without client id");
                return;
            }
            if (!b.k().f())
            {
                double d1 = ((zzip) (obj)).h();
                if (zzam.a(d1, ((zzip) (obj)).b()))
                {
                    b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d1));
                    return;
                }
                obj1 = b(((zzno) (obj1)));
                ((Map) (obj1)).put("v", "1");
                ((Map) (obj1)).put("_v", zze.b);
                ((Map) (obj1)).put("tid", c);
                if (b.k().e())
                {
                    c("Dry run is enabled. GoogleAnalytics would have sent", a(((Map) (obj1))));
                    return;
                }
                HashMap hashmap = new HashMap();
                zzam.a(hashmap, "uid", ((zzip) (obj)).c());
                Object obj2 = (zznx)zzno1.a(com/google/android/gms/internal/zznx);
                if (obj2 != null)
                {
                    zzam.a(hashmap, "an", ((zznx) (obj2)).a());
                    zzam.a(hashmap, "aid", ((zznx) (obj2)).c());
                    zzam.a(hashmap, "av", ((zznx) (obj2)).b());
                    zzam.a(hashmap, "aiid", ((zznx) (obj2)).d());
                }
                obj2 = ((zzip) (obj)).b();
                String s = c;
                boolean flag;
                if (!TextUtils.isEmpty(((zzip) (obj)).d()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj = new zzh(0L, ((String) (obj2)), s, flag, 0L, hashmap);
                ((Map) (obj1)).put("_s", String.valueOf(t().a(((zzh) (obj)))));
                zzno1 = new zzab(p(), ((Map) (obj1)), zzno1.d(), true);
                t().a(zzno1);
                return;
            }
        }
    }
}

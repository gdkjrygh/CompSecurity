// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.analytics.internal.zzaa;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzc;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzg;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzgm;
import com.google.android.gms.internal.zzgn;
import com.google.android.gms.internal.zzgo;
import com.google.android.gms.internal.zzgp;
import com.google.android.gms.internal.zzkg;
import com.google.android.gms.internal.zzkm;
import com.google.android.gms.internal.zzkp;
import com.google.android.gms.internal.zzkq;
import com.google.android.gms.internal.zzkr;
import com.google.android.gms.internal.zzks;
import com.google.android.gms.internal.zzkt;
import com.google.android.gms.internal.zzku;
import com.google.android.gms.internal.zzkv;
import com.google.android.gms.internal.zzkw;
import com.google.android.gms.internal.zzkx;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            zzc, GoogleAnalytics

public class zzb extends zzc
    implements zzkm
{

    private static DecimalFormat zzEl;
    private final zze zzEb;
    private final String zzEm;
    private final Uri zzEn;
    private final boolean zzEo;
    private final boolean zzEp;

    public zzb(zze zze1, String s)
    {
        this(zze1, s, true, false);
    }

    public zzb(zze zze1, String s, boolean flag, boolean flag1)
    {
        super(zze1);
        zzv.zzbS(s);
        zzEb = zze1;
        zzEm = s;
        zzEo = flag;
        zzEp = flag1;
        zzEn = zzav(zzEm);
    }

    static String zza(double d)
    {
        if (zzEl == null)
        {
            zzEl = new DecimalFormat("0.######");
        }
        return zzEl.format(d);
    }

    private static void zza(Map map, String s, double d)
    {
        if (d != 0.0D)
        {
            map.put(s, zza(d));
        }
    }

    private static void zza(Map map, String s, int i, int j)
    {
        if (i > 0 && j > 0)
        {
            map.put(s, (new StringBuilder()).append(i).append("x").append(j).toString());
        }
    }

    private static void zza(Map map, String s, String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            map.put(s, s1);
        }
    }

    private static void zza(Map map, String s, boolean flag)
    {
        if (flag)
        {
            map.put(s, "1");
        }
    }

    static Uri zzav(String s)
    {
        zzv.zzbS(s);
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(s);
        return builder.build();
    }

    public static Map zzc(zzkg zzkg1)
    {
        HashMap hashmap = new HashMap();
        Object obj = (zzgo)zzkg1.zzd(com/google/android/gms/internal/zzgo);
        if (obj != null)
        {
            obj = ((zzgo) (obj)).zzgj().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s = zze(entry.getValue());
                if (s != null)
                {
                    hashmap.put(entry.getKey(), s);
                }
            } while (true);
        }
        obj = (zzgp)zzkg1.zzd(com/google/android/gms/internal/zzgp);
        if (obj != null)
        {
            zza(hashmap, "t", ((zzgp) (obj)).zzgk());
            zza(hashmap, "cid", ((zzgp) (obj)).getClientId());
            zza(hashmap, "uid", ((zzgp) (obj)).zzgl());
            zza(hashmap, "sc", ((zzgp) (obj)).zzgo());
            zza(hashmap, "sf", ((zzgp) (obj)).zzgq());
            zza(hashmap, "ni", ((zzgp) (obj)).zzgp());
            zza(hashmap, "adid", ((zzgp) (obj)).zzgm());
            zza(hashmap, "ate", ((zzgp) (obj)).zzgn());
        }
        obj = (zzkv)zzkg1.zzd(com/google/android/gms/internal/zzkv);
        if (obj != null)
        {
            zza(hashmap, "cd", ((zzkv) (obj)).zzuL());
            zza(hashmap, "a", ((zzkv) (obj)).zzaJ());
            zza(hashmap, "dr", ((zzkv) (obj)).zzuO());
        }
        obj = (zzkt)zzkg1.zzd(com/google/android/gms/internal/zzkt);
        if (obj != null)
        {
            zza(hashmap, "ec", ((zzkt) (obj)).zzuI());
            zza(hashmap, "ea", ((zzkt) (obj)).getAction());
            zza(hashmap, "el", ((zzkt) (obj)).getLabel());
            zza(hashmap, "ev", ((zzkt) (obj)).getValue());
        }
        obj = (zzkq)zzkg1.zzd(com/google/android/gms/internal/zzkq);
        if (obj != null)
        {
            zza(hashmap, "cn", ((zzkq) (obj)).getName());
            zza(hashmap, "cs", ((zzkq) (obj)).getSource());
            zza(hashmap, "cm", ((zzkq) (obj)).zzut());
            zza(hashmap, "ck", ((zzkq) (obj)).zzuu());
            zza(hashmap, "cc", ((zzkq) (obj)).getContent());
            zza(hashmap, "ci", ((zzkq) (obj)).getId());
            zza(hashmap, "anid", ((zzkq) (obj)).zzuv());
            zza(hashmap, "gclid", ((zzkq) (obj)).zzuw());
            zza(hashmap, "dclid", ((zzkq) (obj)).zzux());
            zza(hashmap, "aclid", ((zzkq) (obj)).zzuy());
        }
        obj = (zzku)zzkg1.zzd(com/google/android/gms/internal/zzku);
        if (obj != null)
        {
            zza(hashmap, "exd", ((zzku) (obj)).getDescription());
            zza(hashmap, "exf", ((zzku) (obj)).zzuJ());
        }
        obj = (zzkw)zzkg1.zzd(com/google/android/gms/internal/zzkw);
        if (obj != null)
        {
            zza(hashmap, "sn", ((zzkw) (obj)).zzuS());
            zza(hashmap, "sa", ((zzkw) (obj)).getAction());
            zza(hashmap, "st", ((zzkw) (obj)).getTarget());
        }
        obj = (zzkx)zzkg1.zzd(com/google/android/gms/internal/zzkx);
        if (obj != null)
        {
            zza(hashmap, "utv", ((zzkx) (obj)).zzuT());
            zza(hashmap, "utt", ((zzkx) (obj)).getTimeInMillis());
            zza(hashmap, "utc", ((zzkx) (obj)).zzuI());
            zza(hashmap, "utl", ((zzkx) (obj)).getLabel());
        }
        obj = (zzgm)zzkg1.zzd(com/google/android/gms/internal/zzgm);
        if (obj != null)
        {
            obj = ((zzgm) (obj)).zzgh().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s1 = com.google.android.gms.analytics.zzc.zzF(((Integer)entry1.getKey()).intValue());
                if (!TextUtils.isEmpty(s1))
                {
                    hashmap.put(s1, entry1.getValue());
                }
            } while (true);
        }
        obj = (zzgn)zzkg1.zzd(com/google/android/gms/internal/zzgn);
        if (obj != null)
        {
            obj = ((zzgn) (obj)).zzgi().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry2 = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s2 = com.google.android.gms.analytics.zzc.zzH(((Integer)entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(s2))
                {
                    hashmap.put(s2, zza(((Double)entry2.getValue()).doubleValue()));
                }
            } while (true);
        }
        obj = (zzks)zzkg1.zzd(com/google/android/gms/internal/zzks);
        if (obj != null)
        {
            Object obj1 = ((zzks) (obj)).zzuE();
            if (obj1 != null)
            {
                for (obj1 = ((ProductAction) (obj1)).build().entrySet().iterator(); ((Iterator) (obj1)).hasNext();)
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
            obj1 = ((zzks) (obj)).zzuH().iterator();
            for (int i = 1; ((Iterator) (obj1)).hasNext(); i++)
            {
                hashmap.putAll(((Promotion)((Iterator) (obj1)).next()).zzaC(com.google.android.gms.analytics.zzc.zzL(i)));
            }

            obj1 = ((zzks) (obj)).zzuF().iterator();
            for (int j = 1; ((Iterator) (obj1)).hasNext(); j++)
            {
                hashmap.putAll(((Product)((Iterator) (obj1)).next()).zzaC(com.google.android.gms.analytics.zzc.zzJ(j)));
            }

            obj = ((zzks) (obj)).zzuG().entrySet().iterator();
            for (int k = 1; ((Iterator) (obj)).hasNext(); k++)
            {
                java.util.Map.Entry entry3 = (java.util.Map.Entry)((Iterator) (obj)).next();
                Object obj2 = (List)entry3.getValue();
                String s3 = com.google.android.gms.analytics.zzc.zzO(k);
                obj2 = ((List) (obj2)).iterator();
                for (int l = 1; ((Iterator) (obj2)).hasNext(); l++)
                {
                    hashmap.putAll(((Product)((Iterator) (obj2)).next()).zzaC((new StringBuilder()).append(s3).append(com.google.android.gms.analytics.zzc.zzM(l)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry3.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s3).append("nm").toString(), entry3.getKey());
                }
            }

        }
        obj = (zzkr)zzkg1.zzd(com/google/android/gms/internal/zzkr);
        if (obj != null)
        {
            zza(hashmap, "ul", ((zzkr) (obj)).getLanguage());
            zza(hashmap, "sd", ((zzkr) (obj)).zzuz());
            zza(hashmap, "sr", ((zzkr) (obj)).zzuA(), ((zzkr) (obj)).zzuB());
            zza(hashmap, "vp", ((zzkr) (obj)).zzuC(), ((zzkr) (obj)).zzuD());
        }
        zzkg1 = (zzkp)zzkg1.zzd(com/google/android/gms/internal/zzkp);
        if (zzkg1 != null)
        {
            zza(hashmap, "an", zzkg1.zziE());
            zza(hashmap, "aid", zzkg1.zzqT());
            zza(hashmap, "aiid", zzkg1.zzus());
            zza(hashmap, "av", zzkg1.zziG());
        }
        return hashmap;
    }

    private static String zze(Object obj)
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
                    return zza(((Double) (obj)).doubleValue());
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

    private static String zzy(Map map)
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

    public void zzb(zzkg zzkg1)
    {
        zzv.zzr(zzkg1);
        zzv.zzb(zzkg1.zzue(), "Can't deliver not submitted measurement");
        zzv.zzbJ("deliver should be called on worker thread");
        Object obj1 = zzkg1.zztZ();
        Object obj = (zzgp)((zzkg) (obj1)).zze(com/google/android/gms/internal/zzgp);
        if (TextUtils.isEmpty(((zzgp) (obj)).zzgk()))
        {
            zzgH().zze(zzc(((zzkg) (obj1))), "Ignoring measurement without type");
        } else
        {
            if (TextUtils.isEmpty(((zzgp) (obj)).getClientId()))
            {
                zzgH().zze(zzc(((zzkg) (obj1))), "Ignoring measurement without client id");
                return;
            }
            if (!zzEb.zzgV().getAppOptOut())
            {
                double d = ((zzgp) (obj)).zzgq();
                if (zzal.zza(d, ((zzgp) (obj)).getClientId()))
                {
                    zzb("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d));
                    return;
                }
                obj1 = zzc(((zzkg) (obj1)));
                ((Map) (obj1)).put("v", "1");
                ((Map) (obj1)).put("_v", "ma4.5.0");
                ((Map) (obj1)).put("tid", zzEm);
                if (zzEb.zzgV().isDryRunEnabled())
                {
                    zzc("Dry run is enabled. GoogleAnalytics would have sent", zzy(((Map) (obj1))));
                    return;
                }
                HashMap hashmap = new HashMap();
                zzal.zzb(hashmap, "uid", ((zzgp) (obj)).zzgl());
                Object obj2 = (zzkp)zzkg1.zzd(com/google/android/gms/internal/zzkp);
                if (obj2 != null)
                {
                    zzal.zzb(hashmap, "an", ((zzkp) (obj2)).zziE());
                    zzal.zzb(hashmap, "aid", ((zzkp) (obj2)).zzqT());
                    zzal.zzb(hashmap, "av", ((zzkp) (obj2)).zziG());
                    zzal.zzb(hashmap, "aiid", ((zzkp) (obj2)).zzus());
                }
                obj2 = ((zzgp) (obj)).getClientId();
                String s = zzEm;
                boolean flag;
                if (!TextUtils.isEmpty(((zzgp) (obj)).zzgm()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj = new zzg(0L, ((String) (obj2)), s, flag, 0L, hashmap);
                ((Map) (obj1)).put("_s", String.valueOf(zzfZ().zza(((zzg) (obj)))));
                zzkg1 = new zzaa(zzgH(), ((Map) (obj1)), zzkg1.zzuc(), true);
                zzfZ().zza(zzkg1);
                return;
            }
        }
    }

    public Uri zzfR()
    {
        return zzEn;
    }
}

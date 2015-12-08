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

    private static DecimalFormat zzIk;
    private final zzf zzIa;
    private final Uri zzIl;
    private final boolean zzIm;
    private final boolean zzIn;
    private final String zztd;

    public zzb(zzf zzf1, String s)
    {
        this(zzf1, s, true, false);
    }

    public zzb(zzf zzf1, String s, boolean flag, boolean flag1)
    {
        super(zzf1);
        zzu.zzcj(s);
        zzIa = zzf1;
        zztd = s;
        zzIm = flag;
        zzIn = flag1;
        zzIl = zzaK(zztd);
    }

    static String zza(double d)
    {
        if (zzIk == null)
        {
            zzIk = new DecimalFormat("0.######");
        }
        return zzIk.format(d);
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

    static Uri zzaK(String s)
    {
        zzu.zzcj(s);
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(s);
        return builder.build();
    }

    public static Map zzc(zzno zzno1)
    {
        HashMap hashmap = new HashMap();
        Object obj = (zzio)zzno1.zzd(com/google/android/gms/internal/zzio);
        if (obj != null)
        {
            obj = ((zzio) (obj)).zzhv().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s = zzh(entry.getValue());
                if (s != null)
                {
                    hashmap.put(entry.getKey(), s);
                }
            } while (true);
        }
        obj = (zzip)zzno1.zzd(com/google/android/gms/internal/zzip);
        if (obj != null)
        {
            zza(hashmap, "t", ((zzip) (obj)).zzhw());
            zza(hashmap, "cid", ((zzip) (obj)).getClientId());
            zza(hashmap, "uid", ((zzip) (obj)).getUserId());
            zza(hashmap, "sc", ((zzip) (obj)).zzhz());
            zza(hashmap, "sf", ((zzip) (obj)).zzhB());
            zza(hashmap, "ni", ((zzip) (obj)).zzhA());
            zza(hashmap, "adid", ((zzip) (obj)).zzhx());
            zza(hashmap, "ate", ((zzip) (obj)).zzhy());
        }
        obj = (zzod)zzno1.zzd(com/google/android/gms/internal/zzod);
        if (obj != null)
        {
            zza(hashmap, "cd", ((zzod) (obj)).zzwB());
            zza(hashmap, "a", ((zzod) (obj)).zzbn());
            zza(hashmap, "dr", ((zzod) (obj)).zzwE());
        }
        obj = (zzob)zzno1.zzd(com/google/android/gms/internal/zzob);
        if (obj != null)
        {
            zza(hashmap, "ec", ((zzob) (obj)).zzwy());
            zza(hashmap, "ea", ((zzob) (obj)).getAction());
            zza(hashmap, "el", ((zzob) (obj)).getLabel());
            zza(hashmap, "ev", ((zzob) (obj)).getValue());
        }
        obj = (zzny)zzno1.zzd(com/google/android/gms/internal/zzny);
        if (obj != null)
        {
            zza(hashmap, "cn", ((zzny) (obj)).getName());
            zza(hashmap, "cs", ((zzny) (obj)).getSource());
            zza(hashmap, "cm", ((zzny) (obj)).zzwj());
            zza(hashmap, "ck", ((zzny) (obj)).zzwk());
            zza(hashmap, "cc", ((zzny) (obj)).getContent());
            zza(hashmap, "ci", ((zzny) (obj)).getId());
            zza(hashmap, "anid", ((zzny) (obj)).zzwl());
            zza(hashmap, "gclid", ((zzny) (obj)).zzwm());
            zza(hashmap, "dclid", ((zzny) (obj)).zzwn());
            zza(hashmap, "aclid", ((zzny) (obj)).zzwo());
        }
        obj = (zzoc)zzno1.zzd(com/google/android/gms/internal/zzoc);
        if (obj != null)
        {
            zza(hashmap, "exd", ((zzoc) (obj)).getDescription());
            zza(hashmap, "exf", ((zzoc) (obj)).zzwz());
        }
        obj = (zzoe)zzno1.zzd(com/google/android/gms/internal/zzoe);
        if (obj != null)
        {
            zza(hashmap, "sn", ((zzoe) (obj)).zzwI());
            zza(hashmap, "sa", ((zzoe) (obj)).getAction());
            zza(hashmap, "st", ((zzoe) (obj)).getTarget());
        }
        obj = (zzof)zzno1.zzd(com/google/android/gms/internal/zzof);
        if (obj != null)
        {
            zza(hashmap, "utv", ((zzof) (obj)).zzwJ());
            zza(hashmap, "utt", ((zzof) (obj)).getTimeInMillis());
            zza(hashmap, "utc", ((zzof) (obj)).zzwy());
            zza(hashmap, "utl", ((zzof) (obj)).getLabel());
        }
        obj = (zzim)zzno1.zzd(com/google/android/gms/internal/zzim);
        if (obj != null)
        {
            obj = ((zzim) (obj)).zzht().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s1 = com.google.android.gms.analytics.zzc.zzO(((Integer)entry1.getKey()).intValue());
                if (!TextUtils.isEmpty(s1))
                {
                    hashmap.put(s1, entry1.getValue());
                }
            } while (true);
        }
        obj = (zzin)zzno1.zzd(com/google/android/gms/internal/zzin);
        if (obj != null)
        {
            obj = ((zzin) (obj)).zzhu().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry2 = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s2 = com.google.android.gms.analytics.zzc.zzQ(((Integer)entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(s2))
                {
                    hashmap.put(s2, zza(((Double)entry2.getValue()).doubleValue()));
                }
            } while (true);
        }
        obj = (zzoa)zzno1.zzd(com/google/android/gms/internal/zzoa);
        if (obj != null)
        {
            Object obj1 = ((zzoa) (obj)).zzwu();
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
            obj1 = ((zzoa) (obj)).zzwx().iterator();
            for (int i = 1; ((Iterator) (obj1)).hasNext(); i++)
            {
                hashmap.putAll(((Promotion)((Iterator) (obj1)).next()).zzaQ(com.google.android.gms.analytics.zzc.zzU(i)));
            }

            obj1 = ((zzoa) (obj)).zzwv().iterator();
            for (int j = 1; ((Iterator) (obj1)).hasNext(); j++)
            {
                hashmap.putAll(((Product)((Iterator) (obj1)).next()).zzaQ(com.google.android.gms.analytics.zzc.zzS(j)));
            }

            obj = ((zzoa) (obj)).zzww().entrySet().iterator();
            for (int k = 1; ((Iterator) (obj)).hasNext(); k++)
            {
                java.util.Map.Entry entry3 = (java.util.Map.Entry)((Iterator) (obj)).next();
                Object obj2 = (List)entry3.getValue();
                String s3 = com.google.android.gms.analytics.zzc.zzX(k);
                obj2 = ((List) (obj2)).iterator();
                for (int l = 1; ((Iterator) (obj2)).hasNext(); l++)
                {
                    hashmap.putAll(((Product)((Iterator) (obj2)).next()).zzaQ((new StringBuilder()).append(s3).append(com.google.android.gms.analytics.zzc.zzV(l)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry3.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s3).append("nm").toString(), entry3.getKey());
                }
            }

        }
        obj = (zznz)zzno1.zzd(com/google/android/gms/internal/zznz);
        if (obj != null)
        {
            zza(hashmap, "ul", ((zznz) (obj)).getLanguage());
            zza(hashmap, "sd", ((zznz) (obj)).zzwp());
            zza(hashmap, "sr", ((zznz) (obj)).zzwq(), ((zznz) (obj)).zzwr());
            zza(hashmap, "vp", ((zznz) (obj)).zzws(), ((zznz) (obj)).zzwt());
        }
        zzno1 = (zznx)zzno1.zzd(com/google/android/gms/internal/zznx);
        if (zzno1 != null)
        {
            zza(hashmap, "an", zzno1.zzjL());
            zza(hashmap, "aid", zzno1.zzsK());
            zza(hashmap, "aiid", zzno1.zzwi());
            zza(hashmap, "av", zzno1.zzjN());
        }
        return hashmap;
    }

    private static String zzh(Object obj)
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

    private static String zzz(Map map)
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

    public void zzb(zzno zzno1)
    {
        zzu.zzu(zzno1);
        zzu.zzb(zzno1.zzvU(), "Can't deliver not submitted measurement");
        zzu.zzbZ("deliver should be called on worker thread");
        Object obj1 = zzno1.zzvP();
        Object obj = (zzip)((zzno) (obj1)).zze(com/google/android/gms/internal/zzip);
        if (TextUtils.isEmpty(((zzip) (obj)).zzhw()))
        {
            zzhQ().zzg(zzc(((zzno) (obj1))), "Ignoring measurement without type");
        } else
        {
            if (TextUtils.isEmpty(((zzip) (obj)).getClientId()))
            {
                zzhQ().zzg(zzc(((zzno) (obj1))), "Ignoring measurement without client id");
                return;
            }
            if (!zzIa.zzie().getAppOptOut())
            {
                double d = ((zzip) (obj)).zzhB();
                if (zzam.zza(d, ((zzip) (obj)).getClientId()))
                {
                    zzb("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d));
                    return;
                }
                obj1 = zzc(((zzno) (obj1)));
                ((Map) (obj1)).put("v", "1");
                ((Map) (obj1)).put("_v", zze.zzJB);
                ((Map) (obj1)).put("tid", zztd);
                if (zzIa.zzie().isDryRunEnabled())
                {
                    zzc("Dry run is enabled. GoogleAnalytics would have sent", zzz(((Map) (obj1))));
                    return;
                }
                HashMap hashmap = new HashMap();
                zzam.zzb(hashmap, "uid", ((zzip) (obj)).getUserId());
                Object obj2 = (zznx)zzno1.zzd(com/google/android/gms/internal/zznx);
                if (obj2 != null)
                {
                    zzam.zzb(hashmap, "an", ((zznx) (obj2)).zzjL());
                    zzam.zzb(hashmap, "aid", ((zznx) (obj2)).zzsK());
                    zzam.zzb(hashmap, "av", ((zznx) (obj2)).zzjN());
                    zzam.zzb(hashmap, "aiid", ((zznx) (obj2)).zzwi());
                }
                obj2 = ((zzip) (obj)).getClientId();
                String s = zztd;
                boolean flag;
                if (!TextUtils.isEmpty(((zzip) (obj)).zzhx()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj = new zzh(0L, ((String) (obj2)), s, flag, 0L, hashmap);
                ((Map) (obj1)).put("_s", String.valueOf(zzhl().zza(((zzh) (obj)))));
                zzno1 = new zzab(zzhQ(), ((Map) (obj1)), zzno1.zzvS(), true);
                zzhl().zza(zzno1);
                return;
            }
        }
    }

    public Uri zzhe()
    {
        return zzIl;
    }
}

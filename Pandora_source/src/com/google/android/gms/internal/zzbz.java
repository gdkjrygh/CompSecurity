// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzfm, zzdb, zzgd, 
//            zzge, zzbu, zzfl

public final class zzbz
    implements zzbs
{

    private final com.google.android.gms.ads.internal.zzb zztH;
    private final zzdb zztI;
    private final zzbu zztK;

    public zzbz(zzbu zzbu1, com.google.android.gms.ads.internal.zzb zzb1, zzdb zzdb1)
    {
        zztK = zzbu1;
        zztH = zzb1;
        zztI = zzdb1;
    }

    private static boolean zzc(Map map)
    {
        return "1".equals(map.get("custom_close"));
    }

    private static int zzd(Map map)
    {
        map = (String)map.get("o");
        if (map != null)
        {
            if ("p".equalsIgnoreCase(map))
            {
                return zzh.zzaS().zzff();
            }
            if ("l".equalsIgnoreCase(map))
            {
                return zzh.zzaS().zzfe();
            }
            if ("c".equalsIgnoreCase(map))
            {
                return zzh.zzaS().zzfg();
            }
        }
        return -1;
    }

    private void zzm(boolean flag)
    {
        if (zztI != null)
        {
            zztI.zzn(flag);
        }
    }

    public void zza(zzgd zzgd1, Map map)
    {
        String s = (String)map.get("a");
        if (s == null)
        {
            zzb.zzan("Action missing from an open GMSG.");
        } else
        {
            if (zztH != null && !zztH.zzaF())
            {
                zztH.zze((String)map.get("u"));
                return;
            }
            zzge zzge1 = zzgd1.zzft();
            if ("expand".equalsIgnoreCase(s))
            {
                if (zzgd1.zzfx())
                {
                    zzb.zzan("Cannot expand WebView that is already expanded.");
                    return;
                } else
                {
                    zzm(false);
                    zzge1.zza(zzc(map), zzd(map));
                    return;
                }
            }
            if ("webapp".equalsIgnoreCase(s))
            {
                zzgd1 = (String)map.get("u");
                zzm(false);
                if (zzgd1 != null)
                {
                    zzge1.zza(zzc(map), zzd(map), zzgd1);
                    return;
                } else
                {
                    zzge1.zza(zzc(map), zzd(map), (String)map.get("html"), (String)map.get("baseurl"));
                    return;
                }
            }
            if ("in_app_purchase".equalsIgnoreCase(s))
            {
                zzgd1 = (String)map.get("product_id");
                map = (String)map.get("report_urls");
                if (zztK != null)
                {
                    if (map != null && !map.isEmpty())
                    {
                        map = map.split(" ");
                        zztK.zza(zzgd1, new ArrayList(Arrays.asList(map)));
                        return;
                    } else
                    {
                        zztK.zza(zzgd1, new ArrayList());
                        return;
                    }
                }
            } else
            {
                zzm(true);
                zzgd1.zzfv();
                String s1 = (String)map.get("u");
                if (!TextUtils.isEmpty(s1))
                {
                    zzgd1 = zzh.zzaQ().zzb(zzgd1, s1);
                } else
                {
                    zzgd1 = s1;
                }
                zzge1.zza(new AdLauncherIntentInfoParcel((String)map.get("i"), zzgd1, (String)map.get("m"), (String)map.get("p"), (String)map.get("c"), (String)map.get("f"), (String)map.get("e")));
                return;
            }
        }
    }
}

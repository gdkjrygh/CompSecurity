// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzcv, zzab, zzhp, zzeb, 
//            zzhx, zzu, zzic, zzid, 
//            zzcw, zzho, zzek

public final class zzda
    implements zzcv
{

    private final zzu zzrK;
    private final zzeb zzrL;
    private final zzcw zzrN;

    public zzda(zzcw zzcw1, zzu zzu1, zzeb zzeb1)
    {
        zzrN = zzcw1;
        zzrK = zzu1;
        zzrL = zzeb1;
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
                return zzab.zzaO().zzey();
            }
            if ("l".equalsIgnoreCase(map))
            {
                return zzab.zzaO().zzex();
            }
            if ("c".equalsIgnoreCase(map))
            {
                return zzab.zzaO().zzez();
            }
        }
        return -1;
    }

    private void zzl(boolean flag)
    {
        if (zzrL != null)
        {
            zzrL.zzm(flag);
        }
    }

    public final void zza(zzic zzic1, Map map)
    {
        String s = (String)map.get("a");
        if (s == null)
        {
            zzhx.zzac("Action missing from an open GMSG.");
        } else
        {
            if (zzrK != null && !zzrK.zzaB())
            {
                zzrK.zzd((String)map.get("u"));
                return;
            }
            zzid zzid1 = zzic1.zzeG();
            if ("expand".equalsIgnoreCase(s))
            {
                if (zzic1.zzeK())
                {
                    zzhx.zzac("Cannot expand WebView that is already expanded.");
                    return;
                } else
                {
                    zzl(false);
                    zzid1.zza(zzc(map), zzd(map));
                    return;
                }
            }
            if ("webapp".equalsIgnoreCase(s))
            {
                zzic1 = (String)map.get("u");
                zzl(false);
                if (zzic1 != null)
                {
                    zzid1.zza(zzc(map), zzd(map), zzic1);
                    return;
                } else
                {
                    zzid1.zza(zzc(map), zzd(map), (String)map.get("html"), (String)map.get("baseurl"));
                    return;
                }
            }
            if ("in_app_purchase".equalsIgnoreCase(s))
            {
                zzic1 = (String)map.get("product_id");
                map = (String)map.get("report_urls");
                if (zzrN != null)
                {
                    if (map != null && !map.isEmpty())
                    {
                        map = map.split(" ");
                        zzrN.zza(zzic1, new ArrayList(Arrays.asList(map)));
                        return;
                    } else
                    {
                        zzrN.zza(zzic1, new ArrayList());
                        return;
                    }
                }
            } else
            {
                zzl(true);
                zzic1.zzeI();
                String s1 = (String)map.get("u");
                if (!TextUtils.isEmpty(s1))
                {
                    zzic1 = zzab.zzaM().zzb(zzic1, s1);
                } else
                {
                    zzic1 = s1;
                }
                zzid1.zza(new zzek((String)map.get("i"), zzic1, (String)map.get("m"), (String)map.get("p"), (String)map.get("c"), (String)map.get("f"), (String)map.get("e")));
                return;
            }
        }
    }
}

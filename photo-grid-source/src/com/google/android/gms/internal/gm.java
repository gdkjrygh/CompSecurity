// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fz, kg, qd, ry, 
//            zzja, gh, gn, go, 
//            qa

public final class gm
    implements fz
{

    private final gh a;
    private final zze b;
    private final kg c;

    public gm(gh gh1, zze zze1, kg kg1)
    {
        a = gh1;
        b = zze1;
        c = kg1;
    }

    private void a(boolean flag)
    {
        if (c != null)
        {
            c.a(flag);
        }
    }

    private static boolean a(Map map)
    {
        return "1".equals(map.get("custom_close"));
    }

    private static int b(Map map)
    {
        map = (String)map.get("o");
        if (map != null)
        {
            if ("p".equalsIgnoreCase(map))
            {
                return zzp.zzbx().b();
            }
            if ("l".equalsIgnoreCase(map))
            {
                return zzp.zzbx().a();
            }
            if ("c".equalsIgnoreCase(map))
            {
                return zzp.zzbx().c();
            }
        }
        return -1;
    }

    public final void zza(ry ry1, Map map)
    {
        String s = (String)map.get("a");
        if (s == null)
        {
            zzb.zzaH("Action missing from an open GMSG.");
        } else
        {
            if (b != null && !b.zzbe())
            {
                b.zzp((String)map.get("u"));
                return;
            }
            zzja zzja1 = ry1.k();
            if ("expand".equalsIgnoreCase(s))
            {
                if (ry1.o())
                {
                    zzb.zzaH("Cannot expand WebView that is already expanded.");
                    return;
                } else
                {
                    a(false);
                    zzja1.zza(a(map), b(map));
                    return;
                }
            }
            if ("webapp".equalsIgnoreCase(s))
            {
                ry1 = (String)map.get("u");
                a(false);
                if (ry1 != null)
                {
                    zzja1.zza(a(map), b(map), ry1);
                    return;
                } else
                {
                    zzja1.zza(a(map), b(map), (String)map.get("html"), (String)map.get("baseurl"));
                    return;
                }
            }
            if ("in_app_purchase".equalsIgnoreCase(s))
            {
                ry1 = (String)map.get("product_id");
                map = (String)map.get("report_urls");
                if (a != null)
                {
                    if (map != null && !map.isEmpty())
                    {
                        map = map.split(" ");
                        a.zza(ry1, new ArrayList(Arrays.asList(map)));
                        return;
                    } else
                    {
                        a.zza(ry1, new ArrayList());
                        return;
                    }
                }
            } else
            {
                if ("app".equalsIgnoreCase(s) && "true".equalsIgnoreCase((String)map.get("play_store")))
                {
                    map = (String)map.get("u");
                    if (TextUtils.isEmpty(map))
                    {
                        zzb.zzaH("Destination url cannot be empty.");
                        return;
                    } else
                    {
                        (new gn(ry1, map)).zzgz();
                        return;
                    }
                }
                if ("app".equalsIgnoreCase(s) && "true".equalsIgnoreCase((String)map.get("system_browser")))
                {
                    ry1 = ry1.getContext();
                    if (TextUtils.isEmpty((String)map.get("u")))
                    {
                        zzb.zzaH("Destination url cannot be empty.");
                        return;
                    }
                    new go();
                    map = go.a(ry1, map);
                    try
                    {
                        zzp.zzbv();
                        qa.a(ry1, map);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (ry ry1)
                    {
                        zzb.zzaH(ry1.getMessage());
                    }
                    return;
                }
                a(true);
                s = (String)map.get("u");
                if (!TextUtils.isEmpty(s))
                {
                    zzp.zzbv();
                    ry1 = qa.a(ry1.getContext(), ry1.m(), s);
                } else
                {
                    ry1 = s;
                }
                zzja1.zza(new AdLauncherIntentInfoParcel((String)map.get("i"), ry1, (String)map.get("m"), (String)map.get("p"), (String)map.get("c"), (String)map.get("f"), (String)map.get("e")));
                return;
            }
        }
    }
}

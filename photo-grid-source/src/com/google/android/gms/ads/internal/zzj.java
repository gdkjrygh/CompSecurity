// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzo;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ey;
import com.google.android.gms.internal.fb;
import com.google.android.gms.internal.ip;
import com.google.android.gms.internal.wb;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzi

public class zzj extends com.google.android.gms.ads.internal.client.zzq.zza
{

    private zzo a;
    private es b;
    private ev c;
    private wb d;
    private wb e;
    private NativeAdOptionsParcel f;
    private final Context g;
    private final ip h;
    private final String i;
    private final VersionInfoParcel j;

    public zzj(Context context, String s, ip ip, VersionInfoParcel versioninfoparcel)
    {
        g = context;
        i = s;
        h = ip;
        j = versioninfoparcel;
        e = new wb();
        d = new wb();
    }

    public void zza(NativeAdOptionsParcel nativeadoptionsparcel)
    {
        f = nativeadoptionsparcel;
    }

    public void zza(es es)
    {
        b = es;
    }

    public void zza(ev ev)
    {
        c = ev;
    }

    public void zza(String s, fb fb, ey ey)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        } else
        {
            e.put(s, fb);
            d.put(s, ey);
            return;
        }
    }

    public void zzb(zzo zzo)
    {
        a = zzo;
    }

    public zzp zzbk()
    {
        return new zzi(g, i, h, j, a, b, c, e, d, f);
    }
}

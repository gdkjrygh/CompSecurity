// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzp;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            bg, sf, ry, qa, 
//            zzja, br, bo, bn, 
//            bm, bu, bq, bp, 
//            ad, fl, bh, fz, 
//            bt

public final class bl
    implements bg
{

    private final ry a;

    public bl(Context context, VersionInfoParcel versioninfoparcel, ad ad)
    {
        zzp.zzbw();
        a = sf.a(context, new AdSizeParcel(), false, false, ad, versioninfoparcel);
        a.a().setWillNotDraw(true);
    }

    static ry a(bl bl1)
    {
        return bl1.a;
    }

    private static void a(Runnable runnable)
    {
        if (zzl.zzcF().zzgT())
        {
            runnable.run();
            return;
        } else
        {
            qa.a.post(runnable);
            return;
        }
    }

    public final void a()
    {
        a.destroy();
    }

    public final void a(com.google.android.gms.ads.internal.client.zza zza1, zzg zzg, fl fl, zzn zzn)
    {
        a.k().zzb(zza1, zzg, fl, zzn, false, null, null, new zze(false), null);
    }

    public final void a(bh bh)
    {
        a.k().zza(new br(this, bh));
    }

    public final void a(String s)
    {
        a(((Runnable) (new bo(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[] {
            s
        })))));
    }

    public final void a(String s, fz fz)
    {
        a.k().zza(s, fz);
    }

    public final void a(String s, String s1)
    {
        a(((Runnable) (new bn(this, s, s1))));
    }

    public final void a(String s, JSONObject jsonobject)
    {
        a(((Runnable) (new bm(this, s, jsonobject))));
    }

    public final bt b()
    {
        return new bu(this);
    }

    public final void b(String s)
    {
        a(new bq(this, s));
    }

    public final void b(String s, fz fz)
    {
        a.k().zzb(s, fz);
    }

    public final void b(String s, JSONObject jsonobject)
    {
        a.a(s, jsonobject);
    }

    public final void c(String s)
    {
        a(new bp(this, s));
    }
}

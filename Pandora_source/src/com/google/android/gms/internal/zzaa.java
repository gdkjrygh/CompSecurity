// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.overlay.zzf;
import com.google.android.gms.ads.internal.overlay.zzi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzh;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzy, zzgf, zzfl, zzgd, 
//            zzge, zzbq, zzbu, zzbw, 
//            zzdh, zzbs

public class zzaa
    implements zzy
{

    private final zzgd zznp;

    public zzaa(Context context, VersionInfoParcel versioninfoparcel)
    {
        zznp = com.google.android.gms.ads.internal.zzh.zzaR().zza(context, new AdSizeParcel(), false, false, null, versioninfoparcel);
    }

    private void runOnUiThread(Runnable runnable)
    {
        if (zzj.zzbJ().zzfk())
        {
            runnable.run();
            return;
        } else
        {
            zzfl.zzCr.post(runnable);
            return;
        }
    }

    static zzgd zza(zzaa zzaa1)
    {
        return zzaa1.zznp;
    }

    public void destroy()
    {
        zznp.destroy();
    }

    public void zza(com.google.android.gms.ads.internal.client.zza zza1, zzf zzf, zzbq zzbq, zzi zzi1, boolean flag, zzbu zzbu, zzbw zzbw, 
            zzb zzb1, zzdh zzdh)
    {
        zznp.zzft().zzb(zza1, zzf, zzbq, zzi1, flag, zzbu, zzbw, new zzb(false), zzdh);
    }

    public void zza(zzy.zza zza1)
    {
        zznp.zzft().zza(new zzge.zza(zza1) {

            final zzy.zza a;
            final zzaa b;

            public void zza(zzgd zzgd1, boolean flag)
            {
                a.zzbq();
            }

            
            {
                b = zzaa.this;
                a = zza1;
                super();
            }
        });
    }

    public void zza(String s, zzbs zzbs)
    {
        zznp.zzft().zza(s, zzbs);
    }

    public void zza(String s, JSONObject jsonobject)
    {
        runOnUiThread(new Runnable(s, jsonobject) {

            final String a;
            final JSONObject b;
            final zzaa c;

            public void run()
            {
                com.google.android.gms.internal.zzaa.zza(c).zza(a, b);
            }

            
            {
                c = zzaa.this;
                a = s;
                b = jsonobject;
                super();
            }
        });
    }

    public void zzb(String s, zzbs zzbs)
    {
        zznp.zzft().zzb(s, zzbs);
    }

    public void zzb(String s, String s1)
    {
        runOnUiThread(new Runnable(s, s1) {

            final String a;
            final String b;
            final zzaa c;

            public void run()
            {
                com.google.android.gms.internal.zzaa.zza(c).zzb(a, b);
            }

            
            {
                c = zzaa.this;
                a = s;
                b = s1;
                super();
            }
        });
    }

    public void zzg(String s)
    {
        runOnUiThread(new Runnable(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[] {
            s
        })) {

            final String a;
            final zzaa b;

            public void run()
            {
                com.google.android.gms.internal.zzaa.zza(b).loadData(a, "text/html", "UTF-8");
            }

            
            {
                b = zzaa.this;
                a = s;
                super();
            }
        });
    }

    public void zzh(String s)
    {
        runOnUiThread(new Runnable(s) {

            final String a;
            final zzaa b;

            public void run()
            {
                com.google.android.gms.internal.zzaa.zza(b).loadUrl(a);
            }

            
            {
                b = zzaa.this;
                a = s;
                super();
            }
        });
    }

    public void zzi(String s)
    {
        runOnUiThread(new Runnable(s) {

            final String a;
            final zzaa b;

            public void run()
            {
                com.google.android.gms.internal.zzaa.zza(b).loadData(a, "text/html", "UTF-8");
            }

            
            {
                b = zzaa.this;
                a = s;
                super();
            }
        });
    }
}

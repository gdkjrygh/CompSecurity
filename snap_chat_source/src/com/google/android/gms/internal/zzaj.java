// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzah, zzab, zzba, zzie, 
//            zzbe, zzhw, zzic, zzid, 
//            zzu, zzhy, zzat, zzep, 
//            zzct, zzes, zzcw, zzcy, 
//            zzeh, zzcv

public class zzaj
    implements zzah
{

    private final zzic zzmu;

    public zzaj(Context context, zzhy zzhy)
    {
        zzmu = zzab.zzaN().zza(context, new zzba(), false, false, null, zzhy);
    }

    private void runOnUiThread(Runnable runnable)
    {
        if (zzbe.zzbD().zzeC())
        {
            runnable.run();
            return;
        } else
        {
            zzhw.zzzG.post(runnable);
            return;
        }
    }

    static zzic zza(zzaj zzaj1)
    {
        return zzaj1.zzmu;
    }

    public void destroy()
    {
        zzmu.destroy();
    }

    public void zza(zzah.zza zza1)
    {
        zzmu.zzeG().zza(new zzid.zza(zza1) {

            final zzaj zznS;
            final zzah.zza zznV;

            public void zza(zzic zzic1, boolean flag)
            {
                zznV.zzbk();
            }

            
            {
                zznS = zzaj.this;
                zznV = zza1;
                super();
            }
        });
    }

    public void zza(zzat zzat, zzep zzep, zzct zzct, zzes zzes, boolean flag, zzcw zzcw, zzcy zzcy, 
            zzu zzu1, zzeh zzeh)
    {
        zzmu.zzeG().zzb(zzat, zzep, zzct, zzes, flag, zzcw, zzcy, new zzu(false), zzeh);
    }

    public void zza(String s, zzcv zzcv)
    {
        zzmu.zzeG().zza(s, zzcv);
    }

    public void zza(String s, JSONObject jsonobject)
    {
        runOnUiThread(new Runnable(s, jsonobject) {

            final String zznQ;
            final JSONObject zznR;
            final zzaj zznS;

            public void run()
            {
                zzaj.zza(zznS).zza(zznQ, zznR);
            }

            
            {
                zznS = zzaj.this;
                zznQ = s;
                zznR = jsonobject;
                super();
            }
        });
    }

    public void zzb(String s, zzcv zzcv)
    {
        zzmu.zzeG().zzb(s, zzcv);
    }

    public void zzb(String s, String s1)
    {
        runOnUiThread(new Runnable(s, s1) {

            final String zznQ;
            final zzaj zznS;
            final String zznT;

            public void run()
            {
                zzaj.zza(zznS).zzb(zznQ, zznT);
            }

            
            {
                zznS = zzaj.this;
                zznQ = s;
                zznT = s1;
                super();
            }
        });
    }

    public void zzf(String s)
    {
        runOnUiThread(new Runnable(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[] {
            s
        })) {

            final zzaj zznS;
            final String zznU;

            public void run()
            {
                zzaj.zza(zznS).loadData(zznU, "text/html", "UTF-8");
            }

            
            {
                zznS = zzaj.this;
                zznU = s;
                super();
            }
        });
    }

    public void zzg(String s)
    {
        runOnUiThread(new Runnable(s) {

            final String zznN;
            final zzaj zznS;

            public void run()
            {
                zzaj.zza(zznS).loadUrl(zznN);
            }

            
            {
                zznS = zzaj.this;
                zznN = s;
                super();
            }
        });
    }
}

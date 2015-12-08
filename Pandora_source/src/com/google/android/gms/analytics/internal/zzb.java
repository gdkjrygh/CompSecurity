// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzkk;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzf, zzq, e, 
//            zze, zzg, zzaa, zzv

public class zzb extends zzd
{

    private final e zzFu;
    private final String zzFv = zzgC();

    public zzb(zze zze, zzf zzf1)
    {
        super(zze);
        zzv.zzr(zzf1);
        zzFu = zzf1.zzj(zze);
    }

    static e zza(zzb zzb1)
    {
        return zzb1.zzFu;
    }

    private String zzgC()
    {
        if (!zzgI().zzhP())
        {
            return "";
        }
        String s;
        String s1;
        try
        {
            s1 = String.valueOf(getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionCode);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            zze("Failed to get service version", namenotfoundexception);
            return "0";
        }
        s = s1;
        if (s1.length() > 4)
        {
            s = s1.substring(0, 4);
        }
        s = (new StringBuilder()).append("4.5.0-").append(s).toString();
        return s;
    }

    void onServiceConnected()
    {
        zzgF();
        zzFu.d();
    }

    public void setLocalDispatchPeriod(int i)
    {
        zzgR();
        zzb("setLocalDispatchPeriod (sec)", Integer.valueOf(i));
        zzgJ().zze(new Runnable(i) {

            final int a;
            final zzb b;

            public void run()
            {
                zzb.zza(b).a((long)a * 1000L);
            }

            
            {
                b = zzb.this;
                a = i;
                super();
            }
        });
    }

    public void start()
    {
        zzFu.a();
    }

    public void zzG(boolean flag)
    {
        zza("Network connectivity status changed", Boolean.valueOf(flag));
        zzgJ().zze(new Runnable(flag) {

            final boolean a;
            final zzb b;

            public void run()
            {
                zzb.zza(b).a(a);
            }

            
            {
                b = zzb.this;
                a = flag;
                super();
            }
        });
    }

    public long zza(zzg zzg)
    {
        zzgR();
        zzv.zzr(zzg);
        zzgF();
        long l = zzFu.a(zzg, true);
        if (l == 0L)
        {
            zzFu.a(zzg);
        }
        return l;
    }

    public void zza(zzaa zzaa)
    {
        zzv.zzr(zzaa);
        zzgR();
        zzb("Hit delivery requested", zzaa);
        zzgJ().zze(new Runnable(zzaa) {

            final zzaa a;
            final zzb b;

            public void run()
            {
                zzb.zza(b).a(a);
            }

            
            {
                b = zzb.this;
                a = zzaa;
                super();
            }
        });
    }

    public void zza(com.google.android.gms.analytics.internal.zzv zzv1)
    {
        zzgR();
        zzgJ().zze(new Runnable(zzv1) {

            final com.google.android.gms.analytics.internal.zzv a;
            final zzb b;

            public void run()
            {
                zzb.zza(b).a(a);
            }

            
            {
                b = zzb.this;
                a = zzv1;
                super();
            }
        });
    }

    public void zza(String s, Runnable runnable)
    {
        zzv.zzh(s, "campaign param can't be empty");
        zzgJ().zze(new Runnable(s, runnable) {

            final String a;
            final Runnable b;
            final zzb c;

            public void run()
            {
                zzb.zza(c).a(a);
                if (b != null)
                {
                    b.run();
                }
            }

            
            {
                c = zzb.this;
                a = s;
                b = runnable;
                super();
            }
        });
    }

    public void zzgA()
    {
        zzaF("Radio powered up");
        zzgw();
    }

    void zzgB()
    {
        zzgF();
        zzFu.c();
    }

    protected void zzgb()
    {
        zzFu.zzfV();
    }

    public void zzgv()
    {
        zzgR();
        zzgE();
        zzgJ().zze(new Runnable() {

            final zzb a;

            public void run()
            {
                zzb.zza(a).g();
            }

            
            {
                a = zzb.this;
                super();
            }
        });
    }

    public void zzgw()
    {
        zzgR();
        Context context = getContext();
        if (AnalyticsReceiver.zzH(context) && AnalyticsService.zzI(context))
        {
            Intent intent = new Intent(context, com/google/android/gms/analytics/AnalyticsService);
            intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            context.startService(intent);
            return;
        } else
        {
            zza(((com.google.android.gms.analytics.internal.zzv) (null)));
            return;
        }
    }

    public boolean zzgx()
    {
        zzgR();
        Future future = zzgJ().zzb(new Callable() {

            final zzb a;

            public Void a()
                throws Exception
            {
                zzb.zza(a).j();
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = zzb.this;
                super();
            }
        });
        try
        {
            future.get();
        }
        catch (InterruptedException interruptedexception)
        {
            zzd("syncDispatchLocalHits interrupted", interruptedexception);
            return false;
        }
        catch (ExecutionException executionexception)
        {
            zze("syncDispatchLocalHits failed", executionexception);
            return false;
        }
        return true;
    }

    public String zzgy()
    {
        return zzFv;
    }

    public void zzgz()
    {
        zzgR();
        zzkk.zzgF();
        zzFu.e();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzp;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ac, hu, hs, gw, 
//            ht, ah, n, ce, 
//            cj, cl, ee, ch, 
//            ag

public class ae
    implements ac
{

    private final hs a;

    public ae(Context context, VersionInfoParcel versioninfoparcel, n n)
    {
        a = zzp.zzby().a(context, new AdSizeParcel(), false, false, n, versioninfoparcel);
        a.setWillNotDraw(true);
    }

    static hs a(ae ae1)
    {
        return ae1.a;
    }

    private void a(Runnable runnable)
    {
        if (zzk.zzcE().zzgI())
        {
            runnable.run();
            return;
        } else
        {
            gw.a.post(runnable);
            return;
        }
    }

    public void a()
    {
        a.destroy();
    }

    public void a(com.google.android.gms.ads.internal.client.zza zza1, zzg zzg, ce ce, zzn zzn, boolean flag, cj cj, cl cl, 
            zze zze1, ee ee)
    {
        a.i().a(zza1, zzg, ce, zzn, flag, cj, cl, new zze(false), ee);
    }

    public void a(ac.a a1)
    {
        a.i().a(new ht.a(a1) {

            final ac.a a;
            final ae b;

            public void zza(hs hs1, boolean flag)
            {
                a.a();
            }

            
            {
                b = ae.this;
                a = a1;
                super();
            }
        });
    }

    public void a(String s)
    {
        a(((Runnable) (new zzbd._cls3(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[] {
            s
        })))));
    }

    public void a(String s, ch ch)
    {
        a.i().a(s, ch);
    }

    public void a(String s, String s1)
    {
        a(((Runnable) (new zzbd._cls2(this, s, s1))));
    }

    public void a(String s, JSONObject jsonobject)
    {
        a(((Runnable) (new zzbd._cls1(this, s, jsonobject))));
    }

    public ag b()
    {
        return new ah(this);
    }

    public void b(String s)
    {
        a(new zzbd._cls5(this, s));
    }

    public void b(String s, ch ch)
    {
        a.i().b(s, ch);
    }

    public void b(String s, JSONObject jsonobject)
    {
        a.a(s, jsonobject);
    }

    public void c(String s)
    {
        a(new zzbd._cls4(this, s));
    }
}

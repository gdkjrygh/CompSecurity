// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.ds;
import com.google.android.gms.internal.ip;
import com.google.android.gms.internal.kq;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.pa;
import com.google.android.gms.internal.pb;
import com.google.android.gms.internal.qa;
import com.google.android.gms.internal.ql;
import com.google.android.gms.internal.ry;
import com.google.android.gms.internal.sf;
import com.google.android.gms.internal.zzja;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzb, zzg, zzq, zzp, 
//            b, c, zzd, zze

public abstract class zzc extends com.google.android.gms.ads.internal.zzb
    implements zzg, kq
{

    public zzc(Context context, AdSizeParcel adsizeparcel, String s, ip ip, VersionInfoParcel versioninfoparcel, zzd zzd)
    {
        super(context, adsizeparcel, s, ip, versioninfoparcel, zzd);
    }

    protected ry a(pb pb1, zze zze)
    {
        Object obj = f.c.getNextView();
        if (!(obj instanceof ry)) goto _L2; else goto _L1
_L1:
        zzb.zzaF("Reusing webview...");
        obj = (ry)obj;
        ((ry) (obj)).a(f.context, f.zzqn, a);
_L4:
        ((ry) (obj)).k().zzb(this, this, this, this, false, this, null, zze, this);
        ((ry) (obj)).b(pb1.a.zzEC);
        return ((ry) (obj));
_L2:
        if (obj != null)
        {
            f.c.removeView(((View) (obj)));
        }
        zzp.zzbw();
        ry ry1 = sf.a(f.context, f.zzqn, false, false, f.b, f.zzqj, a, i);
        obj = ry1;
        if (f.zzqn.zztg == null)
        {
            a(ry1.b());
            obj = ry1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void recordClick()
    {
        onAdClicked();
    }

    public void recordImpression()
    {
        a(f.zzqo, false);
    }

    public void zza(int i, int j, int k, int l)
    {
        b();
    }

    public void zza(ds ds)
    {
        bl.b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        f.o = ds;
    }

    protected void zza(pb pb1, dm dm)
    {
        if (pb1.e != -2)
        {
            qa.a.post(new b(this, pb1));
            return;
        }
        if (pb1.d != null)
        {
            f.zzqn = pb1.d;
        }
        if (pb1.b.zzEK)
        {
            f.zzqH = 0;
            zzq zzq1 = f;
            zzp.zzbu();
            zzq1.zzqm = mn.a(f.context, this, pb1, f.b, null, j, this, dm);
            return;
        } else
        {
            qa.a.post(new c(this, pb1, dm));
            return;
        }
    }

    protected boolean zza(pa pa1, pa pa2)
    {
        if (f.zzbN() && f.c != null)
        {
            f.c.zzbT().a(pa2.v);
        }
        return super.zza(pa1, pa2);
    }

    public void zzbc()
    {
        a();
    }

    public void zzc(View view)
    {
        f.r = view;
        zzb(new pa(f.zzqp));
    }
}

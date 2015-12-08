// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzd;
import com.google.android.gms.ads.internal.formats.zze;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.formats.zzg;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.ds;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ey;
import com.google.android.gms.internal.ip;
import com.google.android.gms.internal.is;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.je;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.pa;
import com.google.android.gms.internal.pb;
import com.google.android.gms.internal.qa;
import com.google.android.gms.internal.wb;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzb, m, n, zzo, 
//            zzq, l, zzp, o

public class zzn extends com.google.android.gms.ads.internal.zzb
{

    public zzn(Context context, AdSizeParcel adsizeparcel, String s, ip ip, VersionInfoParcel versioninfoparcel)
    {
        super(context, adsizeparcel, s, ip, versioninfoparcel, null);
    }

    private void a(zzd zzd1)
    {
        qa.a.post(new m(this, zzd1));
    }

    private void a(zze zze1)
    {
        qa.a.post(new n(this, zze1));
    }

    protected final boolean a(AdRequestParcel adrequestparcel, pa pa1, boolean flag)
    {
        return e.zzbp();
    }

    public void pause()
    {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public void recordImpression()
    {
        a(f.zzqo, false);
    }

    public void resume()
    {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    public void showInterstitial()
    {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public void zza(ds ds)
    {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public void zza(li li)
    {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public void zza(pb pb1, dm dm)
    {
        if (pb1.d != null)
        {
            f.zzqn = pb1.d;
        }
        if (pb1.e != -2)
        {
            qa.a.post(new l(this, pb1));
            return;
        } else
        {
            f.zzqH = 0;
            zzq zzq1 = f;
            zzp.zzbu();
            zzq1.zzqm = mn.a(f.context, this, pb1, f.b, null, j, this, dm);
            com.google.android.gms.ads.internal.util.client.zzb.zzaF((new StringBuilder("AdRenderer: ")).append(f.zzqm.getClass().getName()).toString());
            return;
        }
    }

    public void zza(wb wb1)
    {
        bl.b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        f.m = wb1;
    }

    public void zza(List list)
    {
        bl.b("setNativeTemplates must be called on the main UI thread.");
        f.p = list;
    }

    protected boolean zza(pa pa1, pa pa2)
    {
        Object obj;
        String s;
        s = null;
        obj = null;
        zza(((List) (null)));
        if (!f.zzbN())
        {
            throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
        }
        if (!pa2.k) goto _L2; else goto _L1
_L1:
        Object obj2;
        Object obj3;
        obj2 = pa2.m.h();
        obj3 = pa2.m.i();
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        List list;
        String s2;
        try
        {
            s = ((jb) (obj2)).a();
            obj3 = ((jb) (obj2)).b();
            String s1 = ((jb) (obj2)).c();
            if (((jb) (obj2)).d() != null)
            {
                obj = ((jb) (obj2)).d();
            }
            obj = new zzd(s, ((List) (obj3)), s1, ((com.google.android.gms.internal.dw) (obj)), ((jb) (obj2)).e(), ((jb) (obj2)).f(), ((jb) (obj2)).g(), ((jb) (obj2)).h(), null, ((jb) (obj2)).l());
            ((zzd) (obj)).zza(new zzg(f.context, this, f.b, ((jb) (obj2))));
            a(((zzd) (obj)));
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to get native ad mapper", remoteexception);
        }
_L6:
        return super.zza(pa1, pa2);
_L4:
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        obj2 = ((je) (obj3)).a();
        list = ((je) (obj3)).b();
        s2 = ((je) (obj3)).c();
        obj = s;
        if (((je) (obj3)).d() != null)
        {
            obj = ((je) (obj3)).d();
        }
        obj = new zze(((String) (obj2)), list, s2, ((com.google.android.gms.internal.dw) (obj)), ((je) (obj3)).e(), ((je) (obj3)).f(), null, ((je) (obj3)).j());
        ((zze) (obj)).zza(new zzg(f.context, this, f.b, ((je) (obj3))));
        a(((zze) (obj)));
        continue; /* Loop/switch isn't completed */
        com.google.android.gms.ads.internal.util.client.zzb.zzaH("No matching mapper for retrieved native ad template.");
        a(0);
        return false;
_L2:
        Object obj1 = pa2.w;
        if ((obj1 instanceof zze) && f.k != null)
        {
            a((zze)pa2.w);
        } else
        if ((obj1 instanceof zzd) && f.j != null)
        {
            a((zzd)pa2.w);
        } else
        if ((obj1 instanceof zzf) && f.m != null && f.m.get(((zzf)obj1).getCustomTemplateId()) != null)
        {
            obj1 = ((zzf)obj1).getCustomTemplateId();
            qa.a.post(new o(this, ((String) (obj1)), pa2));
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaH("No matching listener for retrieved native ad template.");
            a(0);
            return false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void zzb(NativeAdOptionsParcel nativeadoptionsparcel)
    {
        bl.b("setNativeAdOptions must be called on the main UI thread.");
        f.n = nativeadoptionsparcel;
    }

    public void zzb(es es)
    {
        bl.b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        f.j = es;
    }

    public void zzb(ev ev)
    {
        bl.b("setOnContentAdLoadedListener must be called on the main UI thread.");
        f.k = ev;
    }

    public void zzb(wb wb1)
    {
        bl.b("setOnCustomClickListener must be called on the main UI thread.");
        f.l = wb1;
    }

    public wb zzbo()
    {
        bl.b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return f.m;
    }

    public ey zzr(String s)
    {
        bl.b("getOnCustomClickListener must be called on the main UI thread.");
        return (ey)f.l.get(s);
    }
}

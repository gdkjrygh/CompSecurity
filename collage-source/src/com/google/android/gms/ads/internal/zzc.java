// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.bd;
import com.google.android.gms.internal.be;
import com.google.android.gms.internal.bh;
import com.google.android.gms.internal.di;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.fb;
import com.google.android.gms.internal.gl;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hs;
import com.google.android.gms.internal.ht;
import com.google.android.gms.internal.hu;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzb, zzg, zzq, zzp, 
//            zzd, zze

public abstract class zzc extends com.google.android.gms.ads.internal.zzb
    implements zzg, ee
{

    public zzc(Context context, AdSizeParcel adsizeparcel, String s, di di, VersionInfoParcel versioninfoparcel, zzd zzd)
    {
        super(context, adsizeparcel, s, di, versioninfoparcel, zzd);
    }

    public void recordClick()
    {
        onAdClicked();
    }

    public void recordImpression()
    {
        zza(zzos.zzqg, false);
    }

    protected hs zza(com.google.android.gms.internal.gl.a a, zze zze)
    {
        Object obj = zzos.zzqc.getNextView();
        if (!(obj instanceof hs)) goto _L2; else goto _L1
_L1:
        zzb.zzaC("Reusing webview...");
        obj = (hs)obj;
        ((hs) (obj)).a(zzos.context, zzos.zzqf);
_L4:
        ((hs) (obj)).i().a(this, this, this, this, false, this, null, zze, this);
        ((hs) (obj)).b(a.a.zzDQ);
        ((hs) (obj)).c(a.a.zzDO);
        return ((hs) (obj));
_L2:
        if (obj != null)
        {
            zzos.zzqc.removeView(((View) (obj)));
        }
        obj = zzp.zzby().a(zzos.context, zzos.zzqf, false, false, zzos.zzqa, zzos.zzqb, zzov);
        if (zzos.zzqf.zzsI == null)
        {
            zzb(((hs) (obj)).getWebView());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void zza(int i, int j, int k, int l)
    {
        zzaS();
    }

    public void zza(bh bh)
    {
        z.b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        zzos.zzqu = bh;
    }

    protected void zza(com.google.android.gms.internal.gl.a a, bd bd)
    {
        if (a.e != -2)
        {
            gw.a.post(new Runnable(a) {

                final com.google.android.gms.internal.gl.a zzoA;
                final zzc zzoB;

                public void run()
                {
                    zzoB.zzb(new gl(zzoA, null, null, null, null, null, null));
                }

            
            {
                zzoB = zzc.this;
                zzoA = a;
                super();
            }
            });
            return;
        }
        if (a.d != null)
        {
            zzos.zzqf = a.d;
        }
        if (a.b.zzDX)
        {
            zzos.zzqz = 0;
            zzos.zzqe = zzp.zzbw().a(zzos.context, this, a, zzos.zzqa, null, zzow, this, bd);
            return;
        } else
        {
            gw.a.post(new Runnable(a, bd) {

                final com.google.android.gms.internal.gl.a zzoA;
                final zzc zzoB;
                final bd zzoC;

                public void run()
                {
                    if (zzoA.b.zzEg && zzoB.zzos.zzqu != null)
                    {
                        Object obj = null;
                        if (zzoA.b.zzAT != null)
                        {
                            obj = zzp.zzbx().a(zzoA.b.zzAT);
                        }
                        obj = new be(zzoB, ((String) (obj)), zzoA.b.body);
                        zzoB.zzos.zzqz = 1;
                        try
                        {
                            zzoB.zzos.zzqu.a(((com.google.android.gms.internal.bg) (obj)));
                            return;
                        }
                        catch (RemoteException remoteexception)
                        {
                            zzb.zzd("Could not call the onCustomRenderedAdLoadedListener.", remoteexception);
                        }
                    }
                    zze zze1 = new zze();
                    hs hs1 = zzoB.zza(zzoA, zze1);
                    zze1.zza(new zze.zzb(zzoA, hs1));
                    hs1.setOnTouchListener(new android.view.View.OnTouchListener(this, zze1) {

                        final zze zzoD;
                        final _cls2 zzoE;

                        public boolean onTouch(View view, MotionEvent motionevent)
                        {
                            zzoD.recordClick();
                            return false;
                        }

            
            {
                zzoE = _pcls2;
                zzoD = zze1;
                super();
            }
                    });
                    hs1.setOnClickListener(new android.view.View.OnClickListener(this, zze1) {

                        final zze zzoD;
                        final _cls2 zzoE;

                        public void onClick(View view)
                        {
                            zzoD.recordClick();
                        }

            
            {
                zzoE = _pcls2;
                zzoD = zze1;
                super();
            }
                    });
                    zzoB.zzos.zzqz = 0;
                    zzoB.zzos.zzqe = zzp.zzbw().a(zzoB.zzos.context, zzoB, zzoA, zzoB.zzos.zzqa, hs1, zzoB.zzow, zzoB, zzoC);
                }

            
            {
                zzoB = zzc.this;
                zzoA = a;
                zzoC = bd;
                super();
            }
            });
            return;
        }
    }

    protected boolean zza(gl gl1, gl gl2)
    {
        if (zzos.zzbP() && zzos.zzqc != null)
        {
            zzos.zzqc.zzbT().a(gl2.v);
        }
        return super.zza(gl1, gl2);
    }

    public void zzbc()
    {
        zzaQ();
    }

    public void zzc(View view)
    {
        zzos.zzqy = view;
        zzb(new gl(zzos.zzqh, null, null, null, null, null, null));
    }
}

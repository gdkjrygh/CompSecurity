// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ViewSwitcher;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.ba;
import com.google.android.gms.internal.bh;
import com.google.android.gms.internal.bt;
import com.google.android.gms.internal.bu;
import com.google.android.gms.internal.dj;
import com.google.android.gms.internal.eo;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.gl;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.gn;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gs;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.he;
import com.google.android.gms.internal.hg;
import com.google.android.gms.internal.hs;
import com.google.android.gms.internal.ht;
import com.google.android.gms.internal.iu;
import com.google.android.gms.internal.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzp, zzh

public final class zzq
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{
    public static final class zza extends ViewSwitcher
    {

        private final gy zzqF;
        private final hg zzqG;

        protected void onAttachedToWindow()
        {
            super.onAttachedToWindow();
            if (zzqG != null)
            {
                zzqG.c();
            }
        }

        protected void onDetachedFromWindow()
        {
            super.onDetachedFromWindow();
            if (zzqG != null)
            {
                zzqG.d();
            }
        }

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            zzqF.a(motionevent);
            return false;
        }

        public void removeAllViews()
        {
            Object obj = new ArrayList();
            for (int i = 0; i < getChildCount(); i++)
            {
                View view = getChildAt(i);
                if (view != null && (view instanceof hs))
                {
                    ((List) (obj)).add((hs)view);
                }
            }

            super.removeAllViews();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((hs)((Iterator) (obj)).next()).destroy()) { }
        }

        public void zzbR()
        {
            zzb.v("Disable position monitoring on adFrame.");
            if (zzqG != null)
            {
                zzqG.b();
            }
        }

        public gy zzbT()
        {
            return zzqF;
        }

        public zza(Context context1, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
        {
            super(context1);
            zzqF = new gy(context1);
            if (context1 instanceof Activity)
            {
                zzqG = new hg((Activity)context1, ongloballayoutlistener, onscrollchangedlistener);
                zzqG.a();
                return;
            } else
            {
                zzqG = null;
                return;
            }
        }
    }


    public final Context context;
    final String zzpY;
    public String zzpZ;
    boolean zzpk;
    boolean zzqA;
    private HashSet zzqB;
    private int zzqC;
    private int zzqD;
    private he zzqE;
    final n zzqa;
    public final VersionInfoParcel zzqb;
    zza zzqc;
    public gs zzqd;
    public gs zzqe;
    public AdSizeParcel zzqf;
    public gl zzqg;
    public com.google.android.gms.internal.gl.a zzqh;
    public gm zzqi;
    zzm zzqj;
    zzn zzqk;
    zzt zzql;
    zzu zzqm;
    eo zzqn;
    es zzqo;
    bt zzqp;
    bu zzqq;
    iu zzqr;
    iu zzqs;
    NativeAdOptionsParcel zzqt;
    bh zzqu;
    List zzqv;
    com.google.android.gms.ads.internal.purchase.zzk zzqw;
    public gq zzqx;
    View zzqy;
    public int zzqz;

    public zzq(Context context1, AdSizeParcel adsizeparcel, String s, VersionInfoParcel versioninfoparcel)
    {
        this(context1, adsizeparcel, s, versioninfoparcel, null);
    }

    zzq(Context context1, AdSizeParcel adsizeparcel, String s, VersionInfoParcel versioninfoparcel, n n1)
    {
        zzqx = null;
        zzqy = null;
        zzqz = 0;
        zzqA = false;
        zzpk = false;
        zzqB = null;
        zzqC = -1;
        zzqD = -1;
        ay.a(context1);
        if (zzp.zzbA().e() != null)
        {
            List list = ay.a();
            if (versioninfoparcel.zzIA != 0)
            {
                list.add(Integer.toString(versioninfoparcel.zzIA));
            }
            zzp.zzbA().e().a(list);
        }
        zzpY = UUID.randomUUID().toString();
        if (adsizeparcel.zzsH || adsizeparcel.zzsJ)
        {
            zzqc = null;
        } else
        {
            zzqc = new zza(context1, this, this);
            zzqc.setMinimumWidth(adsizeparcel.widthPixels);
            zzqc.setMinimumHeight(adsizeparcel.heightPixels);
            zzqc.setVisibility(4);
        }
        zzqf = adsizeparcel;
        zzpZ = s;
        context = context1;
        zzqb = versioninfoparcel;
        if (n1 == null)
        {
            n1 = new n(new zzh(this));
        }
        zzqa = n1;
        zzqE = new he(200L);
        zzqs = new iu();
    }

    private void zze(boolean flag)
    {
        boolean flag1;
        flag1 = true;
        break MISSING_BLOCK_LABEL_3;
        if (zzqc != null && zzqg != null && zzqg.b != null && zzqg.b.i().b() && (!flag || zzqE.a()))
        {
            int ai[] = new int[2];
            zzqc.getLocationOnScreen(ai);
            int i = zzk.zzcE().zzc(context, ai[0]);
            int j = zzk.zzcE().zzc(context, ai[1]);
            if (i != zzqC || j != zzqD)
            {
                zzqC = i;
                zzqD = j;
                ht ht1 = zzqg.b.i();
                i = zzqC;
                j = zzqD;
                if (!flag)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                ht1.a(i, j, flag);
                return;
            }
        }
        return;
    }

    public void destroy()
    {
        zzbR();
        zzqk = null;
        zzql = null;
        zzqo = null;
        zzqn = null;
        zzqu = null;
        zzqm = null;
        zzf(false);
        if (zzqc != null)
        {
            zzqc.removeAllViews();
        }
        zzbM();
        zzbO();
        zzqg = null;
    }

    public void onGlobalLayout()
    {
        zze(false);
    }

    public void onScrollChanged()
    {
        zze(true);
    }

    public void zza(HashSet hashset)
    {
        zzqB = hashset;
    }

    public HashSet zzbL()
    {
        return zzqB;
    }

    public void zzbM()
    {
        if (zzqg != null && zzqg.b != null)
        {
            zzqg.b.destroy();
        }
    }

    public void zzbN()
    {
        if (zzqg != null && zzqg.b != null)
        {
            zzqg.b.stopLoading();
        }
    }

    public void zzbO()
    {
        if (zzqg == null || zzqg.m == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        zzqg.m.c();
        return;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzaE("Could not destroy mediation adapter.");
        return;
    }

    public boolean zzbP()
    {
        return zzqz == 0;
    }

    public boolean zzbQ()
    {
        return zzqz == 1;
    }

    public void zzbR()
    {
        if (zzqc != null)
        {
            zzqc.zzbR();
        }
    }

    public void zzbS()
    {
        zzqi.a(zzqg.t);
        zzqi.b(zzqg.u);
        zzqi.a(zzqf.zzsH);
        zzqi.b(zzqg.k);
    }

    public void zzf(boolean flag)
    {
        if (zzqz == 0)
        {
            zzbN();
        }
        if (zzqd != null)
        {
            zzqd.cancel();
        }
        if (zzqe != null)
        {
            zzqe.cancel();
        }
        if (flag)
        {
            zzqg = null;
        }
    }
}

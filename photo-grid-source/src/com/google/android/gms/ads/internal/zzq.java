// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzo;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.purchase.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.ad;
import com.google.android.gms.internal.cy;
import com.google.android.gms.internal.dc;
import com.google.android.gms.internal.ds;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.is;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.lu;
import com.google.android.gms.internal.mp;
import com.google.android.gms.internal.pa;
import com.google.android.gms.internal.pb;
import com.google.android.gms.internal.pc;
import com.google.android.gms.internal.pe;
import com.google.android.gms.internal.ph;
import com.google.android.gms.internal.pj;
import com.google.android.gms.internal.rc;
import com.google.android.gms.internal.ry;
import com.google.android.gms.internal.wb;
import com.google.android.gms.internal.zzja;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzp, g

public final class zzq
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    private boolean A;
    final String a;
    final ad b;
    zza c;
    public final Context context;
    zzn d;
    zzo e;
    zzu f;
    zzv g;
    li h;
    lu i;
    es j;
    ev k;
    wb l;
    wb m;
    NativeAdOptionsParcel n;
    ds o;
    List p;
    zzk q;
    View r;
    boolean s;
    boolean t;
    private HashSet u;
    private int v;
    private int w;
    private rc x;
    private boolean y;
    private boolean z;
    public ph zzqF;
    public int zzqH;
    public String zzqh;
    public final VersionInfoParcel zzqj;
    public pj zzql;
    public mp zzqm;
    public AdSizeParcel zzqn;
    public pa zzqo;
    public pb zzqp;
    public pc zzqq;

    public zzq(Context context1, AdSizeParcel adsizeparcel, String s1, VersionInfoParcel versioninfoparcel)
    {
        this(context1, adsizeparcel, s1, versioninfoparcel, (byte)0);
    }

    private zzq(Context context1, AdSizeParcel adsizeparcel, String s1, VersionInfoParcel versioninfoparcel, byte byte0)
    {
        zzqF = null;
        r = null;
        zzqH = 0;
        s = false;
        t = false;
        u = null;
        v = -1;
        w = -1;
        y = true;
        z = true;
        A = false;
        cy.a(context1);
        if (zzp.zzby().d() != null)
        {
            List list = cy.a();
            if (versioninfoparcel.zzJv != 0)
            {
                list.add(Integer.toString(versioninfoparcel.zzJv));
            }
            zzp.zzby().d().a(list);
        }
        a = UUID.randomUUID().toString();
        if (adsizeparcel.zztf || adsizeparcel.zzth)
        {
            c = null;
        } else
        {
            c = new zza(context1, this, this);
            c.setMinimumWidth(adsizeparcel.widthPixels);
            c.setMinimumHeight(adsizeparcel.heightPixels);
            c.setVisibility(4);
        }
        zzqn = adsizeparcel;
        zzqh = s1;
        context = context1;
        zzqj = versioninfoparcel;
        b = new ad(new g(this));
        x = new rc(200L);
        m = new wb();
    }

    private void a(boolean flag)
    {
        boolean flag1;
        flag1 = true;
        break MISSING_BLOCK_LABEL_3;
        if (c != null && zzqo != null && zzqo.b != null && (!flag || x.a()))
        {
            if (zzqo.b.k().zzbY())
            {
                int ai[] = new int[2];
                c.getLocationOnScreen(ai);
                int i1 = zzl.zzcF().zzc(context, ai[0]);
                int j1 = zzl.zzcF().zzc(context, ai[1]);
                if (i1 != v || j1 != w)
                {
                    v = i1;
                    w = j1;
                    Object obj = zzqo.b.k();
                    i1 = v;
                    j1 = w;
                    Rect rect;
                    Rect rect1;
                    if (!flag)
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                    ((zzja) (obj)).zza(i1, j1, flag);
                }
            }
            obj = c.getRootView().findViewById(0x1020002);
            if (obj != null)
            {
                rect = new Rect();
                rect1 = new Rect();
                c.getGlobalVisibleRect(rect);
                ((View) (obj)).getGlobalVisibleRect(rect1);
                if (rect.top != rect1.top)
                {
                    y = false;
                }
                if (rect.bottom != rect1.bottom)
                {
                    z = false;
                    return;
                }
            }
        }
        return;
    }

    public final void destroy()
    {
        zzbP();
        e = null;
        f = null;
        i = null;
        h = null;
        o = null;
        g = null;
        zzf(false);
        if (c != null)
        {
            c.removeAllViews();
        }
        zzbK();
        zzbM();
        zzqo = null;
    }

    public final void onGlobalLayout()
    {
        a(false);
    }

    public final void onScrollChanged()
    {
        a(true);
        A = true;
    }

    public final void zza(HashSet hashset)
    {
        u = hashset;
    }

    public final HashSet zzbJ()
    {
        return u;
    }

    public final void zzbK()
    {
        if (zzqo != null && zzqo.b != null)
        {
            zzqo.b.destroy();
        }
    }

    public final void zzbL()
    {
        if (zzqo != null && zzqo.b != null)
        {
            zzqo.b.stopLoading();
        }
    }

    public final void zzbM()
    {
        if (zzqo == null || zzqo.m == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        zzqo.m.c();
        return;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzaH("Could not destroy mediation adapter.");
        return;
    }

    public final boolean zzbN()
    {
        return zzqH == 0;
    }

    public final boolean zzbO()
    {
        return zzqH == 1;
    }

    public final void zzbP()
    {
        if (c != null)
        {
            c.zzbP();
        }
    }

    public final String zzbR()
    {
        if (y && z)
        {
            return "";
        }
        if (y)
        {
            if (A)
            {
                return "top-scrollable";
            } else
            {
                return "top-locked";
            }
        }
        if (z)
        {
            if (A)
            {
                return "bottom-scrollable";
            } else
            {
                return "bottom-locked";
            }
        } else
        {
            return "";
        }
    }

    public final void zzbS()
    {
        zzqq.a(zzqo.t);
        zzqq.b(zzqo.u);
        zzqq.a(zzqn.zztf);
        zzqq.b(zzqo.k);
    }

    public final void zzf(boolean flag)
    {
        if (zzqH == 0)
        {
            zzbL();
        }
        if (zzql != null)
        {
            zzql.cancel();
        }
        if (zzqm != null)
        {
            zzqm.cancel();
        }
        if (flag)
        {
            zzqo = null;
        }
    }

    private class zza extends ViewSwitcher
    {

        private final ql a;
        private final re b;

        protected void onAttachedToWindow()
        {
            super.onAttachedToWindow();
            if (b != null)
            {
                b.c();
            }
        }

        protected void onDetachedFromWindow()
        {
            super.onDetachedFromWindow();
            if (b != null)
            {
                b.d();
            }
        }

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            a.a(motionevent);
            return false;
        }

        public void removeAllViews()
        {
            Object obj = new ArrayList();
            for (int i1 = 0; i1 < getChildCount(); i1++)
            {
                View view = getChildAt(i1);
                if (view != null && (view instanceof ry))
                {
                    ((List) (obj)).add((ry)view);
                }
            }

            super.removeAllViews();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((ry)((Iterator) (obj)).next()).destroy()) { }
        }

        public void zzbP()
        {
            zzb.v("Disable position monitoring on adFrame.");
            if (b != null)
            {
                b.b();
            }
        }

        public ql zzbT()
        {
            return a;
        }

        public zza(Context context1, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
        {
            super(context1);
            a = new ql(context1);
            if (context1 instanceof Activity)
            {
                b = new re((Activity)context1, ongloballayoutlistener, onscrollchangedlistener);
                b.a();
                return;
            } else
            {
                b = null;
                return;
            }
        }
    }

}

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
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.ads.internal.client.p;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.client.w;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.purchase.k;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.bb;
import com.google.android.gms.internal.bi;
import com.google.android.gms.internal.bt;
import com.google.android.gms.internal.bu;
import com.google.android.gms.internal.di;
import com.google.android.gms.internal.en;
import com.google.android.gms.internal.er;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.gc;
import com.google.android.gms.internal.gd;
import com.google.android.gms.internal.gg;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.go;
import com.google.android.gms.internal.gu;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hi;
import com.google.android.gms.internal.hj;
import com.google.android.gms.internal.ij;
import com.google.android.gms.internal.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.ads.internal:
//            p, h

public final class zzq
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{
    public static final class zza extends ViewSwitcher
    {

        private final go a;
        private final gw b;

        public final go a()
        {
            return a;
        }

        public final void b()
        {
            com.google.android.gms.ads.internal.util.client.b.a(2);
            if (b != null)
            {
                b.b();
            }
        }

        protected final void onAttachedToWindow()
        {
            super.onAttachedToWindow();
            if (b != null)
            {
                b.c();
            }
        }

        protected final void onDetachedFromWindow()
        {
            super.onDetachedFromWindow();
            if (b != null)
            {
                b.d();
            }
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            a.a(motionevent);
            return false;
        }

        public final void removeAllViews()
        {
            Object obj = new ArrayList();
            for (int i1 = 0; i1 < getChildCount(); i1++)
            {
                View view = getChildAt(i1);
                if (view != null && (view instanceof hi))
                {
                    ((List) (obj)).add((hi)view);
                }
            }

            super.removeAllViews();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((hi)((Iterator) (obj)).next()).destroy()) { }
        }

        public zza(Context context, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
        {
            super(context);
            a = new go(context);
            if (context instanceof Activity)
            {
                b = new gw((Activity)context, ongloballayoutlistener, onscrollchangedlistener);
                b.a();
                return;
            } else
            {
                b = null;
                return;
            }
        }
    }


    public gg A;
    View B;
    public int C;
    boolean D;
    boolean E;
    private HashSet F;
    private int G;
    private int H;
    private gu I;
    final String a;
    public String b;
    public final Context c;
    final o d;
    public final VersionInfoParcel e;
    zza f;
    public gi g;
    public gi h;
    public AdSizeParcel i;
    public gb j;
    public com.google.android.gms.internal.gb.a k;
    public gc l;
    p m;
    q n;
    w o;
    x p;
    en q;
    er r;
    bt s;
    bu t;
    ij u;
    ij v;
    NativeAdOptionsParcel w;
    bi x;
    List y;
    k z;

    public zzq(Context context, AdSizeParcel adsizeparcel, String s1, VersionInfoParcel versioninfoparcel)
    {
        this(context, adsizeparcel, s1, versioninfoparcel, (byte)0);
    }

    private zzq(Context context, AdSizeParcel adsizeparcel, String s1, VersionInfoParcel versioninfoparcel, byte byte0)
    {
        A = null;
        B = null;
        C = 0;
        D = false;
        E = false;
        F = null;
        G = -1;
        H = -1;
        ay.a(context);
        if (com.google.android.gms.ads.internal.p.h().d() != null)
        {
            List list = ay.a();
            if (versioninfoparcel.c != 0)
            {
                list.add(Integer.toString(versioninfoparcel.c));
            }
            com.google.android.gms.ads.internal.p.h().d().a(list);
        }
        a = UUID.randomUUID().toString();
        if (adsizeparcel.e || adsizeparcel.i)
        {
            f = null;
        } else
        {
            f = new zza(context, this, this);
            f.setMinimumWidth(adsizeparcel.g);
            f.setMinimumHeight(adsizeparcel.d);
            f.setVisibility(4);
        }
        i = adsizeparcel;
        b = s1;
        c = context;
        e = versioninfoparcel;
        d = new o(new h(this));
        I = new gu(200L);
        v = new ij();
    }

    private void b(boolean flag)
    {
        boolean flag1;
        flag1 = true;
        break MISSING_BLOCK_LABEL_3;
        if (f != null && j != null && j.b != null && j.b.j().b() && (!flag || I.a()))
        {
            int ai[] = new int[2];
            f.getLocationOnScreen(ai);
            com.google.android.gms.ads.internal.client.n.a();
            int i1 = com.google.android.gms.ads.internal.util.client.a.b(c, ai[0]);
            com.google.android.gms.ads.internal.client.n.a();
            int j1 = com.google.android.gms.ads.internal.util.client.a.b(c, ai[1]);
            if (i1 != G || j1 != H)
            {
                G = i1;
                H = j1;
                hj hj1 = j.b.j();
                i1 = G;
                j1 = H;
                if (!flag)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                hj1.a(i1, j1, flag);
                return;
            }
        }
        return;
    }

    public final HashSet a()
    {
        return F;
    }

    public final void a(HashSet hashset)
    {
        F = hashset;
    }

    public final void a(boolean flag)
    {
        if (C == 0 && j != null && j.b != null)
        {
            j.b.stopLoading();
        }
        if (g != null)
        {
            g.g();
        }
        if (h != null)
        {
            h.g();
        }
        if (flag)
        {
            j = null;
        }
    }

    public final void b()
    {
        if (j != null && j.b != null)
        {
            j.b.destroy();
        }
    }

    public final void c()
    {
        if (j == null || j.m == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        j.m.c();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.ads.internal.util.client.b.c("Could not destroy mediation adapter.");
        return;
    }

    public final boolean d()
    {
        return C == 0;
    }

    public final void onGlobalLayout()
    {
        b(false);
    }

    public final void onScrollChanged()
    {
        b(true);
    }
}

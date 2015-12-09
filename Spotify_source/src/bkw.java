// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

public final class bkw
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    public cja A;
    View B;
    public int C;
    boolean D;
    boolean E;
    HashSet F;
    boolean G;
    boolean H;
    boolean I;
    private int J;
    private int K;
    private ckd L;
    final String a;
    public String b;
    public final Context c;
    final bzm d;
    public final VersionInfoParcel e;
    bkx f;
    public cjc g;
    public chr h;
    public AdSizeParcel i;
    public cit j;
    public ciu k;
    public civ l;
    bfs m;
    bfv n;
    bgn o;
    bgq p;
    cgv q;
    chh r;
    ccn s;
    ccq t;
    cnm u;
    cnm v;
    NativeAdOptionsParcel w;
    cbp x;
    List y;
    bio z;

    public bkw(Context context, AdSizeParcel adsizeparcel, String s1, VersionInfoParcel versioninfoparcel)
    {
        this(context, adsizeparcel, s1, versioninfoparcel, (byte)0);
    }

    private bkw(Context context, AdSizeParcel adsizeparcel, String s1, VersionInfoParcel versioninfoparcel, byte byte0)
    {
        A = null;
        B = null;
        C = 0;
        D = false;
        E = false;
        F = null;
        J = -1;
        K = -1;
        G = true;
        H = true;
        I = false;
        cbb.a(context);
        if (bkv.h().c() != null)
        {
            List list = cbb.a();
            if (versioninfoparcel.c != 0)
            {
                list.add(Integer.toString(versioninfoparcel.c));
            }
            cbe cbe1 = bkv.h().c();
            if (!list.isEmpty())
            {
                cbe1.b.put("e", TextUtils.join(",", list));
            }
        }
        a = UUID.randomUUID().toString();
        if (adsizeparcel.e || adsizeparcel.i)
        {
            f = null;
        } else
        {
            f = new bkx(context, this, this);
            f.setMinimumWidth(adsizeparcel.g);
            f.setMinimumHeight(adsizeparcel.d);
            f.setVisibility(4);
        }
        i = adsizeparcel;
        b = s1;
        c = context;
        e = versioninfoparcel;
        d = new bzm(new bkl(this));
        L = new ckd(200L);
        v = new cnm();
    }

    private void b(boolean flag)
    {
        int i1;
        i1 = 1;
        break MISSING_BLOCK_LABEL_3;
_L6:
        do
        {
            return;
        } while (f == null || j == null || j.b == null || flag && !L.a());
        if (!j.b.k().a()) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        int ai[] = new int[2];
        f.getLocationOnScreen(ai);
        bfq.a();
        j1 = bjz.b(c, ai[0]);
        bfq.a();
        k1 = bjz.b(c, ai[1]);
        if (j1 == J && k1 == K) goto _L2; else goto _L3
_L3:
        Object obj;
        Object obj1;
        J = j1;
        K = k1;
        obj = j.b.k();
        j1 = J;
        k1 = K;
        int ai1[];
        Rect rect;
        PopupWindow popupwindow;
        if (flag)
        {
            i1 = 0;
        }
        ((ckx) (obj)).h.a(j1, k1);
        if (((ckx) (obj)).j == null) goto _L2; else goto _L4
_L4:
        obj1 = ((ckx) (obj)).j;
        obj = ((cga) (obj1)).i;
        obj;
        JVM INSTR monitorenter ;
        obj1.c = j1;
        obj1.d = k1;
        if (((cga) (obj1)).p == null || i1 == 0)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        ai1 = ((cga) (obj1)).a();
        if (ai1 == null)
        {
            break MISSING_BLOCK_LABEL_393;
        }
        popupwindow = ((cga) (obj1)).p;
        bfq.a();
        i1 = bjz.a(((cga) (obj1)).k, ai1[0]);
        bfq.a();
        popupwindow.update(i1, bjz.a(((cga) (obj1)).k, ai1[1]), ((cga) (obj1)).p.getWidth(), ((cga) (obj1)).p.getHeight());
        ((cga) (obj1)).a(ai1[0], ai1[1]);
_L8:
        obj;
        JVM INSTR monitorexit ;
_L2:
        obj = f.getRootView().findViewById(0x1020002);
        if (obj == null) goto _L6; else goto _L5
_L5:
        obj1 = new Rect();
        rect = new Rect();
        f.getGlobalVisibleRect(((Rect) (obj1)));
        ((View) (obj)).getGlobalVisibleRect(rect);
        if (((Rect) (obj1)).top != rect.top)
        {
            G = false;
        }
        if (((Rect) (obj1)).bottom == rect.bottom) goto _L6; else goto _L7
_L7:
        H = false;
        return;
        ((cga) (obj1)).a(true);
          goto _L8
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a()
    {
        if (j != null && j.b != null)
        {
            j.b.destroy();
        }
    }

    public final void a(boolean flag)
    {
        if (C == 0 && j != null && j.b != null)
        {
            j.b.stopLoading();
        }
        if (g != null)
        {
            g.c();
        }
        if (h != null)
        {
            h.c();
        }
        if (flag)
        {
            j = null;
        }
    }

    public final void b()
    {
        if (j == null || j.m == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        j.m.c();
        return;
        RemoteException remoteexception;
        remoteexception;
        bka.e("Could not destroy mediation adapter.");
        return;
    }

    public final boolean c()
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
        I = true;
    }
}

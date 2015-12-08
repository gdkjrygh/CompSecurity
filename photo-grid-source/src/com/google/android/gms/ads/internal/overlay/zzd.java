// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.cx;
import com.google.android.gms.internal.cy;
import com.google.android.gms.internal.ku;
import com.google.android.gms.internal.qd;
import com.google.android.gms.internal.ry;
import com.google.android.gms.internal.sf;
import com.google.android.gms.internal.zzja;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzo, AdOverlayInfoParcel, zzg, i, 
//            h, k, j, zza, 
//            zzm

public class zzd extends ku
    implements zzo
{

    static final int a = Color.argb(0, 0, 0, 0);
    AdOverlayInfoParcel b;
    ry c;
    zzc d;
    zzm e;
    boolean f;
    FrameLayout g;
    android.webkit.WebChromeClient.CustomViewCallback h;
    boolean i;
    boolean j;
    RelativeLayout k;
    boolean l;
    int m;
    private final Activity n;
    private boolean o;
    private boolean p;
    private boolean q;

    public zzd(Activity activity)
    {
        f = false;
        i = false;
        j = false;
        l = false;
        m = 0;
        p = false;
        q = true;
        n = activity;
    }

    static Activity a(zzd zzd1)
    {
        return zzd1.n;
    }

    private void a()
    {
        if (n.isFinishing() && !p)
        {
            p = true;
            if (c != null)
            {
                int i1 = m;
                c.a(i1);
                k.removeView(c.b());
                if (d != null)
                {
                    c.a(d.context);
                    c.a(false);
                    d.zzBx.addView(c.b(), d.index, d.zzBw);
                    d = null;
                }
                c = null;
            }
            if (b != null && b.zzBC != null)
            {
                b.zzBC.zzaV();
                return;
            }
        }
    }

    private void a(boolean flag)
    {
        if (!o)
        {
            n.requestWindowFeature(1);
        }
        Object obj = n.getWindow();
        if (obj == null)
        {
            throw new i("Invalid activity, no window available.");
        }
        if (!j || b.zzBM != null && b.zzBM.zzpu)
        {
            ((Window) (obj)).setFlags(1024, 1024);
        }
        boolean flag3 = b.zzBD.k().zzbY();
        l = false;
        if (flag3)
        {
            if (b.orientation == zzp.zzbx().a())
            {
                boolean flag1;
                if (n.getResources().getConfiguration().orientation == 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                l = flag1;
            } else
            if (b.orientation == zzp.zzbx().b())
            {
                boolean flag2;
                if (n.getResources().getConfiguration().orientation == 2)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                l = flag2;
            }
        }
        zzb.zzaF((new StringBuilder("Delay onShow to next orientation change: ")).append(l).toString());
        setRequestedOrientation(b.orientation);
        if (zzp.zzbx().a(((Window) (obj))))
        {
            zzb.zzaF("Hardware acceleration on the AdActivity window enabled.");
        }
        if (!j)
        {
            k.setBackgroundColor(0xff000000);
        } else
        {
            k.setBackgroundColor(a);
        }
        n.setContentView(k);
        zzaE();
        if (flag)
        {
            zzp.zzbw();
            c = sf.a(n, b.zzBD.j(), true, flag3, null, b.zzqj);
            c.k().zzb(null, null, b.zzBE, b.zzBI, true, b.zzBK, null, b.zzBD.k().zzhq(), null);
            c.k().zza(new h(this));
            if (b.url != null)
            {
                c.loadUrl(b.url);
            } else
            if (b.zzBH != null)
            {
                c.loadDataWithBaseURL(b.zzBF, b.zzBH, "text/html", "UTF-8", null);
            } else
            {
                throw new i("No URL or HTML to display in ad overlay.");
            }
            if (b.zzBD != null)
            {
                b.zzBD.b(this);
            }
        } else
        {
            c = b.zzBD;
            c.a(n);
        }
        c.a(this);
        obj = c.getParent();
        if (obj != null && (obj instanceof ViewGroup))
        {
            ((ViewGroup)obj).removeView(c.b());
        }
        if (j)
        {
            c.setBackgroundColor(a);
        }
        k.addView(c.b(), -1, -1);
        if (!flag && !l)
        {
            b();
        }
        zzu(flag3);
        if (c.l())
        {
            zza(flag3, true);
        }
    }

    private void b()
    {
        c.d();
    }

    public void close()
    {
        m = 2;
        n.finish();
    }

    public void onBackPressed()
    {
        m = 0;
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        i = flag;
        b = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzb(n.getIntent());
        if (b == null)
        {
            throw new i("Could not get info for ad overlay.");
        }
          goto _L1
_L10:
        return;
_L1:
        if (b.zzqj.zzJw > 0x7270e0)
        {
            m = 3;
        }
        if (n.getIntent() != null)
        {
            q = n.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
        }
        if (b.zzBM == null) goto _L3; else goto _L2
_L2:
        j = b.zzBM.zzpt;
_L9:
        com.google.android.gms.internal.cq cq = cy.ap;
        if (((Boolean)zzp.zzbE().a(cq)).booleanValue() && j && b.zzBM.zzpv != null)
        {
            (new k(this, (byte)0)).zzgz();
        }
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        if (b.zzBC != null && q)
        {
            b.zzBC.zzaW();
        }
        if (b.zzBJ != 1 && b.zzBB != null)
        {
            b.zzBB.onAdClicked();
        }
        k = new j(n, b.zzBL);
        b.zzBJ;
        JVM INSTR tableswitch 1 4: default 439
    //                   1 343
    //                   2 349
    //                   3 373
    //                   4 379;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        throw new i("Could not determine ad overlay type.");
_L3:
        j = false;
          goto _L9
_L5:
        try
        {
            a(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            zzb.zzaH(bundle.getMessage());
            m = 3;
            n.finish();
        }
          goto _L10
_L6:
        d = new zzc(b.zzBD);
        a(false);
        return;
_L7:
        a(true);
        return;
_L8:
        if (i)
        {
            m = 3;
            n.finish();
            return;
        }
        if (zzp.zzbs().zza(n, b.zzBA, b.zzBI)) goto _L10; else goto _L11
_L11:
        m = 3;
        n.finish();
        return;
    }

    public void onDestroy()
    {
        if (c != null)
        {
            k.removeView(c.b());
        }
        a();
    }

    public void onPause()
    {
        zzeD();
        if (c != null && (!n.isFinishing() || d == null))
        {
            zzp.zzbx();
            qd.a(c.a());
        }
        a();
    }

    public void onRestart()
    {
    }

    public void onResume()
    {
        if (b != null && b.zzBJ == 4)
        {
            if (i)
            {
                m = 3;
                n.finish();
            } else
            {
                i = true;
            }
        }
        if (c != null && !c.q())
        {
            zzp.zzbx();
            qd.b(c.a());
            return;
        } else
        {
            zzb.zzaH("The webview does not exit. Ignoring action.");
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", i);
    }

    public void onStart()
    {
    }

    public void onStop()
    {
        a();
    }

    public void setRequestedOrientation(int i1)
    {
        n.setRequestedOrientation(i1);
    }

    public void zza(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        g = new FrameLayout(n);
        g.setBackgroundColor(0xff000000);
        g.addView(view, -1, -1);
        n.setContentView(g);
        zzaE();
        h = customviewcallback;
        f = true;
    }

    public void zza(boolean flag, boolean flag1)
    {
        if (e != null)
        {
            e.zza(flag, flag1);
        }
    }

    public void zzaE()
    {
        o = true;
    }

    public void zzeD()
    {
        if (b != null && f)
        {
            setRequestedOrientation(b.orientation);
        }
        if (g != null)
        {
            n.setContentView(k);
            zzaE();
            g.removeAllViews();
            g = null;
        }
        if (h != null)
        {
            h.onCustomViewHidden();
            h = null;
        }
        f = false;
    }

    public void zzeE()
    {
        m = 1;
        n.finish();
    }

    public boolean zzeF()
    {
        m = 0;
        boolean flag;
        if (c == null)
        {
            flag = true;
        } else
        {
            boolean flag1 = c.s();
            flag = flag1;
            if (!flag1)
            {
                c.a("onbackblocked", Collections.emptyMap());
                return flag1;
            }
        }
        return flag;
    }

    public void zzeG()
    {
        k.removeView(e);
        zzu(true);
    }

    public void zzeI()
    {
        if (l)
        {
            l = false;
            b();
        }
    }

    public void zzu(boolean flag)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams;
        byte byte0;
        if (flag)
        {
            byte0 = 50;
        } else
        {
            byte0 = 32;
        }
        e = new zzm(n, byte0, this);
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutparams.addRule(10);
        if (flag)
        {
            byte0 = 11;
        } else
        {
            byte0 = 9;
        }
        layoutparams.addRule(byte0);
        e.zza(flag, b.zzBG);
        k.addView(e, layoutparams);
    }


    private class zzc
    {

        public final Context context;
        public final int index;
        public final android.view.ViewGroup.LayoutParams zzBw;
        public final ViewGroup zzBx;

        public zzc(ry ry1)
        {
            zzBw = ry1.getLayoutParams();
            android.view.ViewParent viewparent = ry1.getParent();
            context = ry1.f();
            if (viewparent != null && (viewparent instanceof ViewGroup))
            {
                zzBx = (ViewGroup)viewparent;
                index = zzBx.indexOfChild(ry1.b());
                zzBx.removeView(ry1.b());
                ry1.a(true);
                return;
            } else
            {
                throw new i("Could not get the parent of the WebView for an overlay.");
            }
        }
    }

}

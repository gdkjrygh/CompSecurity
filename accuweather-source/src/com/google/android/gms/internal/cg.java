// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

// Referenced classes of package com.google.android.gms.internal:
//            ci, ew, ey, cj, 
//            w, ev, er, ez, 
//            ck, cl, u, cd, 
//            ep, eq

public class cg extends co.a
{
    private static final class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }

    private static final class b extends RelativeLayout
    {

        private final eq kG;

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            kG.c(motionevent);
            return false;
        }

        public b(Context context, String s)
        {
            super(context);
            kG = new eq(context, s);
        }
    }

    private static final class c
    {

        public final int index;
        public final android.view.ViewGroup.LayoutParams or;
        public final ViewGroup os;

        public c(ey ey1)
            throws a
        {
            or = ey1.getLayoutParams();
            android.view.ViewParent viewparent = ey1.getParent();
            if (viewparent instanceof ViewGroup)
            {
                os = (ViewGroup)viewparent;
                index = os.indexOfChild(ey1);
                os.removeView(ey1);
                ey1.q(true);
                return;
            } else
            {
                throw new a("Could not get the parent of the WebView for an overlay.");
            }
        }
    }


    private static final int od = Color.argb(0, 0, 0, 0);
    private ey lL;
    private final Activity oe;
    private ci of;
    private ck og;
    private c oh;
    private cl oi;
    private boolean oj;
    private FrameLayout ok;
    private android.webkit.WebChromeClient.CustomViewCallback ol;
    private boolean om;
    private boolean on;
    private boolean oo;
    private RelativeLayout op;

    public cg(Activity activity)
    {
        om = false;
        on = false;
        oo = false;
        oe = activity;
    }

    private static android.widget.RelativeLayout.LayoutParams a(int l, int i1, int j1, int k1)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(j1, k1);
        layoutparams.setMargins(l, i1, 0, 0);
        layoutparams.addRule(10);
        layoutparams.addRule(9);
        return layoutparams;
    }

    public static void a(Context context, ci ci1)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", ci1.kO.sw);
        ci.a(intent, ci1);
        intent.addFlags(0x80000);
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        context.startActivity(intent);
    }

    private void aO()
    {
        if (oe.isFinishing() && !on)
        {
            on = true;
            if (oe.isFinishing())
            {
                if (lL != null)
                {
                    lL.bT();
                    op.removeView(lL);
                    if (oh != null)
                    {
                        lL.q(false);
                        oh.os.addView(lL, oh.index, oh.or);
                    }
                }
                if (of != null && of.ov != null)
                {
                    of.ov.U();
                    return;
                }
            }
        }
    }

    private void k(boolean flag)
        throws a
    {
        if (!oj)
        {
            oe.requestWindowFeature(1);
        }
        Window window = oe.getWindow();
        if (!oo || of.oF.lb)
        {
            window.setFlags(1024, 1024);
        }
        setRequestedOrientation(of.orientation);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            ev.z("Enabling hardware acceleration on the AdActivity window.");
            er.a(window);
        }
        op = new b(oe, of.oE);
        boolean flag1;
        if (!oo)
        {
            op.setBackgroundColor(0xff000000);
        } else
        {
            op.setBackgroundColor(od);
        }
        oe.setContentView(op);
        N();
        flag1 = of.ow.bW().ce();
        if (flag)
        {
            lL = ey.a(oe, of.ow.Q(), true, flag1, null, of.kO);
            lL.bW().a(null, null, of.ox, of.oB, true, of.oD);
            lL.bW().a(new ez.a() {

                final cg oq;

                public void a(ey ey1)
                {
                    ey1.bU();
                }

            
            {
                oq = cg.this;
                super();
            }
            });
            android.view.ViewParent viewparent;
            if (of.nZ != null)
            {
                lL.loadUrl(of.nZ);
            } else
            if (of.oA != null)
            {
                lL.loadDataWithBaseURL(of.oy, of.oA, "text/html", "UTF-8", null);
            } else
            {
                throw new a("No URL or HTML to display in ad overlay.");
            }
        } else
        {
            lL = of.ow;
            lL.setContext(oe);
        }
        lL.a(this);
        viewparent = lL.getParent();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            ((ViewGroup)viewparent).removeView(lL);
        }
        if (oo)
        {
            lL.setBackgroundColor(od);
        }
        op.addView(lL, -1, -1);
        if (!flag)
        {
            lL.bU();
        }
        i(flag1);
    }

    public void N()
    {
        oj = true;
    }

    public void a(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        ok = new FrameLayout(oe);
        ok.setBackgroundColor(0xff000000);
        ok.addView(view, -1, -1);
        oe.setContentView(ok);
        N();
        ol = customviewcallback;
    }

    public ck aL()
    {
        return og;
    }

    public void aM()
    {
        if (of != null)
        {
            setRequestedOrientation(of.orientation);
        }
        if (ok != null)
        {
            oe.setContentView(op);
            N();
            ok.removeAllViews();
            ok = null;
        }
        if (ol != null)
        {
            ol.onCustomViewHidden();
            ol = null;
        }
    }

    public void aN()
    {
        op.removeView(oi);
        i(true);
    }

    public void b(int l, int i1, int j1, int k1)
    {
        if (og != null)
        {
            og.setLayoutParams(a(l, i1, j1, k1));
        }
    }

    public void c(int l, int i1, int j1, int k1)
    {
        if (og == null)
        {
            og = new ck(oe, lL);
            op.addView(og, 0, a(l, i1, j1, k1));
            lL.bW().r(false);
        }
    }

    public void close()
    {
        oe.finish();
    }

    public void i(boolean flag)
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
        oi = new cl(oe, byte0);
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
        oi.j(of.oz);
        op.addView(oi, layoutparams);
    }

    public void j(boolean flag)
    {
        if (oi != null)
        {
            oi.j(flag);
        }
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        om = flag;
        of = ci.a(oe.getIntent());
        if (of.oF == null) goto _L2; else goto _L1
_L1:
        oo = of.oF.kZ;
_L4:
        if (of == null)
        {
            throw new a("Could not get info for ad overlay.");
        }
          goto _L3
_L10:
        return;
_L2:
        oo = false;
          goto _L4
_L3:
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        if (of.ov != null)
        {
            of.ov.V();
        }
        if (of.oC != 1 && of.ou != null)
        {
            of.ou.onAdClicked();
        }
        of.oC;
        JVM INSTR tableswitch 1 4: default 290
    //                   1 207
    //                   2 213
    //                   3 237
    //                   4 243;
           goto _L5 _L6 _L7 _L8 _L9
_L5:
        throw new a("Could not determine ad overlay type.");
_L6:
        k(false);
        return;
_L7:
        try
        {
            oh = new c(of.ow);
            k(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            ev.D(bundle.getMessage());
            oe.finish();
        }
          goto _L10
_L8:
        k(true);
        return;
_L9:
        if (om)
        {
            oe.finish();
            return;
        }
        if (cd.a(oe, of.ot, of.oB)) goto _L10; else goto _L11
_L11:
        oe.finish();
        return;
          goto _L4
    }

    public void onDestroy()
    {
        if (og != null)
        {
            og.destroy();
        }
        if (lL != null)
        {
            op.removeView(lL);
        }
        aO();
    }

    public void onPause()
    {
        if (og != null)
        {
            og.pause();
        }
        aM();
        if (lL != null && (!oe.isFinishing() || oh == null))
        {
            ep.a(lL);
        }
        aO();
    }

    public void onRestart()
    {
    }

    public void onResume()
    {
        if (of != null && of.oC == 4)
        {
            if (om)
            {
                oe.finish();
            } else
            {
                om = true;
            }
        }
        if (lL != null)
        {
            ep.b(lL);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", om);
    }

    public void onStart()
    {
    }

    public void onStop()
    {
        aO();
    }

    public void setRequestedOrientation(int l)
    {
        oe.setRequestedOrientation(l);
    }

}

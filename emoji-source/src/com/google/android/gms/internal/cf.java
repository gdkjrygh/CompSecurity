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
//            ch, ev, ex, ci, 
//            v, eu, eq, ey, 
//            cj, ck, t, cc, 
//            eo, ep

public class cf extends cn.a
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

        private final ep kI;

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            kI.c(motionevent);
            return false;
        }

        public b(Context context, String s)
        {
            super(context);
            kI = new ep(context, s);
        }
    }

    private static final class c
    {

        public final int index;
        public final android.view.ViewGroup.LayoutParams ot;
        public final ViewGroup ou;

        public c(ex ex1)
            throws a
        {
            ot = ex1.getLayoutParams();
            android.view.ViewParent viewparent = ex1.getParent();
            if (viewparent instanceof ViewGroup)
            {
                ou = (ViewGroup)viewparent;
                index = ou.indexOfChild(ex1);
                ou.removeView(ex1);
                ex1.q(true);
                return;
            } else
            {
                throw new a("Could not get the parent of the WebView for an overlay.");
            }
        }
    }


    private static final int of = Color.argb(0, 0, 0, 0);
    private ex lN;
    private final Activity og;
    private ch oh;
    private cj oi;
    private c oj;
    private ck ok;
    private boolean ol;
    private FrameLayout om;
    private android.webkit.WebChromeClient.CustomViewCallback on;
    private boolean oo;
    private boolean op;
    private boolean oq;
    private RelativeLayout or;

    public cf(Activity activity)
    {
        oo = false;
        op = false;
        oq = false;
        og = activity;
    }

    private static android.widget.RelativeLayout.LayoutParams a(int l, int i1, int j1, int k1)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(j1, k1);
        layoutparams.setMargins(l, i1, 0, 0);
        layoutparams.addRule(10);
        layoutparams.addRule(9);
        return layoutparams;
    }

    public static void a(Context context, ch ch1)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", ch1.kQ.sz);
        ch.a(intent, ch1);
        intent.addFlags(0x80000);
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        context.startActivity(intent);
    }

    private void aT()
    {
        if (og.isFinishing() && !op)
        {
            op = true;
            if (og.isFinishing())
            {
                if (lN != null)
                {
                    lN.bY();
                    or.removeView(lN);
                    if (oj != null)
                    {
                        lN.q(false);
                        oj.ou.addView(lN, oj.index, oj.ot);
                    }
                }
                if (oh != null && oh.ox != null)
                {
                    oh.ox.Z();
                    return;
                }
            }
        }
    }

    private void k(boolean flag)
        throws a
    {
        if (!ol)
        {
            og.requestWindowFeature(1);
        }
        Window window = og.getWindow();
        if (!oq || oh.oH.ld)
        {
            window.setFlags(1024, 1024);
        }
        setRequestedOrientation(oh.orientation);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            eu.z("Enabling hardware acceleration on the AdActivity window.");
            eq.a(window);
        }
        or = new b(og, oh.oG);
        boolean flag1;
        if (!oq)
        {
            or.setBackgroundColor(0xff000000);
        } else
        {
            or.setBackgroundColor(of);
        }
        og.setContentView(or);
        S();
        flag1 = oh.oy.cb().cj();
        if (flag)
        {
            lN = ex.a(og, oh.oy.V(), true, flag1, null, oh.kQ);
            lN.cb().a(null, null, oh.oz, oh.oD, true, oh.oF);
            lN.cb().a(new ey.a() {

                final cf os;

                public void a(ex ex1)
                {
                    ex1.bZ();
                }

            
            {
                os = cf.this;
                super();
            }
            });
            android.view.ViewParent viewparent;
            if (oh.ob != null)
            {
                lN.loadUrl(oh.ob);
            } else
            if (oh.oC != null)
            {
                lN.loadDataWithBaseURL(oh.oA, oh.oC, "text/html", "UTF-8", null);
            } else
            {
                throw new a("No URL or HTML to display in ad overlay.");
            }
        } else
        {
            lN = oh.oy;
            lN.setContext(og);
        }
        lN.a(this);
        viewparent = lN.getParent();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            ((ViewGroup)viewparent).removeView(lN);
        }
        if (oq)
        {
            lN.setBackgroundColor(of);
        }
        or.addView(lN, -1, -1);
        if (!flag)
        {
            lN.bZ();
        }
        i(flag1);
    }

    public void S()
    {
        ol = true;
    }

    public void a(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        om = new FrameLayout(og);
        om.setBackgroundColor(0xff000000);
        om.addView(view, -1, -1);
        og.setContentView(om);
        S();
        on = customviewcallback;
    }

    public cj aQ()
    {
        return oi;
    }

    public void aR()
    {
        if (oh != null)
        {
            setRequestedOrientation(oh.orientation);
        }
        if (om != null)
        {
            og.setContentView(or);
            S();
            om.removeAllViews();
            om = null;
        }
        if (on != null)
        {
            on.onCustomViewHidden();
            on = null;
        }
    }

    public void aS()
    {
        or.removeView(ok);
        i(true);
    }

    public void b(int l, int i1, int j1, int k1)
    {
        if (oi != null)
        {
            oi.setLayoutParams(a(l, i1, j1, k1));
        }
    }

    public void c(int l, int i1, int j1, int k1)
    {
        if (oi == null)
        {
            oi = new cj(og, lN);
            or.addView(oi, 0, a(l, i1, j1, k1));
            lN.cb().r(false);
        }
    }

    public void close()
    {
        og.finish();
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
        ok = new ck(og, byte0);
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
        ok.j(oh.oB);
        or.addView(ok, layoutparams);
    }

    public void j(boolean flag)
    {
        if (ok != null)
        {
            ok.j(flag);
        }
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        oo = flag;
        oh = ch.a(og.getIntent());
        if (oh == null)
        {
            throw new a("Could not get info for ad overlay.");
        }
          goto _L1
_L10:
        return;
_L1:
        if (oh.oH == null) goto _L3; else goto _L2
_L2:
        oq = oh.oH.lb;
_L9:
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        if (oh.ox != null)
        {
            oh.ox.aa();
        }
        if (oh.oE != 1 && oh.ow != null)
        {
            oh.ow.onAdClicked();
        }
        oh.oE;
        JVM INSTR tableswitch 1 4: default 290
    //                   1 207
    //                   2 213
    //                   3 237
    //                   4 243;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        throw new a("Could not determine ad overlay type.");
_L3:
        oq = false;
          goto _L9
_L5:
        try
        {
            k(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            eu.D(bundle.getMessage());
            og.finish();
        }
          goto _L10
_L6:
        oj = new c(oh.oy);
        k(false);
        return;
_L7:
        k(true);
        return;
_L8:
        if (oo)
        {
            og.finish();
            return;
        }
        if (cc.a(og, oh.ov, oh.oD)) goto _L10; else goto _L11
_L11:
        og.finish();
        return;
    }

    public void onDestroy()
    {
        if (oi != null)
        {
            oi.destroy();
        }
        if (lN != null)
        {
            or.removeView(lN);
        }
        aT();
    }

    public void onPause()
    {
        if (oi != null)
        {
            oi.pause();
        }
        aR();
        if (lN != null && (!og.isFinishing() || oj == null))
        {
            eo.a(lN);
        }
        aT();
    }

    public void onRestart()
    {
    }

    public void onResume()
    {
        if (oh != null && oh.oE == 4)
        {
            if (oo)
            {
                og.finish();
            } else
            {
                oo = true;
            }
        }
        if (lN != null)
        {
            eo.b(lN);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", oo);
    }

    public void onStart()
    {
    }

    public void onStop()
    {
        aT();
    }

    public void setRequestedOrientation(int l)
    {
        og.setRequestedOrientation(l);
    }

}

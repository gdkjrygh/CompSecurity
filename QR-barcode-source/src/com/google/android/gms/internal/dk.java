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
//            dm, gt, do, gv, 
//            dn, gw, dp, gs, 
//            x, t, dh, gj, 
//            gn, gm

public class dk extends ds.a
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

        private final gm ly;

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            ly.c(motionevent);
            return false;
        }

        public b(Context context, String s)
        {
            super(context);
            ly = new gm(context, s);
        }
    }

    private static final class c
    {

        public final int index;
        public final android.view.ViewGroup.LayoutParams rI;
        public final ViewGroup rJ;

        public c(gv gv1)
            throws a
        {
            rI = gv1.getLayoutParams();
            android.view.ViewParent viewparent = gv1.getParent();
            if (viewparent instanceof ViewGroup)
            {
                rJ = (ViewGroup)viewparent;
                index = rJ.indexOfChild(gv1);
                rJ.removeView(gv1);
                gv1.x(true);
                return;
            } else
            {
                throw new a("Could not get the parent of the WebView for an overlay.");
            }
        }
    }


    private static final int ru = Color.argb(0, 0, 0, 0);
    private gv md;
    private final Activity nr;
    private boolean rA;
    private FrameLayout rB;
    private android.webkit.WebChromeClient.CustomViewCallback rC;
    private boolean rD;
    private boolean rE;
    private boolean rF;
    private RelativeLayout rG;
    private dm rv;
    private do rw;
    private c rx;
    private dp ry;
    private boolean rz;

    public dk(Activity activity)
    {
        rA = false;
        rD = false;
        rE = false;
        rF = false;
        nr = activity;
    }

    private static android.widget.RelativeLayout.LayoutParams a(int i, int j, int k, int l)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(k, l);
        layoutparams.setMargins(i, j, 0, 0);
        layoutparams.addRule(10);
        layoutparams.addRule(9);
        return layoutparams;
    }

    public static void a(Context context, dm dm1)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", dm1.lD.wG);
        dm.a(intent, dm1);
        intent.addFlags(0x80000);
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        context.startActivity(intent);
    }

    public void U()
    {
        rz = true;
    }

    public void a(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        rB = new FrameLayout(nr);
        rB.setBackgroundColor(0xff000000);
        rB.addView(view, -1, -1);
        nr.setContentView(rB);
        U();
        rC = customviewcallback;
        rA = true;
    }

    public void b(int i, int j, int k, int l)
    {
        if (rw != null)
        {
            rw.setLayoutParams(a(i, j, k, l));
        }
    }

    public do bV()
    {
        return rw;
    }

    public void bW()
    {
        if (rv != null && rA)
        {
            setRequestedOrientation(rv.orientation);
        }
        if (rB != null)
        {
            nr.setContentView(rG);
            U();
            rB.removeAllViews();
            rB = null;
        }
        if (rC != null)
        {
            rC.onCustomViewHidden();
            rC = null;
        }
        rA = false;
    }

    public void bX()
    {
        rG.removeView(ry);
        n(true);
    }

    void bY()
    {
        if (nr.isFinishing() && !rE)
        {
            rE = true;
            if (nr.isFinishing())
            {
                if (md != null)
                {
                    ca();
                    rG.removeView(md);
                    if (rx != null)
                    {
                        md.x(false);
                        rx.rJ.addView(md, rx.index, rx.rI);
                    }
                }
                if (rv != null && rv.rM != null)
                {
                    rv.rM.ac();
                    return;
                }
            }
        }
    }

    void bZ()
    {
        md.bZ();
    }

    public void c(int i, int j, int k, int l)
    {
        if (rw == null)
        {
            rw = new do(nr, md);
            rG.addView(rw, 0, a(i, j, k, l));
            md.du().y(false);
        }
    }

    void ca()
    {
        md.ca();
    }

    public void close()
    {
        nr.finish();
    }

    public void n(boolean flag)
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
        ry = new dp(nr, byte0);
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
        ry.o(rv.rQ);
        rG.addView(ry, layoutparams);
    }

    public void o(boolean flag)
    {
        if (ry != null)
        {
            ry.o(flag);
        }
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        rD = flag;
        rv = dm.b(nr.getIntent());
        if (rv == null)
        {
            throw new a("Could not get info for ad overlay.");
        }
          goto _L1
_L10:
        return;
_L1:
        if (rv.rW == null) goto _L3; else goto _L2
_L2:
        rF = rv.rW.lX;
_L9:
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        if (rv.rM != null)
        {
            rv.rM.ad();
        }
        if (rv.rT != 1 && rv.rL != null)
        {
            rv.rL.onAdClicked();
        }
        rv.rT;
        JVM INSTR tableswitch 1 4: default 290
    //                   1 207
    //                   2 213
    //                   3 237
    //                   4 243;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        throw new a("Could not determine ad overlay type.");
_L3:
        rF = false;
          goto _L9
_L5:
        try
        {
            p(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            gs.W(bundle.getMessage());
            nr.finish();
        }
          goto _L10
_L6:
        rx = new c(rv.rN);
        p(false);
        return;
_L7:
        p(true);
        return;
_L8:
        if (rD)
        {
            nr.finish();
            return;
        }
        if (dh.a(nr, rv.rK, rv.rS)) goto _L10; else goto _L11
_L11:
        nr.finish();
        return;
    }

    public void onDestroy()
    {
        if (rw != null)
        {
            rw.destroy();
        }
        if (md != null)
        {
            rG.removeView(md);
        }
        bY();
    }

    public void onPause()
    {
        if (rw != null)
        {
            rw.pause();
        }
        bW();
        if (md != null && (!nr.isFinishing() || rx == null))
        {
            gj.a(md);
        }
        bY();
    }

    public void onRestart()
    {
    }

    public void onResume()
    {
        if (rv != null && rv.rT == 4)
        {
            if (rD)
            {
                nr.finish();
            } else
            {
                rD = true;
            }
        }
        if (md != null)
        {
            gj.b(md);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", rD);
    }

    public void onStart()
    {
    }

    public void onStop()
    {
        bY();
    }

    void p(boolean flag)
        throws a
    {
        if (!rz)
        {
            nr.requestWindowFeature(1);
        }
        Window window = nr.getWindow();
        if (!rF || rv.rW.mh)
        {
            window.setFlags(1024, 1024);
        }
        setRequestedOrientation(rv.orientation);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            gs.S("Enabling hardware acceleration on the AdActivity window.");
            gn.a(window);
        }
        rG = new b(nr, rv.rV);
        boolean flag1;
        if (!rF)
        {
            rG.setBackgroundColor(0xff000000);
        } else
        {
            rG.setBackgroundColor(ru);
        }
        nr.setContentView(rG);
        U();
        flag1 = rv.rN.du().dE();
        if (flag)
        {
            md = gv.a(nr, rv.rN.Y(), true, flag1, null, rv.lD);
            md.du().a(null, null, rv.rO, rv.rS, true, rv.rU, rv.rN.du().dD());
            md.du().a(new gw.a() {

                final dk rH;

                public void a(gv gv1)
                {
                    gv1.bZ();
                }

            
            {
                rH = dk.this;
                super();
            }
            });
            android.view.ViewParent viewparent;
            if (rv.rq != null)
            {
                md.loadUrl(rv.rq);
            } else
            if (rv.rR != null)
            {
                md.loadDataWithBaseURL(rv.rP, rv.rR, "text/html", "UTF-8", null);
            } else
            {
                throw new a("No URL or HTML to display in ad overlay.");
            }
        } else
        {
            md = rv.rN;
            md.setContext(nr);
        }
        md.a(this);
        viewparent = md.getParent();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            ((ViewGroup)viewparent).removeView(md);
        }
        if (rF)
        {
            md.setBackgroundColor(ru);
        }
        rG.addView(md, -1, -1);
        if (!flag)
        {
            bZ();
        }
        n(flag1);
        if (md.dv())
        {
            o(true);
        }
    }

    public void setRequestedOrientation(int i)
    {
        nr.setRequestedOrientation(i);
    }

}

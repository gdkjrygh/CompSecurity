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
//            dr, gs, ll, dt, 
//            gu, gv, ds, gr, 
//            y, t, dm, gi, 
//            du, gm, gl

public class dp extends dx.a
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

        private final gl lJ;

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            lJ.c(motionevent);
            return false;
        }

        public b(Context context, String s)
        {
            super(context);
            lJ = new gl(context, s);
        }
    }

    private static final class c
    {

        public final int index;
        public final android.view.ViewGroup.LayoutParams rZ;
        public final ViewGroup sa;

        public c(gu gu1)
            throws a
        {
            rZ = gu1.getLayoutParams();
            android.view.ViewParent viewparent = gu1.getParent();
            if (viewparent instanceof ViewGroup)
            {
                sa = (ViewGroup)viewparent;
                index = sa.indexOfChild(gu1);
                sa.removeView(gu1);
                gu1.z(true);
                return;
            } else
            {
                throw new a("Could not get the parent of the WebView for an overlay.");
            }
        }
    }


    private static final int rL = Color.argb(0, 0, 0, 0);
    private gu mo;
    private final Activity nB;
    private dr rM;
    private dt rN;
    private c rO;
    private du rP;
    private boolean rQ;
    private boolean rR;
    private FrameLayout rS;
    private android.webkit.WebChromeClient.CustomViewCallback rT;
    private boolean rU;
    private boolean rV;
    private boolean rW;
    private RelativeLayout rX;

    public dp(Activity activity)
    {
        rR = false;
        rU = false;
        rV = false;
        rW = false;
        nB = activity;
    }

    private static android.widget.RelativeLayout.LayoutParams a(int i, int j, int k, int l)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(k, l);
        layoutparams.setMargins(i, j, 0, 0);
        layoutparams.addRule(10);
        layoutparams.addRule(9);
        return layoutparams;
    }

    public static void a(Context context, dr dr1)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", dr1.lO.wV);
        dr.a(intent, dr1);
        if (!ll.in())
        {
            intent.addFlags(0x80000);
        }
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        context.startActivity(intent);
    }

    public void X()
    {
        rQ = true;
    }

    public void a(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        rS = new FrameLayout(nB);
        rS.setBackgroundColor(0xff000000);
        rS.addView(view, -1, -1);
        nB.setContentView(rS);
        X();
        rT = customviewcallback;
        rR = true;
    }

    public void b(int i, int j, int k, int l)
    {
        if (rN != null)
        {
            rN.setLayoutParams(a(i, j, k, l));
        }
    }

    public void c(int i, int j, int k, int l)
    {
        if (rN == null)
        {
            rN = new dt(nB, mo);
            rX.addView(rN, 0, a(i, j, k, l));
            mo.dD().A(false);
        }
    }

    public dt ce()
    {
        return rN;
    }

    public void cf()
    {
        if (rM != null && rR)
        {
            setRequestedOrientation(rM.orientation);
        }
        if (rS != null)
        {
            nB.setContentView(rX);
            X();
            rS.removeAllViews();
            rS = null;
        }
        if (rT != null)
        {
            rT.onCustomViewHidden();
            rT = null;
        }
        rR = false;
    }

    public void cg()
    {
        rX.removeView(rP);
        p(true);
    }

    void ch()
    {
        if (nB.isFinishing() && !rV)
        {
            rV = true;
            if (nB.isFinishing())
            {
                if (mo != null)
                {
                    cj();
                    rX.removeView(mo);
                    if (rO != null)
                    {
                        mo.z(false);
                        rO.sa.addView(mo, rO.index, rO.rZ);
                    }
                }
                if (rM != null && rM.sd != null)
                {
                    rM.sd.ag();
                    return;
                }
            }
        }
    }

    void ci()
    {
        mo.ci();
    }

    void cj()
    {
        mo.cj();
    }

    public void close()
    {
        nB.finish();
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        rU = flag;
        rM = dr.b(nB.getIntent());
        if (rM == null)
        {
            throw new a("Could not get info for ad overlay.");
        }
          goto _L1
_L10:
        return;
_L1:
        if (rM.sn == null) goto _L3; else goto _L2
_L2:
        rW = rM.sn.mi;
_L9:
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        if (rM.sd != null)
        {
            rM.sd.ah();
        }
        if (rM.sk != 1 && rM.sc != null)
        {
            rM.sc.onAdClicked();
        }
        rM.sk;
        JVM INSTR tableswitch 1 4: default 290
    //                   1 207
    //                   2 213
    //                   3 237
    //                   4 243;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        throw new a("Could not determine ad overlay type.");
_L3:
        rW = false;
          goto _L9
_L5:
        try
        {
            r(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            gr.W(bundle.getMessage());
            nB.finish();
        }
          goto _L10
_L6:
        rO = new c(rM.se);
        r(false);
        return;
_L7:
        r(true);
        return;
_L8:
        if (rU)
        {
            nB.finish();
            return;
        }
        if (dm.a(nB, rM.sb, rM.sj)) goto _L10; else goto _L11
_L11:
        nB.finish();
        return;
    }

    public void onDestroy()
    {
        if (rN != null)
        {
            rN.destroy();
        }
        if (mo != null)
        {
            rX.removeView(mo);
        }
        ch();
    }

    public void onPause()
    {
        if (rN != null)
        {
            rN.pause();
        }
        cf();
        if (mo != null && (!nB.isFinishing() || rO == null))
        {
            gi.a(mo);
        }
        ch();
    }

    public void onRestart()
    {
    }

    public void onResume()
    {
        if (rM != null && rM.sk == 4)
        {
            if (rU)
            {
                nB.finish();
            } else
            {
                rU = true;
            }
        }
        if (mo != null)
        {
            gi.b(mo);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", rU);
    }

    public void onStart()
    {
    }

    public void onStop()
    {
        ch();
    }

    public void p(boolean flag)
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
        rP = new du(nB, byte0);
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
        rP.q(rM.sh);
        rX.addView(rP, layoutparams);
    }

    public void q(boolean flag)
    {
        if (rP != null)
        {
            rP.q(flag);
        }
    }

    void r(boolean flag)
        throws a
    {
        if (!rQ)
        {
            nB.requestWindowFeature(1);
        }
        Window window = nB.getWindow();
        if (!rW || rM.sn.ms)
        {
            window.setFlags(1024, 1024);
        }
        setRequestedOrientation(rM.orientation);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            gr.S("Enabling hardware acceleration on the AdActivity window.");
            gm.a(window);
        }
        rX = new b(nB, rM.sm);
        boolean flag1;
        if (!rW)
        {
            rX.setBackgroundColor(0xff000000);
        } else
        {
            rX.setBackgroundColor(rL);
        }
        nB.setContentView(rX);
        X();
        flag1 = rM.se.dD().dN();
        if (flag)
        {
            mo = gu.a(nB, rM.se.ac(), true, flag1, null, rM.lO);
            mo.dD().a(null, null, rM.sf, rM.sj, true, rM.sl, rM.se.dD().dM());
            mo.dD().a(new gv.a() {

                final dp rY;

                public void a(gu gu1)
                {
                    gu1.ci();
                }

            
            {
                rY = dp.this;
                super();
            }
            });
            android.view.ViewParent viewparent;
            if (rM.rH != null)
            {
                mo.loadUrl(rM.rH);
            } else
            if (rM.si != null)
            {
                mo.loadDataWithBaseURL(rM.sg, rM.si, "text/html", "UTF-8", null);
            } else
            {
                throw new a("No URL or HTML to display in ad overlay.");
            }
        } else
        {
            mo = rM.se;
            mo.setContext(nB);
        }
        mo.a(this);
        viewparent = mo.getParent();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            ((ViewGroup)viewparent).removeView(mo);
        }
        if (rW)
        {
            mo.setBackgroundColor(rL);
        }
        rX.addView(mo, -1, -1);
        if (!flag)
        {
            ci();
        }
        p(flag1);
        if (mo.dE())
        {
            q(true);
        }
    }

    public void setRequestedOrientation(int i)
    {
        nB.setRequestedOrientation(i);
    }

}

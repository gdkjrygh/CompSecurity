// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

// Referenced classes of package com.google.android.gms.internal:
//            ce, dx, dz, cf, 
//            dw, ds, ea, cg, 
//            ch, u, bz, dq, 
//            dr

public class cc extends ck.a
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

        private final dr kF;

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            kF.c(motionevent);
            return false;
        }

        public b(Context context, String s)
        {
            super(context);
            kF = new dr(context, s);
        }
    }

    private static final class c
    {

        public final int index;
        public final android.view.ViewGroup.LayoutParams oe;
        public final ViewGroup of;

        public c(dz dz1)
            throws a
        {
            oe = dz1.getLayoutParams();
            android.view.ViewParent viewparent = dz1.getParent();
            if (viewparent instanceof ViewGroup)
            {
                of = (ViewGroup)viewparent;
                index = of.indexOfChild(dz1);
                of.removeView(dz1);
                dz1.p(true);
                return;
            } else
            {
                throw new a("Could not get the parent of the WebView for an overlay.");
            }
        }
    }


    private dz lC;
    private final Activity nS;
    private ce nT;
    private cg nU;
    private c nV;
    private ch nW;
    private boolean nX;
    private FrameLayout nY;
    private android.webkit.WebChromeClient.CustomViewCallback nZ;
    private boolean oa;
    private boolean ob;
    private RelativeLayout oc;

    public cc(Activity activity)
    {
        oa = false;
        ob = false;
        nS = activity;
    }

    private static android.widget.RelativeLayout.LayoutParams a(int k, int l, int i1, int j1)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(i1, j1);
        layoutparams.setMargins(k, l, 0, 0);
        layoutparams.addRule(10);
        layoutparams.addRule(9);
        return layoutparams;
    }

    public static void a(Context context, ce ce1)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", ce1.kK.rt);
        ce.a(intent, ce1);
        intent.addFlags(0x80000);
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        context.startActivity(intent);
    }

    private void aN()
    {
        if (nS.isFinishing() && !ob)
        {
            ob = true;
            if (nS.isFinishing())
            {
                if (lC != null)
                {
                    lC.bF();
                    oc.removeView(lC);
                    if (nV != null)
                    {
                        lC.p(false);
                        nV.of.addView(lC, nV.index, nV.oe);
                    }
                }
                if (nT != null && nT.oi != null)
                {
                    nT.oi.V();
                    return;
                }
            }
        }
    }

    private void j(boolean flag)
        throws a
    {
        if (!nX)
        {
            nS.requestWindowFeature(1);
        }
        Window window = nS.getWindow();
        window.setFlags(1024, 1024);
        setRequestedOrientation(nT.orientation);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            dw.v("Enabling hardware acceleration on the AdActivity window.");
            ds.a(window);
        }
        oc = new b(nS, nT.or);
        oc.setBackgroundColor(0xff000000);
        nS.setContentView(oc);
        N();
        boolean flag1 = nT.oj.bI().bP();
        if (flag)
        {
            lC = dz.a(nS, nT.oj.R(), true, flag1, null, nT.kK);
            lC.bI().a(null, null, nT.ok, nT.oo, true, nT.oq);
            lC.bI().a(new ea.a() {

                final cc od;

                public void a(dz dz1)
                {
                    dz1.bG();
                }

            
            {
                od = cc.this;
                super();
            }
            });
            android.view.ViewParent viewparent;
            if (nT.nO != null)
            {
                lC.loadUrl(nT.nO);
            } else
            if (nT.on != null)
            {
                lC.loadDataWithBaseURL(nT.ol, nT.on, "text/html", "UTF-8", null);
            } else
            {
                throw new a("No URL or HTML to display in ad overlay.");
            }
        } else
        {
            lC = nT.oj;
            lC.setContext(nS);
        }
        lC.a(this);
        viewparent = lC.getParent();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            ((ViewGroup)viewparent).removeView(lC);
        }
        oc.addView(lC, -1, -1);
        if (!flag)
        {
            lC.bG();
        }
        h(flag1);
    }

    public void N()
    {
        nX = true;
    }

    public void a(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        nY = new FrameLayout(nS);
        nY.setBackgroundColor(0xff000000);
        nY.addView(view, -1, -1);
        nS.setContentView(nY);
        N();
        nZ = customviewcallback;
    }

    public cg aK()
    {
        return nU;
    }

    public void aL()
    {
        if (nT != null)
        {
            setRequestedOrientation(nT.orientation);
        }
        if (nY != null)
        {
            nS.setContentView(oc);
            N();
            nY.removeAllViews();
            nY = null;
        }
        if (nZ != null)
        {
            nZ.onCustomViewHidden();
            nZ = null;
        }
    }

    public void aM()
    {
        oc.removeView(nW);
        h(true);
    }

    public void b(int k, int l, int i1, int j1)
    {
        if (nU != null)
        {
            nU.setLayoutParams(a(k, l, i1, j1));
        }
    }

    public void c(int k, int l, int i1, int j1)
    {
        if (nU == null)
        {
            nU = new cg(nS, lC);
            oc.addView(nU, 0, a(k, l, i1, j1));
            lC.bI().q(false);
        }
    }

    public void close()
    {
        nS.finish();
    }

    public void h(boolean flag)
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
        nW = new ch(nS, byte0);
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
        nW.i(nT.om);
        oc.addView(nW, layoutparams);
    }

    public void i(boolean flag)
    {
        if (nW != null)
        {
            nW.i(flag);
        }
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        oa = flag;
        nT = ce.a(nS.getIntent());
        if (nT == null)
        {
            throw new a("Could not get info for ad overlay.");
        }
          goto _L1
_L7:
        return;
_L1:
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        if (nT.oi != null)
        {
            nT.oi.W();
        }
        if (nT.op != 1 && nT.oh != null)
        {
            nT.oh.P();
        }
        nT.op;
        JVM INSTR tableswitch 1 4: default 258
    //                   1 175
    //                   2 181
    //                   3 205
    //                   4 211;
           goto _L2 _L3 _L4 _L5 _L6
_L2:
        throw new a("Could not determine ad overlay type.");
_L3:
        j(false);
        return;
_L4:
        try
        {
            nV = new c(nT.oj);
            j(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            dw.z(bundle.getMessage());
            nS.finish();
        }
          goto _L7
_L5:
        j(true);
        return;
_L6:
        if (oa)
        {
            nS.finish();
            return;
        }
        if (bz.a(nS, nT.og, nT.oo)) goto _L7; else goto _L8
_L8:
        nS.finish();
        return;
    }

    public void onDestroy()
    {
        if (nU != null)
        {
            nU.destroy();
        }
        if (lC != null)
        {
            oc.removeView(lC);
        }
        aN();
    }

    public void onPause()
    {
        if (nU != null)
        {
            nU.pause();
        }
        aL();
        if (lC != null && (!nS.isFinishing() || nV == null))
        {
            dq.a(lC);
        }
        aN();
    }

    public void onRestart()
    {
    }

    public void onResume()
    {
        if (nT != null && nT.op == 4)
        {
            if (oa)
            {
                nS.finish();
            } else
            {
                oa = true;
            }
        }
        if (lC != null)
        {
            dq.b(lC);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", oa);
    }

    public void onStart()
    {
    }

    public void onStop()
    {
        aN();
    }

    public void setRequestedOrientation(int k)
    {
        nS.setRequestedOrientation(k);
    }
}

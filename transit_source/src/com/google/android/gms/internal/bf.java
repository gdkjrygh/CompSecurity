// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

// Referenced classes of package com.google.android.gms.internal:
//            cq, bh, bi, co, 
//            cn, cj, cr, bj, 
//            bk, q, bc, ci

public final class bf extends bn.a
{
    private static final class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }

    private static final class b
    {

        public final android.view.ViewGroup.LayoutParams fP;
        public final ViewGroup fQ;
        public final int index;

        public b(cq cq1)
            throws a
        {
            fP = cq1.getLayoutParams();
            android.view.ViewParent viewparent = cq1.getParent();
            if (viewparent instanceof ViewGroup)
            {
                fQ = (ViewGroup)viewparent;
                index = fQ.indexOfChild(cq1);
                fQ.removeView(cq1);
                cq1.i(true);
                return;
            } else
            {
                throw new a("Could not get the parent of the WebView for an overlay.");
            }
        }
    }


    private final Activity fD;
    private bh fE;
    private bj fF;
    private cq fG;
    private b fH;
    private bk fI;
    private FrameLayout fJ;
    private android.webkit.WebChromeClient.CustomViewCallback fK;
    private boolean fL;
    private boolean fM;
    private RelativeLayout fN;

    public bf(Activity activity)
    {
        fL = false;
        fM = false;
        fD = activity;
    }

    private void T()
    {
        if (fD.isFinishing() && !fM)
        {
            fM = true;
            if (fD.isFinishing())
            {
                if (fG != null)
                {
                    fG.as();
                    fN.removeView(fG);
                    if (fH != null)
                    {
                        fG.i(false);
                        fH.fQ.addView(fG, fH.index, fH.fP);
                    }
                }
                if (fE != null && fE.fT != null)
                {
                    fE.fT.B();
                    return;
                }
            }
        }
    }

    private static android.widget.RelativeLayout.LayoutParams a(int i, int j, int k, int l)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(k, l);
        layoutparams.setMargins(i, j, 0, 0);
        layoutparams.addRule(10);
        layoutparams.addRule(9);
        return layoutparams;
    }

    public static void a(Context context, bh bh1)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", bh1.eg.hS);
        bh.a(intent, bh1);
        intent.addFlags(0x80000);
        context.startActivity(intent);
    }

    private void e(boolean flag)
        throws a
    {
        fD.requestWindowFeature(1);
        Window window = fD.getWindow();
        window.setFlags(1024, 1024);
        setRequestedOrientation(fE.orientation);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            cn.m("Enabling hardware acceleration on the AdActivity window.");
            cj.a(window);
        }
        fN = new RelativeLayout(fD);
        fN.setBackgroundColor(0xff000000);
        fD.setContentView(fN);
        boolean flag1 = fE.fU.aw().aD();
        if (flag)
        {
            fG = cq.a(fD, fE.fU.av(), true, flag1, null, fE.eg);
            fG.aw().a(null, null, fE.fV, fE.fZ, true);
            fG.aw().a(new cr.a() {

                final bf fO;

                public void a(cq cq1)
                {
                    cq1.at();
                }

            
            {
                fO = bf.this;
                super();
            }
            });
            if (fE.fz != null)
            {
                fG.loadUrl(fE.fz);
            } else
            if (fE.fY != null)
            {
                fG.loadDataWithBaseURL(fE.fW, fE.fY, "text/html", "UTF-8", null);
            } else
            {
                throw new a("No URL or HTML to display in ad overlay.");
            }
        } else
        {
            fG = fE.fU;
            fG.setContext(fD);
        }
        fG.a(this);
        fN.addView(fG, -1, -1);
        if (!flag)
        {
            fG.at();
        }
        c(flag1);
    }

    public bj Q()
    {
        return fF;
    }

    public void R()
    {
        if (fE != null)
        {
            setRequestedOrientation(fE.orientation);
        }
        if (fJ != null)
        {
            fD.setContentView(fN);
            fJ.removeAllViews();
            fJ = null;
        }
        if (fK != null)
        {
            fK.onCustomViewHidden();
            fK = null;
        }
    }

    public void S()
    {
        fN.removeView(fI);
        c(true);
    }

    public void a(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        fJ = new FrameLayout(fD);
        fJ.setBackgroundColor(0xff000000);
        fJ.addView(view, -1, -1);
        fD.setContentView(fJ);
        fK = customviewcallback;
    }

    public void b(int i, int j, int k, int l)
    {
        if (fF != null)
        {
            fF.setLayoutParams(a(i, j, k, l));
        }
    }

    public void c(int i, int j, int k, int l)
    {
        if (fF == null)
        {
            fF = new bj(fD, fG);
            fN.addView(fF, 0, a(i, j, k, l));
            fG.aw().j(false);
        }
    }

    public void c(boolean flag)
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
        fI = new bk(fD, byte0);
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
        fI.d(fE.fX);
        fN.addView(fI, layoutparams);
    }

    public void close()
    {
        fD.finish();
    }

    public void d(boolean flag)
    {
        if (fI != null)
        {
            fI.d(flag);
        }
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        fL = flag;
        fE = bh.a(fD.getIntent());
        if (fE == null)
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
        if (fE.fT != null)
        {
            fE.fT.C();
        }
        if (fE.ga != 1 && fE.fS != null)
        {
            fE.fS.y();
        }
        fE.ga;
        JVM INSTR tableswitch 1 4: default 258
    //                   1 175
    //                   2 181
    //                   3 205
    //                   4 211;
           goto _L2 _L3 _L4 _L5 _L6
_L2:
        throw new a("Could not determine ad overlay type.");
_L3:
        e(false);
        return;
_L4:
        try
        {
            fH = new b(fE.fU);
            e(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            cn.q(bundle.getMessage());
            fD.finish();
        }
          goto _L7
_L5:
        e(true);
        return;
_L6:
        if (fL)
        {
            fD.finish();
            return;
        }
        if (bc.a(fD, fE.fR, fE.fZ)) goto _L7; else goto _L8
_L8:
        fD.finish();
        return;
    }

    public void onDestroy()
    {
        if (fF != null)
        {
            fF.destroy();
        }
        if (fG != null)
        {
            fN.removeView(fG);
        }
        T();
    }

    public void onPause()
    {
        if (fF != null)
        {
            fF.pause();
        }
        R();
        if (fG != null && (!fD.isFinishing() || fH == null))
        {
            ci.a(fG);
        }
        T();
    }

    public void onRestart()
    {
    }

    public void onResume()
    {
        if (fE != null && fE.ga == 4)
        {
            if (fL)
            {
                fD.finish();
            } else
            {
                fL = true;
            }
        }
        if (fG != null)
        {
            ci.b(fG);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", fL);
    }

    public void onStart()
    {
    }

    public void onStop()
    {
        T();
    }

    public void setRequestedOrientation(int i)
    {
        fD.setRequestedOrientation(i);
    }
}

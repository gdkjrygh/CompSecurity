// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
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
import com.google.android.gms.internal.au;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.ba;
import com.google.android.gms.internal.bc;
import com.google.android.gms.internal.bd;
import com.google.android.gms.internal.gn;
import com.google.android.gms.internal.gx;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hs;
import com.google.android.gms.internal.ht;
import com.google.android.gms.internal.hu;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzo, AdOverlayInfoParcel, zzg, zza, 
//            zzk, zzm

public class zzd extends com.google.android.gms.internal.eg.a
    implements zzo
{
    private static final class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }
    }

    static final class zzb extends RelativeLayout
    {

        gy zzqF;

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            zzqF.a(motionevent);
            return false;
        }

        public zzb(Context context, String s)
        {
            super(context);
            zzqF = new gy(context, s);
        }
    }

    public static class zzc
    {

        public final Context context;
        public final int index;
        public final android.view.ViewGroup.LayoutParams zzAM;
        public final ViewGroup zzAN;

        public zzc(hs hs1)
            throws zza
        {
            zzAM = hs1.getLayoutParams();
            android.view.ViewParent viewparent = hs1.getParent();
            context = hs1.d();
            if (viewparent != null && (viewparent instanceof ViewGroup))
            {
                zzAN = (ViewGroup)viewparent;
                index = zzAN.indexOfChild(hs1.getWebView());
                zzAN.removeView(hs1.getWebView());
                hs1.a(true);
                return;
            } else
            {
                throw new zza("Could not get the parent of the WebView for an overlay.");
            }
        }
    }


    static final int zzAu = Color.argb(0, 0, 0, 0);
    private final Activity mActivity;
    zzm zzAA;
    boolean zzAB;
    FrameLayout zzAC;
    android.webkit.WebChromeClient.CustomViewCallback zzAD;
    boolean zzAE;
    boolean zzAF;
    boolean zzAG;
    int zzAH;
    private boolean zzAI;
    private boolean zzAJ;
    private boolean zzAK;
    private final bd zzAv;
    private final bc zzAw;
    AdOverlayInfoParcel zzAx;
    zzk zzAy;
    zzc zzAz;
    hs zzoL;
    RelativeLayout zzzA;

    public zzd(Activity activity)
    {
        zzAB = false;
        zzAE = false;
        zzAF = false;
        zzAG = false;
        zzAH = 0;
        zzAJ = false;
        zzAK = true;
        mActivity = activity;
        zzAv = new bd(((Boolean)ay.G.c()).booleanValue(), "show_interstitial", "interstitial");
        zzAw = zzAv.a();
    }

    public void close()
    {
        zzAH = 2;
        mActivity.finish();
    }

    public void onBackPressed()
    {
        zzAH = 0;
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        zzAE = flag;
        zzAx = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzb(mActivity.getIntent());
        if (zzAx == null)
        {
            throw new zza("Could not get info for ad overlay.");
        }
          goto _L1
_L10:
        return;
_L1:
        if (zzAx.zzqb.zzIB > 0x7270e0)
        {
            zzAH = 3;
        }
        if (mActivity.getIntent() != null)
        {
            zzAK = mActivity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
        }
        if (zzAx.zzBa == null) goto _L3; else goto _L2
_L2:
        zzAF = zzAx.zzBa.zzpk;
_L9:
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        if (zzAx.zzAQ != null && zzAK)
        {
            zzAx.zzAQ.zzaW();
        }
        if (zzAx.zzAX != 1 && zzAx.zzAP != null)
        {
            zzAx.zzAP.onAdClicked();
        }
        zzzA = new zzb(mActivity, zzAx.zzAZ);
        zzAx.zzAX;
        JVM INSTR tableswitch 1 4: default 382
    //                   1 286
    //                   2 292
    //                   3 316
    //                   4 322;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        throw new zza("Could not determine ad overlay type.");
_L3:
        zzAF = false;
          goto _L9
_L5:
        try
        {
            zzv(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE(bundle.getMessage());
            zzAH = 3;
            mActivity.finish();
        }
          goto _L10
_L6:
        zzAz = new zzc(zzAx.zzAR);
        zzv(false);
        return;
_L7:
        zzv(true);
        return;
_L8:
        if (zzAE)
        {
            zzAH = 3;
            mActivity.finish();
            return;
        }
        if (zzp.zzbu().zza(mActivity, zzAx.zzAO, zzAx.zzAW)) goto _L10; else goto _L11
_L11:
        zzAH = 3;
        mActivity.finish();
        return;
    }

    public void onDestroy()
    {
        if (zzAy != null)
        {
            zzAy.destroy();
        }
        if (zzoL != null)
        {
            zzzA.removeView(zzoL.getWebView());
        }
        zzeB();
    }

    public void onPause()
    {
        if (zzAy != null)
        {
            zzAy.pause();
        }
        zzex();
        if (zzoL != null && (!mActivity.isFinishing() || zzAz == null))
        {
            zzp.zzbz().a(zzoL.getWebView());
        }
        zzeB();
    }

    public void onRestart()
    {
    }

    public void onResume()
    {
        if (zzAx != null && zzAx.zzAX == 4)
        {
            if (zzAE)
            {
                zzAH = 3;
                mActivity.finish();
            } else
            {
                zzAE = true;
            }
        }
        if (zzoL != null && !zzoL.n())
        {
            zzp.zzbz().b(zzoL.getWebView());
            return;
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("The webview does not exit. Ignoring action.");
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", zzAE);
    }

    public void onStart()
    {
    }

    public void onStop()
    {
        zzeB();
    }

    public void setRequestedOrientation(int i)
    {
        mActivity.setRequestedOrientation(i);
    }

    public void zza(int i, int j, int k, int l, int i1)
    {
        zzAv.a(zzAw, new String[] {
            "vpr"
        });
        bc bc = zzAv.a();
        if (zzAy == null)
        {
            zzAy = new zzk(mActivity, zzoL, i1, zzAv, bc);
            zzzA.addView(zzAy, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
            zzAy.zze(i, j, k, l);
            zzoL.i().a(false);
        }
    }

    public void zza(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        zzAC = new FrameLayout(mActivity);
        zzAC.setBackgroundColor(0xff000000);
        zzAC.addView(view, -1, -1);
        mActivity.setContentView(zzAC);
        zzaE();
        zzAD = customviewcallback;
        zzAB = true;
    }

    public void zza(boolean flag, boolean flag1)
    {
        if (zzAA != null)
        {
            zzAA.zza(flag, flag1);
        }
    }

    public void zzaE()
    {
        zzAI = true;
    }

    public void zzd(int i, int j, int k, int l)
    {
        if (zzAy != null)
        {
            zzAy.zze(i, j, k, l);
        }
    }

    public void zzeA()
    {
        zzzA.removeView(zzAA);
        zzu(true);
    }

    protected void zzeB()
    {
        if (mActivity.isFinishing() && !zzAJ)
        {
            zzAJ = true;
            if (zzp.zzbA().e() != null)
            {
                zzp.zzbA().e().a(zzAv);
            }
            if (zzoL != null)
            {
                zzv(zzAH);
                zzzA.removeView(zzoL.getWebView());
                if (zzAz != null)
                {
                    zzoL.setContext(zzAz.context);
                    zzoL.a(false);
                    zzAz.zzAN.addView(zzoL.getWebView(), zzAz.index, zzAz.zzAM);
                    zzAz = null;
                }
                zzoL = null;
            }
            if (zzAx != null && zzAx.zzAQ != null)
            {
                zzAx.zzAQ.zzaV();
                return;
            }
        }
    }

    public void zzeC()
    {
        if (zzAG)
        {
            zzAG = false;
            zzeD();
        }
    }

    protected void zzeD()
    {
        zzoL.b();
    }

    public zzk zzew()
    {
        return zzAy;
    }

    public void zzex()
    {
        if (zzAx != null && zzAB)
        {
            setRequestedOrientation(zzAx.orientation);
        }
        if (zzAC != null)
        {
            mActivity.setContentView(zzzA);
            zzaE();
            zzAC.removeAllViews();
            zzAC = null;
        }
        if (zzAD != null)
        {
            zzAD.onCustomViewHidden();
            zzAD = null;
        }
        zzAB = false;
    }

    public void zzey()
    {
        zzAH = 1;
        mActivity.finish();
    }

    public boolean zzez()
    {
        zzAH = 0;
        boolean flag;
        if (zzoL == null)
        {
            flag = true;
        } else
        {
            boolean flag1 = zzoL.p();
            flag = flag1;
            if (!flag1)
            {
                zzoL.a("onbackblocked", Collections.emptyMap());
                return flag1;
            }
        }
        return flag;
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
        zzAA = new zzm(mActivity, byte0, this);
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
        zzAA.zza(flag, zzAx.zzAU);
        zzzA.addView(zzAA, layoutparams);
    }

    protected void zzv(int i)
    {
        zzoL.a(i);
    }

    protected void zzv(boolean flag)
        throws zza
    {
        if (!zzAI)
        {
            mActivity.requestWindowFeature(1);
        }
        Object obj = mActivity.getWindow();
        if (obj == null)
        {
            throw new zza("Invalid activity, no window available.");
        }
        if (!zzAF || zzAx.zzBa != null && zzAx.zzBa.zzpl)
        {
            ((Window) (obj)).setFlags(1024, 1024);
        }
        boolean flag3 = zzAx.zzAR.i().b();
        zzAG = false;
        if (flag3)
        {
            if (zzAx.orientation == zzp.zzbz().a())
            {
                boolean flag1;
                if (mActivity.getResources().getConfiguration().orientation == 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                zzAG = flag1;
            } else
            if (zzAx.orientation == zzp.zzbz().b())
            {
                boolean flag2;
                if (mActivity.getResources().getConfiguration().orientation == 2)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                zzAG = flag2;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Delay onShow to next orientation change: ").append(zzAG).toString());
        setRequestedOrientation(zzAx.orientation);
        if (zzp.zzbz().a(((Window) (obj))))
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Hardware acceleration on the AdActivity window enabled.");
        }
        if (!zzAF)
        {
            zzzA.setBackgroundColor(0xff000000);
        } else
        {
            zzzA.setBackgroundColor(zzAu);
        }
        mActivity.setContentView(zzzA);
        zzaE();
        if (flag)
        {
            zzoL = zzp.zzby().a(mActivity, zzAx.zzAR.h(), true, flag3, null, zzAx.zzqb);
            zzoL.i().a(null, null, zzAx.zzAS, zzAx.zzAW, true, zzAx.zzAY, null, zzAx.zzAR.i().a(), null);
            zzoL.i().a(new com.google.android.gms.internal.ht.a() {

                final zzd zzAL;

                public void zza(hs hs1, boolean flag4)
                {
                    hs1.b();
                }

            
            {
                zzAL = zzd.this;
                super();
            }
            });
            if (zzAx.url != null)
            {
                zzoL.loadUrl(zzAx.url);
            } else
            if (zzAx.zzAV != null)
            {
                zzoL.loadDataWithBaseURL(zzAx.zzAT, zzAx.zzAV, "text/html", "UTF-8", null);
            } else
            {
                throw new zza("No URL or HTML to display in ad overlay.");
            }
            if (zzAx.zzAR != null)
            {
                zzAx.zzAR.b(this);
            }
        } else
        {
            zzoL = zzAx.zzAR;
            zzoL.setContext(mActivity);
        }
        zzoL.a(this);
        obj = zzoL.getParent();
        if (obj != null && (obj instanceof ViewGroup))
        {
            ((ViewGroup)obj).removeView(zzoL.getWebView());
        }
        if (zzAF)
        {
            zzoL.setBackgroundColor(zzAu);
        }
        zzzA.addView(zzoL.getWebView(), -1, -1);
        if (!flag && !zzAG)
        {
            zzeD();
        }
        zzu(flag3);
        if (zzoL.j())
        {
            zza(flag3, true);
        }
    }

}

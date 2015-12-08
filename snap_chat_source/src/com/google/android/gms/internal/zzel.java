// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

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

// Referenced classes of package com.google.android.gms.internal:
//            zzet, zzeo, zzhx, zzx, 
//            zzep, zzat, zzab, zzei, 
//            zzeq, zzic, zzhp, zzer, 
//            zzid, zzie, zzhs

public class zzel extends zzev.zza
    implements zzet
{
    static final class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }
    }

    static final class zzb extends RelativeLayout
    {

        zzhs zzlL;

        public final boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            zzlL.zzc(motionevent);
            return false;
        }

        public zzb(Context context, String s)
        {
            super(context);
            zzlL = new zzhs(context, s);
        }
    }

    public static class zzc
    {

        public final int index;
        public final Context zzlN;
        public final android.view.ViewGroup.LayoutParams zzul;
        public final ViewGroup zzum;

        public zzc(zzic zzic1)
        {
            zzul = zzic1.getLayoutParams();
            android.view.ViewParent viewparent = zzic1.getParent();
            zzlN = zzic1.zzeE();
            if (viewparent != null && (viewparent instanceof ViewGroup))
            {
                zzum = (ViewGroup)viewparent;
                index = zzum.indexOfChild(zzic1.getWebView());
                zzum.removeView(zzic1.getWebView());
                zzic1.zzA(true);
                return;
            } else
            {
                throw new zza("Could not get the parent of the WebView for an overlay.");
            }
        }
    }


    static final int zztV = Color.argb(0, 0, 0, 0);
    zzic zzmu;
    private final Activity zzoi;
    zzeo zztW;
    zzeq zztX;
    zzc zztY;
    zzer zztZ;
    RelativeLayout zzts;
    boolean zzua;
    FrameLayout zzub;
    android.webkit.WebChromeClient.CustomViewCallback zzuc;
    boolean zzud;
    boolean zzue;
    boolean zzuf;
    int zzug;
    private boolean zzuh;
    private boolean zzui;
    private boolean zzuj;

    public zzel(Activity activity)
    {
        zzua = false;
        zzud = false;
        zzue = false;
        zzuf = false;
        zzug = 0;
        zzui = false;
        zzuj = true;
        zzoi = activity;
    }

    static android.widget.RelativeLayout.LayoutParams zzd(int i, int j, int k, int l)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(k, l);
        layoutparams.setMargins(i, j, 0, 0);
        layoutparams.addRule(10);
        layoutparams.addRule(9);
        return layoutparams;
    }

    public void close()
    {
        zzug = 2;
        zzoi.finish();
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        zzud = flag;
        zztW = zzeo.zzb(zzoi.getIntent());
        if (zztW == null)
        {
            throw new zza("Could not get info for ad overlay.");
        }
          goto _L1
_L10:
        return;
_L1:
        if (zzoi.getIntent() != null)
        {
            zzuj = zzoi.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
        }
        if (zztW.zzuz == null) goto _L3; else goto _L2
_L2:
        zzue = zztW.zzuz.zzml;
_L9:
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        if (zztW.zzup != null && zzuj)
        {
            zztW.zzup.zzag();
        }
        if (zztW.zzuw != 1 && zztW.zzuo != null)
        {
            zztW.zzuo.onAdClicked();
        }
        zzts = new zzb(zzoi, zztW.zzuy);
        zztW.zzuw;
        JVM INSTR tableswitch 1 4: default 362
    //                   1 266
    //                   2 272
    //                   3 296
    //                   4 302;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        throw new zza("Could not determine ad overlay type.");
_L3:
        zzue = false;
          goto _L9
_L5:
        try
        {
            zzt(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            zzhx.zzac(bundle.getMessage());
            zzug = 3;
            zzoi.finish();
        }
          goto _L10
_L6:
        zztY = new zzc(zztW.zzuq);
        zzt(false);
        return;
_L7:
        zzt(true);
        return;
_L8:
        if (zzud)
        {
            zzug = 3;
            zzoi.finish();
            return;
        }
        if (zzab.zzaJ().zza(zzoi, zztW.zzun, zztW.zzuv)) goto _L10; else goto _L11
_L11:
        zzug = 3;
        zzoi.finish();
        return;
    }

    public void onDestroy()
    {
        if (zztX != null)
        {
            zztX.destroy();
        }
        if (zzmu != null)
        {
            zzts.removeView(zzmu.getWebView());
        }
        zzdf();
    }

    public void onPause()
    {
        if (zztX != null)
        {
            zztX.pause();
        }
        zzdc();
        if (zzmu != null && (!zzoi.isFinishing() || zztY == null))
        {
            zzab.zzaO().zza(zzmu.getWebView());
        }
        zzdf();
    }

    public void onRestart()
    {
    }

    public void onResume()
    {
        if (zztW != null && zztW.zzuw == 4)
        {
            if (zzud)
            {
                zzug = 3;
                zzoi.finish();
            } else
            {
                zzud = true;
            }
        }
        if (zzmu != null && !zzmu.isDestroyed())
        {
            zzab.zzaO().zzb(zzmu.getWebView());
            return;
        } else
        {
            zzhx.zzac("The webview does not exit. Ignoring action.");
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", zzud);
    }

    public void onStart()
    {
    }

    public void onStop()
    {
        zzdf();
    }

    public void setRequestedOrientation(int i)
    {
        zzoi.setRequestedOrientation(i);
    }

    public void zzX()
    {
        zzuh = true;
    }

    public void zza(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        zzub = new FrameLayout(zzoi);
        zzub.setBackgroundColor(0xff000000);
        zzub.addView(view, -1, -1);
        zzoi.setContentView(zzub);
        zzX();
        zzuc = customviewcallback;
        zzua = true;
    }

    public void zza(boolean flag, boolean flag1)
    {
        if (zztZ != null)
        {
            zztZ.zza(flag, flag1);
        }
    }

    public zzeq zzdb()
    {
        return zztX;
    }

    public void zzdc()
    {
        if (zztW != null && zzua)
        {
            setRequestedOrientation(zztW.orientation);
        }
        if (zzub != null)
        {
            zzoi.setContentView(zzts);
            zzX();
            zzub.removeAllViews();
            zzub = null;
        }
        if (zzuc != null)
        {
            zzuc.onCustomViewHidden();
            zzuc = null;
        }
        zzua = false;
    }

    public void zzdd()
    {
        zzug = 1;
        zzoi.finish();
    }

    public void zzde()
    {
        zzts.removeView(zztZ);
        zzs(true);
    }

    protected void zzdf()
    {
        if (zzoi.isFinishing() && !zzui)
        {
            zzui = true;
            if (zzoi.isFinishing())
            {
                if (zzmu != null)
                {
                    zzp(zzug);
                    zzts.removeView(zzmu.getWebView());
                    if (zztY != null)
                    {
                        zzmu.setContext(zztY.zzlN);
                        zzmu.zzA(false);
                        zztY.zzum.addView(zzmu.getWebView(), zztY.index, zztY.zzul);
                        zztY = null;
                    }
                }
                if (zztW != null && zztW.zzup != null)
                {
                    zztW.zzup.zzaf();
                    return;
                }
            }
        }
    }

    public void zzdg()
    {
        if (zzuf)
        {
            zzuf = false;
            zzdh();
        }
    }

    protected void zzdh()
    {
        zzmu.zzdh();
    }

    public void zze(int i, int j, int k, int l)
    {
        if (zztX != null)
        {
            zztX.setLayoutParams(zzd(i, j, k, l));
        }
    }

    public void zzf(int i, int j, int k, int l)
    {
        if (zztX == null)
        {
            zztX = new zzeq(zzoi, zzmu);
            zzts.addView(zztX, 0, zzd(i, j, k, l));
            zzmu.zzeG().zzC(false);
        }
    }

    protected void zzp(int i)
    {
        zzmu.zzp(i);
    }

    public void zzs(boolean flag)
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
        zztZ = new zzer(zzoi, byte0, this);
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
        zztZ.zza(flag, zztW.zzut);
        zzts.addView(zztZ, layoutparams);
    }

    protected void zzt(boolean flag)
    {
        if (!zzuh)
        {
            zzoi.requestWindowFeature(1);
        }
        Object obj = zzoi.getWindow();
        if (obj == null)
        {
            throw new zza("Invalid activity, no window available.");
        }
        if (!zzue || zztW.zzuz != null && zztW.zzuz.zzmy)
        {
            ((Window) (obj)).setFlags(1024, 1024);
        }
        zzuf = false;
        if (zztW.orientation == zzab.zzaO().zzex())
        {
            boolean flag1;
            if (zzoi.getResources().getConfiguration().orientation == 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            zzuf = flag1;
        } else
        if (zztW.orientation == zzab.zzaO().zzey())
        {
            boolean flag2;
            if (zzoi.getResources().getConfiguration().orientation == 2)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            zzuf = flag2;
        }
        zzhx.zzY((new StringBuilder("Delay onShow to next orientation change: ")).append(zzuf).toString());
        setRequestedOrientation(zztW.orientation);
        if (zzab.zzaO().zza(((Window) (obj))))
        {
            zzhx.zzY("Hardware acceleration on the AdActivity window enabled.");
        }
        if (!zzue)
        {
            zzts.setBackgroundColor(0xff000000);
        } else
        {
            zzts.setBackgroundColor(zztV);
        }
        zzoi.setContentView(zzts);
        zzX();
        flag1 = zztW.zzuq.zzeG().zzba();
        if (flag)
        {
            zzmu = zzab.zzaN().zza(zzoi, zztW.zzuq.zzad(), true, flag1, null, zztW.zzlP);
            zzmu.zzeG().zzb(null, null, zztW.zzur, zztW.zzuv, true, zztW.zzux, null, zztW.zzuq.zzeG().zzeM(), null);
            zzmu.zzeG().zza(new zzid.zza() {

                final zzel zzuk;

                public void zza(zzic zzic1, boolean flag3)
                {
                    zzic1.zzeG().zzeR();
                    zzic1.zzdh();
                }

            
            {
                zzuk = zzel.this;
                super();
            }
            });
            if (zztW.zztR != null)
            {
                zzmu.loadUrl(zztW.zztR);
            } else
            if (zztW.zzuu != null)
            {
                zzmu.loadDataWithBaseURL(zztW.zzus, zztW.zzuu, "text/html", "UTF-8", null);
            } else
            {
                throw new zza("No URL or HTML to display in ad overlay.");
            }
        } else
        {
            zzmu = zztW.zzuq;
            zzmu.setContext(zzoi);
        }
        zzmu.zza(this);
        obj = zzmu.getParent();
        if (obj != null && (obj instanceof ViewGroup))
        {
            ((ViewGroup)obj).removeView(zzmu.getWebView());
        }
        if (zzue)
        {
            zzmu.setBackgroundColor(zztV);
        }
        zzts.addView(zzmu.getWebView(), -1, -1);
        if (!flag && !zzuf)
        {
            zzdh();
        }
        zzs(flag1);
        if (zzmu.zzeH())
        {
            zza(flag1, true);
        }
    }

}

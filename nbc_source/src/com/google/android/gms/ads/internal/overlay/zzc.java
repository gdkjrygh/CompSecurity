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
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.internal.zzhm;
import com.google.android.gms.internal.zzhn;
import com.google.android.gms.internal.zzid;
import com.google.android.gms.internal.zzie;
import com.google.android.gms.internal.zzif;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzl, AdOverlayInfoParcel, zzf, zza, 
//            zzh, zzj

public class com.google.android.gms.ads.internal.overlay.zzc extends com.google.android.gms.internal.zzex.zza
    implements zzl
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

        zzhn zzqn;

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            zzqn.zzd(motionevent);
            return false;
        }

        public zzb(Context context, String s)
        {
            super(context);
            zzqn = new zzhn(context, s);
        }
    }

    public static class zzc
    {

        public final int index;
        public final Context zzpH;
        public final ViewGroup zzzA;
        public final android.view.ViewGroup.LayoutParams zzzz;

        public zzc(zzid zzid1)
            throws zza
        {
            zzzz = zzid1.getLayoutParams();
            android.view.ViewParent viewparent = zzid1.getParent();
            zzpH = zzid1.zzgC();
            if (viewparent != null && (viewparent instanceof ViewGroup))
            {
                zzzA = (ViewGroup)viewparent;
                index = zzzA.indexOfChild(zzid1.getWebView());
                zzzA.removeView(zzid1.getWebView());
                zzid1.zzB(true);
                return;
            } else
            {
                throw new zza("Could not get the parent of the WebView for an overlay.");
            }
        }
    }


    static final int zzzj = Color.argb(0, 0, 0, 0);
    private final Activity mActivity;
    zzid zzoA;
    RelativeLayout zzyG;
    AdOverlayInfoParcel zzzk;
    zzh zzzl;
    zzc zzzm;
    zzj zzzn;
    boolean zzzo;
    FrameLayout zzzp;
    android.webkit.WebChromeClient.CustomViewCallback zzzq;
    boolean zzzr;
    boolean zzzs;
    boolean zzzt;
    int zzzu;
    private boolean zzzv;
    private boolean zzzw;
    private boolean zzzx;

    public com.google.android.gms.ads.internal.overlay.zzc(Activity activity)
    {
        zzzo = false;
        zzzr = false;
        zzzs = false;
        zzzt = false;
        zzzu = 0;
        zzzw = false;
        zzzx = true;
        mActivity = activity;
    }

    public void close()
    {
        zzzu = 2;
        mActivity.finish();
    }

    public void onBackPressed()
    {
        zzzu = 0;
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        zzzr = flag;
        zzzk = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzb(mActivity.getIntent());
        if (zzzk == null)
        {
            throw new zza("Could not get info for ad overlay.");
        }
          goto _L1
_L10:
        return;
_L1:
        if (zzzk.zzpJ.zzGI > 0x7270e0)
        {
            zzzu = 3;
        }
        if (mActivity.getIntent() != null)
        {
            zzzx = mActivity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
        }
        if (zzzk.zzzN == null) goto _L3; else goto _L2
_L2:
        zzzs = zzzk.zzzN.zzoU;
_L9:
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        if (zzzk.zzzD != null && zzzx)
        {
            zzzk.zzzD.zzaW();
        }
        if (zzzk.zzzK != 1 && zzzk.zzzC != null)
        {
            zzzk.zzzC.onAdClicked();
        }
        zzyG = new zzb(mActivity, zzzk.zzzM);
        zzzk.zzzK;
        JVM INSTR tableswitch 1 4: default 382
    //                   1 286
    //                   2 292
    //                   3 316
    //                   4 322;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        throw new zza("Could not determine ad overlay type.");
_L3:
        zzzs = false;
          goto _L9
_L5:
        try
        {
            zzu(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC(bundle.getMessage());
            zzzu = 3;
            mActivity.finish();
        }
          goto _L10
_L6:
        zzzm = new zzc(zzzk.zzzE);
        zzu(false);
        return;
_L7:
        zzu(true);
        return;
_L8:
        if (zzzr)
        {
            zzzu = 3;
            mActivity.finish();
            return;
        }
        if (zzo.zzbs().zza(mActivity, zzzk.zzzB, zzzk.zzzJ)) goto _L10; else goto _L11
_L11:
        zzzu = 3;
        mActivity.finish();
        return;
    }

    public void onDestroy()
    {
        if (zzzl != null)
        {
            zzzl.destroy();
        }
        if (zzoA != null)
        {
            zzyG.removeView(zzoA.getWebView());
        }
        zzeu();
    }

    public void onPause()
    {
        if (zzzl != null)
        {
            zzzl.pause();
        }
        zzer();
        if (zzoA != null && (!mActivity.isFinishing() || zzzm == null))
        {
            zzo.zzbx().zza(zzoA.getWebView());
        }
        zzeu();
    }

    public void onRestart()
    {
    }

    public void onResume()
    {
        if (zzzk != null && zzzk.zzzK == 4)
        {
            if (zzzr)
            {
                zzzu = 3;
                mActivity.finish();
            } else
            {
                zzzr = true;
            }
        }
        if (zzoA != null && !zzoA.isDestroyed())
        {
            zzo.zzbx().zzb(zzoA.getWebView());
            return;
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("The webview does not exit. Ignoring action.");
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", zzzr);
    }

    public void onStart()
    {
    }

    public void onStop()
    {
        zzeu();
    }

    public void setRequestedOrientation(int i)
    {
        mActivity.setRequestedOrientation(i);
    }

    public void zza(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        zzzp = new FrameLayout(mActivity);
        zzzp.setBackgroundColor(0xff000000);
        zzzp.addView(view, -1, -1);
        mActivity.setContentView(zzzp);
        zzaE();
        zzzq = customviewcallback;
        zzzo = true;
    }

    public void zza(boolean flag, boolean flag1)
    {
        if (zzzn != null)
        {
            zzzn.zza(flag, flag1);
        }
    }

    public void zzaE()
    {
        zzzv = true;
    }

    public void zzd(int i, int j, int k, int l)
    {
        if (zzzl != null)
        {
            zzzl.zzf(i, j, k, l);
        }
    }

    public void zze(int i, int j, int k, int l)
    {
        if (zzzl == null)
        {
            zzzl = new zzh(mActivity, zzoA);
            zzyG.addView(zzzl, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
            zzzl.zzf(i, j, k, l);
            zzoA.zzgF().zzD(false);
        }
    }

    public zzh zzeq()
    {
        return zzzl;
    }

    public void zzer()
    {
        if (zzzk != null && zzzo)
        {
            setRequestedOrientation(zzzk.orientation);
        }
        if (zzzp != null)
        {
            mActivity.setContentView(zzyG);
            zzaE();
            zzzp.removeAllViews();
            zzzp = null;
        }
        if (zzzq != null)
        {
            zzzq.onCustomViewHidden();
            zzzq = null;
        }
        zzzo = false;
    }

    public void zzes()
    {
        zzzu = 1;
        mActivity.finish();
    }

    public void zzet()
    {
        zzyG.removeView(zzzn);
        zzt(true);
    }

    protected void zzeu()
    {
        if (mActivity.isFinishing() && !zzzw)
        {
            zzzw = true;
            if (mActivity.isFinishing())
            {
                if (zzoA != null)
                {
                    zzv(zzzu);
                    zzyG.removeView(zzoA.getWebView());
                    if (zzzm != null)
                    {
                        zzoA.setContext(zzzm.zzpH);
                        zzoA.zzB(false);
                        zzzm.zzzA.addView(zzoA.getWebView(), zzzm.index, zzzm.zzzz);
                        zzzm = null;
                    }
                }
                if (zzzk != null && zzzk.zzzD != null)
                {
                    zzzk.zzzD.zzaV();
                    return;
                }
            }
        }
    }

    public void zzev()
    {
        if (zzzt)
        {
            zzzt = false;
            zzew();
        }
    }

    protected void zzew()
    {
        zzoA.zzew();
    }

    public void zzt(boolean flag)
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
        zzzn = new zzj(mActivity, byte0, this);
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
        zzzn.zza(flag, zzzk.zzzH);
        zzyG.addView(zzzn, layoutparams);
    }

    protected void zzu(boolean flag)
        throws zza
    {
        if (!zzzv)
        {
            mActivity.requestWindowFeature(1);
        }
        Object obj = mActivity.getWindow();
        if (obj == null)
        {
            throw new zza("Invalid activity, no window available.");
        }
        if (!zzzs || zzzk.zzzN != null && zzzk.zzzN.zzoV)
        {
            ((Window) (obj)).setFlags(1024, 1024);
        }
        boolean flag3 = zzzk.zzzE.zzgF().zzbU();
        zzzt = false;
        if (flag3)
        {
            if (zzzk.orientation == zzo.zzbx().zzgq())
            {
                boolean flag1;
                if (mActivity.getResources().getConfiguration().orientation == 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                zzzt = flag1;
            } else
            if (zzzk.orientation == zzo.zzbx().zzgr())
            {
                boolean flag2;
                if (mActivity.getResources().getConfiguration().orientation == 2)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                zzzt = flag2;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzay((new StringBuilder()).append("Delay onShow to next orientation change: ").append(zzzt).toString());
        setRequestedOrientation(zzzk.orientation);
        if (zzo.zzbx().zza(((Window) (obj))))
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Hardware acceleration on the AdActivity window enabled.");
        }
        if (!zzzs)
        {
            zzyG.setBackgroundColor(0xff000000);
        } else
        {
            zzyG.setBackgroundColor(zzzj);
        }
        mActivity.setContentView(zzyG);
        zzaE();
        if (flag)
        {
            zzoA = zzo.zzbw().zza(mActivity, zzzk.zzzE.zzaN(), true, flag3, null, zzzk.zzpJ);
            zzoA.zzgF().zzb(null, null, zzzk.zzzF, zzzk.zzzJ, true, zzzk.zzzL, null, zzzk.zzzE.zzgF().zzgM(), null);
            zzoA.zzgF().zza(new com.google.android.gms.internal.zzie.zza() {

                final com.google.android.gms.ads.internal.overlay.zzc zzzy;

                public void zza(zzid zzid1, boolean flag4)
                {
                    zzid1.zzgF().zzgS();
                    zzid1.zzew();
                }

            
            {
                zzzy = com.google.android.gms.ads.internal.overlay.zzc.this;
                super();
            }
            });
            if (zzzk.zzzf != null)
            {
                zzoA.loadUrl(zzzk.zzzf);
            } else
            if (zzzk.zzzI != null)
            {
                zzoA.loadDataWithBaseURL(zzzk.zzzG, zzzk.zzzI, "text/html", "UTF-8", null);
            } else
            {
                throw new zza("No URL or HTML to display in ad overlay.");
            }
            if (zzzk.zzzE != null)
            {
                zzzk.zzzE.zzb(this);
            }
        } else
        {
            zzoA = zzzk.zzzE;
            zzoA.setContext(mActivity);
        }
        zzoA.zza(this);
        obj = zzoA.getParent();
        if (obj != null && (obj instanceof ViewGroup))
        {
            ((ViewGroup)obj).removeView(zzoA.getWebView());
        }
        if (zzzs)
        {
            zzoA.setBackgroundColor(zzzj);
        }
        zzyG.addView(zzoA.getWebView(), -1, -1);
        if (!flag && !zzzt)
        {
            zzew();
        }
        zzt(flag3);
        if (zzoA.zzgG())
        {
            zza(flag3, true);
        }
    }

    protected void zzv(int i)
    {
        zzoA.zzv(i);
    }

}

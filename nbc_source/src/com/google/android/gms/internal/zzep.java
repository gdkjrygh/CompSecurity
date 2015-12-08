// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzeu, zzid, zzhl, zzev

public class zzep extends zzeu
{

    static final Set zzyu = new HashSet(Arrays.asList(new String[] {
        "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"
    }));
    private int zznM;
    private int zznN;
    private final zzid zzoA;
    private final Object zzqt = new Object();
    private AdSizeParcel zzxT;
    private int zzyA;
    private final Activity zzyB;
    private ImageView zzyC;
    private LinearLayout zzyD;
    private zzev zzyE;
    private PopupWindow zzyF;
    private RelativeLayout zzyG;
    private ViewGroup zzyH;
    private String zzyv;
    private boolean zzyw;
    private int zzyx;
    private int zzyy;
    private int zzyz;

    public zzep(zzid zzid1, zzev zzev1)
    {
        super(zzid1, "resize");
        zzyv = "top-right";
        zzyw = true;
        zzyx = 0;
        zzyy = 0;
        zznN = -1;
        zzyz = 0;
        zzyA = 0;
        zznM = -1;
        zzoA = zzid1;
        zzyB = zzid1.zzgB();
        zzyE = zzev1;
    }

    private int[] zzed()
    {
        if (!zzef())
        {
            return null;
        }
        if (zzyw)
        {
            return (new int[] {
                zzyx + zzyz, zzyy + zzyA
            });
        }
        int ai[] = zzo.zzbv().zzh(zzyB);
        int ai1[] = zzo.zzbv().zzj(zzyB);
        int l = ai[0];
        int j = zzyx + zzyz;
        int k = zzyy + zzyA;
        int i;
        if (j < 0)
        {
            i = 0;
        } else
        {
            i = j;
            if (zznM + j > l)
            {
                i = l - zznM;
            }
        }
        if (k < ai1[0])
        {
            j = ai1[0];
        } else
        {
            j = k;
            if (zznN + k > ai1[1])
            {
                j = ai1[1] - zznN;
            }
        }
        return (new int[] {
            i, j
        });
    }

    private void zzg(Map map)
    {
        if (!TextUtils.isEmpty((CharSequence)map.get("width")))
        {
            zznM = zzo.zzbv().zzau((String)map.get("width"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("height")))
        {
            zznN = zzo.zzbv().zzau((String)map.get("height"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetX")))
        {
            zzyz = zzo.zzbv().zzau((String)map.get("offsetX"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetY")))
        {
            zzyA = zzo.zzbv().zzau((String)map.get("offsetY"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("allowOffscreen")))
        {
            zzyw = Boolean.parseBoolean((String)map.get("allowOffscreen"));
        }
        map = (String)map.get("customClosePosition");
        if (!TextUtils.isEmpty(map))
        {
            zzyv = map;
        }
    }

    public void zza(int i, int j, boolean flag)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        zzyx = i;
        zzyy = j;
        if (zzyF == null || !flag)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        int ai[] = zzed();
        if (ai == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        zzyF.update(zzk.zzcA().zzb(zzyB, ai[0]), zzk.zzcA().zzb(zzyB, ai[1]), zzyF.getWidth(), zzyF.getHeight());
        zzc(ai[0], ai[1]);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        zzn(true);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void zzb(int i, int j)
    {
        if (zzyE != null)
        {
            zzyE.zza(i, j, zznM, zznN);
        }
    }

    void zzc(int i, int j)
    {
        zzb(i, j - zzo.zzbv().zzj(zzyB)[0], zznM, zznN);
    }

    public void zzd(int i, int j)
    {
        zzyx = i;
        zzyy = j;
    }

    boolean zzec()
    {
        return zznM > -1 && zznN > -1;
    }

    public boolean zzee()
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzyF != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    boolean zzef()
    {
        int ai[];
        int i;
        int k;
        int ai1[] = zzo.zzbv().zzh(zzyB);
        ai = zzo.zzbv().zzj(zzyB);
        k = ai1[0];
        i = ai1[1];
        if (zznM >= 50 && zznM <= k) goto _L2; else goto _L1
_L1:
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Width is too small or too large.");
_L18:
        return false;
_L2:
        String s;
        if (zznN < 50 || zznN > i)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Height is too small or too large.");
            return false;
        }
        if (zznN == i && zznM == k)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Cannot resize to a full-screen ad.");
            return false;
        }
        if (!zzyw)
        {
            break; /* Loop/switch isn't completed */
        }
        s = zzyv;
        i = -1;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 180
    //                   -1364013995: 311
    //                   -1012429441: 283
    //                   -655373719: 325
    //                   1163912186: 353
    //                   1288627767: 339
    //                   1755462605: 297;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        i;
        JVM INSTR tableswitch 0 5: default 220
    //                   0 367
    //                   1 393
    //                   2 427
    //                   3 471
    //                   4 505
    //                   5 547;
           goto _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L10:
        int j;
        j = (zzyx + zzyz + zznM) - 50;
        i = zzyy + zzyA;
_L19:
        if (j < 0 || j + 50 > k || i < ai[0] || i + 50 > ai[1]) goto _L18; else goto _L17
_L17:
        return true;
_L5:
        if (s.equals("top-left"))
        {
            i = 0;
        }
          goto _L3
_L9:
        if (s.equals("top-center"))
        {
            i = 1;
        }
          goto _L3
_L4:
        if (s.equals("center"))
        {
            i = 2;
        }
          goto _L3
_L6:
        if (s.equals("bottom-left"))
        {
            i = 3;
        }
          goto _L3
_L8:
        if (s.equals("bottom-center"))
        {
            i = 4;
        }
          goto _L3
_L7:
        if (s.equals("bottom-right"))
        {
            i = 5;
        }
          goto _L3
_L11:
        i = zzyx;
        j = zzyz + i;
        i = zzyy + zzyA;
          goto _L19
_L12:
        j = (zzyx + zzyz + zznM / 2) - 25;
        i = zzyy + zzyA;
          goto _L19
_L13:
        j = (zzyx + zzyz + zznM / 2) - 25;
        i = (zzyy + zzyA + zznN / 2) - 25;
          goto _L19
_L14:
        i = zzyx;
        j = zzyz + i;
        i = (zzyy + zzyA + zznN) - 50;
          goto _L19
_L15:
        j = (zzyx + zzyz + zznM / 2) - 25;
        i = (zzyy + zzyA + zznN) - 50;
          goto _L19
_L16:
        j = (zzyx + zzyz + zznM) - 50;
        i = (zzyy + zzyA + zznN) - 50;
          goto _L19
        if (true) goto _L21; else goto _L20
_L21:
        if (true) goto _L18; else goto _L20
_L20:
    }

    public void zzh(Map map)
    {
label0:
        {
            synchronized (zzqt)
            {
                if (zzyB != null)
                {
                    break label0;
                }
                zzae("Not an activity context. Cannot resize.");
            }
            return;
        }
        if (zzoA.zzaN() != null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        zzae("Webview is not yet available, size is not set.");
        obj;
        JVM INSTR monitorexit ;
        return;
        map;
        obj;
        JVM INSTR monitorexit ;
        throw map;
        if (!zzoA.zzaN().zzsn)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        zzae("Is interstitial. Cannot resize an interstitial.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!zzoA.zzgJ())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        zzae("Cannot resize an expanded banner.");
        obj;
        JVM INSTR monitorexit ;
        return;
        zzg(map);
        if (zzec())
        {
            break MISSING_BLOCK_LABEL_118;
        }
        zzae("Invalid width and height options. Cannot resize.");
        obj;
        JVM INSTR monitorexit ;
        return;
        map = zzyB.getWindow();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        if (map.getDecorView() != null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        zzae("Activity context is not ready, cannot get window or decor view.");
        obj;
        JVM INSTR monitorexit ;
        return;
        int ai[] = zzed();
        if (ai != null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        zzae("Resize location out of screen or close button is not visible.");
        obj;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        int i;
        int j;
        i = zzk.zzcA().zzb(zzyB, zznM);
        j = zzk.zzcA().zzb(zzyB, zznN);
        obj1 = zzoA.getWebView().getParent();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        if (!(obj1 instanceof ViewGroup)) goto _L2; else goto _L3
_L3:
        ((ViewGroup)obj1).removeView(zzoA.getWebView());
        if (zzyF != null) goto _L5; else goto _L4
_L4:
        zzyH = (ViewGroup)obj1;
        obj1 = zzo.zzbv().zzj(zzoA.getWebView());
        zzyC = new ImageView(zzyB);
        zzyC.setImageBitmap(((android.graphics.Bitmap) (obj1)));
        zzxT = zzoA.zzaN();
        zzyH.addView(zzyC);
_L13:
        zzyG = new RelativeLayout(zzyB);
        zzyG.setBackgroundColor(0);
        zzyG.setLayoutParams(new android.view.ViewGroup.LayoutParams(i, j));
        zzyF = zzo.zzbv().zza(zzyG, i, j, false);
        zzyF.setOutsideTouchable(true);
        zzyF.setTouchable(true);
        obj1 = zzyF;
        String s;
        boolean flag;
        if (!zzyw)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj1)).setClippingEnabled(flag);
        zzyG.addView(zzoA.getWebView(), -1, -1);
        zzyD = new LinearLayout(zzyB);
        obj1 = new android.widget.RelativeLayout.LayoutParams(zzk.zzcA().zzb(zzyB, 50), zzk.zzcA().zzb(zzyB, 50));
        s = zzyv;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 1016
    //                   -1364013995: 763
    //                   -1012429441: 731
    //                   -655373719: 779
    //                   1163912186: 811
    //                   1288627767: 795
    //                   1755462605: 747;
           goto _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L22:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
_L21:
        zzyD.setOnClickListener(new android.view.View.OnClickListener() {

            final zzep zzyI;

            public void onClick(View view)
            {
                zzyI.zzn(true);
            }

            
            {
                zzyI = zzep.this;
                super();
            }
        });
        zzyD.setContentDescription("Close button");
        zzyG.addView(zzyD, ((android.view.ViewGroup.LayoutParams) (obj1)));
        zzyF.showAtLocation(map.getDecorView(), 0, zzk.zzcA().zzb(zzyB, ai[0]), zzk.zzcA().zzb(zzyB, ai[1]));
        zzb(ai[0], ai[1]);
        zzoA.zza(new AdSizeParcel(zzyB, new AdSize(zznM, zznN)));
        zzc(ai[0], ai[1]);
        zzag("resized");
        obj;
        JVM INSTR monitorexit ;
        return;
_L5:
        zzyF.dismiss();
          goto _L13
_L2:
        zzae("Webview is detached, probably in the middle of a resize or expand.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L8:
        if (!s.equals("top-left")) goto _L6; else goto _L14
_L14:
        i = 0;
          goto _L15
_L12:
        if (!s.equals("top-center")) goto _L6; else goto _L16
_L16:
        i = 1;
          goto _L15
_L7:
        if (!s.equals("center")) goto _L6; else goto _L17
_L17:
        i = 2;
          goto _L15
_L9:
        if (!s.equals("bottom-left")) goto _L6; else goto _L18
_L18:
        i = 3;
          goto _L15
_L11:
        if (!s.equals("bottom-center")) goto _L6; else goto _L19
_L19:
        i = 4;
          goto _L15
_L10:
        if (!s.equals("bottom-right")) goto _L6; else goto _L20
_L20:
        i = 5;
          goto _L15
_L23:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9);
          goto _L21
_L24:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(14);
          goto _L21
_L25:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(13);
          goto _L21
_L26:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9);
          goto _L21
_L27:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(14);
          goto _L21
_L28:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
          goto _L21
        map;
        zzae((new StringBuilder()).append("Cannot show popup window: ").append(map.getMessage()).toString());
        zzyG.removeView(zzoA.getWebView());
        if (zzyH != null)
        {
            zzyH.removeView(zzyC);
            zzyH.addView(zzoA.getWebView());
            zzoA.zza(zzxT);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
_L6:
        i = -1;
_L15:
        i;
        JVM INSTR tableswitch 0 5: default 1060
    //                   0 827
    //                   1 844
    //                   2 861
    //                   3 871
    //                   4 888
    //                   5 905;
           goto _L22 _L23 _L24 _L25 _L26 _L27 _L28
    }

    public void zzn(boolean flag)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (zzyF == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        zzyF.dismiss();
        zzyG.removeView(zzoA.getWebView());
        if (zzyH != null)
        {
            zzyH.removeView(zzyC);
            zzyH.addView(zzoA.getWebView());
            zzoA.zza(zzxT);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        zzag("default");
        if (zzyE != null)
        {
            zzyE.zzbc();
        }
        zzyF = null;
        zzyG = null;
        zzyH = null;
        zzyD = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}

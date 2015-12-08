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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzeg, zzic, zzab, zzho, 
//            zzbe, zzhw, zzeh, zzhx, 
//            zzba

public class zzeb extends zzeg
{

    static final Set zztg = new HashSet(Arrays.asList(new String[] {
        "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"
    }));
    private int zzli;
    private int zzlj;
    private final zzic zzmu;
    private final Object zznh = new Object();
    private zzba zzsF;
    private String zzth;
    private boolean zzti;
    private int zztj;
    private int zztk;
    private int zztl;
    private int zztm;
    private final Activity zztn;
    private ImageView zzto;
    private LinearLayout zztp;
    private zzeh zztq;
    private PopupWindow zztr;
    private RelativeLayout zzts;
    private ViewGroup zztt;

    public zzeb(zzic zzic1, zzeh zzeh1)
    {
        super(zzic1, "resize");
        zzth = "top-right";
        zzti = true;
        zztj = 0;
        zztk = 0;
        zzlj = -1;
        zztl = 0;
        zztm = 0;
        zzli = -1;
        zzmu = zzic1;
        zztn = zzic1.zzeD();
        zztq = zzeh1;
    }

    private int[] zzcO()
    {
        if (!zzcQ())
        {
            return null;
        }
        if (zzti)
        {
            return (new int[] {
                zztj + zztl, zztk + zztm
            });
        }
        int ai[] = zzab.zzaM().zzh(zztn);
        int ai1[] = zzab.zzaM().zzj(zztn);
        int l = ai[0];
        int j = zztj + zztl;
        int k = zztk + zztm;
        int i;
        if (j < 0)
        {
            i = 0;
        } else
        {
            i = j;
            if (zzli + j > l)
            {
                i = l - zzli;
            }
        }
        if (k < ai1[0])
        {
            j = ai1[0];
        } else
        {
            j = k;
            if (zzlj + k > ai1[1])
            {
                j = ai1[1] - zzlj;
            }
        }
        return (new int[] {
            i, j
        });
    }

    private void zzf(Map map)
    {
        if (!TextUtils.isEmpty((CharSequence)map.get("width")))
        {
            zzli = zzab.zzaM().zzT((String)map.get("width"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("height")))
        {
            zzlj = zzab.zzaM().zzT((String)map.get("height"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetX")))
        {
            zztl = zzab.zzaM().zzT((String)map.get("offsetX"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetY")))
        {
            zztm = zzab.zzaM().zzT((String)map.get("offsetY"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("allowOffscreen")))
        {
            zzti = Boolean.parseBoolean((String)map.get("allowOffscreen"));
        }
        map = (String)map.get("customClosePosition");
        if (!TextUtils.isEmpty(map))
        {
            zzth = map;
        }
    }

    public void zzb(int i, int j)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        int ai[];
        zztj = i;
        zztk = j;
        if (zztr == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        ai = zzcO();
        if (ai == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        zztr.update(zzbe.zzbD().zzb(zztn, ai[0]), zzbe.zzbD().zzb(zztn, ai[1]), zztr.getWidth(), zztr.getHeight());
        zzd(ai[0], ai[1]);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        zzm(true);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void zzc(int i, int j)
    {
        if (zztq != null)
        {
            zztq.zza(i, j, zzli, zzlj);
        }
    }

    boolean zzcN()
    {
        return zzli >= 0 && zzlj >= 0;
    }

    public boolean zzcP()
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zztr != null)
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

    boolean zzcQ()
    {
        int ai[];
        int i;
        int k;
        int ai1[] = zzab.zzaM().zzh(zztn);
        ai = zzab.zzaM().zzj(zztn);
        k = ai1[0];
        i = ai1[1];
        if (zzli >= 50 && zzli <= k) goto _L2; else goto _L1
_L1:
        zzhx.zzac("Width is too small or too large.");
_L18:
        return false;
_L2:
        String s;
        if (zzlj < 50 || zzlj > i)
        {
            zzhx.zzac("Height is too small or too large.");
            return false;
        }
        if (zzlj == i && zzli == k)
        {
            zzhx.zzac("Cannot resize to a full-screen ad.");
            return false;
        }
        if (!zzti)
        {
            break; /* Loop/switch isn't completed */
        }
        s = zzth;
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
        j = (zztj + zztl + zzli) - 50;
        i = zztk + zztm;
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
        i = zztj;
        j = zztl + i;
        i = zztk + zztm;
          goto _L19
_L12:
        j = (zztj + zztl + zzli / 2) - 25;
        i = zztk + zztm;
          goto _L19
_L13:
        j = (zztj + zztl + zzli / 2) - 25;
        i = (zztk + zztm + zzlj / 2) - 25;
          goto _L19
_L14:
        i = zztj;
        j = zztl + i;
        i = (zztk + zztm + zzlj) - 50;
          goto _L19
_L15:
        j = (zztj + zztl + zzli / 2) - 25;
        i = (zztk + zztm + zzlj) - 50;
          goto _L19
_L16:
        j = (zztj + zztl + zzli) - 50;
        i = (zztk + zztm + zzlj) - 50;
          goto _L19
        if (true) goto _L21; else goto _L20
_L21:
        if (true) goto _L18; else goto _L20
_L20:
    }

    void zzd(int i, int j)
    {
        zzb(i, j - zzab.zzaM().zzj(zztn)[0], zzli, zzlj);
    }

    public void zze(int i, int j)
    {
        zztj = i;
        zztk = j;
    }

    public void zzg(Map map)
    {
label0:
        {
            synchronized (zznh)
            {
                if (zztn != null)
                {
                    break label0;
                }
                zzH("Not an activity context. Cannot resize.");
            }
            return;
        }
        if (zzmu.zzad() != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        zzH("Webview is not yet available, size is not set.");
        obj;
        JVM INSTR monitorexit ;
        return;
        map;
        obj;
        JVM INSTR monitorexit ;
        throw map;
        if (!zzmu.zzad().zzpb)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        zzH("Is interstitial. Cannot resize an interstitial.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!zzmu.zzeK())
        {
            break MISSING_BLOCK_LABEL_97;
        }
        zzH("Cannot resize an expanded banner.");
        obj;
        JVM INSTR monitorexit ;
        return;
        zzf(map);
        if (zzcN())
        {
            break MISSING_BLOCK_LABEL_119;
        }
        zzH("Invalid width and height options. Cannot resize.");
        obj;
        JVM INSTR monitorexit ;
        return;
        map = zztn.getWindow();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        if (map.getDecorView() != null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        zzH("Activity context is not ready, cannot get window or decor view.");
        obj;
        JVM INSTR monitorexit ;
        return;
        int ai[] = zzcO();
        if (ai != null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        zzH("Resize location out of screen or close button is not visible.");
        obj;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        int i;
        int j;
        i = zzbe.zzbD().zzb(zztn, zzli);
        j = zzbe.zzbD().zzb(zztn, zzlj);
        obj1 = zzmu.getWebView().getParent();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        if (!(obj1 instanceof ViewGroup)) goto _L2; else goto _L3
_L3:
        ((ViewGroup)obj1).removeView(zzmu.getWebView());
        if (zztr != null) goto _L5; else goto _L4
_L4:
        zztt = (ViewGroup)obj1;
        obj1 = zzab.zzaM().zzh(zzmu.getWebView());
        zzto = new ImageView(zztn);
        zzto.setImageBitmap(((android.graphics.Bitmap) (obj1)));
        zzsF = zzmu.zzad();
        zztt.addView(zzto);
_L13:
        zzts = new RelativeLayout(zztn);
        zzts.setBackgroundColor(0);
        zzts.setLayoutParams(new android.view.ViewGroup.LayoutParams(i, j));
        zztr = zzab.zzaM().zza(zzts, i, j, false);
        zztr.setOutsideTouchable(true);
        zztr.setTouchable(true);
        obj1 = zztr;
        String s;
        boolean flag;
        if (!zzti)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj1)).setClippingEnabled(flag);
        zzts.addView(zzmu.getWebView(), -1, -1);
        zztp = new LinearLayout(zztn);
        obj1 = new android.widget.RelativeLayout.LayoutParams(zzbe.zzbD().zzb(zztn, 50), zzbe.zzbD().zzb(zztn, 50));
        s = zzth;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 1017
    //                   -1364013995: 767
    //                   -1012429441: 735
    //                   -655373719: 783
    //                   1163912186: 815
    //                   1288627767: 799
    //                   1755462605: 751;
           goto _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L22:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
_L21:
        zztp.setOnClickListener(new android.view.View.OnClickListener() {

            final zzeb zztu;

            public void onClick(View view)
            {
                zztu.zzm(true);
            }

            
            {
                zztu = zzeb.this;
                super();
            }
        });
        zztp.setContentDescription("Close button");
        zzts.addView(zztp, ((android.view.ViewGroup.LayoutParams) (obj1)));
        zztr.showAtLocation(map.getDecorView(), 0, zzbe.zzbD().zzb(zztn, ai[0]), zzbe.zzbD().zzb(zztn, ai[1]));
        zzc(ai[0], ai[1]);
        zzmu.zza(new zzba(zztn, new AdSize(zzli, zzlj)));
        zzd(ai[0], ai[1]);
        zzJ("resized");
        obj;
        JVM INSTR monitorexit ;
        return;
_L5:
        zztr.dismiss();
          goto _L13
_L2:
        zzH("Webview is detached, probably in the middle of a resize or expand.");
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
        zzH((new StringBuilder("Cannot show popup window: ")).append(map.getMessage()).toString());
        zzts.removeView(zzmu.getWebView());
        if (zztt != null)
        {
            zztt.removeView(zzto);
            zztt.addView(zzmu.getWebView());
            zzmu.zza(zzsF);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
_L6:
        i = -1;
_L15:
        i;
        JVM INSTR tableswitch 0 5: default 1060
    //                   0 831
    //                   1 848
    //                   2 865
    //                   3 875
    //                   4 892
    //                   5 909;
           goto _L22 _L23 _L24 _L25 _L26 _L27 _L28
    }

    public void zzm(boolean flag)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        if (zztr == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        zztr.dismiss();
        zzts.removeView(zzmu.getWebView());
        if (zztt != null)
        {
            zztt.removeView(zzto);
            zztt.addView(zzmu.getWebView());
            zzmu.zza(zzsF);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        zzJ("default");
        if (zztq != null)
        {
            zztq.zzam();
        }
        zztr = null;
        zzts = null;
        zztt = null;
        zztp = null;
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

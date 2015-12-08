// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            kp, ry, qa, kh, 
//            kq

public final class kg extends kp
{

    static final Set a = new HashSet(Arrays.asList(new String[] {
        "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"
    }));
    private String b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private final Object j = new Object();
    private final ry k;
    private final Activity l;
    private AdSizeParcel m;
    private ImageView n;
    private LinearLayout o;
    private kq p;
    private PopupWindow q;
    private RelativeLayout r;
    private ViewGroup s;

    public kg(ry ry1, kq kq1)
    {
        super(ry1, "resize");
        b = "top-right";
        c = true;
        d = 0;
        e = 0;
        f = -1;
        g = 0;
        h = 0;
        i = -1;
        k = ry1;
        l = ry1.e();
        p = kq1;
    }

    private void b(int i1, int j1)
    {
        zzp.zzbv();
        a(i1, j1 - qa.c(l)[0], i, f);
    }

    private int[] b()
    {
        int ai[];
        int i1;
        int i2;
        zzp.zzbv();
        int ai2[] = qa.b(l);
        zzp.zzbv();
        ai = qa.c(l);
        i2 = ai2[0];
        i1 = ai2[1];
        if (i >= 50 && i <= i2) goto _L2; else goto _L1
_L1:
        zzb.zzaH("Width is too small or too large.");
        i1 = 0;
_L21:
        if (i1 == 0)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (f < 50 || f > i1)
        {
            zzb.zzaH("Height is too small or too large.");
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
        if (f == i1 && i == i2)
        {
            zzb.zzaH("Cannot resize to a full-screen ad.");
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
        if (!c) goto _L4; else goto _L3
_L3:
        String s1;
        s1 = b;
        i1 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 6: default 196
    //                   -1364013995: 330
    //                   -1012429441: 302
    //                   -655373719: 344
    //                   1163912186: 372
    //                   1288627767: 358
    //                   1755462605: 316;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L5:
        i1;
        JVM INSTR tableswitch 0 5: default 236
    //                   0 386
    //                   1 410
    //                   2 444
    //                   3 488
    //                   4 520
    //                   5 562;
           goto _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L12:
        int k1;
        i1 = (d + g + i) - 50;
        k1 = e + h;
_L19:
        if (i1 < 0 || i1 + 50 > i2 || k1 < ai[0] || k1 + 50 > ai[1])
        {
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
_L7:
        if (s1.equals("top-left"))
        {
            i1 = 0;
        }
          goto _L5
_L11:
        if (s1.equals("top-center"))
        {
            i1 = 1;
        }
          goto _L5
_L6:
        if (s1.equals("center"))
        {
            i1 = 2;
        }
          goto _L5
_L8:
        if (s1.equals("bottom-left"))
        {
            i1 = 3;
        }
          goto _L5
_L10:
        if (s1.equals("bottom-center"))
        {
            i1 = 4;
        }
          goto _L5
_L9:
        if (s1.equals("bottom-right"))
        {
            i1 = 5;
        }
          goto _L5
_L13:
        i1 = d + g;
        k1 = e + h;
          goto _L19
_L14:
        i1 = (d + g + i / 2) - 25;
        k1 = e + h;
          goto _L19
_L15:
        i1 = (d + g + i / 2) - 25;
        k1 = (e + h + f / 2) - 25;
          goto _L19
_L16:
        i1 = d + g;
        k1 = (e + h + f) - 50;
          goto _L19
_L17:
        i1 = (d + g + i / 2) - 25;
        k1 = (e + h + f) - 50;
          goto _L19
_L18:
        i1 = (d + g + i) - 50;
        k1 = (e + h + f) - 50;
          goto _L19
_L4:
        i1 = 1;
        if (true) goto _L21; else goto _L20
_L20:
        if (c)
        {
            return (new int[] {
                d + g, e + h
            });
        }
        zzp.zzbv();
        int ai1[] = qa.b(l);
        zzp.zzbv();
        int ai3[] = qa.c(l);
        int k2 = ai1[0];
        int l1 = d + g;
        int j2 = e + h;
        int j1;
        if (l1 < 0)
        {
            j1 = 0;
        } else
        {
            j1 = l1;
            if (i + l1 > k2)
            {
                j1 = k2 - i;
            }
        }
        if (j2 < ai3[0])
        {
            l1 = ai3[0];
        } else
        {
            l1 = j2;
            if (f + j2 > ai3[1])
            {
                l1 = ai3[1] - f;
            }
        }
        return (new int[] {
            j1, l1
        });
    }

    public final void a(int i1, int j1)
    {
        d = i1;
        e = j1;
    }

    public final void a(int i1, int j1, boolean flag)
    {
        Object obj = j;
        obj;
        JVM INSTR monitorenter ;
        d = i1;
        e = j1;
        if (q == null || !flag)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        int ai[] = b();
        if (ai == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        q.update(zzl.zzcF().zzb(l, ai[0]), zzl.zzcF().zzb(l, ai[1]), q.getWidth(), q.getHeight());
        b(ai[0], ai[1]);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        a(true);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(Map map)
    {
label0:
        {
            synchronized (j)
            {
                if (l != null)
                {
                    break label0;
                }
                a("Not an activity context. Cannot resize.");
            }
            return;
        }
        if (k.j() != null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        a("Webview is not yet available, size is not set.");
        obj;
        JVM INSTR monitorexit ;
        return;
        map;
        obj;
        JVM INSTR monitorexit ;
        throw map;
        if (!k.j().zztf)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        a("Is interstitial. Cannot resize an interstitial.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!k.o())
        {
            break MISSING_BLOCK_LABEL_94;
        }
        a("Cannot resize an expanded banner.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!TextUtils.isEmpty((CharSequence)map.get("width")))
        {
            zzp.zzbv();
            i = qa.b((String)map.get("width"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("height")))
        {
            zzp.zzbv();
            f = qa.b((String)map.get("height"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetX")))
        {
            zzp.zzbv();
            g = qa.b((String)map.get("offsetX"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetY")))
        {
            zzp.zzbv();
            h = qa.b((String)map.get("offsetY"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("allowOffscreen")))
        {
            c = Boolean.parseBoolean((String)map.get("allowOffscreen"));
        }
        map = (String)map.get("customClosePosition");
        if (!TextUtils.isEmpty(map))
        {
            b = map;
        }
        int i1;
        boolean flag;
        int ai[];
        Object obj1;
        String s1;
        int j1;
        if (i >= 0 && f >= 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        a("Invalid width and height options. Cannot resize.");
        obj;
        JVM INSTR monitorexit ;
        return;
        map = l.getWindow();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        if (map.getDecorView() != null)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        a("Activity context is not ready, cannot get window or decor view.");
        obj;
        JVM INSTR monitorexit ;
        return;
        ai = b();
        if (ai != null)
        {
            break MISSING_BLOCK_LABEL_388;
        }
        a("Resize location out of screen or close button is not visible.");
        obj;
        JVM INSTR monitorexit ;
        return;
        i1 = zzl.zzcF().zzb(l, i);
        j1 = zzl.zzcF().zzb(l, f);
        obj1 = k.b().getParent();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        if (!(obj1 instanceof ViewGroup)) goto _L2; else goto _L3
_L3:
        ((ViewGroup)obj1).removeView(k.b());
        if (q != null) goto _L5; else goto _L4
_L4:
        s = (ViewGroup)obj1;
        zzp.zzbv();
        obj1 = qa.a(k.b());
        n = new ImageView(l);
        n.setImageBitmap(((android.graphics.Bitmap) (obj1)));
        m = k.j();
        s.addView(n);
_L13:
        r = new RelativeLayout(l);
        r.setBackgroundColor(0);
        r.setLayoutParams(new android.view.ViewGroup.LayoutParams(i1, j1));
        zzp.zzbv();
        q = qa.a(r, i1, j1);
        q.setOutsideTouchable(true);
        q.setTouchable(true);
        obj1 = q;
        if (!c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj1)).setClippingEnabled(flag);
        r.addView(k.b(), -1, -1);
        o = new LinearLayout(l);
        obj1 = new android.widget.RelativeLayout.LayoutParams(zzl.zzcF().zzb(l, 50), zzl.zzcF().zzb(l, 50));
        s1 = b;
        s1.hashCode();
        JVM INSTR lookupswitch 6: default 1271
    //                   -1364013995: 1015
    //                   -1012429441: 983
    //                   -655373719: 1031
    //                   1163912186: 1063
    //                   1288627767: 1047
    //                   1755462605: 999;
           goto _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L22:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
_L21:
        o.setOnClickListener(new kh(this));
        o.setContentDescription("Close button");
        r.addView(o, ((android.view.ViewGroup.LayoutParams) (obj1)));
        q.showAtLocation(map.getDecorView(), 0, zzl.zzcF().zzb(l, ai[0]), zzl.zzcF().zzb(l, ai[1]));
        i1 = ai[0];
        j1 = ai[1];
        if (p != null)
        {
            p.zza(i1, j1, i, f);
        }
        k.a(new AdSizeParcel(l, new AdSize(i, f)));
        b(ai[0], ai[1]);
        c("resized");
        obj;
        JVM INSTR monitorexit ;
        return;
_L5:
        q.dismiss();
          goto _L13
_L2:
        a("Webview is detached, probably in the middle of a resize or expand.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L8:
        if (!s1.equals("top-left")) goto _L6; else goto _L14
_L14:
        i1 = 0;
          goto _L15
_L12:
        if (!s1.equals("top-center")) goto _L6; else goto _L16
_L16:
        i1 = 1;
          goto _L15
_L7:
        if (!s1.equals("center")) goto _L6; else goto _L17
_L17:
        i1 = 2;
          goto _L15
_L9:
        if (!s1.equals("bottom-left")) goto _L6; else goto _L18
_L18:
        i1 = 3;
          goto _L15
_L11:
        if (!s1.equals("bottom-center")) goto _L6; else goto _L19
_L19:
        i1 = 4;
          goto _L15
_L10:
        if (!s1.equals("bottom-right")) goto _L6; else goto _L20
_L20:
        i1 = 5;
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
        a((new StringBuilder("Cannot show popup window: ")).append(map.getMessage()).toString());
        r.removeView(k.b());
        if (s != null)
        {
            s.removeView(n);
            s.addView(k.b());
            k.a(m);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
_L6:
        i1 = -1;
_L15:
        i1;
        JVM INSTR tableswitch 0 5: default 1316
    //                   0 1079
    //                   1 1096
    //                   2 1113
    //                   3 1123
    //                   4 1140
    //                   5 1157;
           goto _L22 _L23 _L24 _L25 _L26 _L27 _L28
    }

    public final void a(boolean flag)
    {
        Object obj = j;
        obj;
        JVM INSTR monitorenter ;
        if (q == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        q.dismiss();
        r.removeView(k.b());
        if (s != null)
        {
            s.removeView(n);
            s.addView(k.b());
            k.a(m);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        c("default");
        if (p != null)
        {
            p.zzbc();
        }
        q = null;
        r = null;
        s = null;
        o = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a()
    {
        Object obj = j;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (q != null)
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

}

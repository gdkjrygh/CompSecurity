// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ck, fl, zzba, a, 
//            es, fj, x, fi, 
//            cc, cl

public final class cb extends ck
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
    private final fl k;
    private final Activity l;
    private zzba m;
    private ImageView n;
    private LinearLayout o;
    private cl p;
    private PopupWindow q;
    private RelativeLayout r;
    private ViewGroup s;

    public cb(fl fl1)
    {
        super(fl1, "resize");
        b = "top-right";
        c = true;
        d = 0;
        e = 0;
        f = -1;
        g = 0;
        h = 0;
        i = -1;
        k = fl1;
        l = fl1.c();
        p = null;
    }

    public final void a(int i1, int j1)
    {
        d = i1;
        e = j1;
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
        if (k.f() != null)
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
        if (!k.f().e)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        a("Is interstitial. Cannot resize an interstitial.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!k.k())
        {
            break MISSING_BLOCK_LABEL_94;
        }
        a("Cannot resize an expanded banner.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!TextUtils.isEmpty((CharSequence)map.get("width")))
        {
            com.google.android.gms.internal.a.c();
            i = com.google.android.gms.internal.es.a((String)map.get("width"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("height")))
        {
            com.google.android.gms.internal.a.c();
            f = com.google.android.gms.internal.es.a((String)map.get("height"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetX")))
        {
            com.google.android.gms.internal.a.c();
            g = com.google.android.gms.internal.es.a((String)map.get("offsetX"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetY")))
        {
            com.google.android.gms.internal.a.c();
            h = com.google.android.gms.internal.es.a((String)map.get("offsetY"));
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
        Object obj2;
        int i1;
        int j1;
        int k1;
        boolean flag;
        Object obj1;
        int ai[];
        Object obj3;
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
        obj1 = l.getWindow();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        if (((Window) (obj1)).getDecorView() != null)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        a("Activity context is not ready, cannot get window or decor view.");
        obj;
        JVM INSTR monitorexit ;
        return;
        com.google.android.gms.internal.a.c();
        ai = es.b(l);
        com.google.android.gms.internal.a.c();
        map = es.c(l);
        k1 = ai[0];
        i1 = ai[1];
        if (i >= 50 && i <= k1) goto _L2; else goto _L1
_L1:
        fj.e("Width is too small or too large.");
        i1 = 0;
          goto _L3
_L29:
        if (map != null) goto _L5; else goto _L4
_L4:
        a("Resize location out of screen or close button is not visible.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (f >= 50 && f <= i1) goto _L7; else goto _L6
_L6:
        fj.e("Height is too small or too large.");
        i1 = 0;
          goto _L3
_L7:
        if (f != i1 || i != k1) goto _L9; else goto _L8
_L8:
        fj.e("Cannot resize to a full-screen ad.");
        i1 = 0;
          goto _L3
_L9:
        if (!c) goto _L11; else goto _L10
_L10:
        obj2 = b;
        ((String) (obj2)).hashCode();
        JVM INSTR lookupswitch 6: default 2039
    //                   -1364013995: 645
    //                   -1012429441: 613
    //                   -655373719: 661
    //                   1163912186: 693
    //                   1288627767: 677
    //                   1755462605: 629;
           goto _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L58:
        i1 = (d + g + i) - 50;
        j1 = e + h;
          goto _L19
_L14:
        if (!((String) (obj2)).equals("top-left")) goto _L12; else goto _L20
_L20:
        i1 = 0;
          goto _L21
_L18:
        if (!((String) (obj2)).equals("top-center")) goto _L12; else goto _L22
_L22:
        i1 = 1;
          goto _L21
_L13:
        if (!((String) (obj2)).equals("center")) goto _L12; else goto _L23
_L23:
        i1 = 2;
          goto _L21
_L15:
        if (!((String) (obj2)).equals("bottom-left")) goto _L12; else goto _L24
_L24:
        i1 = 3;
          goto _L21
_L17:
        if (!((String) (obj2)).equals("bottom-center")) goto _L12; else goto _L25
_L25:
        i1 = 4;
          goto _L21
_L16:
        if (!((String) (obj2)).equals("bottom-right")) goto _L12; else goto _L26
_L26:
        i1 = 5;
          goto _L21
_L59:
        i1 = d + g;
        j1 = e + h;
          goto _L19
_L60:
        i1 = (d + g + i / 2) - 25;
        j1 = e + h;
          goto _L19
_L61:
        i1 = (d + g + i / 2) - 25;
        j1 = (e + h + f / 2) - 25;
          goto _L19
_L62:
        i1 = d + g;
        j1 = (e + h + f) - 50;
          goto _L19
_L63:
        i1 = (d + g + i / 2) - 25;
        j1 = (e + h + f) - 50;
          goto _L19
_L64:
        i1 = (d + g + i) - 50;
        j1 = (e + h + f) - 50;
          goto _L19
_L57:
        if (!c) goto _L28; else goto _L27
_L27:
        map = (new int[] {
            d + g, e + h
        });
          goto _L29
_L28:
        com.google.android.gms.internal.a.c();
        map = es.b(l);
        com.google.android.gms.internal.a.c();
        obj2 = es.c(l);
        k1 = map[0];
        i1 = d;
        i1 = g + i1;
        j1 = e + h;
        if (i1 >= 0) goto _L31; else goto _L30
_L30:
        i1 = 0;
          goto _L32
_L34:
        map = (new int[] {
            i1, j1
        });
          goto _L29
_L31:
        if (i + i1 > k1)
        {
            i1 = k1 - i;
        }
          goto _L32
_L67:
        if (f + j1 <= obj2[1]) goto _L34; else goto _L33
_L33:
        j1 = obj2[1] - f;
          goto _L34
_L5:
        com.google.android.gms.internal.x.a();
        i1 = com.google.android.gms.internal.fi.a(l, i);
        com.google.android.gms.internal.x.a();
        j1 = com.google.android.gms.internal.fi.a(l, f);
        obj2 = k.a().getParent();
        if (obj2 == null) goto _L36; else goto _L35
_L35:
        if (!(obj2 instanceof ViewGroup)) goto _L36; else goto _L37
_L37:
        ((ViewGroup)obj2).removeView(k.a());
        if (q != null) goto _L39; else goto _L38
_L38:
        s = (ViewGroup)obj2;
        com.google.android.gms.internal.a.c();
        obj2 = k.a();
        ((View) (obj2)).setDrawingCacheEnabled(true);
        obj3 = Bitmap.createBitmap(((View) (obj2)).getDrawingCache());
        ((View) (obj2)).setDrawingCacheEnabled(false);
        n = new ImageView(l);
        n.setImageBitmap(((Bitmap) (obj3)));
        m = k.f();
        s.addView(n);
_L47:
        r = new RelativeLayout(l);
        r.setBackgroundColor(0);
        r.setLayoutParams(new android.view.ViewGroup.LayoutParams(i1, j1));
        com.google.android.gms.internal.a.c();
        q = new PopupWindow(r, i1, j1, false);
        q.setOutsideTouchable(true);
        q.setTouchable(true);
        obj2 = q;
        if (!c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj2)).setClippingEnabled(flag);
        r.addView(k.a(), -1, -1);
        o = new LinearLayout(l);
        com.google.android.gms.internal.x.a();
        i1 = com.google.android.gms.internal.fi.a(l, 50);
        com.google.android.gms.internal.x.a();
        obj2 = new android.widget.RelativeLayout.LayoutParams(i1, com.google.android.gms.internal.fi.a(l, 50));
        obj3 = b;
        ((String) (obj3)).hashCode();
        JVM INSTR lookupswitch 6: default 2151
    //                   -1364013995: 1767
    //                   -1012429441: 1735
    //                   -655373719: 1783
    //                   1163912186: 1815
    //                   1288627767: 1799
    //                   1755462605: 1751;
           goto _L40 _L41 _L42 _L43 _L44 _L45 _L46
_L68:
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(11);
_L55:
        o.setOnClickListener(new cc(this));
        o.setContentDescription("Close button");
        r.addView(o, ((android.view.ViewGroup.LayoutParams) (obj2)));
        obj2 = q;
        obj1 = ((Window) (obj1)).getDecorView();
        com.google.android.gms.internal.x.a();
        i1 = com.google.android.gms.internal.fi.a(l, map[0]);
        com.google.android.gms.internal.x.a();
        ((PopupWindow) (obj2)).showAtLocation(((View) (obj1)), 0, i1, com.google.android.gms.internal.fi.a(l, map[1]));
        k.a(new zzba(l, new a(i, f)));
        i1 = map[0];
        j1 = map[1];
        com.google.android.gms.internal.a.c();
        a(i1, j1 - es.c(l)[0], i, f);
        c("resized");
        obj;
        JVM INSTR monitorexit ;
        return;
_L39:
        q.dismiss();
          goto _L47
_L36:
        a("Webview is detached, probably in the middle of a resize or expand.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L42:
        if (!((String) (obj3)).equals("top-left")) goto _L40; else goto _L48
_L48:
        i1 = 0;
          goto _L49
_L46:
        if (!((String) (obj3)).equals("top-center")) goto _L40; else goto _L50
_L50:
        i1 = 1;
          goto _L49
_L41:
        if (!((String) (obj3)).equals("center")) goto _L40; else goto _L51
_L51:
        i1 = 2;
          goto _L49
_L43:
        if (!((String) (obj3)).equals("bottom-left")) goto _L40; else goto _L52
_L52:
        i1 = 3;
          goto _L49
_L45:
        if (!((String) (obj3)).equals("bottom-center")) goto _L40; else goto _L53
_L53:
        i1 = 4;
          goto _L49
_L44:
        if (!((String) (obj3)).equals("bottom-right")) goto _L40; else goto _L54
_L54:
        i1 = 5;
          goto _L49
_L69:
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(9);
          goto _L55
_L70:
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(14);
          goto _L55
_L71:
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(13);
          goto _L55
_L72:
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(9);
          goto _L55
_L73:
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(14);
          goto _L55
_L74:
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(11);
          goto _L55
        map;
        a((new StringBuilder("Cannot show popup window: ")).append(map.getMessage()).toString());
        r.removeView(k.a());
        if (s != null)
        {
            s.removeView(n);
            s.addView(k.a());
            k.a(m);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (i1 != 0) goto _L57; else goto _L56
_L56:
        map = null;
          goto _L29
_L12:
        i1 = -1;
_L21:
        i1;
        JVM INSTR tableswitch 0 5: default 2084
    //                   0 709
    //                   1 734
    //                   2 769
    //                   3 814
    //                   4 847
    //                   5 890;
           goto _L58 _L59 _L60 _L61 _L62 _L63 _L64
_L19:
        if (i1 >= 0 && i1 + 50 <= k1 && j1 >= map[0] && j1 + 50 <= map[1]) goto _L11; else goto _L65
_L65:
        i1 = 0;
          goto _L3
_L11:
        i1 = 1;
          goto _L3
_L32:
        if (j1 >= obj2[0]) goto _L67; else goto _L66
_L66:
        j1 = obj2[0];
          goto _L34
_L40:
        i1 = -1;
_L49:
        i1;
        JVM INSTR tableswitch 0 5: default 2196
    //                   0 1831
    //                   1 1848
    //                   2 1865
    //                   3 1875
    //                   4 1892
    //                   5 1909;
           goto _L68 _L69 _L70 _L71 _L72 _L73 _L74
    }

    public final void a(boolean flag)
    {
        Object obj = j;
        obj;
        JVM INSTR monitorenter ;
        if (q == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        q.dismiss();
        r.removeView(k.a());
        if (s != null)
        {
            s.removeView(n);
            s.addView(k.a());
            k.a(m);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        c("default");
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

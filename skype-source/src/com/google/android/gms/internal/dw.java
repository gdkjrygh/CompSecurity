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
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ec, hi, gm, ed

public final class dw extends ec
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
    private final hi k;
    private final Activity l;
    private AdSizeParcel m;
    private ImageView n;
    private LinearLayout o;
    private ed p;
    private PopupWindow q;
    private RelativeLayout r;
    private ViewGroup s;

    public dw(hi hi1, ed ed1)
    {
        super(hi1, "resize");
        b = "top-right";
        c = true;
        d = 0;
        e = 0;
        f = -1;
        g = 0;
        h = 0;
        i = -1;
        k = hi1;
        l = hi1.d();
        p = ed1;
    }

    private void b(int i1, int j1)
    {
        com.google.android.gms.ads.internal.p.e();
        a(i1, j1 - gm.c(l)[0], i, f);
    }

    private int[] b()
    {
        int ai[];
        int i1;
        int i2;
        com.google.android.gms.ads.internal.p.e();
        int ai2[] = com.google.android.gms.internal.gm.b(l);
        com.google.android.gms.ads.internal.p.e();
        ai = gm.c(l);
        i2 = ai2[0];
        i1 = ai2[1];
        if (i >= 50 && i <= i2) goto _L2; else goto _L1
_L1:
        com.google.android.gms.ads.internal.util.client.b.c("Width is too small or too large.");
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
            com.google.android.gms.ads.internal.util.client.b.c("Height is too small or too large.");
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
        if (f == i1 && i == i2)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Cannot resize to a full-screen ad.");
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
    //                   1 412
    //                   2 446
    //                   3 490
    //                   4 524
    //                   5 566;
           goto _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L12:
        int k1;
        k1 = (d + g + i) - 50;
        i1 = e + h;
_L19:
        if (k1 < 0 || k1 + 50 > i2 || i1 < ai[0] || i1 + 50 > ai[1])
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
        i1 = d;
        k1 = g + i1;
        i1 = e + h;
          goto _L19
_L14:
        k1 = (d + g + i / 2) - 25;
        i1 = e + h;
          goto _L19
_L15:
        k1 = (d + g + i / 2) - 25;
        i1 = (e + h + f / 2) - 25;
          goto _L19
_L16:
        i1 = d;
        k1 = g + i1;
        i1 = (e + h + f) - 50;
          goto _L19
_L17:
        k1 = (d + g + i / 2) - 25;
        i1 = (e + h + f) - 50;
          goto _L19
_L18:
        k1 = (d + g + i) - 50;
        i1 = (e + h + f) - 50;
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
        com.google.android.gms.ads.internal.p.e();
        int ai1[] = com.google.android.gms.internal.gm.b(l);
        com.google.android.gms.ads.internal.p.e();
        int ai3[] = gm.c(l);
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
            break MISSING_BLOCK_LABEL_110;
        }
        int ai[] = b();
        if (ai == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        PopupWindow popupwindow = q;
        com.google.android.gms.ads.internal.client.n.a();
        i1 = com.google.android.gms.ads.internal.util.client.a.a(l, ai[0]);
        com.google.android.gms.ads.internal.client.n.a();
        popupwindow.update(i1, com.google.android.gms.ads.internal.util.client.a.a(l, ai[1]), q.getWidth(), q.getHeight());
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
        if (k.i() != null)
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
        if (!k.i().e)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        a("Is interstitial. Cannot resize an interstitial.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!k.n())
        {
            break MISSING_BLOCK_LABEL_94;
        }
        a("Cannot resize an expanded banner.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!TextUtils.isEmpty((CharSequence)map.get("width")))
        {
            com.google.android.gms.ads.internal.p.e();
            i = com.google.android.gms.internal.gm.b((String)map.get("width"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("height")))
        {
            com.google.android.gms.ads.internal.p.e();
            f = com.google.android.gms.internal.gm.b((String)map.get("height"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetX")))
        {
            com.google.android.gms.ads.internal.p.e();
            g = com.google.android.gms.internal.gm.b((String)map.get("offsetX"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetY")))
        {
            com.google.android.gms.ads.internal.p.e();
            h = com.google.android.gms.internal.gm.b((String)map.get("offsetY"));
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
        Object obj1;
        Object obj2;
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
        map = b();
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_387;
        }
        a("Resize location out of screen or close button is not visible.");
        obj;
        JVM INSTR monitorexit ;
        return;
        com.google.android.gms.ads.internal.client.n.a();
        i1 = com.google.android.gms.ads.internal.util.client.a.a(l, i);
        com.google.android.gms.ads.internal.client.n.a();
        j1 = com.google.android.gms.ads.internal.util.client.a.a(l, f);
        obj2 = k.a().getParent();
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        if (!(obj2 instanceof ViewGroup)) goto _L2; else goto _L3
_L3:
        ((ViewGroup)obj2).removeView(k.a());
        if (q != null) goto _L5; else goto _L4
_L4:
        s = (ViewGroup)obj2;
        com.google.android.gms.ads.internal.p.e();
        obj2 = com.google.android.gms.internal.gm.a(k.a());
        n = new ImageView(l);
        n.setImageBitmap(((android.graphics.Bitmap) (obj2)));
        m = k.i();
        s.addView(n);
_L13:
        r = new RelativeLayout(l);
        r.setBackgroundColor(0);
        r.setLayoutParams(new android.view.ViewGroup.LayoutParams(i1, j1));
        com.google.android.gms.ads.internal.p.e();
        q = com.google.android.gms.internal.gm.a(r, i1, j1);
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
        com.google.android.gms.ads.internal.client.n.a();
        i1 = com.google.android.gms.ads.internal.util.client.a.a(l, 50);
        com.google.android.gms.ads.internal.client.n.a();
        obj2 = new android.widget.RelativeLayout.LayoutParams(i1, com.google.android.gms.ads.internal.util.client.a.a(l, 50));
        s1 = b;
        s1.hashCode();
        JVM INSTR lookupswitch 6: default 1269
    //                   -1364013995: 1013
    //                   -1012429441: 981
    //                   -655373719: 1029
    //                   1163912186: 1061
    //                   1288627767: 1045
    //                   1755462605: 997;
           goto _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L22:
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(11);
_L21:
        o.setOnClickListener(new android.view.View.OnClickListener() {

            final dw a;

            public final void onClick(View view)
            {
                a.a(true);
            }

            
            {
                a = dw.this;
                super();
            }
        });
        o.setContentDescription("Close button");
        r.addView(o, ((android.view.ViewGroup.LayoutParams) (obj2)));
        obj2 = q;
        obj1 = ((Window) (obj1)).getDecorView();
        com.google.android.gms.ads.internal.client.n.a();
        i1 = com.google.android.gms.ads.internal.util.client.a.a(l, map[0]);
        com.google.android.gms.ads.internal.client.n.a();
        ((PopupWindow) (obj2)).showAtLocation(((View) (obj1)), 0, i1, com.google.android.gms.ads.internal.util.client.a.a(l, map[1]));
        if (p != null)
        {
            p.y();
        }
        k.a(new AdSizeParcel(l, new d(i, f)));
        b(map[0], map[1]);
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
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(9);
          goto _L21
_L24:
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(14);
          goto _L21
_L25:
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(13);
          goto _L21
_L26:
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(9);
          goto _L21
_L27:
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(14);
          goto _L21
_L28:
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(11);
          goto _L21
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
_L6:
        i1 = -1;
_L15:
        i1;
        JVM INSTR tableswitch 0 5: default 1312
    //                   0 1077
    //                   1 1094
    //                   2 1111
    //                   3 1121
    //                   4 1138
    //                   5 1155;
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
        r.removeView(k.a());
        if (s != null)
        {
            s.removeView(n);
            s.addView(k.a());
            k.a(m);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        c("default");
        if (p != null)
        {
            p.z();
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

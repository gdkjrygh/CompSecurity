// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class afb extends afh
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
    private final akk k;
    private final Activity l;
    private AdSizeParcel m;
    private ImageView n;
    private LinearLayout o;
    private afi p;
    private PopupWindow q;
    private RelativeLayout r;
    private ViewGroup s;

    public afb(akk akk1, afi afi1)
    {
        super(akk1, "resize");
        b = "top-right";
        c = true;
        d = 0;
        e = 0;
        f = -1;
        g = 0;
        h = 0;
        i = -1;
        k = akk1;
        l = akk1.d();
        p = afi1;
    }

    private void b(int i1, int j1)
    {
        ot.e();
        a(i1, j1 - ajc.c(l)[0], i, f);
    }

    private void b(Map map)
    {
        if (!TextUtils.isEmpty((CharSequence)map.get("width")))
        {
            ot.e();
            i = ajc.b((String)map.get("width"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("height")))
        {
            ot.e();
            f = ajc.b((String)map.get("height"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetX")))
        {
            ot.e();
            g = ajc.b((String)map.get("offsetX"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetY")))
        {
            ot.e();
            h = ajc.b((String)map.get("offsetY"));
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
    }

    private boolean b()
    {
        return i >= 0 && f >= 0;
    }

    private int[] c()
    {
        if (!e())
        {
            return null;
        }
        if (c)
        {
            return (new int[] {
                d + g, e + h
            });
        }
        ot.e();
        int ai[] = ajc.b(l);
        ot.e();
        int ai1[] = ajc.c(l);
        int l1 = ai[0];
        int j1 = d + g;
        int k1 = e + h;
        int i1;
        if (j1 < 0)
        {
            i1 = 0;
        } else
        {
            i1 = j1;
            if (i + j1 > l1)
            {
                i1 = l1 - i;
            }
        }
        if (k1 < ai1[0])
        {
            j1 = ai1[0];
        } else
        {
            j1 = k1;
            if (f + k1 > ai1[1])
            {
                j1 = ai1[1] - f;
            }
        }
        return (new int[] {
            i1, j1
        });
    }

    private void d()
    {
        if (p != null)
        {
            p.t();
        }
    }

    private boolean e()
    {
        int ai[];
        int i1;
        int k1;
        ot.e();
        int ai1[] = ajc.b(l);
        ot.e();
        ai = ajc.c(l);
        k1 = ai1[0];
        i1 = ai1[1];
        if (i >= 50 && i <= k1) goto _L2; else goto _L1
_L1:
        of.e("Width is too small or too large.");
_L18:
        return false;
_L2:
        String s1;
        if (f < 50 || f > i1)
        {
            of.e("Height is too small or too large.");
            return false;
        }
        if (f == i1 && i == k1)
        {
            of.e("Cannot resize to a full-screen ad.");
            return false;
        }
        if (!c)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = b;
        i1 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 6: default 184
    //                   -1364013995: 315
    //                   -1012429441: 287
    //                   -655373719: 329
    //                   1163912186: 357
    //                   1288627767: 343
    //                   1755462605: 301;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        i1;
        JVM INSTR tableswitch 0 5: default 224
    //                   0 371
    //                   1 397
    //                   2 431
    //                   3 475
    //                   4 509
    //                   5 551;
           goto _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L10:
        int j1;
        j1 = (d + g + i) - 50;
        i1 = e + h;
_L19:
        if (j1 < 0 || j1 + 50 > k1 || i1 < ai[0] || i1 + 50 > ai[1]) goto _L18; else goto _L17
_L17:
        return true;
_L5:
        if (s1.equals("top-left"))
        {
            i1 = 0;
        }
          goto _L3
_L9:
        if (s1.equals("top-center"))
        {
            i1 = 1;
        }
          goto _L3
_L4:
        if (s1.equals("center"))
        {
            i1 = 2;
        }
          goto _L3
_L6:
        if (s1.equals("bottom-left"))
        {
            i1 = 3;
        }
          goto _L3
_L8:
        if (s1.equals("bottom-center"))
        {
            i1 = 4;
        }
          goto _L3
_L7:
        if (s1.equals("bottom-right"))
        {
            i1 = 5;
        }
          goto _L3
_L11:
        i1 = d;
        j1 = g + i1;
        i1 = e + h;
          goto _L19
_L12:
        j1 = (d + g + i / 2) - 25;
        i1 = e + h;
          goto _L19
_L13:
        j1 = (d + g + i / 2) - 25;
        i1 = (e + h + f / 2) - 25;
          goto _L19
_L14:
        i1 = d;
        j1 = g + i1;
        i1 = (e + h + f) - 50;
          goto _L19
_L15:
        j1 = (d + g + i / 2) - 25;
        i1 = (e + h + f) - 50;
          goto _L19
_L16:
        j1 = (d + g + i) - 50;
        i1 = (e + h + f) - 50;
          goto _L19
        if (true) goto _L21; else goto _L20
_L21:
        if (true) goto _L18; else goto _L20
_L20:
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
        int ai[] = c();
        if (ai == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        PopupWindow popupwindow = q;
        kx.a();
        i1 = oe.a(l, ai[0]);
        kx.a();
        popupwindow.update(i1, oe.a(l, ai[1]), q.getWidth(), q.getHeight());
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
        if (k.h() != null)
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
        if (!k.h().e)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        a("Is interstitial. Cannot resize an interstitial.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!k.m())
        {
            break MISSING_BLOCK_LABEL_94;
        }
        a("Cannot resize an expanded banner.");
        obj;
        JVM INSTR monitorexit ;
        return;
        b(map);
        if (b())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        a("Invalid width and height options. Cannot resize.");
        obj;
        JVM INSTR monitorexit ;
        return;
        Object obj1 = l.getWindow();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        if (((Window) (obj1)).getDecorView() != null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        a("Activity context is not ready, cannot get window or decor view.");
        obj;
        JVM INSTR monitorexit ;
        return;
        map = c();
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        a("Resize location out of screen or close button is not visible.");
        obj;
        JVM INSTR monitorexit ;
        return;
        Object obj2;
        int i1;
        int j1;
        kx.a();
        i1 = oe.a(l, i);
        kx.a();
        j1 = oe.a(l, f);
        obj2 = k.a().getParent();
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        if (!(obj2 instanceof ViewGroup)) goto _L2; else goto _L3
_L3:
        ((ViewGroup)obj2).removeView(k.a());
        if (q != null) goto _L5; else goto _L4
_L4:
        s = (ViewGroup)obj2;
        ot.e();
        obj2 = ajc.a(k.a());
        n = new ImageView(l);
        n.setImageBitmap(((android.graphics.Bitmap) (obj2)));
        m = k.h();
        s.addView(n);
_L13:
        r = new RelativeLayout(l);
        r.setBackgroundColor(0);
        r.setLayoutParams(new android.view.ViewGroup.LayoutParams(i1, j1));
        ot.e();
        q = ajc.a(r, i1, j1);
        q.setOutsideTouchable(true);
        q.setTouchable(true);
        obj2 = q;
        String s1;
        boolean flag;
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
        kx.a();
        i1 = oe.a(l, 50);
        kx.a();
        obj2 = new android.widget.RelativeLayout.LayoutParams(i1, oe.a(l, 50));
        s1 = b;
        s1.hashCode();
        JVM INSTR lookupswitch 6: default 1027
    //                   -1364013995: 777
    //                   -1012429441: 745
    //                   -655373719: 793
    //                   1163912186: 825
    //                   1288627767: 809
    //                   1755462605: 761;
           goto _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L22:
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(11);
_L21:
        o.setOnClickListener(new _cls1());
        o.setContentDescription("Close button");
        r.addView(o, ((android.view.ViewGroup.LayoutParams) (obj2)));
        obj2 = q;
        obj1 = ((Window) (obj1)).getDecorView();
        kx.a();
        i1 = oe.a(l, map[0]);
        kx.a();
        ((PopupWindow) (obj2)).showAtLocation(((android.view.View) (obj1)), 0, i1, oe.a(l, map[1]));
        d();
        k.a(new AdSizeParcel(l, new kk(i, f)));
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
        JVM INSTR tableswitch 0 5: default 1072
    //                   0 841
    //                   1 858
    //                   2 875
    //                   3 885
    //                   4 902
    //                   5 919;
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
            p.u();
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


    /* member class not found */
    class _cls1 {}

}

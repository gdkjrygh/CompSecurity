// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.AlertDialog;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.HashMap;
import java.util.Map;

public final class kug
    implements kuf
{

    private static Map c;
    private final jpz a;
    private final kvl b;

    public kug(jpz jpz1, kvl kvl1)
    {
        a = jpz1;
        b = kvl1;
    }

    public final void a(kxu kxu1, Map map)
    {
        int i;
        byte byte0;
        byte0 = -1;
        String s = (String)map.get("a");
        i = ((Integer)c.get(s)).intValue();
        if (i != 5 && a != null && !a.a())
        {
            a.a(null);
            return;
        }
        i;
        JVM INSTR tableswitch 1 6: default 104
    //                   1 110
    //                   2 104
    //                   3 2411
    //                   4 2257
    //                   5 2674
    //                   6 2779;
           goto _L1 _L2 _L1 _L3 _L4 _L5 _L6
_L1:
        b.p(4);
        return;
_L2:
        kvl kvl1 = b;
        Object obj = kvl1.i;
        obj;
        JVM INSTR monitorenter ;
        if (kvl1.k == null)
        {
            kvl1.a("Not an activity context. Cannot resize.");
            return;
        }
          goto _L7
        kxu1;
        obj;
        JVM INSTR monitorexit ;
        throw kxu1;
_L7:
        if (kvl1.j.i() != null) goto _L9; else goto _L8
_L8:
        kvl1.a("Webview is not yet available, size is not set.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L9:
        if (!kvl1.j.i().e) goto _L11; else goto _L10
_L10:
        kvl1.a("Is interstitial. Cannot resize an interstitial.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L11:
        if (!kvl1.j.n()) goto _L13; else goto _L12
_L12:
        kvl1.a("Cannot resize an expanded banner.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L13:
        if (!TextUtils.isEmpty((CharSequence)map.get("width")))
        {
            jqc.c();
            kvl1.h = kwz.a((String)map.get("width"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("height")))
        {
            jqc.c();
            kvl1.e = kwz.a((String)map.get("height"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetX")))
        {
            jqc.c();
            kvl1.f = kwz.a((String)map.get("offsetX"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetY")))
        {
            jqc.c();
            kvl1.g = kwz.a((String)map.get("offsetY"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("allowOffscreen")))
        {
            kvl1.b = Boolean.parseBoolean((String)map.get("allowOffscreen"));
        }
        kxu1 = (String)map.get("customClosePosition");
        if (!TextUtils.isEmpty(kxu1))
        {
            kvl1.a = kxu1;
        }
        int ai[];
        Object obj1;
        String s2;
        int j;
        int k;
        boolean flag;
        if (kvl1.h >= 0 && kvl1.e >= 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0) goto _L15; else goto _L14
_L14:
        kvl1.a("Invalid width and height options. Cannot resize.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L15:
        map = kvl1.k.getWindow();
        if (map == null) goto _L17; else goto _L16
_L16:
        if (map.getDecorView() != null) goto _L18; else goto _L17
_L17:
        kvl1.a("Activity context is not ready, cannot get window or decor view.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L18:
        ai = jqc.c().b(kvl1.k);
        kxu1 = jqc.c().c(kvl1.k);
        k = ai[0];
        i = ai[1];
        if (kvl1.h >= 50 && kvl1.h <= k) goto _L20; else goto _L19
_L19:
        b.m("Width is too small or too large.");
        i = 0;
          goto _L21
_L47:
        if (kxu1 != null) goto _L23; else goto _L22
_L22:
        kvl1.a("Resize location out of screen or close button is not visible.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L20:
        if (kvl1.e >= 50 && kvl1.e <= i) goto _L25; else goto _L24
_L24:
        b.m("Height is too small or too large.");
        i = 0;
          goto _L21
_L25:
        if (kvl1.e != i || kvl1.h != k) goto _L27; else goto _L26
_L26:
        b.m("Cannot resize to a full-screen ad.");
        i = 0;
          goto _L21
_L27:
        if (!kvl1.b) goto _L29; else goto _L28
_L28:
        obj1 = kvl1.a;
        ((String) (obj1)).hashCode();
        JVM INSTR lookupswitch 6: default 2810
    //                   -1364013995: 798
    //                   -1012429441: 766
    //                   -655373719: 814
    //                   1163912186: 846
    //                   1288627767: 830
    //                   1755462605: 782;
           goto _L30 _L31 _L32 _L33 _L34 _L35 _L36
_L70:
        j = (kvl1.c + kvl1.f + kvl1.h) - 50;
        i = kvl1.d + kvl1.g;
          goto _L37
_L32:
        if (!((String) (obj1)).equals("top-left")) goto _L30; else goto _L38
_L38:
        i = 0;
          goto _L39
_L36:
        if (!((String) (obj1)).equals("top-center")) goto _L30; else goto _L40
_L40:
        i = 1;
          goto _L39
_L31:
        if (!((String) (obj1)).equals("center")) goto _L30; else goto _L41
_L41:
        i = 2;
          goto _L39
_L33:
        if (!((String) (obj1)).equals("bottom-left")) goto _L30; else goto _L42
_L42:
        i = 3;
          goto _L39
_L35:
        if (!((String) (obj1)).equals("bottom-center")) goto _L30; else goto _L43
_L43:
        i = 4;
          goto _L39
_L34:
        if (!((String) (obj1)).equals("bottom-right")) goto _L30; else goto _L44
_L44:
        i = 5;
          goto _L39
_L71:
        i = kvl1.c;
        j = kvl1.f + i;
        i = kvl1.d + kvl1.g;
          goto _L37
_L72:
        j = (kvl1.c + kvl1.f + kvl1.h / 2) - 25;
        i = kvl1.d + kvl1.g;
          goto _L37
_L73:
        j = (kvl1.c + kvl1.f + kvl1.h / 2) - 25;
        i = (kvl1.d + kvl1.g + kvl1.e / 2) - 25;
          goto _L37
_L74:
        i = kvl1.c;
        j = kvl1.f + i;
        i = (kvl1.d + kvl1.g + kvl1.e) - 50;
          goto _L37
_L75:
        j = (kvl1.c + kvl1.f + kvl1.h / 2) - 25;
        i = (kvl1.d + kvl1.g + kvl1.e) - 50;
          goto _L37
_L76:
        j = (kvl1.c + kvl1.f + kvl1.h) - 50;
        i = (kvl1.d + kvl1.g + kvl1.e) - 50;
          goto _L37
_L69:
        if (!kvl1.b) goto _L46; else goto _L45
_L45:
        kxu1 = (new int[] {
            kvl1.c + kvl1.f, kvl1.d + kvl1.g
        });
          goto _L47
_L46:
        kxu1 = jqc.c().b(kvl1.k);
        obj1 = jqc.c().c(kvl1.k);
        k = kxu1[0];
        i = kvl1.c;
        i = kvl1.f + i;
        j = kvl1.d + kvl1.g;
        if (i >= 0) goto _L49; else goto _L48
_L48:
        i = 0;
          goto _L50
_L52:
        kxu1 = (new int[] {
            i, j
        });
          goto _L47
_L49:
        if (kvl1.h + i > k)
        {
            i = k - kvl1.h;
        }
          goto _L50
_L79:
        if (kvl1.e + j <= obj1[1]) goto _L52; else goto _L51
_L51:
        j = obj1[1] - kvl1.e;
          goto _L52
_L23:
        i = jof.a().a(kvl1.k, kvl1.h);
        j = jof.a().a(kvl1.k, kvl1.e);
        obj1 = kvl1.j.a().getParent();
        if (obj1 == null) goto _L54; else goto _L53
_L53:
        if (!(obj1 instanceof ViewGroup)) goto _L54; else goto _L55
_L55:
        ((ViewGroup)obj1).removeView(kvl1.j.a());
        if (kvl1.o != null) goto _L57; else goto _L56
_L56:
        kvl1.q = (ViewGroup)obj1;
        jqc.c();
        obj1 = kwz.a(kvl1.j.a());
        kvl1.m = new ImageView(kvl1.k);
        kvl1.m.setImageBitmap(((android.graphics.Bitmap) (obj1)));
        kvl1.l = kvl1.j.i();
        kvl1.q.addView(kvl1.m);
_L65:
        kvl1.p = new RelativeLayout(kvl1.k);
        kvl1.p.setBackgroundColor(0);
        kvl1.p.setLayoutParams(new android.view.ViewGroup.LayoutParams(i, j));
        jqc.c();
        kvl1.o = kwz.a(kvl1.p, i, j, false);
        kvl1.o.setOutsideTouchable(true);
        kvl1.o.setTouchable(true);
        obj1 = kvl1.o;
        if (!kvl1.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj1)).setClippingEnabled(flag);
        kvl1.p.addView(kvl1.j.a(), -1, -1);
        kvl1.n = new LinearLayout(kvl1.k);
        obj1 = new android.widget.RelativeLayout.LayoutParams(jof.a().a(kvl1.k, 50), jof.a().a(kvl1.k, 50));
        s2 = kvl1.a;
        s2.hashCode();
        JVM INSTR lookupswitch 6: default 2919
    //                   -1364013995: 1981
    //                   -1012429441: 1941
    //                   -655373719: 2001
    //                   1163912186: 2041
    //                   1288627767: 2021
    //                   1755462605: 1961;
           goto _L58 _L59 _L60 _L61 _L62 _L63 _L64
_L80:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
_L67:
        kvl1.n.setOnClickListener(new kvm(kvl1));
        kvl1.n.setContentDescription("Close button");
        kvl1.p.addView(kvl1.n, ((android.view.ViewGroup.LayoutParams) (obj1)));
        kvl1.o.showAtLocation(map.getDecorView(), 0, jof.a().a(kvl1.k, kxu1[0]), jof.a().a(kvl1.k, kxu1[1]));
        kvl1.j.a(new AdSizeParcel(kvl1.k, new jnr(kvl1.h, kvl1.e)));
        kvl1.a(kxu1[0], kxu1[1] - jqc.c().c(kvl1.k)[0], kvl1.h, kvl1.e);
        kvl1.c("resized");
        obj;
        JVM INSTR monitorexit ;
        return;
_L57:
        kvl1.o.dismiss();
          goto _L65
_L54:
        kvl1.a("Webview is detached, probably in the middle of a resize or expand.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L60:
        i = byte0;
        if (s2.equals("top-left"))
        {
            i = 0;
        }
          goto _L66
_L64:
        i = byte0;
        if (s2.equals("top-center"))
        {
            i = 1;
        }
          goto _L66
_L59:
        i = byte0;
        if (s2.equals("center"))
        {
            i = 2;
        }
          goto _L66
_L61:
        i = byte0;
        if (s2.equals("bottom-left"))
        {
            i = 3;
        }
          goto _L66
_L63:
        i = byte0;
        if (s2.equals("bottom-center"))
        {
            i = 4;
        }
          goto _L66
_L62:
        i = byte0;
        if (s2.equals("bottom-right"))
        {
            i = 5;
        }
          goto _L66
_L81:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9);
          goto _L67
_L82:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(14);
          goto _L67
_L83:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(13);
          goto _L67
_L84:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9);
          goto _L67
_L85:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(14);
          goto _L67
_L86:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
          goto _L67
        kxu1;
        kvl1.a((new StringBuilder("Cannot show popup window: ")).append(kxu1.getMessage()).toString());
        kvl1.p.removeView(kvl1.j.a());
        if (kvl1.q != null)
        {
            kvl1.q.removeView(kvl1.m);
            kvl1.q.addView(kvl1.j.a());
            kvl1.j.a(kvl1.l);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
_L4:
        kxu1 = new kvi(kxu1, map);
        if (((kvi) (kxu1)).a == null)
        {
            kxu1.a("Activity context is not available.");
            return;
        }
        jqc.c();
        if (!kwz.c(((kvi) (kxu1)).a).b())
        {
            kxu1.a("This feature is not available on the device.");
            return;
        } else
        {
            jqc.c();
            map = kwz.b(((kvi) (kxu1)).a);
            map.setTitle(jqc.f().a(b.Dp, "Create calendar event"));
            map.setMessage(jqc.f().a(b.Do, "Allow Ad to create a calendar event?"));
            map.setPositiveButton(jqc.f().a(b.Dn, "Accept"), new kvj(kxu1));
            map.setNegativeButton(jqc.f().a(b.Dq, "Decline"), new kvk(kxu1));
            map.create().show();
            return;
        }
_L3:
        kxu1 = new kvo(kxu1, map);
        if (((kvo) (kxu1)).b == null)
        {
            kxu1.a("Activity context is not available");
            return;
        }
        jqc.c();
        if (!kwz.c(((kvo) (kxu1)).b).a())
        {
            kxu1.a("Feature is not supported by the device.");
            return;
        }
        map = (String)((kvo) (kxu1)).a.get("iurl");
        if (TextUtils.isEmpty(map))
        {
            kxu1.a("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(map))
        {
            kxu1.a((new StringBuilder("Invalid image url: ")).append(map).toString());
            return;
        }
        String s1 = Uri.parse(map).getLastPathSegment();
        jqc.c();
        if (!kwz.b(s1))
        {
            kxu1.a((new StringBuilder("Image type not recognized: ")).append(s1).toString());
            return;
        } else
        {
            jqc.c();
            android.app.AlertDialog.Builder builder = kwz.b(((kvo) (kxu1)).b);
            builder.setTitle(jqc.f().a(b.Ds, "Save image"));
            builder.setMessage(jqc.f().a(b.Dr, "Allow Ad to store image in Picture gallery?"));
            builder.setPositiveButton(jqc.f().a(b.Dn, "Accept"), new kvp(kxu1, map, s1));
            builder.setNegativeButton(jqc.f().a(b.Dq, "Decline"), new kvq(kxu1));
            builder.create().show();
            return;
        }
_L5:
        kxu1 = new kvn(kxu1, map);
        if (((kvn) (kxu1)).a == null)
        {
            b.m("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(((kvn) (kxu1)).c))
        {
            i = jqc.e().b();
        } else
        if ("landscape".equalsIgnoreCase(((kvn) (kxu1)).c))
        {
            i = jqc.e().a();
        } else
        if (((kvn) (kxu1)).b)
        {
            i = -1;
        } else
        {
            i = jqc.e().c();
        }
        ((kvn) (kxu1)).a.b(i);
        return;
_L6:
        b.a(true);
        return;
_L21:
        if (i != 0) goto _L69; else goto _L68
_L68:
        kxu1 = null;
          goto _L47
_L30:
        i = -1;
_L39:
        i;
        JVM INSTR tableswitch 0 5: default 2852
    //                   0 862
    //                   1 895
    //                   2 935
    //                   3 986
    //                   4 1028
    //                   5 1077;
           goto _L70 _L71 _L72 _L73 _L74 _L75 _L76
_L37:
        if (j >= 0 && j + 50 <= k && i >= kxu1[0] && i + 50 <= kxu1[1]) goto _L29; else goto _L77
_L77:
        i = 0;
          goto _L21
_L29:
        i = 1;
          goto _L21
_L50:
        if (j >= obj1[0]) goto _L79; else goto _L78
_L78:
        j = obj1[0];
          goto _L52
_L58:
        i = byte0;
_L66:
        i;
        JVM INSTR tableswitch 0 5: default 2964
    //                   0 2061
    //                   1 2078
    //                   2 2095
    //                   3 2105
    //                   4 2122
    //                   5 2139;
           goto _L80 _L81 _L82 _L83 _L84 _L85 _L86
    }

    static 
    {
        HashMap hashmap = new HashMap();
        c = hashmap;
        hashmap.put("resize", Integer.valueOf(1));
        c.put("playVideo", Integer.valueOf(2));
        c.put("storePicture", Integer.valueOf(3));
        c.put("createCalendarEvent", Integer.valueOf(4));
        c.put("setOrientationProperties", Integer.valueOf(5));
        c.put("closeResizedAd", Integer.valueOf(6));
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.j;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.util.client.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            aq, bl, cw, cl, 
//            bq, bk, q, cf, 
//            bn, bm, cm

public final class at
    implements aq
{

    static final Map a;
    private final b b;
    private final bl c;

    public at(b b1, bl bl1)
    {
        b = b1;
        c = bl1;
    }

    public final void a(cw cw1, Map map)
    {
        int i;
        int l;
        l = -1;
        String s = (String)map.get("a");
        i = ((Integer)a.get(s)).intValue();
        if (i != 5 && b != null && !b.a())
        {
            com.google.android.gms.ads.internal.util.client.b.a("Action was blocked because no click was detected.");
            return;
        }
        i;
        JVM INSTR tableswitch 1 6: default 100
    //                   1 106
    //                   2 100
    //                   3 2494
    //                   4 2340
    //                   5 2757
    //                   6 2862;
           goto _L1 _L2 _L1 _L3 _L4 _L5 _L6
_L1:
        com.google.android.gms.ads.internal.util.client.b.c("Unknown MRAID command called.");
        return;
_L2:
        bl bl1 = c;
        Object obj = bl1.j;
        obj;
        JVM INSTR monitorenter ;
        if (bl1.l == null)
        {
            bl1.a("Not an activity context. Cannot resize.");
            return;
        }
          goto _L7
        cw1;
        obj;
        JVM INSTR monitorexit ;
        throw cw1;
_L7:
        if (bl1.k.h() != null) goto _L9; else goto _L8
_L8:
        bl1.a("Webview is not yet available, size is not set.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L9:
        if (!bl1.k.h().e) goto _L11; else goto _L10
_L10:
        bl1.a("Is interstitial. Cannot resize an interstitial.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L11:
        if (!bl1.k.m()) goto _L13; else goto _L12
_L12:
        bl1.a("Cannot resize an expanded banner.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L13:
        if (!TextUtils.isEmpty((CharSequence)map.get("width")))
        {
            d.c();
            bl1.i = com.google.android.gms.internal.cl.a((String)map.get("width"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("height")))
        {
            d.c();
            bl1.f = com.google.android.gms.internal.cl.a((String)map.get("height"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetX")))
        {
            d.c();
            bl1.g = com.google.android.gms.internal.cl.a((String)map.get("offsetX"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetY")))
        {
            d.c();
            bl1.h = com.google.android.gms.internal.cl.a((String)map.get("offsetY"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("allowOffscreen")))
        {
            bl1.c = Boolean.parseBoolean((String)map.get("allowOffscreen"));
        }
        cw1 = (String)map.get("customClosePosition");
        if (!TextUtils.isEmpty(cw1))
        {
            bl1.b = cw1;
        }
        int ai[];
        Object obj1;
        String s2;
        int k;
        int i1;
        int j1;
        boolean flag;
        if (bl1.i >= 0 && bl1.f >= 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0) goto _L15; else goto _L14
_L14:
        bl1.a("Invalid width and height options. Cannot resize.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L15:
        map = bl1.l.getWindow();
        if (map == null) goto _L17; else goto _L16
_L16:
        if (map.getDecorView() != null) goto _L18; else goto _L17
_L17:
        bl1.a("Activity context is not ready, cannot get window or decor view.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L18:
        d.c();
        ai = com.google.android.gms.internal.cl.b(bl1.l);
        d.c();
        cw1 = com.google.android.gms.internal.cl.c(bl1.l);
        i1 = ai[0];
        i = ai[1];
        if (bl1.i >= 50 && bl1.i <= i1) goto _L20; else goto _L19
_L19:
        com.google.android.gms.ads.internal.util.client.b.e("Width is too small or too large.");
        i = 0;
          goto _L21
_L47:
        if (cw1 != null) goto _L23; else goto _L22
_L22:
        bl1.a("Resize location out of screen or close button is not visible.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L20:
        if (bl1.f >= 50 && bl1.f <= i) goto _L25; else goto _L24
_L24:
        com.google.android.gms.ads.internal.util.client.b.e("Height is too small or too large.");
        i = 0;
          goto _L21
_L25:
        if (bl1.f != i || bl1.i != i1) goto _L27; else goto _L26
_L26:
        com.google.android.gms.ads.internal.util.client.b.e("Cannot resize to a full-screen ad.");
        i = 0;
          goto _L21
_L27:
        if (!bl1.c) goto _L29; else goto _L28
_L28:
        obj1 = bl1.b;
        ((String) (obj1)).hashCode();
        JVM INSTR lookupswitch 6: default 2893
    //                   -1364013995: 794
    //                   -1012429441: 762
    //                   -655373719: 810
    //                   1163912186: 842
    //                   1288627767: 826
    //                   1755462605: 778;
           goto _L30 _L31 _L32 _L33 _L34 _L35 _L36
_L71:
        i = (bl1.d + bl1.g + bl1.i) - 50;
        k = bl1.e + bl1.h;
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
_L72:
        i = bl1.d + bl1.g;
        k = bl1.e + bl1.h;
          goto _L37
_L73:
        i = (bl1.d + bl1.g + bl1.i / 2) - 25;
        k = bl1.e + bl1.h;
          goto _L37
_L74:
        i = (bl1.d + bl1.g + bl1.i / 2) - 25;
        k = (bl1.e + bl1.h + bl1.f / 2) - 25;
          goto _L37
_L75:
        i = bl1.d + bl1.g;
        k = (bl1.e + bl1.h + bl1.f) - 50;
          goto _L37
_L76:
        i = (bl1.d + bl1.g + bl1.i / 2) - 25;
        k = (bl1.e + bl1.h + bl1.f) - 50;
          goto _L37
_L77:
        i = (bl1.d + bl1.g + bl1.i) - 50;
        k = (bl1.e + bl1.h + bl1.f) - 50;
          goto _L37
_L70:
        if (!bl1.c) goto _L46; else goto _L45
_L45:
        cw1 = (new int[] {
            bl1.d + bl1.g, bl1.e + bl1.h
        });
          goto _L47
_L46:
        d.c();
        cw1 = com.google.android.gms.internal.cl.b(bl1.l);
        d.c();
        obj1 = com.google.android.gms.internal.cl.c(bl1.l);
        i1 = cw1[0];
        i = bl1.d;
        i = bl1.g + i;
        k = bl1.e + bl1.h;
        if (i >= 0) goto _L49; else goto _L48
_L48:
        i = 0;
          goto _L50
_L52:
        cw1 = (new int[] {
            i, k
        });
          goto _L47
_L49:
        if (bl1.i + i > i1)
        {
            i = i1 - bl1.i;
        }
          goto _L50
_L80:
        if (bl1.f + k <= obj1[1]) goto _L52; else goto _L51
_L51:
        k = obj1[1] - bl1.f;
          goto _L52
_L23:
        j.a();
        i = com.google.android.gms.ads.internal.util.client.a.a(bl1.l, bl1.i);
        j.a();
        k = com.google.android.gms.ads.internal.util.client.a.a(bl1.l, bl1.f);
        obj1 = bl1.k.getView().getParent();
        if (obj1 == null) goto _L54; else goto _L53
_L53:
        if (!(obj1 instanceof ViewGroup)) goto _L54; else goto _L55
_L55:
        ((ViewGroup)obj1).removeView(bl1.k.getView());
        if (bl1.p != null) goto _L57; else goto _L56
_L56:
        bl1.r = (ViewGroup)obj1;
        d.c();
        obj1 = com.google.android.gms.internal.cl.a(bl1.k.getView());
        bl1.n = new ImageView(bl1.l);
        bl1.n.setImageBitmap(((android.graphics.Bitmap) (obj1)));
        bl1.m = bl1.k.h();
        bl1.r.addView(bl1.n);
_L65:
        bl1.q = new RelativeLayout(bl1.l);
        bl1.q.setBackgroundColor(0);
        bl1.q.setLayoutParams(new android.view.ViewGroup.LayoutParams(i, k));
        d.c();
        bl1.p = com.google.android.gms.internal.cl.a(bl1.q, i, k);
        bl1.p.setOutsideTouchable(true);
        bl1.p.setTouchable(true);
        obj1 = bl1.p;
        if (!bl1.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj1)).setClippingEnabled(flag);
        bl1.q.addView(bl1.k.getView(), -1, -1);
        bl1.o = new LinearLayout(bl1.l);
        j.a();
        i = com.google.android.gms.ads.internal.util.client.a.a(bl1.l, 50);
        j.a();
        obj1 = new android.widget.RelativeLayout.LayoutParams(i, com.google.android.gms.ads.internal.util.client.a.a(bl1.l, 50));
        s2 = bl1.b;
        s2.hashCode();
        JVM INSTR lookupswitch 6: default 3003
    //                   -1364013995: 2053
    //                   -1012429441: 2013
    //                   -655373719: 2073
    //                   1163912186: 2113
    //                   1288627767: 2093
    //                   1755462605: 2033;
           goto _L58 _L59 _L60 _L61 _L62 _L63 _L64
_L81:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
_L67:
        bl1.o.setOnClickListener(new bl._cls1(bl1));
        bl1.o.setContentDescription("Close button");
        bl1.q.addView(bl1.o, ((android.view.ViewGroup.LayoutParams) (obj1)));
        obj1 = bl1.p;
        map = map.getDecorView();
        j.a();
        i = com.google.android.gms.ads.internal.util.client.a.a(bl1.l, cw1[0]);
        j.a();
        ((PopupWindow) (obj1)).showAtLocation(map, 0, i, com.google.android.gms.ads.internal.util.client.a.a(bl1.l, cw1[1]));
        bl1.k.a(new AdSizeParcel(bl1.l, new c(bl1.i, bl1.f)));
        i = cw1[0];
        k = cw1[1];
        d.c();
        l = com.google.android.gms.internal.cl.c(bl1.l)[0];
        i1 = bl1.i;
        j1 = bl1.f;
        cw1 = (new JSONObject()).put("x", i).put("y", k - l).put("width", i1).put("height", j1);
        ((bq) (bl1)).s.a("onSizeChanged", cw1);
_L68:
        bl1.b("resized");
        obj;
        JVM INSTR monitorexit ;
        return;
_L57:
        bl1.p.dismiss();
          goto _L65
_L54:
        bl1.a("Webview is detached, probably in the middle of a resize or expand.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L60:
        i = l;
        if (s2.equals("top-left"))
        {
            i = 0;
        }
          goto _L66
_L64:
        i = l;
        if (s2.equals("top-center"))
        {
            i = 1;
        }
          goto _L66
_L59:
        i = l;
        if (s2.equals("center"))
        {
            i = 2;
        }
          goto _L66
_L61:
        i = l;
        if (s2.equals("bottom-left"))
        {
            i = 3;
        }
          goto _L66
_L63:
        i = l;
        if (s2.equals("bottom-center"))
        {
            i = 4;
        }
          goto _L66
_L62:
        i = l;
        if (s2.equals("bottom-right"))
        {
            i = 5;
        }
          goto _L66
_L82:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9);
          goto _L67
_L83:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(14);
          goto _L67
_L84:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(13);
          goto _L67
_L85:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9);
          goto _L67
_L86:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(14);
          goto _L67
_L87:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
          goto _L67
        cw1;
        bl1.a((new StringBuilder("Cannot show popup window: ")).append(cw1.getMessage()).toString());
        bl1.q.removeView(bl1.k.getView());
        if (bl1.r != null)
        {
            bl1.r.removeView(bl1.n);
            bl1.r.addView(bl1.k.getView());
            bl1.k.a(bl1.m);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        cw1;
        com.google.android.gms.ads.internal.util.client.b.b("Error occured while dispatching size change.", cw1);
          goto _L68
_L4:
        cw1 = new bk(cw1, map);
        if (((bk) (cw1)).a == null)
        {
            cw1.a("Activity context is not available.");
            return;
        }
        d.c();
        if (!com.google.android.gms.internal.cl.c(((bk) (cw1)).a).b())
        {
            cw1.a("This feature is not available on the device.");
            return;
        } else
        {
            d.c();
            map = com.google.android.gms.internal.cl.b(((bk) (cw1)).a);
            map.setTitle(d.f().a(com.google.android.gms.a.b.create_calendar_title, "Create calendar event"));
            map.setMessage(d.f().a(com.google.android.gms.a.b.create_calendar_message, "Allow Ad to create a calendar event?"));
            map.setPositiveButton(d.f().a(com.google.android.gms.a.b.accept, "Accept"), new bk._cls1(cw1));
            map.setNegativeButton(d.f().a(com.google.android.gms.a.b.decline, "Decline"), new bk._cls2(cw1));
            map.create().show();
            return;
        }
_L3:
        cw1 = new bn(cw1, map);
        if (((bn) (cw1)).b == null)
        {
            cw1.a("Activity context is not available");
            return;
        }
        d.c();
        if (!com.google.android.gms.internal.cl.c(((bn) (cw1)).b).a())
        {
            cw1.a("Feature is not supported by the device.");
            return;
        }
        map = (String)((bn) (cw1)).a.get("iurl");
        if (TextUtils.isEmpty(map))
        {
            cw1.a("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(map))
        {
            cw1.a((new StringBuilder("Invalid image url: ")).append(map).toString());
            return;
        }
        String s1 = Uri.parse(map).getLastPathSegment();
        d.c();
        if (!com.google.android.gms.internal.cl.b(s1))
        {
            cw1.a((new StringBuilder("Image type not recognized: ")).append(s1).toString());
            return;
        } else
        {
            d.c();
            android.app.AlertDialog.Builder builder = com.google.android.gms.internal.cl.b(((bn) (cw1)).b);
            builder.setTitle(d.f().a(com.google.android.gms.a.b.store_picture_title, "Save image"));
            builder.setMessage(d.f().a(com.google.android.gms.a.b.store_picture_message, "Allow Ad to store image in Picture gallery?"));
            builder.setPositiveButton(d.f().a(com.google.android.gms.a.b.accept, "Accept"), new bn._cls1(cw1, map, s1));
            builder.setNegativeButton(d.f().a(com.google.android.gms.a.b.decline, "Decline"), new bn._cls2(cw1));
            builder.create().show();
            return;
        }
_L5:
        cw1 = new bm(cw1, map);
        if (((bm) (cw1)).a == null)
        {
            com.google.android.gms.ads.internal.util.client.b.e("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(((bm) (cw1)).c))
        {
            i = d.e().b();
        } else
        if ("landscape".equalsIgnoreCase(((bm) (cw1)).c))
        {
            i = d.e().a();
        } else
        if (((bm) (cw1)).b)
        {
            i = -1;
        } else
        {
            i = d.e().c();
        }
        ((bm) (cw1)).a.setRequestedOrientation(i);
        return;
_L6:
        c.a(true);
        return;
_L21:
        if (i != 0) goto _L70; else goto _L69
_L69:
        cw1 = null;
          goto _L47
_L30:
        i = -1;
_L39:
        i;
        JVM INSTR tableswitch 0 5: default 2936
    //                   0 858
    //                   1 887
    //                   2 927
    //                   3 978
    //                   4 1016
    //                   5 1065;
           goto _L71 _L72 _L73 _L74 _L75 _L76 _L77
_L37:
        if (i >= 0 && i + 50 <= i1 && k >= cw1[0] && k + 50 <= cw1[1]) goto _L29; else goto _L78
_L78:
        i = 0;
          goto _L21
_L29:
        i = 1;
          goto _L21
_L50:
        if (k >= obj1[0]) goto _L80; else goto _L79
_L79:
        k = obj1[0];
          goto _L52
_L58:
        i = l;
_L66:
        i;
        JVM INSTR tableswitch 0 5: default 3048
    //                   0 2133
    //                   1 2150
    //                   2 2167
    //                   3 2177
    //                   4 2194
    //                   5 2211;
           goto _L81 _L82 _L83 _L84 _L85 _L86 _L87
    }

    static 
    {
        HashMap hashmap = new HashMap();
        a = hashmap;
        hashmap.put("resize", Integer.valueOf(1));
        a.put("playVideo", Integer.valueOf(2));
        a.put("storePicture", Integer.valueOf(3));
        a.put("createCalendarEvent", Integer.valueOf(4));
        a.put("setOrientationProperties", Integer.valueOf(5));
        a.put("closeResizedAd", Integer.valueOf(6));
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.HashMap;
import java.util.Map;

public final class cds
    implements cdi
{

    private static Map c;
    private final bkg a;
    private final cga b;

    public cds(bkg bkg1, cga cga1)
    {
        a = bkg1;
        b = cga1;
    }

    public final void a(ckw ckw1, Map map)
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
    //                   3 1566
    //                   4 1412
    //                   5 1829
    //                   6 1934;
           goto _L1 _L2 _L1 _L3 _L4 _L5 _L6
_L1:
        bka.c("Unknown MRAID command called.");
        return;
_L2:
        cga cga1 = b;
        ckw1 = ((ckw) (cga1.i));
        ckw1;
        JVM INSTR monitorenter ;
        if (cga1.k == null)
        {
            cga1.a("Not an activity context. Cannot resize.");
            return;
        }
          goto _L7
        map;
        ckw1;
        JVM INSTR monitorexit ;
        throw map;
_L7:
        if (cga1.j.j() != null) goto _L9; else goto _L8
_L8:
        cga1.a("Webview is not yet available, size is not set.");
        ckw1;
        JVM INSTR monitorexit ;
        return;
_L9:
        if (!cga1.j.j().e) goto _L11; else goto _L10
_L10:
        cga1.a("Is interstitial. Cannot resize an interstitial.");
        ckw1;
        JVM INSTR monitorexit ;
        return;
_L11:
        if (!cga1.j.o()) goto _L13; else goto _L12
_L12:
        cga1.a("Cannot resize an expanded banner.");
        ckw1;
        JVM INSTR monitorexit ;
        return;
_L13:
        if (!TextUtils.isEmpty((CharSequence)map.get("width")))
        {
            bkv.e();
            cga1.h = cjj.b((String)map.get("width"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("height")))
        {
            bkv.e();
            cga1.e = cjj.b((String)map.get("height"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetX")))
        {
            bkv.e();
            cga1.f = cjj.b((String)map.get("offsetX"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetY")))
        {
            bkv.e();
            cga1.g = cjj.b((String)map.get("offsetY"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("allowOffscreen")))
        {
            cga1.b = Boolean.parseBoolean((String)map.get("allowOffscreen"));
        }
        map = (String)map.get("customClosePosition");
        if (!TextUtils.isEmpty(map))
        {
            cga1.a = map;
        }
        Object obj;
        Object obj1;
        String s2;
        int j;
        boolean flag;
        if (cga1.h >= 0 && cga1.e >= 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0) goto _L15; else goto _L14
_L14:
        cga1.a("Invalid width and height options. Cannot resize.");
        ckw1;
        JVM INSTR monitorexit ;
        return;
_L15:
        obj = cga1.k.getWindow();
        if (obj == null) goto _L17; else goto _L16
_L16:
        if (((Window) (obj)).getDecorView() != null) goto _L18; else goto _L17
_L17:
        cga1.a("Activity context is not ready, cannot get window or decor view.");
        ckw1;
        JVM INSTR monitorexit ;
        return;
_L18:
        map = cga1.a();
        if (map != null) goto _L20; else goto _L19
_L19:
        cga1.a("Resize location out of screen or close button is not visible.");
        ckw1;
        JVM INSTR monitorexit ;
        return;
_L20:
        bfq.a();
        i = bjz.a(cga1.k, cga1.h);
        bfq.a();
        j = bjz.a(cga1.k, cga1.e);
        obj1 = cga1.j.b().getParent();
        if (obj1 == null) goto _L22; else goto _L21
_L21:
        if (!(obj1 instanceof ViewGroup)) goto _L22; else goto _L23
_L23:
        ((ViewGroup)obj1).removeView(cga1.j.b());
        if (cga1.p != null) goto _L25; else goto _L24
_L24:
        cga1.r = (ViewGroup)obj1;
        bkv.e();
        obj1 = cjj.a(cga1.j.b());
        cga1.m = new ImageView(cga1.k);
        cga1.m.setImageBitmap(((android.graphics.Bitmap) (obj1)));
        cga1.l = cga1.j.j();
        cga1.r.addView(cga1.m);
_L33:
        cga1.q = new RelativeLayout(cga1.k);
        cga1.q.setBackgroundColor(0);
        cga1.q.setLayoutParams(new android.view.ViewGroup.LayoutParams(i, j));
        bkv.e();
        cga1.p = cjj.a(cga1.q, i, j);
        cga1.p.setOutsideTouchable(true);
        cga1.p.setTouchable(true);
        obj1 = cga1.p;
        if (!cga1.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj1)).setClippingEnabled(flag);
        cga1.q.addView(cga1.j.b(), -1, -1);
        cga1.n = new LinearLayout(cga1.k);
        bfq.a();
        i = bjz.a(cga1.k, 50);
        bfq.a();
        obj1 = new android.widget.RelativeLayout.LayoutParams(i, bjz.a(cga1.k, 50));
        s2 = cga1.a;
        s2.hashCode();
        JVM INSTR lookupswitch 6: default 1949
    //                   -1364013995: 1142
    //                   -1012429441: 1100
    //                   -655373719: 1163
    //                   1163912186: 1205
    //                   1288627767: 1184
    //                   1755462605: 1121;
           goto _L26 _L27 _L28 _L29 _L30 _L31 _L32
_L36:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
_L35:
        cga1.n.setOnClickListener(new cga._cls1(cga1));
        cga1.n.setContentDescription("Close button");
        cga1.q.addView(cga1.n, ((android.view.ViewGroup.LayoutParams) (obj1)));
        obj1 = cga1.p;
        obj = ((Window) (obj)).getDecorView();
        bfq.a();
        i = bjz.a(cga1.k, map[0]);
        bfq.a();
        ((PopupWindow) (obj1)).showAtLocation(((View) (obj)), 0, i, bjz.a(cga1.k, map[1]));
        if (cga1.o != null)
        {
            cga1.o.z();
        }
        cga1.j.a(new AdSizeParcel(cga1.k, new ber(cga1.h, cga1.e)));
        cga1.a(map[0], map[1]);
        cga1.b("resized");
        ckw1;
        JVM INSTR monitorexit ;
        return;
_L25:
        cga1.p.dismiss();
          goto _L33
_L22:
        cga1.a("Webview is detached, probably in the middle of a resize or expand.");
        ckw1;
        JVM INSTR monitorexit ;
        return;
_L28:
        i = byte0;
        if (s2.equals("top-left"))
        {
            i = 0;
        }
          goto _L34
_L32:
        i = byte0;
        if (s2.equals("top-center"))
        {
            i = 1;
        }
          goto _L34
_L27:
        i = byte0;
        if (s2.equals("center"))
        {
            i = 2;
        }
          goto _L34
_L29:
        i = byte0;
        if (s2.equals("bottom-left"))
        {
            i = 3;
        }
          goto _L34
_L31:
        i = byte0;
        if (s2.equals("bottom-center"))
        {
            i = 4;
        }
          goto _L34
_L30:
        i = byte0;
        if (s2.equals("bottom-right"))
        {
            i = 5;
        }
          goto _L34
_L37:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9);
          goto _L35
_L38:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(14);
          goto _L35
_L39:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(13);
          goto _L35
_L40:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9);
          goto _L35
_L41:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(14);
          goto _L35
_L42:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
          goto _L35
        map;
        cga1.a((new StringBuilder("Cannot show popup window: ")).append(map.getMessage()).toString());
        cga1.q.removeView(cga1.j.b());
        if (cga1.r != null)
        {
            cga1.r.removeView(cga1.m);
            cga1.r.addView(cga1.j.b());
            cga1.j.a(cga1.l);
        }
        ckw1;
        JVM INSTR monitorexit ;
        return;
_L4:
        ckw1 = new cfz(ckw1, map);
        if (((cfz) (ckw1)).a == null)
        {
            ckw1.a("Activity context is not available.");
            return;
        }
        bkv.e();
        if (!cjj.d(((cfz) (ckw1)).a).b())
        {
            ckw1.a("This feature is not available on the device.");
            return;
        } else
        {
            bkv.e();
            map = cjj.c(((cfz) (ckw1)).a);
            map.setTitle(bkv.h().a(0x7f08063e, "Create calendar event"));
            map.setMessage(bkv.h().a(0x7f08063d, "Allow Ad to create a calendar event?"));
            map.setPositiveButton(bkv.h().a(0x7f08061b, "Accept"), new cfz._cls1(ckw1));
            map.setNegativeButton(bkv.h().a(0x7f080642, "Decline"), new cfz._cls2(ckw1));
            map.create().show();
            return;
        }
_L3:
        ckw1 = new cgc(ckw1, map);
        if (((cgc) (ckw1)).b == null)
        {
            ckw1.a("Activity context is not available");
            return;
        }
        bkv.e();
        if (!cjj.d(((cgc) (ckw1)).b).a())
        {
            ckw1.a("Feature is not supported by the device.");
            return;
        }
        map = (String)((cgc) (ckw1)).a.get("iurl");
        if (TextUtils.isEmpty(map))
        {
            ckw1.a("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(map))
        {
            ckw1.a((new StringBuilder("Invalid image url: ")).append(map).toString());
            return;
        }
        String s1 = Uri.parse(map).getLastPathSegment();
        bkv.e();
        if (!cjj.c(s1))
        {
            ckw1.a((new StringBuilder("Image type not recognized: ")).append(s1).toString());
            return;
        } else
        {
            bkv.e();
            android.app.AlertDialog.Builder builder = cjj.c(((cgc) (ckw1)).b);
            builder.setTitle(bkv.h().a(0x7f080656, "Save image"));
            builder.setMessage(bkv.h().a(0x7f080655, "Allow Ad to store image in Picture gallery?"));
            builder.setPositiveButton(bkv.h().a(0x7f08061b, "Accept"), new cgc._cls1(ckw1, map, s1));
            builder.setNegativeButton(bkv.h().a(0x7f080642, "Decline"), new cgc._cls2(ckw1));
            builder.create().show();
            return;
        }
_L5:
        ckw1 = new cgb(ckw1, map);
        if (((cgb) (ckw1)).a == null)
        {
            bka.e("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(((cgb) (ckw1)).c))
        {
            i = bkv.g().b();
        } else
        if ("landscape".equalsIgnoreCase(((cgb) (ckw1)).c))
        {
            i = bkv.g().a();
        } else
        if (((cgb) (ckw1)).b)
        {
            i = -1;
        } else
        {
            i = bkv.g().c();
        }
        ((cgb) (ckw1)).a.b(i);
        return;
_L6:
        b.a(true);
        return;
_L26:
        i = byte0;
_L34:
        i;
        JVM INSTR tableswitch 0 5: default 1992
    //                   0 1226
    //                   1 1243
    //                   2 1260
    //                   3 1270
    //                   4 1287
    //                   5 1304;
           goto _L36 _L37 _L38 _L39 _L40 _L41 _L42
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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.microsoft.advertising.android:
//            az, AdWebView, q, p, 
//            bu, av, by, PlayerProperties, 
//            Dimensions, d, ab, bx, 
//            AdControl, g, OrientationChangeEventManager

public final class ba extends az
    implements OrientationChangeEventManager.a
{

    private static final List j = Arrays.asList(new String[] {
        "http", "https", "skype", "market"
    });
    private WindowManager c;
    private int d;
    private Dimensions e;
    private AdControl f;
    private Point g[] = {
        new Point(), new Point()
    };
    private Point h[] = {
        new Point(), new Point()
    };
    private Rect i;

    public ba(AdWebView adwebview, AdControl adcontrol)
    {
        super(adwebview);
        d = 0;
        i = new Rect();
        c = (WindowManager)adwebview.getContext().getSystemService("window");
        f = adcontrol;
    }

    private int a(int k)
    {
        return a.b().a().m().a(k, true);
    }

    private int b(int k)
    {
        return a.b().a().m().b(k);
    }

    public final void a()
    {
        int k = c();
        if (k != d)
        {
            d = k;
        }
    }

    public final void a(String s, Map map)
    {
        if (!s.equalsIgnoreCase("close")) goto _L2; else goto _L1
_L1:
        a.f();
_L17:
        return;
_L2:
        if (s.equalsIgnoreCase("expand"))
        {
            av.c("TIMING", (new StringBuilder("expand start ")).append(System.currentTimeMillis()).toString());
            try
            {
                a.a(map);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                av.c("expand", s.getMessage());
            }
            a.c("expand", "Internal error");
            return;
        }
        if (!s.equalsIgnoreCase("open")) goto _L4; else goto _L3
_L3:
        s = (String)map.get("url");
        if (TextUtils.isEmpty(s)) goto _L6; else goto _L5
_L5:
        if (s.length() > 2048) goto _L8; else goto _L7
_L7:
        map = Uri.parse(by.c(s));
        if (j.contains(map.getScheme().toLowerCase(Locale.ENGLISH)))
        {
            a.a("open", String.format("url=%s", new Object[] {
                s
            }));
            av.a("OrmmaDisplayController", (new StringBuilder("opening url: ")).append(s).toString());
            map = new Intent("android.intent.action.VIEW", map);
            map.setFlags(0x10000000);
            b.startActivity(map);
            return;
        }
          goto _L9
_L10:
        a.c("open", "Cannot open this URL");
        return;
_L9:
        try
        {
            av.c("Open", (new StringBuilder("Failed to open url. Url is not white listed : ")).append(s).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            av.c("Open", (new StringBuilder("Failed to open url : ")).append(s).append(" ").append(map.getMessage()).toString());
        }
        continue; /* Loop/switch isn't completed */
_L8:
        av.c("Open", "Failed to open url.  Url is longer than the allowed max length");
        continue; /* Loop/switch isn't completed */
_L6:
        av.c("Open", "Failed to open url.  Url cannot be null or empty");
        if (true) goto _L10; else goto _L4
_L4:
        int ai[];
        if (s.equalsIgnoreCase("playAudio"))
        {
            s = (String)map.get("url");
            boolean flag = Boolean.valueOf((String)map.get("autoplay")).booleanValue();
            boolean flag2 = Boolean.valueOf((String)map.get("controls")).booleanValue();
            boolean flag4 = Boolean.valueOf((String)map.get("loop")).booleanValue();
            boolean flag6 = Boolean.valueOf((String)map.get("position")).booleanValue();
            Object obj = (String)map.get("startStyle");
            String s2 = (String)map.get("stopStyle");
            if (!URLUtil.isValidUrl(s))
            {
                av.c("playAudio", String.format("invalid url: %s", new Object[] {
                    s
                }));
                a.c("playAudio", "Cannot open this URL");
                return;
            } else
            {
                av.b("playAudio", String.format("url: %s autoPlay: %b controls: %b loop: %b position: %b startStyle: %s stopStyle: %s", new Object[] {
                    s, Boolean.valueOf(flag), Boolean.valueOf(flag2), Boolean.valueOf(flag4), Boolean.valueOf(flag6), obj, s2
                }));
                map = new PlayerProperties();
                map.a(false, flag, flag2, flag6, flag4, ((String) (obj)), s2);
                obj = new Bundle();
                ((Bundle) (obj)).putString("action", AdWebView.a.a.toString());
                ((Bundle) (obj)).putString("expand_url", s);
                ((Bundle) (obj)).putParcelable("player_properties", map);
                a.b(((Bundle) (obj)));
                return;
            }
        }
        if (!s.equalsIgnoreCase("playVideo"))
        {
            break MISSING_BLOCK_LABEL_1179;
        }
        ai = new int[4];
        s = ((String)map.get("position")).split("\\,");
        if (s.length != 4) goto _L12; else goto _L11
_L11:
        int k = 0;
_L15:
        if (k < 4) goto _L13; else goto _L12
_L12:
        String s1;
        String s3;
        boolean flag1;
        boolean flag3;
        boolean flag5;
        boolean flag7;
        s1 = (String)map.get("url");
        flag1 = Boolean.valueOf((String)map.get("audioMuted")).booleanValue();
        flag3 = Boolean.valueOf((String)map.get("autoplay")).booleanValue();
        flag5 = Boolean.valueOf((String)map.get("controls")).booleanValue();
        flag7 = Boolean.valueOf((String)map.get("loop")).booleanValue();
        s3 = (String)map.get("startStyle");
        map = (String)map.get("stopStyle");
        if (!URLUtil.isValidUrl(s1))
        {
            av.c("playVideo", String.format("invalid url: %s", new Object[] {
                s1
            }));
            a.c("playVideo", "Cannot open this URL");
            return;
        }
        break; /* Loop/switch isn't completed */
_L13:
        int i1;
        if (by.b(s[k]))
        {
            i1 = Integer.valueOf(s[k]).intValue();
        } else
        {
            i1 = -1;
        }
        ai[k] = i1;
        k++;
        if (true) goto _L15; else goto _L14
_L14:
        PlayerProperties playerproperties;
        int l;
        int j1;
        int k1;
        int l1;
        if (ai[0] != -1)
        {
            s = new Dimensions();
            s.a = b(ai[0]);
            s.b = b(ai[1]);
            s.c = b(ai[2]);
            s.d = b(ai[3]);
        } else
        {
            s = null;
        }
        if (s != null)
        {
            l = ai[0];
        } else
        {
            l = -1;
        }
        if (s != null)
        {
            j1 = ai[1];
        } else
        {
            j1 = -1;
        }
        if (s != null)
        {
            k1 = ai[2];
        } else
        {
            k1 = -1;
        }
        if (s != null)
        {
            l1 = ai[3];
        } else
        {
            l1 = -1;
        }
        av.b("playVideo", String.format("url: %s audioMuted: %b autoPlay: %b controls: %b loop: %b x: %d y: %d width: %d height: %d startStyle: %s stopStyle: %s", new Object[] {
            s1, Boolean.valueOf(flag1), Boolean.valueOf(flag3), Boolean.valueOf(flag5), Boolean.valueOf(flag7), Integer.valueOf(l), Integer.valueOf(j1), Integer.valueOf(k1), Integer.valueOf(l1), s3, 
            map
        }));
        playerproperties = new PlayerProperties();
        playerproperties.a(flag1, flag3, flag5, false, flag7, s3, map);
        map = new Bundle();
        map.putString("expand_url", s1);
        map.putString("action", AdWebView.a.b.toString());
        map.putParcelable("player_properties", playerproperties);
        if (s != null)
        {
            map.putParcelable("expand_dimensions", s);
        }
        a.c(map);
        return;
        if (!s.equalsIgnoreCase("resize"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (by.b((String)map.get("w")) && by.b((String)map.get("h")))
        {
            j1 = Integer.valueOf((String)map.get("w")).intValue();
            l = Integer.valueOf((String)map.get("h")).intValue();
            s = new Bundle();
            j1 = b(j1);
            l = b(l);
            map = a.m();
            if (j1 > ((Dimensions) (map)).c || l > ((Dimensions) (map)).d)
            {
                a.c("resize", "Cannot resize an ad to a size greater than the visible view area");
                return;
            }
            if (j1 <= 0 || l < 0)
            {
                a.c("resize", "Cannot resize an ad to a size smaller than or equal to zero");
                return;
            } else
            {
                s.putInt("resize_width", j1);
                s.putInt("resize_height", l);
                a.a(s);
                return;
            }
        }
        if (true) goto _L17; else goto _L16
_L16:
        if (s.equalsIgnoreCase("show"))
        {
            a.g();
            return;
        }
        if (s.equalsIgnoreCase("useCustomClose"))
        {
            a.b(map);
            return;
        }
        if (true) goto _L17; else goto _L18
_L18:
    }

    public final boolean a(d d1)
    {
        float f1;
        if (d1 != null)
        {
            f1 = d1.d();
        } else
        {
            f1 = ab.a().a("AD_VISIBILITY_SCREEN_AREA_PP");
        }
        return by.a(f, null, g, h, i, f1, null);
    }

    public final String b()
    {
        if (a.o())
        {
            return "interstitial";
        } else
        {
            return "inline";
        }
    }

    public final int c()
    {
        switch (c.getDefaultDisplay().getOrientation())
        {
        default:
            return -1;

        case 0: // '\0'
            return 0;

        case 1: // '\001'
            return 90;

        case 2: // '\002'
            return 180;

        case 3: // '\003'
            return 270;
        }
    }

    public final String d()
    {
        int k = f.t().e().intValue();
        int l = f.t().f().intValue();
        return String.format(Locale.ENGLISH, "{ width: %d, height: %d }", new Object[] {
            Integer.valueOf(a(k)), Integer.valueOf(a(l))
        });
    }

    public final String e()
    {
        if (e != null)
        {
            return String.format(Locale.ENGLISH, "{x: %d, y: %d, width: %d, height: %d }", new Object[] {
                Integer.valueOf(a(e.a)), Integer.valueOf(a(e.b)), Integer.valueOf(a(e.c)), Integer.valueOf(a(e.d))
            });
        } else
        {
            return "";
        }
    }

    public final void f()
    {
label0:
        {
            if (e == null)
            {
                e = new Dimensions();
                if (f == null)
                {
                    break label0;
                }
                e.a = f.getLeft();
                e.b = f.getTop();
                e.c = f.t().e().intValue();
                e.d = f.t().f().intValue();
            }
            return;
        }
        e.a(a);
    }

    public final void g()
    {
        d = c();
        p.a().l().a(this);
    }

}

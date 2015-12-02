// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.b.a;

import android.content.Context;
import android.os.Bundle;

// Referenced classes of package com.qihoo.b.a:
//            c, b, e

class a
{

    private Context a;
    private c b;
    private b c;

    public a(Context context, Bundle bundle, b b1)
    {
        c = null;
        a = context;
        c = b1;
        b = new c(bundle);
    }

    private String b()
    {
        Object obj = null;
        String s;
        if (c != null && c.a() != null)
        {
            s = c.a();
        } else
        {
            if (e.a(a, "com.android.browser"))
            {
                return "com.android.browser/.BrowserActivity";
            }
            if (e.a(a, "com.google.android.browser"))
            {
                return "com.google.android.browser/com.android.browser.BrowserActivity";
            }
            if (e.a(a, "com.android.chrome"))
            {
                return "com.android.chrome/com.google.android.apps.chrome.Main";
            }
            if (e.a(a, "com.opera.browser"))
            {
                return "com.opera.browser/com.opera.Opera";
            }
            if (e.a(a, "com.UCMobile.intl"))
            {
                return "com.UCMobile.intl/com.UCMobile.main.UCMobile";
            }
            if (e.a(a, "com.baidu.browser.inter"))
            {
                return "com.baidu.browser.inter/com.baidu.browser.inter.BrowserActivity";
            }
            if (e.a(a, "com.jiubang.browser"))
            {
                return "com.jiubang.browser/.main.BrowserActivity";
            }
            if (e.a(a, "com.ksmobile.cb"))
            {
                return "com.ksmobile.cb/com.ijinshan.browser.screen.BrowserActivity";
            }
            if (e.a(a, "com.opera.mini.android"))
            {
                return "com.opera.mini.android/com.opera.mini.android.Browser";
            }
            if (e.a(a, "com.mx.browser"))
            {
                return "com.mx.browser/.MxBrowserActivity";
            }
            if (e.a(a, "com.uc.browser.en"))
            {
                return "com.uc.browser.en/com.uc.browser.ActivityBrowser";
            }
            if (e.a(a, "com.yandex.browser"))
            {
                return "com.yandex.browser/com.yandex.browser.YandexBrowserActivity";
            }
            if (e.a(a, "mobi.mgeek.TunnyBrowser"))
            {
                return "mobi.mgeek.TunnyBrowser/mobi.mgeek.TunnyBrowser.BrowserActivity";
            }
            if (e.a(a, "org.mozilla.firefox"))
            {
                return "org.mozilla.firefox/.App";
            }
            s = obj;
            if (c != null)
            {
                s = obj;
                if (c.b() != null)
                {
                    return c.b();
                }
            }
        }
        return s;
    }

    public String a()
    {
        String s2 = b();
        String s;
        String s1;
        if (c != null && c.c() != null)
        {
            s = c.c();
        } else
        {
            s = b.a();
        }
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            s1 = " --user 0 ";
        } else
        {
            s1 = "";
        }
        if (s == null)
        {
            return null;
        } else
        {
            return String.format(" am start -n %s -a android.intent.action.VIEW -d %s %s ", new Object[] {
                s2, s, s1
            });
        }
    }
}

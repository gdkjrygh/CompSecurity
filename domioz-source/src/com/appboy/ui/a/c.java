// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.appboy.b.a;
import com.appboy.f;
import com.appboy.ui.AppboyWebViewActivity;

// Referenced classes of package com.appboy.ui.a:
//            d

public final class c
    implements d
{

    private static final String a;
    private final String b;
    private boolean c;
    private final a d;
    private String e;

    public c(String s, a a1, String s1)
    {
        b = s;
        c = false;
        d = a1;
        e = s1;
    }

    public final void a(Context context)
    {
        if (d != a.b)
        {
            try
            {
                context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                com.appboy.f.a.b(a, "Google Play Store not found, launching Play Store with WebView");
                c = true;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                com.appboy.f.a.d(a, String.format("Unexpected exception while checking for %s.", new Object[] {
                    "com.google.android.gsf"
                }));
                c = true;
            }
        }
        if (c)
        {
            Object obj;
            if (d == a.b)
            {
                obj = (new StringBuilder("http://www.amazon.com/gp/mas/dl/android?asin=")).append(e).toString();
            } else
            {
                obj = (new StringBuilder("https://play.google.com/store/apps/details?id=")).append(b).toString();
            }
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj))), context, com/appboy/ui/AppboyWebViewActivity));
            return;
        }
        String s;
        if (d == a.b)
        {
            s = (new StringBuilder("amzn://apps/android?asin=")).append(e).toString();
        } else
        {
            s = (new StringBuilder("market://details?id=")).append(b).toString();
        }
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, com/appboy/ui/a/c.getName()
        });
    }
}

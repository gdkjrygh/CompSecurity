// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.net.Uri;
import android.util.Log;
import com.facebook.ads.InterstitialAdActivity;
import com.facebook.ads.internal.action.a;
import com.facebook.ads.internal.action.b;
import com.facebook.ads.internal.adapters.m;

// Referenced classes of package com.facebook.ads.internal.view:
//            f

class a
    implements a
{

    final InterstitialAdActivity a;
    final f b;

    public void a()
    {
        com.facebook.ads.internal.view.f.b(b).c();
    }

    public void a(int i)
    {
    }

    public void a(String s)
    {
        s = Uri.parse(s);
        if ("fbad".equals(s.getScheme()) && "close".equals(s.getAuthority()))
        {
            a.finish();
        } else
        {
            com.facebook.ads.internal.view.f.a(b).a("com.facebook.ads.interstitial.clicked");
            s = com.facebook.ads.internal.action.b.a(a, s);
            if (s != null)
            {
                try
                {
                    com.facebook.ads.internal.view.f.a(b, s.a());
                    com.facebook.ads.internal.view.f.a(b, System.currentTimeMillis());
                    s.b();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    Log.e(f.d(), "Error executing action", s);
                }
                return;
            }
        }
    }

    public void b()
    {
        com.facebook.ads.internal.view.f.b(b).a();
    }

    vity(f f1, InterstitialAdActivity interstitialadactivity)
    {
        b = f1;
        a = interstitialadactivity;
        super();
    }
}

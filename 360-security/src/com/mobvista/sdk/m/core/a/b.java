// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.a;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.facebook.ads.NativeAd;

// Referenced classes of package com.mobvista.sdk.m.core.a:
//            a, c

public final class b
{

    private a a;
    private Context b;
    private String c;
    private NativeAd d;

    public b()
    {
    }

    static a a(b b1)
    {
        return b1.a;
    }

    static NativeAd b(b b1)
    {
        return b1.d;
    }

    private static boolean b()
    {
        try
        {
            Class.forName("com.facebook.ads.a");
            Class.forName("com.facebook.ads.c");
            Class.forName("com.facebook.ads.NativeAd");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return false;
        }
        return true;
    }

    public final void a()
    {
        if (d != null)
        {
            d.n();
            d.a(null);
            d.b();
            d = null;
        }
    }

    public final void a(View view)
    {
        Class.forName("com.facebook.ads.a");
        Class.forName("com.facebook.ads.c");
        Class.forName("com.facebook.ads.NativeAd");
        d.a(view);
_L2:
        return;
        view;
        if (a != null)
        {
            a.a("ClassNotFound:com.facebook.ads.*, is Facebook Audience Network JAR file added to your project?");
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(a a1)
    {
        a = a1;
        if (com.mobvista.sdk.m.a.f.b.f() > 10) goto _L2; else goto _L1
_L1:
        if (a != null)
        {
            a.a("facebook need api above 10");
        }
        Log.e("", "facebook need api above 10");
_L4:
        return;
_L2:
        Class.forName("com.facebook.ads.a");
        Class.forName("com.facebook.ads.c");
        Class.forName("com.facebook.ads.NativeAd");
        d = new NativeAd(b.getApplicationContext(), c);
        d.a(new c(this));
        d.a();
        return;
        a1;
        if (a != null)
        {
            a.a("fb crash nothing reason");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        a1;
        if (a == null) goto _L4; else goto _L5
_L5:
        a.a("ClassNotFound:com.facebook.ads.*, is Facebook Audience Network JAR file added to your project?");
        return;
    }

    public final transient void a(Object aobj[])
    {
        if (b())
        {
            b = (Context)aobj[0];
            c = (String)aobj[1];
            return;
        } else
        {
            Log.i("Mobvista SDK M", "Try to load ad from \"facebook\" but Facebook Audience Network JAR file not found.");
            return;
        }
    }
}

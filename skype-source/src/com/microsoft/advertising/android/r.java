// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.microsoft.advertising.android:
//            AdWebView, g, av, af, 
//            AdControl

final class r
{

    private List a;
    private List b;
    private final Context c;
    private final AdControl d;
    private final g e;

    protected r(Context context, AdControl adcontrol, g g1)
    {
        a = new ArrayList();
        b = new ArrayList();
        int i = 0;
        do
        {
            if (i >= 3)
            {
                c = context;
                d = adcontrol;
                e = g1;
                return;
            }
            a.add(new AdWebView(context, adcontrol, g1, g1.g()));
            i++;
        } while (true);
    }

    protected final AdWebView a()
    {
        boolean flag = false;
        AdWebView adwebview = null;
        if (!a.isEmpty())
        {
            adwebview = (AdWebView)a.remove(0);
            b.add(adwebview);
        } else
        if (b.size() < 3)
        {
            adwebview = new AdWebView(c, d, e, e.g());
            b.add(adwebview);
        } else
        {
            if (b.size() < 3)
            {
                flag = true;
            }
            af.a(flag, "No more webviews available. Max webviews : 3");
        }
        (new StringBuilder("providing AdWebView ")).append(adwebview);
        av.a("AdWebViewCache");
        adwebview.setId(-1);
        return adwebview;
    }

    protected final void a(AdWebView adwebview)
    {
        (new StringBuilder("attempting to release AdWebView ")).append(adwebview);
        av.a("AdWebViewCache");
        if (b.contains(adwebview))
        {
            AdWebView adwebview1 = (AdWebView)b.remove(b.indexOf(adwebview));
            a.add(adwebview1);
            (new StringBuilder("released AdWebView ")).append(adwebview);
            av.a("AdWebViewCache");
            return;
        } else
        {
            (new StringBuilder("Attempted to release AdView that was not in use: ")).append(adwebview);
            av.a("AdWebViewCache");
            return;
        }
    }

    protected final void b()
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        if (i < b.size()) goto _L3; else goto _L2
_L2:
        if (a == null) goto _L5; else goto _L4
_L4:
        i = 0;
_L7:
        if (i < a.size())
        {
            break MISSING_BLOCK_LABEL_68;
        }
_L5:
        return;
_L3:
        ((AdWebView)b.remove(i)).c();
        i++;
          goto _L6
        ((AdWebView)a.remove(i)).c();
        i++;
          goto _L7
    }
}

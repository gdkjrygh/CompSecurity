// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.view.View;
import com.facebook.ads.internal.a;
import com.facebook.ads.internal.b;
import com.facebook.ads.internal.h;
import com.facebook.ads.internal.util.g;

// Referenced classes of package com.facebook.ads:
//            AdView, AdListener, ImpressionListener

class a extends a
{

    final AdView a;

    public void a()
    {
        if (com.facebook.ads.AdView.b(a) != null)
        {
            com.facebook.ads.AdView.b(a).c();
        }
    }

    public void a(View view)
    {
        if (view == null)
        {
            throw new IllegalStateException("Cannot present null view");
        }
        com.facebook.ads.AdView.a(a, true);
        com.facebook.ads.AdView.a(a, view);
        a.removeAllViews();
        a.addView(AdView.c(a));
        if (AdView.c(a) instanceof com.facebook.ads.internal.view.a)
        {
            g.a(AdView.d(a), AdView.c(a), AdView.e(a));
        }
        if (com.facebook.ads.AdView.a(a) != null)
        {
            com.facebook.ads.AdView.a(a).onAdLoaded(a);
        }
    }

    public void a(b b1)
    {
        if (com.facebook.ads.AdView.a(a) != null)
        {
            com.facebook.ads.AdView.a(a).onError(a, b1.b());
        }
    }

    public void b()
    {
        if (com.facebook.ads.AdView.a(a) != null)
        {
            com.facebook.ads.AdView.a(a).onAdClicked(a);
        }
    }

    public void c()
    {
        if (AdView.f(a) != null)
        {
            AdView.f(a).onLoggingImpression(a);
        }
        if ((com.facebook.ads.AdView.a(a) instanceof ImpressionListener) && com.facebook.ads.AdView.a(a) != AdView.f(a))
        {
            ((ImpressionListener)com.facebook.ads.AdView.a(a)).onLoggingImpression(a);
        }
    }

    b(AdView adview)
    {
        a = adview;
        super();
    }
}

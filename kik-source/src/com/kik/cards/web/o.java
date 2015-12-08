// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import com.kik.g.i;
import com.kik.g.p;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment, bd, WebViewBrowserMetadataPlugin, p

final class o extends i
{

    final CardsWebViewFragment a;

    o(CardsWebViewFragment cardswebviewfragment)
    {
        a = cardswebviewfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        CardsWebViewFragment.a(a, 100);
        if (!CardsWebViewFragment.b(a).i())
        {
            a.r();
        }
        CardsWebViewFragment.c(a);
        CardsWebViewFragment.e(a).a().a(new com.kik.cards.web.p(this));
    }
}

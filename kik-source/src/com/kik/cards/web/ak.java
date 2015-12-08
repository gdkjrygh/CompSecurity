// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import com.kik.cards.web.browser.BrowserPlugin;
import com.kik.g.i;

// Referenced classes of package com.kik.cards.web:
//            bf, CardsWebViewFragment

final class ak extends i
{

    final CardsWebViewFragment a;

    ak(CardsWebViewFragment cardswebviewfragment)
    {
        a = cardswebviewfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (String)obj1;
        CardsWebViewFragment.b(a, bf.b(((String) (obj))));
        CardsWebViewFragment.c(a, CardsWebViewFragment.d(a));
        if (CardsWebViewFragment.g(a) != null)
        {
            CardsWebViewFragment.g(a).d();
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import com.kik.android.a;
import com.kik.g.i;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment, bf

final class e extends i
{

    final CardsWebViewFragment a;

    e(CardsWebViewFragment cardswebviewfragment)
    {
        a = cardswebviewfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        CardsWebViewFragment.n(a);
        a.c.b("Browser Load Failed").a("URL", CardsWebViewFragment.d(a)).a("Domain", com.kik.cards.web.bf.i(CardsWebViewFragment.d(a))).b();
    }
}

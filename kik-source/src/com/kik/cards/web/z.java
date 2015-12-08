// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import com.kik.g.k;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment

final class z
    implements Runnable
{

    final CardsWebViewFragment a;

    z(CardsWebViewFragment cardswebviewfragment)
    {
        a = cardswebviewfragment;
        super();
    }

    public final void run()
    {
        CardsWebViewFragment.t(a).a(null);
    }
}

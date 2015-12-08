// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import com.kik.g.i;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment

final class d extends i
{

    final CardsWebViewFragment a;

    d(CardsWebViewFragment cardswebviewfragment)
    {
        a = cardswebviewfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Integer)obj1;
        CardsWebViewFragment.a(a, ((Integer) (obj)).intValue());
    }
}

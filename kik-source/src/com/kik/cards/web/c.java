// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.view.View;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment

final class c
    implements android.view.View.OnClickListener
{

    final CardsWebViewFragment a;

    c(CardsWebViewFragment cardswebviewfragment)
    {
        a = cardswebviewfragment;
        super();
    }

    public final void onClick(View view)
    {
        CardsWebViewFragment.l(a);
        CardsWebViewFragment.m(a);
    }
}

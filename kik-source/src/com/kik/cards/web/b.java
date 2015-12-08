// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.view.View;
import com.kik.android.a;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment

final class b
    implements android.view.View.OnClickListener
{

    final CardsWebViewFragment a;

    b(CardsWebViewFragment cardswebviewfragment)
    {
        a = cardswebviewfragment;
        super();
    }

    public final void onClick(View view)
    {
        if (a.c != null)
        {
            a.c.b("Browser Screen Closed").a("Reason", "Explicit");
        }
        CardsWebViewFragment.k(a);
    }
}

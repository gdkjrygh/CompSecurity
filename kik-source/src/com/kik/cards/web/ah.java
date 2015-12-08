// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.view.View;
import kik.android.util.cv;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment

final class ah
    implements Runnable
{

    final CardsWebViewFragment a;

    ah(CardsWebViewFragment cardswebviewfragment)
    {
        a = cardswebviewfragment;
        super();
    }

    public final void run()
    {
        cv.e(new View[] {
            CardsWebViewFragment.v(a)
        });
        cv.b(new View[] {
            CardsWebViewFragment.w(a)
        });
    }
}

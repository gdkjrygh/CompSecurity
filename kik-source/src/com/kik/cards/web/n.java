// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.view.View;
import android.widget.ProgressBar;
import kik.android.util.cv;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment

final class n
    implements Runnable
{

    final int a;
    final CardsWebViewFragment b;

    n(CardsWebViewFragment cardswebviewfragment, int i)
    {
        b = cardswebviewfragment;
        a = i;
        super();
    }

    public final void run()
    {
        if (CardsWebViewFragment.p(b) == a)
        {
            cv.e(new View[] {
                CardsWebViewFragment.q(b)
            });
            CardsWebViewFragment.q(b).setMax(100);
            CardsWebViewFragment.q(b).setProgress(0);
        }
    }
}

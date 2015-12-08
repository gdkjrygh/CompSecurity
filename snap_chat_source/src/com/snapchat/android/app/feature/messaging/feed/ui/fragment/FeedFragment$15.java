// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import Bt;
import android.view.View;
import pT;
import pX;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedFragment

final class c
    implements Runnable
{

    private int a;
    private pT b;
    private pX c;
    private FeedFragment d;

    public final void run()
    {
        if (!FeedFragment.x(d) && a > 0)
        {
            FeedFragment.a(d, a - 1);
        } else
        {
            FeedFragment.d(d);
            Bt.C(false);
            if (b.equals(c.s))
            {
                c.n.setTranslationX(0.0F);
                return;
            }
        }
    }

    Q(FeedFragment feedfragment, int i, pT pt, pX px)
    {
        d = feedfragment;
        a = i;
        b = pt;
        c = px;
        super();
    }
}

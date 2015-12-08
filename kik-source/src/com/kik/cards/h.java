// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards;

import android.app.Activity;
import android.view.Window;

// Referenced classes of package com.kik.cards:
//            KikCardsWebViewFragment

final class h
    implements Runnable
{

    final boolean a;
    final Activity b;
    final KikCardsWebViewFragment c;

    h(KikCardsWebViewFragment kikcardswebviewfragment, boolean flag, Activity activity)
    {
        c = kikcardswebviewfragment;
        a = flag;
        b = activity;
        super();
    }

    public final void run()
    {
        KikCardsWebViewFragment kikcardswebviewfragment;
        boolean flag;
        if (a)
        {
            b.getWindow().clearFlags(1024);
        } else
        {
            b.getWindow().addFlags(1024);
        }
        kikcardswebviewfragment = c;
        if (!a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        KikCardsWebViewFragment.a(kikcardswebviewfragment, flag);
    }
}

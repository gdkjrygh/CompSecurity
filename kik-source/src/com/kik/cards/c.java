// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards;

import com.kik.cards.web.usermedia.b;
import kik.android.chat.fragment.KikDialogFragment;
import kik.android.chat.fragment.ProgressDialogFragment;

// Referenced classes of package com.kik.cards:
//            a, KikCardsWebViewFragment

final class c
    implements Runnable
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        if (a.d != null)
        {
            a.d.dismissAllowingStateLoss();
        }
        KikDialogFragment kikdialogfragment = new KikDialogFragment();
        kikdialogfragment.a(a.b.a());
        kikdialogfragment.b(a.b.b());
        kikdialogfragment.setCancelable(true);
        kikdialogfragment.a(a.c, null);
        a.e.a(kikdialogfragment);
    }
}

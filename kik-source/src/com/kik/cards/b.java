// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards;

import android.util.Pair;
import kik.android.chat.fragment.KikDialogFragment;

// Referenced classes of package com.kik.cards:
//            a, KikCardsWebViewFragment

final class b
    implements Runnable
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        KikDialogFragment kikdialogfragment;
        if (a.b.d())
        {
            kikdialogfragment = new KikDialogFragment();
            kikdialogfragment.a((String)((Pair)a.b.f()).first);
            kikdialogfragment.b((String)((Pair)a.b.f()).second);
            kikdialogfragment.setCancelable(true);
            kikdialogfragment.a(a.c, null);
        } else
        {
            kikdialogfragment = null;
        }
        a.e.a(kikdialogfragment);
    }
}

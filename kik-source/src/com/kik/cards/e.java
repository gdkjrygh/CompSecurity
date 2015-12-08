// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards;

import android.content.DialogInterface;
import com.kik.g.p;

// Referenced classes of package com.kik.cards:
//            KikCardsWebViewFragment

final class e
    implements android.content.DialogInterface.OnClickListener
{

    final p a;
    final KikCardsWebViewFragment b;

    e(KikCardsWebViewFragment kikcardswebviewfragment, p p1)
    {
        b = kikcardswebviewfragment;
        a = p1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a(null);
    }
}

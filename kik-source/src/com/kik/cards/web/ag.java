// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.content.DialogInterface;
import kik.android.b.s;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment

final class ag
    implements android.content.DialogInterface.OnClickListener
{

    final android.webkit.GeolocationPermissions.Callback a;
    final String b;
    final CardsWebViewFragment c;

    ag(CardsWebViewFragment cardswebviewfragment, android.webkit.GeolocationPermissions.Callback callback, String s1)
    {
        c = cardswebviewfragment;
        a = callback;
        b = s1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.invoke(b, true, false);
        c.t.d(b);
    }
}

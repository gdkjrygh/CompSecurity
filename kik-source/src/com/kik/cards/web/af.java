// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.content.DialogInterface;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment

final class af
    implements android.content.DialogInterface.OnClickListener
{

    final android.webkit.GeolocationPermissions.Callback a;
    final String b;
    final CardsWebViewFragment c;

    af(CardsWebViewFragment cardswebviewfragment, android.webkit.GeolocationPermissions.Callback callback, String s)
    {
        c = cardswebviewfragment;
        a = callback;
        b = s;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.invoke(b, false, false);
    }
}

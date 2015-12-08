// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import com.kik.g.r;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment

final class ad extends r
{

    final android.webkit.GeolocationPermissions.Callback a;
    final String b;
    final CardsWebViewFragment c;

    ad(CardsWebViewFragment cardswebviewfragment, android.webkit.GeolocationPermissions.Callback callback, String s)
    {
        c = cardswebviewfragment;
        a = callback;
        b = s;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Boolean)obj;
        super.a(obj);
        if (((Boolean) (obj)).booleanValue())
        {
            a.invoke(b, true, false);
            return;
        } else
        {
            CardsWebViewFragment.a(c, b, a);
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
        CardsWebViewFragment.a(c, b, a);
    }
}

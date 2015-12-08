// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment

final class a
    implements android.support.v4.app.FragmentManager.OnBackStackChangedListener
{

    final CardsWebViewFragment a;

    a(CardsWebViewFragment cardswebviewfragment)
    {
        a = cardswebviewfragment;
        super();
    }

    public final void onBackStackChanged()
    {
        FragmentManager fragmentmanager = CardsWebViewFragment.a(a).getSupportFragmentManager();
        int i = fragmentmanager.getBackStackEntryCount();
        android.support.v4.app.FragmentManager.BackStackEntry backstackentry = null;
        if (i > 0)
        {
            backstackentry = fragmentmanager.getBackStackEntryAt(i - 1);
        }
        if (backstackentry == null || backstackentry.getId() == a.getId())
        {
            CardsWebViewFragment.z();
            a.c(false);
            return;
        } else
        {
            CardsWebViewFragment.z();
            a.c(true);
            return;
        }
    }
}

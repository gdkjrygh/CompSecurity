// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import android.view.View;
import nb;
import ni;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            CashSettingsFragment

final class a
    implements android.view.CashSettingsFragment._cls8
{

    private CashSettingsFragment a;

    public final void onClick(View view)
    {
        if (a.a.b("SQUARE"))
        {
            view = a.a.a("SQUARE");
            a.getActivity();
            view.a(a.getString(0x7f080273));
            return;
        } else
        {
            nb.a();
            return;
        }
    }

    (CashSettingsFragment cashsettingsfragment)
    {
        a = cashsettingsfragment;
        super();
    }
}

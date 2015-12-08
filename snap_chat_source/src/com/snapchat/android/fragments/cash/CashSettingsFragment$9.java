// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import Mf;
import Oi;
import Pi;
import android.view.View;
import com.snapchat.android.fragments.settings.WebFragment;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            CashSettingsFragment

final class a
    implements android.view.CashSettingsFragment._cls9
{

    private CashSettingsFragment a;

    public final void onClick(View view)
    {
        view = Mf.a();
        Pi.a();
        view.a(new Oi(new WebFragment(Pi.e(), a.getString(0x7f080272), true, "/ca/snapcash")));
    }

    (CashSettingsFragment cashsettingsfragment)
    {
        a = cashsettingsfragment;
        super();
    }
}

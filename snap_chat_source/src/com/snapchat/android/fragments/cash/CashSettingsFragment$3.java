// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import Bt;
import Mf;
import android.widget.ProgressBar;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            CashSettingsFragment

final class a
    implements Runnable
{

    private Integer a;
    private CashSettingsFragment b;

    public final void run()
    {
        CashSettingsFragment.a(b).setVisibility(8);
        if (Bt.aE())
        {
            CashSettingsFragment.f(b);
        } else
        {
            CashSettingsFragment.g(b);
        }
        CashSettingsFragment.h(b);
        if (a != null)
        {
            Mf.a().a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ype.TOAST, a.intValue()));
        }
    }

    pe(CashSettingsFragment cashsettingsfragment, Integer integer)
    {
        b = cashsettingsfragment;
        a = integer;
        super();
    }
}

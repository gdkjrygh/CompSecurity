// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import android.view.View;
import android.widget.CheckBox;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            CashSettingsFragment

final class a
    implements android.view.CashSettingsFragment._cls6
{

    private CashSettingsFragment a;

    public final void onClick(View view)
    {
        view = CashSettingsFragment.c(a);
        boolean flag;
        if (!CashSettingsFragment.c(a).isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setChecked(flag);
    }

    (CashSettingsFragment cashsettingsfragment)
    {
        a = cashsettingsfragment;
        super();
    }
}

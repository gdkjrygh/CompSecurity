// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import Mf;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            CashSettingsFragment

final class e
    implements Runnable
{

    private boolean a;
    private CompoundButton b;
    private ProgressBar c;
    private View d;
    private String e;

    public final void run()
    {
        if (a != b.isChecked())
        {
            b.setTag(Boolean.valueOf(true));
        }
        b.setChecked(a);
        b.setVisibility(0);
        c.setVisibility(8);
        d.setEnabled(true);
        if (e != null)
        {
            Mf.a().a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ype.TOAST, e));
        }
    }

    pe(boolean flag, CompoundButton compoundbutton, ProgressBar progressbar, View view, String s)
    {
        a = flag;
        b = compoundbutton;
        c = progressbar;
        d = view;
        e = s;
        super();
    }
}

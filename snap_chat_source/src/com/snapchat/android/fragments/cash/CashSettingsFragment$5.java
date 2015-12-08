// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.List;
import nP;
import np;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            CashSettingsFragment

final class a
    implements android.view.CashSettingsFragment._cls5
{

    final CashSettingsFragment a;

    public final void onClick(View view)
    {
        view = new android.app.it>(a.getActivity());
        view.Title(0x7f08030a);
        view.Message(0x7f080309);
        view.Cancelable(true);
        view.PositiveButton(0x7f080323, new android.content.DialogInterface.OnClickListener() {

            final CashSettingsFragment._cls5 a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                CashSettingsFragment.a(a.a).setVisibility(0);
                CashSettingsFragment.b(a.a).setVisibility(8);
                dialoginterface = CashSettingsFragment.l();
                dialoginterface.mListener = new np.a(this) {

                    private _cls1 a;

                    public final void a(np np)
                    {
                    }

                    public final void a(np np, List list, boolean flag)
                    {
                        CashSettingsFragment.a(a.a.a, null);
                    }

                    public final void b(np np)
                    {
                        CashSettingsFragment.a(a.a.a, Integer.valueOf(0x7f080081));
                    }

                    public final void b(np np, List list, boolean flag)
                    {
                        CashSettingsFragment.a(a.a.a, Integer.valueOf(0x7f080081));
                    }

            
            {
                a = _pcls1;
                super();
            }
                };
                dialoginterface.a(null);
            }

            
            {
                a = CashSettingsFragment._cls5.this;
                super();
            }
        });
        view.NegativeButton(0x7f080196, null);
        a.b = view.ate();
        a.b.show();
    }

    _cls1.a(CashSettingsFragment cashsettingsfragment)
    {
        a = cashsettingsfragment;
        super();
    }
}

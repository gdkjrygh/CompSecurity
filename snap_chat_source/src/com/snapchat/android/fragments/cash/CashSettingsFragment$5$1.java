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
    implements android.content.stener
{

    final a a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        CashSettingsFragment.a(a.a).setVisibility(0);
        CashSettingsFragment.b(a.a).setVisibility(8);
        dialoginterface = CashSettingsFragment.l();
        dialoginterface.mListener = new np.a() {

            private CashSettingsFragment._cls5._cls1 a;

            public final void a(np np1)
            {
            }

            public final void a(np np1, List list, boolean flag)
            {
                CashSettingsFragment.a(a.a.a, null);
            }

            public final void b(np np1)
            {
                CashSettingsFragment.a(a.a.a, Integer.valueOf(0x7f080081));
            }

            public final void b(np np1, List list, boolean flag)
            {
                CashSettingsFragment.a(a.a.a, Integer.valueOf(0x7f080081));
            }

            
            {
                a = CashSettingsFragment._cls5._cls1.this;
                super();
            }
        };
        dialoginterface.a(null);
    }

    _cls1.a(_cls1.a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/snapchat/android/fragments/cash/CashSettingsFragment$5

/* anonymous class */
    final class CashSettingsFragment._cls5
        implements android.view.View.OnClickListener
    {

        final CashSettingsFragment a;

        public final void onClick(View view)
        {
            view = new android.app.AlertDialog.Builder(a.getActivity());
            view.setTitle(0x7f08030a);
            view.setMessage(0x7f080309);
            view.setCancelable(true);
            view.setPositiveButton(0x7f080323, new CashSettingsFragment._cls5._cls1(this));
            view.setNegativeButton(0x7f080196, null);
            a.b = view.create();
            a.b.show();
        }

            
            {
                a = cashsettingsfragment;
                super();
            }
    }

}

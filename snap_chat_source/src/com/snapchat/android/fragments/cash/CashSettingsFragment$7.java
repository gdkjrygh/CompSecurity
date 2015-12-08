// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import IC;
import Mf;
import Oi;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.squareup.otto.Bus;
import java.util.List;
import np;
import ok;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            CashSettingsFragment, SecurityCodeFragment

final class a
    implements android.widget.dChangeListener
{

    final CashSettingsFragment a;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (compoundbutton.getTag() != null)
        {
            compoundbutton.setTag(null);
            return;
        } else
        {
            CashSettingsFragment.d(a).setEnabled(false);
            CashSettingsFragment.c(a).setVisibility(8);
            CashSettingsFragment.e(a).setVisibility(0);
            compoundbutton = CashSettingsFragment.h();
            compoundbutton.mListener = new np.a(flag) {

                private boolean a;
                private CashSettingsFragment._cls7 b;

                public final void a(np np1)
                {
                }

                public final void a(np np1, List list, boolean flag1)
                {
                    flag1 = true;
                    if (list == null || list.isEmpty())
                    {
                        if (!a)
                        {
                            np1 = CashSettingsFragment.m();
                            list = b.a;
                            CashSettingsFragment.c(b.a);
                            np1.a = new CashSettingsFragment._cls10(list, np1);
                            Mf.a().a(new Oi(np1));
                            return;
                        } else
                        {
                            np1 = b.a;
                            CashSettingsFragment.c(b.a);
                            CashSettingsFragment.a(np1.a(null, true)).execute();
                            return;
                        }
                    }
                    np1 = (new StringBuilder()).append(IC.a(null, 0x7f08005d, new Object[0])).append('\n').append(IC.a(null, 0x7f0801ee, new Object[0])).toString();
                    list = CashSettingsFragment.c(b.a);
                    RelativeLayout relativelayout = CashSettingsFragment.d(b.a);
                    ProgressBar progressbar = CashSettingsFragment.e(b.a);
                    if (a)
                    {
                        flag1 = false;
                    }
                    CashSettingsFragment.a(list, relativelayout, progressbar, flag1, np1);
                }

                public final void b(np np1)
                {
                }

                public final void b(np np1, List list, boolean flag1)
                {
                    flag1 = false;
                    np1 = (new StringBuilder()).append(IC.a(null, 0x7f08005d, new Object[0])).append('\n').append(IC.a(null, 0x7f0801ee, new Object[0])).toString();
                    list = CashSettingsFragment.c(b.a);
                    RelativeLayout relativelayout = CashSettingsFragment.d(b.a);
                    ProgressBar progressbar = CashSettingsFragment.e(b.a);
                    if (!a)
                    {
                        flag1 = true;
                    }
                    CashSettingsFragment.a(list, relativelayout, progressbar, flag1, np1);
                }

            
            {
                b = CashSettingsFragment._cls7.this;
                a = flag;
                super();
            }
            };
            compoundbutton.a(null);
            return;
        }
    }

    _cls1.a(CashSettingsFragment cashsettingsfragment)
    {
        a = cashsettingsfragment;
        super();
    }
}

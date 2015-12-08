// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import nB;
import np;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            CashSettingsFragment

final class a
    implements android.view.CashSettingsFragment._cls4
{

    final CashSettingsFragment a;

    public final void onClick(View view)
    {
        view = new nB((byte)0);
        view.mListener = new np.a() {

            private CashSettingsFragment._cls4 a;

            public final void a(np np1)
            {
            }

            public final void a(np np1, List list, boolean flag)
            {
                if (list != null)
                {
                    np1 = list.iterator();
                    do
                    {
                        if (!np1.hasNext())
                        {
                            break;
                        }
                        list = (np)np1.next();
                        if (list.d())
                        {
                            list.a(null);
                        }
                    } while (true);
                }
                CashSettingsFragment.a(a.a, null);
            }

            public final void b(np np1)
            {
            }

            public final void b(np np1, List list, boolean flag)
            {
                CashSettingsFragment.a(a.a, Integer.valueOf(0x7f080151));
            }

            
            {
                a = CashSettingsFragment._cls4.this;
                super();
            }
        };
        view.a(null);
    }

    _cls1.a(CashSettingsFragment cashsettingsfragment)
    {
        a = cashsettingsfragment;
        super();
    }
}

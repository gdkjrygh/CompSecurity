// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Mf;
import Oi;
import android.view.View;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.squareup.otto.Bus;
import java.util.List;
import np;
import nr;
import ns;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            SettingsFragment

final class _cls2
    implements android.view.
{

    public final void onClick(View view)
    {
        view = new nr();
        ns ns1 = new ns();
        view.mListener = new np.a(ns1) {

            private np a;

            public final void a(np np1)
            {
            }

            public final void a(np np1, List list, boolean flag)
            {
                a.a(null);
            }

            public final void b(np np1)
            {
            }

            public final void b(np np1, List list, boolean flag)
            {
            }

            
            {
                a = np1;
                super();
            }
        };
        ns1.mListener = new np.a() {

            public final void a(np np1)
            {
            }

            public final void a(np np1, List list, boolean flag)
            {
                Mf.a().a(new Oi(LeftSwipeContentFragment.CASH_SETTINGS_FRAGMENT));
            }

            public final void b(np np1)
            {
            }

            public final void b(np np1, List list, boolean flag)
            {
            }

        };
        view.a(null);
    }

    _cls2()
    {
    }
}

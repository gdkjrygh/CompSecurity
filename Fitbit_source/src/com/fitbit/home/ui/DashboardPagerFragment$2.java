// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import com.fitbit.e.a;
import com.fitbit.onboarding.whatsnew.NewFeatureDialogFragment;
import com.fitbit.savedstate.q;
import java.util.ArrayList;

// Referenced classes of package com.fitbit.home.ui:
//            DashboardPagerFragment

class a
    implements android.view.ent._cls2
{

    final ViewGroup a;
    final DashboardPagerFragment b;

    public void onClick(View view)
    {
        if (com.fitbit.home.ui.DashboardPagerFragment.a(b).isEmpty())
        {
            a.setVisibility(8);
            com.fitbit.e.a.f(DashboardPagerFragment.f(), "There were no PanelContent items to display", new Object[0]);
            return;
        }
        view = b.getChildFragmentManager().beginTransaction();
        android.support.v4.app.Fragment fragment = b.getChildFragmentManager().findFragmentByTag("whats_new_dialog");
        if (fragment != null)
        {
            view.remove(fragment);
        }
        view.addToBackStack(null);
        NewFeatureDialogFragment.a(com.fitbit.home.ui.DashboardPagerFragment.a(b)).show(view, "whats_new_dialog");
        a.setVisibility(8);
        q.b("INTRODUCTION_OF_SLEEP_GOALS");
    }

    logFragment(DashboardPagerFragment dashboardpagerfragment, ViewGroup viewgroup)
    {
        b = dashboardpagerfragment;
        a = viewgroup;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;
import android.widget.ListView;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerFragment

final class this._cls0 extends ActionBarDrawerToggle
{

    final NavDrawerFragment this$0;

    public final void onDrawerClosed(View view)
    {
        if (NavDrawerFragment.access$100(NavDrawerFragment.this) != null)
        {
            NavDrawerFragment.access$200(NavDrawerFragment.this, NavDrawerFragment.access$100(NavDrawerFragment.this));
            NavDrawerFragment.access$102(NavDrawerFragment.this, null);
        }
        NavDrawerFragment.access$300(NavDrawerFragment.this).setNavigationMode(0);
        NavDrawerFragment.access$500(NavDrawerFragment.this).setAdapter(NavDrawerFragment.access$400(NavDrawerFragment.this));
        NavDrawerFragment.access$600(NavDrawerFragment.this);
    }

    public final void onDrawerOpened(View view)
    {
        view = getActivity().getCurrentFocus();
        if (view != null)
        {
            Views.hideSoftKeyboard(getActivity(), view);
            view.clearFocus();
        }
    }

    ountNavigationView(Activity activity, DrawerLayout drawerlayout, int i, int j)
    {
        this$0 = NavDrawerFragment.this;
        super(activity, drawerlayout, i, j);
    }
}

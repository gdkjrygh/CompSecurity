// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import android.widget.ListView;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerFragment

final class this._cls0
    implements com.google.android.gms.people.accountswitcherview.ationView.NavigationModeChangeListener
{

    final NavDrawerFragment this$0;

    public final void onNavigationModeChange(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        switch (selectedaccountnavigationview.getNavigationMode())
        {
        default:
            return;

        case 1: // '\001'
            NavDrawerFragment.access$500(NavDrawerFragment.this).setAdapter(NavDrawerFragment.access$800(NavDrawerFragment.this));
            return;

        case 0: // '\0'
            NavDrawerFragment.access$500(NavDrawerFragment.this).setAdapter(NavDrawerFragment.access$400(NavDrawerFragment.this));
            NavDrawerFragment.access$600(NavDrawerFragment.this);
            return;
        }
    }

    ountNavigationView()
    {
        this$0 = NavDrawerFragment.this;
        super();
    }
}

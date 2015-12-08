// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.gms.people.accountswitcherview.OwnersListAdapter;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerFragment

final class this._cls0
    implements android.widget.ickListener
{

    final NavDrawerFragment this$0;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        i--;
        NavDrawerFragment.access$300(NavDrawerFragment.this).getNavigationMode();
        JVM INSTR tableswitch 1 1: default 32
    //                   1 33;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (NavDrawerFragment.access$800(NavDrawerFragment.this).getItemViewType(i) == 0)
        {
            adapterview = NavDrawerFragment.access$800(NavDrawerFragment.this).getItem(i);
            NavDrawerFragment.access$300(NavDrawerFragment.this).bind(adapterview);
            NavDrawerFragment.access$700(NavDrawerFragment.this, adapterview);
            return;
        }
        if (NavDrawerFragment.access$800(NavDrawerFragment.this).getItemViewType(i) == 1)
        {
            analyticsUtil.sendListItemTap("AddAccount", new AnalyticsCustomDimension[0]);
            adapterview = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
            adapterview.putExtra("account_types", new String[] {
                "com.google"
            });
            startActivityForResult(adapterview, 9002);
            return;
        }
        if (NavDrawerFragment.access$800(NavDrawerFragment.this).getItemViewType(i) == 2)
        {
            adapterview = new Intent("android.settings.SYNC_SETTINGS");
            adapterview.putExtra("settings", new String[] {
                "google"
            });
            startActivityForResult(adapterview, 9003);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    sion()
    {
        this$0 = NavDrawerFragment.this;
        super();
    }
}

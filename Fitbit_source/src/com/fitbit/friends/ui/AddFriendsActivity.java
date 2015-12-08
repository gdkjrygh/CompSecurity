// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.fitbit.analytics.core.a;
import com.fitbit.ui.FitbitActivity;

// Referenced classes of package com.fitbit.friends.ui:
//            AddFriendsActivity_, FindFriendsFragment

public class AddFriendsActivity extends FitbitActivity
{

    private static final String a = "AddFriendsActivity.MAIN_FRAGMENT_TAG";

    public AddFriendsActivity()
    {
    }

    public static void a(Context context)
    {
        AddFriendsActivity_.b(context).b();
    }

    public FindFriendsFragment c()
    {
        return (FindFriendsFragment)getSupportFragmentManager().findFragmentByTag("AddFriendsActivity.MAIN_FRAGMENT_TAG");
    }

    public void onBackPressed()
    {
        if (!c().k())
        {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getSupportFragmentManager();
        FragmentTransaction fragmenttransaction = bundle.beginTransaction();
        fragmenttransaction.replace(0x7f110415, FindFriendsFragment.g(), "AddFriendsActivity.MAIN_FRAGMENT_TAG");
        fragmenttransaction.setTransition(4099);
        fragmenttransaction.commitAllowingStateLoss();
        bundle.executePendingTransactions();
    }

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.z);
    }
}

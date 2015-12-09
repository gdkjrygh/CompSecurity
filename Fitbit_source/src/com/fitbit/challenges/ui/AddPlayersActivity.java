// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import com.fitbit.data.domain.challenges.ChallengeType;
import com.fitbit.ui.FitbitActivity;
import java.util.ArrayList;
import java.util.Date;

// Referenced classes of package com.fitbit.challenges.ui:
//            AddPlayersActivity_, AddPlayersFragment

public class AddPlayersActivity extends FitbitActivity
{

    protected String a;
    protected ChallengeType b;
    protected ArrayList c;
    protected ArrayList d;
    protected int e;
    protected int f;
    protected Date g;

    public AddPlayersActivity()
    {
    }

    public static Intent a(Context context, ChallengeType challengetype, Date date)
    {
        return AddPlayersActivity_.a(context).a(challengetype).a(date).a();
    }

    public static Intent a(Context context, String s, ArrayList arraylist, ArrayList arraylist1, int i, int j)
    {
        return AddPlayersActivity_.a(context).a(s).a(arraylist).b(arraylist1).d(i).c(j).a();
    }

    protected void m_()
    {
        invalidateOptionsMenu();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        FragmentManager fragmentmanager = getSupportFragmentManager();
        FragmentTransaction fragmenttransaction = fragmentmanager.beginTransaction();
        if (b != null)
        {
            bundle = AddPlayersFragment.a(b, g);
        } else
        {
            bundle = AddPlayersFragment.a(a, d, c, e, f);
        }
        fragmenttransaction.replace(0x7f110415, bundle);
        fragmenttransaction.setTransition(4099);
        fragmenttransaction.commit();
        fragmentmanager.executePendingTransactions();
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(false);
    }

    protected void t_()
    {
        invalidateOptionsMenu();
    }
}

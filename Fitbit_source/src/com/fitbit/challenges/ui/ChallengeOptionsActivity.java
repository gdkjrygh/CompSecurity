// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.fitbit.ui.FitbitActivity;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengeOptionsActivity_, ChallengeOptionsFragment

public class ChallengeOptionsActivity extends FitbitActivity
{

    String a;

    public ChallengeOptionsActivity()
    {
    }

    public static void a(Context context, String s)
    {
        ChallengeOptionsActivity_.a(context).a(s).b();
    }

    public static void a(Context context, String s, int i)
    {
        ChallengeOptionsActivity_.a(context).a(s).b(i);
    }

    public static void a(Context context, String s, int i, int j)
    {
        ChallengeOptionsActivity_.a(context).a(i).a(s).b(j);
    }

    public static void a(Fragment fragment, String s, int i)
    {
        ChallengeOptionsActivity_.a(fragment).a(s).b(i);
    }

    public static void a(Fragment fragment, String s, int i, int j)
    {
        ChallengeOptionsActivity_.a(fragment).a(i).a(s).b(j);
    }

    public static void b(Context context, String s, int i)
    {
        ChallengeOptionsActivity_.a(context).a(i).a(s).b();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getSupportFragmentManager();
        FragmentTransaction fragmenttransaction = bundle.beginTransaction();
        ChallengeOptionsFragment challengeoptionsfragment = ChallengeOptionsFragment.a();
        challengeoptionsfragment.e = a;
        fragmenttransaction.replace(0x7f110415, challengeoptionsfragment);
        fragmenttransaction.setTransition(4099);
        fragmenttransaction.commitAllowingStateLoss();
        bundle.executePendingTransactions();
    }
}

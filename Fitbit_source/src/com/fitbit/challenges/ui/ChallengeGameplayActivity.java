// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.fitbit.ui.FitbitActivity;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengeGameplayActivity_, ChallengeGameplayFragment

public class ChallengeGameplayActivity extends FitbitActivity
{

    String a;
    String b;
    String c;

    public ChallengeGameplayActivity()
    {
    }

    public static void a(Context context, String s, String s1, String s2)
    {
        if (s != null)
        {
            ChallengeGameplayActivity_.a(context).a(s).b();
            return;
        }
        if (s1 != null)
        {
            ChallengeGameplayActivity_.a(context).b(s1).b();
            return;
        } else
        {
            ChallengeGameplayActivity_.a(context).c(s2).b();
            return;
        }
    }

    public static void a(Context context, String s, String s1, String s2, int i)
    {
        if (s != null)
        {
            ChallengeGameplayActivity_.a(context).a(i).a(s).b();
            return;
        }
        if (s1 != null)
        {
            ChallengeGameplayActivity_.a(context).a(i).b(s1).b();
            return;
        } else
        {
            ChallengeGameplayActivity_.a(context).a(i).c(s2).b();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getSupportFragmentManager();
        FragmentTransaction fragmenttransaction = bundle.beginTransaction();
        fragmenttransaction.replace(0x7f110415, ChallengeGameplayFragment.a(c, a, b));
        fragmenttransaction.setTransition(4099);
        fragmenttransaction.commitAllowingStateLoss();
        bundle.executePendingTransactions();
    }
}

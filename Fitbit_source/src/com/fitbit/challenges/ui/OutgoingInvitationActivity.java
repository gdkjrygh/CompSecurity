// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.fitbit.analytics.core.a;
import com.fitbit.data.domain.challenges.Challenge;
import com.fitbit.ui.FitbitActivity;

// Referenced classes of package com.fitbit.challenges.ui:
//            OutgoingInvitationFragment

public class OutgoingInvitationActivity extends FitbitActivity
{

    private static final String d = "challenge_type";
    private static final String e = "challenge";
    private static final String f = "source";
    Challenge a;
    String b;
    com.fitbit.data.bl.ChallengesUtils.RematchSource c;

    public OutgoingInvitationActivity()
    {
    }

    public static Intent a(Context context, Challenge challenge, com.fitbit.data.bl.ChallengesUtils.RematchSource rematchsource)
    {
        return (new Intent(context, com/fitbit/challenges/ui/OutgoingInvitationActivity)).putExtra("source", rematchsource).putExtra("challenge_type", challenge.w()).putExtra("challenge", challenge);
    }

    public static Intent a(Context context, String s)
    {
        return (new Intent(context, com/fitbit/challenges/ui/OutgoingInvitationActivity)).putExtra("challenge_type", s);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04016c);
        b = getIntent().getStringExtra("challenge_type");
        a = (Challenge)getIntent().getParcelableExtra("challenge");
        c = (com.fitbit.data.bl.ChallengesUtils.RematchSource)getIntent().getSerializableExtra("source");
        bundle = getSupportFragmentManager();
        FragmentTransaction fragmenttransaction = bundle.beginTransaction();
        fragmenttransaction.replace(0x7f110415, com.fitbit.challenges.ui.OutgoingInvitationFragment.a(a, b, c));
        fragmenttransaction.setTransition(4099);
        fragmenttransaction.commitAllowingStateLoss();
        bundle.executePendingTransactions();
    }

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.w);
    }
}

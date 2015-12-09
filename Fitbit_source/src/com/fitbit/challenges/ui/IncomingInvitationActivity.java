// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.fitbit.ui.FitbitActivity;

// Referenced classes of package com.fitbit.challenges.ui:
//            IncomingInvitationActivity_, IncomingInvitationFragment_

public class IncomingInvitationActivity extends FitbitActivity
{

    String a;

    public IncomingInvitationActivity()
    {
    }

    public static Intent a(Context context, String s)
    {
        return IncomingInvitationActivity_.a(context).a(s).a();
    }

    public static Intent a(Context context, String s, int i)
    {
        return IncomingInvitationActivity_.a(context).a(0x4000000 | i).a(s).a();
    }

    public static void b(Context context, String s)
    {
        IncomingInvitationActivity_.a(context).a(0x4000000).a(s).b();
    }

    public static void b(Context context, String s, int i)
    {
        IncomingInvitationActivity_.a(context).a(0x4000000 | i).a(s).b();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getSupportFragmentManager();
        FragmentTransaction fragmenttransaction = bundle.beginTransaction();
        fragmenttransaction.replace(0x7f110415, IncomingInvitationFragment_.l().a(a).a());
        fragmenttransaction.setTransition(4099);
        fragmenttransaction.commitAllowingStateLoss();
        bundle.executePendingTransactions();
    }
}

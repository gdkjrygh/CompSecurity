// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengeActivity

class a
    implements android.support.v4.app.ckStackChangedListener
{

    final ChallengeActivity a;

    public void onBackStackChanged()
    {
        if (a.getSupportFragmentManager().getBackStackEntryCount() > 0)
        {
            a.getSupportActionBar().hide();
            return;
        } else
        {
            a.getSupportActionBar().show();
            a.getSupportFragmentManager().removeOnBackStackChangedListener(this);
            return;
        }
    }

    StackChangedListener(ChallengeActivity challengeactivity)
    {
        a = challengeactivity;
        super();
    }
}

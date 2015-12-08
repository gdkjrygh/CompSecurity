// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.app.Activity;
import android.content.Intent;
import com.fitbit.e.a;
import com.fitbit.util.SimpleConfirmDialogFragment;

// Referenced classes of package com.fitbit.data.bl:
//            ChallengesUtils

static final class c
    implements com.fitbit.util.gFragment.a
{

    final agment a;
    final Activity b;
    final Intent c;

    public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        com.fitbit.e.a.a("ChallengesUtils", "onPositive", new Object[0]);
        if (a != null)
        {
            a.a();
        }
        if (b != null)
        {
            b.startActivity(c);
        }
    }

    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        com.fitbit.e.a.a("ChallengesUtils", "onNegative", new Object[0]);
        if (a != null)
        {
            a.b();
        }
    }

    public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    agment(agment agment, Activity activity, Intent intent)
    {
        a = agment;
        b = activity;
        c = intent;
        super();
    }
}

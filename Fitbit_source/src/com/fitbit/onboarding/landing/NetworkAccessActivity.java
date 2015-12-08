// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.landing;

import android.app.Activity;
import android.widget.TextView;
import com.fitbit.savedstate.ServerSavedState;
import com.fitbit.util.a.a;

// Referenced classes of package com.fitbit.onboarding.landing:
//            ConfirmationActivity, NetworkAccessActivity_

public class NetworkAccessActivity extends ConfirmationActivity
{

    protected TextView b;

    public NetworkAccessActivity()
    {
    }

    public static void b(Activity activity, int i)
    {
        com.fitbit.onboarding.landing.NetworkAccessActivity_.a(activity).b(i);
        a.a(activity);
    }

    protected void d()
    {
        super.d();
        b.setText(0x7f0800e8);
    }

    protected void g()
    {
        ServerSavedState.m();
        super.g();
    }

    protected com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope h()
    {
        return com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.b;
    }
}

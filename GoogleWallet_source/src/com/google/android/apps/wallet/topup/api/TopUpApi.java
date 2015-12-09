// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.topup.api;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.api.InternalIntents;

public final class TopUpApi
{

    public static Intent createFeeInfoActivityIntent(Context context, int i)
    {
        boolean flag = true;
        context = InternalIntents.forClass(context, "com.google.android.apps.wallet.topup.FeeInfoActivity");
        if (i != 1)
        {
            flag = false;
        }
        return context.putExtra("mode_is_p2p", flag);
    }

    public static Intent createTopUpActivityIntent(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.topup.TopUpActivity");
    }
}

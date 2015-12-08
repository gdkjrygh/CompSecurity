// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.reset.api;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.api.InternalIntents;

public final class ResetApi
{

    public static Intent createResetIntent(Context context, String s)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.reset.ResetService").putExtra("ACCOUNT_NAME", s);
    }
}

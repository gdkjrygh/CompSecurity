// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.account.refresh.receiver;

import android.content.Context;
import android.content.Intent;
import ez;

// Referenced classes of package com.google.android.libraries.social.account.refresh.receiver:
//            AccountsChangedService

public final class AccountsChangedReceiver extends ez
{

    public AccountsChangedReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        a(context, new Intent(context, com/google/android/libraries/social/account/refresh/receiver/AccountsChangedService));
    }
}

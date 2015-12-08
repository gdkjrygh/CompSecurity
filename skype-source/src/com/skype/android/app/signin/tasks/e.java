// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin.tasks;

import android.content.Context;
import android.content.Intent;
import com.skype.Account;
import com.skype.android.push.PushMessageRepository;
import com.skype.android.push.RegisterReceiver;

// Referenced classes of package com.skype.android.app.signin.tasks:
//            AccountTask

final class e
    implements AccountTask
{

    private Context context;
    private PushMessageRepository repository;

    public e(Context context1, PushMessageRepository pushmessagerepository)
    {
        context = context1;
        repository = pushmessagerepository;
    }

    public final void onLogin(Account account)
    {
        account = new Intent(context, com/skype/android/push/RegisterReceiver);
        account.setAction("com.skype.android.push.REGISTER");
        context.sendBroadcast(account);
    }

    public final void onLogout(Account account)
    {
        repository.clear();
    }
}

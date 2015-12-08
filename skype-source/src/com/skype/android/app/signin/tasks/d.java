// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin.tasks;

import android.content.Context;
import com.skype.Account;
import com.skype.android.app.settings.PropertyConverter;
import com.skype.android.app.settings.UserPreferences;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin.tasks:
//            AccountTask

final class d
    implements AccountTask
{

    private Context context;
    private Provider userPrefsProvider;

    public d(Context context1, Provider provider)
    {
        context = context1;
        userPrefsProvider = provider;
    }

    public final void onLogin(Account account)
    {
        UserPreferences userpreferences = (UserPreferences)userPrefsProvider.get();
        if (!userpreferences.havePropertiesBeenConverted())
        {
            PropertyConverter.userPropertiesToPreferences(userpreferences, account.getSkypenameProp(), context);
        }
        userpreferences.setCallTechInfoEnabled(false);
        userpreferences.setPlayMarketRecoverableErrorShowed(false);
    }

    public final void onLogout(Account account)
    {
    }
}

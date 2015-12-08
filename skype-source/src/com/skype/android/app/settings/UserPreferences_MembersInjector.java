// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.os.Vibrator;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.settings:
//            UserPreferences

public final class UserPreferences_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider vibratorProvider;

    public UserPreferences_MembersInjector(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            vibratorProvider = provider;
            return;
        }
    }

    public static MembersInjector create(Provider provider)
    {
        return new UserPreferences_MembersInjector(provider);
    }

    public static void injectVibrator(UserPreferences userpreferences, Provider provider)
    {
        userpreferences.vibrator = (Vibrator)provider.get();
    }

    public final void injectMembers(UserPreferences userpreferences)
    {
        if (userpreferences == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            userpreferences.vibrator = (Vibrator)vibratorProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UserPreferences)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/settings/UserPreferences_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.app.Application;
import android.content.Context;
import com.skype.Account;
import com.skype.android.SkypeApplication;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.util.AccountLifetimeObject;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app:
//            DaggerAgentComponent, AgentComponent

public abstract class Agent extends AccountLifetimeObject
{

    Provider accountProvider;
    private AgentComponent component;
    private Context context;
    private UserPreferences userPrefs;
    Provider userPrefsProvider;

    public Agent(Application application)
    {
        context = application;
    }

    protected Account getAccount()
    {
        return (Account)accountProvider.get();
    }

    public AgentComponent getComponent()
    {
        if (component == null)
        {
            component = DaggerAgentComponent.builder().skypeApplicationComponent(((SkypeApplication)context.getApplicationContext()).a()).build();
        }
        return component;
    }

    protected Context getContext()
    {
        return context;
    }

    protected UserPreferences getUserPreferences()
    {
        if (userPrefs == null)
        {
            userPrefs = (UserPreferences)userPrefsProvider.get();
        }
        return userPrefs;
    }

    public void onLogin()
    {
        userPrefs = null;
    }

    public void onLogout()
    {
        userPrefs = null;
    }
}

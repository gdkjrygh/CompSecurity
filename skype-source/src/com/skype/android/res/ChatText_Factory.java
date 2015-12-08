// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import android.app.Application;
import com.skype.SkyLib;
import com.skype.android.app.NavigationUrl;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.res:
//            ChatText, CountryFlags

public final class ChatText_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider configurationProvider;
    private final Provider contextProvider;
    private final Provider emoticonsProvider;
    private final Provider flagsProvider;
    private final Provider libProvider;
    private final Provider navigationUrlProvider;
    private final Provider timeAnomalyTelemetryProvider;
    private final Provider timeUtilProvider;
    private final Provider userPreferencesProvider;

    public ChatText_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        navigationUrlProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        flagsProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        emoticonsProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        userPreferencesProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        timeUtilProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        } else
        {
            timeAnomalyTelemetryProvider = provider8;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8)
    {
        return new ChatText_Factory(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public final ChatText get()
    {
        return new ChatText((Application)contextProvider.get(), (SkyLib)libProvider.get(), (NavigationUrl)navigationUrlProvider.get(), (CountryFlags)flagsProvider.get(), (MediaContentRoster)emoticonsProvider.get(), (EcsConfiguration)configurationProvider.get(), userPreferencesProvider, (TimeUtil)timeUtilProvider.get(), (TimeAnomalyTelemetry)timeAnomalyTelemetryProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/res/ChatText_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

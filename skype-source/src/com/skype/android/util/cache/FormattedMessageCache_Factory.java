// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.cache;

import android.app.Application;
import com.skype.SkyLib;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.res.ChatText;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.SpanUtil;
import com.skype.android.util.TimeUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.util.cache:
//            SpannedStringCache, FormattedMessageCache

public final class FormattedMessageCache_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider asyncServiceProvider;
    private final Provider cacheProvider;
    private final Provider chatTextProvider;
    private final Provider contactUtilProvider;
    private final Provider contextProvider;
    private final Provider libProvider;
    private final Provider objMapProvider;
    private final Provider spanUtilProvider;
    private final Provider timeAnomalyTelemetryProvider;
    private final Provider timeUtilProvider;

    public FormattedMessageCache_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10)
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
        asyncServiceProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        cacheProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        chatTextProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        timeUtilProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        objMapProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        timeAnomalyTelemetryProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        } else
        {
            spanUtilProvider = provider10;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10)
    {
        return new FormattedMessageCache_Factory(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public final FormattedMessageCache get()
    {
        Application application = (Application)contextProvider.get();
        AsyncService asyncservice = (AsyncService)asyncServiceProvider.get();
        SpannedStringCache spannedstringcache = (SpannedStringCache)cacheProvider.get();
        ChatText chattext = (ChatText)chatTextProvider.get();
        Provider provider = accountProvider;
        SkyLib skylib = (SkyLib)libProvider.get();
        TimeUtil timeutil = (TimeUtil)timeUtilProvider.get();
        ObjectIdMap objectidmap = (ObjectIdMap)objMapProvider.get();
        ContactUtil contactutil = (ContactUtil)contactUtilProvider.get();
        timeAnomalyTelemetryProvider.get();
        return new FormattedMessageCache(application, asyncservice, spannedstringcache, chattext, provider, skylib, timeutil, objectidmap, contactutil, (SpanUtil)spanUtilProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/util/cache/FormattedMessageCache_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

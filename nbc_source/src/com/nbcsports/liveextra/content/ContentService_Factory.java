// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content;

import android.content.Context;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.content:
//            ContentService

public final class ContentService_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider clientProvider;
    private final Provider configurationProvider;
    private final Provider contextProvider;
    private final Provider gsonProvider;
    private final MembersInjector membersInjector;

    public ContentService_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        clientProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        gsonProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            contextProvider = provider3;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new ContentService_Factory(membersinjector, provider, provider1, provider2, provider3);
    }

    public ContentService get()
    {
        ContentService contentservice = new ContentService(configurationProvider, (OkHttpClient)clientProvider.get(), (Gson)gsonProvider.get(), (Context)contextProvider.get());
        membersInjector.injectMembers(contentservice);
        return contentservice;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/content/ContentService_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

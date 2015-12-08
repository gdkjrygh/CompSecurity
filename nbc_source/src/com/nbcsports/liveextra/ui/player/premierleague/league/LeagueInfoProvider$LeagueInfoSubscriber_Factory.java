// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.league;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class gsonProvider
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider clientProvider;
    private final Provider gsonProvider;
    private final MembersInjector membersInjector;

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1)
    {
        return new <init>(membersinjector, provider, provider1);
    }

    public <init> get()
    {
        <init> <init>1 = new <init>((OkHttpClient)clientProvider.get(), (Gson)gsonProvider.get());
        membersInjector.injectMembers(<init>1);
        return <init>1;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/premierleague/league/LeagueInfoProvider$LeagueInfoSubscriber_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    public (MembersInjector membersinjector, Provider provider, Provider provider1)
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
        clientProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            gsonProvider = provider1;
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.services;

import com.nbcsports.liveextra.content.FavoriteService;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.phunware.nbc.sochi.services:
//            FavoriteReminderService

public final class FavoriteReminderService_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider favoritesProvider;
    private final MembersInjector supertypeInjector;

    public FavoriteReminderService_MembersInjector(MembersInjector membersinjector, Provider provider)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            favoritesProvider = provider;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider)
    {
        return new FavoriteReminderService_MembersInjector(membersinjector, provider);
    }

    public void injectMembers(FavoriteReminderService favoritereminderservice)
    {
        if (favoritereminderservice == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(favoritereminderservice);
            favoritereminderservice.favorites = (FavoriteService)favoritesProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((FavoriteReminderService)obj);
    }

    static 
    {
        boolean flag;
        if (!com/phunware/nbc/sochi/services/FavoriteReminderService_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

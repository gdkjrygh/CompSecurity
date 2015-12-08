// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.partner;

import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.config.partner:
//            CampaignReceiver

public final class CampaignReceiver_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;

    public CampaignReceiver_MembersInjector(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            accountProvider = provider;
            return;
        }
    }

    public static MembersInjector create(Provider provider)
    {
        return new CampaignReceiver_MembersInjector(provider);
    }

    public static void injectAccountProvider(CampaignReceiver campaignreceiver, Provider provider)
    {
        campaignreceiver.accountProvider = provider;
    }

    public final void injectMembers(CampaignReceiver campaignreceiver)
    {
        if (campaignreceiver == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            campaignreceiver.accountProvider = accountProvider;
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CampaignReceiver)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/config/partner/CampaignReceiver_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

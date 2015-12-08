// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import com.phunware.nbc.sochi.metrics.TrackingHelper;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.phunware.nbc.sochi:
//            FAQActivity

public final class FAQActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final MembersInjector supertypeInjector;
    private final Provider trackingHelperProvider;

    public FAQActivity_MembersInjector(MembersInjector membersinjector, Provider provider)
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
            trackingHelperProvider = provider;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider)
    {
        return new FAQActivity_MembersInjector(membersinjector, provider);
    }

    public void injectMembers(FAQActivity faqactivity)
    {
        if (faqactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(faqactivity);
            faqactivity.trackingHelper = (TrackingHelper)trackingHelperProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((FAQActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/phunware/nbc/sochi/FAQActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

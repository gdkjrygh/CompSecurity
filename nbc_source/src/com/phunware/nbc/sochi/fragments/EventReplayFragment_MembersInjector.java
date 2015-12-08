// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import com.nbcsports.liveextra.ui.main.replay.FullEventReplayListPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            EventReplayFragment

public final class EventReplayFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider presenterProvider;
    private final MembersInjector supertypeInjector;

    public EventReplayFragment_MembersInjector(MembersInjector membersinjector, Provider provider)
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
            presenterProvider = provider;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider)
    {
        return new EventReplayFragment_MembersInjector(membersinjector, provider);
    }

    public void injectMembers(EventReplayFragment eventreplayfragment)
    {
        if (eventreplayfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(eventreplayfragment);
            eventreplayfragment.presenter = (FullEventReplayListPresenter)presenterProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((EventReplayFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/phunware/nbc/sochi/fragments/EventReplayFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

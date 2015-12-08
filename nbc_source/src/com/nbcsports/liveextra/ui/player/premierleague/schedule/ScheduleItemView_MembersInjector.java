// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.schedule;

import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.schedule:
//            ScheduleItemView, ScheduleItemPresenter

public final class ScheduleItemView_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider picassoProvider;
    private final Provider presenterProvider;
    private final MembersInjector supertypeInjector;

    public ScheduleItemView_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        picassoProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            presenterProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1)
    {
        return new ScheduleItemView_MembersInjector(membersinjector, provider, provider1);
    }

    public void injectMembers(ScheduleItemView scheduleitemview)
    {
        if (scheduleitemview == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(scheduleitemview);
            scheduleitemview.picasso = (Picasso)picassoProvider.get();
            scheduleitemview.presenter = (ScheduleItemPresenter)presenterProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ScheduleItemView)obj);
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/premierleague/schedule/ScheduleItemView_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

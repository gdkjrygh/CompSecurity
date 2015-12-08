// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import dagger.a;
import de.greenrobot.event.c;

// Referenced classes of package com.tinder.views:
//            MatchListLayout

public final class MatchListLayout_MembersInjector
    implements a
{

    static final boolean $assertionsDisabled;
    private final a.a.a mEventBusProvider;
    private final a supertypeInjector;

    public MatchListLayout_MembersInjector(a a1, a.a.a a2)
    {
        if (!$assertionsDisabled && a1 == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = a1;
        if (!$assertionsDisabled && a2 == null)
        {
            throw new AssertionError();
        } else
        {
            mEventBusProvider = a2;
            return;
        }
    }

    public static a create(a a1, a.a.a a2)
    {
        return new MatchListLayout_MembersInjector(a1, a2);
    }

    public final void injectMembers(MatchListLayout matchlistlayout)
    {
        if (matchlistlayout == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(matchlistlayout);
            matchlistlayout.mEventBus = (c)mEventBusProvider.a();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MatchListLayout)obj);
    }

    static 
    {
        boolean flag;
        if (!com/tinder/views/MatchListLayout_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

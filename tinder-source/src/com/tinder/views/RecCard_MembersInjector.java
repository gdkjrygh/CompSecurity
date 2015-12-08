// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import com.tinder.managers.ManagerLiveRail;
import com.tinder.managers.ae;
import com.tinder.managers.y;
import dagger.a;

// Referenced classes of package com.tinder.views:
//            RecCard

public final class RecCard_MembersInjector
    implements a
{

    static final boolean $assertionsDisabled;
    private final a.a.a mCrmUtilityProvider;
    private final a.a.a mManagerLiveRailProvider;
    private final a.a.a mManagerPassportProvider;
    private final a.a.a mManagerSharedPrefsProvider;
    private final a supertypeInjector;

    public RecCard_MembersInjector(a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5)
    {
        if (!$assertionsDisabled && a1 == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = a1;
        if (!$assertionsDisabled && a2 == null)
        {
            throw new AssertionError();
        }
        mManagerSharedPrefsProvider = a2;
        if (!$assertionsDisabled && a3 == null)
        {
            throw new AssertionError();
        }
        mManagerLiveRailProvider = a3;
        if (!$assertionsDisabled && a4 == null)
        {
            throw new AssertionError();
        }
        mManagerPassportProvider = a4;
        if (!$assertionsDisabled && a5 == null)
        {
            throw new AssertionError();
        } else
        {
            mCrmUtilityProvider = a5;
            return;
        }
    }

    public static a create(a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5)
    {
        return new RecCard_MembersInjector(a1, a2, a3, a4, a5);
    }

    public final void injectMembers(RecCard reccard)
    {
        if (reccard == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(reccard);
            reccard.mManagerSharedPrefs = (ae)mManagerSharedPrefsProvider.a();
            reccard.mManagerLiveRail = (ManagerLiveRail)mManagerLiveRailProvider.a();
            reccard.mManagerPassport = (y)mManagerPassportProvider.a();
            reccard.mCrmUtility = (com.tinder.d.a)mCrmUtilityProvider.a();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RecCard)obj);
    }

    static 
    {
        boolean flag;
        if (!com/tinder/views/RecCard_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

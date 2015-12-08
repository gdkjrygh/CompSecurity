// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import com.tinder.managers.z;
import dagger.a;

// Referenced classes of package com.tinder.views:
//            LoadingView

public final class LoadingView_MembersInjector
    implements a
{

    static final boolean $assertionsDisabled;
    private final a.a.a mManagerProfileProvider;
    private final a supertypeInjector;

    public LoadingView_MembersInjector(a a1, a.a.a a2)
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
            mManagerProfileProvider = a2;
            return;
        }
    }

    public static a create(a a1, a.a.a a2)
    {
        return new LoadingView_MembersInjector(a1, a2);
    }

    public final void injectMembers(LoadingView loadingview)
    {
        if (loadingview == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(loadingview);
            loadingview.mManagerProfile = (z)mManagerProfileProvider.a();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LoadingView)obj);
    }

    static 
    {
        boolean flag;
        if (!com/tinder/views/LoadingView_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

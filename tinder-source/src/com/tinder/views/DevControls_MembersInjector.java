// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import com.tinder.enums.Environment;
import com.tinder.managers.ManagerLiveRail;
import com.tinder.managers.ae;
import com.tinder.managers.d;
import dagger.a;

// Referenced classes of package com.tinder.views:
//            DevControls

public final class DevControls_MembersInjector
    implements a
{

    static final boolean $assertionsDisabled;
    private final a.a.a mAppcontextProvider;
    private final a.a.a mEnviromentProvider;
    private final a.a.a mManagerAuthProvider;
    private final a.a.a mManagerLiveRailProvider;
    private final a.a.a mManagerPrefsProvider;
    private final a supertypeInjector;

    public DevControls_MembersInjector(a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5, a.a.a a6)
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
        mManagerLiveRailProvider = a2;
        if (!$assertionsDisabled && a3 == null)
        {
            throw new AssertionError();
        }
        mManagerAuthProvider = a3;
        if (!$assertionsDisabled && a4 == null)
        {
            throw new AssertionError();
        }
        mManagerPrefsProvider = a4;
        if (!$assertionsDisabled && a5 == null)
        {
            throw new AssertionError();
        }
        mEnviromentProvider = a5;
        if (!$assertionsDisabled && a6 == null)
        {
            throw new AssertionError();
        } else
        {
            mAppcontextProvider = a6;
            return;
        }
    }

    public static a create(a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5, a.a.a a6)
    {
        return new DevControls_MembersInjector(a1, a2, a3, a4, a5, a6);
    }

    public final void injectMembers(DevControls devcontrols)
    {
        if (devcontrols == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(devcontrols);
            devcontrols.mManagerLiveRail = (ManagerLiveRail)mManagerLiveRailProvider.a();
            devcontrols.mManagerAuth = (d)mManagerAuthProvider.a();
            devcontrols.mManagerPrefs = (ae)mManagerPrefsProvider.a();
            devcontrols.mEnviroment = (Environment)mEnviromentProvider.a();
            devcontrols.mAppcontext = (Context)mAppcontextProvider.a();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((DevControls)obj);
    }

    static 
    {
        boolean flag;
        if (!com/tinder/views/DevControls_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

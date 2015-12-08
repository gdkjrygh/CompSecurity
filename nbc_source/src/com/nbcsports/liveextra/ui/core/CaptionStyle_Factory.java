// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.core;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.core:
//            CaptionStyle

public final class CaptionStyle_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;
    private final MembersInjector membersInjector;
    private final Provider preferencesProvider;

    public CaptionStyle_Factory(MembersInjector membersinjector, Provider provider, Provider provider1)
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
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            preferencesProvider = provider1;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1)
    {
        return new CaptionStyle_Factory(membersinjector, provider, provider1);
    }

    public CaptionStyle get()
    {
        CaptionStyle captionstyle = new CaptionStyle((Application)contextProvider.get(), (SharedPreferences)preferencesProvider.get());
        membersInjector.injectMembers(captionstyle);
        return captionstyle;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/core/CaptionStyle_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

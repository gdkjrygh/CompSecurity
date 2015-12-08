// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            SectionSelector

public final class SectionSelector_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider baseProvider;
    private final MembersInjector membersInjector;

    public SectionSelector_Factory(MembersInjector membersinjector, Provider provider)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            baseProvider = provider;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider)
    {
        return new SectionSelector_Factory(membersinjector, provider);
    }

    public SectionSelector get()
    {
        SectionSelector sectionselector = new SectionSelector((Context)baseProvider.get());
        membersInjector.injectMembers(sectionselector);
        return sectionselector;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/main/core/SectionSelector_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

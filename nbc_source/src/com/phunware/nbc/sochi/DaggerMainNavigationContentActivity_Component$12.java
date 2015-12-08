// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.library.tve.MvpdLookups;
import dagger.internal.Factory;

// Referenced classes of package com.phunware.nbc.sochi:
//            DaggerMainNavigationContentActivity_Component

class val.builder
    implements Factory
{

    private final ApplicationComponent applicationComponent;
    final DaggerMainNavigationContentActivity_Component this$0;
    final lder val$builder;

    public MvpdLookups get()
    {
        MvpdLookups mvpdlookups = applicationComponent.lookups();
        if (mvpdlookups == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return mvpdlookups;
        }
    }

    public volatile Object get()
    {
        return get();
    }

    lder()
    {
        this$0 = final_daggermainnavigationcontentactivity_component;
        val$builder = lder.this;
        super();
        applicationComponent = lder.access._mth100(val$builder);
    }
}

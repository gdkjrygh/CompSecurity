// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import com.nbcsports.liveextra.ApplicationComponent;
import dagger.internal.Factory;

// Referenced classes of package com.phunware.nbc.sochi:
//            DaggerMainNavigationContentActivity_Component

class val.builder
    implements Factory
{

    private final ApplicationComponent applicationComponent;
    final DaggerMainNavigationContentActivity_Component this$0;
    final lder val$builder;

    public com.nbcsports.liveextra.library.tve._cls00 get()
    {
        com.nbcsports.liveextra.library.tve._cls00 _lcls00 = applicationComponent.anvato();
        if (_lcls00 == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return _lcls00;
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

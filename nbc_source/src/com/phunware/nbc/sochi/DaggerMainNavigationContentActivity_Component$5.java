// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.content.FavoriteService;
import dagger.internal.Factory;

// Referenced classes of package com.phunware.nbc.sochi:
//            DaggerMainNavigationContentActivity_Component

class val.builder
    implements Factory
{

    private final ApplicationComponent applicationComponent;
    final DaggerMainNavigationContentActivity_Component this$0;
    final ilder val$builder;

    public FavoriteService get()
    {
        FavoriteService favoriteservice = applicationComponent.favorites();
        if (favoriteservice == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return favoriteservice;
        }
    }

    public volatile Object get()
    {
        return get();
    }

    ilder()
    {
        this$0 = final_daggermainnavigationcontentactivity_component;
        val$builder = ilder.this;
        super();
        applicationComponent = ilder.access._mth100(val$builder);
    }
}

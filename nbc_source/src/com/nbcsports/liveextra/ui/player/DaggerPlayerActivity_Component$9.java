// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.google.gson.Gson;
import com.nbcsports.liveextra.ApplicationComponent;
import dagger.internal.Factory;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            DaggerPlayerActivity_Component

class val.builder
    implements Factory
{

    private final ApplicationComponent applicationComponent;
    final DaggerPlayerActivity_Component this$0;
    final ilder val$builder;

    public Gson get()
    {
        Gson gson = applicationComponent.gson();
        if (gson == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return gson;
        }
    }

    public volatile Object get()
    {
        return get();
    }

    ilder()
    {
        this$0 = final_daggerplayeractivity_component;
        val$builder = ilder.this;
        super();
        applicationComponent = ilder.access._mth100(val$builder);
    }
}

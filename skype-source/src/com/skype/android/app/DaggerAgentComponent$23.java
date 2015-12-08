// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.app.Application;
import com.skype.android.SkypeApplicationComponent;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android.app:
//            DaggerAgentComponent

final class val.builder
    implements Factory
{

    private final SkypeApplicationComponent skypeApplicationComponent;
    final DaggerAgentComponent this$0;
    final lder val$builder;

    public final Application get()
    {
        Application application = skypeApplicationComponent.application();
        if (application == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return application;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    lder()
    {
        this$0 = final_daggeragentcomponent;
        val$builder = lder.this;
        super();
        skypeApplicationComponent = lder.access._mth100(val$builder);
    }
}

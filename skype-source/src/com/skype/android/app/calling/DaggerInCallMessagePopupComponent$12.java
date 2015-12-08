// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.android.SkypeApplicationComponent;
import com.skype.android.config.ecs.EcsConfiguration;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android.app.calling:
//            DaggerInCallMessagePopupComponent

final class val.builder
    implements Factory
{

    private final SkypeApplicationComponent skypeApplicationComponent;
    final DaggerInCallMessagePopupComponent this$0;
    final lder val$builder;

    public final EcsConfiguration get()
    {
        EcsConfiguration ecsconfiguration = skypeApplicationComponent.ecsConfiguration();
        if (ecsconfiguration == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return ecsconfiguration;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    lder()
    {
        this$0 = final_daggerincallmessagepopupcomponent;
        val$builder = lder.this;
        super();
        skypeApplicationComponent = lder.access._mth100(val$builder);
    }
}

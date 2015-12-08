// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.view.LayoutInflater;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android.inject:
//            ActivityModule

public final class ActivityModule_LayoutInflaterFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final ActivityModule module;

    public ActivityModule_LayoutInflaterFactory(ActivityModule activitymodule)
    {
        if (!$assertionsDisabled && activitymodule == null)
        {
            throw new AssertionError();
        } else
        {
            module = activitymodule;
            return;
        }
    }

    public static Factory create(ActivityModule activitymodule)
    {
        return new ActivityModule_LayoutInflaterFactory(activitymodule);
    }

    public final LayoutInflater get()
    {
        LayoutInflater layoutinflater = module.layoutInflater();
        if (layoutinflater == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return layoutinflater;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/inject/ActivityModule_LayoutInflaterFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.inject;

import android.app.Activity;
import dagger.Factory;

// Referenced classes of package com.google.android.apps.common.inject:
//            ActivityModule

public final class 
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final ActivityModule module;

    private Activity get()
    {
        Activity activity = module.getActivity();
        if (activity == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return activity;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/google/android/apps/common/inject/ActivityModule$$GetActivityFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

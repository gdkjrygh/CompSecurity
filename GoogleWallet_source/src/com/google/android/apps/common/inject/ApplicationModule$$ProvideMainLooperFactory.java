// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.inject;

import android.os.Looper;
import dagger.Factory;

// Referenced classes of package com.google.android.apps.common.inject:
//            ApplicationModule

public final class 
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final ApplicationModule module;

    private Looper get()
    {
        Object obj = module;
        obj = ApplicationModule.provideMainLooper();
        if (obj == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return ((Looper) (obj));
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/google/android/apps/common/inject/ApplicationModule$$ProvideMainLooperFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

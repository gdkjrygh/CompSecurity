// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.inject;

import android.content.ClipboardManager;
import android.content.Context;
import dagger.Factory;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.common.inject:
//            SystemServiceModule

public final class 
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;
    private final SystemServiceModule module;

    private ClipboardManager get()
    {
        Object obj = module;
        obj = SystemServiceModule.provideClipboardManager((Context)contextProvider.get());
        if (obj == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return ((ClipboardManager) (obj));
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/google/android/apps/common/inject/SystemServiceModule$$ProvideClipboardManagerFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

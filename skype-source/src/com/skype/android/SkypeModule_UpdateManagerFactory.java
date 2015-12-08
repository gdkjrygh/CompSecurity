// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.update.UpdateManager;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android:
//            SkypeModule

public final class SkypeModule_UpdateManagerFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final SkypeModule module;

    public SkypeModule_UpdateManagerFactory(SkypeModule skypemodule)
    {
        if (!$assertionsDisabled && skypemodule == null)
        {
            throw new AssertionError();
        } else
        {
            module = skypemodule;
            return;
        }
    }

    public static Factory create(SkypeModule skypemodule)
    {
        return new SkypeModule_UpdateManagerFactory(skypemodule);
    }

    public final UpdateManager get()
    {
        UpdateManager updatemanager = SkypeModule.f();
        if (updatemanager == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return updatemanager;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/SkypeModule_UpdateManagerFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

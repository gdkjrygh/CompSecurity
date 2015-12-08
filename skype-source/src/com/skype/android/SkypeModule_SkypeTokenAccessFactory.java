// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.app.token.SkypeTokenAccess;
import com.skype.android.app.token.SkypeTokenRequest;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeModule

public final class SkypeModule_SkypeTokenAccessFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final SkypeModule module;
    private final Provider requestProvider;

    public SkypeModule_SkypeTokenAccessFactory(SkypeModule skypemodule, Provider provider)
    {
        if (!$assertionsDisabled && skypemodule == null)
        {
            throw new AssertionError();
        }
        module = skypemodule;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            requestProvider = provider;
            return;
        }
    }

    public static Factory create(SkypeModule skypemodule, Provider provider)
    {
        return new SkypeModule_SkypeTokenAccessFactory(skypemodule, provider);
    }

    public final SkypeTokenAccess get()
    {
        SkypeTokenAccess skypetokenaccess = SkypeModule.a((SkypeTokenRequest)requestProvider.get());
        if (skypetokenaccess == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return skypetokenaccess;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/SkypeModule_SkypeTokenAccessFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

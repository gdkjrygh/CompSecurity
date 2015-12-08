// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.text.TypeFaceFactory;
import com.skype.android.text.TypeFaceTextStyleCallback;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeModule

public final class SkypeModule_TypeFaceStyleCallbackFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final SkypeModule module;
    private final Provider typeFaceFactoryProvider;

    public SkypeModule_TypeFaceStyleCallbackFactory(SkypeModule skypemodule, Provider provider)
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
            typeFaceFactoryProvider = provider;
            return;
        }
    }

    public static Factory create(SkypeModule skypemodule, Provider provider)
    {
        return new SkypeModule_TypeFaceStyleCallbackFactory(skypemodule, provider);
    }

    public final TypeFaceTextStyleCallback get()
    {
        return SkypeModule.a((TypeFaceFactory)typeFaceFactoryProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/SkypeModule_TypeFaceStyleCallbackFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

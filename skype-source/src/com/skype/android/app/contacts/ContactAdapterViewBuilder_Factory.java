// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactAdapterViewBuilder

public final class ContactAdapterViewBuilder_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider contactUtilProvider;
    private final Provider imageCacheProvider;

    public ContactAdapterViewBuilder_Factory(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            accessibilityProvider = provider2;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2)
    {
        return new ContactAdapterViewBuilder_Factory(provider, provider1, provider2);
    }

    public final ContactAdapterViewBuilder get()
    {
        return new ContactAdapterViewBuilder((ContactUtil)contactUtilProvider.get(), (ImageCache)imageCacheProvider.get(), (AccessibilityUtil)accessibilityProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/ContactAdapterViewBuilder_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

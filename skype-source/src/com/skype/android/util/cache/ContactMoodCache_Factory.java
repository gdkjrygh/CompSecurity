// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.cache;

import com.skype.android.concurrent.AsyncService;
import com.skype.android.res.ChatText;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.util.cache:
//            ContactMoodCache, SpannedStringCache

public final class ContactMoodCache_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider asyncProvider;
    private final Provider cacheProvider;
    private final Provider chatTextProvider;

    public ContactMoodCache_Factory(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        cacheProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        chatTextProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            asyncProvider = provider2;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2)
    {
        return new ContactMoodCache_Factory(provider, provider1, provider2);
    }

    public final ContactMoodCache get()
    {
        return new ContactMoodCache((SpannedStringCache)cacheProvider.get(), (ChatText)chatTextProvider.get(), (AsyncService)asyncProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/util/cache/ContactMoodCache_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

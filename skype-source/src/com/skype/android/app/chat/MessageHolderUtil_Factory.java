// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.android.skylib.ObjectIdMap;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            MessageHolderUtil

public final class MessageHolderUtil_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider mapProvider;

    public MessageHolderUtil_Factory(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            mapProvider = provider1;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1)
    {
        return new MessageHolderUtil_Factory(provider, provider1);
    }

    public final MessageHolderUtil get()
    {
        return new MessageHolderUtil(accountProvider, (ObjectIdMap)mapProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/MessageHolderUtil_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

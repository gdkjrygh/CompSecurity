// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.transfer;

import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.transfer:
//            TransferQueue, TransferUtil

public final class TransferQueue_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider transferUtilProvider;

    public TransferQueue_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            transferUtilProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new TransferQueue_Factory(provider);
    }

    public final TransferQueue get()
    {
        return new TransferQueue((TransferUtil)transferUtilProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/transfer/TransferQueue_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

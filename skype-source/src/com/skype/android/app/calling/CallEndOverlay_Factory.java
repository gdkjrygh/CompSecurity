// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.app.Activity;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.calling:
//            b

public final class CallEndOverlay_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider activityProvider;

    public CallEndOverlay_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            activityProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new CallEndOverlay_Factory(provider);
    }

    public final b get()
    {
        return new b((Activity)activityProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/calling/CallEndOverlay_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

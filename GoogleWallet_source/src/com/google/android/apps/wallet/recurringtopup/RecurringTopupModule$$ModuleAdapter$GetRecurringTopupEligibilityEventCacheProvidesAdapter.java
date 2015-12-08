// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import com.google.common.cache.Cache;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            RecurringTopupModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final RecurringTopupModule module;

    public final Cache get()
    {
        RecurringTopupModule recurringtopupmodule = module;
        return RecurringTopupModule.getRecurringTopupEligibilityEventCache();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (RecurringTopupModule recurringtopupmodule)
    {
        super("com.google.common.cache.Cache<java.lang.Object, com.google.android.apps.wallet.recurringtopup.RecurringTopupEligibilityEvent>", false, "com.google.android.apps.wallet.recurringtopup.RecurringTopupModule", "getRecurringTopupEligibilityEventCache");
        module = recurringtopupmodule;
        setLibrary(true);
    }
}

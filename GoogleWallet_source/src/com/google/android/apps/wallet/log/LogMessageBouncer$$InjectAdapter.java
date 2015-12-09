// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import dagger.internal.Binding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.log:
//            LogMessageBouncer

public final class I extends Binding
    implements Provider
{

    public final LogMessageBouncer get()
    {
        return new LogMessageBouncer();
    }

    public final volatile Object get()
    {
        return get();
    }

    public I()
    {
        super("com.google.android.apps.wallet.log.LogMessageBouncer", "members/com.google.android.apps.wallet.log.LogMessageBouncer", false, com/google/android/apps/wallet/log/LogMessageBouncer);
    }
}

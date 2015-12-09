// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.tap.event;

import dagger.internal.Binding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.tap.event:
//            HceEventMessageProcessor

public final class  extends Binding
    implements Provider
{

    public final HceEventMessageProcessor get()
    {
        return new HceEventMessageProcessor();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.google.android.apps.wallet.hce.tap.event.HceEventMessageProcessor", "members/com.google.android.apps.wallet.hce.tap.event.HceEventMessageProcessor", false, com/google/android/apps/wallet/hce/tap/event/HceEventMessageProcessor);
    }
}

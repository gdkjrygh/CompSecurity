// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;

import dagger.internal.Binding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.rpc:
//            MessageNanoPayloadSerializer

public final class  extends Binding
    implements Provider
{

    public final MessageNanoPayloadSerializer get()
    {
        return new MessageNanoPayloadSerializer();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.google.android.apps.wallet.rpc.MessageNanoPayloadSerializer", "members/com.google.android.apps.wallet.rpc.MessageNanoPayloadSerializer", false, com/google/android/apps/wallet/rpc/MessageNanoPayloadSerializer);
    }
}

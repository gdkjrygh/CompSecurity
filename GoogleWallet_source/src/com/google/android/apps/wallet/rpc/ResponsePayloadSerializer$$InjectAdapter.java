// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;

import dagger.internal.Binding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.rpc:
//            ResponsePayloadSerializer

public final class Q extends Binding
    implements Provider
{

    public final ResponsePayloadSerializer get()
    {
        return new ResponsePayloadSerializer();
    }

    public final volatile Object get()
    {
        return get();
    }

    public Q()
    {
        super("com.google.android.apps.wallet.rpc.ResponsePayloadSerializer", "members/com.google.android.apps.wallet.rpc.ResponsePayloadSerializer", false, com/google/android/apps/wallet/rpc/ResponsePayloadSerializer);
    }
}

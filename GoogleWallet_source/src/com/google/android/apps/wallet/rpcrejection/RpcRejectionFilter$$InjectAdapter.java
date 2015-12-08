// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpcrejection;

import android.app.Activity;
import com.google.android.apps.wallet.rpc.ResponseMetadataProcessor;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.rpcrejection:
//            RpcRejectionFilter

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding responseMetadataProcessor;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/rpcrejection/RpcRejectionFilter, getClass().getClassLoader());
        responseMetadataProcessor = linker.requestBinding("com.google.android.apps.wallet.rpc.ResponseMetadataProcessor", com/google/android/apps/wallet/rpcrejection/RpcRejectionFilter, getClass().getClassLoader());
    }

    public final RpcRejectionFilter get()
    {
        return new RpcRejectionFilter((Activity)activity.get(), (ResponseMetadataProcessor)responseMetadataProcessor.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(responseMetadataProcessor);
    }

    public ()
    {
        super("com.google.android.apps.wallet.rpcrejection.RpcRejectionFilter", "members/com.google.android.apps.wallet.rpcrejection.RpcRejectionFilter", false, com/google/android/apps/wallet/rpcrejection/RpcRejectionFilter);
    }
}

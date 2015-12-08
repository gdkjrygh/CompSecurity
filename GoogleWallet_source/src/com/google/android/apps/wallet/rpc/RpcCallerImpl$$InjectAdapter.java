// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;

import android.net.ConnectivityManager;
import com.google.android.apps.wallet.analytics.CsiManager;
import com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil;
import com.google.android.apps.wallet.config.cloudconfig.CloudServiceSpec;
import com.google.common.collect.ImmutableList;
import dagger.Lazy;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.rpc:
//            RpcCallerImpl, ResponsePayloadSerializer, ResponseMetadataProcessor

public final class ec extends Binding
    implements Provider
{

    private Binding accountName;
    private Binding authUtil;
    private Binding connectionFactory;
    private Binding connectivityManager;
    private Binding csi;
    private Binding payloadSerializer;
    private Binding requestMetadataProcessors;
    private Binding responseMetadataProcessor;
    private Binding serviceSpec;
    private Binding userAgent;

    public final void attach(Linker linker)
    {
        connectionFactory = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.http.HttpUrlConnectionFactory>", com/google/android/apps/wallet/rpc/RpcCallerImpl, getClass().getClassLoader());
        authUtil = linker.requestBinding("com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil", com/google/android/apps/wallet/rpc/RpcCallerImpl, getClass().getClassLoader());
        payloadSerializer = linker.requestBinding("com.google.android.apps.wallet.rpc.ResponsePayloadSerializer", com/google/android/apps/wallet/rpc/RpcCallerImpl, getClass().getClassLoader());
        responseMetadataProcessor = linker.requestBinding("com.google.android.apps.wallet.rpc.ResponseMetadataProcessor", com/google/android/apps/wallet/rpc/RpcCallerImpl, getClass().getClassLoader());
        requestMetadataProcessors = linker.requestBinding("com.google.common.collect.ImmutableList<com.google.android.apps.wallet.rpc.RpcRequestMetadataProcessor>", com/google/android/apps/wallet/rpc/RpcCallerImpl, getClass().getClassLoader());
        connectivityManager = linker.requestBinding("android.net.ConnectivityManager", com/google/android/apps/wallet/rpc/RpcCallerImpl, getClass().getClassLoader());
        serviceSpec = linker.requestBinding("com.google.android.apps.wallet.config.cloudconfig.CloudServiceSpec", com/google/android/apps/wallet/rpc/RpcCallerImpl, getClass().getClassLoader());
        accountName = linker.requestBinding("@com.google.android.apps.wallet.userscope.api.BindingAnnotations$AccountName()/java.lang.String", com/google/android/apps/wallet/rpc/RpcCallerImpl, getClass().getClassLoader());
        userAgent = linker.requestBinding("@com.google.android.apps.wallet.http.BindingAnnotations$UserAgent()/java.lang.String", com/google/android/apps/wallet/rpc/RpcCallerImpl, getClass().getClassLoader());
        csi = linker.requestBinding("com.google.android.apps.wallet.analytics.CsiManager", com/google/android/apps/wallet/rpc/RpcCallerImpl, getClass().getClassLoader());
    }

    public final RpcCallerImpl get()
    {
        return new RpcCallerImpl((Lazy)connectionFactory.get(), (WalletGoogleAuthUtil)authUtil.get(), (ResponsePayloadSerializer)payloadSerializer.get(), (ResponseMetadataProcessor)responseMetadataProcessor.get(), (ImmutableList)requestMetadataProcessors.get(), (ConnectivityManager)connectivityManager.get(), (CloudServiceSpec)serviceSpec.get(), (String)accountName.get(), (String)userAgent.get(), (CsiManager)csi.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(connectionFactory);
        set.add(authUtil);
        set.add(payloadSerializer);
        set.add(responseMetadataProcessor);
        set.add(requestMetadataProcessors);
        set.add(connectivityManager);
        set.add(serviceSpec);
        set.add(accountName);
        set.add(userAgent);
        set.add(csi);
    }

    public ec()
    {
        super("com.google.android.apps.wallet.rpc.RpcCallerImpl", "members/com.google.android.apps.wallet.rpc.RpcCallerImpl", false, com/google/android/apps/wallet/rpc/RpcCallerImpl);
    }
}

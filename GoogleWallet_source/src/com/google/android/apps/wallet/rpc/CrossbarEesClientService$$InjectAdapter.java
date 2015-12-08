// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;

import com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil;
import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import com.google.android.apps.wallet.config.cloudconfig.CloudServiceSpec;
import com.google.android.apps.wallet.http.HttpUrlConnectionFactory;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.rpc:
//            CrossbarEesClientService, MessageNanoPayloadSerializer

public final class  extends Binding
    implements Provider
{

    private Binding accountName;
    private Binding authUtil;
    private Binding configurationManager;
    private Binding connectionFactory;
    private Binding payloadSerializer;
    private Binding serviceSpec;
    private Binding userAgent;

    public final void attach(Linker linker)
    {
        authUtil = linker.requestBinding("com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil", com/google/android/apps/wallet/rpc/CrossbarEesClientService, getClass().getClassLoader());
        connectionFactory = linker.requestBinding("com.google.android.apps.wallet.http.HttpUrlConnectionFactory", com/google/android/apps/wallet/rpc/CrossbarEesClientService, getClass().getClassLoader());
        accountName = linker.requestBinding("@com.google.android.apps.wallet.userscope.api.BindingAnnotations$AccountName()/java.lang.String", com/google/android/apps/wallet/rpc/CrossbarEesClientService, getClass().getClassLoader());
        userAgent = linker.requestBinding("@com.google.android.apps.wallet.http.BindingAnnotations$UserAgent()/java.lang.String", com/google/android/apps/wallet/rpc/CrossbarEesClientService, getClass().getClassLoader());
        serviceSpec = linker.requestBinding("com.google.android.apps.wallet.config.cloudconfig.CloudServiceSpec", com/google/android/apps/wallet/rpc/CrossbarEesClientService, getClass().getClassLoader());
        payloadSerializer = linker.requestBinding("com.google.android.apps.wallet.rpc.MessageNanoPayloadSerializer", com/google/android/apps/wallet/rpc/CrossbarEesClientService, getClass().getClassLoader());
        configurationManager = linker.requestBinding("com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager", com/google/android/apps/wallet/rpc/CrossbarEesClientService, getClass().getClassLoader());
    }

    public final CrossbarEesClientService get()
    {
        return new CrossbarEesClientService((WalletGoogleAuthUtil)authUtil.get(), (HttpUrlConnectionFactory)connectionFactory.get(), (String)accountName.get(), (String)userAgent.get(), (CloudServiceSpec)serviceSpec.get(), (MessageNanoPayloadSerializer)payloadSerializer.get(), (CloudConfigurationManager)configurationManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(authUtil);
        set.add(connectionFactory);
        set.add(accountName);
        set.add(userAgent);
        set.add(serviceSpec);
        set.add(payloadSerializer);
        set.add(configurationManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.rpc.CrossbarEesClientService", "members/com.google.android.apps.wallet.rpc.CrossbarEesClientService", false, com/google/android/apps/wallet/rpc/CrossbarEesClientService);
    }
}

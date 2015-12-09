// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.http;

import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.http:
//            HttpUrlConnectionFactory

public final class Q extends Binding
    implements Provider
{

    private Binding client;

    public final void attach(Linker linker)
    {
        client = linker.requestBinding("com.squareup.okhttp.OkHttpClient", com/google/android/apps/wallet/http/HttpUrlConnectionFactory, getClass().getClassLoader());
    }

    public final HttpUrlConnectionFactory get()
    {
        return new HttpUrlConnectionFactory((OkHttpClient)client.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(client);
    }

    public Q()
    {
        super("com.google.android.apps.wallet.http.HttpUrlConnectionFactory", "members/com.google.android.apps.wallet.http.HttpUrlConnectionFactory", true, com/google/android/apps/wallet/http/HttpUrlConnectionFactory);
    }
}

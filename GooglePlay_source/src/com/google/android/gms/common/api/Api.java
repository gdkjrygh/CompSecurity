// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class Api
{
    public static abstract class AbstractClientBuilder
    {

        public abstract Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener);

        public List getImpliedScopes$505be9ea()
        {
            return Collections.emptyList();
        }

        public int getPriority()
        {
            return 0x7fffffff;
        }

        public AbstractClientBuilder()
        {
        }
    }

    public static interface ApiOptions
    {
    }

    public static interface ApiOptions.HasOptions
        extends ApiOptions
    {
    }

    public static interface ApiOptions.NotRequiredOptions
        extends ApiOptions
    {
    }

    public static interface ApiOptions.Optional
        extends ApiOptions.HasOptions, ApiOptions.NotRequiredOptions
    {
    }

    public static interface Client
    {

        public abstract void connect(GoogleApiClient.ConnectionProgressReportCallbacks connectionprogressreportcallbacks);

        public abstract void disconnect();

        public abstract void dump$ec96877(String s, PrintWriter printwriter);

        public abstract void getRemoteService(IAccountAccessor iaccountaccessor, Set set);

        public abstract boolean isConnected();

        public abstract boolean requiresSignIn();

        public abstract void validateAccount(IAccountAccessor iaccountaccessor);
    }

    public static final class ClientKey
    {

        public ClientKey()
        {
        }
    }

    public static interface SimpleClientBuilder
    {
    }

    public static final class SimpleClientKey
    {
    }


    private final AbstractClientBuilder mClientBuilder;
    private final ClientKey mClientKey;
    public final String mName;
    private final SimpleClientBuilder mSimpleClientBuilder = null;
    private final SimpleClientKey mSimpleClientKey = null;

    public Api(String s, AbstractClientBuilder abstractclientbuilder, ClientKey clientkey)
    {
        Preconditions.checkNotNull(abstractclientbuilder, "Cannot construct an Api with a null ClientBuilder");
        Preconditions.checkNotNull(clientkey, "Cannot construct an Api with a null ClientKey");
        mName = s;
        mClientBuilder = abstractclientbuilder;
        mClientKey = clientkey;
    }

    public final AbstractClientBuilder getClientBuilder()
    {
        boolean flag;
        if (mClientBuilder != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return mClientBuilder;
    }

    public final ClientKey getClientKey()
    {
        boolean flag;
        if (mClientKey != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return mClientKey;
    }
}

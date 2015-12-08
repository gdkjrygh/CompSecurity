// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.internal.SignInApiImpl;
import com.google.android.gms.signin.internal.SignInClientImpl;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.signin:
//            SignInApi, SignInOptions

public final class SignIn
{
    public static final class SignInOptionsInternal
        implements com.google.android.gms.common.api.Api.ApiOptions.HasOptions
    {

        final Bundle mSignInOptionsBundle;
    }


    public static final Api API;
    public static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER;
    public static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY;
    public static final Api INTERNAL_API;
    static final com.google.android.gms.common.api.Api.AbstractClientBuilder INTERNAL_CLIENT_BUILDER;
    public static final com.google.android.gms.common.api.Api.ClientKey INTERNAL_CLIENT_KEY;
    public static final Scope SCOPE_EMAIL = new Scope("email");
    public static final Scope SCOPE_PROFILE = new Scope("profile");
    public static final SignInApi SignInApi = new SignInApiImpl();

    static 
    {
        CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();
        INTERNAL_CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();
        CLIENT_BUILDER = new com.google.android.gms.common.api.Api.AbstractClientBuilder() {

            public final volatile com.google.android.gms.common.api.Api.Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                obj = (SignInOptions)obj;
                if (obj == null)
                {
                    obj = SignInOptions.DEFAULT;
                }
                return new SignInClientImpl(context, looper, clientsettings, ((SignInOptions) (obj)), connectioncallbacks, onconnectionfailedlistener, Executors.newSingleThreadExecutor());
            }

        };
        INTERNAL_CLIENT_BUILDER = new com.google.android.gms.common.api.Api.AbstractClientBuilder() {

            public final volatile com.google.android.gms.common.api.Api.Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new SignInClientImpl(context, looper, false, clientsettings, ((SignInOptionsInternal)obj).mSignInOptionsBundle, connectioncallbacks, onconnectionfailedlistener);
            }

        };
        API = new Api("SignIn.API", CLIENT_BUILDER, CLIENT_KEY);
        INTERNAL_API = new Api("SignIn.INTERNAL_API", INTERNAL_CLIENT_BUILDER, INTERNAL_CLIENT_KEY);
    }
}

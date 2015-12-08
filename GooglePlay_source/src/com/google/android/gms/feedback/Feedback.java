// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.feedback.internal.FeedbackClientImpl;

public final class Feedback
{

    public static final Api API;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER;
    private static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY;

    static 
    {
        CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();
        CLIENT_BUILDER = new com.google.android.gms.common.api.Api.AbstractClientBuilder() {

            public final volatile com.google.android.gms.common.api.Api.Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new FeedbackClientImpl(context, looper, connectioncallbacks, onconnectionfailedlistener, clientsettings);
            }

        };
        API = new Api("Feedback.API", CLIENT_BUILDER, CLIENT_KEY);
    }
}

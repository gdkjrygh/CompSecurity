// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.jw;
import com.google.android.gms.internal.kn;
import com.google.android.gms.internal.oz;
import com.google.android.gms.internal.pa;
import com.google.android.gms.internal.pe;

// Referenced classes of package com.google.android.gms.location:
//            FusedLocationProviderApi, GeofencingApi

public final class LocationServices
{
    public static abstract class a extends com.google.android.gms.common.api.BaseImplementation.a
    {

        public a(GoogleApiClient googleapiclient)
        {
            super(LocationServices.lk(), googleapiclient);
        }
    }


    public static final Api API;
    private static final com.google.android.gms.common.api.Api.b CLIENT_BUILDER;
    private static final com.google.android.gms.common.api.Api.c CLIENT_KEY;
    public static FusedLocationProviderApi FusedLocationApi = new oz();
    public static GeofencingApi GeofencingApi = new pa();

    public static pe h(GoogleApiClient googleapiclient)
    {
        boolean flag1 = true;
        boolean flag;
        if (googleapiclient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.b(flag, "GoogleApiClient parameter is required.");
        googleapiclient = (pe)googleapiclient.a(CLIENT_KEY);
        if (googleapiclient != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        kn.a(flag, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    static com.google.android.gms.common.api.Api.c lk()
    {
        return CLIENT_KEY;
    }

    static 
    {
        CLIENT_KEY = new com.google.android.gms.common.api.Api.c();
        CLIENT_BUILDER = new com.google.android.gms.common.api.Api.b() {

            private static pe c$5da91d5b(Context context, Looper looper, jw jw1, com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions notrequiredoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new pe(context, looper, context.getPackageName(), connectioncallbacks, onconnectionfailedlistener, "locationServices", jw1.getAccountName());
            }

            public final com.google.android.gms.common.api.Api.a a$28a3456d(Context context, Looper looper, jw jw1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return c$5da91d5b(context, looper, jw1, (com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public final int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(CLIENT_BUILDER, CLIENT_KEY, new Scope[0]);
    }
}

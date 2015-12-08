// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.nf;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.nk;

// Referenced classes of package com.google.android.gms.location:
//            FusedLocationProviderApi, GeofencingApi

public class LocationServices
{
    public static abstract class a extends com.google.android.gms.common.api.BaseImplementation.a
    {

        public a(GoogleApiClient googleapiclient)
        {
            super(com.google.android.gms.location.LocationServices.nf(), googleapiclient);
        }
    }


    public static final Api API;
    private static final com.google.android.gms.common.api.Api.c DQ;
    private static final com.google.android.gms.common.api.Api.b DR;
    public static FusedLocationProviderApi FusedLocationApi = new nf();
    public static GeofencingApi GeofencingApi = new ng();

    private LocationServices()
    {
    }

    public static nk f(GoogleApiClient googleapiclient)
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
        jx.b(flag, "GoogleApiClient parameter is required.");
        googleapiclient = (nk)googleapiclient.a(DQ);
        if (googleapiclient != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.a(flag, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    static com.google.android.gms.common.api.Api.c nf()
    {
        return DQ;
    }

    static 
    {
        DQ = new com.google.android.gms.common.api.Api.c();
        DR = new com.google.android.gms.common.api.Api.b() {

            public com.google.android.gms.common.api.Api.a a(Context context, Looper looper, jg jg1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return e(context, looper, jg1, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public nk e(Context context, Looper looper, jg jg1, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new nk(context, looper, context.getPackageName(), connectioncallbacks, onconnectionfailedlistener, "locationServices", jg1.getAccountName());
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(DR, DQ, new Scope[0]);
    }
}

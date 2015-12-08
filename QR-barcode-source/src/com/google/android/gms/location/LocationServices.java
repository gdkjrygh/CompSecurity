// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.internal.lu;
import com.google.android.gms.internal.lv;
import com.google.android.gms.internal.lz;

// Referenced classes of package com.google.android.gms.location:
//            FusedLocationProviderApi, GeofencingApi

public class LocationServices
{
    public static abstract class a extends com.google.android.gms.common.api.BaseImplementation.a
    {

        public a()
        {
            super(LocationServices.lU());
        }
    }


    public static final Api API;
    private static final com.google.android.gms.common.api.Api.c CU;
    private static final com.google.android.gms.common.api.Api.b CV;
    public static FusedLocationProviderApi FusedLocationApi = new lu();
    public static GeofencingApi GeofencingApi = new lv();

    private LocationServices()
    {
    }

    public static lz e(GoogleApiClient googleapiclient)
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
        o.b(flag, "GoogleApiClient parameter is required.");
        googleapiclient = (lz)googleapiclient.a(CU);
        if (googleapiclient != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.a(flag, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    static com.google.android.gms.common.api.Api.c lU()
    {
        return CU;
    }

    static 
    {
        CU = new com.google.android.gms.common.api.Api.c();
        CV = new com.google.android.gms.common.api.Api.b() {

            public com.google.android.gms.common.api.Api.a a(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return d(context, looper, clientsettings, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public lz d(Context context, Looper looper, ClientSettings clientsettings, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new lz(context, looper, context.getPackageName(), connectioncallbacks, onconnectionfailedlistener, "locationServices", clientsettings.getAccountName());
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(CV, CU, new Scope[0]);
    }
}

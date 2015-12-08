// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.gz;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.jc;
import com.google.android.gms.internal.jd;
import com.google.android.gms.internal.jh;

// Referenced classes of package com.google.android.gms.location:
//            FusedLocationProviderApi, GeofencingApi

public class LocationServices
{
    public static abstract class a extends com.google.android.gms.common.api.a.b
    {

        public a()
        {
            super(LocationServices.iQ());
        }
    }


    public static final Api API;
    public static FusedLocationProviderApi FusedLocationApi = new jc();
    public static GeofencingApi GeofencingApi = new jd();
    private static final com.google.android.gms.common.api.Api.c yE;
    private static final com.google.android.gms.common.api.Api.b yF;

    private LocationServices()
    {
    }

    public static jh e(GoogleApiClient googleapiclient)
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
        hn.b(flag, "GoogleApiClient parameter is required.");
        googleapiclient = (jh)googleapiclient.a(yE);
        if (googleapiclient != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        hn.a(flag, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    static com.google.android.gms.common.api.Api.c iQ()
    {
        return yE;
    }

    static 
    {
        yE = new com.google.android.gms.common.api.Api.c();
        yF = new com.google.android.gms.common.api.Api.b() {

            public com.google.android.gms.common.api.Api.a a(Context context, Looper looper, gz gz, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return c(context, looper, gz, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public jh c(Context context, Looper looper, gz gz, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new jh(context, looper, connectioncallbacks, onconnectionfailedlistener, "locationServices");
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(yF, yE, new Scope[0]);
    }
}

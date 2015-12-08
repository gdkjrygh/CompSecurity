// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hm;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.jc;
import com.google.android.gms.internal.jg;

// Referenced classes of package com.google.android.gms.location:
//            FusedLocationProviderApi, GeofencingApi

public class LocationServices
{
    public static abstract class a extends com.google.android.gms.common.api.a.b
    {

        public a()
        {
            super(LocationServices.iV());
        }
    }


    public static final Api API;
    public static FusedLocationProviderApi FusedLocationApi = new jb();
    public static GeofencingApi GeofencingApi = new jc();
    private static final com.google.android.gms.common.api.Api.c yH;
    private static final com.google.android.gms.common.api.Api.b yI;

    private LocationServices()
    {
    }

    public static jg e(GoogleApiClient googleapiclient)
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
        hm.b(flag, "GoogleApiClient parameter is required.");
        googleapiclient = (jg)googleapiclient.a(yH);
        if (googleapiclient != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        hm.a(flag, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    static com.google.android.gms.common.api.Api.c iV()
    {
        return yH;
    }

    static 
    {
        yH = new com.google.android.gms.common.api.Api.c();
        yI = new com.google.android.gms.common.api.Api.b() {

            public com.google.android.gms.common.api.Api.a a(Context context, Looper looper, gy gy, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return c(context, looper, gy, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public jg c(Context context, Looper looper, gy gy, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new jg(context, looper, connectioncallbacks, onconnectionfailedlistener, "locationServices");
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(yI, yH, new Scope[0]);
    }
}

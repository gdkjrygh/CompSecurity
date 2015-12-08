// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.lr;
import com.google.android.gms.internal.lz;

// Referenced classes of package com.google.android.gms.location:
//            ActivityRecognitionApi

public class ActivityRecognition
{
    public static abstract class a extends com.google.android.gms.common.api.BaseImplementation.a
    {

        public a()
        {
            super(ActivityRecognition.lU());
        }
    }


    public static final Api API;
    public static ActivityRecognitionApi ActivityRecognitionApi = new lr();
    public static final String CLIENT_NAME = "activity_recognition";
    private static final com.google.android.gms.common.api.Api.c CU;
    private static final com.google.android.gms.common.api.Api.b CV;

    private ActivityRecognition()
    {
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
                return new lz(context, looper, context.getPackageName(), connectioncallbacks, onconnectionfailedlistener, "activity_recognition");
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(CV, CU, new Scope[0]);
    }
}

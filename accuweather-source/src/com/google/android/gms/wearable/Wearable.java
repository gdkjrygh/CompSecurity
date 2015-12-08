// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.gz;
import com.google.android.gms.wearable.internal.ae;
import com.google.android.gms.wearable.internal.ah;
import com.google.android.gms.wearable.internal.au;
import com.google.android.gms.wearable.internal.e;
import com.google.android.gms.wearable.internal.f;

// Referenced classes of package com.google.android.gms.wearable:
//            DataApi, MessageApi, NodeApi, b

public class Wearable
{
    public static final class WearableOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.Optional
    {

        private WearableOptions(Builder builder)
        {
        }

    }

    public static class WearableOptions.Builder
    {

        public WearableOptions build()
        {
            return new WearableOptions(this);
        }

        public WearableOptions.Builder()
        {
        }
    }


    public static final Api API;
    public static final DataApi DataApi = new f();
    public static final MessageApi MessageApi = new ae();
    public static final NodeApi NodeApi = new ah();
    public static final b alm = new e();
    public static final com.google.android.gms.common.api.Api.c yE;
    private static final com.google.android.gms.common.api.Api.b yF;

    private Wearable()
    {
    }

    static 
    {
        yE = new com.google.android.gms.common.api.Api.c();
        yF = new com.google.android.gms.common.api.Api.b() {

            public volatile com.google.android.gms.common.api.Api.a a(Context context, Looper looper, gz gz, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, gz, (WearableOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public au a(Context context, Looper looper, gz gz, WearableOptions wearableoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                if (wearableoptions == null)
                {
                    new WearableOptions(new WearableOptions.Builder());
                }
                return new au(context, looper, connectioncallbacks, onconnectionfailedlistener);
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(yF, yE, new Scope[0]);
    }
}

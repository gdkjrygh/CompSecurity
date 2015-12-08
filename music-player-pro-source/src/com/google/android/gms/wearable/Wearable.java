// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.jg;
import com.google.android.gms.wearable.internal.ah;
import com.google.android.gms.wearable.internal.ak;
import com.google.android.gms.wearable.internal.ay;
import com.google.android.gms.wearable.internal.ba;
import com.google.android.gms.wearable.internal.e;
import com.google.android.gms.wearable.internal.f;

// Referenced classes of package com.google.android.gms.wearable:
//            DataApi, MessageApi, NodeApi, b, 
//            f

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
    public static final com.google.android.gms.common.api.Api.c DQ;
    private static final com.google.android.gms.common.api.Api.b DR;
    public static final DataApi DataApi = new f();
    public static final MessageApi MessageApi = new ah();
    public static final NodeApi NodeApi = new ak();
    public static final b axl = new e();
    public static final com.google.android.gms.wearable.f axm = new ay();

    private Wearable()
    {
    }

    static 
    {
        DQ = new com.google.android.gms.common.api.Api.c();
        DR = new com.google.android.gms.common.api.Api.b() {

            public volatile com.google.android.gms.common.api.Api.a a(Context context, Looper looper, jg jg, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, jg, (WearableOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public ba a(Context context, Looper looper, jg jg, WearableOptions wearableoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                if (wearableoptions == null)
                {
                    new WearableOptions(new WearableOptions.Builder());
                }
                return new ba(context, looper, connectioncallbacks, onconnectionfailedlistener);
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(DR, DQ, new Scope[0]);
    }
}

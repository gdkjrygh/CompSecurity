// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;

// Referenced classes of package com.google.android.gms.internal:
//            fy, ft, fx, gy

public final class ff
{

    public static final com.google.android.gms.common.api.Api.c xI;
    private static final com.google.android.gms.common.api.Api.b xJ;
    public static final Api xK;
    public static final ft xL = new fy();

    static 
    {
        xI = new com.google.android.gms.common.api.Api.c();
        xJ = new com.google.android.gms.common.api.Api.b() {

            public volatile com.google.android.gms.common.api.Api.a a(Context context, Looper looper, gy gy, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, gy, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public fx a(Context context, Looper looper, gy gy, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new fx(context, looper, connectioncallbacks, onconnectionfailedlistener);
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        xK = new Api(xJ, xI, new Scope[0]);
    }
}

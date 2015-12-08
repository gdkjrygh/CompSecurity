// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.nb;

// Referenced classes of package com.google.android.gms.location:
//            ActivityRecognitionApi

public class ActivityRecognition
{

    public static final Api API;
    public static ActivityRecognitionApi ActivityRecognitionApi = new nb();
    public static final String CLIENT_NAME = "activity_recognition";
    private static final com.google.android.gms.common.api.Api.c DQ;
    private static final com.google.android.gms.common.api.Api.b DR;

    private ActivityRecognition()
    {
    }

    static com.google.android.gms.common.api.Api.c nf()
    {
        return DQ;
    }

    static 
    {
        DQ = new com.google.android.gms.common.api.Api.c();
        DR = new _cls1();
        API = new Api(DR, DQ, new Scope[0]);
    }

    private class _cls1
        implements com.google.android.gms.common.api.Api.b
    {

        public final com.google.android.gms.common.api.Api.a a(Context context, Looper looper, jg jg, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return e(context, looper, jg, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
        }

        public final nk e(Context context, Looper looper, jg jg, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return new nk(context, looper, context.getPackageName(), connectioncallbacks, onconnectionfailedlistener, "activity_recognition");
        }

        public final int getPriority()
        {
            return 0x7fffffff;
        }

        _cls1()
        {
        }
    }

}

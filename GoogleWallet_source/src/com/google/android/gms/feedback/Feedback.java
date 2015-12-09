// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.jw;
import com.google.android.gms.internal.mj;

// Referenced classes of package com.google.android.gms.feedback:
//            FeedbackOptions

public final class Feedback
{
    static abstract class a extends com.google.android.gms.common.api.BaseImplementation.a
    {

        private static final Status afR = new Status(13);

        private static Status f(Status status)
        {
            return status;
        }

        public final void N(boolean flag)
        {
            if (flag)
            {
                b(Status.Th);
                return;
            } else
            {
                b(afR);
                return;
            }
        }

        public final Result b(Status status)
        {
            return f(status);
        }


        public a(GoogleApiClient googleapiclient)
        {
            super(Feedback.lk(), googleapiclient);
        }
    }


    public static final String ANONYMOUS = "anonymous";
    public static final Api API;
    private static final com.google.android.gms.common.api.Api.b CLIENT_BUILDER;
    private static final com.google.android.gms.common.api.Api.c CLIENT_KEY;

    static com.google.android.gms.common.api.Api.c lk()
    {
        return CLIENT_KEY;
    }

    public static PendingResult startFeedback(GoogleApiClient googleapiclient, FeedbackOptions feedbackoptions)
    {
        return googleapiclient.a(new a(googleapiclient, feedbackoptions) {

            final FeedbackOptions afP;

            private void a(mj mj1)
            {
                N(mj1.a(afP));
            }

            protected final volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((mj)a1);
            }

            
            {
                afP = feedbackoptions;
                super(googleapiclient);
            }
        });
    }

    static 
    {
        CLIENT_KEY = new com.google.android.gms.common.api.Api.c();
        CLIENT_BUILDER = new com.google.android.gms.common.api.Api.b() {

            private static mj i$5da912b3(Context context, Looper looper, jw jw, com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions notrequiredoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new mj(context, looper, connectioncallbacks, onconnectionfailedlistener);
            }

            public final com.google.android.gms.common.api.Api.a a$28a3456d(Context context, Looper looper, jw jw, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return i$5da912b3(context, looper, jw, (com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public final int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(CLIENT_BUILDER, CLIENT_KEY, new Scope[0]);
    }
}

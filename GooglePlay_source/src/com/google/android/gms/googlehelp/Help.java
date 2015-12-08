// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.googlehelp.internal.common.GoogleHelpApiImpl;
import com.google.android.gms.googlehelp.internal.common.GoogleHelpClientImpl;

// Referenced classes of package com.google.android.gms.googlehelp:
//            GoogleHelpApi

public final class Help
{
    public static interface HelpApiInvokeListener
    {

        public abstract PendingResult onGoogleApiClientConnected$3946365();

        public abstract void onInvokeFailed();
    }


    public static final Api API;
    public static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER;
    public static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY;
    public static final GoogleHelpApi GoogleHelpApi = new GoogleHelpApiImpl();

    public static void invokeGoogleHelpApi(GoogleApiClient googleapiclient, HelpApiInvokeListener helpapiinvokelistener)
    {
        (new AsyncTask(googleapiclient, helpapiinvokelistener) {

            final GoogleApiClient val$googleApiClient;
            final HelpApiInvokeListener val$listener;

            protected final volatile Object doInBackground(Object aobj[])
            {
                if (googleApiClient.blockingConnect().isSuccess())
                {
                    listener._mth3946365().setResultCallback(new ResultCallback() {

                        final _cls2 this$0;

                        public final volatile void onResult(Result result)
                        {
                            if (!((Status)result).isSuccess())
                            {
                                listener.onInvokeFailed();
                            }
                            googleApiClient.disconnect();
                        }

            
            {
                this$0 = _cls2.this;
                super();
            }
                    });
                } else
                {
                    listener.onInvokeFailed();
                    googleApiClient.disconnect();
                }
                return null;
            }

            
            {
                googleApiClient = googleapiclient;
                listener = helpapiinvokelistener;
                super();
            }
        }).execute(new Void[0]);
    }

    static 
    {
        CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();
        CLIENT_BUILDER = new com.google.android.gms.common.api.Api.AbstractClientBuilder() {

            public final volatile com.google.android.gms.common.api.Api.Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new GoogleHelpClientImpl(context, looper, clientsettings, connectioncallbacks, onconnectionfailedlistener);
            }

        };
        API = new Api("Help.API", CLIENT_BUILDER, CLIENT_KEY);
    }
}

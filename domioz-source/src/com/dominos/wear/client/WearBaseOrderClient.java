// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.client;

import android.content.Context;
import com.dominos.remote.client.RemoteOrderClient;
import com.dominos.remote.util.ResponseEvent;
import com.google.android.gms.wearable.PutDataRequest;
import java.util.Date;

public class WearBaseOrderClient extends RemoteOrderClient
{

    private final String TAG = com/dominos/wear/client/WearBaseOrderClient.getSimpleName();

    public WearBaseOrderClient()
    {
    }

    private static String makeDataItemPath(long l, long l1)
    {
        return (new StringBuilder("/data")).append(l).append("/").append(l1).toString();
    }

    protected DataMapEvent createDataMapRequest(int i, ResponseEvent responseevent)
    {
        return new DataMapEvent(i, (new Date()).getTime(), responseevent);
    }

    public String getName()
    {
        return "androidWear";
    }

    public void onResponseReceived(ResponseEvent responseevent)
    {
    }

    protected void sendResponse(Context context, PutDataRequest putdatarequest)
    {
        (new RemoteDataApiClient(context, putdatarequest)).send();
    }



    private class DataMapEvent
    {

        public long begin;
        public String dataObject;
        public ResponseErrorCode errorCode;
        public int eventId;
        public ResponseStatus status;

        public PutDataRequest toPutDataMapRequest()
        {
            p p1 = p.a(WearBaseOrderClient.makeDataItemPath(eventId, begin));
            g g1 = p1.b();
            g1.a("dataUri", p1.a().toString());
            g1.a("eventId", eventId);
            g1.a("begin", begin);
            g1.a("dataObject", dataObject);
            g1.a("status", status.ordinal());
            g1.a("errorCode", errorCode.ordinal());
            return p1.c();
        }

        public DataMapEvent(int i, long l, ResponseEvent responseevent)
        {
            eventId = i;
            begin = l;
            dataObject = responseevent.getData();
            status = responseevent.getStatus();
            errorCode = responseevent.getErrorCode();
        }
    }


    private class RemoteDataApiClient
        implements n, o
    {

        private final Context context;
        private l mGoogleApiClient;
        private final PutDataRequest mPutDataRequest;
        final WearBaseOrderClient this$0;

        private void initGoogleClient()
        {
            if (mGoogleApiClient == null)
            {
                mGoogleApiClient = (new m(context)).a(q.h).a(this).a(this).c();
            }
        }

        public void connect()
        {
            while (mGoogleApiClient.g() || mGoogleApiClient.f()) 
            {
                return;
            }
            mGoogleApiClient.c();
            LogUtil.d(TAG, "GoogleApiClient Connecting...", new Object[0]);
        }

        public void disconnect()
        {
            if (mGoogleApiClient != null)
            {
                mGoogleApiClient.e();
                LogUtil.d(TAG, "GoogleApiClient Disconnected.", new Object[0]);
            }
        }

        public void onConnected(Bundle bundle)
        {
            q.a.a(mGoogleApiClient, mPutDataRequest);
            LogUtil.d(TAG, "Response data sent to wear!", new Object[0]);
            disconnect();
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            LogUtil.d(TAG, (new StringBuilder("GoogleApiClient connection failed!  ConnectionResult ErrorCode :")).append(connectionresult.c()).toString(), new Object[0]);
        }

        public void onConnectionSuspended(int i)
        {
            LogUtil.d(TAG, (new StringBuilder("GoogleApiClient Connection suspended. Failure code :")).append(i).toString(), new Object[0]);
        }

        public void send()
        {
            connect();
        }

        public RemoteDataApiClient(Context context1, PutDataRequest putdatarequest)
        {
            this$0 = WearBaseOrderClient.this;
            super();
            context = context1;
            mPutDataRequest = putdatarequest;
            initGoogleClient();
        }
    }

}

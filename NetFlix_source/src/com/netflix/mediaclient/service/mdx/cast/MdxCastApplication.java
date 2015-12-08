// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.cast;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.StringUtils;
import java.io.IOException;

public class MdxCastApplication extends com.google.android.gms.cast.Cast.Listener
    implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.cast.Cast.MessageReceivedCallback
{
    private final class LaunchResultCallback
        implements ResultCallback
    {

        final com.google.android.gms.cast.Cast.MessageReceivedCallback mMessageReceivedCallback;
        final MdxCastApplication this$0;

        public void onResult(com.google.android.gms.cast.Cast.ApplicationConnectionResult applicationconnectionresult)
        {
            if (applicationconnectionresult.getStatus().isSuccess())
            {
                Log.d(MdxCastApplication.TAG, "launchApplication(), success");
                try
                {
                    Cast.CastApi.setMessageReceivedCallbacks(mApiClient, "urn:x-cast:mdx-netflix-com:service:target:2", mMessageReceivedCallback);
                }
                // Misplaced declaration of an exception variable
                catch (com.google.android.gms.cast.Cast.ApplicationConnectionResult applicationconnectionresult)
                {
                    applicationconnectionresult.printStackTrace();
                    mCallback.onFailToLaunch();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (com.google.android.gms.cast.Cast.ApplicationConnectionResult applicationconnectionresult)
                {
                    mCallback.onFailToLaunch();
                    applicationconnectionresult.printStackTrace();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (com.google.android.gms.cast.Cast.ApplicationConnectionResult applicationconnectionresult)
                {
                    mCallback.onFailToLaunch();
                    applicationconnectionresult.printStackTrace();
                    return;
                }
                mForceLaunch = false;
                mCallback.onLaunched();
                return;
            }
            if (applicationconnectionresult.getStatus().getStatusCode() == 2002)
            {
                Log.d(MdxCastApplication.TAG, "launchApplication(), cancelled & ignored");
                return;
            }
            if (applicationconnectionresult.getStatus().getStatusCode() == 15)
            {
                Log.d(MdxCastApplication.TAG, "launchApplication(), timeout, wait - JUST A WORKAROUND");
                mCallback.onFailToLaunch();
                return;
            } else
            {
                Log.d(MdxCastApplication.TAG, (new StringBuilder()).append("launchApplication(), failure, result: ").append(applicationconnectionresult.getStatus().getStatusCode()).toString());
                mCallback.onFailToLaunch();
                return;
            }
        }

        public volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.cast.Cast.ApplicationConnectionResult)result);
        }

        LaunchResultCallback(com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback)
        {
            this$0 = MdxCastApplication.this;
            super();
            mMessageReceivedCallback = messagereceivedcallback;
        }
    }

    public static interface MdxCastApplicaCallback
    {

        public abstract void onApplicationStopped();

        public abstract void onFailToConnect();

        public abstract void onFailToLaunch();

        public abstract void onFailToSendMessage();

        public abstract void onLaunched();

        public abstract void onMessageReceived(String s);

        public abstract void onMessageSent();
    }

    private final class SendMessageResultCallback
        implements ResultCallback
    {

        final MdxCastApplication this$0;

        public volatile void onResult(Result result)
        {
            onResult((Status)result);
        }

        public void onResult(Status status)
        {
            if (status.isSuccess())
            {
                Log.d(MdxCastApplication.TAG, "SendMessage(), success");
                mCallback.onMessageSent();
                return;
            } else
            {
                Log.d(MdxCastApplication.TAG, "SendMessage(), failure");
                mCallback.onFailToSendMessage();
                return;
            }
        }

        private SendMessageResultCallback()
        {
            this$0 = MdxCastApplication.this;
            super();
        }

    }


    private static final String MESSAGE_NAMESPACE = "urn:x-cast:mdx-netflix-com:service:target:2";
    private static final String TAG = com/netflix/mediaclient/service/mdx/cast/MdxCastApplication.getSimpleName();
    private GoogleApiClient mApiClient;
    private final String mApplicationId;
    private MdxCastApplicaCallback mCallback;
    private boolean mForceLaunch;

    MdxCastApplication(Context context, String s, CastDevice castdevice, MdxCastApplicaCallback mdxcastapplicacallback, boolean flag)
    {
        mApplicationId = s;
        mCallback = mdxcastapplicacallback;
        mForceLaunch = flag;
        s = com.google.android.gms.cast.Cast.CastOptions.builder(castdevice, this);
        mApiClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).addApi(Cast.API, s.build()).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
        mApiClient.connect();
    }

    private boolean isNetflixRunning()
    {
        String s = Cast.CastApi.getApplicationStatus(mApiClient);
        return StringUtils.isEmpty(s) || s.indexOf("Netflix") != -1 || s.equalsIgnoreCase("null");
    }

    private boolean isOtherAppRunning()
    {
        String s = Cast.CastApi.getApplicationStatus(mApiClient);
        return StringUtils.isNotEmpty(s) && s.indexOf("Chromecast Home Screen") == -1;
    }

    private void joinApp()
    {
        Cast.CastApi.joinApplication(mApiClient, mApplicationId).setResultCallback(new LaunchResultCallback(this));
    }

    private void launchApp()
    {
        Cast.CastApi.launchApplication(mApiClient, mApplicationId).setResultCallback(new LaunchResultCallback(this));
    }

    private void logAppStatus()
    {
        ApplicationMetadata applicationmetadata;
        try
        {
            applicationmetadata = Cast.CastApi.getApplicationMetadata(mApiClient);
            Log.d(TAG, (new StringBuilder()).append("getApplicationMetadata: ").append(applicationmetadata).toString());
        }
        catch (IllegalStateException illegalstateexception)
        {
            illegalstateexception.printStackTrace();
            return;
        }
        if (applicationmetadata == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        Log.d(TAG, (new StringBuilder()).append("getApplicationId :").append(applicationmetadata.getApplicationId()).toString());
        Log.d(TAG, (new StringBuilder()).append("getName: ").append(applicationmetadata.getName()).toString());
        Log.d(TAG, (new StringBuilder()).append("getSenderAppIdentifier: ").append(applicationmetadata.getSenderAppIdentifier()).toString());
        Log.d(TAG, (new StringBuilder()).append("getApplicationStatus: ").append(Cast.CastApi.getApplicationStatus(mApiClient)).toString());
        return;
    }

    public void onApplicationDisconnected(int i)
    {
        Log.d(TAG, (new StringBuilder()).append("Cast.Listener disconnected with statusCode").append(i).toString());
        mCallback.onApplicationStopped();
    }

    public void onApplicationStatusChanged()
    {
        Log.d(TAG, "Cast.Listener onApplicationStatusChanged");
    }

    public void onConnected(Bundle bundle)
    {
        Log.d(TAG, (new StringBuilder()).append("GoogleApiClient connect(), success arg:").append(bundle).toString());
        try
        {
            if (mForceLaunch)
            {
                Log.d(TAG, "forced, GoogleApiClient launchApp()");
                launchApp();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            return;
        }
        if (!isOtherAppRunning())
        {
            Log.d(TAG, "not forced, no app is runnning");
            joinApp();
            return;
        }
        if (isNetflixRunning())
        {
            Log.d(TAG, "GoogleApiClient joinApp()");
            joinApp();
        }
        return;
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        Log.d(TAG, (new StringBuilder()).append("GoogleApiClient connect(), failure").append(connectionresult).toString());
        mCallback.onFailToConnect();
    }

    public void onConnectionSuspended(int i)
    {
        Log.d(TAG, (new StringBuilder()).append("GoogleApiClient connect(), suspended").append(i).toString());
        mCallback.onFailToConnect();
    }

    public void onMessageReceived(CastDevice castdevice, String s, String s1)
    {
        Log.d(TAG, (new StringBuilder()).append("onMessageReceived :").append(s).append(": ").append(s1).toString());
        mCallback.onMessageReceived(s1);
    }

    public void onVolumeChanged()
    {
    }

    public void sendMessage(String s)
    {
        Cast.CastApi.sendMessage(mApiClient, "urn:x-cast:mdx-netflix-com:service:target:2", s).setResultCallback(new SendMessageResultCallback());
    }

    public void stop()
    {
        try
        {
            Cast.CastApi.removeMessageReceivedCallbacks(mApiClient, "urn:x-cast:mdx-netflix-com:service:target:2");
        }
        catch (IllegalStateException illegalstateexception)
        {
            illegalstateexception.printStackTrace();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        mApiClient.disconnect();
    }






/*
    static boolean access$302(MdxCastApplication mdxcastapplication, boolean flag)
    {
        mdxcastapplication.mForceLaunch = flag;
        return flag;
    }

*/
}

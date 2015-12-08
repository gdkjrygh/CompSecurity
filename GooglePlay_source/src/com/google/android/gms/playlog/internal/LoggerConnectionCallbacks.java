// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            PlayLoggerImpl

public final class LoggerConnectionCallbacks
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{

    private final com.google.android.gms.playlog.PlayLogger.LoggerCallbacks mListener;
    PlayLoggerImpl mLoggerImpl;
    public boolean mSendCallback;

    public LoggerConnectionCallbacks(com.google.android.gms.playlog.PlayLogger.LoggerCallbacks loggercallbacks)
    {
        mListener = loggercallbacks;
        mLoggerImpl = null;
        mSendCallback = true;
    }

    public final void onConnected(Bundle bundle)
    {
        mLoggerImpl.setIsCaching(false);
        if (mSendCallback && mListener != null)
        {
            mListener.onLoggerConnected();
        }
        mSendCallback = false;
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        mLoggerImpl.setIsCaching(true);
        if (mSendCallback && mListener != null)
        {
            if (connectionresult.hasResolution())
            {
                mListener.onLoggerFailedConnectionWithResolution(connectionresult.mPendingIntent);
            } else
            {
                mListener.onLoggerFailedConnection();
            }
        }
        mSendCallback = false;
    }

    public final void onConnectionSuspended(int i)
    {
        mLoggerImpl.setIsCaching(true);
    }
}

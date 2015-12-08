// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.now;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.io.InterruptedIOException;

// Referenced classes of package com.google.android.now:
//            BlockingServiceConnection, INowAuthService

public class NowAuthService
{
    public static class DisabledException extends Exception
    {

        public DisabledException()
        {
        }
    }

    public static class HaveTokenAlreadyException extends Exception
    {

        private final String mAccessToken;

        public String getAccessToken()
        {
            return mAccessToken;
        }

        public HaveTokenAlreadyException(String s)
        {
            mAccessToken = s;
        }
    }

    public static class TooManyRequestsException extends Exception
    {

        private final long mNextRetryTimestampMillis;

        public long getNextRetryTimestampMillis()
        {
            return mNextRetryTimestampMillis;
        }

        public TooManyRequestsException(long l)
        {
            mNextRetryTimestampMillis = l;
        }
    }

    public static class UnauthorizedException extends Exception
    {

        public UnauthorizedException()
        {
        }
    }


    static final String AUTH_SERVICE_ACTION = "com.google.android.now.NOW_AUTH_SERVICE";
    private static final Intent AUTH_SERVICE_INTENT = (new Intent("com.google.android.now.NOW_AUTH_SERVICE")).setPackage("com.google.android.googlequicksearchbox");
    static final int ERROR_DISABLED = 3;
    static final int ERROR_HAVE_TOKEN_ALREADY = 2;
    static final int ERROR_TOO_MANY_REQUESTS = 1;
    static final int ERROR_UNAUTHORIZED = 0;
    static final String EXTRA_ACCESS_TOKEN = "access-token";
    static final String EXTRA_AUTH_CODE = "auth-code";
    static final String EXTRA_ERROR = "error";
    static final String EXTRA_NEXT_RETRY_TIMESTAMP_MILLIS = "next-retry-timestamp-millis";
    private static final String TAG = "NowAuthService";
    static boolean sThreadCheckDisabled;

    public NowAuthService()
    {
    }

    private static void checkNotMainThread()
    {
        if (Looper.myLooper() == Looper.getMainLooper() && !sThreadCheckDisabled)
        {
            throw new IllegalStateException("Cannot call this API from the main thread");
        } else
        {
            return;
        }
    }

    public static String getAuthCode(Context context, String s)
        throws IOException, UnauthorizedException, TooManyRequestsException, HaveTokenAlreadyException, DisabledException
    {
        BlockingServiceConnection blockingserviceconnection;
        checkNotMainThread();
        blockingserviceconnection = new BlockingServiceConnection();
        if (!context.bindService(AUTH_SERVICE_INTENT, blockingserviceconnection, 1)) goto _L2; else goto _L1
_L1:
        s = INowAuthService.Stub.asInterface(blockingserviceconnection.getService()).getAuthCode(s, context.getPackageName());
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        throw new IOException("Unexpected response from Google Now app");
        s;
        throw new IOException("Call to Google Now app failed", s);
        s;
        blockingserviceconnection.unbindServiceIfConnected(context);
        throw s;
        if (!s.containsKey("error")) goto _L4; else goto _L3
_L3:
        int i = s.getInt("error");
        i;
        JVM INSTR tableswitch 0 3: default 268
    //                   0 200
    //                   1 208
    //                   2 222
    //                   3 236;
           goto _L5 _L6 _L7 _L8 _L9
_L5:
        Log.e("NowAuthService", (new StringBuilder(26)).append("Unknown error: ").append(i).toString());
        throw new IOException((new StringBuilder(49)).append("Unexpected error from Google Now app: ").append(i).toString());
        s;
        Log.w("NowAuthService", "Interrupted", s);
        throw new InterruptedIOException("Interrupted while contacting Google Now app");
_L6:
        throw new UnauthorizedException();
_L7:
        throw new TooManyRequestsException(s.getLong("next-retry-timestamp-millis"));
_L8:
        throw new HaveTokenAlreadyException(s.getString("access-token"));
_L9:
        throw new DisabledException();
_L4:
        s = s.getString("auth-code");
        blockingserviceconnection.unbindServiceIfConnected(context);
        return s;
_L2:
        throw new IOException("Failed to contact Google Now app");
    }

}

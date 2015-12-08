// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.now;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import ctn;
import cto;
import ctp;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public final class NowAuthService
{

    private static final Intent a = (new Intent("com.google.android.now.NOW_AUTH_SERVICE")).setPackage("com.google.android.googlequicksearchbox");

    public static String a(Context context, String s)
    {
        ctn ctn1;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Cannot call this API from the main thread");
        }
        ctn1 = new ctn();
        if (!context.bindService(a, ctn1, 1)) goto _L2; else goto _L1
_L1:
        if (ctn1.a.get())
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_77;
        s;
        throw new IOException("Call to Google Now app failed", s);
        s;
        ctn1.a(context);
        throw s;
        ctn1.a.set(true);
        s = ctp.a((IBinder)ctn1.b.take()).a(s, context.getPackageName());
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        throw new IOException("Unexpected response from Google Now app");
        s;
        Log.w("NowAuthService", "Interrupted", s);
        throw new InterruptedIOException("Interrupted while contacting Google Now app");
        if (!s.containsKey("error")) goto _L4; else goto _L3
_L3:
        int i = s.getInt("error");
        i;
        JVM INSTR tableswitch 0 3: default 316
    //                   0 248
    //                   1 256
    //                   2 270
    //                   3 284;
           goto _L5 _L6 _L7 _L8 _L9
_L5:
        Log.e("NowAuthService", (new StringBuilder(26)).append("Unknown error: ").append(i).toString());
        throw new IOException((new StringBuilder(49)).append("Unexpected error from Google Now app: ").append(i).toString());
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
        ctn1.a(context);
        return s;
_L2:
        throw new IOException("Failed to contact Google Now app");
    }


    private class UnauthorizedException extends Exception
    {

        public UnauthorizedException()
        {
        }
    }


    private class TooManyRequestsException extends Exception
    {

        private final long mNextRetryTimestampMillis;

        public TooManyRequestsException(long l)
        {
            mNextRetryTimestampMillis = l;
        }
    }


    private class HaveTokenAlreadyException extends Exception
    {

        private final String mAccessToken;

        public final String a()
        {
            return mAccessToken;
        }

        public HaveTokenAlreadyException(String s)
        {
            mAccessToken = s;
        }
    }


    private class DisabledException extends Exception
    {

        public DisabledException()
        {
        }
    }

}

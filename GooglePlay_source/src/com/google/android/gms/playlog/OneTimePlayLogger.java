// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog;

import android.app.PendingIntent;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.playlog.internal.LoggerConnectionCallbacks;
import com.google.android.gms.playlog.internal.PlayLoggerImpl;

// Referenced classes of package com.google.android.gms.playlog:
//            PlayLogger

public final class OneTimePlayLogger
    implements PlayLogger.LoggerCallbacks
{

    public boolean mIsUsable;
    public final PlayLogger mPlayLogger;

    public OneTimePlayLogger(Context context)
    {
        this(context, 10);
    }

    private OneTimePlayLogger(Context context, int i)
    {
        this(context, 10, null);
    }

    private OneTimePlayLogger(Context context, int i, String s)
    {
        if (context != context.getApplicationContext())
        {
            s = context.getClass().getName();
        } else
        {
            s = "OneTimePlayLogger";
        }
        mPlayLogger = new PlayLogger(context, i, null, null, this, true, s);
        mIsUsable = true;
    }

    public final void ensureIsUsable()
    {
        if (!mIsUsable)
        {
            throw new IllegalStateException("Cannot reuse one-time logger after sending.");
        } else
        {
            return;
        }
    }

    public final void onLoggerConnected()
    {
        PlayLoggerImpl playloggerimpl = mPlayLogger.mLoggerImpl;
        synchronized (playloggerimpl.mLock)
        {
            playloggerimpl.mLoggerConnectionCallbacks.mSendCallback = false;
            playloggerimpl.disconnect();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onLoggerFailedConnection()
    {
        Log.w("OneTimePlayLogger", "logger connection failed");
    }

    public final void onLoggerFailedConnectionWithResolution(PendingIntent pendingintent)
    {
        Log.w("OneTimePlayLogger", (new StringBuilder("logger connection failed: ")).append(pendingintent).toString());
    }
}

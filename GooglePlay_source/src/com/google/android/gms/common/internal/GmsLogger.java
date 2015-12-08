// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.playlog.OneTimePlayLogger;
import com.google.android.gms.playlog.PlayLogger;
import com.google.android.gms.playlog.internal.IPlayLogService;
import com.google.android.gms.playlog.internal.LogEvent;
import com.google.android.gms.playlog.internal.LoggerConnectionCallbacks;
import com.google.android.gms.playlog.internal.PlayLoggerImpl;

// Referenced classes of package com.google.android.gms.common.internal:
//            Preconditions

public final class GmsLogger
{

    public static final int MAX_PII_TAG_LENGTH = 15;
    private static final String NO_PREFIX = null;
    private final String mLogTag;
    private final String mPrefix;

    public GmsLogger(String s)
    {
        this(s, null);
    }

    private GmsLogger(String s, String s1)
    {
        Preconditions.checkNotNull(s, "log tag cannot be null");
        boolean flag;
        if (s.length() <= 23)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "tag \"%s\" is longer than the %d character maximum", new Object[] {
            s, Integer.valueOf(23)
        });
        mLogTag = s;
        mPrefix = null;
    }

    public final boolean canLog(int i)
    {
        return Log.isLoggable(mLogTag, i);
    }

    public final void d(String s, String s1)
    {
        if (canLog(3))
        {
            Log.d(s, prefix(s1));
        }
    }

    public final void e(String s, String s1)
    {
        if (canLog(6))
        {
            Log.e(s, prefix(s1));
        }
    }

    public final void e(String s, String s1, Throwable throwable)
    {
        if (canLog(6))
        {
            Log.e(s, prefix(s1), throwable);
        }
    }

    public final String prefix(String s)
    {
        if (mPrefix == null)
        {
            return s;
        } else
        {
            return mPrefix.concat(s);
        }
    }

    public final void v(String s, String s1)
    {
        if (canLog(2))
        {
            Log.v(s, prefix(s1));
        }
    }

    public final void w(String s, String s1)
    {
        if (canLog(5))
        {
            Log.w(s, prefix(s1));
        }
    }

    public final void wtf(Context context, String s, String s1, Throwable throwable)
    {
        Object obj;
        Object obj1;
        LogEvent logevent;
        StackTraceElement astacktraceelement[] = throwable.getStackTrace();
        obj = new StringBuilder();
        for (int i = 0; i < astacktraceelement.length && i < 2; i++)
        {
            ((StringBuilder) (obj)).append(astacktraceelement[i].toString());
            ((StringBuilder) (obj)).append("\n");
        }

        context = new OneTimePlayLogger(context);
        String s2 = ((StringBuilder) (obj)).toString();
        context.ensureIsUsable();
        obj1 = ((OneTimePlayLogger) (context)).mPlayLogger;
        long l = System.currentTimeMillis();
        obj = ((PlayLogger) (obj1)).mLoggerImpl;
        obj1 = ((PlayLogger) (obj1)).mLoggerContext;
        logevent = new LogEvent(l, "GMS_WTF", null, new String[] {
            "GMS_WTF", s2
        });
        Object obj2 = ((PlayLoggerImpl) (obj)).mLock;
        obj2;
        JVM INSTR monitorenter ;
        if (!((PlayLoggerImpl) (obj)).mIsCaching) goto _L2; else goto _L1
_L1:
        ((PlayLoggerImpl) (obj)).saveToMemoryCache(((com.google.android.gms.playlog.internal.PlayLoggerContext) (obj1)), logevent);
_L7:
        context.ensureIsUsable();
        obj1 = ((OneTimePlayLogger) (context)).mPlayLogger.mLoggerImpl;
        obj = ((PlayLoggerImpl) (obj1)).mLock;
        obj;
        JVM INSTR monitorenter ;
        if (!((PlayLoggerImpl) (obj1)).isConnecting() && !((PlayLoggerImpl) (obj1)).isConnected()) goto _L4; else goto _L3
_L3:
        context.mIsUsable = false;
        if (canLog(7))
        {
            Log.e(s, prefix(s1), throwable);
            Log.wtf(s, prefix(s1), throwable);
        }
        return;
_L2:
        ((PlayLoggerImpl) (obj)).flushCacheToService();
        ((IPlayLogService)((PlayLoggerImpl) (obj)).getService()).sendLogEvent(((PlayLoggerImpl) (obj)).mPackageName, ((com.google.android.gms.playlog.internal.PlayLoggerContext) (obj1)), logevent);
        continue; /* Loop/switch isn't completed */
        Object obj3;
        obj3;
        Log.e("PlayLoggerImpl", "Couldn't send log event.  Will try caching.");
        ((PlayLoggerImpl) (obj)).saveToMemoryCache(((com.google.android.gms.playlog.internal.PlayLoggerContext) (obj1)), logevent);
        continue; /* Loop/switch isn't completed */
        context;
        obj2;
        JVM INSTR monitorexit ;
        throw context;
        obj3;
        Log.e("PlayLoggerImpl", "Service was disconnected.  Will try caching.");
        ((PlayLoggerImpl) (obj)).saveToMemoryCache(((com.google.android.gms.playlog.internal.PlayLoggerContext) (obj1)), logevent);
        continue; /* Loop/switch isn't completed */
_L4:
        ((PlayLoggerImpl) (obj1)).mLoggerConnectionCallbacks.mSendCallback = true;
        ((PlayLoggerImpl) (obj1)).checkAvailabilityAndConnect();
        obj;
        JVM INSTR monitorexit ;
        if (true) goto _L3; else goto _L5
_L5:
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        if (true) goto _L7; else goto _L6
_L6:
    }

}

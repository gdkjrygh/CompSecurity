// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.utils;

import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

public class PlayCommonLog
{

    public static final boolean DEBUG = Log.isLoggable("PlayCommon", 2);
    private static String TAG = "PlayCommon";
    private static long sStartTime = System.currentTimeMillis();

    public PlayCommonLog()
    {
    }

    private static transient String buildMessage(String s, Object aobj[])
    {
        if (aobj != null) goto _L2; else goto _L1
_L1:
        String s1;
        StackTraceElement astacktraceelement[];
        int i;
        astacktraceelement = (new Throwable()).fillInStackTrace().getStackTrace();
        s1 = "<unknown>";
        i = 2;
_L3:
        aobj = s1;
        if (i < astacktraceelement.length)
        {
            aobj = astacktraceelement[i].getClassName();
            if (((String) (aobj)).equals(com/google/android/play/utils/PlayCommonLog.getName()))
            {
                break MISSING_BLOCK_LABEL_201;
            }
            aobj = ((String) (aobj)).substring(((String) (aobj)).lastIndexOf('.') + 1);
            aobj = ((String) (aobj)).substring(((String) (aobj)).lastIndexOf('$') + 1);
            aobj = (new StringBuilder()).append(((String) (aobj))).append(".").append(astacktraceelement[i].getMethodName()).toString();
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[] {
            Long.valueOf(Thread.currentThread().getId()), aobj, s
        });
_L2:
        s1 = String.format(Locale.US, s, aobj);
        s = s1;
          goto _L1
        IllegalFormatException illegalformatexception;
        illegalformatexception;
        wtf("IllegalFormatException: formatString='%s' numArgs=%d", new Object[] {
            s, Integer.valueOf(aobj.length)
        });
        s = (new StringBuilder()).append(s).append(" (An error occurred while formatting the message.)").toString();
          goto _L1
        i++;
          goto _L3
    }

    public static transient void d(String s, Object aobj[])
    {
        Log.d(TAG, buildMessage(s, aobj));
    }

    public static transient void e(String s, Object aobj[])
    {
        Log.e(TAG, buildMessage(s, aobj));
    }

    public static transient void logTiming(String s, Object aobj[])
    {
        if (!Log.isLoggable(TAG, 2))
        {
            return;
        } else
        {
            s = String.format(Locale.US, s, aobj);
            v("%4dms: %s", new Object[] {
                Long.valueOf(System.currentTimeMillis() - sStartTime), s
            });
            return;
        }
    }

    public static transient void v(String s, Object aobj[])
    {
        Log.v(TAG, buildMessage(s, aobj));
    }

    public static transient void w(String s, Object aobj[])
    {
        Log.w(TAG, buildMessage(s, aobj));
    }

    public static transient void wtf(String s, Object aobj[])
    {
        Log.e(TAG, buildMessage(s, aobj));
        Log.wtf(TAG, buildMessage(s, aobj));
    }

}

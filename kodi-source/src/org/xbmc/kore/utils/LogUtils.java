// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.utils;

import android.util.Log;
import java.util.Arrays;
import java.util.List;
import org.xbmc.kore.host.HostConnectionObserver;
import org.xbmc.kore.jsonrpc.HostConnection;

public class LogUtils
{

    private static final List doNotLogTags;

    public static void LOGD(String s, String s1)
    {
        if (Log.isLoggable(s, 3))
        {
            Log.d(s, s1);
        }
    }

    public static void LOGD(String s, String s1, Throwable throwable)
    {
        if (Log.isLoggable(s, 3))
        {
            Log.d(s, s1, throwable);
        }
    }

    public static void LOGE(String s, String s1, Throwable throwable)
    {
        Log.e(s, s1, throwable);
    }

    public static void LOGV(String s, String s1)
    {
    }

    public static void LOGW(String s, String s1)
    {
        Log.w(s, s1);
    }

    public static void LOGW(String s, String s1, Throwable throwable)
    {
        Log.w(s, s1, throwable);
    }

    public static String makeLogTag(Class class1)
    {
        return makeLogTag(class1.getSimpleName());
    }

    public static String makeLogTag(String s)
    {
        String s1 = s;
        if (s.length() > 23)
        {
            s1 = s.substring(0, 22);
        }
        return s1;
    }

    static 
    {
        doNotLogTags = Arrays.asList(new String[] {
            HostConnection.TAG, HostConnectionObserver.TAG
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.utils;

import android.util.Log;
import com.google.android.libraries.cast.companionlibrary.cast.BaseCastManager;

public class LogUtils
{

    private static final boolean DEBUG = false;
    private static final String LOG_PREFIX = "ccl_";
    private static final int LOG_PREFIX_LENGTH = 4;
    private static final int MAX_LOG_TAG_LENGTH = 23;

    private LogUtils()
    {
    }

    public static final void LOGD(String s, String s1)
    {
        if (Log.isLoggable(s, 3))
        {
            (new StringBuilder()).append(getVersionPrefix()).append(s1);
        }
    }

    public static final void LOGD(String s, String s1, Throwable throwable)
    {
        if (Log.isLoggable(s, 3))
        {
            (new StringBuilder()).append(getVersionPrefix()).append(s1);
        }
    }

    public static final void LOGE(String s, String s1)
    {
        (new StringBuilder()).append(getVersionPrefix()).append(s1);
    }

    public static final void LOGE(String s, String s1, Throwable throwable)
    {
        (new StringBuilder()).append(getVersionPrefix()).append(s1);
    }

    public static final void LOGI(String s, String s1)
    {
        (new StringBuilder()).append(getVersionPrefix()).append(s1);
    }

    public static final void LOGI(String s, String s1, Throwable throwable)
    {
    }

    public static final void LOGV(String s, String s1)
    {
    }

    public static final void LOGV(String s, String s1, Throwable throwable)
    {
    }

    public static final void LOGW(String s, String s1)
    {
        (new StringBuilder()).append(getVersionPrefix()).append(s1);
    }

    public static final void LOGW(String s, String s1, Throwable throwable)
    {
        (new StringBuilder()).append(getVersionPrefix()).append(s1);
    }

    public static final String getVersionPrefix()
    {
        return (new StringBuilder("[v")).append(BaseCastManager.getCclVersion()).append("] ").toString();
    }

    public static String makeLogTag(Class class1)
    {
        return makeLogTag(class1.getSimpleName());
    }

    public static String makeLogTag(String s)
    {
        if (s.length() > 23 - LOG_PREFIX_LENGTH)
        {
            return (new StringBuilder("ccl_")).append(s.substring(0, 23 - LOG_PREFIX_LENGTH - 1)).toString();
        } else
        {
            return (new StringBuilder("ccl_")).append(s).toString();
        }
    }

}

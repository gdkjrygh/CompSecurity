// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.log;

import android.util.Log;
import com.pinterest.configuration.SharedBuildConfig;
import java.util.MissingFormatArgumentException;

public class PLog
{

    public static final String LOG_TAG = "PLog";

    public PLog()
    {
    }

    public static void analytics(String s)
    {
        if (!SharedBuildConfig.isNonProduction())
        {
            break MISSING_BLOCK_LABEL_13;
        }
        Log.i("PLog_ANALYTICS", s);
        return;
        MissingFormatArgumentException missingformatargumentexception;
        missingformatargumentexception;
        Log.i("PLog", s);
        return;
        s;
    }

    public static transient void error(String s, Object aobj[])
    {
        if (!SharedBuildConfig.isNonProduction())
        {
            break MISSING_BLOCK_LABEL_17;
        }
        Log.e("PLog", String.format(s, aobj));
        return;
        aobj;
        Log.e("PLog", s);
        return;
        s;
    }

    public static transient void error(Throwable throwable, String s, Object aobj[])
    {
        if (!SharedBuildConfig.isNonProduction())
        {
            break MISSING_BLOCK_LABEL_18;
        }
        Log.e("PLog", String.format(s, aobj), throwable);
        return;
        aobj;
        Log.e("PLog", s, throwable);
        return;
        throwable;
    }

    public static transient void info(String s, Object aobj[])
    {
        if (!SharedBuildConfig.isNonProduction())
        {
            break MISSING_BLOCK_LABEL_17;
        }
        Log.i("PLog", String.format(s, aobj));
        return;
        aobj;
        Log.i("PLog", s);
        return;
        s;
    }

    public static transient void log(String s, String s1, Object aobj[])
    {
        if (!SharedBuildConfig.isNonProduction())
        {
            break MISSING_BLOCK_LABEL_16;
        }
        Log.d(s, String.format(s1, aobj));
        return;
        s;
        Log.d("PLog", s1);
        return;
        s;
    }

    public static transient void log(String s, Object aobj[])
    {
        log("PLog", s, aobj);
    }

    public static transient void logv(String s, Object aobj[])
    {
        if (!SharedBuildConfig.isNonProduction())
        {
            break MISSING_BLOCK_LABEL_17;
        }
        Log.v("PLog", String.format(s, aobj));
        return;
        aobj;
        Log.v("PLog", s);
        return;
        s;
    }

    public static transient void warn(String s, Object aobj[])
    {
        if (!SharedBuildConfig.isNonProduction())
        {
            break MISSING_BLOCK_LABEL_17;
        }
        Log.w("PLog", String.format(s, aobj));
        return;
        aobj;
        Log.w("PLog", s);
        return;
        s;
    }

    public static transient void wtf(Throwable throwable, String s, Object aobj[])
    {
        if (SharedBuildConfig.isNonProduction())
        {
            try
            {
                Log.e("PLog", String.format(s, aobj), throwable);
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                Log.e("PLog", s, throwable);
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            throw new RuntimeException(throwable);
        } else
        {
            return;
        }
    }
}

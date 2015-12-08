// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j.impl;

import android.util.Log;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MarkerIgnoringBase;
import org.slf4j.helpers.MessageFormatter;

public class AndroidLogger extends MarkerIgnoringBase
{

    private static final long serialVersionUID = 0xeef7d85336d60cffL;

    AndroidLogger(String s)
    {
        name = s;
    }

    private String format(String s, Object obj, Object obj1)
    {
        return MessageFormatter.format(s, obj, obj1).getMessage();
    }

    private String format(String s, Object aobj[])
    {
        return MessageFormatter.arrayFormat(s, aobj).getMessage();
    }

    public void debug(String s)
    {
        Log.d(name, s);
    }

    public void debug(String s, Object obj)
    {
        Log.d(name, format(s, obj, null));
    }

    public void debug(String s, Object obj, Object obj1)
    {
        Log.d(name, format(s, obj, obj1));
    }

    public void debug(String s, Throwable throwable)
    {
        Log.d(name, s, throwable);
    }

    public void debug(String s, Object aobj[])
    {
        Log.d(name, format(s, aobj));
    }

    public void error(String s)
    {
        Log.e(name, s);
    }

    public void error(String s, Object obj)
    {
        Log.e(name, format(s, obj, null));
    }

    public void error(String s, Object obj, Object obj1)
    {
        Log.e(name, format(s, obj, obj1));
    }

    public void error(String s, Throwable throwable)
    {
        Log.e(name, s, throwable);
    }

    public void error(String s, Object aobj[])
    {
        Log.e(name, format(s, aobj));
    }

    public void info(String s)
    {
        Log.i(name, s);
    }

    public void info(String s, Object obj)
    {
        Log.i(name, format(s, obj, null));
    }

    public void info(String s, Object obj, Object obj1)
    {
        Log.i(name, format(s, obj, obj1));
    }

    public void info(String s, Throwable throwable)
    {
        Log.i(name, s, throwable);
    }

    public void info(String s, Object aobj[])
    {
        Log.i(name, format(s, aobj));
    }

    public boolean isDebugEnabled()
    {
        return Log.isLoggable(name, 3);
    }

    public boolean isErrorEnabled()
    {
        return Log.isLoggable(name, 6);
    }

    public boolean isInfoEnabled()
    {
        return Log.isLoggable(name, 4);
    }

    public boolean isTraceEnabled()
    {
        return Log.isLoggable(name, 2);
    }

    public boolean isWarnEnabled()
    {
        return Log.isLoggable(name, 5);
    }

    public void trace(String s)
    {
        Log.v(name, s);
    }

    public void trace(String s, Object obj)
    {
        Log.v(name, format(s, obj, null));
    }

    public void trace(String s, Object obj, Object obj1)
    {
        Log.v(name, format(s, obj, obj1));
    }

    public void trace(String s, Throwable throwable)
    {
        Log.v(name, s, throwable);
    }

    public void trace(String s, Object aobj[])
    {
        Log.v(name, format(s, aobj));
    }

    public void warn(String s)
    {
        Log.w(name, s);
    }

    public void warn(String s, Object obj)
    {
        Log.w(name, format(s, obj, null));
    }

    public void warn(String s, Object obj, Object obj1)
    {
        Log.w(name, format(s, obj, obj1));
    }

    public void warn(String s, Throwable throwable)
    {
        Log.w(name, s, throwable);
    }

    public void warn(String s, Object aobj[])
    {
        Log.w(name, format(s, aobj));
    }
}

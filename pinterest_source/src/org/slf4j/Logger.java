// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j;


// Referenced classes of package org.slf4j:
//            Marker

public interface Logger
{

    public static final String ROOT_LOGGER_NAME = "ROOT";

    public abstract void debug(String s);

    public abstract void debug(String s, Object obj);

    public abstract void debug(String s, Object obj, Object obj1);

    public abstract void debug(String s, Throwable throwable);

    public abstract void debug(String s, Object aobj[]);

    public abstract void debug(Marker marker, String s);

    public abstract void debug(Marker marker, String s, Object obj);

    public abstract void debug(Marker marker, String s, Object obj, Object obj1);

    public abstract void debug(Marker marker, String s, Throwable throwable);

    public abstract void debug(Marker marker, String s, Object aobj[]);

    public abstract void error(String s);

    public abstract void error(String s, Object obj);

    public abstract void error(String s, Object obj, Object obj1);

    public abstract void error(String s, Throwable throwable);

    public abstract void error(String s, Object aobj[]);

    public abstract void error(Marker marker, String s);

    public abstract void error(Marker marker, String s, Object obj);

    public abstract void error(Marker marker, String s, Object obj, Object obj1);

    public abstract void error(Marker marker, String s, Throwable throwable);

    public abstract void error(Marker marker, String s, Object aobj[]);

    public abstract String getName();

    public abstract void info(String s);

    public abstract void info(String s, Object obj);

    public abstract void info(String s, Object obj, Object obj1);

    public abstract void info(String s, Throwable throwable);

    public abstract void info(String s, Object aobj[]);

    public abstract void info(Marker marker, String s);

    public abstract void info(Marker marker, String s, Object obj);

    public abstract void info(Marker marker, String s, Object obj, Object obj1);

    public abstract void info(Marker marker, String s, Throwable throwable);

    public abstract void info(Marker marker, String s, Object aobj[]);

    public abstract boolean isDebugEnabled();

    public abstract boolean isDebugEnabled(Marker marker);

    public abstract boolean isErrorEnabled();

    public abstract boolean isErrorEnabled(Marker marker);

    public abstract boolean isInfoEnabled();

    public abstract boolean isInfoEnabled(Marker marker);

    public abstract boolean isTraceEnabled();

    public abstract boolean isTraceEnabled(Marker marker);

    public abstract boolean isWarnEnabled();

    public abstract boolean isWarnEnabled(Marker marker);

    public abstract void trace(String s);

    public abstract void trace(String s, Object obj);

    public abstract void trace(String s, Object obj, Object obj1);

    public abstract void trace(String s, Throwable throwable);

    public abstract void trace(String s, Object aobj[]);

    public abstract void trace(Marker marker, String s);

    public abstract void trace(Marker marker, String s, Object obj);

    public abstract void trace(Marker marker, String s, Object obj, Object obj1);

    public abstract void trace(Marker marker, String s, Throwable throwable);

    public abstract void trace(Marker marker, String s, Object aobj[]);

    public abstract void warn(String s);

    public abstract void warn(String s, Object obj);

    public abstract void warn(String s, Object obj, Object obj1);

    public abstract void warn(String s, Throwable throwable);

    public abstract void warn(String s, Object aobj[]);

    public abstract void warn(Marker marker, String s);

    public abstract void warn(Marker marker, String s, Object obj);

    public abstract void warn(Marker marker, String s, Object obj, Object obj1);

    public abstract void warn(Marker marker, String s, Throwable throwable);

    public abstract void warn(Marker marker, String s, Object aobj[]);
}

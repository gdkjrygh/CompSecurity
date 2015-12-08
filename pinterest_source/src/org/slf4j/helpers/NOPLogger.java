// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j.helpers;


// Referenced classes of package org.slf4j.helpers:
//            MarkerIgnoringBase

public class NOPLogger extends MarkerIgnoringBase
{

    public static final NOPLogger NOP_LOGGER = new NOPLogger();
    private static final long serialVersionUID = 0xf8d276c818e64667L;

    protected NOPLogger()
    {
    }

    public final void debug(String s)
    {
    }

    public final void debug(String s, Object obj)
    {
    }

    public final void debug(String s, Object obj, Object obj1)
    {
    }

    public final void debug(String s, Throwable throwable)
    {
    }

    public final void debug(String s, Object aobj[])
    {
    }

    public final void error(String s)
    {
    }

    public final void error(String s, Object obj)
    {
    }

    public final void error(String s, Object obj, Object obj1)
    {
    }

    public final void error(String s, Throwable throwable)
    {
    }

    public final void error(String s, Object aobj[])
    {
    }

    public String getName()
    {
        return "NOP";
    }

    public final void info(String s)
    {
    }

    public final void info(String s, Object obj)
    {
    }

    public final void info(String s, Object obj, Object obj1)
    {
    }

    public final void info(String s, Throwable throwable)
    {
    }

    public final void info(String s, Object aobj[])
    {
    }

    public final boolean isDebugEnabled()
    {
        return false;
    }

    public final boolean isErrorEnabled()
    {
        return false;
    }

    public final boolean isInfoEnabled()
    {
        return false;
    }

    public final boolean isTraceEnabled()
    {
        return false;
    }

    public final boolean isWarnEnabled()
    {
        return false;
    }

    public final void trace(String s)
    {
    }

    public final void trace(String s, Object obj)
    {
    }

    public final void trace(String s, Object obj, Object obj1)
    {
    }

    public final void trace(String s, Throwable throwable)
    {
    }

    public final void trace(String s, Object aobj[])
    {
    }

    public final void warn(String s)
    {
    }

    public final void warn(String s, Object obj)
    {
    }

    public final void warn(String s, Object obj, Object obj1)
    {
    }

    public final void warn(String s, Throwable throwable)
    {
    }

    public final void warn(String s, Object aobj[])
    {
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.slf4j.helpers;


// Referenced classes of package fs.org.slf4j.helpers:
//            MarkerIgnoringBase

public class NOPLogger extends MarkerIgnoringBase
{

    public static final NOPLogger NOP_LOGGER = new NOPLogger();

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

    public final void error(String s, Object obj)
    {
    }

    public final void error(String s, Object obj, Object obj1)
    {
    }

    public final void error(String s, Throwable throwable)
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

    public final void trace(String s, Object obj, Object obj1)
    {
    }

    public final void warn(String s)
    {
    }

    public final void warn(String s, Object obj)
    {
    }

}

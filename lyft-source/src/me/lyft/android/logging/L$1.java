// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.logging;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package me.lyft.android.logging:
//            ILogger, L

final class ger
    implements ILogger
{

    public transient void d(String s, Object aobj[])
    {
        for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).d(s, aobj)) { }
    }

    public transient void d(Throwable throwable, String s, Object aobj[])
    {
        for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).d(throwable, s, aobj)) { }
    }

    public transient void e(String s, Object aobj[])
    {
        for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).e(s, aobj)) { }
    }

    public transient void e(Throwable throwable, String s, Object aobj[])
    {
        for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).e(throwable, s, aobj)) { }
    }

    public transient void i(String s, Object aobj[])
    {
        for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).i(s, aobj)) { }
    }

    public transient void i(Throwable throwable, String s, Object aobj[])
    {
        for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).i(throwable, s, aobj)) { }
    }

    public transient void v(String s, Object aobj[])
    {
        for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).v(s, aobj)) { }
    }

    public transient void v(Throwable throwable, String s, Object aobj[])
    {
        for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).v(throwable, s, aobj)) { }
    }

    public transient void w(String s, Object aobj[])
    {
        for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).w(s, aobj)) { }
    }

    public transient void w(Throwable throwable, String s, Object aobj[])
    {
        for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).w(throwable, s, aobj)) { }
    }

    ger()
    {
    }
}

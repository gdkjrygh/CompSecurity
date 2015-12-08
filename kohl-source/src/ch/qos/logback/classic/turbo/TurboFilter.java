// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import fs.ch.qos.logback.core.spi.ContextAwareBase;
import fs.ch.qos.logback.core.spi.FilterReply;
import fs.ch.qos.logback.core.spi.LifeCycle;
import fs.org.slf4j.Marker;

public abstract class TurboFilter extends ContextAwareBase
    implements LifeCycle
{

    boolean start;

    public TurboFilter()
    {
        start = false;
    }

    public abstract FilterReply decide(Marker marker, Logger logger, Level level, String s, Object aobj[], Throwable throwable);

    public boolean isStarted()
    {
        return start;
    }

    public void start()
    {
        start = true;
    }

    public void stop()
    {
        start = false;
    }
}

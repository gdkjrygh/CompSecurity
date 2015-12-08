// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.filter;

import fs.ch.qos.logback.core.spi.ContextAwareBase;
import fs.ch.qos.logback.core.spi.FilterReply;
import fs.ch.qos.logback.core.spi.LifeCycle;

public abstract class Filter extends ContextAwareBase
    implements LifeCycle
{

    boolean start;

    public Filter()
    {
        start = false;
    }

    public abstract FilterReply decide(Object obj);

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

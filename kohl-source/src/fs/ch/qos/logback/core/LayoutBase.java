// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core;

import fs.ch.qos.logback.core.spi.ContextAwareBase;

// Referenced classes of package fs.ch.qos.logback.core:
//            Layout, Context

public abstract class LayoutBase extends ContextAwareBase
    implements Layout
{

    protected boolean started;

    public LayoutBase()
    {
    }

    public Context getContext()
    {
        return context;
    }

    public boolean isStarted()
    {
        return started;
    }

    public void setContext(Context context)
    {
        this.context = context;
    }

    public void start()
    {
        started = true;
    }

    public void stop()
    {
        started = false;
    }
}

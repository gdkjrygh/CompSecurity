// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.boolex;

import fs.ch.qos.logback.core.spi.ContextAware;
import fs.ch.qos.logback.core.spi.LifeCycle;

// Referenced classes of package fs.ch.qos.logback.core.boolex:
//            EvaluationException

public interface EventEvaluator
    extends ContextAware, LifeCycle
{

    public abstract boolean evaluate(Object obj)
        throws NullPointerException, EvaluationException;

    public abstract String getName();
}

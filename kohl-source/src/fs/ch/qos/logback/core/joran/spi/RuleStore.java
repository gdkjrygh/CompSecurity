// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.spi;

import fs.ch.qos.logback.core.joran.action.Action;
import java.util.List;

// Referenced classes of package fs.ch.qos.logback.core.joran.spi:
//            Pattern

public interface RuleStore
{

    public abstract void addRule(Pattern pattern, Action action);

    public abstract void addRule(Pattern pattern, String s)
        throws ClassNotFoundException;

    public abstract List matchActions(Pattern pattern);
}

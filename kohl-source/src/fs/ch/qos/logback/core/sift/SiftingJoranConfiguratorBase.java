// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.sift;

import fs.ch.qos.logback.core.Appender;
import fs.ch.qos.logback.core.joran.GenericConfigurator;
import fs.ch.qos.logback.core.joran.action.NestedBasicPropertyIA;
import fs.ch.qos.logback.core.joran.action.NestedComplexPropertyIA;
import fs.ch.qos.logback.core.joran.spi.Interpreter;
import fs.ch.qos.logback.core.joran.spi.JoranException;
import java.util.List;
import java.util.Map;

public abstract class SiftingJoranConfiguratorBase extends GenericConfigurator
{

    int errorEmmissionCount;

    public SiftingJoranConfiguratorBase()
    {
        errorEmmissionCount = 0;
    }

    protected void addImplicitRules(Interpreter interpreter)
    {
        Object obj = new NestedComplexPropertyIA();
        ((NestedComplexPropertyIA) (obj)).setContext(context);
        interpreter.addImplicitAction(((fs.ch.qos.logback.core.joran.action.ImplicitAction) (obj)));
        obj = new NestedBasicPropertyIA();
        ((NestedBasicPropertyIA) (obj)).setContext(context);
        interpreter.addImplicitAction(((fs.ch.qos.logback.core.joran.action.ImplicitAction) (obj)));
    }

    public void doConfigure(List list)
        throws JoranException
    {
        super.doConfigure(list);
    }

    public abstract Appender getAppender();

    protected void oneAndOnlyOneCheck(Map map)
    {
        String s = null;
        if (map.size() != 0) goto _L2; else goto _L1
_L1:
        errorEmmissionCount = errorEmmissionCount + 1;
        s = "No nested appenders found within the <sift> element in SiftingAppender.";
_L4:
        if (s != null && errorEmmissionCount < 4)
        {
            addError(s);
        }
        return;
_L2:
        if (map.size() > 1)
        {
            errorEmmissionCount = errorEmmissionCount + 1;
            s = "Only and only one appender can be nested the <sift> element in SiftingAppender. See also http://logback.qos.ch/codes.html#1andOnly1";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}

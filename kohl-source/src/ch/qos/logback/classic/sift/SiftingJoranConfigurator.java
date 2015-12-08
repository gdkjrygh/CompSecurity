// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.sift;

import ch.qos.logback.classic.util.DefaultNestedComponentRules;
import fs.ch.qos.logback.core.Appender;
import fs.ch.qos.logback.core.joran.action.AppenderAction;
import fs.ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.joran.spi.Interpreter;
import fs.ch.qos.logback.core.joran.spi.Pattern;
import fs.ch.qos.logback.core.joran.spi.RuleStore;
import fs.ch.qos.logback.core.sift.SiftingJoranConfiguratorBase;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SiftingJoranConfigurator extends SiftingJoranConfiguratorBase
{

    String key;
    String value;

    SiftingJoranConfigurator(String s, String s1)
    {
        key = s;
        value = s1;
    }

    protected void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry defaultnestedcomponentregistry)
    {
        DefaultNestedComponentRules.addDefaultNestedComponentRegistryRules(defaultnestedcomponentregistry);
    }

    protected void addInstanceRules(RuleStore rulestore)
    {
        rulestore.addRule(new Pattern("configuration/appender"), new AppenderAction());
    }

    protected void buildInterpreter()
    {
        super.buildInterpreter();
        Object obj = interpreter.getInterpretationContext().getObjectMap();
        ((Map) (obj)).put("APPENDER_BAG", new HashMap());
        ((Map) (obj)).put("FILTER_CHAIN_BAG", new HashMap());
        obj = new HashMap();
        ((Map) (obj)).put(key, value);
        interpreter.setInterpretationContextPropertiesMap(((Map) (obj)));
    }

    public Appender getAppender()
    {
        Object obj = (HashMap)interpreter.getInterpretationContext().getObjectMap().get("APPENDER_BAG");
        oneAndOnlyOneCheck(((Map) (obj)));
        obj = ((HashMap) (obj)).values();
        if (((Collection) (obj)).size() == 0)
        {
            return null;
        } else
        {
            return (Appender)((Collection) (obj)).iterator().next();
        }
    }

    protected Pattern initialPattern()
    {
        return new Pattern("configuration");
    }
}

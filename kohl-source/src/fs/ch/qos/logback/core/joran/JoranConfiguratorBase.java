// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran;

import fs.ch.qos.logback.core.joran.action.AppenderAction;
import fs.ch.qos.logback.core.joran.action.AppenderRefAction;
import fs.ch.qos.logback.core.joran.action.ConversionRuleAction;
import fs.ch.qos.logback.core.joran.action.DefinePropertyAction;
import fs.ch.qos.logback.core.joran.action.NestedBasicPropertyIA;
import fs.ch.qos.logback.core.joran.action.NestedComplexPropertyIA;
import fs.ch.qos.logback.core.joran.action.NewRuleAction;
import fs.ch.qos.logback.core.joran.action.ParamAction;
import fs.ch.qos.logback.core.joran.action.PropertyAction;
import fs.ch.qos.logback.core.joran.action.StatusListenerAction;
import fs.ch.qos.logback.core.joran.action.TimestampAction;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.joran.spi.Interpreter;
import fs.ch.qos.logback.core.joran.spi.Pattern;
import fs.ch.qos.logback.core.joran.spi.RuleStore;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package fs.ch.qos.logback.core.joran:
//            GenericConfigurator

public abstract class JoranConfiguratorBase extends GenericConfigurator
{

    public JoranConfiguratorBase()
    {
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

    protected void addInstanceRules(RuleStore rulestore)
    {
        rulestore.addRule(new Pattern("configuration/property"), new PropertyAction());
        rulestore.addRule(new Pattern("configuration/substitutionProperty"), new PropertyAction());
        rulestore.addRule(new Pattern("configuration/timestamp"), new TimestampAction());
        rulestore.addRule(new Pattern("configuration/define"), new DefinePropertyAction());
        rulestore.addRule(new Pattern("configuration/conversionRule"), new ConversionRuleAction());
        rulestore.addRule(new Pattern("configuration/statusListener"), new StatusListenerAction());
        rulestore.addRule(new Pattern("configuration/appender"), new AppenderAction());
        rulestore.addRule(new Pattern("configuration/appender/appender-ref"), new AppenderRefAction());
        rulestore.addRule(new Pattern("configuration/newRule"), new NewRuleAction());
        rulestore.addRule(new Pattern("*/param"), new ParamAction());
    }

    protected void buildInterpreter()
    {
        super.buildInterpreter();
        Map map = interpreter.getInterpretationContext().getObjectMap();
        map.put("APPENDER_BAG", new HashMap());
        map.put("FILTER_CHAIN_BAG", new HashMap());
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.joran;

import ch.qos.logback.classic.joran.action.ConditionalIncludeAction;
import ch.qos.logback.classic.joran.action.ConfigurationAction;
import ch.qos.logback.classic.joran.action.ConsolePluginAction;
import ch.qos.logback.classic.joran.action.ContextNameAction;
import ch.qos.logback.classic.joran.action.FindIncludeAction;
import ch.qos.logback.classic.joran.action.LevelAction;
import ch.qos.logback.classic.joran.action.LoggerAction;
import ch.qos.logback.classic.joran.action.LoggerContextListenerAction;
import ch.qos.logback.classic.joran.action.RootLoggerAction;
import ch.qos.logback.classic.sift.SiftAction;
import ch.qos.logback.classic.util.DefaultNestedComponentRules;
import fs.ch.qos.logback.core.joran.JoranConfiguratorBase;
import fs.ch.qos.logback.core.joran.action.AppenderRefAction;
import fs.ch.qos.logback.core.joran.action.IncludeAction;
import fs.ch.qos.logback.core.joran.action.NOPAction;
import fs.ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import fs.ch.qos.logback.core.joran.spi.Pattern;
import fs.ch.qos.logback.core.joran.spi.RuleStore;

public class JoranConfigurator extends JoranConfiguratorBase
{

    public JoranConfigurator()
    {
    }

    protected void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry defaultnestedcomponentregistry)
    {
        DefaultNestedComponentRules.addDefaultNestedComponentRegistryRules(defaultnestedcomponentregistry);
    }

    public void addInstanceRules(RuleStore rulestore)
    {
        super.addInstanceRules(rulestore);
        rulestore.addRule(new Pattern("configuration"), new ConfigurationAction());
        rulestore.addRule(new Pattern("configuration/contextName"), new ContextNameAction());
        rulestore.addRule(new Pattern("configuration/contextListener"), new LoggerContextListenerAction());
        rulestore.addRule(new Pattern("configuration/appender/sift"), new SiftAction());
        rulestore.addRule(new Pattern("configuration/appender/sift/*"), new NOPAction());
        rulestore.addRule(new Pattern("configuration/logger"), new LoggerAction());
        rulestore.addRule(new Pattern("configuration/logger/level"), new LevelAction());
        rulestore.addRule(new Pattern("configuration/root"), new RootLoggerAction());
        rulestore.addRule(new Pattern("configuration/root/level"), new LevelAction());
        rulestore.addRule(new Pattern("configuration/logger/appender-ref"), new AppenderRefAction());
        rulestore.addRule(new Pattern("configuration/root/appender-ref"), new AppenderRefAction());
        rulestore.addRule(new Pattern("configuration/include"), new IncludeAction());
        rulestore.addRule(new Pattern("configuration/consolePlugin"), new ConsolePluginAction());
        rulestore.addRule(new Pattern("configuration/includes"), new FindIncludeAction());
        rulestore.addRule(new Pattern("configuration/includes/include"), new ConditionalIncludeAction());
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.turbo.ReconfigureOnChangeFilter;
import fs.ch.qos.logback.core.joran.action.Action;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.status.OnConsoleStatusListener;
import fs.ch.qos.logback.core.util.ContextUtil;
import fs.ch.qos.logback.core.util.Duration;
import fs.ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

public class ConfigurationAction extends Action
{

    public ConfigurationAction()
    {
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
    {
        String s1 = OptionHelper.getSystemProperty("logback.debug");
        s = s1;
        if (s1 == null)
        {
            s = interpretationcontext.subst(attributes.getValue("debug"));
        }
        if (OptionHelper.isEmpty(s) || s.equalsIgnoreCase("false") || s.equalsIgnoreCase("null"))
        {
            addInfo("debug attribute not set");
        } else
        {
            OnConsoleStatusListener.addNewInstanceToContext(context);
        }
        processScanAttrib(interpretationcontext, attributes);
        (new ContextUtil(context)).addHostNameAsProperty();
        interpretationcontext.pushObject(getContext());
    }

    public void end(InterpretationContext interpretationcontext, String s)
    {
        addInfo("End of configuration.");
        interpretationcontext.popObject();
    }

    void processScanAttrib(InterpretationContext interpretationcontext, Attributes attributes)
    {
        String s = interpretationcontext.subst(attributes.getValue("scan"));
        if (!OptionHelper.isEmpty(s) && !"false".equalsIgnoreCase(s))
        {
            ReconfigureOnChangeFilter reconfigureonchangefilter = new ReconfigureOnChangeFilter();
            reconfigureonchangefilter.setContext(context);
            interpretationcontext = interpretationcontext.subst(attributes.getValue("scanPeriod"));
            if (!OptionHelper.isEmpty(interpretationcontext))
            {
                try
                {
                    interpretationcontext = Duration.valueOf(interpretationcontext);
                    reconfigureonchangefilter.setRefreshPeriod(interpretationcontext.getMilliseconds());
                    addInfo((new StringBuilder()).append("Setting ReconfigureOnChangeFilter scanning period to ").append(interpretationcontext).toString());
                }
                // Misplaced declaration of an exception variable
                catch (InterpretationContext interpretationcontext)
                {
                    addError((new StringBuilder()).append("Error while converting [").append(s).append("] to long").toString(), interpretationcontext);
                }
            }
            reconfigureonchangefilter.start();
            interpretationcontext = (LoggerContext)context;
            addInfo("Adding ReconfigureOnChangeFilter as a turbo filter");
            interpretationcontext.addTurboFilter(reconfigureonchangefilter);
        }
    }
}

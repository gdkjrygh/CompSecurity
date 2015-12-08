// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import fs.ch.qos.logback.core.joran.action.Action;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

public class LoggerAction extends Action
{

    boolean inError;
    Logger logger;

    public LoggerAction()
    {
        inError = false;
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
    {
        inError = false;
        logger = null;
        LoggerContext loggercontext = (LoggerContext)context;
        String s1 = interpretationcontext.subst(attributes.getValue("name"));
        if (OptionHelper.isEmpty(s1))
        {
            inError = true;
            interpretationcontext = getLineColStr(interpretationcontext);
            addError((new StringBuilder()).append("No 'name' attribute in element ").append(s).append(", around ").append(interpretationcontext).toString());
            return;
        }
        logger = loggercontext.getLogger(s1);
        s = interpretationcontext.subst(attributes.getValue("level"));
        if (!OptionHelper.isEmpty(s))
        {
            if ("INHERITED".equalsIgnoreCase(s) || "NULL".equalsIgnoreCase(s))
            {
                addInfo((new StringBuilder()).append("Setting level of logger [").append(s1).append("] to null, i.e. INHERITED").toString());
                logger.setLevel(null);
            } else
            {
                s = Level.toLevel(s);
                addInfo((new StringBuilder()).append("Setting level of logger [").append(s1).append("] to ").append(s).toString());
                logger.setLevel(s);
            }
        }
        s = interpretationcontext.subst(attributes.getValue("additivity"));
        if (!OptionHelper.isEmpty(s))
        {
            boolean flag = OptionHelper.toBoolean(s, true);
            addInfo((new StringBuilder()).append("Setting additivity of logger [").append(s1).append("] to ").append(flag).toString());
            logger.setAdditive(flag);
        }
        interpretationcontext.pushObject(logger);
    }

    public void end(InterpretationContext interpretationcontext, String s)
    {
        if (inError)
        {
            return;
        }
        s = ((String) (interpretationcontext.peekObject()));
        if (s != logger)
        {
            addWarn((new StringBuilder()).append("The object on the top the of the stack is not ").append(logger).append(" pushed earlier").toString());
            addWarn((new StringBuilder()).append("It is: ").append(s).toString());
            return;
        } else
        {
            interpretationcontext.popObject();
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.LoggerContextListener;
import fs.ch.qos.logback.core.joran.action.Action;
import fs.ch.qos.logback.core.joran.spi.ActionException;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.spi.ContextAware;
import fs.ch.qos.logback.core.spi.LifeCycle;
import fs.ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

public class LoggerContextListenerAction extends Action
{

    boolean inError;
    LoggerContextListener lcl;

    public LoggerContextListenerAction()
    {
        inError = false;
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
        throws ActionException
    {
        inError = false;
        s = attributes.getValue("class");
        if (OptionHelper.isEmpty(s))
        {
            addError("Mandatory \"class\" attribute not set for <loggerContextListener> element");
            inError = true;
            return;
        }
        try
        {
            lcl = (LoggerContextListener)OptionHelper.instantiateByClassName(s, ch/qos/logback/classic/spi/LoggerContextListener, context);
            if (lcl instanceof ContextAware)
            {
                ((ContextAware)lcl).setContext(context);
            }
            interpretationcontext.pushObject(lcl);
            addInfo((new StringBuilder()).append("Adding LoggerContextListener of type [").append(s).append("] to the object stack").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InterpretationContext interpretationcontext)
        {
            inError = true;
        }
        addError((new StringBuilder()).append("Could not create LoggerContextListener of type ").append(s).append("].").toString(), interpretationcontext);
    }

    public void end(InterpretationContext interpretationcontext, String s)
        throws ActionException
    {
        if (inError)
        {
            return;
        }
        if (interpretationcontext.peekObject() != lcl)
        {
            addWarn("The object on the top the of the stack is not the LoggerContextListener pushed earlier.");
            return;
        }
        if (lcl instanceof LifeCycle)
        {
            ((LifeCycle)lcl).start();
            addInfo("Starting LoggerContextListener");
        }
        ((LoggerContext)context).addListener(lcl);
        interpretationcontext.popObject();
    }
}

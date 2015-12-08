// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.net.SocketAppender;
import fs.ch.qos.logback.core.joran.action.Action;
import fs.ch.qos.logback.core.joran.spi.ActionException;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import org.xml.sax.Attributes;

public class ConsolePluginAction extends Action
{

    private static final Integer DEFAULT_PORT = Integer.valueOf(4321);

    public ConsolePluginAction()
    {
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
        throws ActionException
    {
        attributes = attributes.getValue("port");
        if (attributes == null)
        {
            s = DEFAULT_PORT;
        } else
        {
            try
            {
                s = Integer.valueOf(attributes);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                addError((new StringBuilder()).append("Port ").append(attributes).append(" in ConsolePlugin config is not a correct number").toString());
                s = null;
            }
        }
        interpretationcontext = (LoggerContext)interpretationcontext.getContext();
        attributes = new SocketAppender();
        attributes.setContext(interpretationcontext);
        attributes.setIncludeCallerData(true);
        attributes.setRemoteHost("localhost");
        attributes.setPort(s.intValue());
        attributes.start();
        interpretationcontext.getLogger("ROOT").addAppender(attributes);
        addInfo((new StringBuilder()).append("Sending LoggingEvents to the plugin using port ").append(s).toString());
    }

    public void end(InterpretationContext interpretationcontext, String s)
        throws ActionException
    {
    }

}

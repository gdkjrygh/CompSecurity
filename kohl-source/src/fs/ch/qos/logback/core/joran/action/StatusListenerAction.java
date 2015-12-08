// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.action;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.joran.spi.ActionException;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.spi.ContextAware;
import fs.ch.qos.logback.core.spi.LifeCycle;
import fs.ch.qos.logback.core.status.OnConsoleStatusListener;
import fs.ch.qos.logback.core.status.StatusListener;
import fs.ch.qos.logback.core.status.StatusManager;
import fs.ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

// Referenced classes of package fs.ch.qos.logback.core.joran.action:
//            Action

public class StatusListenerAction extends Action
{

    boolean inError;
    StatusListener statusListener;

    public StatusListenerAction()
    {
        inError = false;
        statusListener = null;
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
        throws ActionException
    {
        inError = false;
        attributes = attributes.getValue("class");
        if (OptionHelper.isEmpty(attributes))
        {
            addError((new StringBuilder()).append("Missing class name for statusListener. Near [").append(s).append("] line ").append(getLineNumber(interpretationcontext)).toString());
            inError = true;
            return;
        }
        if (!fs/ch/qos/logback/core/status/OnConsoleStatusListener.getName().equals(attributes))
        {
            break MISSING_BLOCK_LABEL_163;
        }
        OnConsoleStatusListener.addNewInstanceToContext(context);
_L1:
        addInfo((new StringBuilder()).append("Added status listener of type [").append(attributes).append("]").toString());
        interpretationcontext.pushObject(statusListener);
        return;
        try
        {
            statusListener = (StatusListener)OptionHelper.instantiateByClassName(attributes, fs/ch/qos/logback/core/status/StatusListener, context);
            interpretationcontext.getContext().getStatusManager().add(statusListener);
            if (statusListener instanceof ContextAware)
            {
                ((ContextAware)statusListener).setContext(context);
            }
        }
        // Misplaced declaration of an exception variable
        catch (InterpretationContext interpretationcontext)
        {
            inError = true;
            addError((new StringBuilder()).append("Could not create an StatusListener of type [").append(attributes).append("].").toString(), interpretationcontext);
            throw new ActionException(interpretationcontext);
        }
          goto _L1
    }

    public void end(InterpretationContext interpretationcontext, String s)
    {
        if (inError)
        {
            return;
        }
        if (statusListener instanceof LifeCycle)
        {
            ((LifeCycle)statusListener).start();
        }
        if (interpretationcontext.peekObject() != statusListener)
        {
            addWarn("The object at the of the stack is not the statusListener pushed earlier.");
            return;
        } else
        {
            interpretationcontext.popObject();
            return;
        }
    }
}

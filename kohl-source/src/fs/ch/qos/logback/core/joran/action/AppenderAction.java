// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.action;

import fs.ch.qos.logback.core.Appender;
import fs.ch.qos.logback.core.joran.spi.ActionException;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.spi.LifeCycle;
import fs.ch.qos.logback.core.util.OptionHelper;
import java.util.HashMap;
import java.util.Map;
import org.xml.sax.Attributes;

// Referenced classes of package fs.ch.qos.logback.core.joran.action:
//            Action

public class AppenderAction extends Action
{

    Appender appender;
    private boolean inError;

    public AppenderAction()
    {
        inError = false;
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
        throws ActionException
    {
        String s1;
        appender = null;
        inError = false;
        s1 = attributes.getValue("class");
        if (OptionHelper.isEmpty(s1))
        {
            addError((new StringBuilder()).append("Missing class name for appender. Near [").append(s).append("] line ").append(getLineNumber(interpretationcontext)).toString());
            inError = true;
            return;
        }
        addInfo((new StringBuilder()).append("About to instantiate appender of type [").append(s1).append("]").toString());
        appender = (Appender)OptionHelper.instantiateByClassName(s1, fs/ch/qos/logback/core/Appender, context);
        appender.setContext(context);
        s = interpretationcontext.subst(attributes.getValue("name"));
        if (!OptionHelper.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_256;
        }
        addWarn((new StringBuilder()).append("No appender name given for appender of type ").append(s1).append("].").toString());
_L1:
        ((HashMap)interpretationcontext.getObjectMap().get("APPENDER_BAG")).put(s, appender);
        interpretationcontext.pushObject(appender);
        return;
        try
        {
            appender.setName(s);
            addInfo((new StringBuilder()).append("Naming appender as [").append(s).append("]").toString());
        }
        // Misplaced declaration of an exception variable
        catch (InterpretationContext interpretationcontext)
        {
            inError = true;
            addError((new StringBuilder()).append("Could not create an Appender of type [").append(s1).append("].").toString(), interpretationcontext);
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
        if (appender instanceof LifeCycle)
        {
            appender.start();
        }
        if (interpretationcontext.peekObject() != appender)
        {
            addWarn((new StringBuilder()).append("The object at the of the stack is not the appender named [").append(appender.getName()).append("] pushed earlier.").toString());
            return;
        } else
        {
            interpretationcontext.popObject();
            return;
        }
    }
}

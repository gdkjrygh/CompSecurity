// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.action;

import fs.ch.qos.logback.core.Appender;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.spi.AppenderAttachable;
import fs.ch.qos.logback.core.util.OptionHelper;
import java.util.HashMap;
import java.util.Map;
import org.xml.sax.Attributes;

// Referenced classes of package fs.ch.qos.logback.core.joran.action:
//            Action

public class AppenderRefAction extends Action
{

    boolean inError;

    public AppenderRefAction()
    {
        inError = false;
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
    {
        inError = false;
        Object obj = interpretationcontext.peekObject();
        if (!(obj instanceof AppenderAttachable))
        {
            interpretationcontext = (new StringBuilder()).append("Could not find an AppenderAttachable at the top of execution stack. Near [").append(s).append("] line ").append(getLineNumber(interpretationcontext)).toString();
            inError = true;
            addError(interpretationcontext);
            return;
        }
        s = (AppenderAttachable)obj;
        attributes = interpretationcontext.subst(attributes.getValue("ref"));
        if (OptionHelper.isEmpty(attributes))
        {
            inError = true;
            addError("Missing appender ref attribute in <appender-ref> tag.");
            return;
        }
        interpretationcontext = (Appender)((HashMap)interpretationcontext.getObjectMap().get("APPENDER_BAG")).get(attributes);
        if (interpretationcontext == null)
        {
            interpretationcontext = (new StringBuilder()).append("Could not find an appender named [").append(attributes).append("]. Did you define it below instead of above in the configuration file?").toString();
            inError = true;
            addError(interpretationcontext);
            addError("See http://logback.qos.ch/codes.html#appender_order for more details.");
            return;
        } else
        {
            addInfo((new StringBuilder()).append("Attaching appender named [").append(attributes).append("] to ").append(s).toString());
            s.addAppender(interpretationcontext);
            return;
        }
    }

    public void end(InterpretationContext interpretationcontext, String s)
    {
    }
}

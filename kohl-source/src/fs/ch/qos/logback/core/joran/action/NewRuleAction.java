// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.action;

import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.joran.spi.Interpreter;
import fs.ch.qos.logback.core.joran.spi.Pattern;
import fs.ch.qos.logback.core.joran.spi.RuleStore;
import fs.ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

// Referenced classes of package fs.ch.qos.logback.core.joran.action:
//            Action

public class NewRuleAction extends Action
{

    boolean inError;

    public NewRuleAction()
    {
        inError = false;
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
    {
        inError = false;
        s = attributes.getValue("pattern");
        attributes = attributes.getValue("actionClass");
        if (OptionHelper.isEmpty(s))
        {
            inError = true;
            addError("No 'pattern' attribute in <newRule>");
            return;
        }
        if (OptionHelper.isEmpty(attributes))
        {
            inError = true;
            addError("No 'actionClass' attribute in <newRule>");
            return;
        }
        try
        {
            addInfo((new StringBuilder()).append("About to add new Joran parsing rule [").append(s).append(",").append(attributes).append("].").toString());
            interpretationcontext.getJoranInterpreter().getRuleStore().addRule(new Pattern(s), attributes);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InterpretationContext interpretationcontext)
        {
            inError = true;
        }
        addError((new StringBuilder()).append("Could not add new Joran parsing rule [").append(s).append(",").append(attributes).append("]").toString());
    }

    public void end(InterpretationContext interpretationcontext, String s)
    {
    }
}

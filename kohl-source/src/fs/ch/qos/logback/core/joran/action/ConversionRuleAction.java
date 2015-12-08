// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.action;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.util.OptionHelper;
import java.util.HashMap;
import java.util.Map;
import org.xml.sax.Attributes;

// Referenced classes of package fs.ch.qos.logback.core.joran.action:
//            Action

public class ConversionRuleAction extends Action
{

    boolean inError;

    public ConversionRuleAction()
    {
        inError = false;
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
    {
        inError = false;
        String s1 = attributes.getValue("conversionWord");
        attributes = attributes.getValue("converterClass");
        if (OptionHelper.isEmpty(s1))
        {
            inError = true;
            addError("No 'conversionWord' attribute in <conversionRule>");
            return;
        }
        if (OptionHelper.isEmpty(attributes))
        {
            inError = true;
            interpretationcontext.addError("No 'converterClass' attribute in <conversionRule>");
            return;
        }
        try
        {
            s = (Map)context.getObject("PATTERN_RULE_REGISTRY");
        }
        // Misplaced declaration of an exception variable
        catch (InterpretationContext interpretationcontext)
        {
            inError = true;
            addError("Could not add conversion rule to PatternLayout.");
            return;
        }
        interpretationcontext = s;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        interpretationcontext = new HashMap();
        context.putObject("PATTERN_RULE_REGISTRY", interpretationcontext);
        addInfo((new StringBuilder()).append("registering conversion word ").append(s1).append(" with class [").append(attributes).append("]").toString());
        interpretationcontext.put(s1, attributes);
        return;
    }

    public void end(InterpretationContext interpretationcontext, String s)
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.action;

import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.joran.util.PropertySetter;
import org.xml.sax.Attributes;

// Referenced classes of package fs.ch.qos.logback.core.joran.action:
//            Action

public class ParamAction extends Action
{

    static String NO_NAME = "No name attribute in <param> element";
    static String NO_VALUE = "No value attribute in <param> element";
    boolean inError;

    public ParamAction()
    {
        inError = false;
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
    {
        s = attributes.getValue("name");
        attributes = attributes.getValue("value");
        if (s == null)
        {
            inError = true;
            addError(NO_NAME);
            return;
        }
        if (attributes == null)
        {
            inError = true;
            addError(NO_VALUE);
            return;
        } else
        {
            String s1 = attributes.trim();
            attributes = new PropertySetter(interpretationcontext.peekObject());
            attributes.setContext(context);
            s1 = interpretationcontext.subst(s1);
            attributes.setProperty(interpretationcontext.subst(s), s1);
            return;
        }
    }

    public void end(InterpretationContext interpretationcontext, String s)
    {
    }

}

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

public class RootLoggerAction extends Action
{

    boolean inError;
    Logger root;

    public RootLoggerAction()
    {
        inError = false;
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
    {
        inError = false;
        root = ((LoggerContext)context).getLogger("ROOT");
        s = interpretationcontext.subst(attributes.getValue("level"));
        if (!OptionHelper.isEmpty(s))
        {
            s = Level.toLevel(s);
            addInfo((new StringBuilder()).append("Setting level of ROOT logger to ").append(s).toString());
            root.setLevel(s);
        }
        interpretationcontext.pushObject(root);
    }

    public void end(InterpretationContext interpretationcontext, String s)
    {
        if (inError)
        {
            return;
        }
        s = ((String) (interpretationcontext.peekObject()));
        if (s != root)
        {
            addWarn("The object on the top the of the stack is not the root logger");
            addWarn((new StringBuilder()).append("It is: ").append(s).toString());
            return;
        } else
        {
            interpretationcontext.popObject();
            return;
        }
    }
}

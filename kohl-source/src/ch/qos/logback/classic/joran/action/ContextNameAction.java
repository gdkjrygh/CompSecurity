// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.joran.action;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.joran.action.Action;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import org.xml.sax.Attributes;

public class ContextNameAction extends Action
{

    public ContextNameAction()
    {
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
    {
    }

    public void body(InterpretationContext interpretationcontext, String s)
    {
        interpretationcontext = interpretationcontext.subst(s);
        addInfo((new StringBuilder()).append("Setting logger context name as [").append(interpretationcontext).append("]").toString());
        try
        {
            context.setName(interpretationcontext);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            addError((new StringBuilder()).append("Failed to rename context [").append(context.getName()).append("] as [").append(interpretationcontext).append("]").toString(), s);
        }
    }

    public void end(InterpretationContext interpretationcontext, String s)
    {
    }
}

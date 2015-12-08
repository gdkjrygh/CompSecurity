// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import fs.ch.qos.logback.core.joran.action.Action;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import org.xml.sax.Attributes;

public class LevelAction extends Action
{

    boolean inError;

    public LevelAction()
    {
        inError = false;
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
    {
        s = ((String) (interpretationcontext.peekObject()));
        if (!(s instanceof Logger))
        {
            inError = true;
            addError("For element <level>, could not find a logger at the top of execution stack.");
            return;
        }
        s = (Logger)s;
        String s1 = s.getName();
        interpretationcontext = interpretationcontext.subst(attributes.getValue("value"));
        if ("INHERITED".equalsIgnoreCase(interpretationcontext) || "NULL".equalsIgnoreCase(interpretationcontext))
        {
            s.setLevel(null);
        } else
        {
            s.setLevel(Level.toLevel(interpretationcontext, Level.DEBUG));
        }
        addInfo((new StringBuilder()).append(s1).append(" level set to ").append(s.getLevel()).toString());
    }

    public void end(InterpretationContext interpretationcontext, String s)
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.action;

import fs.ch.qos.logback.core.joran.spi.ActionException;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.joran.spi.Interpreter;
import fs.ch.qos.logback.core.spi.ContextAwareBase;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;

public abstract class Action extends ContextAwareBase
{

    public Action()
    {
    }

    public abstract void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
        throws ActionException;

    public void body(InterpretationContext interpretationcontext, String s)
        throws ActionException
    {
    }

    public abstract void end(InterpretationContext interpretationcontext, String s)
        throws ActionException;

    protected int getColumnNumber(InterpretationContext interpretationcontext)
    {
        interpretationcontext = interpretationcontext.getJoranInterpreter().getLocator();
        if (interpretationcontext != null)
        {
            return interpretationcontext.getColumnNumber();
        } else
        {
            return -1;
        }
    }

    protected String getLineColStr(InterpretationContext interpretationcontext)
    {
        return (new StringBuilder()).append("line: ").append(getLineNumber(interpretationcontext)).append(", column: ").append(getColumnNumber(interpretationcontext)).toString();
    }

    protected int getLineNumber(InterpretationContext interpretationcontext)
    {
        interpretationcontext = interpretationcontext.getJoranInterpreter().getLocator();
        if (interpretationcontext != null)
        {
            return interpretationcontext.getLineNumber();
        } else
        {
            return -1;
        }
    }

    public String toString()
    {
        return getClass().getName();
    }
}

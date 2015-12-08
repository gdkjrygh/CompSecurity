// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.action;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.joran.spi.ActionException;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.util.CachingDateFormatter;
import fs.ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

// Referenced classes of package fs.ch.qos.logback.core.joran.action:
//            Action

public class TimestampAction extends Action
{

    static String CONTEXT_BIRTH = "contextBirth";
    static String DATE_PATTERN_ATTRIBUTE = "datePattern";
    static String TIME_REFERENCE_ATTRIBUTE = "timeReference";
    boolean inError;

    public TimestampAction()
    {
        inError = false;
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
        throws ActionException
    {
        interpretationcontext = attributes.getValue("key");
        if (OptionHelper.isEmpty(interpretationcontext))
        {
            addError("Attribute named [key] cannot be empty");
            inError = true;
        }
        s = attributes.getValue(DATE_PATTERN_ATTRIBUTE);
        if (OptionHelper.isEmpty(s))
        {
            addError((new StringBuilder()).append("Attribute named [").append(DATE_PATTERN_ATTRIBUTE).append("] cannot be empty").toString());
            inError = true;
        }
        attributes = attributes.getValue(TIME_REFERENCE_ATTRIBUTE);
        long l;
        if (CONTEXT_BIRTH.equalsIgnoreCase(attributes))
        {
            addInfo("Using context birth as time reference.");
            l = context.getBirthTime();
        } else
        {
            l = System.currentTimeMillis();
            addInfo("Using current interpretation time, i.e. now, as time reference.");
        }
        if (inError)
        {
            return;
        } else
        {
            s = (new CachingDateFormatter(s)).format(l);
            addInfo((new StringBuilder()).append("Adding property to the context with key=\"").append(interpretationcontext).append("\" and value=\"").append(s).append("\" to the context").toString());
            context.putProperty(interpretationcontext, s);
            return;
        }
    }

    public void end(InterpretationContext interpretationcontext, String s)
        throws ActionException
    {
    }

}

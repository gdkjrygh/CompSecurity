// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.sift;

import fs.ch.qos.logback.core.joran.action.Action;
import fs.ch.qos.logback.core.joran.event.InPlayListener;
import fs.ch.qos.logback.core.joran.event.SaxEvent;
import fs.ch.qos.logback.core.joran.spi.ActionException;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;

// Referenced classes of package ch.qos.logback.classic.sift:
//            SiftingAppender, AppenderFactory

public class SiftAction extends Action
    implements InPlayListener
{

    List seList;

    public SiftAction()
    {
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
        throws ActionException
    {
        seList = new ArrayList();
        interpretationcontext.addInPlayListener(this);
    }

    public void end(InterpretationContext interpretationcontext, String s)
        throws ActionException
    {
        interpretationcontext.removeInPlayListener(this);
        interpretationcontext = ((InterpretationContext) (interpretationcontext.peekObject()));
        if (interpretationcontext instanceof SiftingAppender)
        {
            interpretationcontext = (SiftingAppender)interpretationcontext;
            interpretationcontext.setAppenderFactory(new AppenderFactory(seList, interpretationcontext.getDiscriminatorKey()));
        }
    }

    public void inPlay(SaxEvent saxevent)
    {
        seList.add(saxevent);
    }
}

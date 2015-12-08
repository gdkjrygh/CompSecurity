// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.android.ASaxEventRecorder;
import fs.ch.qos.logback.core.joran.action.IncludeAction;
import fs.ch.qos.logback.core.joran.event.SaxEventRecorder;
import fs.ch.qos.logback.core.joran.spi.ActionException;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.joran.spi.JoranException;
import java.io.InputStream;
import java.net.URL;
import org.xml.sax.Attributes;

public class FindIncludeAction extends IncludeAction
{

    public FindIncludeAction()
    {
        setEventOffset(1);
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
        throws ActionException
    {
    }

    protected SaxEventRecorder createRecorder(InputStream inputstream, URL url)
    {
        if (url.toString().endsWith("AndroidManifest.xml"))
        {
            inputstream = new ASaxEventRecorder();
            inputstream.setFilter(new String[] {
                "logback"
            });
            return inputstream;
        } else
        {
            return new SaxEventRecorder();
        }
    }

    public void end(InterpretationContext interpretationcontext, String s)
        throws ActionException
    {
        if (interpretationcontext.isEmpty() || !(interpretationcontext.peekObject() instanceof ConditionalIncludeAction.State))
        {
            break MISSING_BLOCK_LABEL_69;
        }
        s = ((ConditionalIncludeAction.State)interpretationcontext.popObject()).getUrl();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        addInfo((new StringBuilder()).append("Path found [").append(s.toString()).append("]").toString());
        processInclude(interpretationcontext, s);
        return;
        interpretationcontext;
        addError((new StringBuilder()).append("Failed to process include [").append(s.toString()).append("]").toString(), interpretationcontext);
        return;
        addInfo("No paths found from includes");
        return;
    }
}

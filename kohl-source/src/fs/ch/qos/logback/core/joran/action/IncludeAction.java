// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.action;

import fs.ch.qos.logback.core.joran.event.SaxEvent;
import fs.ch.qos.logback.core.joran.event.SaxEventRecorder;
import fs.ch.qos.logback.core.joran.spi.EventPlayer;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.joran.spi.Interpreter;
import fs.ch.qos.logback.core.joran.spi.JoranException;
import fs.ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

// Referenced classes of package fs.ch.qos.logback.core.joran.action:
//            AbstractIncludeAction

public class IncludeAction extends AbstractIncludeAction
{

    private int eventOffset;

    public IncludeAction()
    {
        eventOffset = 2;
    }

    private InputStream openURL(URL url)
    {
        InputStream inputstream;
        try
        {
            inputstream = url.openStream();
        }
        catch (IOException ioexception)
        {
            addError((new StringBuilder()).append("Failed to open [").append(url.toString()).append("]").toString(), ioexception);
            return null;
        }
        return inputstream;
    }

    private void trimHeadAndTail(SaxEventRecorder saxeventrecorder)
    {
        saxeventrecorder = saxeventrecorder.getSaxEventList();
        if (saxeventrecorder.size() != 0)
        {
            SaxEvent saxevent = (SaxEvent)saxeventrecorder.get(0);
            boolean flag;
            boolean flag1;
            if (saxevent != null)
            {
                flag = "included".equalsIgnoreCase(saxevent.qName);
                flag1 = "configuration".equalsIgnoreCase(saxevent.qName);
            } else
            {
                flag1 = false;
                flag = false;
            }
            if (flag || flag1)
            {
                saxeventrecorder.remove(0);
                int i = saxeventrecorder.size();
                if (i != 0)
                {
                    i--;
                    SaxEvent saxevent1 = (SaxEvent)saxeventrecorder.get(i);
                    if (saxevent1 != null && flag && "included".equalsIgnoreCase(saxevent1.qName) || flag1 && "configuration".equalsIgnoreCase(saxevent1.qName))
                    {
                        saxeventrecorder.remove(i);
                        return;
                    }
                }
            }
        }
    }

    protected SaxEventRecorder createRecorder(InputStream inputstream, URL url)
    {
        return new SaxEventRecorder();
    }

    protected void processInclude(InterpretationContext interpretationcontext, URL url)
        throws JoranException
    {
        InputStream inputstream;
        inputstream = openURL(url);
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        ConfigurationWatchListUtil.addToWatchList(getContext(), url);
        SaxEventRecorder saxeventrecorder = createRecorder(inputstream, url);
        saxeventrecorder.setContext(getContext());
        saxeventrecorder.recordEvents(inputstream);
        trimHeadAndTail(saxeventrecorder);
        interpretationcontext.getJoranInterpreter().getEventPlayer().addEventsDynamically(saxeventrecorder.getSaxEventList(), eventOffset);
        close(inputstream);
        return;
        interpretationcontext;
        addError((new StringBuilder()).append("Failed processing [").append(url.toString()).append("]").toString(), interpretationcontext);
        close(inputstream);
        return;
        interpretationcontext;
        close(inputstream);
        throw interpretationcontext;
    }

    protected void setEventOffset(int i)
    {
        eventOffset = i;
    }
}

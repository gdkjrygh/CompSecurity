// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.joran.action;

import fs.ch.qos.logback.core.joran.action.AbstractIncludeAction;
import fs.ch.qos.logback.core.joran.spi.ActionException;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.joran.spi.JoranException;
import java.io.FileNotFoundException;
import java.net.URL;
import java.net.UnknownHostException;
import org.xml.sax.Attributes;

public class ConditionalIncludeAction extends AbstractIncludeAction
{
    class State
    {

        final ConditionalIncludeAction this$0;
        private URL url;

        URL getUrl()
        {
            return url;
        }

        void setUrl(URL url1)
        {
            url = url1;
        }

        State()
        {
            this$0 = ConditionalIncludeAction.this;
            super();
        }
    }


    public ConditionalIncludeAction()
    {
    }

    private URL peekPath(InterpretationContext interpretationcontext)
    {
        if (!interpretationcontext.isEmpty())
        {
            interpretationcontext = ((InterpretationContext) (interpretationcontext.peekObject()));
            if (interpretationcontext instanceof State)
            {
                interpretationcontext = ((State)interpretationcontext).getUrl();
                if (interpretationcontext != null)
                {
                    return interpretationcontext;
                }
            }
        }
        return null;
    }

    private URL pushPath(InterpretationContext interpretationcontext, URL url)
    {
        State state = new State();
        state.setUrl(url);
        interpretationcontext.pushObject(state);
        return url;
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
        throws ActionException
    {
        if (peekPath(interpretationcontext) != null)
        {
            return;
        } else
        {
            super.begin(interpretationcontext, s, attributes);
            return;
        }
    }

    protected void handleError(String s, Exception exception)
    {
        if (exception != null && !(exception instanceof FileNotFoundException) && !(exception instanceof UnknownHostException))
        {
            addWarn(s, exception);
            return;
        } else
        {
            addInfo(s);
            return;
        }
    }

    protected void processInclude(InterpretationContext interpretationcontext, URL url)
        throws JoranException
    {
        pushPath(interpretationcontext, url);
    }
}

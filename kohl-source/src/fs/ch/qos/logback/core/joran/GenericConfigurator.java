// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.joran.event.SaxEventRecorder;
import fs.ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import fs.ch.qos.logback.core.joran.spi.EventPlayer;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.joran.spi.Interpreter;
import fs.ch.qos.logback.core.joran.spi.JoranException;
import fs.ch.qos.logback.core.joran.spi.Pattern;
import fs.ch.qos.logback.core.joran.spi.RuleStore;
import fs.ch.qos.logback.core.joran.spi.SimpleRuleStore;
import fs.ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import fs.ch.qos.logback.core.spi.ContextAwareBase;
import fs.ch.qos.logback.core.status.StatusChecker;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.xml.sax.InputSource;

public abstract class GenericConfigurator extends ContextAwareBase
{

    protected Interpreter interpreter;

    public GenericConfigurator()
    {
    }

    private final void doConfigure(InputSource inputsource)
        throws JoranException
    {
        long l = System.currentTimeMillis();
        if (!ConfigurationWatchListUtil.wasConfigurationWatchListReset(context))
        {
            informContextOfURLUsedForConfiguration(getContext(), null);
        }
        SaxEventRecorder saxeventrecorder = new SaxEventRecorder();
        saxeventrecorder.setContext(context);
        saxeventrecorder.recordEvents(inputsource);
        doConfigure(saxeventrecorder.getSaxEventList());
        if ((new StatusChecker(context)).noXMLParsingErrorsOccurred(l))
        {
            addInfo("Registering current configuration as safe fallback point");
            registerSafeConfiguration();
        }
    }

    public static void informContextOfURLUsedForConfiguration(Context context, URL url)
    {
        ConfigurationWatchListUtil.setMainWatchURL(context, url);
    }

    protected void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry defaultnestedcomponentregistry)
    {
    }

    protected abstract void addImplicitRules(Interpreter interpreter1);

    protected abstract void addInstanceRules(RuleStore rulestore);

    protected void buildInterpreter()
    {
        Object obj = new SimpleRuleStore(context);
        addInstanceRules(((RuleStore) (obj)));
        interpreter = new Interpreter(context, ((RuleStore) (obj)), initialPattern());
        obj = interpreter.getInterpretationContext();
        ((InterpretationContext) (obj)).setContext(context);
        addImplicitRules(interpreter);
        addDefaultNestedComponentRegistryRules(((InterpretationContext) (obj)).getDefaultNestedComponentRegistry());
    }

    public final void doConfigure(InputStream inputstream)
        throws JoranException
    {
        doConfigure(new InputSource(inputstream));
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            addError("Could not close the stream", inputstream);
        }
        throw new JoranException("Could not close the stream", inputstream);
        Exception exception;
        exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            addError("Could not close the stream", inputstream);
            throw new JoranException("Could not close the stream", inputstream);
        }
        throw exception;
    }

    public final void doConfigure(URL url)
        throws JoranException
    {
        try
        {
            informContextOfURLUsedForConfiguration(getContext(), url);
            URLConnection urlconnection = url.openConnection();
            urlconnection.setUseCaches(false);
            doConfigure(urlconnection.getInputStream());
            return;
        }
        catch (IOException ioexception)
        {
            url = (new StringBuilder()).append("Could not open URL [").append(url).append("].").toString();
            addError(url, ioexception);
            throw new JoranException(url, ioexception);
        }
    }

    public void doConfigure(List list)
        throws JoranException
    {
        buildInterpreter();
        synchronized (context.getConfigurationLock())
        {
            interpreter.getEventPlayer().play(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    protected Pattern initialPattern()
    {
        return new Pattern();
    }

    public List recallSafeConfiguration()
    {
        return (List)context.getObject("SAFE_JORAN_CONFIGURATION");
    }

    public void registerSafeConfiguration()
    {
        context.putObject("SAFE_JORAN_CONFIGURATION", interpreter.getEventPlayer().getCopyOfPlayerEventList());
    }
}

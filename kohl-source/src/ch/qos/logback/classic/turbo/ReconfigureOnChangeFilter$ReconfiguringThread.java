// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.joran.spi.JoranException;
import fs.ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import fs.ch.qos.logback.core.status.StatusChecker;
import java.net.URL;
import java.util.List;

// Referenced classes of package ch.qos.logback.classic.turbo:
//            ReconfigureOnChangeFilter

class this._cls0
    implements Runnable
{

    final ReconfigureOnChangeFilter this$0;

    private void fallbackConfiguration(LoggerContext loggercontext, List list, URL url)
    {
        JoranConfigurator joranconfigurator = new JoranConfigurator();
        joranconfigurator.setContext(ReconfigureOnChangeFilter.access$500(ReconfigureOnChangeFilter.this));
        if (list != null)
        {
            addWarn("Falling back to previously registered safe configuration.");
            try
            {
                loggercontext.reset();
                JoranConfigurator.informContextOfURLUsedForConfiguration(ReconfigureOnChangeFilter.access$600(ReconfigureOnChangeFilter.this), url);
                joranconfigurator.doConfigure(list);
                addInfo("Re-registering previous fallback configuration once more as a fallback configuration point");
                joranconfigurator.registerSafeConfiguration();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (LoggerContext loggercontext)
            {
                addError("Unexpected exception thrown by a configuration considered safe.", loggercontext);
            }
            return;
        } else
        {
            addWarn("No previous configuration to fall back to.");
            return;
        }
    }

    private void performXMLConfiguration(LoggerContext loggercontext)
    {
        JoranConfigurator joranconfigurator = new JoranConfigurator();
        joranconfigurator.setContext(ReconfigureOnChangeFilter.access$200(ReconfigureOnChangeFilter.this));
        StatusChecker statuschecker = new StatusChecker(ReconfigureOnChangeFilter.access$300(ReconfigureOnChangeFilter.this));
        List list = joranconfigurator.recallSafeConfiguration();
        URL url = ConfigurationWatchListUtil.getMainWatchURL(ReconfigureOnChangeFilter.access$400(ReconfigureOnChangeFilter.this));
        loggercontext.reset();
        long l = System.currentTimeMillis();
        try
        {
            joranconfigurator.doConfigure(mainConfigurationURL);
            if (statuschecker.hasXMLParsingErrors(l))
            {
                fallbackConfiguration(loggercontext, list, url);
            }
            return;
        }
        catch (JoranException joranexception)
        {
            fallbackConfiguration(loggercontext, list, url);
        }
    }

    public void run()
    {
        if (mainConfigurationURL == null)
        {
            addInfo("Due to missing top level configuration file, skipping reconfiguration");
        } else
        {
            LoggerContext loggercontext = (LoggerContext)ReconfigureOnChangeFilter.access$000(ReconfigureOnChangeFilter.this);
            addInfo((new StringBuilder()).append("Will reset and reconfigure context named [").append(ReconfigureOnChangeFilter.access$100(ReconfigureOnChangeFilter.this).getName()).append("]").toString());
            if (mainConfigurationURL.toString().endsWith("xml"))
            {
                performXMLConfiguration(loggercontext);
                return;
            }
        }
    }

    ()
    {
        this$0 = ReconfigureOnChangeFilter.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.util;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import fs.ch.qos.logback.core.android.CommonPathUtil;
import fs.ch.qos.logback.core.joran.spi.JoranException;
import fs.ch.qos.logback.core.status.InfoStatus;
import fs.ch.qos.logback.core.status.StatusManager;
import fs.ch.qos.logback.core.util.Loader;
import fs.ch.qos.logback.core.util.OptionHelper;
import java.io.File;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

// Referenced classes of package ch.qos.logback.classic.util:
//            StatusListenerConfigHelper

public class ContextInitializer
{

    private static final String ASSETS_DIR = CommonPathUtil.getAssetsDirectoryPath();
    final ClassLoader classLoader = Loader.getClassLoaderOfObject(this);
    final LoggerContext loggerContext;

    public ContextInitializer(LoggerContext loggercontext)
    {
        loggerContext = loggercontext;
    }

    private URL findConfigFileFromSystemProperties(boolean flag)
    {
        ClassLoader classloader2;
        Object obj3;
        String s;
        classloader2 = null;
        obj3 = null;
        s = OptionHelper.getSystemProperty("logback.configurationFile");
        if (s == null) goto _L2; else goto _L1
_L1:
        Object obj = new File(s);
        if (!((File) (obj)).exists() || !((File) (obj)).isFile()) goto _L4; else goto _L3
_L3:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        statusOnResourceSearch(s, classLoader, s);
        obj = ((File) (obj)).toURI().toURL();
_L8:
        Object obj1;
        obj1 = obj;
        if (flag)
        {
            classloader2 = classLoader;
            obj1 = obj3;
            if (obj != null)
            {
                obj1 = ((URL) (obj)).toString();
            }
            statusOnResourceSearch(s, classloader2, ((String) (obj1)));
            obj1 = obj;
        }
_L6:
        return ((URL) (obj1));
_L4:
        try
        {
            obj = new URL(s);
            continue; /* Loop/switch isn't completed */
        }
        catch (MalformedURLException malformedurlexception) { }
        finally
        {
            if (flag)
            {
                ClassLoader classloader = classLoader;
                if (false)
                {
                    throw new NullPointerException();
                }
                statusOnResourceSearch(s, classloader, null);
            }
            throw exception;
        }
        malformedurlexception = Loader.getResource(s, classLoader);
        if (malformedurlexception == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = malformedurlexception;
        if (flag)
        {
            ClassLoader classloader3 = classLoader;
            Object obj2 = classloader2;
            if (malformedurlexception != null)
            {
                obj2 = malformedurlexception.toString();
            }
            statusOnResourceSearch(s, classloader3, ((String) (obj2)));
            return malformedurlexception;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (flag)
        {
            ClassLoader classloader1 = classLoader;
            if (malformedurlexception != null)
            {
                malformedurlexception = malformedurlexception.toString();
            } else
            {
                malformedurlexception = null;
            }
            statusOnResourceSearch(s, classloader1, malformedurlexception);
        }
_L2:
        return null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private InputStream findConfigFileURLFromAssets(boolean flag)
    {
        return getResource((new StringBuilder()).append(ASSETS_DIR).append("/").append("logback.xml").toString(), classLoader, flag);
    }

    private InputStream getResource(String s, ClassLoader classloader, boolean flag)
    {
        InputStream inputstream = classloader.getResourceAsStream(s);
        if (flag)
        {
            String s1 = null;
            if (inputstream != null)
            {
                s1 = s;
            }
            statusOnResourceSearch(s, classloader, s1);
        }
        return inputstream;
    }

    private void statusOnResourceSearch(String s, ClassLoader classloader, String s1)
    {
        classloader = loggerContext.getStatusManager();
        if (s1 == null)
        {
            classloader.add(new InfoStatus((new StringBuilder()).append("Could NOT find resource [").append(s).append("]").toString(), loggerContext));
            return;
        } else
        {
            classloader.add(new InfoStatus((new StringBuilder()).append("Found resource [").append(s).append("] at [").append(s1).append("]").toString(), loggerContext));
            return;
        }
    }

    public void autoConfig()
        throws JoranException
    {
        StatusListenerConfigHelper.installIfAsked(loggerContext);
        boolean flag = false;
        JoranConfigurator joranconfigurator = new JoranConfigurator();
        joranconfigurator.setContext(loggerContext);
        URL url = findConfigFileFromSystemProperties(true);
        if (url != null)
        {
            joranconfigurator.doConfigure(url);
            flag = true;
        }
        if (!flag)
        {
            InputStream inputstream = findConfigFileURLFromAssets(true);
            if (inputstream != null)
            {
                joranconfigurator.doConfigure(inputstream);
            }
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import com.skype.android.util.Charsets;
import com.skype.android.util.DeviceFeatures;
import com.skype.android.util.MethodTrace;
import com.skype.android.util.permission.Permission;
import com.skype.android.util.permission.PermissionUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.config:
//            ApplicationConfig, PropertiesApplicable, SkypeLogFormatter, LoggingConfig, 
//            LogNameFilter

public class ConfigUpdater
{

    private static final String APP_LOG_FILENAME = "skype_app.log";
    private static final String LOCAL_CONFIG_FILENAME = "app.properties";
    private static FileHandler handler;
    private ApplicationConfig appConfig;
    private Context context;
    private PermissionUtil permissionUtil;
    private PropertiesApplicable props[];

    public ConfigUpdater(Application application)
    {
        context = application;
        appConfig = ApplicationConfig.getInstance();
        props = (new PropertiesApplicable[] {
            appConfig.getLoggingConfig(), appConfig.getUpdateConfig()
        });
        permissionUtil = new PermissionUtil(application);
    }

    private void applyLogHandlers(Logger logger, LoggingConfig loggingconfig)
    {
        if (!permissionUtil.a(Permission.g))
        {
            break MISSING_BLOCK_LABEL_114;
        }
        FileHandler filehandler = new FileHandler((new File(context.getExternalCacheDir(), "skype_app.log")).getAbsolutePath(), 0x80000, 4, true);
        handler = filehandler;
        filehandler.setFormatter(new SkypeLogFormatter());
        loggingconfig = loggingconfig.getFilters();
        if (loggingconfig == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        if (loggingconfig.isEmpty())
        {
            break MISSING_BLOCK_LABEL_99;
        }
        handler.setFilter(new LogNameFilter(loggingconfig));
_L2:
        logger.addHandler(handler);
        return;
        handler.setFilter(null);
        if (true) goto _L2; else goto _L1
_L1:
        logger;
        logger.printStackTrace();
    }

    private File getAppPropertiesFile()
    {
        try
        {
            if (DeviceFeatures.d() && "mounted".equals(Environment.getExternalStorageState()))
            {
                context.getExternalCacheDir();
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return new File(context.getFilesDir(), "app.properties");
    }

    private Properties readLocalConfig()
    {
        Object obj;
        Object obj1;
        Object obj2;
        Properties properties;
        properties = new Properties();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        obj2 = getAppPropertiesFile();
        if (!((File) (obj2)).exists())
        {
            break MISSING_BLOCK_LABEL_139;
        }
        obj = null;
        obj1 = null;
        obj2 = new InputStreamReader(new FileInputStream(((File) (obj2))), Charsets.a);
        BufferedReader bufferedreader = new BufferedReader(((Reader) (obj2)), 4096);
        obj1 = bufferedreader;
        obj = bufferedreader;
        properties.load(bufferedreader);
        obj1 = bufferedreader;
        obj = bufferedreader;
        obj2 = props;
        obj1 = bufferedreader;
        obj = bufferedreader;
        int j = obj2.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = bufferedreader;
        obj = bufferedreader;
        obj2[i].applyFrom(properties);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            bufferedreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
            return properties;
        }
_L4:
        return properties;
        obj2;
_L7:
        obj = obj1;
        ((IOException) (obj2)).printStackTrace();
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        try
        {
            ((Reader) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
            return properties;
        }
        return properties;
        Exception exception;
        exception;
_L6:
        if (obj != null)
        {
            try
            {
                ((Reader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw exception;
        exception;
        obj = obj2;
        if (true) goto _L6; else goto _L5
_L5:
        IOException ioexception;
        ioexception;
        exception = ((Exception) (obj2));
        obj2 = ioexception;
          goto _L7
    }

    public void configureLogging()
    {
        Logger logger = Logger.getLogger("");
        LoggingConfig loggingconfig = appConfig.getLoggingConfig();
        if (loggingconfig.saveAppLogs())
        {
            if (handler == null)
            {
                applyLogHandlers(logger, loggingconfig);
            }
        } else
        if (handler != null)
        {
            logger.removeHandler(handler);
            handler = null;
            return;
        }
    }

    public void saveLocalConfig()
    {
        Properties properties;
        Object obj;
        properties = new Properties();
        PropertiesApplicable apropertiesapplicable[] = props;
        int j = apropertiesapplicable.length;
        for (int i = 0; i < j; i++)
        {
            apropertiesapplicable[i].applyTo(properties);
        }

        obj = getAppPropertiesFile();
        obj = new FileOutputStream(((File) (obj)));
        properties.store(((java.io.OutputStream) (obj)), "local");
        Exception exception;
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_79;
        exception;
        ((FileOutputStream) (obj)).close();
        throw exception;
    }

    public void updateLocalConfig()
    {
        MethodTrace methodtrace = new MethodTrace("ConfigUpdater", "updateLocalConfig");
        readLocalConfig();
        configureLogging();
        appConfig.sendConfigUpdatedEvent();
        methodtrace.b();
    }
}

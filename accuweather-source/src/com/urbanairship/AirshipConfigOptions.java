// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.urbanairship.util.UAStringUtil;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

// Referenced classes of package com.urbanairship:
//            PropertyName, Logger, ConstantClass

public class AirshipConfigOptions
{

    public static final String ADM_TRANSPORT = "ADM";
    private static final String DEFAULT_PROPERTIES_FILENAME = "airshipconfig.properties";
    public static final String GCM_TRANSPORT = "GCM";
    private static final int MAX_BG_REPORTING_INTERVAL_MS = 0x5265c00;
    private static final int MIN_BG_REPORTING_INTERVAL_MS = 60000;
    public String additionalGCMSenderIds[];
    public String allowedTransports[] = {
        "ADM", "GCM"
    };
    public boolean analyticsEnabled;
    public String analyticsServer;
    public boolean autoLaunchApplication;
    public long backgroundReportingIntervalMS;
    public String developmentAppKey;
    public String developmentAppSecret;
    public int developmentLogLevel;
    public String gcmSender;
    public String hostURL;
    public boolean inProduction;
    public String landingPageContentURL;
    public int minSdkVersion;
    public String productionAppKey;
    public String productionAppSecret;
    public int productionLogLevel;

    public AirshipConfigOptions()
    {
        hostURL = "https://device-api.urbanairship.com/";
        analyticsServer = "https://combine.urbanairship.com/";
        landingPageContentURL = "https://dl.urbanairship.com/aaa/";
        inProduction = false;
        analyticsEnabled = true;
        backgroundReportingIntervalMS = 0xdbba0L;
        developmentLogLevel = 3;
        productionLogLevel = 6;
        minSdkVersion = 4;
        autoLaunchApplication = true;
    }

    private String getPropertyValue(Field field, Properties properties)
    {
        String s = null;
        PropertyName propertyname = (PropertyName)field.getAnnotation(com/urbanairship/PropertyName);
        if (propertyname != null)
        {
            s = properties.getProperty(propertyname.name());
            Logger.verbose((new StringBuilder()).append("Found PropertyAnnotation for ").append(propertyname.name()).append(" matching ").append(field.getName()).toString());
        }
        return s;
    }

    private boolean isLogLevelValid(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            return true;
        }
    }

    public static AirshipConfigOptions loadDefaultOptions(Context context)
    {
        AirshipConfigOptions airshipconfigoptions = new AirshipConfigOptions();
        airshipconfigoptions.loadFromProperties(context);
        return airshipconfigoptions;
    }

    private void setPropertyValue(Field field, String s)
    {
        try
        {
            if (field.getType() == Boolean.TYPE || field.getType() == java/lang/Boolean)
            {
                field.set(this, Boolean.valueOf(s));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.error((new StringBuilder()).append("Unable to set field '").append(field.getName()).append("' because the field is not visible.").toString(), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.error((new StringBuilder()).append("Unable to set field '").append(field.getName()).append("' due invalid configuration value.").toString(), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.error((new StringBuilder()).append("Unable to set field '").append(field.getName()).append("' due invalid configuration value.").toString(), s);
            return;
        }
        if (field.getType() == Integer.TYPE || field.getType() == java/lang/Integer)
        {
            field.set(this, Integer.valueOf(parseOptionValues(field, s)));
            return;
        }
        if (field.getType() == Long.TYPE || field.getType() == java/lang/Long)
        {
            field.set(this, Long.valueOf(s));
            return;
        }
        if (field.getType().isArray())
        {
            field.set(this, s.split("[, ]+"));
            return;
        }
        field.set(this, s.trim());
        return;
    }

    public String getAppKey()
    {
        if (inProduction)
        {
            return productionAppKey;
        } else
        {
            return developmentAppKey;
        }
    }

    public String getAppSecret()
    {
        if (inProduction)
        {
            return productionAppSecret;
        } else
        {
            return developmentAppSecret;
        }
    }

    public Set getGCMSenderIds()
    {
        HashSet hashset = new HashSet();
        if (!UAStringUtil.isEmpty(gcmSender))
        {
            hashset.add(gcmSender);
        }
        if (additionalGCMSenderIds != null)
        {
            hashset.addAll(Arrays.asList(additionalGCMSenderIds));
        }
        return hashset;
    }

    public int getLoggerLevel()
    {
        if (inProduction)
        {
            return productionLogLevel;
        } else
        {
            return developmentLogLevel;
        }
    }

    public boolean isTransportAllowed(String s)
    {
        if (allowedTransports != null && s != null)
        {
            String as[] = allowedTransports;
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                if (s.equalsIgnoreCase(as[i]))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public boolean isValid()
    {
        AirshipConfigOptions airshipconfigoptions;
        int i;
        boolean flag;
        flag = true;
        airshipconfigoptions = new AirshipConfigOptions();
        Object obj;
        Object obj1;
        Field afield[];
        int j;
        if (inProduction)
        {
            obj = "production";
        } else
        {
            obj = "development";
        }
        if (getAppKey() == null || getAppKey().length() == 0 || getAppKey().indexOf(' ') > 0)
        {
            Logger.error((new StringBuilder()).append("AirshipConfigOptions: ").append(getAppKey()).append(" is not a valid ").append(((String) (obj))).append(" app key").toString());
            flag = false;
        }
        if (getAppSecret() == null || getAppSecret().length() == 0 || getAppSecret().indexOf(' ') > 0)
        {
            Logger.error((new StringBuilder()).append("AirshipConfigOptions: ").append(getAppSecret()).append(" is not a valid ").append(((String) (obj))).append(" app secret").toString());
            flag = false;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        obj1 = null;
        afield = getClass().getFields();
        j = afield.length;
        i = 0;
_L11:
        obj = obj1;
        if (i >= j) goto _L4; else goto _L3
_L3:
        obj = afield[i];
        if ((((Field) (obj)).getModifiers() & 0x10) != 0) goto _L5; else goto _L4
_L4:
        if (obj != null)
        {
            try
            {
                if (!((Field) (obj)).isAnnotationPresent(com/urbanairship/PropertyName))
                {
                    Logger.error((new StringBuilder()).append("The public field '").append(((Field) (obj)).getName()).append("' is missing an annotation").toString());
                    Logger.error("AirshipConfigOptions appears to be obfuscated. If using Proguard, add the following to your proguard.cfg:");
                    Logger.error("\t-keepattributes *Annotation*");
                }
            }
            catch (SecurityException securityexception) { }
        }
_L2:
        if (inProduction)
        {
            if (!isLogLevelValid(productionLogLevel))
            {
                Logger.error((new StringBuilder()).append(productionLogLevel).append(" is not a valid log level. Falling back to ").append(airshipconfigoptions.productionLogLevel).append(" ERROR.").toString());
                productionLogLevel = airshipconfigoptions.productionLogLevel;
            }
        } else
        if (!isLogLevelValid(developmentLogLevel))
        {
            Logger.error((new StringBuilder()).append(developmentLogLevel).append(" is not a valid log level. Falling back to ").append(airshipconfigoptions.developmentLogLevel).append(" DEBUG.").toString());
            developmentLogLevel = airshipconfigoptions.developmentLogLevel;
        }
        if (backgroundReportingIntervalMS >= 60000L) goto _L7; else goto _L6
_L6:
        Logger.warn((new StringBuilder()).append("The backgroundReportingIntervalMS ").append(backgroundReportingIntervalMS).append(" may decrease battery life.").toString());
_L9:
        return flag;
_L5:
        i++;
        continue; /* Loop/switch isn't completed */
_L7:
        if (backgroundReportingIntervalMS <= 0x5265c00L) goto _L9; else goto _L8
_L8:
        Logger.warn((new StringBuilder()).append("The backgroundReportingIntervalMS ").append(backgroundReportingIntervalMS).append(" may provide less detailed analytic reports.").toString());
        return flag;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public void loadFromProperties(Context context)
    {
        loadFromProperties(context, "airshipconfig.properties");
    }

    public void loadFromProperties(Context context, String s)
    {
        AssetManager assetmanager = context.getResources().getAssets();
        if (Arrays.asList(assetmanager.list("")).contains(s)) goto _L2; else goto _L1
_L1:
        Logger.verbose((new StringBuilder()).append("Options - Couldn't find ").append(s).toString());
_L6:
        return;
        context;
        Logger.error(context);
        return;
_L2:
        int i;
        context = new Properties();
        Field afield[];
        Field field;
        String s1;
        int j;
        try
        {
            context.load(assetmanager.open(s));
            afield = getClass().getDeclaredFields();
            j = afield.length;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.error((new StringBuilder()).append("Error loading properties file ").append(s).toString(), context);
            return;
        }
        i = 0;
_L4:
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        field = afield[i];
        if (com/urbanairship/AirshipConfigOptions.isAssignableFrom(field.getType()))
        {
            break MISSING_BLOCK_LABEL_169;
        }
        s1 = getPropertyValue(field, context);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        setPropertyValue(field, s1);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    int parseOptionValues(Field field, String s)
        throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException
    {
        int i;
        try
        {
            i = Integer.valueOf(s).intValue();
        }
        catch (NumberFormatException numberformatexception)
        {
            ConstantClass constantclass = (ConstantClass)field.getAnnotation(com/urbanairship/ConstantClass);
            if (constantclass == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("The field '").append(field.getName()).append("' has a type mismatch or missing annotation.").toString());
            }
            Field afield[] = Class.forName(constantclass.name()).getDeclaredFields();
            int k = afield.length;
            for (int j = 0; j < k; j++)
            {
                Field field1 = afield[j];
                if (field1.getName().equalsIgnoreCase(s))
                {
                    try
                    {
                        j = field1.getInt(this);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("The field '").append(field.getName()).append("' is incompatible with specified class").toString(), s);
                    }
                    return j;
                }
            }

            throw new IllegalArgumentException((new StringBuilder()).append("Unable to match class for field '").append(field.getName()).append("'").toString());
        }
        return i;
    }
}

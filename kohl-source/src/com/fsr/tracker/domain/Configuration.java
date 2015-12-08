// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.domain;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TreeSet;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.fsr.tracker.domain:
//            MeasureConfiguration

public class Configuration
    implements Serializable
{
    public static final class LocalNotificationSurvey extends Enum
    {

        private static final LocalNotificationSurvey $VALUES[];
        public static final LocalNotificationSurvey IN_APP;
        public static final LocalNotificationSurvey IN_BROWSER;

        public static LocalNotificationSurvey valueOf(String s)
        {
            return (LocalNotificationSurvey)Enum.valueOf(com/fsr/tracker/domain/Configuration$LocalNotificationSurvey, s);
        }

        public static LocalNotificationSurvey[] values()
        {
            return (LocalNotificationSurvey[])$VALUES.clone();
        }

        static 
        {
            IN_APP = new LocalNotificationSurvey("IN_APP", 0);
            IN_BROWSER = new LocalNotificationSurvey("IN_BROWSER", 1);
            $VALUES = (new LocalNotificationSurvey[] {
                IN_APP, IN_BROWSER
            });
        }

        private LocalNotificationSurvey(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int DEFAULT_EXIT_EXPIRY_DAYS = 7;
    public static final String DEFAULT_LOGGING_URL = "http://events.foreseeresults.com/rec/process?event=logit";
    public static final int DEFAULT_MAX_REPEAT_DAYS = 60;
    public static final String DEFAULT_SERVICE_URL = "http://survey.foreseeresults.com/survey/";
    public static final String DEFAULT_SURVEY_URL_BASE = "http://survey.foreseeresults.com/survey/display?";
    public static final String NOTIFICATION_ICON_NAME = "ic_notification";
    public static final String NOTIFICATION_LAYOUT_NAME = "notification";
    private static Logger logger = Logger.getLogger(com/fsr/tracker/domain/Configuration.getName());
    private String clientId;
    private Map cpps;
    private String customLogoPath;
    private boolean debug;
    private int exitExpiryDays;
    private int exitExpiryMinutes;
    private LocalNotificationSurvey localNotificationSurvey;
    private String loggingUrl;
    private int maxRepeatDays;
    private int maxRepeatMinutes;
    private Map measureConfigs;
    private String notificationIconName;
    private String notificationLayoutName;
    private Map queryStringParams;
    private String serviceUrl;
    private boolean shouldPresentOnExit;
    private boolean shouldUseLocalNotification;
    private boolean supportsReinvitation;
    private int surveyRepeatDays;
    private int surveyRepeatMinutes;
    private String surveyUrlBase;
    private TreeSet whiteListedDomains;

    private Configuration(String s)
    {
        loggingUrl = "http://events.foreseeresults.com/rec/process?event=logit";
        serviceUrl = "http://survey.foreseeresults.com/survey/";
        surveyUrlBase = "http://survey.foreseeresults.com/survey/display?";
        supportsReinvitation = false;
        shouldUseLocalNotification = false;
        measureConfigs = new HashMap();
        notificationLayoutName = "notification";
        notificationIconName = "ic_notification";
        cpps = new HashMap();
        queryStringParams = new HashMap();
        whiteListedDomains = new TreeSet();
        exitExpiryDays = 7;
        clientId = s;
    }

    public static Configuration baseConfiguration(String s)
    {
        s = new Configuration(s);
        Properties properties = new Properties();
        InputStream inputstream;
        String as[];
        int i;
        int j;
        try
        {
            inputstream = s.getClass().getClassLoader().getResourceAsStream("default-whitelist.properties");
        }
        catch (IOException ioexception)
        {
            logger.severe(ioexception.getMessage());
            return s;
        }
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        properties.load(inputstream);
        as = properties.getProperty("whiteListedHosts").split(",");
        j = as.length;
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s.addWhiteListedHost(as[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        inputstream.close();
        return s;
        logger.warning("Unable to load white-listed hosts from properties file");
        return s;
    }

    public static Configuration defaultConfiguration(String s)
    {
        return baseConfiguration(s).repeatAfterDecline(60);
    }

    public Configuration addCpp(String s, Integer integer)
    {
        cpps.put(s, integer.toString());
        return this;
    }

    public Configuration addCpp(String s, String s1)
    {
        cpps.put(s, s1);
        return this;
    }

    public Configuration addMeasure(MeasureConfiguration measureconfiguration)
    {
        measureConfigs.put(measureconfiguration.getName(), measureconfiguration);
        return this;
    }

    public Configuration addQueryStringParam(String s, String s1)
    {
        queryStringParams.put(s, s1);
        return this;
    }

    public Configuration addWhiteListedHost(String s)
    {
        whiteListedDomains.add(s);
        return this;
    }

    public Configuration clearCpps()
    {
        cpps.clear();
        return this;
    }

    public Configuration clearMeasures()
    {
        measureConfigs.clear();
        return this;
    }

    public Configuration debug(boolean flag)
    {
        debug = flag;
        return this;
    }

    public MeasureConfiguration findMeasureByName(String s)
    {
        return (MeasureConfiguration)measureConfigs.get(s);
    }

    public String getClientId()
    {
        return clientId;
    }

    public Map getCpps()
    {
        return cpps;
    }

    public String getCustomLogoPath()
    {
        return customLogoPath;
    }

    public LocalNotificationSurvey getLocalNotificationSurvey()
    {
        return localNotificationSurvey;
    }

    public String getLoggingUrl()
    {
        return loggingUrl;
    }

    public int getMaxRepeatDays()
    {
        return maxRepeatDays;
    }

    public int getMaxRepeatMinutes()
    {
        return maxRepeatMinutes;
    }

    public Collection getMeasureConfigs()
    {
        return measureConfigs.values();
    }

    public String getNotificationIconName()
    {
        return notificationIconName;
    }

    public String getNotificationLayoutName()
    {
        return notificationLayoutName;
    }

    public Map getQueryStringParams()
    {
        return queryStringParams;
    }

    public String getServiceUrl()
    {
        return serviceUrl;
    }

    public int getSurveyRepeatDays()
    {
        return surveyRepeatDays;
    }

    public int getSurveyRepeatMinutes()
    {
        return surveyRepeatMinutes;
    }

    public String getSurveyUrlBase()
    {
        return surveyUrlBase;
    }

    public boolean isDebug()
    {
        return debug;
    }

    public boolean isDomainWhiteListed(String s)
    {
        s = URI.create(s);
        s = Pattern.compile("([\\w]*.[\\w]*$)").matcher(s.getHost());
        if (s.find())
        {
            return whiteListedDomains.contains(s.group());
        } else
        {
            return false;
        }
    }

    public boolean isSupportsReinvitation()
    {
        return supportsReinvitation;
    }

    public Configuration removeCpp(String s)
    {
        cpps.remove(s);
        return this;
    }

    public Configuration removeQueryStringParam(String s, String s1)
    {
        queryStringParams.remove(s);
        return this;
    }

    public Configuration repeatAfterDecline(int i)
    {
        maxRepeatDays = i;
        return this;
    }

    public Configuration repeatAfterDeclineMinutes(int i)
    {
        maxRepeatMinutes = i;
        return this;
    }

    public int resolveExitExpiryMinutes()
    {
        if (exitExpiryMinutes > 0)
        {
            return exitExpiryMinutes;
        } else
        {
            return exitExpiryDays * 60 * 24;
        }
    }

    public int resolveInviteRepeatMinutes()
    {
        if (maxRepeatMinutes > 0)
        {
            return maxRepeatMinutes;
        } else
        {
            return maxRepeatDays * 60 * 24;
        }
    }

    public int resolveSurveyRepeatMinutes()
    {
        if (surveyRepeatMinutes > 0)
        {
            return surveyRepeatMinutes;
        } else
        {
            return surveyRepeatDays * 60 * 24;
        }
    }

    public boolean shouldInviteOnExit()
    {
        return shouldPresentOnExit;
    }

    public Configuration shouldPresentImmediate()
    {
        shouldPresentOnExit = false;
        shouldUseLocalNotification = false;
        localNotificationSurvey = LocalNotificationSurvey.IN_BROWSER;
        return this;
    }

    public Configuration shouldPresentOnExit()
    {
        shouldPresentOnExit = true;
        shouldUseLocalNotification = false;
        return this;
    }

    public Configuration shouldPresentOnExitLocal()
    {
        shouldPresentOnExit = true;
        shouldUseLocalNotification = true;
        localNotificationSurvey = LocalNotificationSurvey.IN_APP;
        return this;
    }

    public Configuration shouldPresentOnExitLocal(LocalNotificationSurvey localnotificationsurvey)
    {
        shouldPresentOnExit = true;
        shouldUseLocalNotification = true;
        localNotificationSurvey = LocalNotificationSurvey.IN_APP;
        return this;
    }

    public Configuration shouldRepeatSurveyAfterDays(int i)
    {
        supportsReinvitation = true;
        surveyRepeatDays = i;
        return this;
    }

    public Configuration shouldRepeatSurveyAfterMinutes(int i)
    {
        supportsReinvitation = true;
        surveyRepeatMinutes = i;
        return this;
    }

    public boolean shouldUseLocalNotification()
    {
        return shouldUseLocalNotification;
    }

    public boolean supportsReinvite()
    {
        return supportsReinvitation;
    }

    public Configuration withCustomLogo(String s)
    {
        customLogoPath = s;
        return this;
    }

    public Configuration withNotificationIcon(String s)
    {
        notificationIconName = s;
        return this;
    }

    public Configuration withNotificationLayout(String s)
    {
        notificationLayoutName = s;
        return this;
    }

    public Configuration withOnExitExpiryDays(int i)
    {
        exitExpiryDays = i;
        return this;
    }

    public Configuration withOnExitExpiryMinutes(int i)
    {
        exitExpiryMinutes = i;
        return this;
    }

}

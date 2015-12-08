// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.lang.management.ManagementFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationContext;
import twitter4j.internal.logging.Logger;
import twitter4j.management.APIStatistics;
import twitter4j.management.APIStatisticsMBean;
import twitter4j.management.APIStatisticsOpenMBean;

public class TwitterAPIMonitor
{

    private static final TwitterAPIMonitor SINGLETON;
    private static final APIStatistics STATISTICS;
    private static final Logger logger;
    private static final Pattern pattern;

    private TwitterAPIMonitor()
    {
    }

    public static TwitterAPIMonitor getInstance()
    {
        return SINGLETON;
    }

    public APIStatisticsMBean getStatistics()
    {
        return STATISTICS;
    }

    void methodCalled(String s, long l, boolean flag)
    {
        s = pattern.matcher(s);
        if (s.matches() && s.groupCount() > 0)
        {
            s = s.group(1);
            STATISTICS.methodCalled(s, l, flag);
        }
    }

    static 
    {
        boolean flag1;
        boolean flag2;
        flag1 = true;
        flag2 = false;
        logger = Logger.getLogger(twitter4j/TwitterAPIMonitor);
        pattern = Pattern.compile("https?:\\/\\/[^\\/]+\\/[0-9.]*\\/([a-zA-Z_\\.]*).*");
        SINGLETON = new TwitterAPIMonitor();
        STATISTICS = new APIStatistics(100);
        String s = System.getProperty("java.specification.version");
        boolean flag;
        flag = flag2;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        flag = flag2;
        if (1.5D > Double.parseDouble(s))
        {
            flag = true;
        }
        MBeanServer mbeanserver;
        ObjectName objectname;
        try
        {
            if (ConfigurationContext.getInstance().isDalvik())
            {
                System.setProperty("http.keepAlive", "false");
            }
        }
        catch (SecurityException securityexception)
        {
            flag = flag1;
        }
        try
        {
            mbeanserver = ManagementFactory.getPlatformMBeanServer();
        }
        catch (InstanceAlreadyExistsException instancealreadyexistsexception)
        {
            instancealreadyexistsexception.printStackTrace();
            logger.error(instancealreadyexistsexception.getMessage());
            return;
        }
        catch (MBeanRegistrationException mbeanregistrationexception)
        {
            mbeanregistrationexception.printStackTrace();
            logger.error(mbeanregistrationexception.getMessage());
            return;
        }
        catch (NotCompliantMBeanException notcompliantmbeanexception)
        {
            notcompliantmbeanexception.printStackTrace();
            logger.error(notcompliantmbeanexception.getMessage());
            return;
        }
        catch (MalformedObjectNameException malformedobjectnameexception)
        {
            malformedobjectnameexception.printStackTrace();
            logger.error(malformedobjectnameexception.getMessage());
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        objectname = new ObjectName("twitter4j.mbean:type=APIStatistics");
        mbeanserver.registerMBean(STATISTICS, objectname);
        return;
        objectname = new ObjectName("twitter4j.mbean:type=APIStatisticsOpenMBean");
        mbeanserver.registerMBean(new APIStatisticsOpenMBean(STATISTICS), objectname);
        return;
    }
}

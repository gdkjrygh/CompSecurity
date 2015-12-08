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
import twitter4j.management.APIStatistics;
import twitter4j.management.APIStatisticsMBean;
import twitter4j.management.APIStatisticsOpenMBean;

// Referenced classes of package twitter4j:
//            Logger

public class TwitterAPIMonitor
{

    private static final TwitterAPIMonitor SINGLETON = new TwitterAPIMonitor();
    private static final APIStatistics STATISTICS;
    private static final Logger logger;
    private static final Pattern pattern = Pattern.compile("https?://[^/]+/[0-9.]*/([a-zA-Z_\\.]*).*");

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
        logger = Logger.getLogger(twitter4j/TwitterAPIMonitor);
        STATISTICS = new APIStatistics(100);
        try
        {
            MBeanServer mbeanserver = ManagementFactory.getPlatformMBeanServer();
            ObjectName objectname = new ObjectName("twitter4j.mbean:type=APIStatisticsOpenMBean");
            mbeanserver.registerMBean(new APIStatisticsOpenMBean(STATISTICS), objectname);
        }
        catch (InstanceAlreadyExistsException instancealreadyexistsexception)
        {
            instancealreadyexistsexception.printStackTrace();
            logger.error(instancealreadyexistsexception.getMessage());
        }
        catch (MBeanRegistrationException mbeanregistrationexception)
        {
            mbeanregistrationexception.printStackTrace();
            logger.error(mbeanregistrationexception.getMessage());
        }
        catch (NotCompliantMBeanException notcompliantmbeanexception)
        {
            notcompliantmbeanexception.printStackTrace();
            logger.error(notcompliantmbeanexception.getMessage());
        }
        catch (MalformedObjectNameException malformedobjectnameexception)
        {
            malformedobjectnameexception.printStackTrace();
            logger.error(malformedobjectnameexception.getMessage());
        }
    }
}

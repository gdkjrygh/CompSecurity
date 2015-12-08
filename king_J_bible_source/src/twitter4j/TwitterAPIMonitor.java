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
    static Class class$twitter4j$TwitterAPIMonitor;
    private static final Logger logger;
    private static final Pattern pattern;
    private final APIStatistics STATISTICS = new APIStatistics(100);

    private TwitterAPIMonitor()
    {
    }

    static Class _mthclass$(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw (new NoClassDefFoundError()).initCause(s);
        }
        return s;
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
            s = s.group();
            STATISTICS.methodCalled(s, l, flag);
        }
    }

    static 
    {
        Object obj;
        APIStatistics apistatistics;
        boolean flag;
        boolean flag1;
        if (class$twitter4j$TwitterAPIMonitor == null)
        {
            obj = _mthclass$("twitter4j.TwitterAPIMonitor");
            class$twitter4j$TwitterAPIMonitor = ((Class) (obj));
        } else
        {
            obj = class$twitter4j$TwitterAPIMonitor;
        }
        logger = Logger.getLogger(((Class) (obj)));
        pattern = Pattern.compile("https?:\\/\\/[^\\/]+\\/([a-zA-Z_\\.]*).*");
        SINGLETON = new TwitterAPIMonitor();
        flag = false;
        obj = System.getProperty("java.specification.version");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        if (1.5D > Double.parseDouble(((String) (obj))))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!ConfigurationContext.getInstance().isDalvik())
        {
            break MISSING_BLOCK_LABEL_91;
        }
        System.setProperty("http.keepAlive", "false");
        flag1 = flag;
_L2:
        obj = ManagementFactory.getPlatformMBeanServer();
        apistatistics = new APIStatistics(100);
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        ObjectName objectname;
        try
        {
            ((MBeanServer) (obj)).registerMBean(apistatistics, new ObjectName("twitter4j.mbean:type=APIStatistics"));
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
        break MISSING_BLOCK_LABEL_237;
        obj;
        flag1 = true;
        if (true) goto _L2; else goto _L1
_L1:
        objectname = new ObjectName("twitter4j.mbean:type=APIStatisticsOpenMBean");
        ((MBeanServer) (obj)).registerMBean(new APIStatisticsOpenMBean(apistatistics), objectname);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.management;

import java.util.Iterator;
import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.AttributeNotFoundException;
import javax.management.DynamicMBean;
import javax.management.MBeanInfo;
import javax.management.MBeanNotificationInfo;
import javax.management.ReflectionException;
import javax.management.openmbean.CompositeDataSupport;
import javax.management.openmbean.CompositeType;
import javax.management.openmbean.OpenDataException;
import javax.management.openmbean.OpenMBeanAttributeInfoSupport;
import javax.management.openmbean.OpenMBeanConstructorInfoSupport;
import javax.management.openmbean.OpenMBeanInfoSupport;
import javax.management.openmbean.OpenMBeanOperationInfoSupport;
import javax.management.openmbean.OpenMBeanParameterInfoSupport;
import javax.management.openmbean.OpenType;
import javax.management.openmbean.SimpleType;
import javax.management.openmbean.TabularDataSupport;
import javax.management.openmbean.TabularType;

// Referenced classes of package twitter4j.management:
//            APIStatisticsMBean, InvocationStatistics, APIStatistics

public class APIStatisticsOpenMBean
    implements DynamicMBean
{

    private static final String ITEM_DESCRIPTIONS[] = {
        "The method name", "The number of times this method has been called", "The number of calls that failed", "The total amount of time spent invoking this method in milliseconds", "The average amount of time spent invoking this method in milliseconds"
    };
    private static final String ITEM_NAMES[] = {
        "methodName", "callCount", "errorCount", "totalTime", "avgTime"
    };
    private static final OpenType ITEM_TYPES[];
    private final APIStatisticsMBean API_STATISTICS;
    private final TabularType API_STATISTICS_TYPE;
    private final CompositeType METHOD_STATS_TYPE;

    public APIStatisticsOpenMBean(APIStatistics apistatistics)
    {
        API_STATISTICS = apistatistics;
        try
        {
            METHOD_STATS_TYPE = new CompositeType("method statistics", "method statistics", ITEM_NAMES, ITEM_DESCRIPTIONS, ITEM_TYPES);
            API_STATISTICS_TYPE = new TabularType("API statistics", "list of methods", METHOD_STATS_TYPE, new String[] {
                "methodName"
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (APIStatistics apistatistics)
        {
            throw new RuntimeException(apistatistics);
        }
    }

    public Object getAttribute(String s)
    {
        if (s.equals("statisticsTable"))
        {
            return getStatistics();
        }
        if (s.equals("callCount"))
        {
            return Long.valueOf(API_STATISTICS.getCallCount());
        }
        if (s.equals("errorCount"))
        {
            return Long.valueOf(API_STATISTICS.getErrorCount());
        }
        if (s.equals("totalTime"))
        {
            return Long.valueOf(API_STATISTICS.getTotalTime());
        }
        if (s.equals("averageTime"))
        {
            return Long.valueOf(API_STATISTICS.getAverageTime());
        } else
        {
            throw new AttributeNotFoundException((new StringBuilder("Cannot find ")).append(s).append(" attribute ").toString());
        }
    }

    public AttributeList getAttributes(String as[])
    {
        AttributeList attributelist = new AttributeList();
        if (as.length == 0)
        {
            return attributelist;
        }
        int i = 0;
        while (i < as.length) 
        {
            try
            {
                Object obj = getAttribute(as[i]);
                attributelist.add(new Attribute(as[i], obj));
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
            i++;
        }
        return attributelist;
    }

    public MBeanInfo getMBeanInfo()
    {
        OpenMBeanAttributeInfoSupport openmbeanattributeinfosupport = new OpenMBeanAttributeInfoSupport("callCount", "Total number of API calls", SimpleType.LONG, true, false, false);
        OpenMBeanAttributeInfoSupport openmbeanattributeinfosupport1 = new OpenMBeanAttributeInfoSupport("errorCount", "The number of failed API calls", SimpleType.LONG, true, false, false);
        OpenMBeanAttributeInfoSupport openmbeanattributeinfosupport2 = new OpenMBeanAttributeInfoSupport("averageTime", "Average time spent invoking any API method", SimpleType.LONG, true, false, false);
        OpenMBeanAttributeInfoSupport openmbeanattributeinfosupport3 = new OpenMBeanAttributeInfoSupport("totalTime", "Average time spent invoking any API method", SimpleType.LONG, true, false, false);
        OpenMBeanAttributeInfoSupport openmbeanattributeinfosupport4 = new OpenMBeanAttributeInfoSupport("statisticsTable", "Table of statisics for all API methods", API_STATISTICS_TYPE, true, false, false);
        OpenMBeanConstructorInfoSupport openmbeanconstructorinfosupport = new OpenMBeanConstructorInfoSupport("APIStatisticsOpenMBean", "Constructs an APIStatisticsOpenMBean instance", new OpenMBeanParameterInfoSupport[0]);
        Object obj = SimpleType.VOID;
        obj = new OpenMBeanOperationInfoSupport("reset", "reset the statistics", new OpenMBeanParameterInfoSupport[0], ((OpenType) (obj)), 0);
        return new OpenMBeanInfoSupport(getClass().getName(), "API Statistics Open MBean", new OpenMBeanAttributeInfoSupport[] {
            openmbeanattributeinfosupport, openmbeanattributeinfosupport1, openmbeanattributeinfosupport2, openmbeanattributeinfosupport3, openmbeanattributeinfosupport4
        }, new OpenMBeanConstructorInfoSupport[] {
            openmbeanconstructorinfosupport
        }, new OpenMBeanOperationInfoSupport[] {
            obj
        }, new MBeanNotificationInfo[0]);
    }

    public TabularDataSupport getStatistics()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Iterator iterator;
        obj = new TabularDataSupport(API_STATISTICS_TYPE);
        iterator = API_STATISTICS.getInvocationStatistics().iterator();
_L1:
        String s;
        long l;
        long l1;
        long l2;
        long l3;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_165;
        }
        InvocationStatistics invocationstatistics = (InvocationStatistics)iterator.next();
        s = invocationstatistics.getName();
        l = invocationstatistics.getCallCount();
        l1 = invocationstatistics.getErrorCount();
        l2 = invocationstatistics.getTotalTime();
        l3 = invocationstatistics.getAverageTime();
        ((TabularDataSupport) (obj)).put(new CompositeDataSupport(METHOD_STATS_TYPE, ITEM_NAMES, new Object[] {
            s, Long.valueOf(l), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3)
        }));
          goto _L1
        obj;
        throw new RuntimeException(((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        this;
        JVM INSTR monitorexit ;
        return ((TabularDataSupport) (obj));
    }

    public Object invoke(String s, Object aobj[], String as[])
    {
        if (s.equals("reset"))
        {
            reset();
            return "Statistics reset";
        } else
        {
            throw new ReflectionException(new NoSuchMethodException(s), (new StringBuilder("Cannot find the operation ")).append(s).toString());
        }
    }

    public void reset()
    {
        API_STATISTICS.reset();
    }

    public void setAttribute(Attribute attribute)
    {
        throw new AttributeNotFoundException("No attributes can be set in this MBean");
    }

    public AttributeList setAttributes(AttributeList attributelist)
    {
        return new AttributeList();
    }

    static 
    {
        ITEM_TYPES = (new OpenType[] {
            SimpleType.STRING, SimpleType.LONG, SimpleType.LONG, SimpleType.LONG, SimpleType.LONG
        });
    }
}

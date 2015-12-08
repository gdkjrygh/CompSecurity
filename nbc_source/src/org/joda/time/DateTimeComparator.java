// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.Serializable;
import java.util.Comparator;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.InstantConverter;

// Referenced classes of package org.joda.time:
//            DateTimeFieldType, Chronology, DateTimeField

public class DateTimeComparator
    implements Serializable, Comparator
{

    private static final DateTimeComparator ALL_INSTANCE = new DateTimeComparator(null, null);
    private static final DateTimeComparator DATE_INSTANCE = new DateTimeComparator(DateTimeFieldType.dayOfYear(), null);
    private static final DateTimeComparator TIME_INSTANCE = new DateTimeComparator(null, DateTimeFieldType.dayOfYear());
    private static final long serialVersionUID = 0xab61e5c80063d544L;
    private final DateTimeFieldType iLowerLimit;
    private final DateTimeFieldType iUpperLimit;

    protected DateTimeComparator(DateTimeFieldType datetimefieldtype, DateTimeFieldType datetimefieldtype1)
    {
        iLowerLimit = datetimefieldtype;
        iUpperLimit = datetimefieldtype1;
    }

    public static DateTimeComparator getDateOnlyInstance()
    {
        return DATE_INSTANCE;
    }

    public static DateTimeComparator getInstance()
    {
        return ALL_INSTANCE;
    }

    public static DateTimeComparator getInstance(DateTimeFieldType datetimefieldtype)
    {
        return getInstance(datetimefieldtype, null);
    }

    public static DateTimeComparator getInstance(DateTimeFieldType datetimefieldtype, DateTimeFieldType datetimefieldtype1)
    {
        if (datetimefieldtype == null && datetimefieldtype1 == null)
        {
            return ALL_INSTANCE;
        }
        if (datetimefieldtype == DateTimeFieldType.dayOfYear() && datetimefieldtype1 == null)
        {
            return DATE_INSTANCE;
        }
        if (datetimefieldtype == null && datetimefieldtype1 == DateTimeFieldType.dayOfYear())
        {
            return TIME_INSTANCE;
        } else
        {
            return new DateTimeComparator(datetimefieldtype, datetimefieldtype1);
        }
    }

    public static DateTimeComparator getTimeOnlyInstance()
    {
        return TIME_INSTANCE;
    }

    private Object readResolve()
    {
        return getInstance(iLowerLimit, iUpperLimit);
    }

    public int compare(Object obj, Object obj1)
    {
        Object obj2 = ConverterManager.getInstance().getInstantConverter(obj);
        Chronology chronology = ((InstantConverter) (obj2)).getChronology(obj, (Chronology)null);
        long l3 = ((InstantConverter) (obj2)).getInstantMillis(obj, chronology);
        obj = ConverterManager.getInstance().getInstantConverter(obj1);
        obj2 = ((InstantConverter) (obj)).getChronology(obj1, (Chronology)null);
        long l2 = ((InstantConverter) (obj)).getInstantMillis(obj1, ((Chronology) (obj2)));
        long l = l2;
        long l1 = l3;
        if (iLowerLimit != null)
        {
            l1 = iLowerLimit.getField(chronology).roundFloor(l3);
            l = iLowerLimit.getField(((Chronology) (obj2))).roundFloor(l2);
        }
        l3 = l;
        l2 = l1;
        if (iUpperLimit != null)
        {
            l2 = iUpperLimit.getField(chronology).remainder(l1);
            l3 = iUpperLimit.getField(((Chronology) (obj2))).remainder(l);
        }
        if (l2 < l3)
        {
            return -1;
        }
        return l2 <= l3 ? 0 : 1;
    }

    public boolean equals(Object obj)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (!(obj instanceof DateTimeComparator))
            {
                break label0;
            }
            obj = (DateTimeComparator)obj;
            if (iLowerLimit != ((DateTimeComparator) (obj)).getLowerLimit())
            {
                flag = flag1;
                if (iLowerLimit == null)
                {
                    break label0;
                }
                flag = flag1;
                if (!iLowerLimit.equals(((DateTimeComparator) (obj)).getLowerLimit()))
                {
                    break label0;
                }
            }
            if (iUpperLimit != ((DateTimeComparator) (obj)).getUpperLimit())
            {
                flag = flag1;
                if (iUpperLimit == null)
                {
                    break label0;
                }
                flag = flag1;
                if (!iUpperLimit.equals(((DateTimeComparator) (obj)).getUpperLimit()))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public DateTimeFieldType getLowerLimit()
    {
        return iLowerLimit;
    }

    public DateTimeFieldType getUpperLimit()
    {
        return iUpperLimit;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (iLowerLimit == null)
        {
            i = 0;
        } else
        {
            i = iLowerLimit.hashCode();
        }
        if (iUpperLimit != null)
        {
            j = iUpperLimit.hashCode();
        }
        return i + j * 123;
    }

    public String toString()
    {
        if (iLowerLimit == iUpperLimit)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("DateTimeComparator[");
            String s;
            if (iLowerLimit == null)
            {
                s = "";
            } else
            {
                s = iLowerLimit.getName();
            }
            return stringbuilder.append(s).append("]").toString();
        }
        StringBuilder stringbuilder1 = (new StringBuilder()).append("DateTimeComparator[");
        String s1;
        if (iLowerLimit == null)
        {
            s1 = "";
        } else
        {
            s1 = iLowerLimit.getName();
        }
        stringbuilder1 = stringbuilder1.append(s1).append("-");
        if (iUpperLimit == null)
        {
            s1 = "";
        } else
        {
            s1 = iUpperLimit.getName();
        }
        return stringbuilder1.append(s1).append("]").toString();
    }

}

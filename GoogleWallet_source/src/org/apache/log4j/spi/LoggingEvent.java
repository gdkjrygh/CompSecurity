// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j.spi;

import java.io.Serializable;
import java.util.Hashtable;
import org.apache.log4j.Category;
import org.apache.log4j.Priority;

// Referenced classes of package org.apache.log4j.spi:
//            ThrowableInformation

public final class LoggingEvent
    implements Serializable
{

    static final Integer PARAM_ARRAY[] = new Integer[1];
    static final Class TO_LEVEL_PARAMS[];
    static final Hashtable methodCache = new Hashtable(3);
    private static long startTime = System.currentTimeMillis();
    public final String categoryName;
    public final transient String fqnOfCategoryClass;
    public transient Priority level;
    private transient Category logger;
    private boolean mdcCopyLookupRequired;
    private transient Object message;
    private boolean ndcLookupRequired;
    private ThrowableInformation throwableInfo;
    public final long timeStamp = System.currentTimeMillis();

    public LoggingEvent(String s, Category category, Priority priority, Object obj, Throwable throwable)
    {
        ndcLookupRequired = true;
        mdcCopyLookupRequired = true;
        fqnOfCategoryClass = s;
        logger = category;
        categoryName = category.getName();
        level = priority;
        message = obj;
        if (throwable != null)
        {
            throwableInfo = new ThrowableInformation(throwable);
        }
    }

    static 
    {
        TO_LEVEL_PARAMS = (new Class[] {
            Integer.TYPE
        });
    }
}

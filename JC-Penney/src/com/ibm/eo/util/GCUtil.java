// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.util;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.ibm.eo.util:
//            LogInternal

public final class GCUtil
{

    private static volatile GCUtil _myInstance;

    private GCUtil()
    {
    }

    public static Boolean clean(Object obj)
    {
        if (obj == null)
        {
            return Boolean.valueOf(false);
        } else
        {
            invokeCleanMethod(obj);
            return Boolean.valueOf(true);
        }
    }

    public static Boolean clean(HashMap hashmap)
    {
        if (hashmap == null || hashmap.size() <= 0)
        {
            return Boolean.valueOf(false);
        }
        for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); invokeCleanMethod(iterator.next())) { }
        hashmap.clear();
        return Boolean.valueOf(true);
    }

    public static Boolean clean(List list)
    {
        if (list == null || list.size() <= 0)
        {
            return Boolean.valueOf(false);
        }
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            invokeCleanMethod(iterator.next());
            try
            {
                iterator.remove();
            }
            catch (Exception exception)
            {
                LogInternal.logException(exception);
            }
        }

        list.clear();
        return Boolean.valueOf(true);
    }

    public static Boolean clean(ConcurrentHashMap concurrenthashmap)
    {
        if (concurrenthashmap == null || concurrenthashmap.size() <= 0)
        {
            return Boolean.valueOf(false);
        }
        for (Iterator iterator = concurrenthashmap.keySet().iterator(); iterator.hasNext(); invokeCleanMethod(iterator.next())) { }
        concurrenthashmap.clear();
        return Boolean.valueOf(true);
    }

    public static GCUtil getInstance()
    {
        com/ibm/eo/util/GCUtil;
        JVM INSTR monitorenter ;
        GCUtil gcutil;
        if (_myInstance == null)
        {
            _myInstance = new GCUtil();
        }
        gcutil = _myInstance;
        com/ibm/eo/util/GCUtil;
        JVM INSTR monitorexit ;
        return gcutil;
        Exception exception;
        exception;
        throw exception;
    }

    public static Boolean invokeCleanMethod(Object obj)
    {
        if (obj == null)
        {
            return Boolean.valueOf(false);
        }
        Class class1 = obj.getClass();
        try
        {
            class1.getDeclaredMethod("clean", new Class[0]).invoke(obj, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            LogInternal.logException(((Throwable) (obj)));
        }
        return Boolean.valueOf(true);
    }
}

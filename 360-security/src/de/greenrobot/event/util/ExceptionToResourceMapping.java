// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.util.Log;
import de.greenrobot.event.EventBus;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExceptionToResourceMapping
{

    public final Map throwableToMsgIdMap = new HashMap();

    public ExceptionToResourceMapping()
    {
    }

    public ExceptionToResourceMapping addMapping(Class class1, int i)
    {
        throwableToMsgIdMap.put(class1, Integer.valueOf(i));
        return this;
    }

    public Integer mapThrowable(Throwable throwable)
    {
        int i = 20;
        Throwable throwable1 = throwable;
        Object obj;
        do
        {
            obj = mapThrowableFlat(throwable1);
            if (obj != null)
            {
                return ((Integer) (obj));
            }
            obj = throwable1.getCause();
            i--;
            if (i <= 0 || obj == throwable)
            {
                break;
            }
            throwable1 = ((Throwable) (obj));
        } while (obj != null);
        Log.d(EventBus.TAG, (new StringBuilder("No specific message ressource ID found for ")).append(throwable).toString());
        return null;
    }

    protected Integer mapThrowableFlat(Throwable throwable)
    {
        Class class2 = throwable.getClass();
        Integer integer = (Integer)throwableToMsgIdMap.get(class2);
        if (integer == null)
        {
            Iterator iterator = throwableToMsgIdMap.entrySet().iterator();
            throwable = null;
            do
            {
                Class class1;
                java.util.Map.Entry entry;
                do
                {
                    if (!iterator.hasNext())
                    {
                        return integer;
                    }
                    entry = (java.util.Map.Entry)iterator.next();
                    class1 = (Class)entry.getKey();
                } while (!class1.isAssignableFrom(class2) || throwable != null && !throwable.isAssignableFrom(class1));
                integer = (Integer)entry.getValue();
                throwable = class1;
            } while (true);
        } else
        {
            return integer;
        }
    }
}

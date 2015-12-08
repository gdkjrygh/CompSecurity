// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.logging.Logger;

public class RandomPercentageGenerator
{
    public static class Result
    {

        Object a;
        private boolean b;

        public final void a(Object obj)
        {
            a = obj;
        }

        public final boolean a()
        {
            return b;
        }

        public final Object b()
        {
            return a;
        }

        public Result(boolean flag)
        {
            a = null;
            b = flag;
        }
    }


    private static final int MAX_POSITION = 100;
    private static final Logger log = Logger.getLogger("RandomPercentageGenerator");
    private int percentagePositive;
    private HashMap previous;
    private Random random;

    public RandomPercentageGenerator(int i)
    {
        this(i, null);
    }

    public RandomPercentageGenerator(int i, Long long1)
    {
        previous = new HashMap();
        percentagePositive = i;
        random = new Random();
        if (long1 != null)
        {
            random.setSeed(long1.longValue());
        }
    }

    public boolean exists(Object obj)
    {
        return previous.containsKey(obj);
    }

    public Object getExisting(Object obj)
    {
        obj = (Result)previous.get(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            return ((Result) (obj)).a;
        }
    }

    public Result getOrAdd(Object obj)
    {
        if (previous.containsKey(obj))
        {
            return (Result)previous.get(obj);
        }
        int i = random.nextInt(100);
        log.info((new StringBuilder("CQF dice rolled: ")).append(i).append("<").append(percentagePositive).toString());
        Result result;
        boolean flag;
        if (i < percentagePositive)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        result = new Result(flag);
        previous.put(obj, result);
        return result;
    }

    protected Collection getValues()
    {
        return previous.values();
    }

    public Result inject(Object obj, boolean flag)
    {
        Result result = new Result(flag);
        previous.put(obj, result);
        return result;
    }

    public void remove(Object obj)
    {
        previous.remove(obj);
    }

}

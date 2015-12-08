// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.tz;


public class ZoneInfoLogger
{

    static ThreadLocal cVerbose = new ThreadLocal() {

        protected Boolean initialValue()
        {
            return Boolean.FALSE;
        }

        protected volatile Object initialValue()
        {
            return initialValue();
        }

    };

    public ZoneInfoLogger()
    {
    }

    public static void set(boolean flag)
    {
        cVerbose.set(Boolean.valueOf(flag));
    }

    public static boolean verbose()
    {
        return ((Boolean)cVerbose.get()).booleanValue();
    }

}

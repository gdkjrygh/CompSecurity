// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


public class MyPair
{

    public final Object first;
    public final Object second;

    public MyPair(Object obj, Object obj1)
    {
        first = obj;
        second = obj1;
    }

    public static MyPair create(Object obj, Object obj1)
    {
        return new MyPair(obj, obj1);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof MyPair))
            {
                return false;
            }
            try
            {
                obj = (MyPair)obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            if (!first.equals(((MyPair) (obj)).first) || !second.equals(((MyPair) (obj)).second))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (first.hashCode() + 527) * 31 + second.hashCode();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.utils;


public class CallableWithParameters
{
    public static interface With1
    {

        public abstract void exec(Object obj);
    }

    public static interface With1Return1
    {

        public abstract Object call(Object obj);
    }

    public static interface With2
    {

        public abstract void exec(Object obj, Object obj1);
    }

    public static interface With3
    {

        public abstract void exec(Object obj, Object obj1, Object obj2);
    }

    public static interface With5
    {

        public abstract void exec(Object obj, Object obj1, Object obj2, Object obj3, Object obj4);
    }


    public CallableWithParameters()
    {
    }
}

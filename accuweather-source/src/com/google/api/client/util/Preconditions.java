// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;


public final class Preconditions
{

    private Preconditions()
    {
    }

    public static void checkArgument(boolean flag)
    {
        com.google.api.client.repackaged.com.google.common.base.Preconditions.checkArgument(flag);
    }

    public static void checkArgument(boolean flag, Object obj)
    {
        com.google.api.client.repackaged.com.google.common.base.Preconditions.checkArgument(flag, obj);
    }

    public static transient void checkArgument(boolean flag, String s, Object aobj[])
    {
        com.google.api.client.repackaged.com.google.common.base.Preconditions.checkArgument(flag, s, aobj);
    }

    public static Object checkNotNull(Object obj)
    {
        return com.google.api.client.repackaged.com.google.common.base.Preconditions.checkNotNull(obj);
    }

    public static Object checkNotNull(Object obj, Object obj1)
    {
        return com.google.api.client.repackaged.com.google.common.base.Preconditions.checkNotNull(obj, obj1);
    }

    public static transient Object checkNotNull(Object obj, String s, Object aobj[])
    {
        return com.google.api.client.repackaged.com.google.common.base.Preconditions.checkNotNull(obj, s, aobj);
    }

    public static void checkState(boolean flag)
    {
        com.google.api.client.repackaged.com.google.common.base.Preconditions.checkState(flag);
    }

    public static void checkState(boolean flag, Object obj)
    {
        com.google.api.client.repackaged.com.google.common.base.Preconditions.checkState(flag, obj);
    }

    public static transient void checkState(boolean flag, String s, Object aobj[])
    {
        com.google.api.client.repackaged.com.google.common.base.Preconditions.checkState(flag, s, aobj);
    }
}

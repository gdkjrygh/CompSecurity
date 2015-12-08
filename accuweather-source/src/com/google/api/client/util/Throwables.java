// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;


public final class Throwables
{

    private Throwables()
    {
    }

    public static RuntimeException propagate(Throwable throwable)
    {
        return com.google.api.client.repackaged.com.google.common.base.Throwables.propagate(throwable);
    }

    public static void propagateIfPossible(Throwable throwable)
    {
        com.google.api.client.repackaged.com.google.common.base.Throwables.propagateIfPossible(throwable);
    }

    public static void propagateIfPossible(Throwable throwable, Class class1)
        throws Throwable
    {
        com.google.api.client.repackaged.com.google.common.base.Throwables.propagateIfPossible(throwable, class1);
    }
}

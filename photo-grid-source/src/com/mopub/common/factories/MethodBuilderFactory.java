// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.factories;


public class MethodBuilderFactory
{

    protected static MethodBuilderFactory a = new MethodBuilderFactory();

    public MethodBuilderFactory()
    {
    }

    public static com.mopub.common.util.Reflection.MethodBuilder create(Object obj, String s)
    {
        return new com.mopub.common.util.Reflection.MethodBuilder(obj, s);
    }

    public static void setInstance(MethodBuilderFactory methodbuilderfactory)
    {
        a = methodbuilderfactory;
    }

}

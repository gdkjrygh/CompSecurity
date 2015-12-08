// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.spi.InjectionPoint;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

interface ConstructionProxy
{

    public abstract Constructor getConstructor();

    public abstract InjectionPoint getInjectionPoint();

    public transient abstract Object newInstance(Object aobj[])
        throws InvocationTargetException;
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class EventDescription
{

    public Constructor eventConstructor;
    public Method handlerMethod;

    EventDescription(Method method, Constructor constructor)
    {
        handlerMethod = method;
        eventConstructor = constructor;
    }
}

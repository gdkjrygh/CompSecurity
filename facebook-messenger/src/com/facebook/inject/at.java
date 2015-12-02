// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import javax.inject.a;

public class at
    implements a
{

    private final com.google.inject.a a;

    public at(com.google.inject.a a1)
    {
        a = a1;
    }

    public static at a(Class class1)
    {
        return new at(com.google.inject.a.a(class1));
    }

    public static at a(Class class1, Class class2)
    {
        return new at(com.google.inject.a.a(class1, class2));
    }

    public Object b()
    {
        throw new RuntimeException((new StringBuilder()).append("Application did not provide a binding for ").append(a).toString());
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.b;

import javax.inject.a;

final class b
    implements a
{

    final Object a;

    b(Object obj)
    {
        a = obj;
        super();
    }

    public Object b()
    {
        return a;
    }

    public String toString()
    {
        return (new StringBuilder()).append("of(").append(a).append(")").toString();
    }
}

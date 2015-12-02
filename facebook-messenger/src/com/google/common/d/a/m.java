// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import com.google.common.base.Function;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

final class m
    implements Function
{

    m()
    {
    }

    public Boolean a(Constructor constructor)
    {
        return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(java/lang/String));
    }

    public Object apply(Object obj)
    {
        return a((Constructor)obj);
    }
}

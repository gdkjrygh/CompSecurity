// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.d;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

final class i
    implements d
{

    i()
    {
    }

    public final Object apply(Object obj)
    {
        return Boolean.valueOf(Arrays.asList(((Constructor)obj).getParameterTypes()).contains(java/lang/String));
    }
}

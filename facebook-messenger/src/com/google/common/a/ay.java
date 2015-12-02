// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Function;
import java.util.Collection;

final class ay
    implements Function
{

    final Collection a;

    ay(Collection collection)
    {
        a = collection;
        super();
    }

    public Object apply(Object obj)
    {
        Object obj1 = obj;
        if (obj == a)
        {
            obj1 = "(this Collection)";
        }
        return obj1;
    }
}

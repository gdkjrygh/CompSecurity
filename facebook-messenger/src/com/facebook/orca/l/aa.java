// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import com.google.common.base.Function;

final class aa
    implements Function
{

    final Function a;

    aa(Function function)
    {
        a = function;
        super();
    }

    public Object apply(Object obj)
    {
        return a.apply(obj);
    }
}

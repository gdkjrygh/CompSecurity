// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.lang.reflect.Array;

class js
{

    private js()
    {
    }

    static Object[] a(Object aobj[], int i)
    {
        return (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), i);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.g.a;

import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.List;

public class c
{

    private String a;
    private Object b[];

    public c(String s, Object aobj[])
    {
        boolean flag;
        if (!Arrays.asList(aobj).contains(null))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        a = s;
        b = aobj;
    }

    public String a()
    {
        return a;
    }

    public Object[] b()
    {
        return b;
    }
}

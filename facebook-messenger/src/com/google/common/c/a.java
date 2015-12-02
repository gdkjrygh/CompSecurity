// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.c;

import com.google.common.base.Preconditions;

public final class a
{

    private a()
    {
    }

    public static int a(long l)
    {
        int i = (int)l;
        boolean flag;
        if ((long)i == l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Out of range: %s", new Object[] {
            Long.valueOf(l)
        });
        return i;
    }

    public static int b(long l)
    {
        if (l > 0x7fffffffL)
        {
            return 0x7fffffff;
        }
        if (l < 0xffffffff80000000L)
        {
            return 0x80000000;
        } else
        {
            return (int)l;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.google.common.base.Preconditions;

class c
{

    private final int a;
    private final Long b;
    private final Long c;

    private c(int i, Long long1, Long long2)
    {
label0:
        {
            boolean flag1 = false;
            super();
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            if (long1 == null)
            {
                flag = flag1;
                if (long2 == null)
                {
                    break label0;
                }
            }
            flag = true;
        }
        Preconditions.checkArgument(flag);
        a = i;
        b = long1;
        c = long2;
    }

    static c a(int i, long l)
    {
        return new c(i, Long.valueOf(l), null);
    }

    static c b(int i, long l)
    {
        return new c(i, null, Long.valueOf(l));
    }

    int a()
    {
        return a;
    }

    Long b()
    {
        return b;
    }

    Long c()
    {
        return c;
    }
}

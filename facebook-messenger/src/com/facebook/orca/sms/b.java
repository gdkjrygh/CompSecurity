// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.google.common.base.Preconditions;

class b
{

    private final long a;
    private final int b;
    private final Long c;
    private final Long d;

    private b(long l, int i, Long long1, Long long2)
    {
label0:
        {
            boolean flag1 = false;
            super();
            boolean flag;
            if (i >= 0)
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
        a = l;
        b = i;
        c = long1;
        d = long2;
    }

    static b a(long l, int i, long l1)
    {
        return new b(l, i, Long.valueOf(l1), null);
    }

    static b b(long l, int i, long l1)
    {
        return new b(l, i, null, Long.valueOf(l1));
    }

    long a()
    {
        return a;
    }

    int b()
    {
        return b;
    }

    Long c()
    {
        return c;
    }

    Long d()
    {
        return d;
    }
}

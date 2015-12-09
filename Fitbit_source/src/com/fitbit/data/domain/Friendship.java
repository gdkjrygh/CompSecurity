// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            Entity

public class Friendship extends Entity
{

    private long left;
    private long right;

    public Friendship(long l, long l1)
    {
        left = l;
        right = l1;
    }

    public Friendship(long l, long l1, long l2)
    {
        this(l1, l2);
        setEntityId(Long.valueOf(l));
        setServerId(l);
    }

    public long a()
    {
        return left;
    }

    public long b()
    {
        return right;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import java.util.Date;

// Referenced classes of package com.fitbit.data.bl:
//            e, dm, bs

public abstract class d extends e
{

    private Date a;

    public d(bs bs, boolean flag, Date date)
    {
        super(bs, flag);
        a = date;
    }

    public Date b()
    {
        return a;
    }

    public String c()
    {
        return dm.a(d(), a);
    }

    public abstract String d();
}

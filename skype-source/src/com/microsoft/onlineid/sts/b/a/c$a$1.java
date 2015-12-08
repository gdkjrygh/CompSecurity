// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import com.microsoft.onlineid.sts.a.f;
import java.util.Date;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            c

static final class nit> extends nit>
{

    public final Date a(String s)
        throws f
    {
        Date date;
        try
        {
            date = new Date(1000L * Long.parseLong(s));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw new f("Cannot parse date node: %s", illegalargumentexception, new Object[] {
                s
            });
        }
        return date;
    }

    (String s)
    {
        super(s, 0, (byte)0);
    }
}

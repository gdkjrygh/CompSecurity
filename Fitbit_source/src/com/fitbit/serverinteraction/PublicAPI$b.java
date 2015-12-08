// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import com.fitbit.util.format.e;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.fitbit.serverinteraction:
//            PublicAPI

public static class <init>
{

    public final int b;
    public final Date c;
    public final int d;
    public final f e;
    public final Integer f;

    public <init> b()
    {
        Date date = c;
        int i = b;
        return new <init>(this, date, d + i, d, f);
    }

    Map c()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("beforeDate", com.fitbit.util.format.e.h(c));
        hashmap.put("limit", String.valueOf(d));
        hashmap.put("offset", String.valueOf(b));
        hashmap.put("sort", "desc");
        if (f != null)
        {
            hashmap.put("activityId", f.toString());
        }
        return hashmap;
    }

    public ( , Date date, int i, int j, Integer integer)
    {
        if (j > 100)
        {
            throw new IllegalArgumentException("Limit cannot be greater than 100");
        }
        if (i < 0)
        {
            throw new IllegalArgumentException("Offset cannot be less than 0");
        } else
        {
            e = ;
            c = date;
            b = i;
            d = j;
            f = integer;
            return;
        }
    }

    public f(Date date, int i, int j)
    {
        this(null, date, i, j, null);
    }
}

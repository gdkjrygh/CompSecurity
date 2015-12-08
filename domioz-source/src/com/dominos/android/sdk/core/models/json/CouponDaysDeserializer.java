// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.core.models.coupon.Day;
import com.google.b.t;
import com.google.b.u;
import com.google.b.v;
import com.google.b.w;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CouponDaysDeserializer
    implements v
{

    public CouponDaysDeserializer()
    {
    }

    public volatile Object deserialize(w w1, Type type, u u)
    {
        return deserialize(w1, type, u);
    }

    public Day[] deserialize(w w1, Type type, u u)
    {
        if (w1 instanceof t)
        {
            type = new ArrayList();
            for (w1 = w1.i().iterator(); w1.hasNext(); type.add(new Day(((w)w1.next()).c()))) { }
            return (Day[])type.toArray(new Day[type.size()]);
        } else
        {
            return (new Day[] {
                new Day(w1.c())
            });
        }
    }
}

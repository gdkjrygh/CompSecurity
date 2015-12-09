// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.util.bn;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

// Referenced classes of package com.fitbit.data.bl:
//            SyncDataForLongPeriodOperation

public static class a
{

    public final a a;
    public final a b;
    public a c[];

    public static a a(int i)
    {
        return a(i, TimeZone.getDefault());
    }

    public static a a(int i, TimeZone timezone)
    {
        if (i < 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("month count must be >= 1, was = ").append(i).toString());
        } else
        {
            timezone = Calendar.getInstance(timezone);
            int j = timezone.get(1);
            int k = timezone.get(2);
            timezone.add(2, -(i - 1));
            return new <init>(new <init>(timezone.get(1), timezone.get(2)), new <init>(j, k));
        }
    }

    private void a()
    {
        ArrayList arraylist = new ArrayList();
        for (<init> <init>1 = a; !<init>1.equals(b); <init>1 = <init>1.a())
        {
            arraylist.add(<init>1);
        }

        arraylist.add(b);
        c = new c[arraylist.size()];
        c = (c[])arraylist.toArray(c);
    }

    public static c b(int i)
    {
        return a(i, bn.b());
    }

    public _cls9(_cls9 _pcls9, _cls9 _pcls9_1)
    {
        a = _pcls9;
        b = _pcls9_1;
        a();
    }
}

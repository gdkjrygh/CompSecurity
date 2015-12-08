// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.util.bn;
import com.fitbit.util.format.e;
import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.fitbit.data.domain:
//            ActivityLogEntry

public static class a
    implements Comparable
{

    final int a;

    public int a()
    {
        return a;
    }

    public int a(a a1)
    {
        return a - a1.a;
    }

    public String b()
    {
        return e.a(new Date(a), bn.a());
    }

    public boolean b(a a1)
    {
        return a(a1) > 0;
    }

    public boolean c(a a1)
    {
        return a(a1) < 0;
    }

    public int compareTo(Object obj)
    {
        return a((a)obj);
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof a) && ((a)obj).a == a;
    }

    public int hashCode()
    {
        return a;
    }

    public String toString()
    {
        return b();
    }

    public (long l)
    {
        this(new Date(l));
    }

    public <init>(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(11);
        int j = calendar.get(12);
        int k = calendar.get(13);
        int l = calendar.get(14);
        date = Calendar.getInstance();
        date.clear();
        date.set(11, i);
        date.set(12, j);
        date.set(13, k);
        date.set(14, l);
        a = (int)date.getTimeInMillis();
    }
}

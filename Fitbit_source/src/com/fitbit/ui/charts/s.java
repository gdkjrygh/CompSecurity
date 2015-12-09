// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import java.util.Date;

// Referenced classes of package com.fitbit.ui.charts:
//            n

public class s
    implements n
{

    private long a;
    private double b;

    public s(double d, double d1)
    {
        a = (long)d;
        b = d1;
    }

    public s(long l, double d)
    {
        a = l;
        b = d;
    }

    public long a()
    {
        return a;
    }

    public double b()
    {
        return b;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" dateTime: ").append((new Date(a)).toString());
        stringbuilder.append(" value: ").append(String.valueOf(b));
        return stringbuilder.toString();
    }
}

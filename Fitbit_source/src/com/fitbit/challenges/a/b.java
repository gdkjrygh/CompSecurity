// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.a;

import java.util.Comparator;
import java.util.Date;

public class b
    implements Comparator
{

    public b()
    {
    }

    public int a(Date date, Date date1)
    {
        int i = 0;
        if (date != null && date1 != null)
        {
            i = date.compareTo(date1);
        } else
        {
            if (date != null)
            {
                return -1;
            }
            if (date1 != null)
            {
                return 1;
            }
        }
        return i;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Date)obj, (Date)obj1);
    }
}

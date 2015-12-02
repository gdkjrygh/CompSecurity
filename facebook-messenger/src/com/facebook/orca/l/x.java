// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import com.google.common.a.jr;
import java.util.Comparator;

final class x
    implements Comparator
{

    final Comparator a;

    x(Comparator comparator)
    {
        a = comparator;
        super();
    }

    public int a(jr jr1, jr jr2)
    {
        if (!jr1.hasNext() && !jr2.hasNext())
        {
            return 0;
        }
        if (!jr1.hasNext())
        {
            return 1;
        }
        if (!jr2.hasNext())
        {
            return -1;
        } else
        {
            return a.compare(jr1.a(), jr2.a());
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return a((jr)obj, (jr)obj1);
    }
}

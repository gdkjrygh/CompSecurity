// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

static final class >
    implements Comparator
{

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (re)obj;
        obj1 = (re)obj1;
        if (((re) (obj)).start >= (() (obj1)).start)
        {
            if ((() (obj)).start > (() (obj1)).start)
            {
                return 1;
            }
            if ((() (obj)).end < ((end) (obj1)).end)
            {
                return 1;
            }
            if (((end) (obj)).end <= ((end) (obj1)).end)
            {
                return 0;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj)
    {
        return false;
    }

    >()
    {
    }
}

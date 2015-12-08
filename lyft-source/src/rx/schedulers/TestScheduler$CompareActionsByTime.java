// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import java.util.Comparator;

class <init>
    implements Comparator
{

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((compare)obj, (compare)obj1);
    }

    public int compare(compare compare1, compare compare2)
    {
        if (_mth0(compare1) == _mth0(compare2))
        {
            return Long.valueOf(_mth0(compare1)).compareTo(Long.valueOf(_mth0(compare2)));
        } else
        {
            return Long.valueOf(_mth0(compare1)).compareTo(Long.valueOf(_mth0(compare2)));
        }
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}

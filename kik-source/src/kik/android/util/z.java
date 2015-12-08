// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import java.util.Comparator;

// Referenced classes of package kik.android.util:
//            bt

final class z
    implements Comparator
{

    z()
    {
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (bt)obj;
        obj1 = (bt)obj1;
        if (((bt) (obj)).b >= ((bt) (obj1)).b)
        {
            if (((bt) (obj)).b > ((bt) (obj1)).b)
            {
                return 1;
            }
            if (((bt) (obj)).c < ((bt) (obj1)).c)
            {
                return 1;
            }
            if (((bt) (obj)).c <= ((bt) (obj1)).c)
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
}

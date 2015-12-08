// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.c;

import com.kik.i.a.a.a;
import java.util.Comparator;

// Referenced classes of package com.kik.android.c:
//            f

public static final class 
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (a)obj;
        obj1 = (a)obj1;
        if (obj != null || obj1 != null)
        {
            if (obj == null)
            {
                return -1;
            }
            if (obj1 == null)
            {
                return 1;
            }
            if (((a) (obj)).c() != null || ((a) (obj1)).c() != null)
            {
                if (((a) (obj)).c() == null)
                {
                    return -1;
                }
                if (((a) (obj1)).c() == null)
                {
                    return 1;
                } else
                {
                    return ((a) (obj)).c().intValue() - ((a) (obj1)).c().intValue();
                }
            }
        }
        return 0;
    }

    public ()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c;

import java.util.Comparator;

// Referenced classes of package org.c.c:
//            a

final class b
    implements Comparator
{

    b()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (a)obj;
        obj1 = (a)obj1;
        double d = ((a) (obj)).getQualityValue();
        int i = Double.compare(((a) (obj1)).getQualityValue(), d);
        if (i != 0)
        {
            return i;
        }
        if (((a) (obj)).isWildcardType() && !((a) (obj1)).isWildcardType())
        {
            return 1;
        }
        if (((a) (obj1)).isWildcardType() && !((a) (obj)).isWildcardType())
        {
            return -1;
        } else
        {
            ((a) (obj)).getType().equals(((a) (obj1)).getType());
            return 0;
        }
    }
}

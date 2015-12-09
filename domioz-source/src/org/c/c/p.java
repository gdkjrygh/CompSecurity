// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c;

import java.util.Comparator;
import java.util.Map;

// Referenced classes of package org.c.c:
//            n

final class p
    implements Comparator
{

    p()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (n)obj;
        obj1 = (n)obj1;
        double d = ((n) (obj)).getQualityValue();
        int i = Double.compare(((n) (obj1)).getQualityValue(), d);
        if (i != 0)
        {
            return i;
        }
        if (!((n) (obj)).isWildcardType() || ((n) (obj1)).isWildcardType())
        {
            if (((n) (obj1)).isWildcardType() && !((n) (obj)).isWildcardType())
            {
                return -1;
            }
            if (!((n) (obj)).getType().equals(((n) (obj1)).getType()))
            {
                return 0;
            }
            if (!((n) (obj)).isWildcardSubtype() || ((n) (obj1)).isWildcardSubtype())
            {
                if (((n) (obj1)).isWildcardSubtype() && !((n) (obj)).isWildcardSubtype())
                {
                    return -1;
                }
                if (!((n) (obj)).getSubtype().equals(((n) (obj1)).getSubtype()))
                {
                    return 0;
                }
                int j = n.a(((n) (obj))).size();
                int k = n.a(((n) (obj1))).size();
                if (k < j)
                {
                    return -1;
                }
                if (k == j)
                {
                    return 0;
                }
            }
        }
        return 1;
    }
}

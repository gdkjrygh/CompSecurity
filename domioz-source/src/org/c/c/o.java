// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c;

import java.util.Comparator;
import java.util.Map;

// Referenced classes of package org.c.c:
//            n

final class o
    implements Comparator
{

    o()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (n)obj;
        obj1 = (n)obj1;
        if (((n) (obj)).isWildcardType() && !((n) (obj1)).isWildcardType())
        {
            break MISSING_BLOCK_LABEL_161;
        }
        if (!((n) (obj1)).isWildcardType() || ((n) (obj)).isWildcardType()) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        if (!((n) (obj)).getType().equals(((n) (obj1)).getType()))
        {
            return 0;
        }
        if (((n) (obj)).isWildcardSubtype() && !((n) (obj1)).isWildcardSubtype())
        {
            break MISSING_BLOCK_LABEL_161;
        }
        if (((n) (obj1)).isWildcardSubtype() && !((n) (obj)).isWildcardSubtype()) goto _L1; else goto _L3
_L3:
        int i;
        int j;
        if (!((n) (obj)).getSubtype().equals(((n) (obj1)).getSubtype()))
        {
            return 0;
        }
        double d = ((n) (obj)).getQualityValue();
        i = Double.compare(((n) (obj1)).getQualityValue(), d);
        if (i != 0)
        {
            return i;
        }
        i = n.a(((n) (obj))).size();
        j = n.a(((n) (obj1))).size();
        if (j < i) goto _L1; else goto _L4
_L4:
        if (j == i)
        {
            return 0;
        }
        return 1;
    }
}

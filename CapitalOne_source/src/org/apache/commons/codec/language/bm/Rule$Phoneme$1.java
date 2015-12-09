// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language.bm;

import java.util.Comparator;

// Referenced classes of package org.apache.commons.codec.language.bm:
//            Rule

static final class _cls9
    implements Comparator
{

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((compare)obj, (compare)obj1);
    }

    public int compare(compare compare1, compare compare2)
    {
        int i = 0;
_L6:
        if (i >= cess._mth000(compare1).length())
        {
            break; /* Loop/switch isn't completed */
        }
        if (i < cess._mth000(compare2).length()) goto _L2; else goto _L1
_L1:
        int j = 1;
_L4:
        return j;
_L2:
        int k;
        k = cess._mth000(compare1).charAt(i) - cess._mth000(compare2).charAt(i);
        j = k;
        if (k != 0) goto _L4; else goto _L3
_L3:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        return cess._mth000(compare1).length() >= cess._mth000(compare2).length() ? 0 : -1;
    }

    _cls9()
    {
    }
}

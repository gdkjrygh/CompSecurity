// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.c;

import java.util.Comparator;

// Referenced classes of package com.kik.android.c:
//            e

public static final class 
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (e)obj;
        obj1 = (e)obj1;
        if (obj != null || obj1 != null) goto _L2; else goto _L1
_L1:
        return 0;
_L2:
        if (obj == null)
        {
            return -1;
        }
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((e) (obj)).i() == ((e) (obj1)).i())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((e) (obj)).i() < ((e) (obj1)).i())
        {
            return -1;
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return 1;
    }

    public ()
    {
    }
}

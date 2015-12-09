// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;

import java.util.Comparator;

// Referenced classes of package com.nuance.b.a:
//            z

final class aa
    implements Comparator
{

    final z a;

    aa(z z)
    {
        a = z;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (String)obj;
        obj1 = (String)obj1;
        int i = Integer.parseInt(((String) (obj)));
        int j = Integer.parseInt(((String) (obj1)));
        if (i < j)
        {
            return -1;
        }
        return i <= j ? 0 : 1;
    }
}

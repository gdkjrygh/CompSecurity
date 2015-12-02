// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.cache;

import java.util.Comparator;

// Referenced classes of package com.facebook.cache:
//            a, i

public class m
    implements Comparator
{

    public m()
    {
    }

    public int a(a a1, a a2)
    {
        int j = a1.a().getPriorityValue();
        int k = a2.a().getPriorityValue();
        if (j <= k)
        {
            if (j < k)
            {
                return -1;
            }
            if (a1.f() <= a2.f())
            {
                return a1.f() >= a2.f() ? 0 : -1;
            }
        }
        return 1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((a)obj, (a)obj1);
    }
}

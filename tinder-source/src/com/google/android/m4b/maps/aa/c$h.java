// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            c, bo

final class <init> extends <init>
    implements Set
{

    private c e;

    public final boolean removeAll(Collection collection)
    {
        boolean flag;
        if (collection.isEmpty())
        {
            flag = false;
        } else
        {
            int i = size();
            boolean flag1 = bo.a((Set)b, collection);
            flag = flag1;
            if (flag1)
            {
                int j = b.size();
                c.a(e, j - i);
                b();
                return flag1;
            }
        }
        return flag;
    }

    (c c1, Object obj, Set set)
    {
        e = c1;
        super(c1, obj, set, null);
    }
}

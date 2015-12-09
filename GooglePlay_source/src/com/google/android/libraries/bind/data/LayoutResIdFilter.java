// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import com.google.android.libraries.bind.async.Queues;
import java.util.List;

// Referenced classes of package com.google.android.libraries.bind.data:
//            BaseReadonlyFilter, Data

public final class LayoutResIdFilter extends BaseReadonlyFilter
{

    private final Integer originalResId;
    private final int resIdKey;

    public LayoutResIdFilter(int i, int j)
    {
        super(Queues.BIND_IMMEDIATE);
        originalResId = Integer.valueOf(i);
        resIdKey = j;
    }

    public final List transform$7ddb133f(List list)
    {
        List list1 = list;
        if (list.size() > 0)
        {
            list1 = list;
            if (!originalResId.equals(((Data)list.get(0)).getAsInteger(resIdKey)))
            {
                list1 = null;
            }
        }
        return list1;
    }
}

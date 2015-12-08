// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Comparator;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

private static final class mSortColumn
    implements Comparator
{

    private final String mSortColumn;

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (HashMap)obj;
        obj1 = (HashMap)obj1;
        obj = Preconditions.checkNotNull(((HashMap) (obj)).get(mSortColumn));
        obj1 = Preconditions.checkNotNull(((HashMap) (obj1)).get(mSortColumn));
        if (obj.equals(obj1))
        {
            return 0;
        }
        if (obj instanceof Boolean)
        {
            return ((Boolean)obj).compareTo((Boolean)obj1);
        }
        if (obj instanceof Long)
        {
            return ((Long)obj).compareTo((Long)obj1);
        }
        if (obj instanceof Integer)
        {
            return ((Integer)obj).compareTo((Integer)obj1);
        }
        if (obj instanceof String)
        {
            return ((String)obj).compareTo((String)obj1);
        }
        if (obj instanceof Double)
        {
            return ((Double)obj).compareTo((Double)obj1);
        }
        if (obj instanceof Float)
        {
            return ((Float)obj).compareTo((Float)obj1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown type for lValue ")).append(obj).toString());
        }
    }

    I(String s)
    {
        mSortColumn = (String)Preconditions.checkNotNull(s);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.util.Pair;
import java.util.Comparator;
import java.util.Date;

// Referenced classes of package com.fitbit.data.bl:
//            b

class 
    implements Comparator
{

    final b a;

    public int a(Pair pair, Pair pair1)
    {
        return ((Date)pair.first).compareTo((Date)pair1.first);
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Pair)obj, (Pair)obj1);
    }

    (b b1)
    {
        a = b1;
        super();
    }
}

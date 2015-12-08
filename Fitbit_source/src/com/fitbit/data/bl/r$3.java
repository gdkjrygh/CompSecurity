// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.FoodLocale;
import com.fitbit.util.d.c;

// Referenced classes of package com.fitbit.data.bl:
//            r

class it> extends c
{

    final r a;

    public boolean a(FoodLocale foodlocale)
    {
        return foodlocale.c();
    }

    public volatile boolean a(Object obj)
    {
        return a((FoodLocale)obj);
    }

    FoodLocale(r r1)
    {
        a = r1;
        super();
    }
}

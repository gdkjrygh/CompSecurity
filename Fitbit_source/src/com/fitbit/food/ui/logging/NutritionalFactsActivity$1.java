// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import android.content.Context;
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.util.bf;

// Referenced classes of package com.fitbit.food.ui.logging:
//            NutritionalFactsActivity

class b extends bf
{

    final long a;
    final long b;
    final NutritionalFactsActivity c;

    protected FoodItem a()
    {
        if (a > 0L)
        {
            return r.a().c(a);
        } else
        {
            return r.a().b(b);
        }
    }

    protected Object f_()
    {
        return a();
    }

    (NutritionalFactsActivity nutritionalfactsactivity, Context context, long l, long l1)
    {
        c = nutritionalfactsactivity;
        a = l;
        b = l1;
        super(context);
    }
}

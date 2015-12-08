// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.content.Context;
import android.content.Intent;
import com.fitbit.data.bl.cf;
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.ui.choose.b;
import java.util.Collections;
import java.util.Comparator;

// Referenced classes of package com.fitbit.ui.choose.food:
//            c

abstract class d extends b
{

    public d(Context context)
    {
        super(context);
    }

    public c e()
    {
        java.util.List list = r.a().p();
        Collections.sort(list, new Comparator() {

            final d a;

            public int a(FoodItem fooditem, FoodItem fooditem1)
            {
                return fooditem.f().compareTo(fooditem1.f());
            }

            public int compare(Object obj, Object obj1)
            {
                return a((FoodItem)obj, (FoodItem)obj1);
            }

            
            {
                a = d.this;
                super();
            }
        });
        return new c(list);
    }

    protected Intent f()
    {
        return cf.a(getContext());
    }

    public Object f_()
    {
        return e();
    }
}

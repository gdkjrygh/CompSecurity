// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.content.Context;
import android.content.Intent;
import com.fitbit.data.bl.cf;
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.Meal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.ui.choose.food:
//            a

abstract class b extends com.fitbit.ui.choose.b
{

    public b(Context context)
    {
        super(context);
    }

    public a e()
    {
        ArrayList arraylist = new ArrayList();
        Object obj1 = r.a().v();
        Object obj = r.a().o();
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); arraylist.add(new ChooseCustomFragment.b((FoodItem)((Iterator) (obj1)).next()))) { }
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(new ChooseCustomFragment.b((Meal)((Iterator) (obj)).next()))) { }
        Collections.sort(arraylist, new Comparator() {

            final b a;

            public int a(ChooseCustomFragment.b b1, ChooseCustomFragment.b b2)
            {
                return b1.a(a.getContext()).compareToIgnoreCase(b2.a(a.getContext()));
            }

            public int compare(Object obj2, Object obj3)
            {
                return a((ChooseCustomFragment.b)obj2, (ChooseCustomFragment.b)obj3);
            }

            
            {
                a = b.this;
                super();
            }
        });
        return new a(arraylist);
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

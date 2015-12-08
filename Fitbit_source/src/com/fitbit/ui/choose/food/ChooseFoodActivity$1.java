// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.Loader;
import com.fitbit.ui.a.a;

// Referenced classes of package com.fitbit.ui.choose.food:
//            ChooseFoodActivity, c, ChooseFavoriteFoodFragment_, d

class a
    implements android.support.v4.app.allbacks
{

    final ChooseFoodActivity a;

    public void a(Loader loader, c c1)
    {
        if (!c1.a() && !a.m)
        {
            a.l.a(com/fitbit/ui/choose/food/ChooseFavoriteFoodFragment_);
            int i = a.l.getCount();
            com.fitbit.ui.choose.food.ChooseFoodActivity.a(a, a.l.a(i - 1));
            a.m = true;
        }
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new d(a) {

            final ChooseFoodActivity._cls1 b;

            protected void b()
            {
            }

            protected void d()
            {
            }

            
            {
                b = ChooseFoodActivity._cls1.this;
                super(context);
            }
        };
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (c)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    _cls1.b(ChooseFoodActivity choosefoodactivity)
    {
        a = choosefoodactivity;
        super();
    }
}

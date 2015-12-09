// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.Loader;
import com.fitbit.ui.a.a;

// Referenced classes of package com.fitbit.ui.choose.food:
//            d, ChooseFoodActivity, c, ChooseFavoriteFoodFragment_

class b extends d
{

    final b b;

    protected void b()
    {
    }

    protected void d()
    {
    }

    ent_(ent_ ent_, Context context)
    {
        b = ent_;
        super(context);
    }

    // Unreferenced inner class com/fitbit/ui/choose/food/ChooseFoodActivity$1

/* anonymous class */
    class ChooseFoodActivity._cls1
        implements android.support.v4.app.LoaderManager.LoaderCallbacks
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
            return new ChooseFoodActivity._cls1._cls1(this, a);
        }

        public void onLoadFinished(Loader loader, Object obj)
        {
            a(loader, (c)obj);
        }

        public void onLoaderReset(Loader loader)
        {
        }

            
            {
                a = choosefoodactivity;
                super();
            }
    }

}

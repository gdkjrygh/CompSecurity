// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.widget.ProgressBar;
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.food.ui.logging.views.NutritionalFactsView;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.bf;

// Referenced classes of package com.fitbit.food.ui.logging:
//            NutritionalFactsActivity_

public class NutritionalFactsActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{

    private static final String e = "com.fitbit.food.ui.NutritionalFactsActivity.SERVER_ID_TAG";
    private static final String f = "com.fitbit.food.ui.NutritionalFactsActivity.ENTITY_ID_TAG";
    protected NutritionalFactsView a;
    protected ProgressBar b;
    protected long c;
    protected long d;

    public NutritionalFactsActivity()
    {
    }

    public static void a(Context context, long l, long l1)
    {
        NutritionalFactsActivity_.a(context).a(l).b(l1).b();
    }

    public void a(Loader loader, FoodItem fooditem)
    {
        b.setVisibility(4);
        a.setVisibility(0);
        a.a(fooditem);
    }

    protected void c()
    {
        Bundle bundle = new Bundle();
        bundle.putLong("com.fitbit.food.ui.NutritionalFactsActivity.ENTITY_ID_TAG", c);
        bundle.putLong("com.fitbit.food.ui.NutritionalFactsActivity.SERVER_ID_TAG", d);
        getSupportLoaderManager().initLoader(28, bundle, this);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        long l = bundle.getLong("com.fitbit.food.ui.NutritionalFactsActivity.SERVER_ID_TAG");
        long l1 = bundle.getLong("com.fitbit.food.ui.NutritionalFactsActivity.ENTITY_ID_TAG");
        return new bf(getBaseContext(), l, l1) {

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

            
            {
                c = NutritionalFactsActivity.this;
                a = l;
                b = l1;
                super(context);
            }
        };
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (FoodItem)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }
}

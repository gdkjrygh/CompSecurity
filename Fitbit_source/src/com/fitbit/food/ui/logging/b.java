// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import android.content.Context;
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.FoodLogEntry;
import com.fitbit.e.a;
import com.fitbit.util.av;
import com.fitbit.util.az;
import java.util.UUID;

public class b extends az
{
    public static class a extends av
    {

        public FoodLogEntry a;

        public a()
        {
        }
    }


    private static final String c = "FoodLogEntryLoader";
    protected final long a;
    protected final LogFoodBaseActivity.Mode b;

    public b(Context context, long l, LogFoodBaseActivity.Mode mode)
    {
        super(context);
        a = l;
        b = mode;
    }

    protected boolean a(String s)
    {
        return r.a().f(s);
    }

    protected void b()
    {
        r.a().c(this);
    }

    protected void d()
    {
        r.a().d(this);
    }

    protected a e()
    {
        com.fitbit.e.a.a("FoodLogEntryLoader", "loadData", new Object[0]);
        a a1 = new a();
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[LogFoodBaseActivity.Mode.values().length];
                try
                {
                    a[com.fitbit.food.ui.logging.LogFoodBaseActivity.Mode.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[LogFoodBaseActivity.Mode.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        FoodLogEntry foodlogentry1;
        switch (com.fitbit.food.ui.logging._cls1.a[b.ordinal()])
        {
        default:
            return a1;

        case 1: // '\001'
            FoodLogEntry foodlogentry = new FoodLogEntry();
            foodlogentry.setUuid(UUID.randomUUID());
            a1.a = foodlogentry;
            return a1;

        case 2: // '\002'
            foodlogentry1 = r.a().a(a);
            break;
        }
        if (foodlogentry1 == null)
        {
            a1.a(-2);
            return a1;
        } else
        {
            a1.a = foodlogentry1;
            return a1;
        }
    }

    protected Object f_()
    {
        return e();
    }
}

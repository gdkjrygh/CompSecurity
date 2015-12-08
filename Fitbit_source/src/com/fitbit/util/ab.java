// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.h;
import com.fitbit.util.format.f;
import java.util.List;

// Referenced classes of package com.fitbit.util:
//            an

public class ab
{

    public ab()
    {
    }

    private static double a(double d)
    {
        if (an.a(d))
        {
            return 1.0D;
        } else
        {
            return 1.0D / d;
        }
    }

    public static double a(h h1)
    {
        double d = 1.0D;
        if (h1 != null)
        {
            d = a(h1.c());
        }
        return d;
    }

    public static h a(FoodItem fooditem)
    {
        h h1 = null;
        if (fooditem != null)
        {
            h h2 = fooditem.j();
            h1 = h2;
            if (h2 == null)
            {
                h1 = h2;
                if (fooditem.b() != null)
                {
                    h1 = h2;
                    if (fooditem.b().size() > 0)
                    {
                        h1 = (h)fooditem.b().get(0);
                    }
                }
            }
        }
        h h3 = h1;
        if (h1 == null)
        {
            h3 = new h();
            h3.a(true);
            h3.a(1.0D);
            h3.a("");
            h3.b("");
            h3.a(fooditem);
        }
        return h3;
    }

    public static String a(Context context, FoodItem fooditem)
    {
        String s1 = "";
        String s = s1;
        if (fooditem != null)
        {
            s = s1;
            if (context != null)
            {
                fooditem = fooditem.j();
                s = s1;
                if (fooditem != null)
                {
                    s = f.a(context, a(fooditem.c()), fooditem.a(), fooditem.b());
                }
            }
        }
        return s;
    }
}

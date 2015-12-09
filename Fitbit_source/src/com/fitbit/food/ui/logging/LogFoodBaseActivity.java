// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import android.app.Activity;
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.FoodLogEntry;
import com.fitbit.util.av;

// Referenced classes of package com.fitbit.food.ui.logging:
//            LogWithMealTypeActivity

public abstract class LogFoodBaseActivity extends LogWithMealTypeActivity
{
    public static final class Mode extends Enum
    {

        public static final Mode a;
        public static final Mode b;
        private static final Mode c[];

        public static Mode valueOf(String s)
        {
            return (Mode)Enum.valueOf(com/fitbit/food/ui/logging/LogFoodBaseActivity$Mode, s);
        }

        public static Mode[] values()
        {
            return (Mode[])c.clone();
        }

        static 
        {
            a = new Mode("CREATE_NEW", 0);
            b = new Mode("EDIT_EXISTING", 1);
            c = (new Mode[] {
                a, b
            });
        }

        private Mode(String s, int i)
        {
            super(s, i);
        }
    }


    protected Mode x;
    protected Long y;
    protected FoodLogEntry z;

    public LogFoodBaseActivity()
    {
        y = Long.valueOf(-1L);
    }

    protected void a(Activity activity)
    {
        if (z != null && z.getLogDate() != null)
        {
            r.a().a(z, activity);
        }
    }

    protected void a(b.a a1)
    {
        z = a1.a;
        f();
    }

    protected volatile void a(av av)
    {
        a((b.a)av);
    }

    protected abstract void f();
}

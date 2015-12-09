// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;


// Referenced classes of package com.fitbit.food.ui.logging:
//            LogFoodActivity

class a
    implements Runnable
{

    final LogFoodActivity a;

    public void run()
    {
        LogFoodActivity.c(a);
    }

    (LogFoodActivity logfoodactivity)
    {
        a = logfoodactivity;
        super();
    }
}

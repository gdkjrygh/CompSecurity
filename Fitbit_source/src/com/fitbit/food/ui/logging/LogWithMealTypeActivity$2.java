// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import android.support.v4.app.LoaderManager;
import com.fitbit.home.ui.f;
import com.fitbit.home.ui.l;

// Referenced classes of package com.fitbit.food.ui.logging:
//            LogWithMealTypeActivity

class a
    implements com.fitbit.home.ui.ivity._cls2
{

    final LogWithMealTypeActivity a;

    public void a(l l)
    {
        LogWithMealTypeActivity.a(a).c();
        a.getSupportLoaderManager().restartLoader(a.e(), null, a);
    }

    (LogWithMealTypeActivity logwithmealtypeactivity)
    {
        a = logwithmealtypeactivity;
        super();
    }
}

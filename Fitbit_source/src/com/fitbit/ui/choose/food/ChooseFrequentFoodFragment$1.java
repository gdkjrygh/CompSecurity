// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.content.Context;

// Referenced classes of package com.fitbit.ui.choose.food:
//            f, ChooseFrequentFoodFragment

class b extends f
{

    final ChooseFrequentFoodFragment b;

    protected void b()
    {
        b.setListShown(false);
    }

    protected void d()
    {
        b.setListShown(true);
    }

    (ChooseFrequentFoodFragment choosefrequentfoodfragment, Context context)
    {
        b = choosefrequentfoodfragment;
        super(context);
    }
}

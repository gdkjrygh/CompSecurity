// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.content.Context;

// Referenced classes of package com.fitbit.ui.choose.food:
//            d, ChooseFavoriteFoodFragment

class b extends d
{

    final ChooseFavoriteFoodFragment b;

    protected void b()
    {
        b.setListShown(false);
    }

    protected void d()
    {
        b.setListShown(true);
    }

    (ChooseFavoriteFoodFragment choosefavoritefoodfragment, Context context)
    {
        b = choosefavoritefoodfragment;
        super(context);
    }
}

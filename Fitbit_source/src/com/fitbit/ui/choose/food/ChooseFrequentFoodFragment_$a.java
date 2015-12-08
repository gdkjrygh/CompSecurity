// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.os.Bundle;
import java.util.Date;

// Referenced classes of package com.fitbit.ui.choose.food:
//            ChooseFrequentFoodFragment_, ChooseFrequentFoodFragment

public static class <init>
{

    private Bundle a;

    public ChooseFrequentFoodFragment a()
    {
        ChooseFrequentFoodFragment_ choosefrequentfoodfragment_ = new ChooseFrequentFoodFragment_();
        choosefrequentfoodfragment_.setArguments(a);
        return choosefrequentfoodfragment_;
    }

    public a a(Date date)
    {
        a.putSerializable("date", date);
        return this;
    }

    private ()
    {
        a = new Bundle();
    }

    a(a a1)
    {
        this();
    }
}

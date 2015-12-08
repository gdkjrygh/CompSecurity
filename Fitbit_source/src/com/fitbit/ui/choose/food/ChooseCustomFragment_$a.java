// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.os.Bundle;
import java.util.Date;

// Referenced classes of package com.fitbit.ui.choose.food:
//            ChooseCustomFragment_, ChooseCustomFragment

public static class <init>
{

    private Bundle a;

    public ChooseCustomFragment a()
    {
        ChooseCustomFragment_ choosecustomfragment_ = new ChooseCustomFragment_();
        choosecustomfragment_.setArguments(a);
        return choosecustomfragment_;
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

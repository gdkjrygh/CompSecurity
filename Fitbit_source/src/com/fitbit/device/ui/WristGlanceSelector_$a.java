// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.os.Bundle;

// Referenced classes of package com.fitbit.device.ui:
//            WristGlanceSelector_, WristGlanceSelector

public static class <init>
{

    private Bundle a;

    public WristGlanceSelector a()
    {
        WristGlanceSelector_ wristglanceselector_ = new WristGlanceSelector_();
        wristglanceselector_.setArguments(a);
        return wristglanceselector_;
    }

    public a a(String s)
    {
        a.putString("encodedId", s);
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

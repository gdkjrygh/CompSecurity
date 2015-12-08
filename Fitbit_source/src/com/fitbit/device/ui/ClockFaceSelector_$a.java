// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.os.Bundle;

// Referenced classes of package com.fitbit.device.ui:
//            ClockFaceSelector_, ClockFaceSelector

public static class <init>
{

    private Bundle a;

    public ClockFaceSelector a()
    {
        ClockFaceSelector_ clockfaceselector_ = new ClockFaceSelector_();
        clockfaceselector_.setArguments(a);
        return clockfaceselector_;
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

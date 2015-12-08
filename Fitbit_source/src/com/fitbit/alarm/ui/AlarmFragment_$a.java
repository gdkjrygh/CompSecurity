// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.os.Bundle;

// Referenced classes of package com.fitbit.alarm.ui:
//            AlarmFragment_, AlarmFragment

public static class <init>
{

    private Bundle a;

    public AlarmFragment a()
    {
        AlarmFragment_ alarmfragment_ = new AlarmFragment_();
        alarmfragment_.setArguments(a);
        return alarmfragment_;
    }

    public a a(String s)
    {
        a.putString("deviceAddress", s);
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

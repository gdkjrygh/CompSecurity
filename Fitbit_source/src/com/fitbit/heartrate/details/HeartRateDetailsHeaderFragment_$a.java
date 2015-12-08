// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.details;

import android.os.Bundle;
import java.util.Date;

// Referenced classes of package com.fitbit.heartrate.details:
//            HeartRateDetailsHeaderFragment_, HeartRateDetailsHeaderFragment

public static class <init>
{

    private Bundle a;

    public HeartRateDetailsHeaderFragment a()
    {
        HeartRateDetailsHeaderFragment_ heartratedetailsheaderfragment_ = new HeartRateDetailsHeaderFragment_();
        heartratedetailsheaderfragment_.setArguments(a);
        return heartratedetailsheaderfragment_;
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

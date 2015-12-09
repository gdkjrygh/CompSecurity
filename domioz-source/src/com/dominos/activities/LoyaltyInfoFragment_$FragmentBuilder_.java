// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.os.Bundle;
import org.androidannotations.api.a.d;

// Referenced classes of package com.dominos.activities:
//            LoyaltyInfoFragment_, LoyaltyInfoFragment

public class  extends d
{

    public LoyaltyInfoFragment build()
    {
        LoyaltyInfoFragment_ loyaltyinfofragment_ = new LoyaltyInfoFragment_();
        loyaltyinfofragment_.setArguments(args);
        return loyaltyinfofragment_;
    }

    public volatile Object build()
    {
        return build();
    }

    public build mInfoType(build build1)
    {
        args.putSerializable("mInfoType", build1);
        return this;
    }

    public ()
    {
    }
}

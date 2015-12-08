// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            RewardNotEnrolledFragment

public class LoyaltyEnrollmentPage extends FragmentActivity
{

    public LoyaltyEnrollmentPage()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030013);
        bundle = new RewardNotEnrolledFragment();
        getFragmentManager().beginTransaction().add(0x7f0d0098, bundle).commit();
    }
}

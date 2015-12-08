// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.os.Bundle;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import com.dominos.fragments.OrderSettingsFragment_;

// Referenced classes of package com.dominos.activities:
//            BaseActivity

public class OrderSettingActivity extends BaseActivity
{

    public OrderSettingActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            getSupportFragmentManager().a().b(0x7f0f0317, OrderSettingsFragment_.builder().build()).a();
        }
    }
}

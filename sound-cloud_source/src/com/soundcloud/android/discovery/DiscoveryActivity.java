// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.view.screen.BaseLayoutHelper;

// Referenced classes of package com.soundcloud.android.discovery:
//            DiscoveryFragment

public class DiscoveryActivity extends ScActivity
{

    BaseLayoutHelper baseLayoutHelper;
    PlayerController playerController;

    public DiscoveryActivity()
    {
    }

    private void createFragmentForDiscovery()
    {
        getSupportFragmentManager().beginTransaction().replace(0x7f0f00b5, new DiscoveryFragment()).commit();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(0x7f070061);
        if (bundle == null)
        {
            createFragmentForDiscovery();
        }
    }

    protected void setActivityContentView()
    {
        baseLayoutHelper.setBaseLayout(this);
    }
}

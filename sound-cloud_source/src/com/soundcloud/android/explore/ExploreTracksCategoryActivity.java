// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.view.screen.BaseLayoutHelper;

// Referenced classes of package com.soundcloud.android.explore:
//            ExploreGenre, ExploreTracksFragment

public class ExploreTracksCategoryActivity extends ScActivity
{

    BaseLayoutHelper baseLayoutHelper;
    PlayerController playerController;

    public ExploreTracksCategoryActivity()
    {
    }

    public void onBackPressed()
    {
        if (!playerController.handleBackPressed())
        {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(((ExploreGenre)getIntent().getParcelableExtra("genre")).getTitle());
        if (bundle == null)
        {
            bundle = new ExploreTracksFragment();
            bundle.setRetainInstance(true);
            bundle.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().replace(0x7f0f00b5, bundle).commit();
        }
    }

    protected void setActivityContentView()
    {
        baseLayoutHelper.setBaseLayout(this);
    }
}

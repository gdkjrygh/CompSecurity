// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.view.screen.BaseLayoutHelper;

// Referenced classes of package com.soundcloud.android.discovery:
//            RecommendedTracksFragment

public class RecommendedTracksActivity extends ScActivity
{

    public static final String EXTRA_LOCAL_SEED_ID = "localSeedId";
    BaseLayoutHelper baseLayoutHelper;
    PlayerController playerController;

    public RecommendedTracksActivity()
    {
    }

    private void createFragmentForRecommendations()
    {
        long l = getIntent().getLongExtra("localSeedId", -1L);
        if (l > 0L)
        {
            RecommendedTracksFragment recommendedtracksfragment = RecommendedTracksFragment.create(l);
            getSupportFragmentManager().beginTransaction().replace(0x7f0f00b5, recommendedtracksfragment).commit();
            return;
        } else
        {
            throw new IllegalStateException("Invalid recommendation local seed id");
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(0x7f070063);
        if (bundle == null)
        {
            createFragmentForRecommendations();
        }
    }

    protected void setActivityContentView()
    {
        baseLayoutHelper.setBaseLayout(this);
    }
}

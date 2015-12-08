// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.actionbar.ActionBarHelper;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.android.utils.ScTextUtils;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.comments:
//            CommentsFragment

public class TrackCommentsActivity extends ScActivity
{

    public static final String EXTRA_COMMENTED_TRACK = "extra";
    ActionBarHelper actionBarHelper;
    BaseLayoutHelper baseLayoutHelper;
    ImageOperations imageOperations;
    PlayerController playerController;

    public TrackCommentsActivity()
    {
    }

    private void attachCommentsFragment(PropertySet propertyset)
    {
        propertyset = CommentsFragment.create((Urn)propertyset.get(TrackProperty.URN));
        getSupportFragmentManager().beginTransaction().add(0x7f0f026a, propertyset).commit();
    }

    private void bindTrackHeaderView(PropertySet propertyset)
    {
        ((TextView)findViewById(0x7f0f0073)).setText((CharSequence)propertyset.get(PlayableProperty.TITLE));
        ((TextView)findViewById(0x7f0f0151)).setText((CharSequence)propertyset.get(PlayableProperty.CREATOR_NAME));
        ((TextView)findViewById(0x7f0f026b)).setText(String.valueOf(propertyset.get(TrackProperty.COMMENTS_COUNT)));
        setDate(propertyset);
        setIcon(propertyset);
    }

    private Screen getCurrentScreen()
    {
        return Screen.PLAYER_COMMENTS;
    }

    private void setDate(PropertySet propertyset)
    {
        long l = ((Date)propertyset.get(PlayableProperty.CREATED_AT)).getTime();
        ((TextView)findViewById(0x7f0f0166)).setText(ScTextUtils.formatTimeElapsedSince(getResources(), l, true));
    }

    private void setIcon(PropertySet propertyset)
    {
        imageOperations.displayWithPlaceholder((Urn)propertyset.get(TrackProperty.URN), ApiImageSize.getListItemImageSize(getResources()), (ImageView)findViewById(0x7f0f0072));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        PropertySet propertyset = (PropertySet)getIntent().getParcelableExtra("extra");
        bindTrackHeaderView(propertyset);
        if (bundle == null)
        {
            attachCommentsFragment(propertyset);
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (shouldTrackScreen())
        {
            eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(getCurrentScreen()));
        }
    }

    protected void setActivityContentView()
    {
        baseLayoutHelper.setBaseLayoutWithContent(this, 0x7f0300ca);
    }
}

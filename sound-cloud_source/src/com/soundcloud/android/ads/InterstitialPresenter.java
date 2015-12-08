// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueueItem;
import com.soundcloud.android.playback.TrackSourceInfo;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.ads:
//            AdOverlayPresenter, AdOverlayProperty

public class InterstitialPresenter extends AdOverlayPresenter
{

    private final View interstitialImageHolder;
    private final TextView nowPlayingTitleView;
    private final View previewContainer;
    private final ImageView previewImage;
    private final Resources resources;

    public InterstitialPresenter(View view, AdOverlayPresenter.Listener listener, EventBus eventbus, ImageOperations imageoperations, Resources resources1)
    {
        super(view, 0x7f0f01f8, 0x7f0f01f7, 0x7f0f0176, 0x7f0f009a, 0x7f0f0099, listener, imageoperations, eventbus);
        previewContainer = view.findViewById(0x7f0f009c);
        previewImage = (ImageView)view.findViewById(0x7f0f009d);
        nowPlayingTitleView = (TextView)view.findViewById(0x7f0f009e);
        resources = resources1;
        interstitialImageHolder = view.findViewById(0x7f0f009a);
    }

    public void bind(PropertySet propertyset)
    {
        super.bind(propertyset);
        ApiImageSize apiimagesize = ApiImageSize.getListItemImageSize(previewImage.getResources());
        imageOperations.displayWithPlaceholder((Urn)propertyset.get(TrackProperty.URN), apiimagesize, previewImage);
        if (propertyset.contains(TrackProperty.TITLE) && propertyset.contains(TrackProperty.CREATOR_NAME))
        {
            String s = (String)propertyset.get(TrackProperty.TITLE);
            propertyset = (String)propertyset.get(TrackProperty.CREATOR_NAME);
            nowPlayingTitleView.setText(resources.getString(0x7f07006f, new Object[] {
                s, propertyset
            }));
            return;
        } else
        {
            nowPlayingTitleView.setText(0x7f07006e);
            ErrorUtils.handleSilentException(new IllegalStateException((new StringBuilder("Interstitial missing track data: ")).append(propertyset).toString()));
            return;
        }
    }

    public boolean isFullScreen()
    {
        return true;
    }

    public void onAdNotVisible()
    {
        super.onAdNotVisible();
        interstitialImageHolder.setVisibility(8);
        previewContainer.setVisibility(8);
    }

    public void onAdVisible(PlayQueueItem playqueueitem, PropertySet propertyset, TrackSourceInfo tracksourceinfo)
    {
        super.onAdVisible(playqueueitem, propertyset, tracksourceinfo);
        interstitialImageHolder.setVisibility(0);
        previewContainer.setVisibility(0);
    }

    public boolean shouldDisplayOverlay(PropertySet propertyset, boolean flag, boolean flag1, boolean flag2)
    {
        return flag && flag2 && !((Boolean)propertyset.getOrElse(AdOverlayProperty.META_AD_DISMISSED, Boolean.valueOf(false))).booleanValue() && resources.getBoolean(0x7f0d0002);
    }
}

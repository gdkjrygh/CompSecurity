// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.os.Bundle;
import android.support.v4.content.Loader;
import com.android.ex.photo.PhotoViewController;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import com.google.wallet.wobl.parser.WoblParser;
import com.squareup.picasso.Picasso;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            PicassoBitmapLoader, WoblPhotosProvider, WoblPhotoViewActivity

public final class WoblPhotoViewController extends PhotoViewController
{
    public static interface ActivityInterface
        extends com.android.ex.photo.PhotoViewController.ActivityInterface
    {

        public abstract String getWobInstanceId();
    }


    private final ActivityInterface activityInterface;
    private final EventBus eventBus;
    private final FeatureManager featureManager;
    private final LayoutMatcher layoutMatcher;
    private final Picasso picasso;
    private final WoblParser woblParser;

    public WoblPhotoViewController(WoblPhotoViewActivity woblphotoviewactivity, Picasso picasso1, EventBus eventbus, LayoutMatcher layoutmatcher, WoblParser woblparser, FeatureManager featuremanager)
    {
        super(woblphotoviewactivity);
        activityInterface = woblphotoviewactivity;
        picasso = picasso1;
        eventBus = eventbus;
        layoutMatcher = layoutmatcher;
        woblParser = woblparser;
        featureManager = featuremanager;
    }

    private String getWobInstanceId()
    {
        return activityInterface.getWobInstanceId();
    }

    public final Loader onCreateBitmapLoader(int i, Bundle bundle, String s)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return new PicassoBitmapLoader(getActivity().getContext(), picasso, s);
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle)
    {
        if (i == 100)
        {
            return new WoblPhotosProvider(getActivity().getContext(), eventBus, layoutMatcher, woblParser, featureManager, getWobInstanceId());
        } else
        {
            return null;
        }
    }
}

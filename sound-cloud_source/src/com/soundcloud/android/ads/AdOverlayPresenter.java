// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.soundcloud.android.events.AdOverlayEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.image.ImageListener;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.playback.PlayQueueItem;
import com.soundcloud.android.playback.TrackSourceInfo;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.ads:
//            InterstitialPresenter, LeaveBehindPresenter, InterstitialProperty, LeaveBehindProperty

public abstract class AdOverlayPresenter
{
    public static interface Listener
    {

        public abstract void onAdImageLoaded();

        public abstract void onCloseButtonClick();

        public abstract void onImageClick();
    }


    private final ImageView adImage;
    private final EventBus eventBus;
    private final ImageListener imageListener = new _cls1();
    protected final ImageOperations imageOperations;
    private final View leaveBehindHeader;
    private final Listener listener;
    private final View overlay;

    protected AdOverlayPresenter(View view, int i, int j, int k, int l, int i1, final Listener listener, 
            ImageOperations imageoperations, EventBus eventbus)
    {
        overlay = getOverlayView(view, i, j);
        this.listener = listener;
        eventBus = eventbus;
        adImage = (ImageView)overlay.findViewById(k);
        overlay.findViewById(l).setOnClickListener(new _cls2());
        leaveBehindHeader = overlay.findViewById(i1);
        overlay.setOnClickListener(new _cls3());
        imageOperations = imageoperations;
    }

    public static AdOverlayPresenter create(PropertySet propertyset, View view, Listener listener1, EventBus eventbus, Resources resources, ImageOperations imageoperations)
    {
        if (isInterstitial(propertyset))
        {
            return new InterstitialPresenter(view, listener1, eventbus, imageoperations, resources);
        } else
        {
            return new LeaveBehindPresenter(view, listener1, eventbus, imageoperations);
        }
    }

    private View getOverlayView(View view, int i, int j)
    {
        View view2 = view.findViewById(i);
        View view1 = view2;
        if (view2 == null)
        {
            view1 = ((ViewStub)view.findViewById(j)).inflate();
        }
        return view1;
    }

    private static boolean isInterstitial(PropertySet propertyset)
    {
        return propertyset != null && propertyset.contains(InterstitialProperty.INTERSTITIAL_URN);
    }

    public void bind(PropertySet propertyset)
    {
        imageOperations.displayLeaveBehind(Uri.parse((String)propertyset.get(LeaveBehindProperty.IMAGE_URL)), getImageView(), imageListener);
    }

    public void clear()
    {
        adImage.setImageDrawable(null);
        onAdNotVisible();
    }

    public ImageView getImageView()
    {
        return adImage;
    }

    public abstract boolean isFullScreen();

    public boolean isNotVisible()
    {
        return adImage == null || adImage.getVisibility() == 8;
    }

    public void onAdNotVisible()
    {
        overlay.setClickable(false);
        adImage.setVisibility(8);
        leaveBehindHeader.setVisibility(8);
        eventBus.publish(EventQueue.AD_OVERLAY, AdOverlayEvent.hidden());
    }

    public void onAdVisible(PlayQueueItem playqueueitem, PropertySet propertyset, TrackSourceInfo tracksourceinfo)
    {
        overlay.setClickable(true);
        adImage.setVisibility(0);
        leaveBehindHeader.setVisibility(0);
        eventBus.publish(EventQueue.AD_OVERLAY, AdOverlayEvent.shown(playqueueitem.getUrn(), propertyset, tracksourceinfo));
    }

    public abstract boolean shouldDisplayOverlay(PropertySet propertyset, boolean flag, boolean flag1, boolean flag2);


    private class _cls1
        implements ImageListener
    {

        final AdOverlayPresenter this$0;

        public void onLoadingComplete(String s, View view, Bitmap bitmap)
        {
            listener.onAdImageLoaded();
        }

        public void onLoadingFailed(String s, View view, String s1)
        {
        }

        public void onLoadingStarted(String s, View view)
        {
        }

        _cls1()
        {
            this$0 = AdOverlayPresenter.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final AdOverlayPresenter this$0;
        final Listener val$listener;

        public void onClick(View view)
        {
            listener.onImageClick();
        }

        _cls2()
        {
            this$0 = AdOverlayPresenter.this;
            listener = listener1;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final AdOverlayPresenter this$0;
        final Listener val$listener;

        public void onClick(View view)
        {
            listener.onCloseButtonClick();
        }

        _cls3()
        {
            this$0 = AdOverlayPresenter.this;
            listener = listener1;
            super();
        }
    }

}

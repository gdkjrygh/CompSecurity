// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.playback.PlaybackProgress;
import com.soundcloud.android.playback.ui.view.RoundedColorButton;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.ScTextUtils;
import com.soundcloud.java.collections.Iterables;
import com.soundcloud.java.functions.Predicate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import rx.Y;
import rx.b;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagePresenter, SlideAnimationHelper, PlayerAd, AdPageListener, 
//            PlayerOverlayController, PlayerItem, SkipListener

class AdPagePresenter
    implements android.view.View.OnClickListener, PlayerPagePresenter
{
    static class Holder
    {

        private Y adImageSubscription;
        private final View artworkIdleOverlay;
        private final ImageView centeredAdArtworkView;
        private final View centeredAdOverlay;
        Iterable centeredAdViews;
        private final View close;
        private final View footer;
        private final TextView footerAdTitle;
        private final TextView footerAdvertisement;
        private final ToggleButton footerPlayToggle;
        private final ImageView fullbleedAdArtworkView;
        Iterable fullbleedAdViews;
        private final RoundedColorButton learnMore;
        private final View nextButton;
        Iterable onClickViews;
        private final View playButton;
        private final View playControlsHolder;
        private final PlayerOverlayController playerOverlayController;
        private final Predicate presentInConfig = new _cls1();
        private final ImageView previewArtwork;
        private final View previewArtworkOverlay;
        private final View previewContainer;
        private final TextView previewTitle;
        private final View previousButton;
        private final View skipAd;
        Iterable skipDisableViews;
        private final TextView timeUntilSkip;
        private final View whyAds;

        private void populateViewSets()
        {
            java.util.List list = Arrays.asList(new View[] {
                centeredAdOverlay, centeredAdArtworkView
            });
            java.util.List list1 = Arrays.asList(new View[] {
                fullbleedAdArtworkView, learnMore
            });
            java.util.List list2 = Arrays.asList(new View[] {
                previousButton, nextButton
            });
            java.util.List list3 = Arrays.asList(new View[] {
                centeredAdArtworkView, fullbleedAdArtworkView, centeredAdOverlay, artworkIdleOverlay, playButton, nextButton, previousButton, learnMore, whyAds, skipAd, 
                previewContainer, footerPlayToggle, close, footer
            });
            skipDisableViews = Iterables.filter(list2, presentInConfig);
            onClickViews = Iterables.filter(list3, presentInConfig);
            centeredAdViews = Iterables.filter(list, presentInConfig);
            fullbleedAdViews = Iterables.filter(list1, presentInConfig);
        }






/*
        static Y access$1102(Holder holder, Y y)
        {
            holder.adImageSubscription = y;
            return y;
        }

*/














        Holder(View view, PlayerOverlayController.Factory factory)
        {
            class _cls1
                implements Predicate
            {

                final Holder this$0;

                public boolean apply(View view1)
                {
                    return view1 != null;
                }

                public volatile boolean apply(Object obj)
                {
                    return apply((View)obj);
                }

                _cls1()
                {
                    this$0 = Holder.this;
                    super();
                }
            }

            adImageSubscription = RxUtils.invalidSubscription();
            fullbleedAdArtworkView = (ImageView)view.findViewById(0x7f0f01c2);
            centeredAdArtworkView = (ImageView)view.findViewById(0x7f0f01c3);
            centeredAdOverlay = view.findViewById(0x7f0f01c5);
            artworkIdleOverlay = view.findViewById(0x7f0f01c4);
            previewArtworkOverlay = view.findViewById(0x7f0f01d0);
            playButton = view.findViewById(0x7f0f01db);
            nextButton = view.findViewById(0x7f0f01dc);
            previousButton = view.findViewById(0x7f0f01da);
            footerPlayToggle = (ToggleButton)view.findViewById(0x7f0f01d4);
            close = view.findViewById(0x7f0f01c6);
            previewTitle = (TextView)view.findViewById(0x7f0f01d1);
            previewArtwork = (ImageView)view.findViewById(0x7f0f01cf);
            timeUntilSkip = (TextView)view.findViewById(0x7f0f01cb);
            skipAd = view.findViewById(0x7f0f01cc);
            previewContainer = view.findViewById(0x7f0f01cd);
            learnMore = (RoundedColorButton)view.findViewById(0x7f0f01c9);
            whyAds = view.findViewById(0x7f0f01c7);
            playControlsHolder = view.findViewById(0x7f0f01d9);
            footer = view.findViewById(0x7f0f01d3);
            footerAdTitle = (TextView)view.findViewById(0x7f0f01d6);
            footerAdvertisement = (TextView)view.findViewById(0x7f0f01d5);
            playerOverlayController = factory.create(artworkIdleOverlay);
            populateViewSets();
        }
    }


    private final Context context;
    private final SlideAnimationHelper helper = new SlideAnimationHelper();
    private final ImageOperations imageOperations;
    private final AdPageListener listener;
    private final PlayerOverlayController.Factory playerOverlayControllerFactory;
    private final Resources resources;

    public AdPagePresenter(ImageOperations imageoperations, Resources resources1, PlayerOverlayController.Factory factory, AdPageListener adpagelistener, Context context1)
    {
        imageOperations = imageoperations;
        resources = resources1;
        playerOverlayControllerFactory = factory;
        listener = adpagelistener;
        context = context1;
    }

    private void displayAdvertisement(PlayerAd playerad, Holder holder)
    {
        holder.footerAdvertisement.setText(resources.getString(0x7f07006b));
        holder.footerAdTitle.setText(playerad.getAdTitle());
        holder.adImageSubscription = imageOperations.adImage(playerad.getArtwork()).subscribe(getAdImageSubscriber(holder));
    }

    private void displayPreview(PlayerAd playerad, Holder holder)
    {
        holder.previewTitle.setText(playerad.getPreviewTitle(holder.previewTitle.getResources()));
        imageOperations.displayWithPlaceholder(playerad.getMonetizableTrack(), getOptimizedImageSize(), holder.previewArtwork);
    }

    private DefaultSubscriber getAdImageSubscriber(final Holder holder)
    {
        return new _cls1();
    }

    private ColorStateList getColorStates(int i, int j, int k)
    {
        return new ColorStateList(new int[][] {
            new int[] {
                0x101009c
            }, new int[] {
                0x10100a7
            }, new int[0]
        }, new int[] {
            i, j, k
        });
    }

    private ApiImageSize getOptimizedImageSize()
    {
        return ApiImageSize.getListItemImageSize(context);
    }

    private Holder getViewHolder(View view)
    {
        return (Holder)view.getTag();
    }

    private boolean isBelowStandardIabSize(int i, int j)
    {
        return i <= 600 && j <= 500;
    }

    private void resetAdImageLayouts(Holder holder)
    {
        holder.centeredAdArtworkView.setImageDrawable(null);
        holder.fullbleedAdArtworkView.setImageDrawable(null);
        holder.adImageSubscription.unsubscribe();
        setVisibility(false, holder.centeredAdViews);
        setVisibility(false, holder.fullbleedAdViews);
    }

    private void resetSkip(Holder holder)
    {
        updateCountDown(holder, 15);
        toggleSkip(holder, false);
    }

    private void setClickListener(android.view.View.OnClickListener onclicklistener, Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); ((View)iterable.next()).setOnClickListener(onclicklistener)) { }
    }

    private void setEnabled(boolean flag, Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); ((View)iterable.next()).setEnabled(flag)) { }
    }

    private void setVisibility(boolean flag, Iterable iterable)
    {
        iterable = iterable.iterator();
        while (iterable.hasNext()) 
        {
            View view = (View)iterable.next();
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    private void styleLearnMoreButton(Holder holder, PlayerAd playerad)
    {
        holder.learnMore.setTextColor(getColorStates(playerad.getFocusedTextColor(), playerad.getPressedTextColor(), playerad.getDefaultTextColor()));
        holder.learnMore.setBackground(getColorStates(playerad.getFocusedBackgroundColor(), playerad.getPressedBackgroundColor(), playerad.getDefaultBackgroundColor()));
    }

    private void toggleSkip(Holder holder, boolean flag)
    {
        byte byte0 = 8;
        Object obj = holder.skipAd;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        obj = holder.timeUntilSkip;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((TextView) (obj)).setVisibility(i);
        obj = holder.previewArtworkOverlay;
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
        setEnabled(flag, holder.skipDisableViews);
    }

    private void updateAdvertisementLayout(Holder holder, Bitmap bitmap)
    {
        if (isBelowStandardIabSize(bitmap.getWidth(), bitmap.getHeight()))
        {
            holder.centeredAdArtworkView.setImageBitmap(bitmap);
            setVisibility(true, holder.centeredAdViews);
            return;
        } else
        {
            holder.fullbleedAdArtworkView.setImageBitmap(bitmap);
            setVisibility(true, holder.fullbleedAdViews);
            return;
        }
    }

    private void updateCountDown(Holder holder, int i)
    {
        String s = ScTextUtils.formatSecondsOrMinutes(resources, i, TimeUnit.SECONDS);
        holder.timeUntilSkip.setText(resources.getString(0x7f070072, new Object[] {
            s
        }));
    }

    public void bindItemView(View view, PlayerAd playerad)
    {
        view = getViewHolder(view);
        displayAdvertisement(playerad, view);
        displayPreview(playerad, view);
        styleLearnMoreButton(view, playerad);
        setClickListener(this, ((Holder) (view)).onClickViews);
    }

    public volatile void bindItemView(View view, PlayerItem playeritem)
    {
        bindItemView(view, (PlayerAd)playeritem);
    }

    public void clearAdOverlay(View view)
    {
    }

    public View clearItemView(View view)
    {
        Holder holder = getViewHolder(view);
        holder.footerAdTitle.setText("");
        holder.previewTitle.setText("");
        resetAdImageLayouts(holder);
        resetSkip(holder);
        return view;
    }

    public View createItemView(ViewGroup viewgroup, SkipListener skiplistener)
    {
        viewgroup = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030091, viewgroup, false);
        skiplistener = new Holder(viewgroup, playerOverlayControllerFactory);
        viewgroup.setTag(skiplistener);
        resetSkip(skiplistener);
        return viewgroup;
    }

    public void onBackground(View view)
    {
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        case 2131689928: 
        case 2131689930: 
        case 2131689931: 
        case 2131689934: 
        case 2131689935: 
        case 2131689936: 
        case 2131689937: 
        case 2131689938: 
        case 2131689941: 
        case 2131689942: 
        case 2131689943: 
        case 2131689944: 
        case 2131689945: 
        default:
            throw new IllegalArgumentException("Unexpected view ID");

        case 2131689922: 
        case 2131689924: 
        case 2131689940: 
        case 2131689947: 
            listener.onTogglePlay();
            return;

        case 2131689948: 
            listener.onNext();
            return;

        case 2131689946: 
            listener.onPrevious();
            return;

        case 2131689926: 
        case 2131689933: 
            listener.onPlayerClose();
            return;

        case 2131689939: 
            listener.onFooterTap();
            return;

        case 2131689923: 
        case 2131689925: 
        case 2131689929: 
            listener.onClickThrough();
            return;

        case 2131689927: 
            listener.onAboutAds(view.getContext());
            return;

        case 2131689932: 
            listener.onSkipAd();
            return;
        }
    }

    public void onDestroyView(View view)
    {
    }

    public void onForeground(View view)
    {
    }

    public void onPlayableUpdated(View view, EntityStateChangedEvent entitystatechangedevent)
    {
    }

    public void onPlayerSlide(View view, float f)
    {
        boolean flag = false;
        view = getViewHolder(view);
        helper.configureViewsFromSlide(f, ((Holder) (view)).footer, ((Holder) (view)).close, new PlayerOverlayController[] {
            ((Holder) (view)).playerOverlayController
        });
        View view1 = ((Holder) (view)).close;
        int i;
        if (f > 0.0F)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view1.setVisibility(i);
        view = ((Holder) (view)).whyAds;
        if (f > 0.0F)
        {
            flag = true;
        }
        view.setEnabled(flag);
    }

    public void setCastDeviceName(View view, String s)
    {
    }

    public void setCollapsed(View view)
    {
        onPlayerSlide(view, 0.0F);
    }

    public void setExpanded(View view)
    {
        onPlayerSlide(view, 1.0F);
    }

    public void setPlayState(View view, com.soundcloud.android.playback.Player.StateTransition statetransition, boolean flag, boolean flag1)
    {
        view = getViewHolder(view);
        flag = statetransition.playSessionIsActive();
        View view1 = ((Holder) (view)).playControlsHolder;
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view1.setVisibility(byte0);
        ((Holder) (view)).footerPlayToggle.setChecked(flag);
        ((Holder) (view)).playerOverlayController.setPlayState(statetransition);
    }

    public void setProgress(View view, PlaybackProgress playbackprogress)
    {
        int i = 15 - (int)TimeUnit.MILLISECONDS.toSeconds(playbackprogress.getPosition());
        boolean flag;
        if (i <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = getViewHolder(view);
        toggleSkip(view, flag);
        if (!flag)
        {
            updateCountDown(view, i);
        }
    }


    private class _cls1 extends DefaultSubscriber
    {

        final AdPagePresenter this$0;
        final Holder val$holder;

        public void onNext(Bitmap bitmap)
        {
            if (bitmap != null)
            {
                updateAdvertisementLayout(holder, bitmap);
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((Bitmap)obj);
        }

        _cls1()
        {
            this$0 = AdPagePresenter.this;
            holder = holder1;
            super();
        }
    }

}

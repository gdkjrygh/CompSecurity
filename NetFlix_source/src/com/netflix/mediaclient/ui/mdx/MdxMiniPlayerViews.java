// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.android.widget.IconFontTextView;
import com.netflix.mediaclient.android.widget.SnappableSeekBar;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.ServiceManagerUtils;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.RatingDialogFrag;
import com.netflix.mediaclient.ui.common.SharingDialogFrag;
import com.netflix.mediaclient.ui.common.VolumeDialogFrag;
import com.netflix.mediaclient.ui.details.DetailsActivity;
import com.netflix.mediaclient.ui.details.EpisodeListFrag;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.MdxUtils;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.TimeFormatterHelper;
import com.netflix.mediaclient.util.TimeUtils;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMenu

class MdxMiniPlayerViews
{
    static interface MdxMiniPlayerViewCallbacks
        extends com.netflix.mediaclient.android.widget.SnappableSeekBar.OnSnappableSeekBarChangeListener
    {

        public abstract float getCurrentRating();

        public abstract VideoDetails getCurrentVideo();

        public abstract ServiceManager getManager();

        public abstract IMdx getMdx();

        public abstract boolean isEpisodeReady();

        public abstract boolean isLanguageReady();

        public abstract boolean isPanelExpanded();

        public abstract boolean isPlayingRemotely();

        public abstract boolean isRemotePlayerReady();

        public abstract boolean isVideoUnshared();

        public abstract void notifyControlsEnabled(boolean flag);

        public abstract void onPauseClicked();

        public abstract void onResumeClicked();

        public abstract void onShowLanguageSelectorDialog();

        public abstract void onSkipBackClicked();

        public abstract void onStopClicked();
    }


    private static final boolean DISABLED = false;
    private static final float DISABLED_ALPHA = 0.4F;
    private static final float FULL_ALPHA = 0F;
    private static final long LONG_VIEW_ANIMATION_DURATION_MS = 200L;
    private static final int MAX_CONTROL_GROUP_WIDTH_DP = 600;
    private static final float NO_ALPHA = 1F;
    private static final long PROGRESS_CHANGE_EVENT_FILTER_TIME_MS = -1L;
    private static final long SHORT_VIEW_ANIMATION_DURATION_MS = 100L;
    private static final String TAG = "MdxMiniPlayerViews";
    private static final TimeFormatterHelper timeFormatter = new TimeFormatterHelper();
    private final NetflixActivity activity;
    private final Interpolator animInterpolator = new AccelerateDecelerateInterpolator();
    private final AdvancedImageView artwork;
    private final View auxControlsGroup;
    private final ImageView bifImage;
    private final TextView bifSeekTime;
    private final MdxMiniPlayerViewCallbacks callbacks;
    private final List collapsedViews = new ArrayList();
    private final ViewGroup content;
    private final TextView currentTime;
    private final TextView deviceName;
    private final View deviceNameGroup;
    private final com.netflix.mediaclient.util.MdxUtils.MdxTargetSelectionDialogInterface dialogCallbacks;
    private final android.view.View.OnClickListener dummyClickListener = new android.view.View.OnClickListener() {

        final MdxMiniPlayerViews this$0;

        public void onClick(View view)
        {
            Log.v("MdxMiniPlayerViews", "Dummy click listener");
            seekBar.invalidate();
        }

            
            {
                this$0 = MdxMiniPlayerViews.this;
                super();
            }
    };
    private boolean episodesButtonVisible;
    private final android.view.View.OnClickListener episodesClickListener = new android.view.View.OnClickListener() {

        final MdxMiniPlayerViews this$0;

        public void onClick(View view)
        {
            if (activity.destroyed())
            {
                return;
            }
            view = callbacks.getCurrentVideo();
            if (view == null)
            {
                Log.w("MdxMiniPlayerViews", "currentVideo is null - can't show episodes");
                return;
            }
            if (!(view instanceof EpisodeDetails))
            {
                Log.w("MdxMiniPlayerViews", "currentVideo is not an episode detail");
                return;
            } else
            {
                Log.v("MdxMiniPlayerViews", "Showing episodes dialog");
                view = EpisodeListFrag.create(view.getParentId(), null, false);
                view.onManagerReady(callbacks.getManager(), 0);
                view.setCancelable(true);
                activity.showDialog(view);
                return;
            }
        }

            
            {
                this$0 = MdxMiniPlayerViews.this;
                super();
            }
    };
    private final IconFontTextView episodesCollapsed;
    private final View episodesDivider;
    private final ImageView episodesExpanded;
    private Boolean isShowingViewForExpanded;
    private final boolean isTablet;
    private final IconFontTextView languageCollapsed;
    private final ImageView languageExpanded;
    private final int maxTitleTextYDelta;
    private final int maxTitleTextYMargin;
    private MdxMenu mdxMenu;
    private final com.netflix.mediaclient.android.widget.SnappableSeekBar.OnSnappableSeekBarChangeListener onSeekBarChangeListener = new com.netflix.mediaclient.android.widget.SnappableSeekBar.OnSnappableSeekBarChangeListener() {

        private long lastProgressChangeTime;
        final MdxMiniPlayerViews this$0;

        public void onProgressChanged(SeekBar seekbar, int j, boolean flag1)
        {
            callbacks.onProgressChanged(seekbar, j, flag1);
            while (!flag1 || TimeUtils.convertNsToMs(System.nanoTime() - lastProgressChangeTime) < -1L) 
            {
                return;
            }
            lastProgressChangeTime = System.nanoTime();
            if (ServiceManagerUtils.isMdxAgentAvailable(callbacks.getManager()))
            {
                com.netflix.mediaclient.media.BifManager.Utils.showBifInView(callbacks.getMdx().getBifFrame(j * 1000), bifImage);
            }
            updateTimeViews(j);
        }

        public void onStartTrackingTouch(SeekBar seekbar)
        {
            Log.v("MdxMiniPlayerViews", "onStartTrackingTouch");
            callbacks.onStartTrackingTouch(seekbar);
            currentTime.setVisibility(4);
            fadeOutAndHide(new View[] {
                artwork
            });
            fadeInAndShow(new View[] {
                bifImage, bifSeekTime
            });
            updateViewsForSeekBarUsage(true);
        }

        public void onStopTrackingTouch(SeekBar seekbar, boolean flag1)
        {
            Log.v("MdxMiniPlayerViews", (new StringBuilder()).append("onStopTrackingTouch, isInSnapRegion: ").append(flag1).toString());
            callbacks.onStopTrackingTouch(seekbar, flag1);
            lastProgressChangeTime = 0L;
            if (flag1)
            {
                updateTimeViews(seekbar.getProgress());
            } else
            {
                onProgressChanged(seekbar, seekbar.getProgress(), true);
            }
            showArtworkAndHideBif();
            updateViewsForSeekBarUsage(false);
            if (!flag1)
            {
                setControlsEnabled(false);
            }
        }

            
            {
                this$0 = MdxMiniPlayerViews.this;
                super();
            }
    };
    private final String parentActivityClass;
    private final android.view.View.OnClickListener pauseOnClickListener = new android.view.View.OnClickListener() {

        final MdxMiniPlayerViews this$0;

        public void onClick(View view)
        {
            log("pause pressed");
            callbacks.onPauseClicked();
            setControlsEnabled(false);
        }

            
            {
                this$0 = MdxMiniPlayerViews.this;
                super();
            }
    };
    private final ImageView playOrPauseCollapsed;
    private final ImageView playOrPauseExpanded;
    private final ImageView playcardCaret;
    private final View playcardControlsGroup;
    private final ImageView rating;
    private final TextView remainingTime;
    private final android.view.View.OnClickListener resumeOnClickListener = new android.view.View.OnClickListener() {

        final MdxMiniPlayerViews this$0;

        public void onClick(View view)
        {
            Log.v("MdxMiniPlayerViews", "resume pressed");
            setControlsEnabled(false);
            callbacks.onResumeClicked();
        }

            
            {
                this$0 = MdxMiniPlayerViews.this;
                super();
            }
    };
    private final SnappableSeekBar seekBar;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener seekBarLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

        final MdxMiniPlayerViews this$0;

        public void onGlobalLayout()
        {
            if (seekBar.getHeight() <= 0)
            {
                return;
            } else
            {
                Rect rect = seekBar.getCachedThumb().getBounds();
                int j = (rect.right - rect.left) / 2;
                Log.v("MdxMiniPlayerViews", (new StringBuilder()).append("Setting thumb offset: ").append(j).toString());
                seekBar.setThumbOffset(j);
                ViewUtils.removeGlobalLayoutListener(seekBar, this);
                return;
            }
        }

            
            {
                this$0 = MdxMiniPlayerViews.this;
                super();
            }
    };
    private final ImageView sharing;
    private final android.view.View.OnClickListener sharingClickListener = new android.view.View.OnClickListener() {

        final MdxMiniPlayerViews this$0;

        public void onClick(View view)
        {
            if (activity.destroyed())
            {
                log("Activity destroyed, can't show sharing frag");
                return;
            } else
            {
                view = SharingDialogFrag.newInstance();
                view.setCancelable(true);
                activity.showDialog(view);
                return;
            }
        }

            
            {
                this$0 = MdxMiniPlayerViews.this;
                super();
            }
    };
    private final android.view.View.OnClickListener showLanguageSelectorClickListener = new android.view.View.OnClickListener() {

        final MdxMiniPlayerViews this$0;

        public void onClick(View view)
        {
            callbacks.onShowLanguageSelectorDialog();
        }

            
            {
                this$0 = MdxMiniPlayerViews.this;
                super();
            }
    };
    private final android.view.View.OnClickListener showRatingClickListener = new android.view.View.OnClickListener() {

        final MdxMiniPlayerViews this$0;

        public void onClick(View view)
        {
            if (activity.destroyed())
            {
                log("Activity destroyed, can't show rating");
                return;
            }
            VideoDetails videodetails = callbacks.getCurrentVideo();
            if (videodetails == null)
            {
                Log.e("MdxMiniPlayerViews", "Video is NULL. This should NOT happen!");
                return;
            }
            float f = callbacks.getCurrentRating();
            if (Log.isLoggable("MdxMiniPlayerViews", 2))
            {
                log((new StringBuilder()).append("User set rating ").append(f).toString());
                log((new StringBuilder()).append("User rating from VideoDetails ").append(videodetails.getUserRating()).toString());
            }
            Log.d("MdxMiniPlayerViews", "Report rate action started");
            LogUtils.reportRateActionStarted(activity, null, activity.getUiScreen());
            String s = videodetails.getParentTitle();
            view = s;
            if (StringUtils.isEmpty(s))
            {
                view = videodetails.getTitle();
            }
            view = RatingDialogFrag.newInstance(MdxUtils.getRating(videodetails, f), MdxUtils.getVideoId(videodetails), view);
            view.setCancelable(true);
            activity.showDialog(view);
        }

            
            {
                this$0 = MdxMiniPlayerViews.this;
                super();
            }
    };
    private final android.view.View.OnClickListener showTargetSelectionDialogListener = new android.view.View.OnClickListener() {

        final MdxMiniPlayerViews this$0;

        public void onClick(View view)
        {
            activity.displayDialog(MdxUtils.createMdxTargetSelectionDialog(activity, dialogCallbacks));
        }

            
            {
                this$0 = MdxMiniPlayerViews.this;
                super();
            }
    };
    private final android.view.View.OnClickListener showVideoDetailsClickListener = new android.view.View.OnClickListener() {

        final MdxMiniPlayerViews this$0;

        public void onClick(View view)
        {
            view = callbacks.getCurrentVideo();
            if (view == null)
            {
                return;
            }
            if (activity instanceof DetailsActivity)
            {
                DetailsActivity detailsactivity = (DetailsActivity)activity;
                if (StringUtils.safeEquals(view.getId(), detailsactivity.getVideoId()) || StringUtils.safeEquals(view.getParentId(), detailsactivity.getVideoId()))
                {
                    Log.d("MdxMiniPlayerViews", "Current details are already being shown - not showing details activity");
                    activity.notifyMdxShowDetailsRequest();
                    return;
                }
            }
            Log.v("MdxMiniPlayerViews", "showing details actiivty");
            DetailsActivity.show(activity, view, PlayContext.EMPTY_CONTEXT);
        }

            
            {
                this$0 = MdxMiniPlayerViews.this;
                super();
            }
    };
    private final android.view.View.OnClickListener showVolumeClickListener = new android.view.View.OnClickListener() {

        final MdxMiniPlayerViews this$0;

        public void onClick(View view)
        {
            if (activity.destroyed())
            {
                log("Activity destroyed, can't show volume frag");
                return;
            }
            if (!callbacks.isRemotePlayerReady())
            {
                Log.w("MdxMiniPlayerViews", "Remote player is not ready - can't get/set volume");
                return;
            } else
            {
                view = VolumeDialogFrag.newInstance();
                view.setCancelable(true);
                activity.showDialog(view);
                return;
            }
        }

            
            {
                this$0 = MdxMiniPlayerViews.this;
                super();
            }
    };
    private final IconFontTextView skipBackCollapsed;
    private final IconFontTextView skipBackExpanded;
    private final android.view.View.OnClickListener skipBackOnClickListener = new android.view.View.OnClickListener() {

        final MdxMiniPlayerViews this$0;

        public void onClick(View view)
        {
            Log.v("MdxMiniPlayerViews", "skip pressed");
            setControlsEnabled(false);
            callbacks.onSkipBackClicked();
        }

            
            {
                this$0 = MdxMiniPlayerViews.this;
                super();
            }
    };
    private final ImageView stop;
    private final android.view.View.OnClickListener stopOnClickListener = new android.view.View.OnClickListener() {

        final MdxMiniPlayerViews this$0;

        public void onClick(View view)
        {
            log("stop pressed");
            setControlsEnabled(false);
            callbacks.onStopClicked();
        }

            
            {
                this$0 = MdxMiniPlayerViews.this;
                super();
            }
    };
    private final TextView subtitle;
    private final TextView title;
    private final View titleGroup;
    private float titleGroupYPos;
    private final View titleTextGroup;
    private final ImageView volume;

    public MdxMiniPlayerViews(NetflixActivity netflixactivity, MdxMiniPlayerViewCallbacks mdxminiplayerviewcallbacks, com.netflix.mediaclient.util.MdxUtils.MdxTargetSelectionDialogInterface mdxtargetselectiondialoginterface)
    {
        episodesButtonVisible = true;
        isShowingViewForExpanded = null;
        parentActivityClass = netflixactivity.getClass().getSimpleName();
        log("Creating");
        activity = netflixactivity;
        callbacks = mdxminiplayerviewcallbacks;
        dialogCallbacks = mdxtargetselectiondialoginterface;
        mdxtargetselectiondialoginterface = netflixactivity.getResources();
        isTablet = DeviceUtils.isTabletByContext(netflixactivity);
        boolean flag = DeviceUtils.isPortrait(netflixactivity);
        LayoutInflater layoutinflater = netflixactivity.getLayoutInflater();
        int i;
        if (isTablet || flag)
        {
            i = 0x7f03004c;
        } else
        {
            i = 0x7f030050;
        }
        content = (ViewGroup)layoutinflater.inflate(i, null);
        content.setOnClickListener(dummyClickListener);
        titleGroup = content.findViewById(0x7f070119);
        titleTextGroup = content.findViewById(0x7f070122);
        title = (TextView)content.findViewById(0x7f070124);
        subtitle = (TextView)content.findViewById(0x7f070125);
        playcardCaret = (ImageView)content.findViewById(0x7f070123);
        if (playcardCaret != null)
        {
            playcardCaret.setRotation(180F);
        }
        artwork = (AdvancedImageView)content.findViewById(0x7f07010a);
        bifSeekTime = (TextView)content.findViewById(0x7f07010d);
        bifImage = (ImageView)content.findViewById(0x7f07010e);
        deviceNameGroup = content.findViewById(0x7f07010b);
        deviceName = (TextView)content.findViewById(0x7f07010c);
        playcardControlsGroup = content.findViewById(0x7f070114);
        playOrPauseExpanded = (ImageView)content.findViewById(0x7f070116);
        skipBackExpanded = (IconFontTextView)content.findViewById(0x7f070115);
        stop = (ImageView)content.findViewById(0x7f070117);
        auxControlsGroup = content.findViewById(0x7f070103);
        languageExpanded = (ImageView)content.findViewById(0x7f070104);
        episodesExpanded = (ImageView)content.findViewById(0x7f070108);
        rating = (ImageView)content.findViewById(0x7f070107);
        volume = (ImageView)content.findViewById(0x7f070105);
        sharing = (ImageView)content.findViewById(0x7f070106);
        if (sharing != null)
        {
            ImageView imageview = sharing;
            if (mdxminiplayerviewcallbacks.isVideoUnshared())
            {
                i = 8;
            } else
            {
                i = 0;
            }
            imageview.setVisibility(i);
        }
        currentTime = (TextView)content.findViewById(0x7f070112);
        remainingTime = (TextView)content.findViewById(0x7f070113);
        seekBar = (SnappableSeekBar)content.findViewById(0x7f070118);
        seekBar.setSnappableOnSeekBarChangeListener(onSeekBarChangeListener);
        seekBar.getViewTreeObserver().addOnGlobalLayoutListener(seekBarLayoutListener);
        i = mdxtargetselectiondialoginterface.getDimensionPixelSize(0x7f0a003c);
        seekBar.setPadding(i, 0, i, 0);
        if (isTablet)
        {
            seekBar.setScrubberDentBitmap(0x7f020100);
            seekBar.setShouldSnapToTouchStartPosition(true);
        }
        maxTitleTextYDelta = (int)((float)(mdxtargetselectiondialoginterface.getDimensionPixelOffset(0x7f0a0036) - mdxtargetselectiondialoginterface.getDimensionPixelOffset(0x7f0a0034)) * 0.75F);
        maxTitleTextYMargin = AndroidUtils.dipToPixels(netflixactivity, 2);
        if (isTablet)
        {
            i = AndroidUtils.dipToPixels(netflixactivity, 600);
            auxControlsGroup.getLayoutParams().width = i;
            playcardControlsGroup.getLayoutParams().width = i;
            bifImage.getLayoutParams().width = i;
            if (!flag)
            {
                artwork.getLayoutParams().width = i;
            }
            i /= 2;
        } else
        {
            i = DeviceUtils.getScreenWidthInPixels(netflixactivity) / 2;
        }
        bifImage.getLayoutParams().height = i;
        netflixactivity = null;
        if (isTablet)
        {
            languageCollapsed = (IconFontTextView)content.findViewById(0x7f07011a);
            episodesCollapsed = (IconFontTextView)content.findViewById(0x7f07011b);
            skipBackCollapsed = (IconFontTextView)content.findViewById(0x7f07011d);
            episodesDivider = content.findViewById(0x7f07011f);
            netflixactivity = ViewUtils.getViewsById(content, new Integer[] {
                Integer.valueOf(0x7f07011e), Integer.valueOf(0x7f07011f), Integer.valueOf(0x7f070120), Integer.valueOf(0x7f070121)
            });
            ViewUtils.showViews(netflixactivity);
        } else
        {
            languageCollapsed = null;
            episodesCollapsed = null;
            episodesDivider = null;
            skipBackCollapsed = (IconFontTextView)content.findViewById(0x7f07011a);
        }
        playOrPauseCollapsed = (ImageView)content.findViewById(0x7f07011c);
        initCollapsedButton(languageCollapsed, 0x7f0c0050, 0x7f0c0127, 18);
        initCollapsedButton(episodesCollapsed, 0x7f0c0051, 0x7f0c0177, 20);
        initCollapsedButton(skipBackCollapsed, 0x7f0c004f, 0x7f0c0125, 24);
        collapsedViews.add(playOrPauseCollapsed);
        collapsedViews.add(skipBackCollapsed);
        collapsedViews.add(languageCollapsed);
        collapsedViews.add(episodesCollapsed);
        if (netflixactivity != null)
        {
            collapsedViews.addAll(netflixactivity);
        }
        ViewUtils.setLongTapListenersRecursivelyToShowContentDescriptionToast(content);
    }

    private void enableView(View view, boolean flag)
    {
        if (view == null)
        {
            return;
        }
        view.setEnabled(flag);
        view.clearAnimation();
        float f;
        if (flag)
        {
            f = 1.0F;
        } else
        {
            f = 0.4F;
        }
        view.setAlpha(f);
    }

    private void fadeInAndShow(Collection collection)
    {
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            View view = (View)collection.next();
            if (view != null)
            {
                view.clearAnimation();
                view.animate().alpha(1.0F).setDuration(100L).setListener(null).start();
                view.setVisibility(0);
            }
        } while (true);
    }

    private transient void fadeInAndShow(View aview[])
    {
        fadeInAndShow(((Collection) (Arrays.asList(aview))));
    }

    private void fadeOut(Collection collection)
    {
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            View view = (View)collection.next();
            if (view != null)
            {
                view.clearAnimation();
                view.animate().alpha(0.0F).setDuration(100L).setListener(null).start();
            }
        } while (true);
    }

    private transient void fadeOut(View aview[])
    {
        fadeOut(((Collection) (Arrays.asList(aview))));
    }

    private void fadeOutAndHide(Collection collection)
    {
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            View view = (View)collection.next();
            if (view != null)
            {
                view.clearAnimation();
                view.animate().alpha(0.0F).setDuration(100L).setListener(new com.netflix.mediaclient.util.gfx.AnimationUtils.HideViewOnAnimatorEnd(view)).start();
            }
        } while (true);
    }

    private transient void fadeOutAndHide(View aview[])
    {
        fadeOutAndHide(((Collection) (Arrays.asList(aview))));
    }

    private void initCollapsedButton(IconFontTextView iconfonttextview, int i, int j, int k)
    {
        if (iconfonttextview == null)
        {
            return;
        } else
        {
            iconfonttextview.setContentDescription(activity.getString(j));
            iconfonttextview.setText(i);
            iconfonttextview.setTextSize(k);
            iconfonttextview.setVisibility(0);
            return;
        }
    }

    private void initOnClickListeners()
    {
        artwork.setOnClickListener(showVideoDetailsClickListener);
        stop.setOnClickListener(stopOnClickListener);
        skipBackCollapsed.setOnClickListener(skipBackOnClickListener);
        if (skipBackExpanded != null)
        {
            skipBackExpanded.setOnClickListener(skipBackOnClickListener);
        }
        if (episodesCollapsed != null)
        {
            episodesCollapsed.setOnClickListener(episodesClickListener);
        }
        if (episodesExpanded != null)
        {
            episodesExpanded.setOnClickListener(episodesClickListener);
        }
        if (languageCollapsed != null)
        {
            languageCollapsed.setOnClickListener(showLanguageSelectorClickListener);
        }
        if (languageExpanded != null)
        {
            languageExpanded.setOnClickListener(showLanguageSelectorClickListener);
        }
        if (deviceNameGroup != null)
        {
            deviceNameGroup.setOnClickListener(showTargetSelectionDialogListener);
        }
        if (rating != null)
        {
            rating.setOnClickListener(showRatingClickListener);
        }
        if (sharing != null)
        {
            sharing.setOnClickListener(sharingClickListener);
        }
        if (volume != null)
        {
            volume.setOnClickListener(showVolumeClickListener);
        }
    }

    private void log(String s)
    {
        if (Log.isLoggable("MdxMiniPlayerViews", 2))
        {
            Log.v("MdxMiniPlayerViews", (new StringBuilder()).append(parentActivityClass).append(": ").append(s).toString());
        }
    }

    private void rotateCaretTo(int i)
    {
        if (playcardCaret != null)
        {
            playcardCaret.animate().rotation(i).setDuration(200L).setInterpolator(animInterpolator).start();
        }
    }

    private void translateTitleGroup(float f)
    {
        if (titleTextGroup != null)
        {
            f = 1.0F - f;
            float f1 = titleGroupYPos;
            float f2 = maxTitleTextYDelta;
            titleTextGroup.setY(f1 + f2 * f);
            int i = (int)((float)maxTitleTextYMargin * f);
            title.setPadding(title.getPaddingLeft(), i, title.getPaddingRight(), i);
        }
    }

    private void updateEpisodeButtonVisibility()
    {
        byte byte0 = 4;
        boolean flag = false;
        int i;
        boolean flag1;
        if (isShowingViewForExpanded == null)
        {
            flag1 = false;
        } else
        if (!isShowingViewForExpanded.booleanValue())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (Log.isLoggable("MdxMiniPlayerViews", 2))
        {
            Log.v("MdxMiniPlayerViews", (new StringBuilder()).append("Updating episode button visibility, isPanelCollapsed: ").append(flag1).append(", episodesButtonVisible: ").append(episodesButtonVisible).toString());
        }
        if (episodesCollapsed != null)
        {
            Object obj = episodesCollapsed;
            if (flag1 && episodesButtonVisible)
            {
                i = 0;
            } else
            {
                i = 4;
            }
            ((IconFontTextView) (obj)).setVisibility(i);
        }
        if (episodesDivider != null)
        {
            obj = episodesDivider;
            i = byte0;
            if (flag1)
            {
                i = byte0;
                if (episodesButtonVisible)
                {
                    i = 0;
                }
            }
            ((View) (obj)).setVisibility(i);
        }
        if (episodesExpanded != null)
        {
            obj = episodesExpanded;
            if (episodesButtonVisible)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 8;
            }
            ((ImageView) (obj)).setVisibility(i);
        }
    }

    private void updateTimeViews(int i)
    {
        String s = timeFormatter.getStringForSeconds(i);
        if (currentTime != null)
        {
            currentTime.setText(s);
        }
        if (bifSeekTime != null)
        {
            bifSeekTime.setText(s);
        }
        s = timeFormatter.getStringForSeconds(seekBar.getMax() - i);
        if (remainingTime != null)
        {
            remainingTime.setText(s);
        }
    }

    private void updateViewsForPanelChange(boolean flag)
    {
        if (isShowingViewForExpanded == null)
        {
            boolean flag1;
            if (!flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            isShowingViewForExpanded = Boolean.valueOf(flag1);
        }
        if (isShowingViewForExpanded.booleanValue() == flag)
        {
            Log.v("MdxMiniPlayerViews", "Views already updated for panel expansion - skipping");
            return;
        }
        isShowingViewForExpanded = Boolean.valueOf(flag);
        Log.v("MdxMiniPlayerViews", (new StringBuilder()).append("Updating views for panel expansion, expanded: ").append(isShowingViewForExpanded).toString());
        if (isShowingViewForExpanded.booleanValue())
        {
            fadeOutAndHide(collapsedViews);
            rotateCaretTo(0);
            return;
        } else
        {
            fadeInAndShow(collapsedViews);
            rotateCaretTo(180);
            updateEpisodeButtonVisibility();
            return;
        }
    }

    private void updateViewsForSeekBarUsage(boolean flag)
    {
        if (flag)
        {
            fadeOut(new View[] {
                auxControlsGroup, playcardControlsGroup
            });
            fadeOutAndHide(new View[] {
                deviceNameGroup
            });
            return;
        } else
        {
            fadeInAndShow(new View[] {
                auxControlsGroup, playcardControlsGroup, deviceNameGroup
            });
            return;
        }
    }

    public void attachMenuItem(MdxMenu mdxmenu)
    {
        mdxMenu = mdxmenu;
    }

    public boolean computeMdxMenuEnabled(boolean flag)
    {
        if (callbacks.isPlayingRemotely())
        {
            Log.d("MdxMiniPlayerViews", (new StringBuilder()).append("mdx is playing remotely - mdx menu enabled: ").append(flag).toString());
            return flag;
        } else
        {
            Log.d("MdxMiniPlayerViews", "mdx is not playing remotely - mdx menu enabled");
            return true;
        }
    }

    public void enableMdxMenu()
    {
        if (mdxMenu != null)
        {
            mdxMenu.setEnabled(true);
        }
    }

    public View getContentView()
    {
        return content;
    }

    public int getProgress()
    {
        return seekBar.getProgress();
    }

    public View getSlidingPanelDragView()
    {
        return titleTextGroup;
    }

    public void onManagerReady(ServiceManager servicemanager)
    {
        initOnClickListeners();
    }

    public void onPanelCollapsed()
    {
        Log.v("MdxMiniPlayerViews", "onPanelCollapsed()");
        showArtworkAndHideBif();
        updateViewsForSeekBarUsage(false);
        updateViewsForPanelChange(false);
        updateEpisodeButtonVisibility();
    }

    public void onPanelExpanded()
    {
        Log.v("MdxMiniPlayerViews", "onPanelExpanded()");
        updateViewsForPanelChange(true);
    }

    public void onPanelSlide(float f)
    {
        translateTitleGroup(f);
    }

    public void onResume()
    {
        updateMdxMenu();
        if (titleGroup != null)
        {
            titleGroupYPos = titleGroup.getY();
        }
        updateViewsForPanelChange(callbacks.isPanelExpanded());
    }

    public void setControlsEnabled(boolean flag)
    {
        boolean flag2 = true;
        log((new StringBuilder()).append("Set controls enabled: ").append(flag).toString());
        content.setEnabled(flag);
        seekBar.setEnabled(flag);
        enableView(playOrPauseCollapsed, flag);
        enableView(playOrPauseExpanded, flag);
        enableView(skipBackCollapsed, flag);
        enableView(skipBackExpanded, flag);
        Object obj = languageCollapsed;
        boolean flag1;
        if (flag && callbacks.isLanguageReady())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        enableView(((View) (obj)), flag1);
        obj = languageExpanded;
        if (flag && callbacks.isLanguageReady())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        enableView(((View) (obj)), flag1);
        obj = episodesCollapsed;
        if (flag && callbacks.isEpisodeReady())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        enableView(((View) (obj)), flag1);
        obj = episodesExpanded;
        if (flag && callbacks.isEpisodeReady())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        enableView(((View) (obj)), flag1);
        enableView(deviceNameGroup, flag);
        enableView(stop, flag);
        enableView(rating, flag);
        enableView(volume, flag);
        log(String.format("setControlsEnabled, enabled: %s, unshare state: %s", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(callbacks.isVideoUnshared())
        }));
        obj = sharing;
        if (flag && !callbacks.isVideoUnshared())
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        enableView(((View) (obj)), flag1);
        if (mdxMenu != null)
        {
            mdxMenu.setEnabled(computeMdxMenuEnabled(flag));
        }
        updateViewsForPanelChange(callbacks.isPanelExpanded());
        callbacks.notifyControlsEnabled(flag);
    }

    public void setEpisodesButtonVisibile(boolean flag)
    {
        episodesButtonVisible = flag;
        updateEpisodeButtonVisibility();
    }

    public void setLanguageButtonEnabled(boolean flag)
    {
        enableView(languageCollapsed, flag);
        enableView(languageExpanded, flag);
    }

    public void setProgress(int i)
    {
        seekBar.setProgress(i);
        updateTimeViews(i);
    }

    public void setProgressMax(int i)
    {
        seekBar.setMax(i);
    }

    public void setSharingButtonEnabled(boolean flag)
    {
        enableView(sharing, flag);
    }

    public void setSharingButtonVisibility(boolean flag)
    {
        if (sharing != null)
        {
            ImageView imageview = sharing;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            imageview.setVisibility(i);
        }
    }

    public void setVolumeButtonVisibility(boolean flag)
    {
        if (volume != null)
        {
            ImageView imageview = volume;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            imageview.setVisibility(i);
        }
    }

    protected void showArtworkAndHideBif()
    {
        fadeInAndShow(new View[] {
            artwork, currentTime
        });
        fadeOutAndHide(new View[] {
            bifImage, bifSeekTime
        });
    }

    public void updateDeviceNameText(String s)
    {
        deviceName.setText(s);
    }

    public void updateImage(VideoDetails videodetails)
    {
        NetflixActivity.getImageLoader(activity).showImg(artwork, videodetails.getHorzDispUrl(), com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.boxArt, videodetails.getTitle(), false, true);
    }

    public void updateMdxMenu()
    {
        if (mdxMenu != null)
        {
            mdxMenu.update();
        }
    }

    public void updatePlayPauseButton(boolean flag)
    {
        ImageView aimageview[] = new ImageView[2];
        aimageview[0] = playOrPauseCollapsed;
        aimageview[1] = playOrPauseExpanded;
        int k = aimageview.length;
        int i = 0;
        while (i < k) 
        {
            ImageView imageview = aimageview[i];
            if (imageview != null)
            {
                android.view.View.OnClickListener onclicklistener;
                int j;
                if (flag)
                {
                    j = 0x7f02013c;
                } else
                {
                    j = 0x7f02013b;
                }
                imageview.setImageResource(j);
                if (flag)
                {
                    onclicklistener = resumeOnClickListener;
                } else
                {
                    onclicklistener = pauseOnClickListener;
                }
                imageview.setOnClickListener(onclicklistener);
            }
            i++;
        }
    }

    public void updateSubtitleText(String s)
    {
        boolean flag = StringUtils.isNotEmpty(s);
        int i;
        if (subtitle != null)
        {
            subtitle.setText(s);
            s = subtitle;
            NetflixActivity netflixactivity;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            s.setVisibility(i);
        }
        if (playcardCaret != null)
        {
            s = (android.view.ViewGroup.MarginLayoutParams)playcardCaret.getLayoutParams();
            netflixactivity = activity;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 5;
            }
            s.bottomMargin = AndroidUtils.dipToPixels(netflixactivity, i);
        }
    }

    public void updateTitleText(String s)
    {
        title.setText(s);
    }

    public void updateToEmptyState(boolean flag)
    {
        updateSubtitleText(null);
        String s = activity.getString(0x7f0c013a);
        title.setText(s);
        deviceName.setText(s);
        setControlsEnabled(flag);
    }














}

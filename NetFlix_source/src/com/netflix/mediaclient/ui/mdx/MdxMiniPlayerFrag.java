// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.service.mdx.MdxErrorHandler;
import com.netflix.mediaclient.service.mdx.MdxKeyEventHandler;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.Playable;
import com.netflix.mediaclient.servicemgr.SeasonDetails;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.ServiceManagerUtils;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.ui.common.LanguageSelector;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.MdxUtils;
import com.netflix.mediaclient.util.ThreadUtils;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            DialogMessageReceiver, MdxMiniPlayerViews, RemotePlayer, MdxTargetSelection, 
//            MdxMenu, RemoteDialog, ShowMessageDialogFrag, MdxTargetCapabilities

public class MdxMiniPlayerFrag extends NetflixFrag
    implements com.netflix.mediaclient.ui.details.EpisodeRowView.EpisodeRowListener, DialogMessageReceiver.Callback, com.netflix.mediaclient.util.MdxUtils.MdxTargetSelectionDialogInterface
{
    private class FetchSeasonDetailsCallback extends LoggingManagerCallback
    {

        final MdxMiniPlayerFrag this$0;

        public void onSeasonDetailsFetched(SeasonDetails seasondetails, int i)
        {
            super.onSeasonDetailsFetched(seasondetails, i);
            ThreadUtils.assertOnMain();
            if (i != 0)
            {
                return;
            }
            if (seasondetails == null)
            {
                Log.w("MdxMiniPlayerFrag", "Season is null, should NOT happen!");
            }
            SharedState sharedstate = MdxMiniPlayerFrag.state;
            boolean flag;
            if (seasondetails != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            sharedstate.isEpisodeReady = flag;
            views.setControlsEnabled(MdxMiniPlayerFrag.state.controlsEnabled);
        }

        public FetchSeasonDetailsCallback()
        {
            this$0 = MdxMiniPlayerFrag.this;
            super("MdxMiniPlayerFrag");
        }
    }

    public static interface MdxMiniPlayerDialog
    {
    }

    private static class SharedState
    {

        boolean controlsEnabled;
        float currRating;
        boolean isEpisodeReady;
        boolean isVideoUnshared;
        boolean isVolumeEnabled;
        int mostRecentVolume;
        boolean shouldShowSelf;

        public void reset()
        {
            Log.v("MdxMiniPlayerFrag", "resetting shared state");
            shouldShowSelf = false;
            controlsEnabled = false;
            isEpisodeReady = false;
            isVideoUnshared = false;
            isVolumeEnabled = false;
            currRating = -1F;
        }

        private SharedState()
        {
        }

    }


    private static final boolean DISABLED = false;
    private static final String EXTRA_SAVED_POSITION_SECONDS = "saved_position_seconds";
    public static final boolean FORCE_SHOW_WITH_DUMMY_DATA = false;
    private static final String NOTIFY_SHOW_AND_DISABLE_INTENT = "com.netflix.mediaclient.ui.mdx.NOTIFY_SHOW_AND_DISABLE_INTENT";
    private static final long SEEKBAR_UPDATE_DELAY_MS = 1000L;
    private static final String TAG = "MdxMiniPlayerFrag";
    private static final Set dontShareIdSet = new HashSet();
    private static final SharedState state = new SharedState();
    private NetflixActivity activity;
    private VideoDetails currentVideo;
    private final DialogMessageReceiver dialogMessageReceiver = new DialogMessageReceiver(this);
    private boolean draggingInProgress;
    private IMdx dummyMdx;
    private final Handler handler = new Handler();
    private boolean isEndOfPlayback;
    private boolean isInBackground;
    private boolean isShowing;
    private LanguageSelector languageSelector;
    private final com.netflix.mediaclient.ui.common.LanguageSelector.LanguageSelectorCallback languageSelectorCallback = new com.netflix.mediaclient.ui.common.LanguageSelector.LanguageSelectorCallback() {

        final MdxMiniPlayerFrag this$0;

        public void languageChanged(Language language, boolean flag)
        {
            Log.v("MdxMiniPlayerFrag", (new StringBuilder()).append("Language changed via dialog: ").append(language).toString());
            if (remotePlayer != null)
            {
                remotePlayer.changeLanguage(language);
                remotePlayer.requestAudioAndSubtitleData();
            }
            updateLanguage();
        }

        public void updateDialog(Dialog dialog)
        {
            log("Updating dialog");
            activity.updateVisibleDialog(dialog);
        }

        public void userCanceled()
        {
            log("User canceled selection");
        }

        public boolean wasPlaying()
        {
            return false;
        }

            
            {
                this$0 = MdxMiniPlayerFrag.this;
                super();
            }
    };
    private ServiceManager manager;
    private MdxErrorHandler mdxErrorHandler;
    private final com.netflix.mediaclient.service.mdx.MdxKeyEventHandler.MdxKeyEventCallbacks mdxKeyEventCallbacks = new com.netflix.mediaclient.service.mdx.MdxKeyEventHandler.MdxKeyEventCallbacks() {

        final MdxMiniPlayerFrag this$0;

        public int getVolumeAsPercent()
        {
            return getVolume();
        }

        public void onVolumeSet(int i)
        {
            MdxMiniPlayerFrag.state.mostRecentVolume = i;
        }

            
            {
                this$0 = MdxMiniPlayerFrag.this;
                super();
            }
    };
    private MdxKeyEventHandler mdxKeyEventHandler;
    private final MdxMiniPlayerViews.MdxMiniPlayerViewCallbacks mdxMiniPlayerViewCallbacks = new MdxMiniPlayerViews.MdxMiniPlayerViewCallbacks() {

        private long startTrackingTouchTime;
        final MdxMiniPlayerFrag this$0;

        public float getCurrentRating()
        {
            return MdxMiniPlayerFrag.state.currRating;
        }

        public VideoDetails getCurrentVideo()
        {
            return currentVideo;
        }

        public ServiceManager getManager()
        {
            return manager;
        }

        public IMdx getMdx()
        {
            return manager.getMdx();
        }

        public boolean isEpisodeReady()
        {
            return MdxMiniPlayerFrag.state.isEpisodeReady;
        }

        public boolean isLanguageReady()
        {
            Language language;
            if (remotePlayer == null)
            {
                language = null;
            } else
            {
                language = remotePlayer.getLanguage();
            }
            return language != null && language.isLanguageSwitchEnabled();
        }

        public boolean isPanelExpanded()
        {
            return activity.isPanelExpanded();
        }

        public boolean isPlayingRemotely()
        {
            return MdxMiniPlayerFrag.this.isPlayingRemotely();
        }

        public boolean isRemotePlayerReady()
        {
            return remotePlayer != null;
        }

        public boolean isVideoUnshared()
        {
            return MdxMiniPlayerFrag.state.isVideoUnshared;
        }

        public void notifyControlsEnabled(boolean flag)
        {
            MdxMiniPlayerFrag.state.controlsEnabled = flag;
        }

        public void onPauseClicked()
        {
            if (remotePlayer != null)
            {
                remotePlayer.pause();
            }
        }

        public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
        {
        }

        public void onResumeClicked()
        {
            if (remotePlayer != null)
            {
                remotePlayer.resume();
            }
        }

        public void onShowLanguageSelectorDialog()
        {
            if (remotePlayer != null)
            {
                Language language = remotePlayer.getLanguage();
                log((new StringBuilder()).append("Displaying language dialog, language: ").append(language).toString());
                languageSelector.display(language);
            }
        }

        public void onSkipBackClicked()
        {
            if (remotePlayer != null)
            {
                remotePlayer.skipBackThirtySeconds();
                stopSimulatedVideoPositionUpdate();
            }
        }

        public void onStartTrackingTouch(SeekBar seekbar)
        {
            Log.v("MdxMiniPlayerFrag", "onStartTrackingTouch");
            draggingInProgress = true;
            startTrackingTouchTime = System.nanoTime();
            stopSimulatedVideoPositionUpdate();
        }

        public void onStopClicked()
        {
            if (remotePlayer != null)
            {
                remotePlayer.stop(false);
            }
        }

        public void onStopTrackingTouch(SeekBar seekbar, boolean flag)
        {
            Log.v("MdxMiniPlayerFrag", (new StringBuilder()).append("onStopTrackingTouch, pos: ").append(seekbar.getProgress()).toString());
            draggingInProgress = false;
            if (flag)
            {
                int i = (int)((System.nanoTime() - startTrackingTouchTime) / 0x3b9aca00L);
                int j = seekbar.getProgress() + i;
                if (Log.isLoggable("MdxMiniPlayerFrag", 2))
                {
                    Log.v("MdxMiniPlayerFrag", (new StringBuilder()).append("Seconds elapsed during seek (back to snap position): ").append(i).append(", new time: ").append(j).toString());
                }
                views.setProgress(j);
                startSimulatedVideoPositionUpdate(j);
                return;
            } else
            {
                Log.v("MdxMiniPlayerFrag", "Seeking...");
                views.setControlsEnabled(false);
                remotePlayer.seek(MdxUtils.setProgressByBif(seekbar));
                return;
            }
        }

            
            {
                this$0 = MdxMiniPlayerFrag.this;
                super();
            }
    };
    private String parentActivityClass;
    private RemotePlayer remotePlayer;
    private final RemotePlayer.RemoteTargetUiListener remoteTargetUiListener = new RemotePlayer.RemoteTargetUiListener() {

        final MdxMiniPlayerFrag this$0;

        private void handleSeekbarUpdate(RemotePlayer.RemoteTargetState remotetargetstate)
        {
            if (!draggingInProgress && MdxMiniPlayerFrag.state.controlsEnabled)
            {
                if (remotePlayer.getPositionInSeconds() >= 0)
                {
                    log((new StringBuilder()).append("Update video seekbar - pos: ").append(remotetargetstate.positionInSeconds).toString());
                    views.setProgress(remotetargetstate.positionInSeconds);
                }
                if (remotetargetstate.buffering || remotetargetstate.paused)
                {
                    stopSimulatedVideoPositionUpdate();
                    return;
                }
                if (!remotetargetstate.paused && isShowing())
                {
                    startSimulatedVideoPositionUpdate(remotetargetstate.positionInSeconds);
                    return;
                }
            }
        }

        private boolean isErrorRequireDisableControl(int i)
        {
            return i >= 100 && i < 300;
        }

        public void cancelDialog()
        {
            if (activity.destroyed())
            {
                return;
            }
            if (Log.isLoggable("MdxMiniPlayerFrag", 2))
            {
                log("cancelDialog");
            }
            activity.removeVisibleDialog();
        }

        public void endOfPlayback()
        {
            if (Log.isLoggable("MdxMiniPlayerFrag", 2))
            {
                log("endOfPlayback");
            }
            isEndOfPlayback = true;
            views.setControlsEnabled(false);
            activity.notifyMdxEndOfPlayback();
            MdxMiniPlayerFrag.state.reset();
            currentVideo = null;
        }

        public void error(int i, String s)
        {
            if (Log.isLoggable("MdxMiniPlayerFrag", 2))
            {
                log((new StringBuilder()).append("error - code: ").append(i).append(", descrip: ").append(s).toString());
            }
            isEndOfPlayback = true;
            if (isShowing())
            {
                mdxErrorHandler.handleMdxError(i, s);
            }
            if (isErrorRequireDisableControl(i))
            {
                views.setControlsEnabled(false);
                views.enableMdxMenu();
                activity.notifyMdxEndOfPlayback();
            }
        }

        public void mdxStateChanged(boolean flag)
        {
            if (Log.isLoggable("MdxMiniPlayerFrag", 2))
            {
                log((new StringBuilder()).append("mdxStateChanged, ready: ").append(flag).toString());
            }
        }

        public void showDialog(RemoteDialog remotedialog)
        {
            if (activity.destroyed())
            {
                return;
            }
            if (Log.isLoggable("MdxMiniPlayerFrag", 2))
            {
                log((new StringBuilder()).append("showDialog, ").append(remotedialog.toString()).toString());
            }
            remotedialog = ShowMessageDialogFrag.newInstance(remotedialog);
            remotedialog.onManagerReady(manager, 0);
            remotedialog.setCancelable(true);
            activity.showDialog(remotedialog);
        }

        public void targetListChanged()
        {
            log("targetListChanged");
        }

        public void updateDuration(int i)
        {
            if (activity.destroyed())
            {
                return;
            }
            log((new StringBuilder()).append("updateDuration, ").append(i).toString());
            if (i > 0)
            {
                views.setProgressMax(i);
                return;
            } else
            {
                Log.w("MdxMiniPlayerFrag", "We received an invalid duration - ignoring");
                return;
            }
        }

        public void updateLanguage(Language language)
        {
            if (Log.isLoggable("MdxMiniPlayerFrag", 2))
            {
                log((new StringBuilder()).append("updateLanguage from remote player: ").append(language).toString());
            }
            MdxMiniPlayerFrag.this.updateLanguage();
        }

        public void updateTargetCapabilities(MdxTargetCapabilities mdxtargetcapabilities)
        {
            if (activity.destroyed())
            {
                return;
            }
            if (mdxtargetcapabilities == null)
            {
                Log.w("MdxMiniPlayerFrag", "Capabilities is null!");
                updateVolumeState(false);
                return;
            }
            if (Log.isLoggable("MdxMiniPlayerFrag", 2))
            {
                log((new StringBuilder()).append("updateTargetCapabilities, ").append(mdxtargetcapabilities.toString()).toString());
            }
            updateVolumeState(mdxtargetcapabilities.isVolumeControl());
        }

        public void updateUi(RemotePlayer.RemoteTargetState remotetargetstate)
        {
            boolean flag1 = false;
            ThreadUtils.assertOnMain();
            if (Log.isLoggable("MdxMiniPlayerFrag", 2))
            {
                log((new StringBuilder()).append("updateUi, ").append(remotetargetstate.toString()).toString());
            }
            isEndOfPlayback = false;
            MdxMiniPlayerFrag.state.mostRecentVolume = remotetargetstate.volume;
            MdxMiniPlayerViews mdxminiplayerviews = views;
            boolean flag = flag1;
            if (!remotetargetstate.buffering)
            {
                flag = flag1;
                if (remotetargetstate.showMiniPlayer)
                {
                    flag = true;
                }
            }
            mdxminiplayerviews.setControlsEnabled(flag);
            updateVisibility(remotetargetstate.showMiniPlayer, remotetargetstate.paused);
            handleSeekbarUpdate(remotetargetstate);
        }

        public void updateVideoMetadata()
        {
            log("updateVideoMetadata");
            if (manager == null)
            {
                return;
            }
            IMdx imdx = mdxMiniPlayerViewCallbacks.getMdx();
            VideoDetails videodetails = imdx.getVideoDetail();
            if (currentVideo != null && MdxUtils.isSameVideoPlaying(imdx, currentVideo.getPlayableId()))
            {
                log("Same video is already playing, doing nothing");
                return;
            }
            if (videodetails == null)
            {
                Log.w("MdxMiniPlayerFrag", "null video details provided by mdx agent");
                return;
            } else
            {
                log((new StringBuilder()).append("Different video, updating to: ").append(videodetails.getTitle()).toString());
                MdxMiniPlayerFrag.this.updateVideoMetadata(videodetails);
                return;
            }
        }

            
            {
                this$0 = MdxMiniPlayerFrag.this;
                super();
            }
    };
    private int savedPositionSeconds;
    private long simulatedCurrentTimelinePositionMs;
    private long simulatedVideoPositionTimeFiredMs;
    private final Runnable updateSeekBarRunnable = new Runnable() ;
    private MdxMiniPlayerViews views;

    public MdxMiniPlayerFrag()
    {
    }

    private void hideDialogFragmentIfNecessary()
    {
        DialogFragment dialogfragment = activity.getDialogFragment();
        if (dialogfragment instanceof MdxMiniPlayerDialog)
        {
            Log.d("MdxMiniPlayerFrag", "MDX mini player dialog frag currently shown - hiding");
            dialogfragment.dismiss();
        }
    }

    private void hideSelf()
    {
        this;
        JVM INSTR monitorenter ;
        log("hideSelf()");
        isShowing = false;
        state.shouldShowSelf = false;
        stopSimulatedVideoPositionUpdate();
        views.updateMdxMenu();
        if (!isInBackground && !AndroidUtils.isActivityFinishedOrDestroyed(activity)) goto _L2; else goto _L1
_L1:
        log("Frag is in BG - should just hide self on resume");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        hideSelfInternal();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void hideSelfInternal()
    {
        this;
        JVM INSTR monitorenter ;
        log("Hiding MDX Player frag (internal)");
        FragmentManager fragmentmanager = getFragmentManager();
        fragmentmanager.beginTransaction().hide(this).commit();
        fragmentmanager.executePendingTransactions();
        hideDialogFragmentIfNecessary();
        hideVisibleDialogIfNecessary();
        activity.notifyMdxMiniPlayerHidden();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void hideVisibleDialogIfNecessary()
    {
        if (activity.getVisibleDialog() instanceof MdxMiniPlayerDialog)
        {
            Log.d("MdxMiniPlayerFrag", "MDX dialog currently shown - hiding");
            activity.removeVisibleDialog();
        }
    }

    private void initMdxComponents()
    {
        log("initMdxComponents()");
        IMdx imdx = mdxMiniPlayerViewCallbacks.getMdx();
        if (imdx != null)
        {
            VideoDetails videodetails = imdx.getVideoDetail();
            if (videodetails != null)
            {
                updateVideoMetadata(videodetails);
                views.setControlsEnabled(state.controlsEnabled);
                updateVisibility(state.shouldShowSelf, imdx.isPaused());
            }
            remotePlayer = new RemotePlayer(activity, remoteTargetUiListener);
            if (isShowing())
            {
                if (state.controlsEnabled)
                {
                    log("Controls are enabled & mini player is showing. Requesting subs and dubs...");
                    remotePlayer.requestAudioAndSubtitleData();
                }
                log("Syncing with remote player...");
                remotePlayer.sync();
            }
        }
        languageSelector = LanguageSelector.createInstance(activity, DeviceUtils.isTabletByContext(activity), languageSelectorCallback);
        views.onManagerReady(manager);
    }

    private void log(String s)
    {
        if (Log.isLoggable("MdxMiniPlayerFrag", 2))
        {
            Log.v("MdxMiniPlayerFrag", (new StringBuilder()).append(parentActivityClass).append(": ").append(s).toString());
        }
    }

    public static void sendShowAndDisableIntent(Context context)
    {
        context.sendBroadcast(new Intent("com.netflix.mediaclient.ui.mdx.NOTIFY_SHOW_AND_DISABLE_INTENT"));
    }

    private void showAndDisable()
    {
        showSelf();
        stopSimulatedVideoPositionUpdate();
        views.setControlsEnabled(false);
    }

    private void showSelf()
    {
        this;
        JVM INSTR monitorenter ;
        log("showSelf()");
        isShowing = true;
        state.shouldShowSelf = true;
        views.updateMdxMenu();
        if (!isInBackground && !AndroidUtils.isActivityFinishedOrDestroyed(activity)) goto _L2; else goto _L1
_L1:
        log("Frag is in BG - should just show self on resume");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        log("Showing MDX Player frag");
        FragmentManager fragmentmanager = getFragmentManager();
        fragmentmanager.beginTransaction().show(this).commit();
        fragmentmanager.executePendingTransactions();
        activity.notifyMdxMiniPlayerShown();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void startSimulatedVideoPositionUpdate(long l)
    {
        if (!activity.destroyed())
        {
            handler.removeCallbacks(updateSeekBarRunnable);
            simulatedCurrentTimelinePositionMs = l * 1000L;
            simulatedVideoPositionTimeFiredMs = System.currentTimeMillis();
            handler.postDelayed(updateSeekBarRunnable, 1000L);
            log("Simulated position update +started+");
        }
    }

    private void stopSimulatedVideoPositionUpdate()
    {
        if (!activity.destroyed())
        {
            handler.removeCallbacks(updateSeekBarRunnable);
            log("Simulated position update -stopped-");
        }
    }

    private void updateLanguage()
    {
        if (Log.isLoggable("MdxMiniPlayerFrag", 2))
        {
            Log.v("MdxMiniPlayerFrag", "updateLanguage()");
        }
        views.setLanguageButtonEnabled(mdxMiniPlayerViewCallbacks.isLanguageReady());
    }

    private void updateVideoMetadata(VideoDetails videodetails)
    {
        boolean flag1 = true;
        currentVideo = videodetails;
        log((new StringBuilder()).append("Updating metadata: ").append(currentVideo).append(", hash: ").append(currentVideo.hashCode()).toString());
        int i;
        int j;
        boolean flag;
        if (currentVideo.getType() == VideoType.EPISODE)
        {
            views.updateTitleText(currentVideo.getParentTitle());
            views.updateSubtitleText(activity.getString(0x7f0c0181, new Object[] {
                Integer.valueOf(currentVideo.getSeasonNumber()), Integer.valueOf(currentVideo.getEpisodeNumber()), currentVideo.getTitle()
            }));
        } else
        {
            views.updateTitleText(currentVideo.getTitle());
            views.updateSubtitleText("");
        }
        views.updateDeviceNameText(ServiceManagerUtils.getCurrentDeviceFriendlyName(manager));
        videodetails = views;
        if (currentVideo.getType() != VideoType.MOVIE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        videodetails.setEpisodesButtonVisibile(flag);
        log((new StringBuilder()).append("Setting seek bar max: ").append(currentVideo.getRuntime()).toString());
        views.setProgressMax(currentVideo.getRuntime());
        if (remotePlayer == null)
        {
            i = 0;
        } else
        {
            i = remotePlayer.getPositionInSeconds();
        }
        log(String.format("updating seek pos - remote pos: %d, playable bookmark pos: %d, saved pos: %d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(currentVideo.getPlayableBookmarkPosition()), Integer.valueOf(savedPositionSeconds)
        }));
        j = savedPositionSeconds;
        savedPositionSeconds = -1;
        i = j;
        if (j <= 0)
        {
            int k;
            if (remotePlayer == null)
            {
                k = 0;
            } else
            {
                k = remotePlayer.getPositionInSeconds();
            }
            i = k;
            if (k <= 0)
            {
                i = currentVideo.getPlayableBookmarkPosition();
            }
        }
        if (i > 0)
        {
            log((new StringBuilder()).append("Setting seek progress: ").append(i).toString());
            views.setProgress(i);
        }
        views.updateImage(currentVideo);
        if (currentVideo instanceof EpisodeDetails)
        {
            log("Video is instance of EpisodeDetails, fetching episodes...");
            manager.fetchSeasonDetails(((EpisodeDetails)currentVideo).getSeasonId(), new FetchSeasonDetailsCallback());
        } else
        {
            log("Video is not instance of EpisodeDetails");
        }
        videodetails = state;
        if (currentVideo.getFbDntShare() || dontShareIdSet.contains(currentVideo.getPlayableId()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        videodetails.isVideoUnshared = flag;
        videodetails = views;
        if (!state.isVideoUnshared)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        videodetails.setSharingButtonVisibility(flag);
        log((new StringBuilder()).append("updateVideoMetadata, unshared state is: ").append(state.isVideoUnshared).toString());
        updateLanguage();
    }

    private void updateVisibility(boolean flag, boolean flag1)
    {
        if (Log.isLoggable("MdxMiniPlayerFrag", 2))
        {
            log((new StringBuilder()).append("updateVisibility, frag isVisible: ").append(isShowing).append(", show: ").append(flag).append(", paused: ").append(flag1).toString());
        }
        if (isShowing != flag)
        {
            if (flag)
            {
                showSelf();
            } else
            {
                hideSelf();
            }
        }
        views.updatePlayPauseButton(flag1);
        views.setVolumeButtonVisibility(state.isVolumeEnabled);
    }

    private void updateVolumeState(boolean flag)
    {
        state.isVolumeEnabled = flag;
        views.setVolumeButtonVisibility(flag);
    }

    public void attachMenuItem(MdxMenu mdxmenu)
    {
        views.attachMenuItem(mdxmenu);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return mdxKeyEventHandler.handleKeyEvent(keyevent, manager, remotePlayer);
    }

    public long getCurrentPositionMs()
    {
        return simulatedCurrentTimelinePositionMs;
    }

    public PlayContext getPlayContext()
    {
        return PlayContext.EMPTY_CONTEXT;
    }

    public RemotePlayer getPlayer()
    {
        return remotePlayer;
    }

    public View getSlidingPanelDragView()
    {
        return views.getSlidingPanelDragView();
    }

    public MdxTargetSelection getTargetSelection()
    {
        IMdx imdx = mdxMiniPlayerViewCallbacks.getMdx();
        return new MdxTargetSelection(imdx.getTargetList(), imdx.getCurrentTarget());
    }

    public Playable getVideoDetails()
    {
        if (isPlayingRemotely())
        {
            return currentVideo;
        } else
        {
            return null;
        }
    }

    public int getVolume()
    {
        return state.mostRecentVolume;
    }

    public void handleDialogButton(String s, String s1)
    {
        if (!mdxErrorHandler.handleDialogButton(s, s1));
    }

    public void handleDialogCancel(String s)
    {
        if (!mdxErrorHandler.handleDialogCancel(s));
    }

    public void handleUserRatingChange(String s, float f)
    {
        if (Log.isLoggable("MdxMiniPlayerFrag", 2))
        {
            log((new StringBuilder()).append("Change user settings for received video id: ").append(s).append(" to rating: ").append(f).toString());
        }
        String s1 = MdxUtils.getVideoId(currentVideo);
        if (s != null && s.equals(s1))
        {
            log("This is rating for current playback, update it");
            state.currRating = f;
        } else
        {
            log("This is not update for current playable!");
        }
        if (manager == null)
        {
            log("Can't set rating because service man is null");
            return;
        } else
        {
            manager.setVideoRating(s1, (int)state.currRating, PlayContext.EMPTY_CONTEXT.getTrackId(), new com.netflix.mediaclient.util.MdxUtils.SetVideoRatingCallback(activity, state.currRating));
            return;
        }
    }

    public void hide()
    {
        hideSelf();
    }

    public boolean isLoadingData()
    {
        return false;
    }

    public boolean isMdxMenuEnabled()
    {
        return views.computeMdxMenuEnabled(state.controlsEnabled);
    }

    public boolean isPlayingLocally()
    {
        return false;
    }

    public boolean isPlayingRemotely()
    {
        return isShowing;
    }

    public boolean isShowing()
    {
        return isShowing;
    }

    public void notifyPlayingBackLocal()
    {
        hideSelf();
    }

    public void notifyPlayingBackRemote()
    {
        views.setControlsEnabled(false);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        parentActivityClass = getActivity().getClass().getSimpleName();
        activity = (NetflixActivity)getActivity();
        log("onCreate()");
        int i;
        if (bundle == null)
        {
            i = -1;
        } else
        {
            i = bundle.getInt("saved_position_seconds", -1);
        }
        savedPositionSeconds = i;
        activity.registerReceiverWithAutoUnregister(new BroadcastReceiver() {

            final MdxMiniPlayerFrag this$0;

            public void onReceive(Context context, Intent intent)
            {
                showAndDisable();
            }

            
            {
                this$0 = MdxMiniPlayerFrag.this;
                super();
            }
        }, "com.netflix.mediaclient.ui.mdx.NOTIFY_SHOW_AND_DISABLE_INTENT");
        mdxKeyEventHandler = new MdxKeyEventHandler(mdxKeyEventCallbacks);
        mdxErrorHandler = new MdxErrorHandler("MdxMiniPlayerFrag", activity, new com.netflix.mediaclient.service.mdx.MdxErrorHandler.ErrorHandlerCallbacks() {

            final MdxMiniPlayerFrag this$0;

            public void destroy()
            {
            }

            
            {
                this$0 = MdxMiniPlayerFrag.this;
                super();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        views = new MdxMiniPlayerViews(activity, mdxMiniPlayerViewCallbacks, this);
        log((new StringBuilder()).append("Updating to empty state, controls enabled: ").append(state.controlsEnabled).toString());
        views.updateToEmptyState(state.controlsEnabled);
        return views.getContentView();
    }

    public void onDestroy()
    {
        if (remotePlayer != null)
        {
            remotePlayer.destroy();
        }
        super.onDestroy();
    }

    public void onEpisodeSelectedForPlayback(EpisodeDetails episodedetails, PlayContext playcontext)
    {
        hideDialogFragmentIfNecessary();
        PlaybackLauncher.startPlaybackAfterPIN(activity, episodedetails, playcontext);
    }

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        super.onManagerReady(servicemanager, i);
        ThreadUtils.assertOnMain();
        if (activity == null || AndroidUtils.isActivityFinishedOrDestroyed(activity))
        {
            log("Activity is null or destroyed - bailing early");
            return;
        } else
        {
            manager = servicemanager;
            log("manager ready");
            initMdxComponents();
            return;
        }
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
        manager = null;
        if (remotePlayer != null)
        {
            remotePlayer.destroy();
            remotePlayer = null;
        }
        views.updateToEmptyState(false);
        hideSelf();
    }

    public void onPanelCollapsed()
    {
        views.onPanelCollapsed();
        if (isEndOfPlayback)
        {
            isEndOfPlayback = false;
            hideSelf();
        }
    }

    public void onPanelExpanded()
    {
        views.onPanelExpanded();
    }

    public void onPanelSlide(float f)
    {
        views.onPanelSlide(f);
    }

    public void onResume()
    {
        super.onResume();
        views.onResume();
    }

    public void onResumeFragments()
    {
        log("onResumeFragments");
        isInBackground = false;
        if (manager == null)
        {
            hideSelfInternal();
            return;
        }
        if (Log.isLoggable("MdxMiniPlayerFrag", 2))
        {
            log((new StringBuilder()).append("on resume - currentVideo: ").append(currentVideo).append(", shouldShowSelf: ").append(state.shouldShowSelf).toString());
        }
        if (currentVideo == null || !state.shouldShowSelf)
        {
            hideSelf();
            return;
        } else
        {
            showSelf();
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        this;
        JVM INSTR monitorenter ;
        super.onSaveInstanceState(bundle);
        bundle.putInt("saved_position_seconds", views.getProgress());
        isInBackground = true;
        this;
        JVM INSTR monitorexit ;
        return;
        bundle;
        throw bundle;
    }

    public void onStart()
    {
        super.onStart();
        MdxUtils.registerReceiver(activity, dialogMessageReceiver);
    }

    public void onStop()
    {
        super.onStop();
        MdxUtils.unregisterReceiver(activity, dialogMessageReceiver);
    }

    public void sendDialogResponse(String s)
    {
        if (remotePlayer != null)
        {
            remotePlayer.sendDialogResponse(s);
        }
    }

    public void setVolume(int i)
    {
        state.mostRecentVolume = i;
        if (remotePlayer != null)
        {
            remotePlayer.setVolume(i);
        }
    }

    public void unshareVideo()
    {
        if (manager == null || !manager.isReady())
        {
            Log.w("MdxMiniPlayerFrag", "Service manager is NOT ready - can't unshare video");
        } else
        if (!activity.destroyed())
        {
            if (currentVideo == null)
            {
                Log.w("MdxMiniPlayerFrag", "Video detail is missing. This should NOT happen!");
                return;
            } else
            {
                log("Unsharing video...");
                views.setSharingButtonEnabled(false);
                String s = currentVideo.getPlayableId();
                manager.hideVideo(s, new LoggingManagerCallback(s) {

                    final MdxMiniPlayerFrag this$0;
                    final String val$id;

                    public void onVideoHide(int i)
                    {
                        if (activity.destroyed())
                        {
                            return;
                        }
                        Object obj = views;
                        boolean flag;
                        if (i == 0)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        ((MdxMiniPlayerViews) (obj)).setSharingButtonVisibility(flag);
                        if (i == 0)
                        {
                            log("onVideoHide, unshared state is: true");
                            MdxMiniPlayerFrag.state.isVideoUnshared = true;
                            MdxMiniPlayerFrag.dontShareIdSet.add(id);
                        }
                        obj = (new StringBuilder()).append("DEBUG: onVideoHide status: ").append(i).toString();
                        log(((String) (obj)));
                    }

            
            {
                this$0 = MdxMiniPlayerFrag.this;
                id = s1;
                super(final_s);
            }
                });
                return;
            }
        }
    }











/*
    static VideoDetails access$1602(MdxMiniPlayerFrag mdxminiplayerfrag, VideoDetails videodetails)
    {
        mdxminiplayerfrag.currentVideo = videodetails;
        return videodetails;
    }

*/



/*
    static boolean access$1802(MdxMiniPlayerFrag mdxminiplayerfrag, boolean flag)
    {
        mdxminiplayerfrag.isEndOfPlayback = flag;
        return flag;
    }

*/














/*
    static boolean access$702(MdxMiniPlayerFrag mdxminiplayerfrag, boolean flag)
    {
        mdxminiplayerfrag.draggingInProgress = flag;
        return flag;
    }

*/



/*
    static long access$802(MdxMiniPlayerFrag mdxminiplayerfrag, long l)
    {
        mdxminiplayerfrag.simulatedVideoPositionTimeFiredMs = l;
        return l;
    }

*/



/*
    static long access$914(MdxMiniPlayerFrag mdxminiplayerfrag, long l)
    {
        l = mdxminiplayerfrag.simulatedCurrentTimelinePositionMs + l;
        mdxminiplayerfrag.simulatedCurrentTimelinePositionMs = l;
        return l;
    }

*/
}

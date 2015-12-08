// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.TappableSurfaceView;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.ui.Screen;
import com.netflix.mediaclient.ui.mdx.MdxTargetSelection;
import com.netflix.mediaclient.util.AndroidUtils;
import java.nio.ByteBuffer;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerUiState, TopPanel, BottomPanel, PlayerActivity, 
//            PostPlayFactory, PlayScreenJB, PlayScreenKindleHD, PlayScreenICS, 
//            PlayScreenKindleFire, SubtitleManager, ErrorManager, PostPlay, 
//            CurrentTime, LastTime

public class PlayScreen
    implements Screen
{
    public static class Listeners
    {

        public android.widget.SeekBar.OnSeekBarChangeListener audioPositionListener;
        public android.view.View.OnClickListener episodeSelectorListener;
        public android.view.View.OnClickListener playPauseListener;
        public android.view.View.OnClickListener skipBackListener;
        public android.view.SurfaceHolder.Callback surfaceListener;
        public com.netflix.mediaclient.android.widget.TappableSurfaceView.SurfaceMeasureListener surfaceMeasureListener;
        public com.netflix.mediaclient.android.widget.TappableSurfaceView.TapListener tapListener;
        public android.widget.SeekBar.OnSeekBarChangeListener videoPositionListener;
        public android.view.View.OnClickListener zoomListener;

        public Listeners()
        {
        }
    }


    protected static final String TAG = "screen";
    protected Listeners listeners;
    protected RelativeLayout mBackground;
    protected ImageView mBif;
    protected BottomPanel mBottomPanel;
    protected View mBufferingOverlay;
    protected PlayerActivity mController;
    protected TextView mDebugData;
    protected ViewFlipper mFlipper;
    protected SurfaceHolder mHolder;
    protected boolean mNavigationBarSetVisibleInProgress;
    private PlayerUiState mPendingState;
    private String mPlaybackControlOverlayId;
    private PostPlay mPostPlayManager;
    private PlayerUiState mState;
    protected final TappableSurfaceView mSurface;
    protected TopPanel mTopPanel;
    private boolean mZoomEnabled;
    private final Runnable removeSoundBar = new Runnable() {

        final PlayScreen this$0;

        public void run()
        {
            if (mState == PlayerUiState.Playing)
            {
                Log.d("screen", "AUDIO:: sound bar hide");
                TopPanel toppanel = mTopPanel;
                if (toppanel != null)
                {
                    toppanel.hideSoundSection();
                }
                return;
            } else
            {
                Log.d("screen", "AUDIO:: not in loaded state anymore! Ignore.");
                return;
            }
        }

            
            {
                this$0 = PlayScreen.this;
                super();
            }
    };

    PlayScreen(PlayerActivity playeractivity, Listeners listeners1, PostPlayFactory.PostPlayType postplaytype)
    {
        mState = PlayerUiState.Loading;
        mNavigationBarSetVisibleInProgress = false;
        mZoomEnabled = true;
        if (playeractivity == null || listeners1 == null)
        {
            throw new IllegalArgumentException("Argument can not be null!");
        }
        mController = playeractivity;
        listeners = listeners1;
        mTopPanel = new TopPanel(playeractivity, listeners1);
        mBottomPanel = new BottomPanel(playeractivity, listeners1);
        mSurface = (TappableSurfaceView)playeractivity.findViewById(0x7f070147);
        if (mSurface != null)
        {
            mSurface.addTapListener(listeners1.tapListener);
            mHolder = mSurface.getHolder();
            mSurface.setSurfaceMeasureListener(listeners1.surfaceMeasureListener);
        }
        if (mHolder != null)
        {
            mHolder.addCallback(listeners1.surfaceListener);
        }
        mFlipper = (ViewFlipper)playeractivity.findViewById(0x7f070149);
        mBackground = (RelativeLayout)playeractivity.findViewById(0x7f0700ff);
        mBufferingOverlay = playeractivity.findViewById(0x7f070166);
        mBif = (ImageView)playeractivity.findViewById(0x7f070148);
        mPostPlayManager = PostPlayFactory.create(playeractivity, postplaytype);
        moveToState(PlayerUiState.Loading);
    }

    static PlayScreen createInstance(PlayerActivity playeractivity, Listeners listeners1, PostPlayFactory.PostPlayType postplaytype)
    {
        int i = AndroidUtils.getAndroidVersion();
        if (i >= 16)
        {
            Log.d("screen", "PlayScreen for JB (Android 4.1+");
            return new PlayScreenJB(playeractivity, listeners1, postplaytype);
        }
        if (Build.MANUFACTURER.equals("Amazon") && (Build.MODEL.equals("KFOT") || Build.MODEL.equals("KFTT") || Build.MODEL.equals("KFJWA") || Build.MODEL.equals("KFJWI")))
        {
            Log.d("screen", "PlayScreen for Amazon Kindle HD");
            return new PlayScreenKindleHD(playeractivity, listeners1, postplaytype);
        }
        if (i >= 14)
        {
            Log.d("screen", "PlayScreen for ICS (Android 4+");
            return new PlayScreenICS(playeractivity, listeners1, postplaytype);
        }
        if (Build.MODEL.equals("Kindle Fire") && Build.MANUFACTURER.equals("Amazon"))
        {
            Log.d("screen", "PlayScreen for Amazon Kindle Fire");
            return new PlayScreenKindleFire(playeractivity, listeners1, postplaytype);
        } else
        {
            Log.d("screen", "PlayScreen for Froyo/Gingerbread (Android 2.2-2.3) - default");
            return new PlayScreen(playeractivity, listeners1, postplaytype);
        }
    }

    private boolean isZoomEnabled()
    {
        if (Log.isLoggable("screen", 3))
        {
            Log.d("screen", (new StringBuilder()).append("mZoomEnabled = ").append(mZoomEnabled).append(", surface.canVideoBeZoomed()=").append(mSurface.canVideoBeZoomed()).toString());
        }
        return mZoomEnabled && mSurface.canVideoBeZoomed();
    }

    private void moveToInterrupted()
    {
        mController.removeVisibleDialog();
        if (mController.isDialogFragmentVisible())
        {
            mController.removeDialogFrag();
        }
        clearPanel();
        mNavigationBarSetVisibleInProgress = true;
        showNavigationBar();
        mController.getSubtitleManager().setSubtitleVisibility(false);
        Log.d("screen", "Interrupted");
    }

    private void moveToLoaded()
    {
        Log.d("screen", "STATE_LOADED");
        int i;
        boolean flag;
        if (!mController.isStalled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mBottomPanel.enableButtons(flag);
        i = mController.getResources().getColor(0x7f090030);
        if (mBackground != null)
        {
            mBackground.setBackgroundColor(i);
        }
        if (mSurface != null)
        {
            mSurface.setBackgroundColor(i);
        }
        if (mPlaybackControlOverlayId != null)
        {
            if (!mController.getErrorManager().isErrorReported())
            {
                mController.reportUiModelessViewSessionEnded(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.playbackControls, mPlaybackControlOverlayId);
            }
            mPlaybackControlOverlayId = null;
        }
        playerOverlayVisibility(false);
    }

    private void moveToLoadedTapped()
    {
        Log.d("screen", "STATE_LOADED_TAPPED");
        int i;
        boolean flag;
        if (!mController.isStalled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mBottomPanel.enableButtons(flag);
        i = mController.getResources().getColor(0x7f090030);
        if (mBackground != null)
        {
            mBackground.setBackgroundColor(i);
        }
        if (mSurface != null)
        {
            mSurface.setBackgroundColor(i);
        }
        if (!mController.getErrorManager().isErrorReported())
        {
            mPlaybackControlOverlayId = mController.reportUiModelessViewSessionStart(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.playbackControls);
        }
        playerOverlayVisibility(true);
    }

    private void moveToLoading()
    {
        Log.d("screen", "STATE_LOADING, default");
    }

    private void moveToPostPlay()
    {
        mController.removeVisibleDialog();
        if (mController.isDialogFragmentVisible())
        {
            mController.removeDialogFrag();
        }
        clearPanel();
        Log.d("screen", "POST_PLAY");
        mNavigationBarSetVisibleInProgress = true;
        mPostPlayManager.transitionToPostPlay();
        showNavigationBar();
    }

    static int resolveContentView(PostPlayFactory.PostPlayType postplaytype)
    {
        if (postplaytype == PostPlayFactory.PostPlayType.EpisodesForPhone)
        {
            Log.d("screen", "playout_phone_episode");
            return 0x7f030065;
        }
        if (postplaytype == PostPlayFactory.PostPlayType.EpisodesForTablet)
        {
            Log.d("screen", "playout_tablet_episode");
            return 0x7f03006a;
        }
        if (postplaytype == PostPlayFactory.PostPlayType.RecommendationForTablet)
        {
            Log.d("screen", "playout_tablet_movie");
            return 0x7f03006b;
        } else
        {
            Log.d("screen", "playout_phone_movie");
            return 0x7f030066;
        }
    }

    public boolean canExitPlaybackEndOfPlay()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (mState != PlayerUiState.PostPlay) goto _L2; else goto _L1
_L1:
        Log.d("screen", "We are in post play state, do not exit player activity");
        mPostPlayManager.endOfPlay();
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (mPostPlayManager.wasPostPlayDismissed())
        {
            Log.d("screen", "Postplay was dismissed, force postplay");
            moveToState(PlayerUiState.PostPlay);
            mPostPlayManager.endOfPlay();
            mPostPlayManager.setBackgroundImageVisible(true);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_83;
        Exception exception;
        exception;
        throw exception;
        Log.d("screen", "Not in postplay, exit activity");
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void changeActionState(boolean flag, boolean flag1)
    {
label0:
        {
            if (mTopPanel != null)
            {
                mTopPanel.changeActionState(flag);
            }
            if (mBottomPanel != null)
            {
                if (!flag1)
                {
                    break label0;
                }
                mBottomPanel.enableButtons(flag);
            }
            return;
        }
        mBottomPanel.changeActionState(flag);
    }

    void clearPanel()
    {
        mNavigationBarSetVisibleInProgress = false;
        if (mState == PlayerUiState.Loading)
        {
            return;
        } else
        {
            moveToState(PlayerUiState.Playing);
            return;
        }
    }

    void destroy()
    {
        this;
        JVM INSTR monitorenter ;
        if (listeners != null)
        {
            if (mSurface != null)
            {
                mSurface.removeTapListener(listeners.tapListener);
            }
            if (mHolder != null)
            {
                mHolder.removeCallback(listeners.surfaceListener);
            }
        }
        if (mTopPanel != null)
        {
            mTopPanel.destroy();
        }
        if (mBottomPanel != null)
        {
            mBottomPanel.destroy();
        }
        if (mPostPlayManager != null)
        {
            mPostPlayManager.destroy();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public BottomPanel getBottomPanel()
    {
        return mBottomPanel;
    }

    public Activity getController()
    {
        return mController;
    }

    public String getCurrentTitle()
    {
        if (mTopPanel == null)
        {
            return null;
        } else
        {
            return mTopPanel.getCurrentTitle();
        }
    }

    SurfaceHolder getHolder()
    {
        return mHolder;
    }

    MdxTargetSelection getMdxTargetSelector()
    {
        return mBottomPanel.getMdxTargetSelector();
    }

    ImageView getMedia()
    {
        return mBottomPanel.getMedia();
    }

    PostPlay getPostPlay()
    {
        return mPostPlayManager;
    }

    public PlayerUiState getState()
    {
        return mState;
    }

    public final TappableSurfaceView getSurfaceView()
    {
        return mSurface;
    }

    public TopPanel getTopPanel()
    {
        return mTopPanel;
    }

    ImageView getZoom()
    {
        BottomPanel bottompanel = mBottomPanel;
        if (bottompanel != null)
        {
            return bottompanel.getZoom();
        } else
        {
            return null;
        }
    }

    void hideNavigationBar()
    {
        Log.d("screen", "hide nav noop");
    }

    boolean inInterruptedOrPendingInterrupted()
    {
        this;
        JVM INSTR monitorenter ;
        if (mState == PlayerUiState.Interrupter) goto _L2; else goto _L1
_L1:
        PlayerUiState playeruistate;
        PlayerUiState playeruistate1;
        playeruistate = mPendingState;
        playeruistate1 = PlayerUiState.Interrupter;
        if (playeruistate != playeruistate1) goto _L3; else goto _L2
_L2:
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    boolean inPostPlayOrPendingPostplay()
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("screen", 3))
        {
            Log.d("screen", (new StringBuilder()).append("canIgnoreSurfaceDestroyed, state: ").append(mState).append(", pending state: ").append(mPendingState).toString());
        }
        if (mState == PlayerUiState.PostPlay) goto _L2; else goto _L1
_L1:
        PlayerUiState playeruistate;
        PlayerUiState playeruistate1;
        playeruistate = mPendingState;
        playeruistate1 = PlayerUiState.PostPlay;
        if (playeruistate != playeruistate1) goto _L3; else goto _L2
_L2:
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    void initAudioProgress(int i)
    {
        if (Log.isLoggable("screen", 3))
        {
            Log.d("screen", (new StringBuilder()).append("InitAudioProgress: pos ").append(i).toString());
        }
        mTopPanel.initAudioProgress(i);
    }

    void initProgress(int i)
    {
        mBottomPanel.initProgress(i);
    }

    void moveCurrentTimeWithTimeline(boolean flag, boolean flag1)
    {
        BottomPanel bottompanel = mBottomPanel;
        if (bottompanel != null && bottompanel.getCurrentTime() != null)
        {
            bottompanel.getCurrentTime().move(flag, flag1);
        }
    }

    protected void moveToState(PlayerUiState playeruistate)
    {
        this;
        JVM INSTR monitorenter ;
        if (mState != playeruistate) goto _L2; else goto _L1
_L1:
        Log.d("screen", (new StringBuilder()).append("Already in this state, do nothing: ").append(playeruistate).toString());
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        mPendingState = playeruistate;
        if (playeruistate != PlayerUiState.Loading)
        {
            break; /* Loop/switch isn't completed */
        }
        moveToLoading();
_L5:
        mState = playeruistate;
        mPendingState = null;
        if (true) goto _L4; else goto _L3
        playeruistate;
        throw playeruistate;
_L3:
label0:
        {
            if (playeruistate != PlayerUiState.Playing)
            {
                break label0;
            }
            moveToLoaded();
        }
          goto _L5
label1:
        {
            if (playeruistate != PlayerUiState.PlayingWithTrickPlayOverlay)
            {
                break label1;
            }
            moveToLoadedTapped();
        }
          goto _L5
label2:
        {
            if (playeruistate != PlayerUiState.PostPlay)
            {
                break label2;
            }
            moveToPostPlay();
        }
          goto _L5
label3:
        {
            if (playeruistate != PlayerUiState.Interrupter)
            {
                break label3;
            }
            moveToInterrupted();
        }
          goto _L5
        Log.e("screen", "Invalid state set, ignoring");
          goto _L5
    }

    void onTap(boolean flag)
    {
        if (Log.isLoggable("screen", 3))
        {
            Log.d("screen", (new StringBuilder()).append("PlayScreen tap received. Event driven: ").append(flag).toString());
        }
        if (!flag)
        {
            Log.d("screen", "Hack to make player overlay visible on ICS+ devices. It is only called when event is null");
            if (mNavigationBarSetVisibleInProgress)
            {
                Log.d("screen", "Navigation bar visibility was already triggered. Ignore.");
                return;
            }
            Log.d("screen", "Navigation bar is now visible. Make player overlay visible.");
            mNavigationBarSetVisibleInProgress = true;
        } else
        {
            Log.d("screen", "Event is received. We are either not on ICS+ phone or this is tap to hide overlay.");
            mNavigationBarSetVisibleInProgress = false;
        }
        if (mState == PlayerUiState.Loading)
        {
            Log.d("screen", "Loading, noop");
            return;
        }
        if (mState == PlayerUiState.Playing)
        {
            Log.d("screen", "Move to PlayingWithTrickPlayOverlay");
            moveToState(PlayerUiState.PlayingWithTrickPlayOverlay);
            return;
        }
        if (mState == PlayerUiState.PlayingWithTrickPlayOverlay)
        {
            Log.d("screen", "Move to Playing");
            moveToState(PlayerUiState.Playing);
            return;
        }
        if (mState == PlayerUiState.PostPlay)
        {
            if (mPostPlayManager.wasPostPlayDismissed())
            {
                Log.d("screen", "PostPlay was dismissed before, stay in it!");
                return;
            } else
            {
                Log.d("screen", "Move to PlayingWithTrickPlayOverlay from post play");
                moveToState(PlayerUiState.Playing);
                mPostPlayManager.transitionFromPostPlay();
                hideNavigationBar();
                return;
            }
        } else
        {
            Log.e("screen", "This should not be possible, ignoring");
            return;
        }
    }

    protected void playerOverlayVisibility(boolean flag)
    {
        if (flag)
        {
            if (AndroidUtils.getAndroidVersion() < 14 || AndroidUtils.getAndroidVersion() >= 16)
            {
                mController.getWindow().clearFlags(1024);
            }
            if (mBottomPanel != null)
            {
                mBottomPanel.setZoomEnabled(isZoomEnabled());
                mBottomPanel.show();
            }
            if (mTopPanel != null)
            {
                mTopPanel.show();
            }
        } else
        {
            mController.getWindow().setFlags(1024, 1024);
            if (mBottomPanel != null)
            {
                mBottomPanel.hide();
            }
            if (mTopPanel != null)
            {
                mTopPanel.hide();
                return;
            }
        }
    }

    void removeSplashScreen()
    {
        if (mState == PlayerUiState.Loading)
        {
            Log.d("screen", "=========================>");
            if (mFlipper != null)
            {
                mFlipper.showNext();
            }
            moveToState(PlayerUiState.PlayingWithTrickPlayOverlay);
        }
    }

    public void resetToLoadingState()
    {
        moveToState(PlayerUiState.Loading);
        showSplashScreen();
    }

    int setAudioProgress(int i)
    {
        if (Log.isLoggable("screen", 3))
        {
            Log.d("screen", (new StringBuilder()).append("SetAudioProgress: pos ").append(i).toString());
        }
        return mTopPanel.setAudioProgress(i);
    }

    void setBufferingOverlayVisibility(boolean flag)
    {
        View view = mBufferingOverlay;
        if (view != null) goto _L2; else goto _L1
_L1:
        Log.w("screen", "bufferingOverlay is NULL!");
_L4:
        return;
_L2:
        if (Log.isLoggable("screen", 3))
        {
            Log.d("screen", "Subtitles ARE visible");
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.d("screen", "Display buffering overlay");
        view.setVisibility(0);
        if (false)
        {
            Log.d("screen", "Remove subtitles");
            mController.getSubtitleManager().setSubtitleVisibility(false);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Log.d("screen", "Remove buffering overlay");
        view.setVisibility(8);
        if (false)
        {
            Log.d("screen", "Add subtitles");
            mController.getSubtitleManager().setSubtitleVisibility(true);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    void setDebugData(String s)
    {
    }

    void setDebugDataVisibility(boolean flag)
    {
    }

    public void setLanguage(Language language)
    {
        TopPanel toppanel = mTopPanel;
        if (toppanel != null)
        {
            toppanel.setLanguage(language);
        }
    }

    void setLastTimeState(boolean flag)
    {
        BottomPanel bottompanel = mBottomPanel;
        if (bottompanel != null && bottompanel.getLastTime() != null)
        {
            bottompanel.getLastTime().setLastTimeState(flag);
        }
    }

    int setProgress(int i, int j, boolean flag)
    {
        return setProgress(i, j, flag, false);
    }

    int setProgress(int i, int j, boolean flag, boolean flag1)
    {
        BottomPanel bottompanel = mBottomPanel;
        if (bottompanel != null)
        {
            return bottompanel.setProgress(i, j, flag, flag1);
        } else
        {
            return 0;
        }
    }

    void setSoundBarVisibility(boolean flag)
    {
        if (mState == PlayerUiState.Playing)
        {
            Log.d("screen", "AUDIO:: sound bar is NOT visible");
            if (flag)
            {
                Log.d("screen", "AUDIO:: sound bar make it visible");
                mTopPanel.showSoundSection();
                mSurface.removeCallbacks(removeSoundBar);
                return;
            } else
            {
                Log.d("screen", "AUDIO:: sound bar hide with 0.5 sec delay");
                mSurface.postDelayed(removeSoundBar, 500L);
                return;
            }
        }
        if (mState == PlayerUiState.PlayingWithTrickPlayOverlay)
        {
            Log.d("screen", "AUDIO:: state loaded tapped. Sound bar is already visible");
            return;
        } else
        {
            Log.d("screen", "AUDIO:: SPLASH screen, ignore all");
            return;
        }
    }

    void setTitles(String s, String s1)
    {
        TopPanel toppanel = mTopPanel;
        if (toppanel != null)
        {
            toppanel.setTitles(s, s1);
        }
    }

    public void setTopPanelVisibility(boolean flag)
    {
label0:
        {
label1:
            {
                if (mTopPanel != null)
                {
                    if (!flag)
                    {
                        break label0;
                    }
                    if (mState == PlayerUiState.PlayingWithTrickPlayOverlay)
                    {
                        break label1;
                    }
                    Log.d("screen", "Player UI is NOT visible. Do not make top panel visible");
                }
                return;
            }
            mTopPanel.show();
            return;
        }
        mTopPanel.hide();
    }

    public void setZoom(boolean flag)
    {
label0:
        {
            if (mSurface != null)
            {
                if (!flag)
                {
                    break label0;
                }
                mSurface.setMode(1);
            }
            return;
        }
        mSurface.setMode(0);
    }

    public void setZoomEnabledByPlayertype(boolean flag)
    {
        mZoomEnabled = flag;
    }

    protected boolean shouldPlaybackRelatedOptionBePossible()
    {
        return !mController.isStalled() && mState != PlayerUiState.Loading;
    }

    public void showBif(ByteBuffer bytebuffer)
    {
        CurrentTime currenttime = mBottomPanel.getCurrentTime();
        boolean flag;
        if (bytebuffer != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        currenttime.setBifDownloaded(flag);
        if (bytebuffer != null && mBif != null)
        {
            if (mBif.getVisibility() != 0)
            {
                mBif.setVisibility(0);
            }
            bytebuffer = BitmapFactory.decodeByteArray(bytebuffer.array(), bytebuffer.position(), bytebuffer.limit());
            if (bytebuffer != null)
            {
                mBif.setImageBitmap(bytebuffer);
                return;
            } else
            {
                Log.d("screen", "bitmap is null");
                return;
            }
        } else
        {
            Log.d("screen", "bif data is null");
            return;
        }
    }

    void showNavigationBar()
    {
        Log.d("screen", "show nav noop");
    }

    void showSplashScreen()
    {
        if (mState != PlayerUiState.Loading)
        {
            Log.d("screen", "=========================> display spash screen");
            if (mFlipper != null)
            {
                mFlipper.showPrevious();
            }
        }
    }

    void snapToPosition(int i, int j)
    {
        BottomPanel bottompanel = mBottomPanel;
        if (bottompanel != null)
        {
            bottompanel.snapToPosition(i, j);
        }
    }

    public void startBif(ByteBuffer bytebuffer)
    {
        showBif(bytebuffer);
    }

    void startCurrentTime(ByteBuffer bytebuffer)
    {
        BottomPanel bottompanel = mBottomPanel;
        if (bottompanel != null && bottompanel.getCurrentTime() != null)
        {
            bottompanel.getCurrentTime().start(bytebuffer);
        }
    }

    public void stopBif()
    {
        if (mBif != null)
        {
            mBif.setVisibility(8);
        }
    }

    void stopCurrentTime(boolean flag)
    {
        BottomPanel bottompanel = mBottomPanel;
        if (bottompanel != null && bottompanel.getCurrentTime() != null)
        {
            bottompanel.getCurrentTime().stop(flag);
        }
    }

}

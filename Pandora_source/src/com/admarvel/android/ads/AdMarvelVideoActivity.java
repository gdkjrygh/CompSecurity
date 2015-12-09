// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import com.admarvel.android.util.Logging;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

// Referenced classes of package com.admarvel.android.ads:
//            VideoInterstitialControls, Utils, AdMarvelXMLElement, AdMarvelInterstitialAds, 
//            AdMarvelInterstitialAdListenerImpl, AdMarvelVideoView, Version, AdMarvelAnalyticsAdapterInstances, 
//            AdMarvelAnalyticsAdapter, AdMarvelXMLReader, LockOrientationPostAPI9

public class AdMarvelVideoActivity extends Activity
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener, AdMarvelVideoView.AdMarvelVideoViewListener
{
    static class AdMarvelProgressDialog extends ProgressDialog
    {

        private final WeakReference adMarvelVideoActivityReference;

        protected void onStop()
        {
            super.onStop();
            AdMarvelVideoActivity admarvelvideoactivity = (AdMarvelVideoActivity)adMarvelVideoActivityReference.get();
            if (admarvelvideoactivity != null)
            {
                LinearLayout linearlayout = (LinearLayout)admarvelvideoactivity.findViewById(AdMarvelVideoActivity.VIDEO_VIEW_ID);
                if (linearlayout != null)
                {
                    linearlayout.setVisibility(0);
                }
                if ((LinearLayout)admarvelvideoactivity.findViewById(AdMarvelVideoActivity.VIEW_ID) != null && admarvelvideoactivity.isToolbarVisible && admarvelvideoactivity.isToolbar)
                {
                    admarvelvideoactivity.toolbarDisplayToggle(true);
                    return;
                }
            }
        }

        public AdMarvelProgressDialog(Context context, AdMarvelVideoActivity admarvelvideoactivity)
        {
            super(context);
            adMarvelVideoActivityReference = new WeakReference(admarvelvideoactivity);
        }
    }

    private class CloseButtonSetAlphaRunnable
        implements Runnable
    {

        private WeakReference mCloseButtonRefernce;
        final AdMarvelVideoActivity this$0;

        public void run()
        {
            ImageView imageview = (ImageView)mCloseButtonRefernce.get();
            if (imageview != null && imageview.getDrawable() != null)
            {
                imageview.getDrawable().setAlpha(25);
                if (setCloseAlphaTimer != null && setCloseAlphaTimer.isEnabled())
                {
                    setCloseAlphaTimer.stop();
                }
            }
        }

        public CloseButtonSetAlphaRunnable(ImageView imageview)
        {
            this$0 = AdMarvelVideoActivity.this;
            super();
            mCloseButtonRefernce = null;
            mCloseButtonRefernce = new WeakReference(imageview);
        }
    }

    private class DownloadImageTask extends AsyncTask
    {

        ImageView imageView;
        final AdMarvelVideoActivity this$0;

        protected transient Bitmap doInBackground(String as[])
        {
            as = as[0];
            try
            {
                as = BitmapFactory.decodeStream((new URL(as)).openStream());
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                Logging.log(Log.getStackTraceString(as));
                return null;
            }
            return as;
        }

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected void onPostExecute(Bitmap bitmap)
        {
            imageView.setImageBitmap(bitmap);
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Bitmap)obj);
        }

        public DownloadImageTask(ImageView imageview)
        {
            this$0 = AdMarvelVideoActivity.this;
            super();
            imageView = imageview;
        }
    }

    private class DownloadImageTaskPostAPI11
        implements Runnable
    {

        private final WeakReference imageViewreReference;
        private final WeakReference posterUrlReference;
        final AdMarvelVideoActivity this$0;

        public void run()
        {
            if (imageViewreReference.get() != null && posterUrlReference.get() != null)
            {
                (new DownloadImageTask((ImageView)imageViewreReference.get())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
                    (String)posterUrlReference.get()
                });
            }
        }

        public DownloadImageTaskPostAPI11(ImageView imageview, String s)
        {
            this$0 = AdMarvelVideoActivity.this;
            super();
            posterUrlReference = new WeakReference(s);
            imageViewreReference = new WeakReference(imageview);
        }
    }

    private static class HardwareAccelerationManager
    {

        static void enable(Activity activity)
        {
            activity.getWindow().setFlags(0x1000000, 0x1000000);
        }

        private HardwareAccelerationManager()
        {
        }
    }

    class ProgressTracker
    {

        public int offset;
        public List pixelUrls;
        final AdMarvelVideoActivity this$0;

        public ProgressTracker(int i, List list)
        {
            this$0 = AdMarvelVideoActivity.this;
            super();
            pixelUrls = new ArrayList();
            offset = i;
            pixelUrls = list;
        }
    }

    class ScreenReceiver extends BroadcastReceiver
    {

        final AdMarvelVideoActivity this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF"))
            {
                Logging.log("Screen lock broadcast recieved");
                if (progressDialogReference != null)
                {
                    context = (AdMarvelProgressDialog)progressDialogReference.get();
                    if (context != null && context.isShowing() && !enablePlayingVideoOnScreenLock)
                    {
                        context.dismiss();
                        closeVideoInterstitial();
                    }
                }
                if (keepPlayingVideoOnScreenLock && videoState == VideoPlayerState.PausedBySystem && mVideoView != null)
                {
                    videoState = VideoPlayerState.Playing;
                    keepPlayingVideoOnScreenLock = false;
                }
                if (pauseVideoOnScreenLock && videoState == VideoPlayerState.PausedBySystem && mVideoView != null)
                {
                    mVideoView.pause();
                    videoState = VideoPlayerState.Paused;
                    pauseVideoOnScreenLock = false;
                }
            }
        }

        ScreenReceiver()
        {
            this$0 = AdMarvelVideoActivity.this;
            super();
        }
    }

    static class UITimer
    {

        private boolean enabled;
        private Handler handler;
        private int intervalMs;
        private boolean oneTime;
        private Runnable runMethod;
        private Runnable timer_tick = new _cls1();

        public boolean isEnabled()
        {
            return enabled;
        }

        public void start()
        {
            while (enabled || intervalMs < 1) 
            {
                return;
            }
            enabled = true;
            handler.postDelayed(timer_tick, intervalMs);
        }

        public void stop()
        {
            if (!enabled)
            {
                return;
            } else
            {
                enabled = false;
                handler.removeCallbacks(runMethod);
                handler.removeCallbacks(timer_tick);
                return;
            }
        }








        public UITimer(Handler handler1, Runnable runnable, int i)
        {
            enabled = false;
            oneTime = false;
            handler = handler1;
            runMethod = runnable;
            intervalMs = i;
        }

        public UITimer(Handler handler1, Runnable runnable, int i, boolean flag)
        {
            this(handler1, runnable, i);
            oneTime = flag;
        }
    }

    class URLQueryHandler
    {

        private final ArrayList mEntriesList = new ArrayList();
        final AdMarvelVideoActivity this$0;

        protected void addEntry(String s, String s1)
        {
            int i = 0;
            do
            {
                if (i >= mEntriesList.size())
                {
                    mEntriesList.add(new ParameterValuePair(s, s1));
                    return;
                }
                if (((ParameterValuePair)mEntriesList.get(i)).getParameter().equalsIgnoreCase(s))
                {
                    ((ParameterValuePair)mEntriesList.get(i)).updateValue(s1);
                    return;
                }
                i++;
            } while (true);
        }

        public List getParameterList()
        {
            return mEntriesList;
        }

        public void parseQuery(String s)
        {
            s = new StringTokenizer(s, "&");
            do
            {
                String s1;
                do
                {
                    if (!s.hasMoreElements())
                    {
                        return;
                    }
                    s1 = s.nextToken();
                } while (s1.length() <= 0);
                int i = s1.indexOf('=');
                if (i < 0)
                {
                    addEntry(s1, "");
                } else
                {
                    addEntry(s1.substring(0, i), s1.substring(i + 1));
                }
            } while (true);
        }

        public void parseUrl(String s)
        {
            int i = s.indexOf('?');
            if (i >= 0)
            {
                s = s.substring(i + 1);
            } else
            {
                s = "";
            }
            parseQuery(s);
        }

        public URLQueryHandler()
        {
            this$0 = AdMarvelVideoActivity.this;
            super();
        }
    }

    public class URLQueryHandler.ParameterValuePair
    {

        public String mParameter;
        public List mValue;
        final URLQueryHandler this$1;

        public String getParameter()
        {
            return mParameter;
        }

        public void updateValue(String s)
        {
            mValue.add(URLDecoder.decode(s));
        }

        public URLQueryHandler.ParameterValuePair(String s, String s1)
        {
            this$1 = URLQueryHandler.this;
            super();
            mParameter = s;
            mValue = new ArrayList();
            mValue.add(URLDecoder.decode(s1));
        }
    }

    public static final class VideoPlayerState extends Enum
    {

        private static final VideoPlayerState ENUM$VALUES[];
        public static final VideoPlayerState Finished;
        public static final VideoPlayerState Loading;
        public static final VideoPlayerState Paused;
        public static final VideoPlayerState PausedBySystem;
        public static final VideoPlayerState PausedByToolbar;
        public static final VideoPlayerState Playing;
        public static final VideoPlayerState Stopped;

        public static VideoPlayerState valueOf(String s)
        {
            return (VideoPlayerState)Enum.valueOf(com/admarvel/android/ads/AdMarvelVideoActivity$VideoPlayerState, s);
        }

        public static VideoPlayerState[] values()
        {
            VideoPlayerState avideoplayerstate[] = ENUM$VALUES;
            int i = avideoplayerstate.length;
            VideoPlayerState avideoplayerstate1[] = new VideoPlayerState[i];
            System.arraycopy(avideoplayerstate, 0, avideoplayerstate1, 0, i);
            return avideoplayerstate1;
        }

        static 
        {
            Loading = new VideoPlayerState("Loading", 0);
            Playing = new VideoPlayerState("Playing", 1);
            Paused = new VideoPlayerState("Paused", 2);
            Stopped = new VideoPlayerState("Stopped", 3);
            Finished = new VideoPlayerState("Finished", 4);
            PausedByToolbar = new VideoPlayerState("PausedByToolbar", 5);
            PausedBySystem = new VideoPlayerState("PausedBySystem", 6);
            ENUM$VALUES = (new VideoPlayerState[] {
                Loading, Playing, Paused, Stopped, Finished, PausedByToolbar, PausedBySystem
            });
        }

        private VideoPlayerState(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class VideoStateEventTracking extends Enum
    {

        public static final VideoStateEventTracking CLOSE;
        public static final VideoStateEventTracking COMPLETE;
        private static final VideoStateEventTracking ENUM$VALUES[];
        public static final VideoStateEventTracking PAUSE;
        public static final VideoStateEventTracking RESUME;
        public static final VideoStateEventTracking START;
        public static final VideoStateEventTracking STOP;

        public static VideoStateEventTracking valueOf(String s)
        {
            return (VideoStateEventTracking)Enum.valueOf(com/admarvel/android/ads/AdMarvelVideoActivity$VideoStateEventTracking, s);
        }

        public static VideoStateEventTracking[] values()
        {
            VideoStateEventTracking avideostateeventtracking[] = ENUM$VALUES;
            int i = avideostateeventtracking.length;
            VideoStateEventTracking avideostateeventtracking1[] = new VideoStateEventTracking[i];
            System.arraycopy(avideostateeventtracking, 0, avideostateeventtracking1, 0, i);
            return avideostateeventtracking1;
        }

        static 
        {
            START = new VideoStateEventTracking("START", 0);
            COMPLETE = new VideoStateEventTracking("COMPLETE", 1);
            PAUSE = new VideoStateEventTracking("PAUSE", 2);
            RESUME = new VideoStateEventTracking("RESUME", 3);
            CLOSE = new VideoStateEventTracking("CLOSE", 4);
            STOP = new VideoStateEventTracking("STOP", 5);
            ENUM$VALUES = (new VideoStateEventTracking[] {
                START, COMPLETE, PAUSE, RESUME, CLOSE, STOP
            });
        }

        private VideoStateEventTracking(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class VideoVolumeState extends Enum
    {

        private static final VideoVolumeState ENUM$VALUES[];
        public static final VideoVolumeState Mute;
        public static final VideoVolumeState UnMute;
        public static final VideoVolumeState Unknown;

        public static VideoVolumeState valueOf(String s)
        {
            return (VideoVolumeState)Enum.valueOf(com/admarvel/android/ads/AdMarvelVideoActivity$VideoVolumeState, s);
        }

        public static VideoVolumeState[] values()
        {
            VideoVolumeState avideovolumestate[] = ENUM$VALUES;
            int i = avideovolumestate.length;
            VideoVolumeState avideovolumestate1[] = new VideoVolumeState[i];
            System.arraycopy(avideovolumestate, 0, avideovolumestate1, 0, i);
            return avideovolumestate1;
        }

        static 
        {
            Mute = new VideoVolumeState("Mute", 0);
            UnMute = new VideoVolumeState("UnMute", 1);
            Unknown = new VideoVolumeState("Unknown", 2);
            ENUM$VALUES = (new VideoVolumeState[] {
                Mute, UnMute, Unknown
            });
        }

        private VideoVolumeState(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String DEVICE_KINDLE = "Kindle";
    static int LAYOUT_VIEW_ID = 0x19414;
    static int VIDEO_VIEW_ID = 23232;
    static int VIEW_ID = 0x1e0f4;
    private Runnable AutoToggleRunnable;
    private Runnable CloseDialogRunnable;
    private Runnable CounterRunnable;
    private Runnable DelayRunnable;
    private String GUID;
    private Runnable SkipTextRunnable;
    private int adCloseCount;
    AdMarvelXMLElement adXMLElement;
    private android.view.View.OnTouchListener admarvelVideoLayoutTouchListener;
    private android.view.View.OnTouchListener admarvelVideoTouchListener;
    private UITimer autoToggleTimer;
    private UITimer counterTimer;
    private int delayForDoneButtonDisplay;
    private UITimer delayTimer;
    private boolean enablePlayingVideoOnScreenLock;
    private Handler handler;
    private boolean interstitial;
    private boolean isDelayDisplayDoneButton;
    private boolean isForceQuit;
    private boolean isPlayingNextVideo;
    private boolean isPosterAvailable;
    private boolean isToggleToolbar;
    private boolean isToolbar;
    private boolean isToolbarVisible;
    private boolean isVideoInitialMute;
    private boolean keepPlayingVideoOnScreenLock;
    private long lastInteractionTime;
    public boolean launchingInAppBrowser;
    private ImageView mPosterView;
    private BroadcastReceiver mReceiver;
    private AdMarvelVideoView mVideoView;
    LinearLayout mtoolbar;
    private boolean pauseVideoOnScreenLock;
    private List posterStates;
    private String posterUrl;
    WeakReference progressDialogReference;
    private List progressTrackers;
    private boolean quitVideoWhenBackgrounded;
    private UITimer setCloseAlphaTimer;
    private boolean showSkipMessage;
    private long skipMessageInitialTime;
    private RelativeLayout skipMessageLayout;
    private String skipText;
    private UITimer skipTextTimer;
    private Map stateTrackers;
    private TextView timerText;
    private Utils utils;
    public int videoDuration;
    private WeakReference videoInterstitialControlsReference;
    public VideoPlayerState videoState;
    private String videoUrl;
    public VideoVolumeState videoVolumeState;
    private String xml;
    AdMarvelXMLReader xmlReader;

    public AdMarvelVideoActivity()
    {
        isToolbar = false;
        isToolbarVisible = false;
        isToggleToolbar = true;
        isDelayDisplayDoneButton = false;
        delayForDoneButtonDisplay = -1;
        isPosterAvailable = false;
        isPlayingNextVideo = false;
        isForceQuit = false;
        showSkipMessage = false;
        skipMessageLayout = null;
        keepPlayingVideoOnScreenLock = false;
        pauseVideoOnScreenLock = false;
        enablePlayingVideoOnScreenLock = false;
        quitVideoWhenBackgrounded = false;
        launchingInAppBrowser = false;
        videoVolumeState = VideoVolumeState.Unknown;
        timerText = null;
        videoDuration = -1;
        isVideoInitialMute = false;
        adCloseCount = 0;
        CounterRunnable = new Runnable() {

            final AdMarvelVideoActivity this$0;

            public void run()
            {
                if (mVideoView == null || isPlayingNextVideo)
                {
                    return;
                } else
                {
                    updateTimer(videoDuration - valueInSeconds(mVideoView.getCurrentPosition()), timerText);
                    manageProgressTrackingEvents(valueInSeconds(mVideoView.getCurrentPosition()));
                    return;
                }
            }

            
            {
                this$0 = AdMarvelVideoActivity.this;
                super();
            }
        };
        DelayRunnable = new Runnable() {

            final AdMarvelVideoActivity this$0;

            public void run()
            {
                VideoInterstitialControls videointerstitialcontrols;
                if (videoInterstitialControlsReference == null)
                {
                    break MISSING_BLOCK_LABEL_243;
                }
                videointerstitialcontrols = (VideoInterstitialControls)videoInterstitialControlsReference.get();
                if (videointerstitialcontrols == null)
                {
                    break MISSING_BLOCK_LABEL_243;
                }
                if (!(videointerstitialcontrols instanceof LinearLayout))
                {
                    break MISSING_BLOCK_LABEL_243;
                }
                if (videointerstitialcontrols == null) goto _L2; else goto _L1
_L1:
                if (!isToolbar) goto _L2; else goto _L3
_L3:
                int i = 0;
_L5:
                if (i < videointerstitialcontrols.getChildCount()) goto _L4; else goto _L2
_L2:
                isDelayDisplayDoneButton = false;
                if (skipTextTimer != null)
                {
                    skipTextTimer.stop();
                    showSkipMessage = false;
                    skipMessageLayout.setVisibility(8);
                    return;
                }
                break MISSING_BLOCK_LABEL_243;
_L4:
                Object obj;
                if (!(videointerstitialcontrols.getChildAt(i) instanceof VideoInterstitialControls.ToolbarButtonLayout))
                {
                    break MISSING_BLOCK_LABEL_228;
                }
                obj = (VideoInterstitialControls.ToolbarButtonLayout)videointerstitialcontrols.getChildAt(i);
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_228;
                }
                if (((VideoInterstitialControls.ToolbarButtonLayout) (obj)).eventType.equalsIgnoreCase("done"))
                {
                    ((VideoInterstitialControls.ToolbarButtonLayout) (obj)).setClickable(true);
                    ((VideoInterstitialControls.ToolbarButtonLayout) (obj)).setEnabled(true);
                    if (((VideoInterstitialControls.ToolbarButtonLayout) (obj)).getChildAt(0) instanceof ImageView)
                    {
                        if (setCloseAlphaTimer != null && setCloseAlphaTimer.isEnabled())
                        {
                            setCloseAlphaTimer.stop();
                        }
                        obj = (ImageView)((VideoInterstitialControls.ToolbarButtonLayout) (obj)).getChildAt(0);
                        if (((ImageView) (obj)).getDrawable() != null)
                        {
                            ((ImageView) (obj)).getDrawable().setAlpha(255);
                            ((ImageView) (obj)).invalidate();
                        }
                    }
                }
                i++;
                  goto _L5
                Exception exception;
                exception;
                Logging.log(Log.getStackTraceString(exception));
            }

            
            {
                this$0 = AdMarvelVideoActivity.this;
                super();
            }
        };
        CloseDialogRunnable = new Runnable() {

            final AdMarvelVideoActivity this$0;

            public void run()
            {
                AdMarvelProgressDialog admarvelprogressdialog;
                try
                {
                    admarvelprogressdialog = (AdMarvelProgressDialog)progressDialogReference.get();
                }
                catch (Exception exception)
                {
                    Logging.log(Log.getStackTraceString(exception));
                    return;
                }
                if (admarvelprogressdialog == null)
                {
                    break MISSING_BLOCK_LABEL_22;
                }
                admarvelprogressdialog.dismiss();
            }

            
            {
                this$0 = AdMarvelVideoActivity.this;
                super();
            }
        };
        SkipTextRunnable = new Runnable() {

            final AdMarvelVideoActivity this$0;

            public void run()
            {
                if (!showSkipMessage || skipMessageLayout == null)
                {
                    return;
                }
                Object obj;
                int i;
                skipMessageLayout.setVisibility(0);
                i = delayForDoneButtonDisplay - valueInSeconds(System.currentTimeMillis() - skipMessageInitialTime);
                if (skipText == null || skipText.length() <= 0 || !skipText.contains("@seconds"))
                {
                    break MISSING_BLOCK_LABEL_142;
                }
                obj = skipText.replace("@seconds", String.valueOf(i));
_L1:
                ((TextView)skipMessageLayout.getChildAt(0)).setText(((CharSequence) (obj)));
                return;
                try
                {
                    obj = (new StringBuilder("You Can Skip Ad in ")).append(i).append(" seconds").toString();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Logging.log(Log.getStackTraceString(((Throwable) (obj))));
                    return;
                }
                  goto _L1
            }

            
            {
                this$0 = AdMarvelVideoActivity.this;
                super();
            }
        };
        AutoToggleRunnable = new Runnable() {

            final AdMarvelVideoActivity this$0;

            public void run()
            {
                LinearLayout linearlayout = (LinearLayout)findViewById(AdMarvelVideoActivity.VIEW_ID);
                if (isToolbar && linearlayout != null && linearlayout.getVisibility() == 0 && System.currentTimeMillis() - lastInteractionTime >= 3000L)
                {
                    toolbarDisplayToggle(false);
                }
                autoToggleTimer.stop();
            }

            
            {
                this$0 = AdMarvelVideoActivity.this;
                super();
            }
        };
        admarvelVideoTouchListener = new android.view.View.OnTouchListener() {

            final AdMarvelVideoActivity this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 0)
                {
                    onUserInteraction();
                }
                return false;
            }

            
            {
                this$0 = AdMarvelVideoActivity.this;
                super();
            }
        };
        admarvelVideoLayoutTouchListener = new android.view.View.OnTouchListener() {

            final AdMarvelVideoActivity this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 0)
                {
                    view = (LinearLayout)findViewById(AdMarvelVideoActivity.VIEW_ID);
                    if (isToolbar && view != null && isToggleToolbar && videoState != VideoPlayerState.Stopped && videoState != VideoPlayerState.Finished)
                    {
                        onUserInteraction();
                    }
                }
                return false;
            }

            
            {
                this$0 = AdMarvelVideoActivity.this;
                super();
            }
        };
    }

    private void animateView(LinearLayout linearlayout, boolean flag)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setInterpolator(new DecelerateInterpolator());
        alphaanimation.setDuration(800L);
        AlphaAnimation alphaanimation1 = new AlphaAnimation(1.0F, 0.0F);
        alphaanimation1.setInterpolator(new AccelerateInterpolator());
        alphaanimation1.setDuration(500L);
        if (flag)
        {
            linearlayout.setAnimation(alphaanimation);
            return;
        } else
        {
            linearlayout.setAnimation(alphaanimation1);
            return;
        }
    }

    private boolean canMuteVideo()
    {
        if (videoInterstitialControlsReference == null) goto _L2; else goto _L1
_L1:
        VideoInterstitialControls videointerstitialcontrols = (VideoInterstitialControls)videoInterstitialControlsReference.get();
        if (videointerstitialcontrols == null || !(videointerstitialcontrols instanceof LinearLayout)) goto _L2; else goto _L3
_L3:
        int i = 0;
_L6:
        if (i < videointerstitialcontrols.getChildCount()) goto _L4; else goto _L2
_L2:
        return false;
_L4:
        if (videointerstitialcontrols.getChildAt(i) instanceof ViewSwitcher)
        {
            Object obj = (ViewSwitcher)videointerstitialcontrols.getChildAt(i);
            VideoInterstitialControls.ToolbarButtonLayout toolbarbuttonlayout = (VideoInterstitialControls.ToolbarButtonLayout)((ViewSwitcher) (obj)).getCurrentView();
            obj = (VideoInterstitialControls.ToolbarButtonLayout)((ViewSwitcher) (obj)).getNextView();
            if (toolbarbuttonlayout != null && toolbarbuttonlayout.eventType.equalsIgnoreCase("unmute") || obj != null && ((VideoInterstitialControls.ToolbarButtonLayout) (obj)).eventType.equalsIgnoreCase("unmute"))
            {
                return true;
            }
        } else
        if (videointerstitialcontrols.getChildAt(i) instanceof VideoInterstitialControls.ToolbarButtonLayout)
        {
            VideoInterstitialControls.ToolbarButtonLayout toolbarbuttonlayout1 = (VideoInterstitialControls.ToolbarButtonLayout)videointerstitialcontrols.getChildAt(i);
            if (toolbarbuttonlayout1 != null && toolbarbuttonlayout1.eventType.equalsIgnoreCase("unmute"))
            {
                return true;
            }
        }
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void cleanup()
    {
        if (counterTimer != null)
        {
            counterTimer.stop();
        }
        if (delayTimer != null)
        {
            delayTimer.stop();
        }
        if (autoToggleTimer != null)
        {
            autoToggleTimer.stop();
        }
        if (skipTextTimer != null)
        {
            skipTextTimer.stop();
        }
    }

    private String generateXml(String s)
    {
        if (s == null || s.length() <= 0)
        {
            return null;
        }
        Object obj = new URLQueryHandler();
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("<videoTrackingEvents>");
        ((URLQueryHandler) (obj)).parseUrl(s);
        Object obj1;
        Object obj2;
        Object obj3;
        String s1;
        Object obj4;
        Object obj5;
        String s2;
        if (obj != null)
        {
            obj4 = ((URLQueryHandler) (obj)).getParameterList().iterator();
            s = null;
            obj1 = null;
            obj = null;
            s1 = null;
            obj2 = null;
            obj3 = null;
        } else
        {
            return null;
        }
        if (((Iterator) (obj4)).hasNext()) goto _L2; else goto _L1
_L1:
        stringbuffer.append("</videoTrackingEvents>");
        if (s1 != null && s1.length() > 0)
        {
            s1 = (new StringBuilder("<loadingimage>")).append(s1).append("</loadingimage>").toString();
        } else
        {
            s1 = "";
        }
        if (obj2 == null || ((String) (obj2)).length() <= 0)
        {
            break MISSING_BLOCK_LABEL_929;
        }
        obj4 = new StringBuffer();
        if (obj3 == null || ((List) (obj3)).size() <= 0) goto _L4; else goto _L3
_L3:
        ((StringBuffer) (obj4)).append("<clickTracking><pixels>");
        obj3 = ((List) (obj3)).iterator();
_L10:
        if (((Iterator) (obj3)).hasNext()) goto _L6; else goto _L5
_L5:
        ((StringBuffer) (obj4)).append("</pixels></clickTracking>");
_L4:
        if (((StringBuffer) (obj4)).length() > 0)
        {
            obj2 = String.format("<toolbar > <item type=\"SystemItem\" ><action type=\"done\"/></item> <item type=\"Toggle\"> <subitem type=\"SystemItem\" > <action type=\"pause\"/> </subitem> <subitem type=\"SystemItem\" > <action type=\"resume\"/> </subitem> </item> <item type=\"SystemItem\" >%s<action type=\"open_url\">%s</action></item> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"Timer\"/> </toolbar>", new Object[] {
                ((StringBuffer) (obj4)).toString(), obj2
            });
        } else
        {
            obj2 = String.format("<toolbar > <item type=\"SystemItem\" ><action type=\"done\"/></item> <item type=\"Toggle\"> <subitem type=\"SystemItem\" > <action type=\"pause\"/> </subitem> <subitem type=\"SystemItem\" > <action type=\"resume\"/> </subitem> </item> <item type=\"SystemItem\" >%s<action type=\"open_url\">%s</action></item> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"Timer\"/> </toolbar>", new Object[] {
                "", obj2
            });
        }
_L11:
        if (obj1 == null)
        {
            obj1 = "";
        }
        if (obj == null)
        {
            obj = "NO";
        }
        if (s == null)
        {
            s = "";
        }
        return String.format("<customad type=\"video\"><video duration=\"%s\" forcequit=\"%s\">%s</video>%s%s%s</customad>", new Object[] {
            obj1, obj, s, s1, obj2, stringbuffer.toString()
        });
_L2:
        obj5 = (URLQueryHandler.ParameterValuePair)((Iterator) (obj4)).next();
        if ("xml".equalsIgnoreCase(((URLQueryHandler.ParameterValuePair) (obj5)).mParameter))
        {
            return (String)((URLQueryHandler.ParameterValuePair) (obj5)).mValue.get(0);
        }
        if ("video".equalsIgnoreCase(((URLQueryHandler.ParameterValuePair) (obj5)).mParameter))
        {
            s = redirectURLCheck((String)((URLQueryHandler.ParameterValuePair) (obj5)).mValue.get(0));
        } else
        if ("duration".equalsIgnoreCase(((URLQueryHandler.ParameterValuePair) (obj5)).mParameter))
        {
            obj1 = (String)((URLQueryHandler.ParameterValuePair) (obj5)).mValue.get(0);
        } else
        if ("poster".equalsIgnoreCase(((URLQueryHandler.ParameterValuePair) (obj5)).mParameter))
        {
            s1 = (String)((URLQueryHandler.ParameterValuePair) (obj5)).mValue.get(0);
        } else
        {
label0:
            {
                if (!"force_quit".equalsIgnoreCase(((URLQueryHandler.ParameterValuePair) (obj5)).mParameter))
                {
                    break label0;
                }
                obj = (String)((URLQueryHandler.ParameterValuePair) (obj5)).mValue.get(0);
            }
        }
        break MISSING_BLOCK_LABEL_75;
        if ("open_url".equalsIgnoreCase(((URLQueryHandler.ParameterValuePair) (obj5)).mParameter))
        {
            obj2 = (String)((URLQueryHandler.ParameterValuePair) (obj5)).mValue.get(0);
            break MISSING_BLOCK_LABEL_75;
        }
        if (!((URLQueryHandler.ParameterValuePair) (obj5)).mParameter.startsWith("track_"))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (!((URLQueryHandler.ParameterValuePair) (obj5)).mParameter.startsWith("track_pr_"))
        {
            break MISSING_BLOCK_LABEL_667;
        }
        s2 = ((URLQueryHandler.ParameterValuePair) (obj5)).mParameter.replaceFirst("track_pr_", "");
        stringbuffer.append((new StringBuilder("<videoTracking event=\"progress\" offset=\"")).append(s2).append("\"><pixels>").toString());
        obj5 = ((URLQueryHandler.ParameterValuePair) (obj5)).mValue.iterator();
_L8:
label1:
        {
            if (((Iterator) (obj5)).hasNext())
            {
                break label1;
            }
            stringbuffer.append("</pixels></videoTracking>");
        }
        break MISSING_BLOCK_LABEL_75;
        s2 = (String)((Iterator) (obj5)).next();
        if (s2 != null && s2.length() > 0)
        {
            stringbuffer.append((new StringBuilder("<pixel>")).append(s2).append("</pixel>").toString());
        }
        if (true) goto _L8; else goto _L7
_L7:
label2:
        {
            if (!"track_open_url".equalsIgnoreCase(((URLQueryHandler.ParameterValuePair) (obj5)).mParameter))
            {
                break label2;
            }
            new ArrayList();
            obj3 = ((URLQueryHandler.ParameterValuePair) (obj5)).mValue;
        }
        break MISSING_BLOCK_LABEL_75;
        s2 = ((URLQueryHandler.ParameterValuePair) (obj5)).mParameter.replaceFirst("track_", "");
        stringbuffer.append((new StringBuilder("<videoTracking event=\"")).append(s2).append("\" ><pixels>").toString());
        obj5 = ((URLQueryHandler.ParameterValuePair) (obj5)).mValue.iterator();
_L9:
label3:
        {
            if (((Iterator) (obj5)).hasNext())
            {
                break label3;
            }
            stringbuffer.append("</pixels></videoTracking>");
        }
        break MISSING_BLOCK_LABEL_75;
        s2 = (String)((Iterator) (obj5)).next();
        if (s2 != null && s2.length() > 0)
        {
            stringbuffer.append((new StringBuilder("<pixel>")).append(s2).append("</pixel>").toString());
        }
        if (true) goto _L9; else goto _L6
_L6:
        obj5 = (String)((Iterator) (obj3)).next();
        if (obj5 != null && ((String) (obj5)).length() > 0)
        {
            ((StringBuffer) (obj4)).append((new StringBuilder("<pixel>")).append(((String) (obj5))).append("</pixel>").toString());
        }
          goto _L10
        obj2 = "<toolbar > <item type=\"SystemItem\" ><action type=\"done\"/></item> <item type=\"Toggle\"> <subitem type=\"SystemItem\" > <action type=\"pause\"/> </subitem> <subitem type=\"SystemItem\" > <action type=\"resume\"/> </subitem> </item> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"Timer\"/> </toolbar>";
          goto _L11
    }

    private LinearLayout initToolbar(String s)
        throws ParserConfigurationException, SAXException, IOException
    {
        LinearLayout linearlayout = new LinearLayout(this);
        linearlayout.setId(VIEW_ID);
        linearlayout.setGravity(80);
        s = new VideoInterstitialControls(mVideoView, this, this, s, GUID);
        videoInterstitialControlsReference = new WeakReference(s);
        linearlayout.addView(s);
        s = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        s.addRule(12);
        linearlayout.setLayoutParams(s);
        return linearlayout;
    }

    private void manageProgressTrackingEvents(int i)
    {
_L2:
        return;
        if (progressTrackers == null || utils == null) goto _L2; else goto _L1
_L1:
        if (progressTrackers.size() <= 0) goto _L2; else goto _L3
_L3:
        int j = ((ProgressTracker)progressTrackers.get(0)).offset;
        if (i != j) goto _L2; else goto _L4
_L4:
        if (i != j) goto _L1; else goto _L5
_L5:
        Object obj = ((ProgressTracker)progressTrackers.get(0)).pixelUrls;
        if (obj == null) goto _L2; else goto _L6
_L6:
        obj = ((List) (obj)).iterator();
_L7:
label0:
        {
            if (((Iterator) (obj)).hasNext())
            {
                break label0;
            }
            progressTrackers.remove(0);
        }
          goto _L1
        String s = (String)((Iterator) (obj)).next();
        utils.firePixel(s);
          goto _L7
    }

    private void toggleToolbarMuteIcon()
    {
        if (videoInterstitialControlsReference == null) goto _L2; else goto _L1
_L1:
        VideoInterstitialControls videointerstitialcontrols = (VideoInterstitialControls)videoInterstitialControlsReference.get();
        if (videointerstitialcontrols == null || !(videointerstitialcontrols instanceof LinearLayout)) goto _L2; else goto _L3
_L3:
        int i = 0;
_L6:
        if (i < videointerstitialcontrols.getChildCount()) goto _L4; else goto _L2
_L2:
        return;
_L4:
        if (videointerstitialcontrols.getChildAt(i) instanceof ViewSwitcher)
        {
            ViewSwitcher viewswitcher = (ViewSwitcher)videointerstitialcontrols.getChildAt(i);
            VideoInterstitialControls.ToolbarButtonLayout toolbarbuttonlayout = (VideoInterstitialControls.ToolbarButtonLayout)viewswitcher.getCurrentView();
            VideoInterstitialControls.ToolbarButtonLayout toolbarbuttonlayout1 = (VideoInterstitialControls.ToolbarButtonLayout)viewswitcher.getNextView();
            if (toolbarbuttonlayout != null && toolbarbuttonlayout.eventType.equalsIgnoreCase("mute") && toolbarbuttonlayout1 != null && toolbarbuttonlayout1.eventType.equalsIgnoreCase("unmute"))
            {
                viewswitcher.showNext();
            }
        }
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void updateStateTrackers(AdMarvelXMLElement admarvelxmlelement, VideoStateEventTracking videostateeventtracking)
    {
        while (stateTrackers == null || admarvelxmlelement == null || !admarvelxmlelement.getChildren().containsKey("pixel")) 
        {
            return;
        }
        admarvelxmlelement = (ArrayList)admarvelxmlelement.getChildren().get("pixel");
        ArrayList arraylist = new ArrayList();
        arraylist.clear();
        int i = 0;
        do
        {
            if (i >= admarvelxmlelement.size())
            {
                stateTrackers.put(videostateeventtracking, arraylist);
                return;
            }
            arraylist.add(((AdMarvelXMLElement)admarvelxmlelement.get(i)).getData());
            i++;
        } while (true);
    }

    private void updateTimer(int i, TextView textview)
    {
        new String();
        int j = i / 60;
        int k = i % 60;
        Object obj;
        if (i == 0)
        {
            obj = " 00:00";
        } else
        {
            StringBuilder stringbuilder = new StringBuilder("-");
            if (j < 10)
            {
                obj = (new StringBuilder("0")).append(j).toString();
            } else
            {
                obj = Integer.valueOf(j);
            }
            stringbuilder = stringbuilder.append(obj).append(":");
            if (k < 10)
            {
                obj = (new StringBuilder("0")).append(k).toString();
            } else
            {
                obj = Integer.valueOf(k);
            }
            obj = stringbuilder.append(obj).toString();
        }
        if (textview != null)
        {
            if (textview.getVisibility() != 0)
            {
                textview.setVisibility(0);
            }
            textview.setText(((CharSequence) (obj)));
        }
    }

    private int valueInSeconds(long l)
    {
        return (int)l / 1000;
    }

    public void closeVideoInterstitial()
    {
        cleanup();
        manageStateTrackingEvents(VideoStateEventTracking.CLOSE);
        if (progressTrackers != null && progressTrackers.size() > 0)
        {
            progressTrackers.clear();
        }
        if (stateTrackers != null && stateTrackers.size() > 0)
        {
            stateTrackers.clear();
        }
        if (isInterstitial())
        {
            if (AdMarvelInterstitialAds.getListener() != null)
            {
                AdMarvelInterstitialAds.getListener().onCloseInterstitialAd();
                adCloseCount = adCloseCount + 1;
            }
            if (adCloseCount > 2)
            {
                finish();
                return;
            } else
            {
                finish();
                return;
            }
        } else
        {
            finish();
            return;
        }
    }

    public int getAdCloseCount()
    {
        return adCloseCount;
    }

    public Handler getHandler()
    {
        return handler;
    }

    public void handleToolbarButtonsAutoToggle(boolean flag)
    {
        if (videoInterstitialControlsReference == null) goto _L2; else goto _L1
_L1:
        VideoInterstitialControls videointerstitialcontrols = (VideoInterstitialControls)videoInterstitialControlsReference.get();
        if (videointerstitialcontrols == null || !(videointerstitialcontrols instanceof LinearLayout)) goto _L2; else goto _L3
_L3:
        int i = 0;
_L6:
        if (i < videointerstitialcontrols.getChildCount()) goto _L4; else goto _L2
_L2:
        return;
_L4:
        ViewSwitcher viewswitcher;
        VideoInterstitialControls.ToolbarButtonLayout toolbarbuttonlayout;
        if (videointerstitialcontrols.getChildAt(i) instanceof ViewSwitcher)
        {
            viewswitcher = (ViewSwitcher)videointerstitialcontrols.getChildAt(i);
            toolbarbuttonlayout = (VideoInterstitialControls.ToolbarButtonLayout)viewswitcher.getCurrentView();
            if (flag || toolbarbuttonlayout == null || !toolbarbuttonlayout.eventType.equalsIgnoreCase("pause"))
            {
                break; /* Loop/switch isn't completed */
            }
            if (viewswitcher.getDisplayedChild() == 0)
            {
                viewswitcher.showNext();
            } else
            {
                viewswitcher.showPrevious();
            }
        }
_L7:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        if (!flag && toolbarbuttonlayout != null && toolbarbuttonlayout.eventType.equalsIgnoreCase("stop"))
        {
            if (viewswitcher.getDisplayedChild() == 0)
            {
                viewswitcher.showNext();
            } else
            {
                viewswitcher.showPrevious();
            }
        } else
        if (flag && toolbarbuttonlayout != null && toolbarbuttonlayout.eventType.equalsIgnoreCase("replay"))
        {
            if (viewswitcher.getDisplayedChild() == 0)
            {
                viewswitcher.showNext();
            } else
            {
                viewswitcher.showPrevious();
            }
        } else
        if (flag && toolbarbuttonlayout != null && toolbarbuttonlayout.eventType.equalsIgnoreCase("resume"))
        {
            if (viewswitcher.getDisplayedChild() == 0)
            {
                viewswitcher.showNext();
            } else
            {
                viewswitcher.showPrevious();
            }
        }
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }

    boolean isInterstitial()
    {
        return interstitial;
    }

    public void manageStateTrackingEvents(VideoStateEventTracking videostateeventtracking)
    {
        if (stateTrackers != null) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if ((obj = (List)stateTrackers.get(videostateeventtracking)) == null || utils == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((List) (obj)).iterator();
_L4:
label0:
        {
            if (((Iterator) (obj)).hasNext())
            {
                break label0;
            }
            if (videostateeventtracking == VideoStateEventTracking.START || videostateeventtracking == VideoStateEventTracking.COMPLETE)
            {
                stateTrackers.remove(videostateeventtracking);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        String s = (String)((Iterator) (obj)).next();
        utils.firePixel(s);
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void manageTrackingUrl(List list)
    {
        if (list != null && utils != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                String s = (String)list.next();
                utils.firePixel(s);
            }
        }
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        boolean flag;
        videoState = VideoPlayerState.Finished;
        manageStateTrackingEvents(VideoStateEventTracking.COMPLETE);
        cleanup();
        mediaplayer = (LinearLayout)findViewById(VIEW_ID);
        Logging.log("Video onCompletion is called");
        if (isPosterAvailable && mPosterView != null)
        {
            if (posterStates != null && posterStates.size() > 0)
            {
                if (posterStates.contains(VideoPlayerState.Stopped))
                {
                    mPosterView.setVisibility(0);
                }
            } else
            {
                mPosterView.setVisibility(0);
            }
        }
        if (mVideoView != null)
        {
            mVideoView.setVisibility(4);
        }
        if (isToolbar && mediaplayer != null && mediaplayer.getVisibility() != 0)
        {
            animateView(mediaplayer, true);
            mediaplayer.setVisibility(0);
            mediaplayer.bringToFront();
            mediaplayer.requestLayout();
        }
        if (videoDuration > 0 && timerText != null && timerText.getVisibility() == 0)
        {
            updateTimer(0, timerText);
        }
        handleToolbarButtonsAutoToggle(false);
        if (videoInterstitialControlsReference == null) goto _L2; else goto _L1
_L1:
        mediaplayer = (VideoInterstitialControls)videoInterstitialControlsReference.get();
        if (mediaplayer == null) goto _L2; else goto _L3
_L3:
        flag = mediaplayer.isCloseEnabled();
_L5:
        if (!isToolbar || !flag || isForceQuit)
        {
            if (mVideoView != null)
            {
                mVideoView.release(true);
            }
            closeVideoInterstitial();
        }
        return;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void onCreate(Bundle bundle)
    {
        Object obj;
        int i;
        super.onCreate(bundle);
        Object obj1;
        android.widget.RelativeLayout.LayoutParams layoutparams;
        if (Build.MODEL.contains("Kindle") || Build.PRODUCT.contains("Kindle"))
        {
            getWindow().addFlags(256);
            getWindow().clearFlags(1024);
        } else
        {
            getWindow().setFlags(512, 512);
        }
        if (Version.getAndroidSDKVersion() >= 11)
        {
            HardwareAccelerationManager.enable(this);
        }
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.getBoolean("isCustomUrl"))
            {
                xml = generateXml(bundle.getString("url"));
                GUID = bundle.getString("GUID");
                interstitial = false;
            } else
            if (bundle.containsKey("html"))
            {
                xml = bundle.getString("html");
                GUID = bundle.getString("GUID");
                if (xml != null && xml.length() > 0)
                {
                    interstitial = true;
                } else
                {
                    interstitial = false;
                }
            } else
            {
                finish();
            }
        }
        videoState = VideoPlayerState.Loading;
        bundle = new RelativeLayout(this);
        bundle.setId(LAYOUT_VIEW_ID);
        bundle.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        setContentView(bundle);
        obj = new LinearLayout(this);
        ((LinearLayout) (obj)).setId(VIDEO_VIEW_ID);
        obj1 = new android.widget.LinearLayout.LayoutParams(-1, -1);
        obj1.weight = 10F;
        ((LinearLayout) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        ((LinearLayout) (obj)).setOnTouchListener(admarvelVideoLayoutTouchListener);
        ((LinearLayout) (obj)).setBackgroundColor(0xff000000);
        obj1 = new RelativeLayout(this);
        ((RelativeLayout) (obj1)).setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        ((LinearLayout) (obj)).addView(((View) (obj1)));
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutparams.addRule(13);
        mVideoView = new AdMarvelVideoView(this, this);
        mVideoView.setLayoutParams(layoutparams);
        mVideoView.setListener(this);
        ((RelativeLayout) (obj1)).addView(mVideoView);
        handler = new Handler();
        utils = new Utils(this, handler);
        try
        {
            parseHtml(xml);
        }
        catch (Exception exception)
        {
            try
            {
                exception.printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                bundle.printStackTrace();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                bundle.printStackTrace();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                bundle.printStackTrace();
                return;
            }
        }
        if (isToolbar)
        {
            mtoolbar = initToolbar(xml);
            mtoolbar.setVisibility(8);
        }
        bundle.addView(((View) (obj)));
        if (videoUrl == null) goto _L2; else goto _L1
_L1:
        i = videoUrl.length();
        if (i <= 0) goto _L2; else goto _L3
_L3:
        mVideoView.setVideoURI(Uri.parse(videoUrl));
_L19:
        mVideoView.setOnCompletionListener(this);
        mVideoView.setOnPreparedListener(this);
        mVideoView.setOnErrorListener(this);
        mVideoView.requestFocus();
        if (interstitial && AdMarvelInterstitialAds.getListener() != null)
        {
            AdMarvelInterstitialAds.getListener().onAdMarvelVideoActivityLaunched(this);
        }
        if (!isPosterAvailable || posterUrl == null || posterUrl.length() <= 0) goto _L5; else goto _L4
_L4:
        mPosterView = new ImageView(this);
        obj = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(13);
        mPosterView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        if (Version.getAndroidSDKVersion() < 11) goto _L7; else goto _L6
_L6:
        handler.post(new DownloadImageTaskPostAPI11(mPosterView, posterUrl));
_L20:
        if (posterStates == null || posterStates.size() <= 0) goto _L9; else goto _L8
_L8:
        if (!posterStates.contains(VideoPlayerState.Loading)) goto _L11; else goto _L10
_L10:
        mPosterView.setVisibility(0);
_L21:
        bundle.addView(mPosterView);
_L5:
        if (isToolbar && mtoolbar != null)
        {
            bundle.addView(mtoolbar);
        }
        if (showSkipMessage)
        {
            skipMessageLayout = new RelativeLayout(this);
            obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(11);
            skipMessageLayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            skipMessageLayout.setBackgroundColor(0);
            obj = new TextView(this);
            obj1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
            ((TextView) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
            ((TextView) (obj)).setTypeface(Typeface.DEFAULT_BOLD);
            skipMessageLayout.addView(((View) (obj)));
            skipMessageLayout.setVisibility(4);
            bundle.addView(skipMessageLayout);
        }
        if (!isDelayDisplayDoneButton || delayForDoneButtonDisplay <= 0 || videoInterstitialControlsReference == null) goto _L13; else goto _L12
_L12:
        obj = (VideoInterstitialControls)videoInterstitialControlsReference.get();
        if (obj == null) goto _L13; else goto _L14
_L14:
        if (!(obj instanceof LinearLayout) || obj == null) goto _L13; else goto _L15
_L15:
        if (!isToolbar) goto _L13; else goto _L16
_L16:
        i = 0;
_L22:
        if (i < ((LinearLayout) (obj)).getChildCount()) goto _L18; else goto _L17
_L17:
        delayTimer = new UITimer(handler, DelayRunnable, delayForDoneButtonDisplay * 1000);
        delayTimer.start();
        if (showSkipMessage && skipTextTimer == null)
        {
            skipMessageInitialTime = System.currentTimeMillis();
            skipTextTimer = new UITimer(handler, SkipTextRunnable, 500, false);
            skipTextTimer.start();
        }
_L13:
        bundle.setOnTouchListener(admarvelVideoTouchListener);
        startDialog("Loading Video...");
        bundle = new IntentFilter("android.intent.action.SCREEN_ON");
        bundle.addAction("android.intent.action.SCREEN_OFF");
        mReceiver = new ScreenReceiver();
        registerReceiver(mReceiver, bundle);
        return;
        obj;
        ((Exception) (obj)).printStackTrace();
        finish();
          goto _L19
_L2:
        finish();
          goto _L19
_L7:
        (new DownloadImageTask(mPosterView)).execute(new String[] {
            posterUrl
        });
          goto _L20
_L11:
        mPosterView.setVisibility(4);
          goto _L21
_L9:
        mPosterView.setVisibility(0);
          goto _L21
_L18:
        Object obj2;
        if (!(((LinearLayout) (obj)).getChildAt(i) instanceof VideoInterstitialControls.ToolbarButtonLayout))
        {
            break MISSING_BLOCK_LABEL_1261;
        }
        obj2 = (VideoInterstitialControls.ToolbarButtonLayout)((LinearLayout) (obj)).getChildAt(i);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_1261;
        }
        if (!((VideoInterstitialControls.ToolbarButtonLayout) (obj2)).eventType.equalsIgnoreCase("done"))
        {
            break MISSING_BLOCK_LABEL_1261;
        }
        ((VideoInterstitialControls.ToolbarButtonLayout) (obj2)).setClickable(false);
        ((VideoInterstitialControls.ToolbarButtonLayout) (obj2)).setEnabled(false);
        if (!(((VideoInterstitialControls.ToolbarButtonLayout) (obj2)).getChildAt(0) instanceof ImageView))
        {
            break MISSING_BLOCK_LABEL_1261;
        }
        obj2 = (ImageView)((VideoInterstitialControls.ToolbarButtonLayout) (obj2)).getChildAt(0);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_1214;
        }
        if (((ImageView) (obj2)).getDrawable() != null)
        {
            ((ImageView) (obj2)).getDrawable().setAlpha(25);
            break MISSING_BLOCK_LABEL_1261;
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_1261;
        }
        if (setCloseAlphaTimer == null)
        {
            obj2 = new CloseButtonSetAlphaRunnable(((ImageView) (obj2)));
            setCloseAlphaTimer = new UITimer(handler, ((Runnable) (obj2)), 1000);
            setCloseAlphaTimer.start();
        }
        i++;
          goto _L22
    }

    protected void onDestroy()
    {
        super.onDestroy();
        cleanup();
        if (mReceiver != null)
        {
            unregisterReceiver(mReceiver);
            mReceiver = null;
        }
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        handleToolbarButtonsAutoToggle(false);
        videoState = VideoPlayerState.Finished;
        LinearLayout linearlayout = (LinearLayout)findViewById(VIEW_ID);
        if (isToolbar && linearlayout != null && linearlayout.getVisibility() != 0)
        {
            animateView(linearlayout, true);
            linearlayout.setVisibility(0);
        }
        if (mediaplayer != null)
        {
            mediaplayer.reset();
            mediaplayer.release();
        }
        return false;
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (keyevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 4 4: default 28
    //                   4 35;
           goto _L2 _L3
_L2:
        return super.onKeyDown(i, keyevent);
_L3:
        if (videoInterstitialControlsReference == null) goto _L5; else goto _L4
_L4:
        keyevent = (VideoInterstitialControls)videoInterstitialControlsReference.get();
        if (keyevent == null) goto _L5; else goto _L6
_L6:
        boolean flag = keyevent.isCloseEnabled();
_L8:
        if (!isToolbar || !flag || !isDelayDisplayDoneButton)
        {
            closeVideoInterstitial();
        }
        return true;
_L5:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void onLoadingFinish()
    {
        if (handler != null)
        {
            handler.post(CloseDialogRunnable);
        }
        if (counterTimer != null && !isPlayingNextVideo && videoState != VideoPlayerState.Finished && videoState != VideoPlayerState.Stopped)
        {
            counterTimer.start();
        }
        if (isPosterAvailable && mPosterView != null && mPosterView.getVisibility() == 0)
        {
            mPosterView.setVisibility(4);
        }
    }

    public void onNetworkUnavailable()
    {
        if (handler != null)
        {
            handler.post(CloseDialogRunnable);
        }
        Toast.makeText(this, "Network Connection Unavailable", 0).show();
    }

    protected void onPause()
    {
        super.onPause();
        if (isFinishing()) goto _L2; else goto _L1
_L1:
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).start();
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: start");
        }
        catch (Exception exception) { }
        Logging.log("Video Activity onPause is called");
        if (videoState != VideoPlayerState.Playing) goto _L4; else goto _L3
_L3:
        if (mVideoView != null)
        {
            if (enablePlayingVideoOnScreenLock)
            {
                mVideoView.updateCurrentPosition();
                keepPlayingVideoOnScreenLock = true;
                videoState = VideoPlayerState.PausedBySystem;
            } else
            if (quitVideoWhenBackgrounded)
            {
                mVideoView.updateCurrentPosition();
                pauseVideoOnScreenLock = true;
                videoState = VideoPlayerState.PausedBySystem;
            } else
            {
                mVideoView.pause();
                videoState = VideoPlayerState.Paused;
            }
        }
_L2:
        if (autoToggleTimer != null && autoToggleTimer.isEnabled())
        {
            autoToggleTimer.stop();
        }
        return;
_L4:
        if ((videoState == VideoPlayerState.Stopped || videoState == VideoPlayerState.Finished) && mVideoView != null && !mVideoView.isPlaying())
        {
            mVideoView.release(true);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        if (progressDialogReference == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        mediaplayer = (AdMarvelProgressDialog)progressDialogReference.get();
        if (mediaplayer != null)
        {
            try
            {
                if (mediaplayer.isShowing())
                {
                    mediaplayer.dismiss();
                }
            }
            // Misplaced declaration of an exception variable
            catch (MediaPlayer mediaplayer)
            {
                Logging.log(Log.getStackTraceString(mediaplayer));
            }
        }
        if (isToggleToolbar)
        {
            if (autoToggleTimer == null)
            {
                autoToggleTimer = new UITimer(handler, AutoToggleRunnable, 3100, true);
            }
            mediaplayer = (LinearLayout)findViewById(VIEW_ID);
            if (isToolbar && mediaplayer != null && mediaplayer.getVisibility() == 0)
            {
                autoToggleTimer.start();
                lastInteractionTime = System.currentTimeMillis();
            }
        }
        if (videoVolumeState == VideoVolumeState.Mute)
        {
            mVideoView.mute();
        }
        if (isVideoInitialMute)
        {
            if (canMuteVideo())
            {
                mVideoView.mute();
                videoVolumeState = VideoVolumeState.Mute;
                toggleToolbarMuteIcon();
            }
            isVideoInitialMute = false;
        }
        handleToolbarButtonsAutoToggle(true);
        if (mVideoView != null)
        {
            playVideo(mVideoView);
            manageStateTrackingEvents(VideoStateEventTracking.START);
        }
        return;
    }

    protected void onResume()
    {
        super.onResume();
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).start();
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: start");
        }
        catch (Exception exception) { }
        if (mVideoView != null && (videoState == VideoPlayerState.Paused || !mVideoView.isPlaying() && videoState == VideoPlayerState.PausedBySystem))
        {
            startDialog("Resuming Video...");
            mVideoView.resumeVideoIfPaused();
            if (autoToggleTimer != null)
            {
                autoToggleTimer.start();
            }
        }
        keepPlayingVideoOnScreenLock = false;
        launchingInAppBrowser = false;
    }

    protected void onStart()
    {
        super.onStart();
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).start();
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: start");
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    protected void onStop()
    {
        super.onStop();
        Object obj;
        PowerManager powermanager;
        StringBuilder stringbuilder;
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).start();
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: start");
        }
        catch (Exception exception) { }
        Logging.log("Video Activity onStop is called");
        if (mVideoView != null && !mVideoView.isPlaying() && videoState == VideoPlayerState.PausedBySystem && !quitVideoWhenBackgrounded)
        {
            manageStateTrackingEvents(VideoStateEventTracking.PAUSE);
        }
        powermanager = (PowerManager)getSystemService("power");
        stringbuilder = new StringBuilder("Video Activity onStop isScreenOn: ");
        if (powermanager != null)
        {
            obj = Boolean.valueOf(powermanager.isScreenOn());
        } else
        {
            obj = "powermanager null";
        }
        Logging.log(stringbuilder.append(obj).toString());
        if (isFinishing() || !keepPlayingVideoOnScreenLock || videoState != VideoPlayerState.PausedBySystem || mVideoView == null || !mVideoView.isPlaying() || powermanager == null || powermanager.isScreenOn()) goto _L2; else goto _L1
_L1:
        videoState = VideoPlayerState.Playing;
        keepPlayingVideoOnScreenLock = false;
_L4:
        if (counterTimer != null && (!enablePlayingVideoOnScreenLock || !mVideoView.isPlaying() || powermanager.isScreenOn()))
        {
            counterTimer.stop();
        }
        return;
_L2:
        if (!isFinishing() && quitVideoWhenBackgrounded && !launchingInAppBrowser)
        {
            closeVideoInterstitial();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onUserInteraction()
    {
label0:
        {
            LinearLayout linearlayout = (LinearLayout)findViewById(VIEW_ID);
            if (isToolbar && linearlayout != null)
            {
                if (linearlayout.getVisibility() != 0)
                {
                    break label0;
                }
                lastInteractionTime = System.currentTimeMillis();
                if (autoToggleTimer != null && autoToggleTimer.isEnabled())
                {
                    autoToggleTimer.stop();
                    autoToggleTimer.start();
                }
            }
            return;
        }
        toolbarDisplayToggle(true);
    }

    public void onVideoPause()
    {
        manageStateTrackingEvents(VideoStateEventTracking.PAUSE);
    }

    public void onVideoResume()
    {
        manageStateTrackingEvents(VideoStateEventTracking.RESUME);
        videoState = VideoPlayerState.Playing;
    }

    public void onVideoStop()
    {
        manageStateTrackingEvents(VideoStateEventTracking.STOP);
        if (counterTimer != null)
        {
            counterTimer.stop();
        }
        if (autoToggleTimer != null)
        {
            autoToggleTimer.stop();
        }
        LinearLayout linearlayout;
        if (isPosterAvailable && mPosterView != null)
        {
            if (posterStates != null && posterStates.size() > 0)
            {
                if (posterStates.contains(VideoPlayerState.Stopped))
                {
                    mPosterView.setVisibility(0);
                }
            } else
            {
                mPosterView.setVisibility(0);
            }
        }
        if (mVideoView != null)
        {
            mVideoView.setVisibility(4);
        }
        linearlayout = (LinearLayout)findViewById(VIEW_ID);
        if (isToolbar && linearlayout != null && linearlayout.getVisibility() != 0)
        {
            animateView(linearlayout, true);
            linearlayout.setVisibility(0);
            linearlayout.bringToFront();
            linearlayout.requestLayout();
        }
        if (videoDuration > 0 && timerText != null && timerText.getVisibility() == 0)
        {
            updateTimer(0, timerText);
        }
        handleToolbarButtonsAutoToggle(false);
    }

    public void onVideoTouch()
    {
    }

    public void parseHtml(String s)
        throws ParserConfigurationException, SAXException, IOException
    {
        Object obj;
        int i;
        xmlReader = new AdMarvelXMLReader();
        xmlReader.parseXMLString(s);
        adXMLElement = xmlReader.getParsedXMLData();
        if (adXMLElement.getChildren().containsKey("video"))
        {
            s = (AdMarvelXMLElement)((ArrayList)adXMLElement.getChildren().get("video")).get(0);
            if (s != null)
            {
                videoUrl = redirectURLCheck(s.getData());
                obj = (String)s.getAttributes().get("forcequit");
                if (obj != null && ((String) (obj)).equalsIgnoreCase("YES"))
                {
                    isForceQuit = true;
                }
                obj = (String)s.getAttributes().get("duration");
                if (obj != null && Integer.parseInt(((String) (obj))) > 0)
                {
                    videoDuration = Integer.parseInt(((String) (obj)));
                }
                obj = (String)s.getAttributes().get("lockOrientation");
                if (obj != null)
                {
                    if (((String) (obj)).equalsIgnoreCase("LandscapeLeft"))
                    {
                        setRequestedOrientation(0);
                    } else
                    if (((String) (obj)).equalsIgnoreCase("Portrait"))
                    {
                        setRequestedOrientation(1);
                    } else
                    if (Version.getAndroidSDKVersion() >= 11)
                    {
                        LockOrientationPostAPI9.setOrientation(this, ((String) (obj)));
                    }
                }
                obj = (String)s.getAttributes().get("initialMute");
                if (obj != null && ((String) (obj)).equalsIgnoreCase("YES"))
                {
                    isVideoInitialMute = true;
                }
                obj = (String)s.getAttributes().get("enableVideoPlayOnScreenLock");
                if (obj != null && ((String) (obj)).equalsIgnoreCase("YES"))
                {
                    enablePlayingVideoOnScreenLock = true;
                }
                s = (String)s.getAttributes().get("quitVideoInBackground");
                if (s != null && s.equalsIgnoreCase("YES"))
                {
                    quitVideoWhenBackgrounded = true;
                }
            }
        }
        if (!adXMLElement.getChildren().containsKey("loadingimage")) goto _L2; else goto _L1
_L1:
        s = (AdMarvelXMLElement)((ArrayList)adXMLElement.getChildren().get("loadingimage")).get(0);
        if (s == null) goto _L2; else goto _L3
_L3:
        posterUrl = s.getData();
        isPosterAvailable = true;
        s = (String)s.getAttributes().get("displayEvent");
        if (s == null) goto _L2; else goto _L4
_L4:
        s = s.split(",");
        if (s == null || s.length <= 0) goto _L2; else goto _L5
_L5:
        posterStates = new ArrayList();
        i = 0;
_L11:
        if (i < s.length) goto _L6; else goto _L2
_L2:
        if (adXMLElement.getChildren().containsKey("toolbar"))
        {
            obj = (AdMarvelXMLElement)((ArrayList)adXMLElement.getChildren().get("toolbar")).get(0);
            if (obj == null)
            {
                s = null;
            } else
            {
                s = (String)((AdMarvelXMLElement) (obj)).getAttributes().get("initiallyVisible");
            }
            if (s != null && s.equalsIgnoreCase("YES"))
            {
                isToolbarVisible = true;
            }
            if (obj == null)
            {
                s = null;
            } else
            {
                s = (String)((AdMarvelXMLElement) (obj)).getAttributes().get("toggleToolbar");
            }
            if (s != null && s.equalsIgnoreCase("NO"))
            {
                isToggleToolbar = false;
            }
            if (obj == null)
            {
                s = null;
            } else
            {
                s = (String)((AdMarvelXMLElement) (obj)).getAttributes().get("delayDisplayDoneButton");
            }
            if (s != null)
            {
                isDelayDisplayDoneButton = true;
                showSkipMessage = true;
                delayForDoneButtonDisplay = Integer.parseInt(s);
                s = (String)((AdMarvelXMLElement) (obj)).getAttributes().get("showSkipMessage");
                if (s != null && s.equalsIgnoreCase("NO"))
                {
                    showSkipMessage = false;
                }
                s = (String)((AdMarvelXMLElement) (obj)).getAttributes().get("skipText");
                if (s != null && s.length() > 0 && s.contains("@seconds"))
                {
                    skipText = s;
                }
            }
            if (obj != null && ((AdMarvelXMLElement) (obj)).getChildren().containsKey("item") && ((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("item")).size() > 0)
            {
                isToolbar = true;
            }
        }
        if (!adXMLElement.getChildren().containsKey("videoTrackingEvents")) goto _L8; else goto _L7
_L7:
        progressTrackers = new ArrayList();
        stateTrackers = new HashMap();
        s = (AdMarvelXMLElement)((ArrayList)adXMLElement.getChildren().get("videoTrackingEvents")).get(0);
        if (s == null || !s.getChildren().containsKey("videoTracking")) goto _L8; else goto _L9
_L9:
        s = (ArrayList)s.getChildren().get("videoTracking");
        i = 0;
_L19:
        if (i < s.size()) goto _L10; else goto _L8
_L8:
        return;
_L6:
        if (s[i].equalsIgnoreCase("loading"))
        {
            posterStates.add(VideoPlayerState.Loading);
        } else
        if (s[i].equalsIgnoreCase("complete"))
        {
            posterStates.add(VideoPlayerState.Stopped);
            posterStates.add(VideoPlayerState.Finished);
        }
        i++;
          goto _L11
_L10:
        Object obj1;
        obj = (AdMarvelXMLElement)s.get(i);
        obj1 = (String)((AdMarvelXMLElement) (obj)).getAttributes().get("event");
        if (!"progress".equalsIgnoreCase(((String) (obj1)))) goto _L13; else goto _L12
_L12:
        obj1 = (String)((AdMarvelXMLElement) (obj)).getAttributes().get("offset");
        if (obj1 == null) goto _L15; else goto _L14
_L14:
        int l;
        int j;
        if (((String) (obj1)).endsWith("%"))
        {
            obj1 = ((String) (obj1)).replace("%", "");
            j = videoDuration;
            j = (Integer.parseInt(((String) (obj1))) * j) / 100;
        } else
        {
            j = Integer.parseInt(((String) (obj1)));
        }
        obj = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("pixels")).get(0);
        if (obj == null || !((AdMarvelXMLElement) (obj)).getChildren().containsKey("pixel")) goto _L15; else goto _L16
_L16:
        obj = (ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("pixel");
        obj1 = new ArrayList();
        ((List) (obj1)).clear();
        l = 0;
_L20:
        if (l < ((ArrayList) (obj)).size()) goto _L18; else goto _L17
_L17:
        progressTrackers.add(new ProgressTracker(j, ((List) (obj1))));
_L15:
        i++;
          goto _L19
_L18:
        ((List) (obj1)).add(((AdMarvelXMLElement)((ArrayList) (obj)).get(l)).getData());
        l++;
          goto _L20
_L13:
        if (!"firstQuartile".equalsIgnoreCase(((String) (obj1))) || videoDuration <= 0)
        {
            break MISSING_BLOCK_LABEL_1293;
        }
        l = videoDuration / 4;
        if (l <= 0) goto _L15; else goto _L21
_L21:
        obj = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("pixels")).get(0);
        if (obj == null || !((AdMarvelXMLElement) (obj)).getChildren().containsKey("pixel")) goto _L15; else goto _L22
_L22:
        int k;
        obj = (ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("pixel");
        obj1 = new ArrayList();
        ((List) (obj1)).clear();
        k = 0;
_L23:
label0:
        {
            if (k < ((ArrayList) (obj)).size())
            {
                break label0;
            }
            progressTrackers.add(new ProgressTracker(l, ((List) (obj1))));
        }
          goto _L15
        ((List) (obj1)).add(((AdMarvelXMLElement)((ArrayList) (obj)).get(k)).getData());
        k++;
          goto _L23
        if (!"midpoint".equalsIgnoreCase(((String) (obj1))) || videoDuration <= 0)
        {
            break MISSING_BLOCK_LABEL_1453;
        }
        l = videoDuration / 2;
        if (l <= 0) goto _L15; else goto _L24
_L24:
        obj = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("pixels")).get(0);
        if (obj == null || !((AdMarvelXMLElement) (obj)).getChildren().containsKey("pixel")) goto _L15; else goto _L25
_L25:
        obj = (ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("pixel");
        obj1 = new ArrayList();
        ((List) (obj1)).clear();
        k = 0;
_L26:
label1:
        {
            if (k < ((ArrayList) (obj)).size())
            {
                break label1;
            }
            progressTrackers.add(new ProgressTracker(l, ((List) (obj1))));
        }
          goto _L15
        ((List) (obj1)).add(((AdMarvelXMLElement)((ArrayList) (obj)).get(k)).getData());
        k++;
          goto _L26
        if (!"thirdQuartile".equalsIgnoreCase(((String) (obj1))) || videoDuration <= 0)
        {
            break MISSING_BLOCK_LABEL_1615;
        }
        l = (videoDuration / 4) * 3;
        if (l <= 0) goto _L15; else goto _L27
_L27:
        obj = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("pixels")).get(0);
        if (obj == null || !((AdMarvelXMLElement) (obj)).getChildren().containsKey("pixel")) goto _L15; else goto _L28
_L28:
        obj = (ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("pixel");
        obj1 = new ArrayList();
        ((List) (obj1)).clear();
        k = 0;
_L29:
label2:
        {
            if (k < ((ArrayList) (obj)).size())
            {
                break label2;
            }
            progressTrackers.add(new ProgressTracker(l, ((List) (obj1))));
        }
          goto _L15
        ((List) (obj1)).add(((AdMarvelXMLElement)((ArrayList) (obj)).get(k)).getData());
        k++;
          goto _L29
        if ("start".equalsIgnoreCase(((String) (obj1))))
        {
            updateStateTrackers((AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("pixels")).get(0), VideoStateEventTracking.START);
        } else
        if ("complete".equalsIgnoreCase(((String) (obj1))))
        {
            updateStateTrackers((AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("pixels")).get(0), VideoStateEventTracking.COMPLETE);
        } else
        if ("pause".equalsIgnoreCase(((String) (obj1))))
        {
            updateStateTrackers((AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("pixels")).get(0), VideoStateEventTracking.PAUSE);
        } else
        if ("resume".equalsIgnoreCase(((String) (obj1))))
        {
            updateStateTrackers((AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("pixels")).get(0), VideoStateEventTracking.RESUME);
        } else
        if ("close".equalsIgnoreCase(((String) (obj1))))
        {
            updateStateTrackers((AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("pixels")).get(0), VideoStateEventTracking.CLOSE);
        } else
        if ("stop".equalsIgnoreCase(((String) (obj1))))
        {
            updateStateTrackers((AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement) (obj)).getChildren().get("pixels")).get(0), VideoStateEventTracking.STOP);
        }
          goto _L15
    }

    public void pauseVideo(boolean flag)
    {
        while (mVideoView == null || videoState != VideoPlayerState.Playing) 
        {
            return;
        }
        mVideoView.pause();
        if (flag)
        {
            videoState = VideoPlayerState.PausedByToolbar;
            return;
        } else
        {
            videoState = VideoPlayerState.Paused;
            return;
        }
    }

    public void playNextVideo(String s)
    {
        Object obj;
        if (mVideoView == null)
        {
            return;
        }
        if (mVideoView.isPlaying())
        {
            mVideoView.stopPlayback();
            videoState = VideoPlayerState.Stopped;
        }
        if (mVideoView.getVisibility() != 0)
        {
            mVideoView.setVisibility(0);
            mVideoView.requestFocus();
        }
        if (isPosterAvailable && mPosterView != null)
        {
            if (posterStates != null && posterStates.size() > 0)
            {
                if (posterStates.contains(VideoPlayerState.Loading))
                {
                    mPosterView.setVisibility(0);
                }
            } else
            {
                mPosterView.setVisibility(0);
            }
        }
        if (progressTrackers != null && progressTrackers.size() > 0)
        {
            progressTrackers.clear();
        }
        if (stateTrackers == null || stateTrackers.size() <= 0) goto _L2; else goto _L1
_L1:
        obj = new HashMap();
        ((Map) (obj)).putAll(stateTrackers);
        obj = ((Map) (obj)).keySet().iterator();
_L5:
        if (((Iterator) (obj)).hasNext()) goto _L3; else goto _L2
_L2:
        startDialog("Loading Next Video...");
        if (isForceQuit)
        {
            isForceQuit = false;
        }
        isPlayingNextVideo = true;
        if (timerText != null)
        {
            timerText.setVisibility(4);
        }
        mVideoView.setVideoURI(Uri.parse(s));
        mVideoView.requestFocus();
        videoState = VideoPlayerState.Loading;
        return;
_L3:
        VideoStateEventTracking videostateeventtracking = (VideoStateEventTracking)((Iterator) (obj)).next();
        if (videostateeventtracking != VideoStateEventTracking.CLOSE)
        {
            stateTrackers.remove(videostateeventtracking);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void playVideo(AdMarvelVideoView admarvelvideoview)
    {
        if (admarvelvideoview.getVisibility() != 0)
        {
            admarvelvideoview.setVisibility(0);
        }
        if (isPosterAvailable && mPosterView != null && mPosterView.getVisibility() == 0)
        {
            mPosterView.setVisibility(4);
        }
        if (videoDuration <= 0 || isPlayingNextVideo) goto _L2; else goto _L1
_L1:
        Object obj = (LinearLayout)findViewById(VIEW_ID);
        if (obj != null && isToolbar && timerText == null)
        {
            obj = (RelativeLayout)((LinearLayout) (obj)).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("TIMER_BUTTON_LAYOUT").toString());
            if (obj != null)
            {
                timerText = (TextView)((RelativeLayout) (obj)).getChildAt(0);
            }
        }
        if (progressTrackers != null && progressTrackers.size() > 0)
        {
            Collections.sort(progressTrackers, new Comparator() {

                final AdMarvelVideoActivity this$0;

                public int compare(ProgressTracker progresstracker, ProgressTracker progresstracker1)
                {
                    return progresstracker.offset - progresstracker1.offset;
                }

                public volatile int compare(Object obj1, Object obj2)
                {
                    return compare((ProgressTracker)obj1, (ProgressTracker)obj2);
                }

            
            {
                this$0 = AdMarvelVideoActivity.this;
                super();
            }
            });
        }
        if (counterTimer != null) goto _L4; else goto _L3
_L3:
        counterTimer = new UITimer(handler, CounterRunnable, 500);
        counterTimer.start();
_L2:
        admarvelvideoview.start();
        videoState = VideoPlayerState.Playing;
        return;
_L4:
        if (!counterTimer.isEnabled())
        {
            counterTimer.start();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    String redirectURLCheck(String s)
    {
        Object obj;
        Object obj1;
        obj1 = s;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        obj1 = s;
        if (s.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        obj = s;
_L1:
        HttpURLConnection httpurlconnection;
        int i;
        obj1 = new Utils(this, handler);
        httpurlconnection = (HttpURLConnection)(new URL(((String) (obj)))).openConnection();
        httpurlconnection.setRequestMethod("GET");
        httpurlconnection.setDoInput(true);
        httpurlconnection.setUseCaches(false);
        httpurlconnection.setRequestProperty("User-Agent", ((Utils) (obj1)).getUserAgent());
        httpurlconnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpurlconnection.setRequestProperty("Content-Length", "0");
        httpurlconnection.setConnectTimeout(4000);
        httpurlconnection.setReadTimeout(5000);
        httpurlconnection.setInstanceFollowRedirects(false);
        httpurlconnection.connect();
        i = httpurlconnection.getResponseCode();
        if (i != 301 && i != 302)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        obj1 = httpurlconnection.getHeaderField("Location");
        obj = obj1;
          goto _L1
        obj1;
        obj1 = s;
        if (obj != null)
        {
            obj1 = s;
            if (((String) (obj)).length() > 0)
            {
                obj1 = obj;
            }
        }
        return ((String) (obj1));
    }

    public void replayVideo()
    {
        Object obj;
        while (mVideoView == null || videoState != VideoPlayerState.Finished && videoState != VideoPlayerState.Stopped && videoState != VideoPlayerState.Paused && videoState != VideoPlayerState.PausedByToolbar) 
        {
            return;
        }
        if (videoState == VideoPlayerState.Paused || videoState == VideoPlayerState.PausedByToolbar)
        {
            mVideoView.stopPlayback();
            videoState = VideoPlayerState.Stopped;
        }
        if (mVideoView.getVisibility() != 0)
        {
            mVideoView.setVisibility(0);
        }
        if (isPosterAvailable && mPosterView != null)
        {
            if (posterStates != null && posterStates.size() > 0)
            {
                if (posterStates.contains(VideoPlayerState.Loading))
                {
                    mPosterView.setVisibility(0);
                }
            } else
            {
                mPosterView.setVisibility(0);
            }
        }
        if (progressTrackers != null && progressTrackers.size() > 0)
        {
            progressTrackers.clear();
        }
        if (stateTrackers == null || stateTrackers.size() <= 0) goto _L2; else goto _L1
_L1:
        obj = new HashMap();
        ((Map) (obj)).putAll(stateTrackers);
        obj = ((Map) (obj)).keySet().iterator();
_L5:
        if (((Iterator) (obj)).hasNext()) goto _L3; else goto _L2
_L2:
        if (isForceQuit)
        {
            isForceQuit = false;
        }
        startDialog("Replaying Video...");
        if (videoUrl != null && videoUrl.length() > 0)
        {
            mVideoView.setVideoURI(Uri.parse(videoUrl));
            videoState = VideoPlayerState.Loading;
        }
        isPlayingNextVideo = false;
        mVideoView.requestFocus();
        return;
_L3:
        VideoStateEventTracking videostateeventtracking = (VideoStateEventTracking)((Iterator) (obj)).next();
        if (videostateeventtracking != VideoStateEventTracking.CLOSE)
        {
            stateTrackers.remove(videostateeventtracking);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void resumeVideo()
    {
        if (mVideoView != null)
        {
            if (videoState == VideoPlayerState.PausedByToolbar || videoState == VideoPlayerState.Paused)
            {
                startDialog("Resuming Video...");
                mVideoView.resumeVideoIfPaused();
                videoState = VideoPlayerState.Playing;
                return;
            }
            if (videoState == VideoPlayerState.Stopped || videoState == VideoPlayerState.Finished)
            {
                replayVideo();
                return;
            }
        }
    }

    public void startDialog(String s)
    {
        if (progressDialogReference == null)
        {
            AdMarvelProgressDialog admarvelprogressdialog = new AdMarvelProgressDialog(this, this);
            admarvelprogressdialog.setMessage(s);
            admarvelprogressdialog.show();
            progressDialogReference = new WeakReference(admarvelprogressdialog);
            return;
        }
        AdMarvelProgressDialog admarvelprogressdialog1 = (AdMarvelProgressDialog)progressDialogReference.get();
        if (admarvelprogressdialog1 != null)
        {
            admarvelprogressdialog1.setMessage(s);
            admarvelprogressdialog1.show();
            return;
        } else
        {
            AdMarvelProgressDialog admarvelprogressdialog2 = new AdMarvelProgressDialog(this, this);
            admarvelprogressdialog2.setMessage(s);
            admarvelprogressdialog2.show();
            progressDialogReference.clear();
            progressDialogReference = new WeakReference(admarvelprogressdialog2);
            return;
        }
    }

    public void stopVideo()
    {
        if (mVideoView == null)
        {
            return;
        } else
        {
            mVideoView.stopPlayback();
            videoState = VideoPlayerState.Stopped;
            return;
        }
    }

    public void toolbarDisplayToggle(boolean flag)
    {
        LinearLayout linearlayout = (LinearLayout)findViewById(VIEW_ID);
        if (isToolbar && linearlayout != null)
        {
            if (linearlayout.getVisibility() != 0)
            {
                if (flag)
                {
                    animateView(linearlayout, flag);
                    linearlayout.setVisibility(0);
                    linearlayout.bringToFront();
                    linearlayout.requestLayout();
                    if (autoToggleTimer != null && !autoToggleTimer.isEnabled())
                    {
                        lastInteractionTime = System.currentTimeMillis();
                        autoToggleTimer.stop();
                        autoToggleTimer.start();
                    }
                }
            } else
            if (!flag)
            {
                animateView(linearlayout, flag);
                linearlayout.setVisibility(4);
                return;
            }
        }
    }

    public void updateCloseInterstialAdCounter()
    {
        adCloseCount = adCloseCount + 1;
    }




























    // Unreferenced inner class com/admarvel/android/ads/AdMarvelVideoActivity$UITimer$1

/* anonymous class */
    class UITimer._cls1
        implements Runnable
    {

        final UITimer this$1;

        public void run()
        {
            if (!enabled)
            {
                return;
            }
            handler.post(runMethod);
            if (oneTime)
            {
                enabled = false;
                return;
            } else
            {
                handler.postDelayed(timer_tick, intervalMs);
                return;
            }
        }

            
            {
                this$1 = UITimer.this;
                super();
            }
    }

}

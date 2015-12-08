// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

// Referenced classes of package com.millennialmedia.android:
//            VideoPlayerActivity, VideoAd, VideoImage, MMLog, 
//            MMWebView, MMActivity, InterstitialWebViewClient, HttpGetRequest, 
//            VideoLogEvent, AdCache

class CachedVideoPlayerActivity extends VideoPlayerActivity
    implements android.os.Handler.Callback
{
    private static class CachedVideoWebViewClientListener extends MMWebViewClient.MMWebViewClientListener
    {

        WeakReference activityRef;

        public void onPageFinished(String s)
        {
            MMLog.d("CachedVideoPlayerActivity", (new StringBuilder()).append("@@ ON PAGE FINISHED").append(s).toString());
            CachedVideoPlayerActivity cachedvideoplayeractivity = (CachedVideoPlayerActivity)activityRef.get();
            if (cachedvideoplayeractivity != null)
            {
                cachedvideoplayeractivity.onPageFinished(s);
            }
        }

        CachedVideoWebViewClientListener(CachedVideoPlayerActivity cachedvideoplayeractivity)
        {
            activityRef = new WeakReference(cachedvideoplayeractivity);
        }
    }

    class FetchWebViewContentTask extends AsyncTask
    {

        private String baseUrl;
        private boolean cancelVideo;
        final CachedVideoPlayerActivity this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient String doInBackground(Void avoid[])
        {
            StatusLine statusline;
            avoid = (new HttpGetRequest()).get(baseUrl);
            statusline = avoid.getStatusLine();
            if (avoid == null || statusline == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            if (statusline.getStatusCode() == 404)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            avoid = avoid.getEntity();
            if (avoid == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            return HttpGetRequest.convertStreamToString(avoid.getContent());
            cancelVideo = true;
_L2:
            return null;
            avoid;
            MMLog.e("CachedVideoPlayerActivity", "Error with http web overlay", avoid);
            if (true) goto _L2; else goto _L1
_L1:
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
            if (cancelVideo)
            {
                dismiss();
            }
            if (s != null && mWebView != null)
            {
                mWebView.setWebViewContent(s, baseUrl, activity);
                hasLoadedCompletionUrl = true;
            }
        }

        public FetchWebViewContentTask(String s)
        {
            this$0 = CachedVideoPlayerActivity.this;
            super();
            baseUrl = s;
        }
    }


    private static final int STATIC_HUD_ID = 402;
    private static final int STATIC_HUD_SECONDS_ID = 401;
    private static final String TAG = "CachedVideoPlayerActivity";
    private static final int TIME_TO_UPDATE_SEEK_JS = 500;
    private RelativeLayout buttonsLayout;
    private boolean hasCountdownHud;
    boolean hasLoadedCompletionUrl;
    boolean hasWebOverlay;
    private TextView hudSeconds;
    private TextView hudStaticText;
    private int lastVideoPosition;
    private Handler logTimeAndEventhandler;
    private MMWebView mWebView;
    private VideoAd videoAd;

    CachedVideoPlayerActivity()
    {
        hasCountdownHud = true;
    }

    private String calculateHudSecondsText()
    {
        if (currentVideoPosition != 0)
        {
            return String.valueOf(currentVideoPosition / 1000);
        }
        if (videoAd != null)
        {
            return String.valueOf(videoAd.duration / 1000L);
        } else
        {
            return "";
        }
    }

    private void dismissAfter(long l)
    {
        logTimeAndEventhandler.postDelayed(new Runnable() {

            final CachedVideoPlayerActivity this$0;

            public void run()
            {
                dismiss();
            }

            
            {
                this$0 = CachedVideoPlayerActivity.this;
                super();
            }
        }, l);
    }

    private void fadeButton(VideoImage videoimage)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(videoimage.fromAlpha, videoimage.toAlpha);
        alphaanimation.setDuration(videoimage.fadeDuration);
        alphaanimation.setFillEnabled(true);
        alphaanimation.setFillBefore(true);
        alphaanimation.setFillAfter(true);
        videoimage.button.startAnimation(alphaanimation);
    }

    private void fadeButtons()
    {
        if (videoAd != null && videoAd.buttons != null)
        {
            for (int i = 0; i < videoAd.buttons.size(); i++)
            {
                VideoImage videoimage = (VideoImage)videoAd.buttons.get(i);
                if (!videoimage.isLeaveBehind)
                {
                    setButtonAlpha(videoimage.button, videoimage.fromAlpha);
                }
                if (videoimage.button.getParent() == null)
                {
                    buttonsLayout.addView(videoimage.button, videoimage.layoutParams);
                }
                for (int j = 0; j < videoAd.buttons.size(); j++)
                {
                    buttonsLayout.bringChildToFront(((VideoImage)videoAd.buttons.get(j)).button);
                }

                MMLog.v("CachedVideoPlayerActivity", String.format("Button: %d alpha: %f", new Object[] {
                    Integer.valueOf(i), Float.valueOf(videoimage.fromAlpha)
                }));
            }

        }
    }

    private void hideHud()
    {
        if (hudStaticText != null)
        {
            hudStaticText.setVisibility(4);
        }
        if (hudSeconds != null)
        {
            hudSeconds.setVisibility(4);
        }
    }

    private void initHudSeconds(ViewGroup viewgroup)
    {
        hudSeconds = new TextView(activity);
        hudSeconds.setText(calculateHudSecondsText());
        hudSeconds.setTextColor(-1);
        hudSeconds.setId(401);
        hudSeconds.setShadowLayer(1.0F, 0.0F, 0.0F, 0xff000000);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutparams.addRule(10);
        layoutparams.addRule(0, 402);
        viewgroup.addView(hudSeconds, layoutparams);
    }

    private void initHudStaticText(ViewGroup viewgroup)
    {
        hudStaticText = new TextView(activity);
        hudStaticText.setText(" seconds remaining ...");
        hudStaticText.setTextColor(-1);
        hudStaticText.setPadding(0, 0, 5, 0);
        hudStaticText.setId(402);
        hudStaticText.setShadowLayer(1.0F, 0.0F, 0.0F, 0xff000000);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutparams.addRule(10);
        layoutparams.addRule(11);
        viewgroup.addView(hudStaticText, layoutparams);
    }

    private void initWebOverlay()
    {
        mWebView = new MMWebView(activity, activity.creatorAdImplInternalId);
        mWebView.setId(413);
        Object obj = new CachedVideoWebViewClientListener(this);
        mWebView.setWebViewClient(new InterstitialWebViewClient(((MMWebViewClient.MMWebViewClientListener) (obj)), redirectListenerImpl));
        obj = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(13);
        mWebView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        mWebView.setBackgroundColor(0);
        loadUrlForMraidInjection(videoAd.webOverlayURL);
    }

    private void onPageFinished(String s)
    {
        if (mVideoView != null && videoAd != null && !mVideoView.isPlaying() && videoAd.webOverlayURL != null && s.equalsIgnoreCase(videoAd.webOverlayURL))
        {
            playVideo(0);
        }
    }

    private void showHud()
    {
        if (videoAd != null)
        {
            hudSeconds.setText(String.valueOf(videoAd.duration / 1000L));
        }
        hudStaticText.setVisibility(0);
        hudSeconds.setVisibility(0);
    }

    protected boolean canFadeButtons()
    {
        return !videoAd.stayInPlayer || !super.canFadeButtons();
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (videoAd != null)
        {
            if (logTimeAndEventhandler != null)
            {
                logTimeAndEventhandler.removeMessages(1);
            }
            if (!hasWebOverlay)
            {
                int i = 0;
                while (i < videoAd.buttons.size()) 
                {
                    VideoImage videoimage = (VideoImage)videoAd.buttons.get(i);
                    setButtonAlpha(videoimage.button, videoimage.fromAlpha);
                    if (videoimage.inactivityTimeout > 0L)
                    {
                        Message message = Message.obtain(logTimeAndEventhandler, 1, videoimage);
                        logTimeAndEventhandler.sendMessageDelayed(message, videoimage.inactivityTimeout);
                    } else
                    if (motionevent.getAction() == 1)
                    {
                        if (canFadeButtons())
                        {
                            AlphaAnimation alphaanimation = new AlphaAnimation(videoimage.fromAlpha, videoimage.toAlpha);
                            alphaanimation.setDuration(videoimage.fadeDuration);
                            alphaanimation.setFillEnabled(true);
                            alphaanimation.setFillBefore(true);
                            alphaanimation.setFillAfter(true);
                            videoimage.button.startAnimation(alphaanimation);
                        }
                    } else
                    if (motionevent.getAction() == 0)
                    {
                        setButtonAlpha(videoimage.button, videoimage.fromAlpha);
                    }
                    i++;
                }
            }
        }
        return super.dispatchTouchEvent(motionevent);
    }

    protected void enableButtons()
    {
        super.enableButtons();
        if (!hasWebOverlay && videoAd != null && videoAd.buttons != null)
        {
            Iterator iterator = videoAd.buttons.iterator();
            while (iterator.hasNext()) 
            {
                VideoImage videoimage = (VideoImage)iterator.next();
                if (videoimage.button != null)
                {
                    videoimage.button.setEnabled(true);
                }
            }
        }
    }

    protected void errorPlayVideo(String s)
    {
        if (videoAd != null)
        {
            HttpGetRequest.log(videoAd.videoError);
        }
        if (mWebView != null)
        {
            mWebView.loadUrl((new StringBuilder()).append("javascript:MMJS.cachedVideo.setError(").append(s).append(");").toString());
        }
        super.errorPlayVideo(s);
    }

    public boolean handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 34
    //                   2 168
    //                   3 55;
           goto _L1 _L2 _L3 _L4
_L1:
        return true;
_L2:
        if (canFadeButtons())
        {
            fadeButton((VideoImage)message.obj);
        }
          goto _L1
_L4:
        message = (VideoImage)message.obj;
        try
        {
            if (buttonsLayout.indexOfChild(((VideoImage) (message)).button) == -1)
            {
                buttonsLayout.addView(((VideoImage) (message)).button, ((VideoImage) (message)).layoutParams);
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            MMLog.e("CachedVideoPlayerActivity", "Problem adding buttons", illegalstateexception);
        }
        if (canFadeButtons())
        {
            fadeButton(message);
            MMLog.v("CachedVideoPlayerActivity", String.format("Beginning animation to visibility. Fade duration: %d Button: %d Time: %d", new Object[] {
                Long.valueOf(((VideoImage) (message)).fadeDuration), Integer.valueOf(((VideoImage) (message)).button.getId()), Long.valueOf(System.currentTimeMillis())
            }));
        }
          goto _L1
_L3:
        if (mVideoView == null || !mVideoView.isPlaying()) goto _L6; else goto _L5
_L5:
        int k = mVideoView.getCurrentPosition();
        if (k <= lastVideoPosition) goto _L8; else goto _L7
_L7:
        if (videoAd == null) goto _L10; else goto _L9
_L9:
        if (lastVideoPosition == 0)
        {
            videoAd.logBeginEvent();
        }
          goto _L11
_L20:
        int i;
        if (i >= videoAd.activities.size()) goto _L10; else goto _L12
_L12:
        message = (VideoLogEvent)videoAd.activities.get(i);
        if (message == null) goto _L14; else goto _L13
_L13:
        if (((VideoLogEvent) (message)).position < (long)lastVideoPosition || ((VideoLogEvent) (message)).position >= (long)k) goto _L14; else goto _L15
_L15:
        int j = 0;
_L16:
        if (j >= ((VideoLogEvent) (message)).activities.length)
        {
            break; /* Loop/switch isn't completed */
        }
        MMSDK.Event.logEvent(((VideoLogEvent) (message)).activities[j]);
        j++;
        if (true) goto _L16; else goto _L14
_L10:
        lastVideoPosition = k;
_L8:
        if (hasWebOverlay && mWebView != null)
        {
            mWebView.loadUrl((new StringBuilder()).append("javascript:MMJS.cachedVideo.updateVideoSeekTime(").append((float)Math.floor((float)k / 1000F)).append(");").toString());
        }
        if (!hasCountdownHud) goto _L6; else goto _L17
_L17:
        long l = (videoAd.duration - (long)k) / 1000L;
        if (l <= 0L) goto _L19; else goto _L18
_L18:
        if (hudSeconds != null)
        {
            hudSeconds.setText(String.valueOf(l));
        }
_L6:
        logTimeAndEventhandler.sendMessageDelayed(Message.obtain(logTimeAndEventhandler, 2), 500L);
          goto _L1
        message;
        MMLog.e("CachedVideoPlayerActivity", "Error with video check", message);
          goto _L1
_L19:
        hideHud();
          goto _L6
_L11:
        i = 0;
          goto _L20
_L14:
        i++;
          goto _L20
    }

    protected RelativeLayout initLayout()
    {
        RelativeLayout relativelayout;
        relativelayout = super.initLayout();
        logTimeAndEventhandler = new Handler(this);
        setRequestedOrientation(0);
        if (hasCountdownHud)
        {
            initHudStaticText(relativelayout);
            initHudSeconds(relativelayout);
            showHud();
        }
        if (videoAd == null || videoAd.webOverlayURL == null) goto _L2; else goto _L1
_L1:
        initWebOverlay();
        if (mWebView != null)
        {
            relativelayout.addView(mWebView);
            hasWebOverlay = true;
        }
_L7:
        return relativelayout;
_L2:
        ArrayList arraylist;
        File file;
        int i;
        hasWebOverlay = false;
        buttonsLayout = new RelativeLayout(activity);
        buttonsLayout.setId(1000);
        arraylist = null;
        if (videoAd != null)
        {
            arraylist = videoAd.buttons;
        }
        if (arraylist == null)
        {
            break MISSING_BLOCK_LABEL_705;
        }
        file = AdCache.getInternalCacheDirectory(activity);
        i = 0;
_L5:
        final VideoImage button;
        final ImageButton newButton;
        if (i >= arraylist.size())
        {
            break MISSING_BLOCK_LABEL_688;
        }
        button = (VideoImage)arraylist.get(i);
        newButton = new ImageButton(activity);
        button.button = newButton;
        Object obj = BitmapFactory.decodeFile((new StringBuilder()).append(file.getAbsolutePath()).append(File.separator).append(videoAd.getId()).append(Uri.parse(button.imageUrl).getLastPathSegment().replaceFirst("\\.[^\\.]*$", ".dat")).toString());
        if (obj == null) goto _L4; else goto _L3
_L3:
        try
        {
            newButton.setImageBitmap(((android.graphics.Bitmap) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            MMLog.e("CachedVideoPlayerActivity", "Problem creating layout with bitmap buttons: ", ((Throwable) (obj)));
        }
        setButtonAlpha(newButton, button.fromAlpha);
        newButton.setId(i + 1);
        newButton.setPadding(0, 0, 0, 0);
        if (button.isLeaveBehind)
        {
            newButton.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            newButton.setBackgroundColor(0xff000000);
            obj = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        } else
        {
            newButton.setBackgroundColor(0);
            obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            MMLog.v("CachedVideoPlayerActivity", String.format("Button: %d Anchor: %d Position: %d Anchor2: %d Position2: %d", new Object[] {
                Integer.valueOf(newButton.getId()), Integer.valueOf(button.anchor), Integer.valueOf(button.position), Integer.valueOf(button.anchor2), Integer.valueOf(button.position2)
            }));
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(button.position, button.anchor);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(button.position2, button.anchor2);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(button.paddingLeft, button.paddingTop, button.paddingRight, button.paddingBottom);
        }
        if (!TextUtils.isEmpty(button.linkUrl))
        {
            newButton.setOnClickListener(new android.view.View.OnClickListener() {

                final CachedVideoPlayerActivity this$0;
                final VideoImage val$button;
                final ImageButton val$newButton;

                public void onClick(View view)
                {
                    if (newButton != null)
                    {
                        newButton.setEnabled(false);
                    }
                    redirectListenerImpl.orientation = button.overlayOrientation;
                    dispatchButtonClick(button.linkUrl);
                    logButtonEvent(button);
                }

            
            {
                this$0 = CachedVideoPlayerActivity.this;
                newButton = imagebutton;
                button = videoimage;
                super();
            }
            });
        }
        if (button.appearanceDelay > 0L)
        {
            button.layoutParams = ((android.widget.RelativeLayout.LayoutParams) (obj));
            obj = Message.obtain(logTimeAndEventhandler, 3, button);
            logTimeAndEventhandler.sendMessageDelayed(((Message) (obj)), button.appearanceDelay);
        } else
        {
            buttonsLayout.addView(newButton, ((android.view.ViewGroup.LayoutParams) (obj)));
        }
        if (button.inactivityTimeout > 0L)
        {
            obj = Message.obtain(logTimeAndEventhandler, 1, button);
            logTimeAndEventhandler.sendMessageDelayed(((Message) (obj)), button.inactivityTimeout + button.appearanceDelay + button.fadeDuration);
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        newButton.setImageURI(Uri.parse((new StringBuilder()).append(file.getAbsolutePath()).append(File.separator).append(videoAd.getId()).append(Uri.parse(button.imageUrl).getLastPathSegment().replaceFirst("\\.[^\\.]*$", ".dat")).toString()));
        break MISSING_BLOCK_LABEL_264;
        relativelayout.addView(buttonsLayout, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        if (buttonsLayout != null)
        {
            relativelayout.bringChildToFront(buttonsLayout);
        }
        if (mWebView != null)
        {
            relativelayout.bringChildToFront(mWebView);
            return relativelayout;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected void initSavedInstance(Bundle bundle)
    {
        super.initSavedInstance(bundle);
        if (bundle == null)
        {
            bundle = getIntent().getStringExtra("videoId");
            videoAd = (VideoAd)AdCache.load(activity, bundle);
            if (videoAd != null)
            {
                hasBottomBar = videoAd.showControls;
                hasCountdownHud = videoAd.showCountdown;
            }
            return;
        } else
        {
            videoAd = (VideoAd)bundle.getParcelable("videoAd");
            hasBottomBar = bundle.getBoolean("shouldShowBottomBar");
            lastVideoPosition = bundle.getInt("lastVideoPosition");
            currentVideoPosition = bundle.getInt("currentVideoPosition");
            hasCountdownHud = videoAd.showCountdown;
            return;
        }
    }

    void loadUrlForMraidInjection(String s)
    {
        (new FetchWebViewContentTask(s)).execute(new Void[0]);
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        super.onCompletion(mediaplayer);
        if (hasCountdownHud)
        {
            hideHud();
        }
        if (videoAd != null)
        {
            videoPlayerOnCompletion(videoAd.onCompletionUrl);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        MMLog.v("CachedVideoPlayerActivity", "Is Cached Ad");
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        errorPlayVideo(String.format("Error while playing, %d - %d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        }));
        return super.onError(mediaplayer, i, j);
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        videoAd = (VideoAd)bundle.getParcelable("videoAd");
        super.onRestoreInstanceState(bundle);
    }

    protected void onResume()
    {
        super.onResume();
        if (mWebView != null)
        {
            mWebView.bringToFront();
        }
        if (buttonsLayout != null)
        {
            buttonsLayout.bringToFront();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putParcelable("videoAd", videoAd);
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        if (!hasWebOverlay && videoAd != null && videoAd.stayInPlayer && isVideoCompleted)
        {
            fadeButtons();
        }
    }

    protected void pauseVideo()
    {
        super.pauseVideo();
        logTimeAndEventhandler.removeMessages(1);
        logTimeAndEventhandler.removeMessages(2);
        logTimeAndEventhandler.removeMessages(3);
    }

    protected void playVideo(int i)
    {
        if (videoAd == null)
        {
            Toast.makeText(activity, "Sorry. There was a problem playing the video", 1).show();
            return;
        }
        if (!logTimeAndEventhandler.hasMessages(2) && videoAd != null)
        {
            logTimeAndEventhandler.sendMessageDelayed(Message.obtain(logTimeAndEventhandler, 2), 1000L);
        }
        super.playVideo(i);
    }

    protected void restartVideo()
    {
        if (videoAd != null)
        {
            if ((hasLoadedCompletionUrl || videoAd.reloadNonEndOverlayOnRestart) && videoAd.webOverlayURL != null && mWebView != null)
            {
                loadUrlForMraidInjection(videoAd.webOverlayURL);
                hasLoadedCompletionUrl = false;
            }
            ArrayList arraylist = videoAd.buttons;
            logTimeAndEventhandler.removeMessages(1);
            logTimeAndEventhandler.removeMessages(2);
            logTimeAndEventhandler.removeMessages(3);
            lastVideoPosition = 0;
            if (!hasWebOverlay && buttonsLayout != null && arraylist != null)
            {
                for (int i = 0; i < arraylist.size(); i++)
                {
                    VideoImage videoimage = (VideoImage)arraylist.get(i);
                    if (videoimage == null)
                    {
                        continue;
                    }
                    if (videoimage.appearanceDelay > 0L)
                    {
                        Object obj = videoimage.button;
                        buttonsLayout.removeView(((View) (obj)));
                        obj = Message.obtain(logTimeAndEventhandler, 3, videoimage);
                        logTimeAndEventhandler.sendMessageDelayed(((Message) (obj)), videoimage.appearanceDelay);
                    }
                    if (videoimage.inactivityTimeout > 0L)
                    {
                        Message message = Message.obtain(logTimeAndEventhandler, 1, videoimage);
                        logTimeAndEventhandler.sendMessageDelayed(message, videoimage.inactivityTimeout + videoimage.appearanceDelay + videoimage.fadeDuration);
                    }
                }

            }
            if (logTimeAndEventhandler != null)
            {
                logTimeAndEventhandler.sendMessageDelayed(Message.obtain(logTimeAndEventhandler, 2), 1000L);
            }
            if (hasCountdownHud)
            {
                showHud();
            }
        }
        super.restartVideo();
    }

    protected void resumeVideo()
    {
        if (videoAd != null)
        {
            if (!logTimeAndEventhandler.hasMessages(2))
            {
                logTimeAndEventhandler.sendMessageDelayed(Message.obtain(logTimeAndEventhandler, 2), 1000L);
            }
            if (!hasWebOverlay)
            {
                if (hasCountdownHud)
                {
                    long l = (videoAd.duration - (long)currentVideoPosition) / 1000L;
                    VideoImage videoimage;
                    Message message;
                    int i;
                    long l1;
                    if (l > 0L)
                    {
                        if (hudSeconds != null)
                        {
                            hudSeconds.setText(String.valueOf(l));
                        }
                    } else
                    {
                        hideHud();
                    }
                }
                if (videoAd.buttons != null)
                {
                    for (i = 0; i < videoAd.buttons.size(); i++)
                    {
                        videoimage = (VideoImage)videoAd.buttons.get(i);
                        l1 = 0L;
                        l = l1;
                        if (videoimage.appearanceDelay > 0L)
                        {
                            l = l1;
                            if (buttonsLayout.indexOfChild(videoimage.button) == -1)
                            {
                                message = Message.obtain(logTimeAndEventhandler, 3, videoimage);
                                l1 = videoimage.appearanceDelay - (long)currentVideoPosition;
                                l = l1;
                                if (l1 < 0L)
                                {
                                    l = 500L;
                                }
                                logTimeAndEventhandler.sendMessageDelayed(message, l);
                            }
                        }
                        if (videoimage.inactivityTimeout > 0L)
                        {
                            message = Message.obtain(logTimeAndEventhandler, 1, videoimage);
                            logTimeAndEventhandler.sendMessageDelayed(message, videoimage.inactivityTimeout + l + videoimage.fadeDuration);
                        }
                    }

                }
            }
        }
        super.resumeVideo();
    }

    protected void videoPlayerOnCompletion(String s)
    {
label0:
        {
            if (s != null)
            {
                dispatchButtonClick(s);
            }
            if (videoAd != null)
            {
                videoAd.logEndEvent();
                if (videoAd.stayInPlayer)
                {
                    break label0;
                }
                dismiss();
            }
            return;
        }
        if (!hasWebOverlay && videoAd.buttons != null)
        {
            fadeButtons();
            if (!videoAd.hasEndCard())
            {
                dismiss();
            }
        }
        if (mWebView == null || TextUtils.isEmpty(videoAd.endOverlayURL)) goto _L2; else goto _L1
_L1:
        loadUrlForMraidInjection(videoAd.endOverlayURL);
        mWebView.bringToFront();
_L4:
        if (videoAd.closeDelayMillis != 0L)
        {
            dismissAfter(videoAd.closeDelayMillis);
        }
        logTimeAndEventhandler.removeMessages(1);
        logTimeAndEventhandler.removeMessages(2);
        logTimeAndEventhandler.removeMessages(3);
        return;
_L2:
        if (hasWebOverlay)
        {
            dismiss();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }


}

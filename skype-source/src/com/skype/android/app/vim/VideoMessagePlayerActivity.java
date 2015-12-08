// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.skype.Message;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.VideoMessage;
import com.skype.VideoMessageImpl;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.InfoDialogFragment;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.SymbolView;
import java.io.File;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessageVideoView, VideoMessageMediaController

public class VideoMessagePlayerActivity extends SkypeActivity
    implements android.os.Handler.Callback, VideoMessageMediaController.VideoMessageMediaControllerListener
{

    public static final String EXTRA_VIDEO_MESSAGE_PATH = "extra_video_message_ path";
    private static final int PLAYBACK_CONTROLS_TIMEOUT = 5000;
    AccessibilityUtil accessibilityUtil;
    private boolean cancelLoadUrl;
    private boolean forceHiddenThumbnail;
    ObjectIdMap map;
    private VideoMessageMediaController mediaController;
    private Message message;
    SymbolView playButton;
    private boolean playOnPrepared;
    private boolean prepared;
    View reviewControls;
    ImageView thumbnailView;
    private VideoMessage videoMessage;
    private VideoView videoView;

    public VideoMessagePlayerActivity()
    {
    }

    private void loadVideoFromMessage()
    {
label0:
        {
label1:
            {
                if (message != null)
                {
                    videoMessage = new VideoMessageImpl();
                    message.getVideoMessage(videoMessage);
                    if (map.a(videoMessage.getObjectID()) == null)
                    {
                        map.b(videoMessage);
                        map.a(videoMessage);
                    }
                    String s = videoMessage.getLocalPathProp();
                    if (TextUtils.isEmpty(s))
                    {
                        break label0;
                    }
                    if (!(new File(s)).exists())
                    {
                        break label1;
                    }
                    playLocalPath(s);
                }
                return;
            }
            loadVideoMessageUrl(videoMessage);
            return;
        }
        loadVideoMessageUrl(videoMessage);
    }

    private void loadVideoMessageUrl(VideoMessage videomessage)
    {
        videomessage.prepareForPlay(true);
        play(videomessage.getVodPathProp());
    }

    private void play(String s)
    {
        if (!cancelLoadUrl && !TextUtils.isEmpty(s))
        {
            playUri(Uri.parse(s));
        }
    }

    private void showErrorDialog()
    {
        setProgressIndeterminate(false);
        InfoDialogFragment infodialogfragment = InfoDialogFragment.create("", getString(0x7f08044e), getString(0x7f0802f6));
        infodialogfragment.show(getSupportFragmentManager());
        infodialogfragment.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final VideoMessagePlayerActivity this$0;

            public final void onDismiss(DialogInterface dialoginterface)
            {
                finish();
            }

            
            {
                this$0 = VideoMessagePlayerActivity.this;
                super();
            }
        });
    }

    private void startVideo()
    {
        setPreplayVisibility(false);
        videoView.start();
    }

    protected void createVideoView()
    {
        videoView = new VideoMessageVideoView(this);
        RelativeLayout relativelayout = (RelativeLayout)findViewById(0x7f100591);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutparams.addRule(14);
        layoutparams.addRule(15);
        relativelayout.addView(videoView, layoutparams);
        onVideoViewCreated(videoView);
    }

    protected VideoView getVideoView()
    {
        return videoView;
    }

    public boolean handleMessage(android.os.Message message1)
    {
        loadVideoMessageUrl((VideoMessage)message1.obj);
        return false;
    }

    protected boolean hasCustomMediaController()
    {
        return false;
    }

    protected void hideMediaController()
    {
        mediaController.hide();
    }

    public boolean onAcceptEvent(com.skype.android.gen.VideoMessageListener.OnPropertyChange onpropertychange)
    {
        return videoMessage != null && onpropertychange.getSender().getObjectID() == videoMessage.getObjectID() && onpropertychange.getPropKey() == PROPKEY.VIDEOMESSAGE_VOD_STATUS;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        getWindow().setFlags(1024, 1024);
        createVideoView();
        bundle = getIntent().getStringExtra("extra_video_message_ path");
        if (TextUtils.isEmpty(bundle)) goto _L2; else goto _L1
_L1:
        play(bundle);
_L4:
        reviewControls.setVisibility(4);
        return;
_L2:
        Uri uri = getIntent().getData();
        if (uri == null)
        {
            bundle = "";
        } else
        {
            bundle = uri.getScheme();
        }
        if (bundle.equals("http") || bundle.equals("https"))
        {
            playUri(uri);
        } else
        if (bundle.equals("file"))
        {
            bundle = uri.toString();
            log.info((new StringBuilder("path: ")).append(bundle).toString());
            setPreplayVisibility(true);
            videoView.setVideoPath(bundle);
        } else
        if (getIntent().hasExtra("com.skype.objId"))
        {
            playFromMessage();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onDestroy()
    {
        cancelLoadUrl = true;
        super.onDestroy();
    }

    public void onEvent(com.skype.android.gen.VideoMessageListener.OnPropertyChange onpropertychange)
    {
        onpropertychange = videoMessage.getVodStatusProp();
        static final class _cls6
        {

            static final int $SwitchMap$com$skype$VideoMessage$VOD_STATUS[];

            static 
            {
                $SwitchMap$com$skype$VideoMessage$VOD_STATUS = new int[com.skype.VideoMessage.VOD_STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$VideoMessage$VOD_STATUS[com.skype.VideoMessage.VOD_STATUS.VOD_NOT_AVAILABLE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$VideoMessage$VOD_STATUS[com.skype.VideoMessage.VOD_STATUS.VOD_PLAYABLE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$VideoMessage$VOD_STATUS[com.skype.VideoMessage.VOD_STATUS.VOD_PLAYABLE_LOCAL.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls6..SwitchMap.com.skype.VideoMessage.VOD_STATUS[onpropertychange.ordinal()])
        {
        case 1: // '\001'
        default:
            return;

        case 2: // '\002'
        case 3: // '\003'
            play(videoMessage.getVodPathProp());
            break;
        }
    }

    public void onHide(MediaController mediacontroller)
    {
    }

    public void onPause()
    {
        if (videoView != null)
        {
            videoView.pause();
        }
        super.onPause();
    }

    protected void onPrepareMediaController(MediaController mediacontroller)
    {
    }

    public void onResume()
    {
        super.onResume();
        if (videoView == null) goto _L2; else goto _L1
_L1:
        if (!hasCustomMediaController() || reviewControls == null) goto _L4; else goto _L3
_L3:
        reviewControls.setVisibility(0);
        if (!accessibilityUtil.a())
        {
            mediaController.hide();
        }
_L6:
        videoView.resume();
_L2:
        return;
_L4:
        if (!mediaController.isShowing() && prepared)
        {
            showMediaController();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onShow(MediaController mediacontroller)
    {
    }

    protected void onVideoPlaybackCompleted()
    {
        finish();
    }

    protected void onVideoViewCreated(VideoView videoview)
    {
        mediaController = new VideoMessageMediaController(this);
        if (accessibilityUtil.a())
        {
            mediaController.setContentDescription(getString(0x7f0800f6));
        }
        videoview.setMediaController(mediaController);
        mediaController.setMediaPlayer(videoview);
        mediaController.setEnabled(true);
        mediaController.setAnchorView(videoview);
        mediaController.setVideoMessageMediaControllerListener(this);
        videoview.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {

            final VideoMessagePlayerActivity this$0;

            public final void onPrepared(MediaPlayer mediaplayer)
            {
                prepared = true;
                setProgressIndeterminate(false);
                if (playOnPrepared)
                {
                    startVideo();
                    showMediaController();
                }
            }

            
            {
                this$0 = VideoMessagePlayerActivity.this;
                super();
            }
        });
        videoview.setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() );
        videoview.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {

            final VideoMessagePlayerActivity this$0;

            public final void onCompletion(MediaPlayer mediaplayer)
            {
                onVideoPlaybackCompleted();
                playButton.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.bV);
            }

            
            {
                this$0 = VideoMessagePlayerActivity.this;
                super();
            }
        });
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            videoview.setOnInfoListener(new android.media.MediaPlayer.OnInfoListener() {

                final VideoMessagePlayerActivity this$0;

                public final boolean onInfo(MediaPlayer mediaplayer, int i, int j)
                {
                    if (i == 3)
                    {
                        forceHiddenThumbnail = true;
                        setPreplayVisibility(false);
                    }
                    return false;
                }

            
            {
                this$0 = VideoMessagePlayerActivity.this;
                super();
            }
            });
        }
    }

    protected void playFromMessage()
    {
        message = (Message)map.a(getIntent().getIntExtra("com.skype.objId", 0), com/skype/Message);
        if (message != null)
        {
            setProgressIndeterminate(true);
            loadVideoFromMessage();
        }
    }

    protected void playFromTouch()
    {
        if (videoView != null)
        {
            if (!videoView.isPlaying() && prepared)
            {
                startVideo();
                playButton.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.bW);
            } else
            if (videoView.isPlaying())
            {
                videoView.pause();
                playButton.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.bV);
                return;
            }
        }
    }

    protected void playLocalPath(String s)
    {
        log.info((new StringBuilder("play from path: ")).append(s).toString());
        setProgressIndeterminate(false);
        setPreplayVisibility(false);
        videoView.setVideoPath(s);
        playOnPrepared = true;
    }

    protected void playUri(Uri uri)
    {
        log.info((new StringBuilder("play from uri: ")).append(uri).toString());
        setProgressIndeterminate(true);
        videoView.setVideoURI(uri);
        playOnPrepared = true;
    }

    protected void setPreplayVisibility(boolean flag)
    {
        if (thumbnailView != null)
        {
            ImageView imageview = thumbnailView;
            int i;
            if (flag && !forceHiddenThumbnail)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            imageview.setVisibility(i);
        }
    }

    protected void setProgressIndeterminate(boolean flag)
    {
        View view = findViewById(0x7f10000c);
        if (view != null)
        {
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    protected void showMediaController()
    {
        onPrepareMediaController(mediaController);
        mediaController.show(5000);
    }


/*
    static boolean access$002(VideoMessagePlayerActivity videomessageplayeractivity, boolean flag)
    {
        videomessageplayeractivity.prepared = flag;
        return flag;
    }

*/






/*
    static boolean access$502(VideoMessagePlayerActivity videomessageplayeractivity, boolean flag)
    {
        videomessageplayeractivity.forceHiddenThumbnail = flag;
        return flag;
    }

*/
}

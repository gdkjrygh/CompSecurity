// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;

import BI;
import BJ;
import JF;
import JG;
import Jw;
import Jx;
import PG;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageView;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.ui.ImageResourceView;
import com.snapchat.android.ui.TextureVideoView;
import com.snapchat.android.util.crypto.CbcEncryptionAlgorithm;
import java.util.Observable;
import java.util.Observer;
import xH;
import xo;

// Referenced classes of package com.snapchat.android.model.chat:
//            ChatMedia

public final class ChatVideoItemProxy
    implements BI, Observer
{
    public static final class VideoState extends Enum
    {

        private static final VideoState $VALUES[];
        public static final VideoState ERROR;
        public static final VideoState LOADING;
        public static final VideoState PAUSED;
        public static final VideoState PLAYING;
        public static final VideoState STOPPED;

        public static VideoState valueOf(String s)
        {
            return (VideoState)Enum.valueOf(com/snapchat/android/model/chat/ChatVideoItemProxy$VideoState, s);
        }

        public static VideoState[] values()
        {
            return (VideoState[])$VALUES.clone();
        }

        static 
        {
            ERROR = new VideoState("ERROR", 0);
            PAUSED = new VideoState("PAUSED", 1);
            STOPPED = new VideoState("STOPPED", 2);
            LOADING = new VideoState("LOADING", 3);
            PLAYING = new VideoState("PLAYING", 4);
            $VALUES = (new VideoState[] {
                ERROR, PAUSED, STOPPED, LOADING, PLAYING
            });
        }

        private VideoState(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static interface a
    {

        public abstract void c();
    }


    private static final String ALPHA = "alpha";
    private static final int MAX_VIDEO_RELOAD_TIMES = 3;
    private static final int STATE_ERROR = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_PAUSED = 4;
    private static final int STATE_PLAYING = 3;
    private static final int STATE_PREPARED = 2;
    private static final int STATE_PREPARING = 1;
    private static final String TAG = "ChatVideoItemProxy";
    private static int sId = 0;
    private Jx mBitmapLoader;
    private final ChatMedia mChatVideo;
    private AnimatorSet mCrossfadeAnimatorSet;
    private int mCurrentState;
    private final xH mHolder;
    private final int mId;
    private final ImageResourceView mImageResourceView;
    private boolean mOverlayFailedToLoad;
    private final ImageView mOverlayImageView;
    private boolean mOverlayLoaded;
    private BJ mPlaybackListener;
    private final View mProgressBar;
    private boolean mShowingVideo;
    private int mTargetState;
    private final TextureVideoView mTextureVideoView;
    private int mTimesTried;
    private final a mVideoErrorCallback;
    private boolean mVideoInErrorState;
    private boolean mVideoPlaybackCompleted;
    private final View mVideoReloadView;

    private ChatVideoItemProxy(ChatMedia chatmedia, TextureVideoView texturevideoview, ImageView imageview, View view, ImageResourceView imageresourceview, View view1, a a1, 
            xH xh)
    {
        mBitmapLoader = null;
        mOverlayLoaded = false;
        mOverlayFailedToLoad = false;
        mVideoInErrorState = false;
        mVideoPlaybackCompleted = false;
        if (!chatmedia.ak())
        {
            throw new IllegalArgumentException("Can't create a ChatVideoItemProxy for a non-video ChatMedia!");
        } else
        {
            mChatVideo = chatmedia;
            mTextureVideoView = texturevideoview;
            mOverlayImageView = imageview;
            mVideoReloadView = view;
            mImageResourceView = imageresourceview;
            mProgressBar = view1;
            mVideoErrorCallback = a1;
            mHolder = xh;
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final ChatVideoItemProxy this$0;

                public final void onClick(View view2)
                {
                    Timber.a("ChatVideoItemProxy", "[%d] Chat video reload clicked %s", new Object[] {
                        Integer.valueOf(ChatVideoItemProxy.a(ChatVideoItemProxy.this)), ChatVideoItemProxy.b(ChatVideoItemProxy.this).d()
                    });
                    if (ChatVideoItemProxy.c(ChatVideoItemProxy.this) || ChatVideoItemProxy.d(ChatVideoItemProxy.this))
                    {
                        b();
                    }
                }

            
            {
                this$0 = ChatVideoItemProxy.this;
                super();
            }
            });
            mCurrentState = 0;
            mTargetState = 0;
            int i1 = sId;
            sId = i1 + 1;
            mId = i1;
            return;
        }
    }

    public ChatVideoItemProxy(xH xh, ChatMedia chatmedia, a a1)
    {
        this(chatmedia, xh.s, xh.u, ((View) (xh.v)), xh.r, ((View) (xh.t)), a1, xh);
    }

    public ChatVideoItemProxy(xo xo1, ChatMedia chatmedia, a a1)
    {
        this(chatmedia, ((TextureVideoView) (xo1.c)), xo1.d, ((View) (xo1.f)), xo1.b, ((View) (xo1.e)), a1, null);
    }

    static int a(ChatVideoItemProxy chatvideoitemproxy)
    {
        return chatvideoitemproxy.mId;
    }

    static int a(ChatVideoItemProxy chatvideoitemproxy, int i1)
    {
        chatvideoitemproxy.mCurrentState = i1;
        return i1;
    }

    static void a(ChatVideoItemProxy chatvideoitemproxy, String s, int i1)
    {
label0:
        {
            boolean flag = false;
            Timber.e("ChatVideoItemProxy", s, new Object[0]);
            chatvideoitemproxy.mCurrentState = -1;
            chatvideoitemproxy.mTextureVideoView.b();
            chatvideoitemproxy.mVideoInErrorState = true;
            if (!chatvideoitemproxy.mVideoPlaybackCompleted)
            {
                if (i1 == 100 || i1 == -110)
                {
                    flag = true;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            chatvideoitemproxy.a(VideoState.ERROR);
            return;
        }
        if (chatvideoitemproxy.mVideoErrorCallback != null)
        {
            chatvideoitemproxy.mVideoErrorCallback.c();
        }
        chatvideoitemproxy.a(VideoState.STOPPED);
    }

    static boolean a(ChatVideoItemProxy chatvideoitemproxy, boolean flag)
    {
        chatvideoitemproxy.mVideoPlaybackCompleted = flag;
        return flag;
    }

    static int b(ChatVideoItemProxy chatvideoitemproxy, int i1)
    {
        chatvideoitemproxy.mTimesTried = i1;
        return i1;
    }

    static ChatMedia b(ChatVideoItemProxy chatvideoitemproxy)
    {
        return chatvideoitemproxy.mChatVideo;
    }

    static boolean b(ChatVideoItemProxy chatvideoitemproxy, boolean flag)
    {
        chatvideoitemproxy.mOverlayFailedToLoad = flag;
        return flag;
    }

    static boolean c(ChatVideoItemProxy chatvideoitemproxy)
    {
        return chatvideoitemproxy.mVideoInErrorState;
    }

    static boolean c(ChatVideoItemProxy chatvideoitemproxy, boolean flag)
    {
        chatvideoitemproxy.mShowingVideo = flag;
        return flag;
    }

    static boolean d(ChatVideoItemProxy chatvideoitemproxy)
    {
        return chatvideoitemproxy.mOverlayFailedToLoad;
    }

    static int e(ChatVideoItemProxy chatvideoitemproxy)
    {
        return chatvideoitemproxy.mTargetState;
    }

    static TextureVideoView f(ChatVideoItemProxy chatvideoitemproxy)
    {
        return chatvideoitemproxy.mTextureVideoView;
    }

    private void f()
    {
        Timber.a("ChatVideoItemProxy", "[%d] Load chat video and overlay %s", new Object[] {
            Integer.valueOf(mId), mChatVideo.d()
        });
        if (mChatVideo.O())
        {
            h();
        }
        mTextureVideoView.setAlpha(0.0F);
        mTextureVideoView.setVisibility(0);
        mTextureVideoView.setViewport((int)mChatVideo.U(), (int)mChatVideo.V(), (int)mChatVideo.X(), (int)mChatVideo.Z());
        g();
    }

    static BJ g(ChatVideoItemProxy chatvideoitemproxy)
    {
        return chatvideoitemproxy.mPlaybackListener;
    }

    private void g()
    {
        Timber.a("ChatVideoItemProxy", "[%d] Load chat video %s", new Object[] {
            Integer.valueOf(mId), mChatVideo.d()
        });
        mTextureVideoView.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {

            final ChatVideoItemProxy this$0;

            public final void onPrepared(MediaPlayer mediaplayer)
            {
                Timber.a("ChatVideoItemProxy", "[%d] Chat video prepared %s", new Object[] {
                    Integer.valueOf(ChatVideoItemProxy.a(ChatVideoItemProxy.this)), ChatVideoItemProxy.b(ChatVideoItemProxy.this).d()
                });
                int i1 = mediaplayer.getVideoWidth();
                int j1 = mediaplayer.getVideoHeight();
                if (i1 <= 0 || j1 <= 0)
                {
                    ChatVideoItemProxy.f(ChatVideoItemProxy.this).a();
                    mediaplayer = String.format("[%d] Video %s could not be loaded due to invalid dimensions: %d x %d", new Object[] {
                        Integer.valueOf(ChatVideoItemProxy.a(ChatVideoItemProxy.this)), ChatVideoItemProxy.b(ChatVideoItemProxy.this).d(), Integer.valueOf(i1), Integer.valueOf(j1)
                    });
                    ChatVideoItemProxy.a(ChatVideoItemProxy.this, mediaplayer, 1);
                } else
                {
                    ChatVideoItemProxy.a(ChatVideoItemProxy.this, 2);
                    ChatVideoItemProxy.h(ChatVideoItemProxy.this);
                    ChatVideoItemProxy.a(ChatVideoItemProxy.this, false);
                    if (!ChatVideoItemProxy.b(ChatVideoItemProxy.this).P() || ChatVideoItemProxy.f(ChatVideoItemProxy.this).g)
                    {
                        mediaplayer.setVolume(0.0F, 0.0F);
                    }
                    if (ChatVideoItemProxy.e(ChatVideoItemProxy.this) == 3)
                    {
                        c();
                        return;
                    }
                }
            }

            
            {
                this$0 = ChatVideoItemProxy.this;
                super();
            }
        });
        mTextureVideoView.setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() {

            final ChatVideoItemProxy this$0;

            public final boolean onError(MediaPlayer mediaplayer, int i1, int j1)
            {
                mediaplayer = String.format("[%d] Chat video error %s what(%d) extra(%d)", new Object[] {
                    Integer.valueOf(ChatVideoItemProxy.a(ChatVideoItemProxy.this)), ChatVideoItemProxy.b(ChatVideoItemProxy.this).d(), Integer.valueOf(i1), Integer.valueOf(j1)
                });
                if (ChatVideoItemProxy.i(ChatVideoItemProxy.this) == 1 && i1 == 1)
                {
                    if (ChatVideoItemProxy.j(ChatVideoItemProxy.this) < 3)
                    {
                        ChatVideoItemProxy.b(ChatVideoItemProxy.this, ChatVideoItemProxy.j(ChatVideoItemProxy.this) + 1);
                        ChatVideoItemProxy.k(ChatVideoItemProxy.this);
                    } else
                    {
                        (new EasyMetric("CHAT_VIDEO_RETRY_LIMIT_REACHED")).a("mediaId", ChatVideoItemProxy.b(ChatVideoItemProxy.this).d()).b(false);
                    }
                }
                ChatVideoItemProxy.a(ChatVideoItemProxy.this, mediaplayer, i1);
                return true;
            }

            
            {
                this$0 = ChatVideoItemProxy.this;
                super();
            }
        });
        mTextureVideoView.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {

            final ChatVideoItemProxy this$0;

            public final void onCompletion(MediaPlayer mediaplayer)
            {
                Timber.a("ChatVideoItemProxy", "[%d] Chat video playback completed %s", new Object[] {
                    Integer.valueOf(ChatVideoItemProxy.a(ChatVideoItemProxy.this)), ChatVideoItemProxy.b(ChatVideoItemProxy.this).d()
                });
                ChatVideoItemProxy.a(ChatVideoItemProxy.this, true);
                mediaplayer.setLooping(true);
                mediaplayer.start();
            }

            
            {
                this$0 = ChatVideoItemProxy.this;
                super();
            }
        });
        mTextureVideoView.setVideoURI(mChatVideo.M());
        mCurrentState = 1;
    }

    private void h()
    {
        Timber.a("ChatVideoItemProxy", "[%d] Load overlay %s", new Object[] {
            Integer.valueOf(mId), mChatVideo.d()
        });
        Object obj = new CbcEncryptionAlgorithm(mChatVideo.H(), mChatVideo.I());
        if (mBitmapLoader == null)
        {
            mBitmapLoader = new Jx(mOverlayImageView.getContext());
        }
        JF.a a1 = new JF.a();
        a1.mImageView = mOverlayImageView;
        a1 = a1.a(mChatVideo.N());
        a1.mWidth = mTextureVideoView.getWidth();
        a1.mHeight = mTextureVideoView.getHeight();
        a1.mEncryptionAlgorithm = ((KK) (obj));
        a1.mRequireExactDimensions = true;
        obj = a1.a();
        mBitmapLoader.a(((JF) (obj)), new JG[] {
            new JG() {

                final ChatVideoItemProxy this$0;

                public final void a(Jw jw, JF jf)
                {
                    int i1 = ChatVideoItemProxy.a(ChatVideoItemProxy.this);
                    boolean flag;
                    if (jw.mBitmap == null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    Timber.a("ChatVideoItemProxy", "[%d] Chat video overlay bitmap decoded, bitmap null? %b", new Object[] {
                        Integer.valueOf(i1), Boolean.valueOf(flag)
                    });
                    if (jw.mBitmap != null)
                    {
                        ChatVideoItemProxy.l(ChatVideoItemProxy.this);
                        ChatVideoItemProxy.b(ChatVideoItemProxy.this, false);
                        if (ChatVideoItemProxy.e(ChatVideoItemProxy.this) == 3)
                        {
                            c();
                        }
                        return;
                    } else
                    {
                        ChatVideoItemProxy.b(ChatVideoItemProxy.this, true);
                        ChatVideoItemProxy.this.a(VideoState.ERROR);
                        return;
                    }
                }

            
            {
                this$0 = ChatVideoItemProxy.this;
                super();
            }
            }
        });
    }

    static boolean h(ChatVideoItemProxy chatvideoitemproxy)
    {
        chatvideoitemproxy.mVideoInErrorState = false;
        return false;
    }

    static int i(ChatVideoItemProxy chatvideoitemproxy)
    {
        return chatvideoitemproxy.mCurrentState;
    }

    static int j(ChatVideoItemProxy chatvideoitemproxy)
    {
        return chatvideoitemproxy.mTimesTried;
    }

    static void k(ChatVideoItemProxy chatvideoitemproxy)
    {
        chatvideoitemproxy.g();
    }

    static boolean l(ChatVideoItemProxy chatvideoitemproxy)
    {
        chatvideoitemproxy.mOverlayLoaded = true;
        return true;
    }

    static void m(ChatVideoItemProxy chatvideoitemproxy)
    {
        chatvideoitemproxy.f();
    }

    static ImageView n(ChatVideoItemProxy chatvideoitemproxy)
    {
        return chatvideoitemproxy.mOverlayImageView;
    }

    static ImageResourceView o(ChatVideoItemProxy chatvideoitemproxy)
    {
        return chatvideoitemproxy.mImageResourceView;
    }

    static AnimatorSet p(ChatVideoItemProxy chatvideoitemproxy)
    {
        chatvideoitemproxy.mCrossfadeAnimatorSet = null;
        return null;
    }

    public final void a(BJ bj)
    {
        mPlaybackListener = bj;
    }

    public final void a(VideoState videostate)
    {
        static final class _cls2
        {

            static final int $SwitchMap$com$snapchat$android$model$chat$ChatVideoItemProxy$VideoState[];

            static 
            {
                $SwitchMap$com$snapchat$android$model$chat$ChatVideoItemProxy$VideoState = new int[VideoState.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$model$chat$ChatVideoItemProxy$VideoState[VideoState.ERROR.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$chat$ChatVideoItemProxy$VideoState[VideoState.PAUSED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$chat$ChatVideoItemProxy$VideoState[VideoState.STOPPED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$chat$ChatVideoItemProxy$VideoState[VideoState.LOADING.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$chat$ChatVideoItemProxy$VideoState[VideoState.PLAYING.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.snapchat.android.model.chat.ChatVideoItemProxy.VideoState[videostate.ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 45
    //                   2 63
    //                   3 63
    //                   4 286
    //                   5 304;
           goto _L1 _L2 _L3 _L3 _L4 _L5
_L1:
        return;
_L2:
        mProgressBar.setVisibility(8);
        mVideoReloadView.setVisibility(0);
        return;
_L3:
        mProgressBar.setVisibility(8);
        mVideoReloadView.setVisibility(8);
        if (mShowingVideo)
        {
            mShowingVideo = false;
            if (mCrossfadeAnimatorSet != null)
            {
                mCrossfadeAnimatorSet.cancel();
            }
            if (mHolder != null && mHolder.A != null)
            {
                mHolder.A.cancel();
            }
            mCrossfadeAnimatorSet = new AnimatorSet();
            videostate = mCrossfadeAnimatorSet.play(ObjectAnimator.ofFloat(mTextureVideoView, "alpha", new float[] {
                mTextureVideoView.getAlpha(), 0.0F
            }));
            if (mChatVideo.O())
            {
                videostate.with(ObjectAnimator.ofFloat(mOverlayImageView, "alpha", new float[] {
                    mOverlayImageView.getAlpha(), 0.0F
                }));
            }
            videostate.with(ObjectAnimator.ofFloat(mImageResourceView, "alpha", new float[] {
                0.0F, 1.0F
            }));
            mCrossfadeAnimatorSet.addListener(new android.animation.Animator.AnimatorListener() {

                boolean mCanceled;
                final ChatVideoItemProxy this$0;

                public final void onAnimationCancel(Animator animator)
                {
                    mCanceled = true;
                    ChatVideoItemProxy.c(ChatVideoItemProxy.this, true);
                    ChatVideoItemProxy.o(ChatVideoItemProxy.this).setVisibility(8);
                    ChatVideoItemProxy.f(ChatVideoItemProxy.this).setAlpha(1.0F);
                    ChatVideoItemProxy.n(ChatVideoItemProxy.this).setAlpha(1.0F);
                }

                public final void onAnimationEnd(Animator animator)
                {
                    if (!mCanceled)
                    {
                        ChatVideoItemProxy.n(ChatVideoItemProxy.this).setVisibility(8);
                        ChatVideoItemProxy.f(ChatVideoItemProxy.this).setVisibility(8);
                    }
                    ChatVideoItemProxy.p(ChatVideoItemProxy.this);
                }

                public final void onAnimationRepeat(Animator animator)
                {
                }

                public final void onAnimationStart(Animator animator)
                {
                    ChatVideoItemProxy.o(ChatVideoItemProxy.this).setAlpha(0.0F);
                    ChatVideoItemProxy.o(ChatVideoItemProxy.this).setVisibility(0);
                }

            
            {
                this$0 = ChatVideoItemProxy.this;
                super();
            }
            });
            if (mHolder != null)
            {
                mHolder.A = mCrossfadeAnimatorSet;
            }
            mCrossfadeAnimatorSet.start();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        mProgressBar.setVisibility(0);
        mVideoReloadView.setVisibility(8);
        return;
_L5:
        mProgressBar.setVisibility(8);
        mVideoReloadView.setVisibility(8);
        if (!mShowingVideo)
        {
            mShowingVideo = true;
            if (mCrossfadeAnimatorSet != null)
            {
                mCrossfadeAnimatorSet.cancel();
            }
            if (mHolder != null && mHolder.A != null)
            {
                mHolder.A.cancel();
            }
            mCrossfadeAnimatorSet = new AnimatorSet();
            videostate = mCrossfadeAnimatorSet.play(ObjectAnimator.ofFloat(mTextureVideoView, "alpha", new float[] {
                0.0F, 1.0F
            }));
            final boolean hasOverlay = mChatVideo.O();
            if (hasOverlay)
            {
                videostate.with(ObjectAnimator.ofFloat(mOverlayImageView, "alpha", new float[] {
                    0.0F, 1.0F
                }));
            }
            videostate.with(ObjectAnimator.ofFloat(mImageResourceView, "alpha", new float[] {
                mImageResourceView.getAlpha(), 0.0F
            }));
            mCrossfadeAnimatorSet.addListener(new android.animation.Animator.AnimatorListener() {

                boolean mCanceled;
                final ChatVideoItemProxy this$0;
                final boolean val$hasOverlay;

                public final void onAnimationCancel(Animator animator)
                {
                    mCanceled = true;
                    ChatVideoItemProxy.c(ChatVideoItemProxy.this, false);
                    ChatVideoItemProxy.o(ChatVideoItemProxy.this).setAlpha(1.0F);
                    ChatVideoItemProxy.n(ChatVideoItemProxy.this).setVisibility(8);
                    ChatVideoItemProxy.f(ChatVideoItemProxy.this).setVisibility(8);
                }

                public final void onAnimationEnd(Animator animator)
                {
                    if (!mCanceled)
                    {
                        ChatVideoItemProxy.o(ChatVideoItemProxy.this).setVisibility(8);
                    }
                    ChatVideoItemProxy.p(ChatVideoItemProxy.this);
                }

                public final void onAnimationRepeat(Animator animator)
                {
                }

                public final void onAnimationStart(Animator animator)
                {
                    if (hasOverlay)
                    {
                        ChatVideoItemProxy.n(ChatVideoItemProxy.this).setAlpha(0.0F);
                        ChatVideoItemProxy.n(ChatVideoItemProxy.this).setVisibility(0);
                    }
                    ChatVideoItemProxy.f(ChatVideoItemProxy.this).setAlpha(0.0F);
                    ChatVideoItemProxy.f(ChatVideoItemProxy.this).setVisibility(0);
                }

            
            {
                this$0 = ChatVideoItemProxy.this;
                hasOverlay = flag;
                super();
            }
            });
            if (mHolder != null)
            {
                mHolder.A = mCrossfadeAnimatorSet;
            }
            mCrossfadeAnimatorSet.start();
            mProgressBar.setVisibility(8);
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final boolean a()
    {
        return mTextureVideoView.isPlaying();
    }

    public final void b()
    {
        Timber.a("ChatVideoItemProxy", "[%d] Chat video initialize %s", new Object[] {
            Integer.valueOf(mId), mChatVideo.d()
        });
        a(VideoState.LOADING);
        if (mCurrentState != 0) goto _L2; else goto _L1
_L1:
        if (mChatVideo.M() != null) goto _L4; else goto _L3
_L3:
        Timber.a("ChatVideoItemProxy", "[%d] Chat video initialize no video URI yet %s", new Object[] {
            Integer.valueOf(mId), mChatVideo.d()
        });
        mChatVideo.addObserver(this);
_L6:
        return;
_L4:
        f();
        return;
_L2:
        if (mVideoInErrorState || mOverlayFailedToLoad)
        {
            Timber.a("ChatVideoItemProxy", "[%d] Chat video initialize (video and/or overlay failed to load %s)", new Object[] {
                Integer.valueOf(mId), mChatVideo.d()
            });
            a(VideoState.LOADING);
            if (mVideoInErrorState)
            {
                g();
            }
            if (mOverlayFailedToLoad)
            {
                h();
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void c()
    {
        boolean flag;
        if ((mCurrentState == 2 || mCurrentState == 4) && (!mChatVideo.O() || mOverlayLoaded))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Timber.a("ChatVideoItemProxy", "[%d] Start chat video playback ready to play %s", new Object[] {
                Integer.valueOf(mId), mChatVideo.d()
            });
            mTextureVideoView.setOnSeekCompleteListener(new android.media.MediaPlayer.OnSeekCompleteListener() {

                final ChatVideoItemProxy this$0;

                public final void onSeekComplete(MediaPlayer mediaplayer)
                {
                    if (ChatVideoItemProxy.e(ChatVideoItemProxy.this) == 3)
                    {
                        Timber.a("ChatVideoItemProxy", "[%d] Starting chat video playback after onSeekComplete %s", new Object[] {
                            Integer.valueOf(ChatVideoItemProxy.a(ChatVideoItemProxy.this)), ChatVideoItemProxy.b(ChatVideoItemProxy.this).d()
                        });
                        ChatVideoItemProxy.f(ChatVideoItemProxy.this).start();
                        a(VideoState.PLAYING);
                        ChatVideoItemProxy.a(ChatVideoItemProxy.this, 3);
                        if (ChatVideoItemProxy.g(ChatVideoItemProxy.this) != null)
                        {
                            ChatVideoItemProxy.g(ChatVideoItemProxy.this).f();
                        }
                    }
                }

            
            {
                this$0 = ChatVideoItemProxy.this;
                super();
            }
            });
            mTextureVideoView.seekTo(0);
        } else
        {
            Timber.a("ChatVideoItemProxy", "[%d] Start chat video playback not ready to play %s", new Object[] {
                Integer.valueOf(mId), mChatVideo.d()
            });
        }
        mTargetState = 3;
    }

    public final void d()
    {
        Timber.a("ChatVideoItemProxy", "[%d] Stop chat video playback %s", new Object[] {
            Integer.valueOf(mId), mChatVideo.d()
        });
        mTextureVideoView.a();
        a(VideoState.STOPPED);
        if (mChatVideo.O() && mBitmapLoader != null)
        {
            mBitmapLoader.a(mOverlayImageView);
        }
        mTextureVideoView.setOnSeekCompleteListener(null);
        mCurrentState = 0;
        mTargetState = 0;
    }

    public final long e()
    {
        return (long)mTextureVideoView.getDuration();
    }

    public final void update(Observable observable, Object obj)
    {
        if (observable == mChatVideo && mChatVideo.M() != null)
        {
            Timber.a("ChatVideoItemProxy", "[%d] Chat video observable video URI set %s", new Object[] {
                Integer.valueOf(mId), mChatVideo.d()
            });
            mChatVideo.deleteObserver(this);
            PG.a(new Runnable() {

                final ChatVideoItemProxy this$0;

                public final void run()
                {
                    ChatVideoItemProxy.m(ChatVideoItemProxy.this);
                }

            
            {
                this$0 = ChatVideoItemProxy.this;
                super();
            }
            });
        }
    }

}

.class public Lorg/chromium/content/browser/ContentVideoView;
.super Landroid/widget/FrameLayout;
.source "ContentVideoView.java"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;
.implements Lorg/chromium/ui/base/ViewAndroidDelegate;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/content/browser/ContentVideoView$ProgressView;,
        Lorg/chromium/content/browser/ContentVideoView$VideoSurfaceView;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# static fields
.field private static final MEDIA_BUFFERING_UPDATE:I = 0x3

.field private static final MEDIA_ERROR:I = 0x64

.field public static final MEDIA_ERROR_INVALID_CODE:I = 0x3

.field public static final MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK:I = 0x2

.field private static final MEDIA_INFO:I = 0xc8

.field private static final MEDIA_NOP:I = 0x0

.field private static final MEDIA_PLAYBACK_COMPLETE:I = 0x2

.field private static final MEDIA_PREPARED:I = 0x1

.field private static final MEDIA_SEEK_COMPLETE:I = 0x4

.field private static final MEDIA_SET_VIDEO_SIZE:I = 0x5

.field private static final STATE_ERROR:I = -0x1

.field private static final STATE_IDLE:I = 0x0

.field private static final STATE_PAUSED:I = 0x2

.field private static final STATE_PLAYBACK_COMPLETED:I = 0x3

.field private static final STATE_PLAYING:I = 0x1

.field private static final TAG:Ljava/lang/String; = "ContentVideoView"


# instance fields
.field private final mClient:Lorg/chromium/content/browser/ContentVideoViewClient;

.field private mCurrentState:I

.field private mDuration:I

.field private mErrorButton:Ljava/lang/String;

.field private mErrorTitle:Ljava/lang/String;

.field private final mExitFullscreenRunnable:Ljava/lang/Runnable;

.field private mInitialOrientation:Z

.field private mNativeContentVideoView:J

.field private mOrientationChangedTime:J

.field private mPlaybackErrorText:Ljava/lang/String;

.field private mPlaybackStartTime:J

.field private mPossibleAccidentalChange:Z

.field private mProgressView:Landroid/view/View;

.field private mSurfaceHolder:Landroid/view/SurfaceHolder;

.field private mUmaRecorded:Z

.field private mUnknownErrorText:Ljava/lang/String;

.field private mVideoHeight:I

.field private mVideoLoadingText:Ljava/lang/String;

.field private mVideoSurfaceView:Lorg/chromium/content/browser/ContentVideoView$VideoSurfaceView;

.field private mVideoWidth:I

.field private mViewAndroid:Lorg/chromium/ui/base/ViewAndroid;


# direct methods
.method protected constructor <init>(Landroid/content/Context;JLorg/chromium/content/browser/ContentVideoViewClient;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "nativeContentVideoView"    # J
    .param p4, "client"    # Lorg/chromium/content/browser/ContentVideoViewClient;

    .prologue
    const/4 v3, 0x0

    .line 176
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 80
    iput v3, p0, Lorg/chromium/content/browser/ContentVideoView;->mCurrentState:I

    .line 167
    new-instance v0, Lorg/chromium/content/browser/ContentVideoView$1;

    invoke-direct {v0, p0}, Lorg/chromium/content/browser/ContentVideoView$1;-><init>(Lorg/chromium/content/browser/ContentVideoView;)V

    iput-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mExitFullscreenRunnable:Ljava/lang/Runnable;

    .line 177
    iput-wide p2, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    .line 178
    new-instance v0, Lorg/chromium/ui/base/ViewAndroid;

    new-instance v1, Lorg/chromium/ui/base/WindowAndroid;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/chromium/ui/base/WindowAndroid;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1, p0}, Lorg/chromium/ui/base/ViewAndroid;-><init>(Lorg/chromium/ui/base/WindowAndroid;Lorg/chromium/ui/base/ViewAndroidDelegate;)V

    iput-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mViewAndroid:Lorg/chromium/ui/base/ViewAndroid;

    .line 179
    iput-object p4, p0, Lorg/chromium/content/browser/ContentVideoView;->mClient:Lorg/chromium/content/browser/ContentVideoViewClient;

    .line 180
    iput-boolean v3, p0, Lorg/chromium/content/browser/ContentVideoView;->mUmaRecorded:Z

    .line 181
    iput-boolean v3, p0, Lorg/chromium/content/browser/ContentVideoView;->mPossibleAccidentalChange:Z

    .line 182
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/ContentVideoView;->initResources(Landroid/content/Context;)V

    .line 183
    new-instance v0, Lorg/chromium/content/browser/ContentVideoView$VideoSurfaceView;

    invoke-direct {v0, p0, p1}, Lorg/chromium/content/browser/ContentVideoView$VideoSurfaceView;-><init>(Lorg/chromium/content/browser/ContentVideoView;Landroid/content/Context;)V

    iput-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mVideoSurfaceView:Lorg/chromium/content/browser/ContentVideoView$VideoSurfaceView;

    .line 184
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentVideoView;->showContentVideoView()V

    .line 185
    invoke-virtual {p0, v3}, Lorg/chromium/content/browser/ContentVideoView;->setVisibility(I)V

    .line 186
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/content/browser/ContentVideoView;)I
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/ContentVideoView;

    .prologue
    .line 40
    iget v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mVideoWidth:I

    return v0
.end method

.method static synthetic access$100(Lorg/chromium/content/browser/ContentVideoView;)I
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/ContentVideoView;

    .prologue
    .line 40
    iget v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mVideoHeight:I

    return v0
.end method

.method static synthetic access$200(Lorg/chromium/content/browser/ContentVideoView;)Z
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/ContentVideoView;

    .prologue
    .line 40
    iget-boolean v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mUmaRecorded:Z

    return v0
.end method

.method static synthetic access$300(Lorg/chromium/content/browser/ContentVideoView;)J
    .locals 2
    .param p0, "x0"    # Lorg/chromium/content/browser/ContentVideoView;

    .prologue
    .line 40
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mPlaybackStartTime:J

    return-wide v0
.end method

.method static synthetic access$400(Lorg/chromium/content/browser/ContentVideoView;)J
    .locals 2
    .param p0, "x0"    # Lorg/chromium/content/browser/ContentVideoView;

    .prologue
    .line 40
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mOrientationChangedTime:J

    return-wide v0
.end method

.method static synthetic access$402(Lorg/chromium/content/browser/ContentVideoView;J)J
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/ContentVideoView;
    .param p1, "x1"    # J

    .prologue
    .line 40
    iput-wide p1, p0, Lorg/chromium/content/browser/ContentVideoView;->mOrientationChangedTime:J

    return-wide p1
.end method

.method static synthetic access$500(Lorg/chromium/content/browser/ContentVideoView;)Z
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/ContentVideoView;

    .prologue
    .line 40
    invoke-direct {p0}, Lorg/chromium/content/browser/ContentVideoView;->isOrientationPortrait()Z

    move-result v0

    return v0
.end method

.method static synthetic access$600(Lorg/chromium/content/browser/ContentVideoView;)Z
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/ContentVideoView;

    .prologue
    .line 40
    iget-boolean v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mInitialOrientation:Z

    return v0
.end method

.method static synthetic access$700(Lorg/chromium/content/browser/ContentVideoView;)Z
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/ContentVideoView;

    .prologue
    .line 40
    iget-boolean v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mPossibleAccidentalChange:Z

    return v0
.end method

.method static synthetic access$702(Lorg/chromium/content/browser/ContentVideoView;Z)Z
    .locals 0
    .param p0, "x0"    # Lorg/chromium/content/browser/ContentVideoView;
    .param p1, "x1"    # Z

    .prologue
    .line 40
    iput-boolean p1, p0, Lorg/chromium/content/browser/ContentVideoView;->mPossibleAccidentalChange:Z

    return p1
.end method

.method private static createContentVideoView(Landroid/content/Context;JLorg/chromium/content/browser/ContentVideoViewClient;)Lorg/chromium/content/browser/ContentVideoView;
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "nativeContentVideoView"    # J
    .param p3, "client"    # Lorg/chromium/content/browser/ContentVideoViewClient;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 427
    invoke-static {}, Lorg/chromium/base/ThreadUtils;->assertOnUiThread()V

    .line 428
    new-instance v0, Lorg/chromium/content/browser/ContentVideoView;

    invoke-direct {v0, p0, p1, p2, p3}, Lorg/chromium/content/browser/ContentVideoView;-><init>(Landroid/content/Context;JLorg/chromium/content/browser/ContentVideoViewClient;)V

    .line 429
    .local v0, "videoView":Lorg/chromium/content/browser/ContentVideoView;
    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentVideoView;->getContentVideoViewClient()Lorg/chromium/content/browser/ContentVideoViewClient;

    move-result-object v1

    invoke-interface {v1, v0}, Lorg/chromium/content/browser/ContentVideoViewClient;->onShowCustomView(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 432
    .end local v0    # "videoView":Lorg/chromium/content/browser/ContentVideoView;
    :goto_0
    return-object v0

    .restart local v0    # "videoView":Lorg/chromium/content/browser/ContentVideoView;
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static getContentVideoView()Lorg/chromium/content/browser/ContentVideoView;
    .locals 1

    .prologue
    .line 495
    invoke-static {}, Lorg/chromium/content/browser/ContentVideoView;->nativeGetSingletonJavaContentVideoView()Lorg/chromium/content/browser/ContentVideoView;

    move-result-object v0

    return-object v0
.end method

.method private getNativeViewAndroid()J
    .locals 2
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 526
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mViewAndroid:Lorg/chromium/ui/base/ViewAndroid;

    invoke-virtual {v0}, Lorg/chromium/ui/base/ViewAndroid;->getNativePointer()J

    move-result-wide v0

    return-wide v0
.end method

.method private initResources(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 193
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mPlaybackErrorText:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 204
    :goto_0
    return-void

    .line 194
    :cond_0
    sget v0, Lorg/chromium/content/R$string;->media_player_error_text_invalid_progressive_playback:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mPlaybackErrorText:Ljava/lang/String;

    .line 196
    sget v0, Lorg/chromium/content/R$string;->media_player_error_text_unknown:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mUnknownErrorText:Ljava/lang/String;

    .line 198
    sget v0, Lorg/chromium/content/R$string;->media_player_error_button:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mErrorButton:Ljava/lang/String;

    .line 200
    sget v0, Lorg/chromium/content/R$string;->media_player_error_title:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mErrorTitle:Ljava/lang/String;

    .line 202
    sget v0, Lorg/chromium/content/R$string;->media_player_loading_video:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mVideoLoadingText:Ljava/lang/String;

    goto :goto_0
.end method

.method private static isActivityContext(Landroid/content/Context;)Z
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 438
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_0

    instance-of v0, p0, Landroid/app/Activity;

    if-nez v0, :cond_0

    .line 439
    check-cast p0, Landroid/content/ContextWrapper;

    .end local p0    # "context":Landroid/content/Context;
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    .line 440
    .restart local p0    # "context":Landroid/content/Context;
    invoke-static {p0}, Lorg/chromium/content/browser/ContentVideoView;->isActivityContext(Landroid/content/Context;)Z

    move-result v0

    .line 442
    :goto_0
    return v0

    :cond_0
    instance-of v0, p0, Landroid/app/Activity;

    goto :goto_0
.end method

.method private isOrientationPortrait()Z
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 530
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentVideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 531
    .local v0, "context":Landroid/content/Context;
    const-string v5, "window"

    invoke-virtual {v0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/WindowManager;

    .line 532
    .local v2, "manager":Landroid/view/WindowManager;
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    .line 533
    .local v1, "display":Landroid/view/Display;
    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3, v4, v4}, Landroid/graphics/Point;-><init>(II)V

    .line 534
    .local v3, "outputSize":Landroid/graphics/Point;
    invoke-virtual {v1, v3}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 535
    iget v5, v3, Landroid/graphics/Point;->x:I

    iget v6, v3, Landroid/graphics/Point;->y:I

    if-gt v5, v6, :cond_0

    const/4 v4, 0x1

    :cond_0
    return v4
.end method

.method private native nativeExitFullscreen(JZ)V
.end method

.method private native nativeGetCurrentPosition(J)I
.end method

.method private native nativeGetDurationInMilliSeconds(J)I
.end method

.method private static native nativeGetSingletonJavaContentVideoView()Lorg/chromium/content/browser/ContentVideoView;
.end method

.method private native nativeGetVideoHeight(J)I
.end method

.method private native nativeGetVideoWidth(J)I
.end method

.method private native nativeIsPlaying(J)Z
.end method

.method private native nativePause(J)V
.end method

.method private native nativePlay(J)V
.end method

.method private native nativeRecordExitFullscreenPlayback(JZJJ)V
.end method

.method private native nativeRecordFullscreenPlayback(JZZ)V
.end method

.method private native nativeRequestMediaMetadata(J)V
.end method

.method private native nativeSeekTo(JI)V
.end method

.method private native nativeSetSurface(JLandroid/view/Surface;)V
.end method

.method private onExitFullscreen()V
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 473
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/chromium/content/browser/ContentVideoView;->exitFullscreen(Z)V

    .line 474
    return-void
.end method

.method private onPlaybackComplete()V
    .locals 0
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 298
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentVideoView;->onCompletion()V

    .line 299
    return-void
.end method

.method private onVideoSizeChanged(II)V
    .locals 3
    .param p1, "width"    # I
    .param p2, "height"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 286
    iput p1, p0, Lorg/chromium/content/browser/ContentVideoView;->mVideoWidth:I

    .line 287
    iput p2, p0, Lorg/chromium/content/browser/ContentVideoView;->mVideoHeight:I

    .line 289
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mVideoSurfaceView:Lorg/chromium/content/browser/ContentVideoView$VideoSurfaceView;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentVideoView$VideoSurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iget v1, p0, Lorg/chromium/content/browser/ContentVideoView;->mVideoWidth:I

    iget v2, p0, Lorg/chromium/content/browser/ContentVideoView;->mVideoHeight:I

    invoke-interface {v0, v1, v2}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    .line 290
    return-void
.end method


# virtual methods
.method public acquireAnchorView()Landroid/view/View;
    .locals 2

    .prologue
    .line 509
    new-instance v0, Landroid/view/View;

    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentVideoView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 510
    .local v0, "anchorView":Landroid/view/View;
    invoke-virtual {p0, v0}, Lorg/chromium/content/browser/ContentVideoView;->addView(Landroid/view/View;)V

    .line 511
    return-object v0
.end method

.method protected destroyContentVideoView(Z)V
    .locals 2
    .param p1, "nativeViewDestroyed"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 482
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mVideoSurfaceView:Lorg/chromium/content/browser/ContentVideoView$VideoSurfaceView;

    if-eqz v0, :cond_0

    .line 483
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentVideoView;->removeSurfaceView()V

    .line 484
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lorg/chromium/content/browser/ContentVideoView;->setVisibility(I)V

    .line 487
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mClient:Lorg/chromium/content/browser/ContentVideoViewClient;

    invoke-interface {v0}, Lorg/chromium/content/browser/ContentVideoViewClient;->onDestroyContentVideoView()V

    .line 489
    :cond_0
    if-eqz p1, :cond_1

    .line 490
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    .line 492
    :cond_1
    return-void
.end method

.method public exitFullscreen(Z)V
    .locals 12
    .param p1, "relaseMediaPlayer"    # Z

    .prologue
    const-wide/16 v10, 0x0

    .line 453
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/chromium/content/browser/ContentVideoView;->destroyContentVideoView(Z)V

    .line 454
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    cmp-long v0, v0, v10

    if-eqz v0, :cond_2

    .line 455
    iget-boolean v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mUmaRecorded:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mPossibleAccidentalChange:Z

    if-nez v0, :cond_1

    .line 456
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 457
    .local v8, "currentTime":J
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mOrientationChangedTime:J

    iget-wide v2, p0, Lorg/chromium/content/browser/ContentVideoView;->mPlaybackStartTime:J

    sub-long v4, v0, v2

    .line 458
    .local v4, "timeBeforeOrientationChange":J
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mOrientationChangedTime:J

    sub-long v6, v8, v0

    .line 459
    .local v6, "timeAfterOrientationChange":J
    cmp-long v0, v4, v10

    if-nez v0, :cond_0

    .line 460
    move-wide v4, v6

    .line 461
    const-wide/16 v6, 0x0

    .line 463
    :cond_0
    iget-wide v1, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    iget-boolean v3, p0, Lorg/chromium/content/browser/ContentVideoView;->mInitialOrientation:Z

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lorg/chromium/content/browser/ContentVideoView;->nativeRecordExitFullscreenPlayback(JZJJ)V

    .line 466
    .end local v4    # "timeBeforeOrientationChange":J
    .end local v6    # "timeAfterOrientationChange":J
    .end local v8    # "currentTime":J
    :cond_1
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    invoke-direct {p0, v0, v1, p1}, Lorg/chromium/content/browser/ContentVideoView;->nativeExitFullscreen(JZ)V

    .line 467
    iput-wide v10, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    .line 469
    :cond_2
    return-void
.end method

.method protected getContentVideoViewClient()Lorg/chromium/content/browser/ContentVideoViewClient;
    .locals 1

    .prologue
    .line 189
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mClient:Lorg/chromium/content/browser/ContentVideoViewClient;

    return-object v0
.end method

.method protected getCurrentPosition()I
    .locals 4

    .prologue
    .line 408
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentVideoView;->isInPlaybackState()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 409
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/ContentVideoView;->nativeGetCurrentPosition(J)I

    move-result v0

    .line 411
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected getDuration()I
    .locals 4

    .prologue
    .line 392
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentVideoView;->isInPlaybackState()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 393
    iget v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mDuration:I

    if-lez v0, :cond_0

    .line 394
    iget v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mDuration:I

    .line 404
    :goto_0
    return v0

    .line 396
    :cond_0
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 397
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/ContentVideoView;->nativeGetDurationInMilliSeconds(J)I

    move-result v0

    iput v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mDuration:I

    .line 401
    :goto_1
    iget v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mDuration:I

    goto :goto_0

    .line 399
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mDuration:I

    goto :goto_1

    .line 403
    :cond_2
    const/4 v0, -0x1

    iput v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mDuration:I

    .line 404
    iget v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mDuration:I

    goto :goto_0
.end method

.method protected getSurfaceView()Landroid/view/SurfaceView;
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mVideoSurfaceView:Lorg/chromium/content/browser/ContentVideoView$VideoSurfaceView;

    return-object v0
.end method

.method protected isInPlaybackState()Z
    .locals 2

    .prologue
    .line 367
    iget v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mCurrentState:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mCurrentState:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isPlaying()Z
    .locals 4

    .prologue
    .line 421
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/ContentVideoView;->nativeIsPlaying(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected onBufferingUpdate(I)V
    .locals 0
    .param p1, "percent"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 294
    return-void
.end method

.method protected onCompletion()V
    .locals 1

    .prologue
    .line 362
    const/4 v0, 0x3

    iput v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mCurrentState:I

    .line 363
    return-void
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 500
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 501
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/chromium/content/browser/ContentVideoView;->exitFullscreen(Z)V

    .line 502
    const/4 v0, 0x1

    .line 504
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onMediaPlayerError(I)V
    .locals 7
    .param p1, "errorType"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v6, 0x3

    const/4 v5, -0x1

    .line 229
    const-string v2, "ContentVideoView"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "OnMediaPlayerError: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 230
    iget v2, p0, Lorg/chromium/content/browser/ContentVideoView;->mCurrentState:I

    if-eq v2, v5, :cond_0

    iget v2, p0, Lorg/chromium/content/browser/ContentVideoView;->mCurrentState:I

    if-ne v2, v6, :cond_1

    .line 282
    :cond_0
    :goto_0
    return-void

    .line 235
    :cond_1
    if-eq p1, v6, :cond_0

    .line 239
    iput v5, p0, Lorg/chromium/content/browser/ContentVideoView;->mCurrentState:I

    .line 241
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentVideoView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lorg/chromium/content/browser/ContentVideoView;->isActivityContext(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 242
    const-string v2, "ContentVideoView"

    const-string v3, "Unable to show alert dialog because it requires an activity context"

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 254
    :cond_2
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentVideoView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 257
    const/4 v2, 0x2

    if-ne p1, v2, :cond_3

    .line 258
    iget-object v1, p0, Lorg/chromium/content/browser/ContentVideoView;->mPlaybackErrorText:Ljava/lang/String;

    .line 264
    .local v1, "message":Ljava/lang/String;
    :goto_1
    :try_start_0
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentVideoView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iget-object v3, p0, Lorg/chromium/content/browser/ContentVideoView;->mErrorTitle:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    iget-object v3, p0, Lorg/chromium/content/browser/ContentVideoView;->mErrorButton:Ljava/lang/String;

    new-instance v4, Lorg/chromium/content/browser/ContentVideoView$2;

    invoke-direct {v4, p0}, Lorg/chromium/content/browser/ContentVideoView$2;-><init>(Lorg/chromium/content/browser/ContentVideoView;)V

    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 278
    :catch_0
    move-exception v0

    .line 279
    .local v0, "e":Ljava/lang/RuntimeException;
    const-string v2, "ContentVideoView"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot show the alert dialog, error message: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 260
    .end local v0    # "e":Ljava/lang/RuntimeException;
    .end local v1    # "message":Ljava/lang/String;
    :cond_3
    iget-object v1, p0, Lorg/chromium/content/browser/ContentVideoView;->mUnknownErrorText:Ljava/lang/String;

    .restart local v1    # "message":Ljava/lang/String;
    goto :goto_1
.end method

.method protected onUpdateMediaMetadata(IIIZZZ)V
    .locals 6
    .param p1, "videoWidth"    # I
    .param p2, "videoHeight"    # I
    .param p3, "duration"    # I
    .param p4, "canPause"    # Z
    .param p5, "canSeekBack"    # Z
    .param p6, "canSeekForward"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v2, 0x1

    .line 309
    iput p3, p0, Lorg/chromium/content/browser/ContentVideoView;->mDuration:I

    .line 310
    iget-object v1, p0, Lorg/chromium/content/browser/ContentVideoView;->mProgressView:Landroid/view/View;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 311
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentVideoView;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_1

    move v1, v2

    :goto_0
    iput v1, p0, Lorg/chromium/content/browser/ContentVideoView;->mCurrentState:I

    .line 312
    invoke-direct {p0, p1, p2}, Lorg/chromium/content/browser/ContentVideoView;->onVideoSizeChanged(II)V

    .line 313
    iget-boolean v1, p0, Lorg/chromium/content/browser/ContentVideoView;->mUmaRecorded:Z

    if-eqz v1, :cond_2

    .line 328
    :cond_0
    :goto_1
    return-void

    .line 311
    :cond_1
    const/4 v1, 0x2

    goto :goto_0

    .line 315
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentVideoView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v3, "accelerometer_rotation"

    invoke-static {v1, v3}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-eqz v1, :cond_0

    .line 322
    invoke-direct {p0}, Lorg/chromium/content/browser/ContentVideoView;->isOrientationPortrait()Z

    move-result v1

    iput-boolean v1, p0, Lorg/chromium/content/browser/ContentVideoView;->mInitialOrientation:Z

    .line 323
    iput-boolean v2, p0, Lorg/chromium/content/browser/ContentVideoView;->mUmaRecorded:Z

    .line 324
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iput-wide v4, p0, Lorg/chromium/content/browser/ContentVideoView;->mPlaybackStartTime:J

    .line 325
    iget-wide v4, p0, Lorg/chromium/content/browser/ContentVideoView;->mPlaybackStartTime:J

    iput-wide v4, p0, Lorg/chromium/content/browser/ContentVideoView;->mOrientationChangedTime:J

    .line 326
    iget-wide v4, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    if-le p2, p1, :cond_3

    :goto_2
    iget-boolean v1, p0, Lorg/chromium/content/browser/ContentVideoView;->mInitialOrientation:Z

    invoke-direct {p0, v4, v5, v2, v1}, Lorg/chromium/content/browser/ContentVideoView;->nativeRecordFullscreenPlayback(JZZ)V

    goto :goto_1

    .line 319
    :catch_0
    move-exception v0

    .line 320
    .local v0, "e":Landroid/provider/Settings$SettingNotFoundException;
    goto :goto_1

    .line 326
    .end local v0    # "e":Landroid/provider/Settings$SettingNotFoundException;
    :cond_3
    const/4 v2, 0x0

    goto :goto_2
.end method

.method protected openVideo()V
    .locals 4
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 351
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mSurfaceHolder:Landroid/view/SurfaceHolder;

    if-eqz v0, :cond_0

    .line 352
    const/4 v0, 0x0

    iput v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mCurrentState:I

    .line 353
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 354
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/ContentVideoView;->nativeRequestMediaMetadata(J)V

    .line 355
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    iget-object v2, p0, Lorg/chromium/content/browser/ContentVideoView;->mSurfaceHolder:Landroid/view/SurfaceHolder;

    invoke-interface {v2}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lorg/chromium/content/browser/ContentVideoView;->nativeSetSurface(JLandroid/view/Surface;)V

    .line 359
    :cond_0
    return-void
.end method

.method protected pause()V
    .locals 4

    .prologue
    .line 380
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentVideoView;->isInPlaybackState()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 381
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentVideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 382
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 383
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/ContentVideoView;->nativePause(J)V

    .line 385
    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mCurrentState:I

    .line 388
    :cond_1
    return-void
.end method

.method public releaseAnchorView(Landroid/view/View;)V
    .locals 0
    .param p1, "anchorView"    # Landroid/view/View;

    .prologue
    .line 521
    invoke-virtual {p0, p1}, Lorg/chromium/content/browser/ContentVideoView;->removeView(Landroid/view/View;)V

    .line 522
    return-void
.end method

.method public removeSurfaceView()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 446
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mVideoSurfaceView:Lorg/chromium/content/browser/ContentVideoView$VideoSurfaceView;

    invoke-virtual {p0, v0}, Lorg/chromium/content/browser/ContentVideoView;->removeView(Landroid/view/View;)V

    .line 447
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mProgressView:Landroid/view/View;

    invoke-virtual {p0, v0}, Lorg/chromium/content/browser/ContentVideoView;->removeView(Landroid/view/View;)V

    .line 448
    iput-object v1, p0, Lorg/chromium/content/browser/ContentVideoView;->mVideoSurfaceView:Lorg/chromium/content/browser/ContentVideoView$VideoSurfaceView;

    .line 449
    iput-object v1, p0, Lorg/chromium/content/browser/ContentVideoView;->mProgressView:Landroid/view/View;

    .line 450
    return-void
.end method

.method protected seekTo(I)V
    .locals 4
    .param p1, "msec"    # I

    .prologue
    .line 415
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 416
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    invoke-direct {p0, v0, v1, p1}, Lorg/chromium/content/browser/ContentVideoView;->nativeSeekTo(JI)V

    .line 418
    :cond_0
    return-void
.end method

.method public setAnchorViewPosition(Landroid/view/View;FFFF)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "x"    # F
    .param p3, "y"    # F
    .param p4, "width"    # F
    .param p5, "height"    # F

    .prologue
    .line 516
    const-string v0, "ContentVideoView"

    const-string v1, "setAnchorViewPosition isn\'t implemented"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 517
    return-void
.end method

.method protected showContentVideoView()V
    .locals 5

    .prologue
    const/16 v4, 0x11

    const/4 v3, -0x2

    .line 207
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mVideoSurfaceView:Lorg/chromium/content/browser/ContentVideoView$VideoSurfaceView;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentVideoView$VideoSurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 208
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mVideoSurfaceView:Lorg/chromium/content/browser/ContentVideoView$VideoSurfaceView;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v3, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p0, v0, v1}, Lorg/chromium/content/browser/ContentVideoView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 213
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mClient:Lorg/chromium/content/browser/ContentVideoViewClient;

    invoke-interface {v0}, Lorg/chromium/content/browser/ContentVideoViewClient;->getVideoLoadingProgressView()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mProgressView:Landroid/view/View;

    .line 214
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mProgressView:Landroid/view/View;

    if-nez v0, :cond_0

    .line 215
    new-instance v0, Lorg/chromium/content/browser/ContentVideoView$ProgressView;

    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentVideoView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lorg/chromium/content/browser/ContentVideoView;->mVideoLoadingText:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lorg/chromium/content/browser/ContentVideoView$ProgressView;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mProgressView:Landroid/view/View;

    .line 217
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mProgressView:Landroid/view/View;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v3, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p0, v0, v1}, Lorg/chromium/content/browser/ContentVideoView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 221
    return-void
.end method

.method protected start()V
    .locals 4

    .prologue
    .line 371
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentVideoView;->isInPlaybackState()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 372
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 373
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/ContentVideoView;->nativePlay(J)V

    .line 375
    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mCurrentState:I

    .line 377
    :cond_1
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0
    .param p1, "holder"    # Landroid/view/SurfaceHolder;
    .param p2, "format"    # I
    .param p3, "width"    # I
    .param p4, "height"    # I

    .prologue
    .line 332
    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 0
    .param p1, "holder"    # Landroid/view/SurfaceHolder;

    .prologue
    .line 336
    iput-object p1, p0, Lorg/chromium/content/browser/ContentVideoView;->mSurfaceHolder:Landroid/view/SurfaceHolder;

    .line 337
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentVideoView;->openVideo()V

    .line 338
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 5
    .param p1, "holder"    # Landroid/view/SurfaceHolder;

    .prologue
    const/4 v4, 0x0

    .line 342
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 343
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mNativeContentVideoView:J

    invoke-direct {p0, v0, v1, v4}, Lorg/chromium/content/browser/ContentVideoView;->nativeSetSurface(JLandroid/view/Surface;)V

    .line 345
    :cond_0
    iput-object v4, p0, Lorg/chromium/content/browser/ContentVideoView;->mSurfaceHolder:Landroid/view/SurfaceHolder;

    .line 346
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView;->mExitFullscreenRunnable:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lorg/chromium/content/browser/ContentVideoView;->post(Ljava/lang/Runnable;)Z

    .line 347
    return-void
.end method

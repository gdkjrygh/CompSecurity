.class Lcom/jirbo/adcolony/e;
.super Landroid/view/SurfaceView;
.source "SourceFile"

# interfaces
.implements Landroid/widget/MediaController$MediaPlayerControl;


# static fields
.field static final e:I = -0x1

.field static final f:I = 0x0

.field static final g:I = 0x1

.field static final h:I = 0x2

.field static final i:I = 0x3

.field static final j:I = 0x4

.field static final k:I = 0x5

.field static final l:I = 0x6

.field static final m:I = 0x7

.field static final n:I = 0x8


# instance fields
.field A:Landroid/media/MediaPlayer$OnErrorListener;

.field B:I

.field C:Z

.field D:Z

.field E:Z

.field F:Z

.field G:I

.field H:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

.field I:Landroid/media/MediaPlayer$OnPreparedListener;

.field J:Landroid/view/SurfaceHolder$Callback;

.field private K:Landroid/media/MediaPlayer$OnCompletionListener;

.field private L:Landroid/media/MediaPlayer$OnErrorListener;

.field private M:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

.field a:Ljava/lang/String;

.field b:Landroid/net/Uri;

.field c:Ljava/io/FileDescriptor;

.field d:I

.field o:I

.field p:I

.field q:Landroid/view/SurfaceHolder;

.field r:Landroid/media/MediaPlayer;

.field s:I

.field t:I

.field u:I

.field v:I

.field w:Landroid/widget/MediaController;

.field x:Landroid/media/MediaPlayer$OnCompletionListener;

.field y:Landroid/media/MediaPlayer$OnPreparedListener;

.field z:I


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 104
    invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 57
    const-string v0, "ADCCustomVideoView"

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->a:Ljava/lang/String;

    .line 80
    iput v1, p0, Lcom/jirbo/adcolony/e;->o:I

    .line 81
    iput v1, p0, Lcom/jirbo/adcolony/e;->p:I

    .line 84
    iput-object v2, p0, Lcom/jirbo/adcolony/e;->q:Landroid/view/SurfaceHolder;

    .line 85
    iput-object v2, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    .line 304
    new-instance v0, Lcom/jirbo/adcolony/e$1;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e$1;-><init>(Lcom/jirbo/adcolony/e;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->H:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    .line 315
    new-instance v0, Lcom/jirbo/adcolony/e$2;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e$2;-><init>(Lcom/jirbo/adcolony/e;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->I:Landroid/media/MediaPlayer$OnPreparedListener;

    .line 365
    new-instance v0, Lcom/jirbo/adcolony/e$3;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e$3;-><init>(Lcom/jirbo/adcolony/e;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->K:Landroid/media/MediaPlayer$OnCompletionListener;

    .line 379
    new-instance v0, Lcom/jirbo/adcolony/e$4;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e$4;-><init>(Lcom/jirbo/adcolony/e;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->L:Landroid/media/MediaPlayer$OnErrorListener;

    .line 432
    new-instance v0, Lcom/jirbo/adcolony/e$5;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e$5;-><init>(Lcom/jirbo/adcolony/e;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->M:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

    .line 474
    new-instance v0, Lcom/jirbo/adcolony/e$6;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e$6;-><init>(Lcom/jirbo/adcolony/e;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->J:Landroid/view/SurfaceHolder$Callback;

    .line 105
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->e()V

    .line 106
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 116
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/jirbo/adcolony/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 117
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->e()V

    .line 118
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 121
    invoke-direct {p0, p1, p2, p3}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 57
    const-string v0, "ADCCustomVideoView"

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->a:Ljava/lang/String;

    .line 80
    iput v1, p0, Lcom/jirbo/adcolony/e;->o:I

    .line 81
    iput v1, p0, Lcom/jirbo/adcolony/e;->p:I

    .line 84
    iput-object v2, p0, Lcom/jirbo/adcolony/e;->q:Landroid/view/SurfaceHolder;

    .line 85
    iput-object v2, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    .line 304
    new-instance v0, Lcom/jirbo/adcolony/e$1;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e$1;-><init>(Lcom/jirbo/adcolony/e;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->H:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    .line 315
    new-instance v0, Lcom/jirbo/adcolony/e$2;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e$2;-><init>(Lcom/jirbo/adcolony/e;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->I:Landroid/media/MediaPlayer$OnPreparedListener;

    .line 365
    new-instance v0, Lcom/jirbo/adcolony/e$3;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e$3;-><init>(Lcom/jirbo/adcolony/e;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->K:Landroid/media/MediaPlayer$OnCompletionListener;

    .line 379
    new-instance v0, Lcom/jirbo/adcolony/e$4;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e$4;-><init>(Lcom/jirbo/adcolony/e;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->L:Landroid/media/MediaPlayer$OnErrorListener;

    .line 432
    new-instance v0, Lcom/jirbo/adcolony/e$5;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e$5;-><init>(Lcom/jirbo/adcolony/e;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->M:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

    .line 474
    new-instance v0, Lcom/jirbo/adcolony/e$6;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e$6;-><init>(Lcom/jirbo/adcolony/e;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->J:Landroid/view/SurfaceHolder$Callback;

    .line 122
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->e()V

    .line 123
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Z)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 110
    invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 57
    const-string v0, "ADCCustomVideoView"

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->a:Ljava/lang/String;

    .line 80
    iput v1, p0, Lcom/jirbo/adcolony/e;->o:I

    .line 81
    iput v1, p0, Lcom/jirbo/adcolony/e;->p:I

    .line 84
    iput-object v2, p0, Lcom/jirbo/adcolony/e;->q:Landroid/view/SurfaceHolder;

    .line 85
    iput-object v2, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    .line 304
    new-instance v0, Lcom/jirbo/adcolony/e$1;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e$1;-><init>(Lcom/jirbo/adcolony/e;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->H:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    .line 315
    new-instance v0, Lcom/jirbo/adcolony/e$2;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e$2;-><init>(Lcom/jirbo/adcolony/e;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->I:Landroid/media/MediaPlayer$OnPreparedListener;

    .line 365
    new-instance v0, Lcom/jirbo/adcolony/e$3;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e$3;-><init>(Lcom/jirbo/adcolony/e;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->K:Landroid/media/MediaPlayer$OnCompletionListener;

    .line 379
    new-instance v0, Lcom/jirbo/adcolony/e$4;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e$4;-><init>(Lcom/jirbo/adcolony/e;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->L:Landroid/media/MediaPlayer$OnErrorListener;

    .line 432
    new-instance v0, Lcom/jirbo/adcolony/e$5;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e$5;-><init>(Lcom/jirbo/adcolony/e;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->M:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

    .line 474
    new-instance v0, Lcom/jirbo/adcolony/e$6;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e$6;-><init>(Lcom/jirbo/adcolony/e;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->J:Landroid/view/SurfaceHolder$Callback;

    .line 111
    iput-boolean p2, p0, Lcom/jirbo/adcolony/e;->F:Z

    .line 112
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->e()V

    .line 113
    return-void
.end method

.method static synthetic a(Lcom/jirbo/adcolony/e;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->f()V

    return-void
.end method

.method static synthetic a(Lcom/jirbo/adcolony/e;Z)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0, p1}, Lcom/jirbo/adcolony/e;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 522
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 523
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 524
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 525
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    .line 526
    iput v1, p0, Lcom/jirbo/adcolony/e;->o:I

    .line 527
    if-eqz p1, :cond_0

    .line 528
    iput v1, p0, Lcom/jirbo/adcolony/e;->p:I

    .line 531
    :cond_0
    return-void
.end method

.method private e()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 177
    iput v2, p0, Lcom/jirbo/adcolony/e;->s:I

    .line 178
    iput v2, p0, Lcom/jirbo/adcolony/e;->t:I

    .line 179
    invoke-virtual {p0}, Lcom/jirbo/adcolony/e;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iget-object v1, p0, Lcom/jirbo/adcolony/e;->J:Landroid/view/SurfaceHolder$Callback;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 180
    invoke-virtual {p0}, Lcom/jirbo/adcolony/e;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setType(I)V

    .line 181
    invoke-virtual {p0, v3}, Lcom/jirbo/adcolony/e;->setFocusable(Z)V

    .line 182
    invoke-virtual {p0, v3}, Lcom/jirbo/adcolony/e;->setFocusableInTouchMode(Z)V

    .line 183
    iget-boolean v0, p0, Lcom/jirbo/adcolony/e;->F:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/jirbo/adcolony/e;->requestFocus()Z

    .line 184
    :cond_0
    iput v2, p0, Lcom/jirbo/adcolony/e;->o:I

    .line 185
    iput v2, p0, Lcom/jirbo/adcolony/e;->p:I

    .line 186
    return-void
.end method

.method private f()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    const/4 v4, -0x1

    .line 232
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->b:Landroid/net/Uri;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/e;->c:Ljava/io/FileDescriptor;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->q:Landroid/view/SurfaceHolder;

    if-nez v0, :cond_2

    .line 283
    :cond_1
    :goto_0
    return-void

    .line 238
    :cond_2
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.android.music.musicservicecommand"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 239
    const-string v1, "command"

    const-string v2, "pause"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 240
    invoke-virtual {p0}, Lcom/jirbo/adcolony/e;->b()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/Activity;->sendBroadcast(Landroid/content/Intent;)V

    .line 244
    invoke-direct {p0, v5}, Lcom/jirbo/adcolony/e;->a(Z)V

    .line 246
    :try_start_0
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    .line 247
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/jirbo/adcolony/e;->I:Landroid/media/MediaPlayer$OnPreparedListener;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 248
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/jirbo/adcolony/e;->H:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    .line 249
    const/4 v0, -0x1

    iput v0, p0, Lcom/jirbo/adcolony/e;->d:I

    .line 250
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/jirbo/adcolony/e;->K:Landroid/media/MediaPlayer$OnCompletionListener;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 251
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/jirbo/adcolony/e;->L:Landroid/media/MediaPlayer$OnErrorListener;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 252
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/jirbo/adcolony/e;->M:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V

    .line 253
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/e;->z:I

    .line 254
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->b:Landroid/net/Uri;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-virtual {p0}, Lcom/jirbo/adcolony/e;->b()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcom/jirbo/adcolony/e;->b:Landroid/net/Uri;

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 256
    :goto_1
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/jirbo/adcolony/e;->q:Landroid/view/SurfaceHolder;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    .line 257
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    .line 258
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setScreenOnWhilePlaying(Z)V

    .line 261
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    .line 265
    const/4 v0, 0x1

    iput v0, p0, Lcom/jirbo/adcolony/e;->o:I

    .line 266
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->g()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 267
    :catch_0
    move-exception v0

    .line 268
    iget-object v1, p0, Lcom/jirbo/adcolony/e;->b:Landroid/net/Uri;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/jirbo/adcolony/e;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to open content: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/jirbo/adcolony/e;->b:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 270
    :goto_2
    iput v4, p0, Lcom/jirbo/adcolony/e;->o:I

    .line 271
    iput v4, p0, Lcom/jirbo/adcolony/e;->p:I

    .line 272
    iget-object v1, p0, Lcom/jirbo/adcolony/e;->L:Landroid/media/MediaPlayer$OnErrorListener;

    iget-object v2, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-interface {v1, v2, v6, v5}, Landroid/media/MediaPlayer$OnErrorListener;->onError(Landroid/media/MediaPlayer;II)Z

    .line 273
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_0

    .line 255
    :cond_3
    :try_start_1
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/jirbo/adcolony/e;->c:Ljava/io/FileDescriptor;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 275
    :catch_1
    move-exception v0

    .line 276
    iget-object v1, p0, Lcom/jirbo/adcolony/e;->b:Landroid/net/Uri;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/jirbo/adcolony/e;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to open content: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/jirbo/adcolony/e;->b:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 278
    :goto_3
    iput v4, p0, Lcom/jirbo/adcolony/e;->o:I

    .line 279
    iput v4, p0, Lcom/jirbo/adcolony/e;->p:I

    .line 280
    iget-object v1, p0, Lcom/jirbo/adcolony/e;->L:Landroid/media/MediaPlayer$OnErrorListener;

    iget-object v2, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-interface {v1, v2, v6, v5}, Landroid/media/MediaPlayer$OnErrorListener;->onError(Landroid/media/MediaPlayer;II)Z

    .line 281
    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    goto/16 :goto_0

    .line 269
    :cond_4
    iget-object v1, p0, Lcom/jirbo/adcolony/e;->a:Ljava/lang/String;

    const-string v2, "Unable to open content"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 277
    :cond_5
    iget-object v1, p0, Lcom/jirbo/adcolony/e;->a:Ljava/lang/String;

    const-string v2, "Unable to open content"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3
.end method

.method private g()V
    .locals 2

    .prologue
    .line 295
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    if-eqz v0, :cond_0

    .line 296
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    invoke-virtual {v0, p0}, Landroid/widget/MediaController;->setMediaPlayer(Landroid/widget/MediaController$MediaPlayerControl;)V

    .line 297
    invoke-virtual {p0}, Lcom/jirbo/adcolony/e;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/View;

    if-eqz v0, :cond_1

    .line 298
    invoke-virtual {p0}, Lcom/jirbo/adcolony/e;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 299
    :goto_0
    iget-object v1, p0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    invoke-virtual {v1, v0}, Landroid/widget/MediaController;->setAnchorView(Landroid/view/View;)V

    .line 300
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->i()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/MediaController;->setEnabled(Z)V

    .line 302
    :cond_0
    return-void

    :cond_1
    move-object v0, p0

    .line 298
    goto :goto_0
.end method

.method private h()V
    .locals 1

    .prologue
    .line 582
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    invoke-virtual {v0}, Landroid/widget/MediaController;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 583
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    invoke-virtual {v0}, Landroid/widget/MediaController;->hide()V

    .line 587
    :goto_0
    return-void

    .line 585
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    invoke-virtual {v0}, Landroid/widget/MediaController;->show()V

    goto :goto_0
.end method

.method private i()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 674
    iget-object v1, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/jirbo/adcolony/e;->o:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    iget v1, p0, Lcom/jirbo/adcolony/e;->o:I

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/jirbo/adcolony/e;->o:I

    if-eq v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(II)I
    .locals 2

    .prologue
    .line 148
    .line 149
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 150
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 152
    sparse-switch v1, :sswitch_data_0

    .line 173
    :goto_0
    :sswitch_0
    return p1

    .line 165
    :sswitch_1
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_0

    :sswitch_2
    move p1, v0

    .line 170
    goto :goto_0

    .line 152
    nop

    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_1
        0x0 -> :sswitch_0
        0x40000000 -> :sswitch_2
    .end sparse-switch
.end method

.method public a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 220
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 222
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 223
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    .line 224
    iput v1, p0, Lcom/jirbo/adcolony/e;->o:I

    .line 225
    iput v1, p0, Lcom/jirbo/adcolony/e;->p:I

    .line 227
    :cond_0
    return-void
.end method

.method public a(Landroid/media/MediaPlayer$OnCompletionListener;)V
    .locals 0

    .prologue
    .line 458
    iput-object p1, p0, Lcom/jirbo/adcolony/e;->x:Landroid/media/MediaPlayer$OnCompletionListener;

    .line 459
    return-void
.end method

.method public a(Landroid/media/MediaPlayer$OnErrorListener;)V
    .locals 0

    .prologue
    .line 471
    iput-object p1, p0, Lcom/jirbo/adcolony/e;->A:Landroid/media/MediaPlayer$OnErrorListener;

    .line 472
    return-void
.end method

.method public a(Landroid/media/MediaPlayer$OnPreparedListener;)V
    .locals 0

    .prologue
    .line 447
    iput-object p1, p0, Lcom/jirbo/adcolony/e;->y:Landroid/media/MediaPlayer$OnPreparedListener;

    .line 448
    return-void
.end method

.method public a(Landroid/net/Uri;)V
    .locals 1

    .prologue
    .line 212
    iput-object p1, p0, Lcom/jirbo/adcolony/e;->b:Landroid/net/Uri;

    .line 213
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/e;->B:I

    .line 214
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->f()V

    .line 215
    invoke-virtual {p0}, Lcom/jirbo/adcolony/e;->requestLayout()V

    .line 216
    invoke-virtual {p0}, Lcom/jirbo/adcolony/e;->invalidate()V

    .line 217
    return-void
.end method

.method public a(Landroid/widget/MediaController;)V
    .locals 1

    .prologue
    .line 287
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    if-eqz v0, :cond_0

    .line 288
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    invoke-virtual {v0}, Landroid/widget/MediaController;->hide()V

    .line 290
    :cond_0
    iput-object p1, p0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    .line 291
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->g()V

    .line 292
    return-void
.end method

.method public a(Ljava/io/FileDescriptor;)V
    .locals 1

    .prologue
    .line 200
    iput-object p1, p0, Lcom/jirbo/adcolony/e;->c:Ljava/io/FileDescriptor;

    .line 201
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/e;->B:I

    .line 202
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->f()V

    .line 203
    invoke-virtual {p0}, Lcom/jirbo/adcolony/e;->requestLayout()V

    .line 204
    invoke-virtual {p0}, Lcom/jirbo/adcolony/e;->invalidate()V

    .line 205
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 195
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/e;->a(Landroid/net/Uri;)V

    .line 196
    return-void
.end method

.method b()Landroid/app/Activity;
    .locals 1

    .prologue
    .line 229
    invoke-static {}, Lcom/jirbo/adcolony/AdColony;->activity()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 2

    .prologue
    const/4 v1, 0x6

    .line 608
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 609
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 610
    iget v0, p0, Lcom/jirbo/adcolony/e;->o:I

    iput v0, p0, Lcom/jirbo/adcolony/e;->G:I

    .line 611
    iput v1, p0, Lcom/jirbo/adcolony/e;->o:I

    .line 612
    iput v1, p0, Lcom/jirbo/adcolony/e;->p:I

    .line 614
    :cond_0
    return-void
.end method

.method public canPause()Z
    .locals 1

    .prologue
    .line 681
    iget-boolean v0, p0, Lcom/jirbo/adcolony/e;->C:Z

    return v0
.end method

.method public canSeekBackward()Z
    .locals 1

    .prologue
    .line 685
    iget-boolean v0, p0, Lcom/jirbo/adcolony/e;->D:Z

    return v0
.end method

.method public canSeekForward()Z
    .locals 1

    .prologue
    .line 689
    iget-boolean v0, p0, Lcom/jirbo/adcolony/e;->E:Z

    return v0
.end method

.method public d()V
    .locals 2

    .prologue
    const/4 v1, 0x6

    .line 617
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->q:Landroid/view/SurfaceHolder;

    if-nez v0, :cond_1

    iget v0, p0, Lcom/jirbo/adcolony/e;->o:I

    if-ne v0, v1, :cond_1

    .line 618
    const/4 v0, 0x7

    iput v0, p0, Lcom/jirbo/adcolony/e;->p:I

    .line 630
    :cond_0
    :goto_0
    return-void

    .line 621
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/jirbo/adcolony/e;->o:I

    if-ne v0, v1, :cond_2

    .line 622
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 623
    iget v0, p0, Lcom/jirbo/adcolony/e;->G:I

    iput v0, p0, Lcom/jirbo/adcolony/e;->o:I

    .line 624
    iget v0, p0, Lcom/jirbo/adcolony/e;->G:I

    iput v0, p0, Lcom/jirbo/adcolony/e;->p:I

    goto :goto_0

    .line 627
    :cond_2
    iget v0, p0, Lcom/jirbo/adcolony/e;->o:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 628
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->f()V

    goto :goto_0
.end method

.method public getAudioSessionId()I
    .locals 1

    .prologue
    .line 190
    const/4 v0, 0x0

    return v0
.end method

.method public getBufferPercentage()I
    .locals 1

    .prologue
    .line 667
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 668
    iget v0, p0, Lcom/jirbo/adcolony/e;->z:I

    .line 670
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getCurrentPosition()I
    .locals 1

    .prologue
    .line 646
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 647
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    .line 649
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getDuration()I
    .locals 1

    .prologue
    .line 634
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 635
    iget v0, p0, Lcom/jirbo/adcolony/e;->d:I

    if-lez v0, :cond_0

    .line 636
    iget v0, p0, Lcom/jirbo/adcolony/e;->d:I

    .line 642
    :goto_0
    return v0

    .line 638
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/e;->d:I

    .line 639
    iget v0, p0, Lcom/jirbo/adcolony/e;->d:I

    goto :goto_0

    .line 641
    :cond_1
    const/4 v0, -0x1

    iput v0, p0, Lcom/jirbo/adcolony/e;->d:I

    .line 642
    iget v0, p0, Lcom/jirbo/adcolony/e;->d:I

    goto :goto_0
.end method

.method public isPlaying()Z
    .locals 1

    .prologue
    .line 663
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 552
    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/16 v0, 0x18

    if-eq p1, v0, :cond_1

    const/16 v0, 0x19

    if-eq p1, v0, :cond_1

    const/16 v0, 0x52

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_1

    move v0, v1

    .line 558
    :goto_0
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->i()Z

    move-result v2

    if-eqz v2, :cond_4

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    if-eqz v0, :cond_4

    .line 559
    const/16 v0, 0x4f

    if-eq p1, v0, :cond_0

    const/16 v0, 0x55

    if-ne p1, v0, :cond_3

    .line 561
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 562
    invoke-virtual {p0}, Lcom/jirbo/adcolony/e;->pause()V

    .line 563
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    invoke-virtual {v0}, Landroid/widget/MediaController;->show()V

    .line 578
    :goto_1
    return v1

    .line 552
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 565
    :cond_2
    invoke-virtual {p0}, Lcom/jirbo/adcolony/e;->start()V

    .line 566
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    invoke-virtual {v0}, Landroid/widget/MediaController;->hide()V

    goto :goto_1

    .line 569
    :cond_3
    const/16 v0, 0x56

    if-ne p1, v0, :cond_5

    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    .line 570
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 571
    invoke-virtual {p0}, Lcom/jirbo/adcolony/e;->pause()V

    .line 572
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    invoke-virtual {v0}, Landroid/widget/MediaController;->show()V

    .line 578
    :cond_4
    :goto_2
    invoke-super {p0, p1, p2}, Landroid/view/SurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v1

    goto :goto_1

    .line 574
    :cond_5
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->h()V

    goto :goto_2
.end method

.method protected onMeasure(II)V
    .locals 4

    .prologue
    .line 128
    iget v0, p0, Lcom/jirbo/adcolony/e;->s:I

    invoke-static {v0, p1}, Lcom/jirbo/adcolony/e;->getDefaultSize(II)I

    move-result v1

    .line 129
    iget v0, p0, Lcom/jirbo/adcolony/e;->t:I

    invoke-static {v0, p2}, Lcom/jirbo/adcolony/e;->getDefaultSize(II)I

    move-result v0

    .line 130
    iget v2, p0, Lcom/jirbo/adcolony/e;->s:I

    if-lez v2, :cond_0

    iget v2, p0, Lcom/jirbo/adcolony/e;->t:I

    if-lez v2, :cond_0

    .line 131
    iget v2, p0, Lcom/jirbo/adcolony/e;->s:I

    mul-int/2addr v2, v0

    iget v3, p0, Lcom/jirbo/adcolony/e;->t:I

    mul-int/2addr v3, v1

    if-le v2, v3, :cond_1

    .line 133
    iget v0, p0, Lcom/jirbo/adcolony/e;->t:I

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/jirbo/adcolony/e;->s:I

    div-int/2addr v0, v2

    .line 144
    :cond_0
    :goto_0
    invoke-virtual {p0, v1, v0}, Lcom/jirbo/adcolony/e;->setMeasuredDimension(II)V

    .line 145
    return-void

    .line 134
    :cond_1
    iget v2, p0, Lcom/jirbo/adcolony/e;->s:I

    mul-int/2addr v2, v0

    iget v3, p0, Lcom/jirbo/adcolony/e;->t:I

    mul-int/2addr v3, v1

    if-ge v2, v3, :cond_0

    .line 136
    iget v1, p0, Lcom/jirbo/adcolony/e;->s:I

    mul-int/2addr v1, v0

    iget v2, p0, Lcom/jirbo/adcolony/e;->t:I

    div-int/2addr v1, v2

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 535
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    if-eqz v0, :cond_0

    .line 536
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->h()V

    .line 538
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 543
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    if-eqz v0, :cond_0

    .line 544
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->h()V

    .line 546
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public pause()V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 598
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 599
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 600
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 601
    iput v1, p0, Lcom/jirbo/adcolony/e;->o:I

    .line 604
    :cond_0
    iput v1, p0, Lcom/jirbo/adcolony/e;->p:I

    .line 605
    return-void
.end method

.method public seekTo(I)V
    .locals 1

    .prologue
    .line 654
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 655
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 656
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/e;->B:I

    .line 660
    :goto_0
    return-void

    .line 658
    :cond_0
    iput p1, p0, Lcom/jirbo/adcolony/e;->B:I

    goto :goto_0
.end method

.method public start()V
    .locals 2

    .prologue
    const/4 v1, 0x3

    .line 590
    invoke-direct {p0}, Lcom/jirbo/adcolony/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 591
    iget-object v0, p0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 592
    iput v1, p0, Lcom/jirbo/adcolony/e;->o:I

    .line 594
    :cond_0
    iput v1, p0, Lcom/jirbo/adcolony/e;->p:I

    .line 595
    return-void
.end method

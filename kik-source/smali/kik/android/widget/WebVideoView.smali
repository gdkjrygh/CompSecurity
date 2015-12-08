.class public Lkik/android/widget/WebVideoView;
.super Landroid/view/SurfaceView;
.source "SourceFile"

# interfaces
.implements Lkik/android/widget/VideoController$a;


# instance fields
.field private A:Landroid/media/MediaPlayer$OnCompletionListener;

.field private B:Landroid/media/MediaPlayer$OnErrorListener;

.field private C:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

.field a:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

.field b:Landroid/media/MediaPlayer$OnPreparedListener;

.field c:Landroid/view/SurfaceHolder$Callback;

.field private d:Ljava/lang/String;

.field private e:Landroid/net/Uri;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:I

.field private i:I

.field private j:Landroid/view/SurfaceHolder;

.field private k:Landroid/media/MediaPlayer;

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:Lkik/android/widget/VideoController;

.field private q:Landroid/media/MediaPlayer$OnCompletionListener;

.field private r:Landroid/media/MediaPlayer$OnPreparedListener;

.field private s:I

.field private t:Landroid/media/MediaPlayer$OnErrorListener;

.field private u:I

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Landroid/content/Context;

.field private z:Lkik/android/widget/cv;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 103
    invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 58
    const-string v0, "VideoView"

    iput-object v0, p0, Lkik/android/widget/WebVideoView;->d:Ljava/lang/String;

    .line 79
    iput v1, p0, Lkik/android/widget/WebVideoView;->h:I

    .line 80
    iput v1, p0, Lkik/android/widget/WebVideoView;->i:I

    .line 83
    iput-object v2, p0, Lkik/android/widget/WebVideoView;->j:Landroid/view/SurfaceHolder;

    .line 84
    iput-object v2, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    .line 280
    new-instance v0, Lkik/android/widget/er;

    invoke-direct {v0, p0}, Lkik/android/widget/er;-><init>(Lkik/android/widget/WebVideoView;)V

    iput-object v0, p0, Lkik/android/widget/WebVideoView;->a:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    .line 292
    new-instance v0, Lkik/android/widget/es;

    invoke-direct {v0, p0}, Lkik/android/widget/es;-><init>(Lkik/android/widget/WebVideoView;)V

    iput-object v0, p0, Lkik/android/widget/WebVideoView;->b:Landroid/media/MediaPlayer$OnPreparedListener;

    .line 333
    new-instance v0, Lkik/android/widget/et;

    invoke-direct {v0, p0}, Lkik/android/widget/et;-><init>(Lkik/android/widget/WebVideoView;)V

    iput-object v0, p0, Lkik/android/widget/WebVideoView;->A:Landroid/media/MediaPlayer$OnCompletionListener;

    .line 348
    new-instance v0, Lkik/android/widget/eu;

    invoke-direct {v0, p0}, Lkik/android/widget/eu;-><init>(Lkik/android/widget/WebVideoView;)V

    iput-object v0, p0, Lkik/android/widget/WebVideoView;->B:Landroid/media/MediaPlayer$OnErrorListener;

    .line 404
    new-instance v0, Lkik/android/widget/ew;

    invoke-direct {v0, p0}, Lkik/android/widget/ew;-><init>(Lkik/android/widget/WebVideoView;)V

    iput-object v0, p0, Lkik/android/widget/WebVideoView;->C:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

    .line 449
    new-instance v0, Lkik/android/widget/ex;

    invoke-direct {v0, p0}, Lkik/android/widget/ex;-><init>(Lkik/android/widget/WebVideoView;)V

    iput-object v0, p0, Lkik/android/widget/WebVideoView;->c:Landroid/view/SurfaceHolder$Callback;

    .line 104
    iput-object p1, p0, Lkik/android/widget/WebVideoView;->y:Landroid/content/Context;

    .line 105
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 109
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/WebVideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 110
    iput-object p1, p0, Lkik/android/widget/WebVideoView;->y:Landroid/content/Context;

    .line 111
    invoke-virtual {p0}, Lkik/android/widget/WebVideoView;->i()V

    .line 112
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 116
    invoke-direct {p0, p1, p2, p3}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 58
    const-string v0, "VideoView"

    iput-object v0, p0, Lkik/android/widget/WebVideoView;->d:Ljava/lang/String;

    .line 79
    iput v1, p0, Lkik/android/widget/WebVideoView;->h:I

    .line 80
    iput v1, p0, Lkik/android/widget/WebVideoView;->i:I

    .line 83
    iput-object v2, p0, Lkik/android/widget/WebVideoView;->j:Landroid/view/SurfaceHolder;

    .line 84
    iput-object v2, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    .line 280
    new-instance v0, Lkik/android/widget/er;

    invoke-direct {v0, p0}, Lkik/android/widget/er;-><init>(Lkik/android/widget/WebVideoView;)V

    iput-object v0, p0, Lkik/android/widget/WebVideoView;->a:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    .line 292
    new-instance v0, Lkik/android/widget/es;

    invoke-direct {v0, p0}, Lkik/android/widget/es;-><init>(Lkik/android/widget/WebVideoView;)V

    iput-object v0, p0, Lkik/android/widget/WebVideoView;->b:Landroid/media/MediaPlayer$OnPreparedListener;

    .line 333
    new-instance v0, Lkik/android/widget/et;

    invoke-direct {v0, p0}, Lkik/android/widget/et;-><init>(Lkik/android/widget/WebVideoView;)V

    iput-object v0, p0, Lkik/android/widget/WebVideoView;->A:Landroid/media/MediaPlayer$OnCompletionListener;

    .line 348
    new-instance v0, Lkik/android/widget/eu;

    invoke-direct {v0, p0}, Lkik/android/widget/eu;-><init>(Lkik/android/widget/WebVideoView;)V

    iput-object v0, p0, Lkik/android/widget/WebVideoView;->B:Landroid/media/MediaPlayer$OnErrorListener;

    .line 404
    new-instance v0, Lkik/android/widget/ew;

    invoke-direct {v0, p0}, Lkik/android/widget/ew;-><init>(Lkik/android/widget/WebVideoView;)V

    iput-object v0, p0, Lkik/android/widget/WebVideoView;->C:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

    .line 449
    new-instance v0, Lkik/android/widget/ex;

    invoke-direct {v0, p0}, Lkik/android/widget/ex;-><init>(Lkik/android/widget/WebVideoView;)V

    iput-object v0, p0, Lkik/android/widget/WebVideoView;->c:Landroid/view/SurfaceHolder$Callback;

    .line 117
    iput-object p1, p0, Lkik/android/widget/WebVideoView;->y:Landroid/content/Context;

    .line 118
    invoke-virtual {p0}, Lkik/android/widget/WebVideoView;->i()V

    .line 119
    return-void
.end method

.method static synthetic a(Lkik/android/widget/WebVideoView;)I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lkik/android/widget/WebVideoView;->l:I

    return v0
.end method

.method static synthetic a(Lkik/android/widget/WebVideoView;I)I
    .locals 0

    .prologue
    .line 56
    iput p1, p0, Lkik/android/widget/WebVideoView;->l:I

    return p1
.end method

.method static synthetic a(Lkik/android/widget/WebVideoView;Landroid/view/SurfaceHolder;)Landroid/view/SurfaceHolder;
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lkik/android/widget/WebVideoView;->j:Landroid/view/SurfaceHolder;

    return-object p1
.end method

.method static synthetic b(Lkik/android/widget/WebVideoView;)I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lkik/android/widget/WebVideoView;->m:I

    return v0
.end method

.method static synthetic b(Lkik/android/widget/WebVideoView;I)I
    .locals 0

    .prologue
    .line 56
    iput p1, p0, Lkik/android/widget/WebVideoView;->m:I

    return p1
.end method

.method static synthetic c(Lkik/android/widget/WebVideoView;I)I
    .locals 0

    .prologue
    .line 56
    iput p1, p0, Lkik/android/widget/WebVideoView;->h:I

    return p1
.end method

.method static synthetic c(Lkik/android/widget/WebVideoView;)Z
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/WebVideoView;->x:Z

    return v0
.end method

.method static synthetic d(Lkik/android/widget/WebVideoView;I)I
    .locals 0

    .prologue
    .line 56
    iput p1, p0, Lkik/android/widget/WebVideoView;->i:I

    return p1
.end method

.method static synthetic d(Lkik/android/widget/WebVideoView;)Z
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/WebVideoView;->w:Z

    return v0
.end method

.method static synthetic e(Lkik/android/widget/WebVideoView;I)I
    .locals 0

    .prologue
    .line 56
    iput p1, p0, Lkik/android/widget/WebVideoView;->s:I

    return p1
.end method

.method static synthetic e(Lkik/android/widget/WebVideoView;)Z
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/WebVideoView;->v:Z

    return v0
.end method

.method static synthetic f(Lkik/android/widget/WebVideoView;I)I
    .locals 0

    .prologue
    .line 56
    iput p1, p0, Lkik/android/widget/WebVideoView;->n:I

    return p1
.end method

.method static synthetic f(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer$OnPreparedListener;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->r:Landroid/media/MediaPlayer$OnPreparedListener;

    return-object v0
.end method

.method static synthetic g(Lkik/android/widget/WebVideoView;I)I
    .locals 0

    .prologue
    .line 56
    iput p1, p0, Lkik/android/widget/WebVideoView;->o:I

    return p1
.end method

.method static synthetic g(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    return-object v0
.end method

.method static synthetic h(Lkik/android/widget/WebVideoView;I)I
    .locals 0

    .prologue
    .line 56
    iput p1, p0, Lkik/android/widget/WebVideoView;->u:I

    return p1
.end method

.method static synthetic h(Lkik/android/widget/WebVideoView;)Lkik/android/widget/VideoController;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    return-object v0
.end method

.method static synthetic i(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer$OnCompletionListener;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->q:Landroid/media/MediaPlayer$OnCompletionListener;

    return-object v0
.end method

.method static synthetic j(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer$OnErrorListener;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->t:Landroid/media/MediaPlayer$OnErrorListener;

    return-object v0
.end method

.method static synthetic k(Lkik/android/widget/WebVideoView;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->y:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic l(Lkik/android/widget/WebVideoView;)I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lkik/android/widget/WebVideoView;->i:I

    return v0
.end method

.method static synthetic m(Lkik/android/widget/WebVideoView;)I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lkik/android/widget/WebVideoView;->u:I

    return v0
.end method

.method static synthetic n(Lkik/android/widget/WebVideoView;)I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lkik/android/widget/WebVideoView;->h:I

    return v0
.end method

.method static synthetic o(Lkik/android/widget/WebVideoView;)Landroid/view/SurfaceHolder;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->j:Landroid/view/SurfaceHolder;

    return-object v0
.end method

.method static synthetic p(Lkik/android/widget/WebVideoView;)V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0}, Lkik/android/widget/WebVideoView;->r()V

    return-void
.end method

.method static synthetic q(Lkik/android/widget/WebVideoView;)V
    .locals 3

    .prologue
    .line 56
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->e:Landroid/net/Uri;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/WebVideoView;->j:Landroid/view/SurfaceHolder;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.android.music.musicservicecommand"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "command"

    const-string v2, "pause"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lkik/android/widget/WebVideoView;->y:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method private r()V
    .locals 2

    .prologue
    .line 272
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    if-eqz v0, :cond_0

    .line 273
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    invoke-virtual {v0, p0}, Lkik/android/widget/VideoController;->a(Lkik/android/widget/VideoController$a;)V

    .line 274
    invoke-virtual {p0}, Lkik/android/widget/WebVideoView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 275
    iget-object v1, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    invoke-virtual {v1, v0}, Lkik/android/widget/VideoController;->a(Landroid/view/ViewGroup;)V

    .line 276
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    invoke-direct {p0}, Lkik/android/widget/WebVideoView;->t()Z

    move-result v1

    invoke-virtual {v0, v1}, Lkik/android/widget/VideoController;->setEnabled(Z)V

    .line 278
    :cond_0
    return-void
.end method

.method private s()V
    .locals 1

    .prologue
    .line 562
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    invoke-virtual {v0}, Lkik/android/widget/VideoController;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 563
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    invoke-virtual {v0}, Lkik/android/widget/VideoController;->c()V

    .line 568
    :goto_0
    return-void

    .line 566
    :cond_0
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    invoke-virtual {v0}, Lkik/android/widget/VideoController;->a()V

    goto :goto_0
.end method

.method private t()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 694
    iget-object v1, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    if-eqz v1, :cond_0

    iget v1, p0, Lkik/android/widget/WebVideoView;->h:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    iget v1, p0, Lkik/android/widget/WebVideoView;->h:I

    if-eqz v1, :cond_0

    iget v1, p0, Lkik/android/widget/WebVideoView;->h:I

    if-eq v1, v0, :cond_0

    iget-object v1, p0, Lkik/android/widget/WebVideoView;->j:Landroid/view/SurfaceHolder;

    if-eqz v1, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    const/4 v1, 0x3

    .line 572
    invoke-direct {p0}, Lkik/android/widget/WebVideoView;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 573
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 574
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    invoke-virtual {v0}, Lkik/android/widget/VideoController;->a()V

    .line 575
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    invoke-virtual {v0}, Lkik/android/widget/VideoController;->e()V

    .line 576
    iput v1, p0, Lkik/android/widget/WebVideoView;->h:I

    .line 577
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->z:Lkik/android/widget/cv;

    if-eqz v0, :cond_0

    .line 578
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->z:Lkik/android/widget/cv;

    invoke-interface {v0}, Lkik/android/widget/cv;->b()V

    .line 581
    :cond_0
    iput v1, p0, Lkik/android/widget/WebVideoView;->i:I

    .line 582
    return-void
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 668
    invoke-direct {p0}, Lkik/android/widget/WebVideoView;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 669
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 670
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/widget/WebVideoView;->u:I

    .line 672
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    invoke-virtual {v0}, Lkik/android/widget/VideoController;->d()I

    .line 677
    :goto_0
    return-void

    .line 675
    :cond_0
    iput p1, p0, Lkik/android/widget/WebVideoView;->u:I

    goto :goto_0
.end method

.method public final a(Landroid/media/MediaPlayer$OnCompletionListener;)V
    .locals 0

    .prologue
    .line 433
    iput-object p1, p0, Lkik/android/widget/WebVideoView;->q:Landroid/media/MediaPlayer$OnCompletionListener;

    .line 434
    return-void
.end method

.method public final a(Landroid/media/MediaPlayer$OnErrorListener;)V
    .locals 0

    .prologue
    .line 446
    iput-object p1, p0, Lkik/android/widget/WebVideoView;->t:Landroid/media/MediaPlayer$OnErrorListener;

    .line 447
    return-void
.end method

.method public final a(Landroid/media/MediaPlayer$OnInfoListener;)V
    .locals 1

    .prologue
    .line 706
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setOnInfoListener(Landroid/media/MediaPlayer$OnInfoListener;)V

    .line 707
    return-void
.end method

.method public final a(Landroid/media/MediaPlayer$OnPreparedListener;)V
    .locals 0

    .prologue
    .line 422
    iput-object p1, p0, Lkik/android/widget/WebVideoView;->r:Landroid/media/MediaPlayer$OnPreparedListener;

    .line 423
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 191
    iput-object p1, p0, Lkik/android/widget/WebVideoView;->f:Ljava/lang/String;

    .line 192
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/widget/WebVideoView;->u:I

    .line 193
    return-void
.end method

.method public final a(Lkik/android/widget/VideoController;)V
    .locals 1

    .prologue
    .line 263
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    if-eqz v0, :cond_0

    .line 264
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    invoke-virtual {v0}, Lkik/android/widget/VideoController;->c()V

    .line 266
    :cond_0
    iput-object p1, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    .line 267
    invoke-direct {p0}, Lkik/android/widget/WebVideoView;->r()V

    .line 268
    return-void
.end method

.method public final a(Lkik/android/widget/cv;)V
    .locals 0

    .prologue
    .line 716
    iput-object p1, p0, Lkik/android/widget/WebVideoView;->z:Lkik/android/widget/cv;

    .line 717
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 586
    invoke-direct {p0}, Lkik/android/widget/WebVideoView;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 587
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 588
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 589
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    invoke-virtual {v0}, Lkik/android/widget/VideoController;->e()V

    .line 590
    iput v1, p0, Lkik/android/widget/WebVideoView;->h:I

    .line 591
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->z:Lkik/android/widget/cv;

    if-eqz v0, :cond_0

    .line 592
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->z:Lkik/android/widget/cv;

    invoke-interface {v0}, Lkik/android/widget/cv;->a()V

    .line 596
    :cond_0
    iput v1, p0, Lkik/android/widget/WebVideoView;->i:I

    .line 597
    return-void
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 628
    invoke-direct {p0}, Lkik/android/widget/WebVideoView;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 629
    iget v0, p0, Lkik/android/widget/WebVideoView;->g:I

    if-lez v0, :cond_0

    .line 630
    iget v0, p0, Lkik/android/widget/WebVideoView;->g:I

    .line 636
    :goto_0
    return v0

    .line 632
    :cond_0
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    iput v0, p0, Lkik/android/widget/WebVideoView;->g:I

    .line 633
    iget v0, p0, Lkik/android/widget/WebVideoView;->g:I

    goto :goto_0

    .line 635
    :cond_1
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/widget/WebVideoView;->g:I

    .line 636
    iget v0, p0, Lkik/android/widget/WebVideoView;->g:I

    goto :goto_0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 641
    invoke-direct {p0}, Lkik/android/widget/WebVideoView;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 642
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    .line 644
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 681
    invoke-direct {p0}, Lkik/android/widget/WebVideoView;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

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

.method public final f()Z
    .locals 1

    .prologue
    .line 721
    iget-boolean v0, p0, Lkik/android/widget/WebVideoView;->v:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 726
    iget-boolean v0, p0, Lkik/android/widget/WebVideoView;->w:Z

    return v0
.end method

.method public final h()Z
    .locals 1

    .prologue
    .line 731
    iget-boolean v0, p0, Lkik/android/widget/WebVideoView;->x:Z

    return v0
.end method

.method public final i()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    .line 180
    iput v0, p0, Lkik/android/widget/WebVideoView;->l:I

    .line 181
    iput v0, p0, Lkik/android/widget/WebVideoView;->m:I

    .line 182
    invoke-virtual {p0}, Lkik/android/widget/WebVideoView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/WebVideoView;->c:Landroid/view/SurfaceHolder$Callback;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 183
    invoke-virtual {p0}, Lkik/android/widget/WebVideoView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setType(I)V

    .line 184
    invoke-virtual {p0, v2}, Lkik/android/widget/WebVideoView;->setFocusable(Z)V

    .line 185
    invoke-virtual {p0, v2}, Lkik/android/widget/WebVideoView;->setFocusableInTouchMode(Z)V

    .line 186
    invoke-virtual {p0}, Lkik/android/widget/WebVideoView;->requestFocus()Z

    .line 187
    return-void
.end method

.method public final j()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 205
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 206
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 207
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 208
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    .line 209
    iput v1, p0, Lkik/android/widget/WebVideoView;->h:I

    .line 210
    iput v1, p0, Lkik/android/widget/WebVideoView;->i:I

    .line 212
    :cond_0
    return-void
.end method

.method public final k()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 234
    :try_start_0
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    .line 235
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lkik/android/widget/WebVideoView;->b:Landroid/media/MediaPlayer$OnPreparedListener;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 236
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lkik/android/widget/WebVideoView;->a:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    .line 237
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/widget/WebVideoView;->g:I

    .line 238
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lkik/android/widget/WebVideoView;->A:Landroid/media/MediaPlayer$OnCompletionListener;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 239
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lkik/android/widget/WebVideoView;->B:Landroid/media/MediaPlayer$OnErrorListener;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 240
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lkik/android/widget/WebVideoView;->C:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V

    .line 241
    const/4 v0, 0x0

    iput v0, p0, Lkik/android/widget/WebVideoView;->s:I

    .line 242
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lkik/android/widget/WebVideoView;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 243
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    .line 244
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V

    .line 245
    const/4 v0, 0x1

    iput v0, p0, Lkik/android/widget/WebVideoView;->h:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 258
    :goto_0
    return-void

    .line 248
    :catch_0
    move-exception v0

    iput v2, p0, Lkik/android/widget/WebVideoView;->h:I

    .line 249
    iput v2, p0, Lkik/android/widget/WebVideoView;->i:I

    .line 250
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->B:Landroid/media/MediaPlayer$OnErrorListener;

    iget-object v1, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-interface {v0, v1, v4, v3}, Landroid/media/MediaPlayer$OnErrorListener;->onError(Landroid/media/MediaPlayer;II)Z

    goto :goto_0

    .line 254
    :catch_1
    move-exception v0

    iput v2, p0, Lkik/android/widget/WebVideoView;->h:I

    .line 255
    iput v2, p0, Lkik/android/widget/WebVideoView;->i:I

    .line 256
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->B:Landroid/media/MediaPlayer$OnErrorListener;

    iget-object v1, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-interface {v0, v1, v4, v3}, Landroid/media/MediaPlayer$OnErrorListener;->onError(Landroid/media/MediaPlayer;II)Z

    goto :goto_0
.end method

.method public final l()V
    .locals 4

    .prologue
    const/4 v3, 0x3

    .line 314
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    if-eqz v0, :cond_0

    .line 315
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/widget/VideoController;->setEnabled(Z)V

    .line 317
    :cond_0
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getVideoWidth()I

    move-result v0

    iput v0, p0, Lkik/android/widget/WebVideoView;->l:I

    .line 318
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getVideoHeight()I

    move-result v0

    iput v0, p0, Lkik/android/widget/WebVideoView;->m:I

    .line 320
    iget v0, p0, Lkik/android/widget/WebVideoView;->l:I

    if-eqz v0, :cond_2

    iget v0, p0, Lkik/android/widget/WebVideoView;->m:I

    if-eqz v0, :cond_2

    .line 321
    invoke-virtual {p0}, Lkik/android/widget/WebVideoView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iget v1, p0, Lkik/android/widget/WebVideoView;->l:I

    iget v2, p0, Lkik/android/widget/WebVideoView;->m:I

    invoke-interface {v0, v1, v2}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    .line 322
    invoke-virtual {p0}, Lkik/android/widget/WebVideoView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0, v3}, Landroid/view/SurfaceHolder;->setType(I)V

    .line 331
    :cond_1
    :goto_0
    return-void

    .line 327
    :cond_2
    iget v0, p0, Lkik/android/widget/WebVideoView;->i:I

    if-ne v0, v3, :cond_1

    .line 328
    invoke-virtual {p0}, Lkik/android/widget/WebVideoView;->a()V

    goto :goto_0
.end method

.method public final m()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 499
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 500
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 501
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 502
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    .line 503
    iput v1, p0, Lkik/android/widget/WebVideoView;->h:I

    .line 504
    iput v1, p0, Lkik/android/widget/WebVideoView;->i:I

    .line 508
    :cond_0
    return-void
.end method

.method public final n()V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 605
    invoke-direct {p0}, Lkik/android/widget/WebVideoView;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 606
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 607
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 608
    iput v1, p0, Lkik/android/widget/WebVideoView;->h:I

    .line 611
    :cond_0
    iput v1, p0, Lkik/android/widget/WebVideoView;->i:I

    .line 612
    return-void
.end method

.method public final o()I
    .locals 1

    .prologue
    .line 653
    iget v0, p0, Lkik/android/widget/WebVideoView;->g:I

    if-lez v0, :cond_0

    .line 654
    iget v0, p0, Lkik/android/widget/WebVideoView;->g:I

    .line 657
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    goto :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 528
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

    .line 534
    :goto_0
    invoke-direct {p0}, Lkik/android/widget/WebVideoView;->t()Z

    move-result v2

    if-eqz v2, :cond_4

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    if-eqz v0, :cond_4

    .line 535
    const/16 v0, 0x4f

    if-eq p1, v0, :cond_0

    const/16 v0, 0x55

    if-ne p1, v0, :cond_3

    .line 537
    :cond_0
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 538
    invoke-virtual {p0}, Lkik/android/widget/WebVideoView;->b()V

    .line 539
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    invoke-virtual {v0}, Lkik/android/widget/VideoController;->a()V

    .line 557
    :goto_1
    return v1

    .line 528
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 542
    :cond_2
    invoke-virtual {p0}, Lkik/android/widget/WebVideoView;->a()V

    .line 543
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    invoke-virtual {v0}, Lkik/android/widget/VideoController;->c()V

    goto :goto_1

    .line 547
    :cond_3
    const/16 v0, 0x56

    if-ne p1, v0, :cond_5

    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 549
    invoke-virtual {p0}, Lkik/android/widget/WebVideoView;->b()V

    .line 550
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    invoke-virtual {v0}, Lkik/android/widget/VideoController;->a()V

    .line 557
    :cond_4
    :goto_2
    invoke-super {p0, p1, p2}, Landroid/view/SurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v1

    goto :goto_1

    .line 553
    :cond_5
    invoke-direct {p0}, Lkik/android/widget/WebVideoView;->s()V

    goto :goto_2
.end method

.method protected onMeasure(II)V
    .locals 4

    .prologue
    .line 125
    iget v0, p0, Lkik/android/widget/WebVideoView;->l:I

    invoke-static {v0, p1}, Lkik/android/widget/WebVideoView;->getDefaultSize(II)I

    move-result v1

    .line 126
    iget v0, p0, Lkik/android/widget/WebVideoView;->m:I

    invoke-static {v0, p2}, Lkik/android/widget/WebVideoView;->getDefaultSize(II)I

    move-result v0

    .line 127
    iget v2, p0, Lkik/android/widget/WebVideoView;->l:I

    if-lez v2, :cond_0

    iget v2, p0, Lkik/android/widget/WebVideoView;->m:I

    if-lez v2, :cond_0

    .line 128
    iget v2, p0, Lkik/android/widget/WebVideoView;->l:I

    mul-int/2addr v2, v0

    iget v3, p0, Lkik/android/widget/WebVideoView;->m:I

    mul-int/2addr v3, v1

    if-le v2, v3, :cond_1

    .line 130
    iget v0, p0, Lkik/android/widget/WebVideoView;->m:I

    mul-int/2addr v0, v1

    iget v2, p0, Lkik/android/widget/WebVideoView;->l:I

    div-int/2addr v0, v2

    .line 143
    :cond_0
    :goto_0
    invoke-virtual {p0, v1, v0}, Lkik/android/widget/WebVideoView;->setMeasuredDimension(II)V

    .line 144
    return-void

    .line 132
    :cond_1
    iget v2, p0, Lkik/android/widget/WebVideoView;->l:I

    mul-int/2addr v2, v0

    iget v3, p0, Lkik/android/widget/WebVideoView;->m:I

    mul-int/2addr v3, v1

    if-ge v2, v3, :cond_0

    .line 134
    iget v1, p0, Lkik/android/widget/WebVideoView;->l:I

    mul-int/2addr v1, v0

    iget v2, p0, Lkik/android/widget/WebVideoView;->m:I

    div-int/2addr v1, v2

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 513
    const/4 v0, 0x0

    return v0
.end method

.method public onTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 519
    invoke-direct {p0}, Lkik/android/widget/WebVideoView;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/WebVideoView;->p:Lkik/android/widget/VideoController;

    if-eqz v0, :cond_0

    .line 520
    invoke-direct {p0}, Lkik/android/widget/WebVideoView;->s()V

    .line 522
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final p()I
    .locals 1

    .prologue
    .line 663
    iget-object v0, p0, Lkik/android/widget/WebVideoView;->k:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    return v0
.end method

.method public final q()I
    .locals 1

    .prologue
    .line 701
    iget v0, p0, Lkik/android/widget/WebVideoView;->u:I

    return v0
.end method

.class public Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;
.super Lcom/facebook/widget/f;
.source "ThreadViewAudioAttachmentView.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/orca/d/ay;

.field private final c:Lcom/facebook/orca/d/m;

.field private final d:Lcom/facebook/orca/d/az;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Lcom/facebook/analytics/av;

.field private final g:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

.field private final h:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

.field private final i:Lcom/facebook/orca/attachments/ClipProgressLayout;

.field private final j:Lcom/facebook/orca/d/l;

.field private k:Lcom/facebook/orca/d/e;

.field private l:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field private m:Lcom/facebook/orca/threadview/bh;

.field private n:Lcom/facebook/orca/attachments/AudioAttachmentData;

.field private o:Landroid/net/Uri;

.field private p:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    const-class v0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    sput-object v0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 102
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 103
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    .line 106
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 64
    new-instance v0, Lcom/facebook/orca/threadview/bb;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadview/bb;-><init>(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;)V

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->j:Lcom/facebook/orca/d/l;

    .line 95
    sget-object v0, Lcom/facebook/orca/threadview/bh;->INIT:Lcom/facebook/orca/threadview/bh;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->m:Lcom/facebook/orca/threadview/bh;

    .line 99
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->p:J

    .line 108
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 109
    const-class v0, Lcom/facebook/orca/d/ay;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/ay;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->b:Lcom/facebook/orca/d/ay;

    .line 110
    const-class v0, Lcom/facebook/orca/d/m;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/m;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->c:Lcom/facebook/orca/d/m;

    .line 111
    const-class v0, Lcom/facebook/orca/d/az;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/az;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->d:Lcom/facebook/orca/d/az;

    .line 112
    const-class v0, Ljava/util/concurrent/Executor;

    const-class v2, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->e:Ljava/util/concurrent/Executor;

    .line 113
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->f:Lcom/facebook/analytics/av;

    .line 115
    sget v0, Lcom/facebook/k;->orca_audio_message_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->setContentView(I)V

    .line 116
    sget v0, Lcom/facebook/i;->audio_player_bubble_normal:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->g:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    .line 117
    sget v0, Lcom/facebook/i;->audio_player_bubble_highlighted:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->h:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    .line 118
    sget v0, Lcom/facebook/i;->audio_player_highlighted_wrapper:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/attachments/ClipProgressLayout;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->i:Lcom/facebook/orca/attachments/ClipProgressLayout;

    .line 119
    new-instance v0, Lcom/facebook/orca/threadview/bc;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadview/bc;-><init>(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;)V

    .line 125
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->g:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 126
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->h:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    new-instance v0, Lcom/facebook/orca/threadview/bd;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadview/bd;-><init>(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;)V

    .line 135
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->g:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 136
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->h:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 137
    return-void
.end method

.method private a(I)I
    .locals 9

    .prologue
    .line 229
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x42700000    # 60.0f

    invoke-static {v0, v1}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v2

    .line 234
    if-lez p1, :cond_1

    .line 236
    iget-wide v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->p:J

    const-wide/16 v3, -0x1

    cmp-long v0, v0, v3

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    .line 237
    :goto_0
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v5, 0x4024000000000000L    # 10.0

    const-wide v7, 0x40b3880000000000L    # 5000.0

    long-to-double v0, v0

    invoke-static {v7, v8, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    const-wide v7, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v7

    const-wide/high16 v7, -0x3fc2000000000000L    # -30.0

    div-double/2addr v0, v7

    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    sub-double v0, v3, v0

    sub-int v3, p1, v2

    int-to-double v3, v3

    mul-double/2addr v0, v3

    double-to-int v0, v0

    add-int/2addr v0, v2

    .line 239
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 242
    :goto_1
    return v0

    .line 236
    :cond_0
    iget-wide v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->p:J

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;Lcom/facebook/orca/threadview/bh;)Lcom/facebook/orca/threadview/bh;
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->m:Lcom/facebook/orca/threadview/bh;

    return-object p1
.end method

.method private a(J)V
    .locals 2

    .prologue
    .line 326
    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    .line 332
    :goto_0
    return-void

    .line 329
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->b(J)Ljava/lang/String;

    move-result-object v0

    .line 330
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->g:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setTimerText(Ljava/lang/String;)V

    .line 331
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->h:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setTimerText(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Landroid/net/Uri;)V
    .locals 2

    .prologue
    .line 216
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->o:Landroid/net/Uri;

    .line 217
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->g:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setIsLoading(Z)V

    .line 218
    sget-object v0, Lcom/facebook/orca/threadview/bh;->DOWNLOADED:Lcom/facebook/orca/threadview/bh;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->m:Lcom/facebook/orca/threadview/bh;

    .line 221
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->c:Lcom/facebook/orca/d/m;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/d/m;->b(Landroid/net/Uri;)Lcom/facebook/orca/d/e;

    move-result-object v0

    .line 222
    if-eqz v0, :cond_0

    .line 223
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->j:Lcom/facebook/orca/d/l;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/d/e;->a(Lcom/facebook/orca/d/l;)V

    .line 224
    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->k:Lcom/facebook/orca/d/e;

    .line 226
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->f()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;Landroid/net/Uri;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->a(Landroid/net/Uri;)V

    return-void
.end method

.method private b(J)Ljava/lang/String;
    .locals 5

    .prologue
    .line 378
    const-wide/16 v0, 0x3e8

    div-long v0, p1, v0

    long-to-int v0, v0

    .line 379
    const-string v1, "%d:%02d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    div-int/lit8 v4, v0, 0x3c

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    rem-int/lit8 v0, v0, 0x3c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(Landroid/net/Uri;)V
    .locals 3

    .prologue
    .line 336
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->l:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    .line 337
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->l:Lcom/google/common/d/a/s;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/common/d/a/s;->cancel(Z)Z

    .line 340
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->d:Lcom/facebook/orca/d/az;

    new-instance v1, Lcom/facebook/orca/d/bc;

    invoke-direct {v1, p1}, Lcom/facebook/orca/d/bc;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/d/az;->a(Lcom/facebook/orca/d/bc;)Lcom/google/common/d/a/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->l:Lcom/google/common/d/a/s;

    .line 345
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->l:Lcom/google/common/d/a/s;

    .line 346
    new-instance v1, Lcom/facebook/orca/threadview/be;

    invoke-direct {v1, p0, v0}, Lcom/facebook/orca/threadview/be;-><init>(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;Lcom/google/common/d/a/s;)V

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->e:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    .line 373
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->g:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setIsLoading(Z)V

    .line 374
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->g()V

    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->e()V

    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;)Lcom/google/common/d/a/s;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->l:Lcom/google/common/d/a/s;

    return-object v0
.end method

.method static synthetic d()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 48
    sget-object v0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->a:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;)Lcom/facebook/orca/attachments/AudioPlayerBubbleView;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->g:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    return-object v0
.end method

.method private e()V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 246
    sget-object v0, Lcom/facebook/orca/threadview/bg;->b:[I

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->m:Lcom/facebook/orca/threadview/bh;

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/bh;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 282
    :goto_0
    return-void

    .line 248
    :pswitch_0
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 249
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->f:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "audio_clips_playback_start"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "audio_clips"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 252
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->c:Lcom/facebook/orca/d/m;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->o:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/d/m;->a(Landroid/net/Uri;)Lcom/facebook/orca/d/e;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->k:Lcom/facebook/orca/d/e;

    .line 253
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->k:Lcom/facebook/orca/d/e;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->j:Lcom/facebook/orca/d/l;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/d/e;->a(Lcom/facebook/orca/d/l;)V

    goto :goto_0

    .line 255
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->k:Lcom/facebook/orca/d/e;

    invoke-virtual {v0}, Lcom/facebook/orca/d/e;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 256
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->g:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setIsPlaying(Z)V

    .line 257
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->h:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setIsPlaying(Z)V

    .line 258
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->k:Lcom/facebook/orca/d/e;

    invoke-virtual {v0}, Lcom/facebook/orca/d/e;->e()V

    .line 259
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->f:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "audio_clips_playback_resume"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "audio_clips"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    goto :goto_0

    .line 263
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->g:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setIsPlaying(Z)V

    .line 264
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->h:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setIsPlaying(Z)V

    .line 265
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->k:Lcom/facebook/orca/d/e;

    invoke-virtual {v0}, Lcom/facebook/orca/d/e;->d()V

    .line 266
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->f:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "audio_clips_playback_pause"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "audio_clips"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    goto :goto_0

    .line 273
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->f:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "audio_clips_playback_error"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "audio_clips"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 276
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/facebook/o;->audio_player_error_message:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    .line 246
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic f(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;)Lcom/facebook/analytics/av;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->f:Lcom/facebook/analytics/av;

    return-object v0
.end method

.method private f()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 288
    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->g:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->k:Lcom/facebook/orca/d/e;

    invoke-virtual {v0}, Lcom/facebook/orca/d/e;->f()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setIsPlaying(Z)V

    .line 289
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->h:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->k:Lcom/facebook/orca/d/e;

    invoke-virtual {v3}, Lcom/facebook/orca/d/e;->f()Z

    move-result v3

    if-nez v3, :cond_1

    :goto_1
    invoke-virtual {v0, v1}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setIsPlaying(Z)V

    .line 290
    return-void

    :cond_0
    move v0, v2

    .line 288
    goto :goto_0

    :cond_1
    move v1, v2

    .line 289
    goto :goto_1
.end method

.method private g()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 296
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->b()V

    .line 297
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->m:Lcom/facebook/orca/threadview/bh;

    sget-object v1, Lcom/facebook/orca/threadview/bh;->DOWNLOADED:Lcom/facebook/orca/threadview/bh;

    if-ne v0, v1, :cond_0

    .line 298
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->g:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setIsPlaying(Z)V

    .line 299
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->h:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setIsPlaying(Z)V

    .line 301
    :cond_0
    return-void
.end method

.method private h()Z
    .locals 2

    .prologue
    .line 305
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->o:Landroid/net/Uri;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->k:Lcom/facebook/orca/d/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->k:Lcom/facebook/orca/d/e;

    invoke-virtual {v0}, Lcom/facebook/orca/d/e;->b()Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->o:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->k:Lcom/facebook/orca/d/e;

    invoke-virtual {v0}, Lcom/facebook/orca/d/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 208
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->f()V

    .line 213
    :goto_0
    return-void

    .line 211
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->g()V

    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/threadview/l;)V
    .locals 2

    .prologue
    .line 385
    new-instance v0, Lcom/facebook/orca/threadview/bf;

    invoke-direct {v0, p0, p1}, Lcom/facebook/orca/threadview/bf;-><init>(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;Lcom/facebook/orca/threadview/l;)V

    .line 392
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->g:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 393
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->h:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 394
    return-void
.end method

.method public b()V
    .locals 3

    .prologue
    .line 310
    iget-wide v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->p:J

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->a(J)V

    .line 311
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->i:Lcom/facebook/orca/attachments/ClipProgressLayout;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/attachments/ClipProgressLayout;->setProgress(D)V

    .line 312
    return-void
.end method

.method public c()V
    .locals 4

    .prologue
    .line 315
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->k:Lcom/facebook/orca/d/e;

    invoke-virtual {v0}, Lcom/facebook/orca/d/e;->g()I

    move-result v0

    .line 316
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->k:Lcom/facebook/orca/d/e;

    invoke-virtual {v1}, Lcom/facebook/orca/d/e;->h()I

    move-result v1

    .line 319
    div-int/lit16 v2, v0, 0x3e8

    mul-int/lit16 v2, v2, 0x3e8

    sub-int v2, v1, v2

    int-to-long v2, v2

    invoke-direct {p0, v2, v3}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->a(J)V

    .line 321
    int-to-double v2, v0

    int-to-double v0, v1

    div-double v0, v2, v0

    .line 322
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->i:Lcom/facebook/orca/attachments/ClipProgressLayout;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/attachments/ClipProgressLayout;->setProgress(D)V

    .line 323
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .prologue
    .line 148
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-nez v0, :cond_0

    .line 149
    invoke-super {p0, p1, p2}, Lcom/facebook/widget/f;->onMeasure(II)V

    .line 161
    :goto_0
    return-void

    .line 154
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 155
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->getPaddingRight()I

    move-result v2

    add-int/2addr v1, v2

    .line 157
    sub-int/2addr v0, v1

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->a(I)I

    move-result v0

    .line 158
    add-int/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 160
    invoke-super {p0, v0, p2}, Lcom/facebook/widget/f;->onMeasure(II)V

    goto :goto_0
.end method

.method public setAudioAttachmentData(Lcom/facebook/orca/attachments/AudioAttachmentData;)V
    .locals 2

    .prologue
    .line 164
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->n:Lcom/facebook/orca/attachments/AudioAttachmentData;

    if-ne v0, p1, :cond_0

    .line 201
    :goto_0
    return-void

    .line 169
    :cond_0
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->n:Lcom/facebook/orca/attachments/AudioAttachmentData;

    .line 170
    sget-object v0, Lcom/facebook/orca/threadview/bh;->INIT:Lcom/facebook/orca/threadview/bh;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->m:Lcom/facebook/orca/threadview/bh;

    .line 171
    invoke-virtual {p1}, Lcom/facebook/orca/attachments/AudioAttachmentData;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->p:J

    .line 172
    iget-wide v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->p:J

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->a(J)V

    .line 176
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->k:Lcom/facebook/orca/d/e;

    if-eqz v0, :cond_1

    .line 177
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->k:Lcom/facebook/orca/d/e;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->j:Lcom/facebook/orca/d/l;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/d/e;->b(Lcom/facebook/orca/d/l;)V

    .line 178
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->k:Lcom/facebook/orca/d/e;

    .line 181
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/orca/attachments/AudioAttachmentData;->b()Landroid/net/Uri;

    move-result-object v0

    .line 182
    if-nez v0, :cond_2

    .line 184
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->g()V

    .line 185
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->g:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setIsLoading(Z)V

    .line 200
    :goto_1
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->requestLayout()V

    goto :goto_0

    .line 187
    :cond_2
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->b:Lcom/facebook/orca/d/ay;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/d/ay;->a(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v1

    .line 188
    if-nez v1, :cond_3

    .line 189
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->g()V

    .line 190
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->b(Landroid/net/Uri;)V

    goto :goto_1

    .line 192
    :cond_3
    invoke-direct {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->a(Landroid/net/Uri;)V

    .line 193
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->a()V

    goto :goto_1
.end method

.method public setForMeUser(Z)V
    .locals 2

    .prologue
    .line 140
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->g:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    if-eqz p1, :cond_0

    sget-object v0, Lcom/facebook/orca/attachments/d;->SELF_NORMAL:Lcom/facebook/orca/attachments/d;

    :goto_0
    invoke-virtual {v1, v0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setType(Lcom/facebook/orca/attachments/d;)V

    .line 142
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->h:Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    if-eqz p1, :cond_1

    sget-object v0, Lcom/facebook/orca/attachments/d;->SELF_HIGHLIGHTED:Lcom/facebook/orca/attachments/d;

    :goto_1
    invoke-virtual {v1, v0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setType(Lcom/facebook/orca/attachments/d;)V

    .line 144
    return-void

    .line 140
    :cond_0
    sget-object v0, Lcom/facebook/orca/attachments/d;->OTHER_NORMAL:Lcom/facebook/orca/attachments/d;

    goto :goto_0

    .line 142
    :cond_1
    sget-object v0, Lcom/facebook/orca/attachments/d;->OTHER_HIGHLIGHTED:Lcom/facebook/orca/attachments/d;

    goto :goto_1
.end method

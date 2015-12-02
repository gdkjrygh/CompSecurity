.class public Lcom/facebook/orca/d/af;
.super Ljava/lang/Object;
.source "AudioRecorder.java"


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
.field private final b:Landroid/media/AudioManager;

.field private final c:Lcom/facebook/common/executors/a;

.field private final d:Lcom/facebook/orca/j/c;

.field private final e:Lcom/facebook/analytics/av;

.field private final f:Lcom/facebook/common/time/a;

.field private final g:Landroid/os/Handler;

.field private final h:Landroid/os/Handler;

.field private final i:Lcom/facebook/orca/d/ap;

.field private final j:Ljava/lang/Runnable;

.field private k:Lcom/facebook/orca/d/ao;

.field private l:J

.field private m:J

.field private n:Z

.field private o:Ljava/io/File;

.field private p:Landroid/media/MediaRecorder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    const-class v0, Lcom/facebook/orca/d/af;

    sput-object v0, Lcom/facebook/orca/d/af;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/media/AudioManager;Lcom/facebook/common/executors/a;Lcom/facebook/orca/j/c;Lcom/facebook/analytics/av;Lcom/facebook/common/time/a;)V
    .locals 2

    .prologue
    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    iput-object p1, p0, Lcom/facebook/orca/d/af;->b:Landroid/media/AudioManager;

    .line 116
    iput-object p2, p0, Lcom/facebook/orca/d/af;->c:Lcom/facebook/common/executors/a;

    .line 117
    iput-object p3, p0, Lcom/facebook/orca/d/af;->d:Lcom/facebook/orca/j/c;

    .line 118
    iput-object p4, p0, Lcom/facebook/orca/d/af;->e:Lcom/facebook/analytics/av;

    .line 119
    iput-object p5, p0, Lcom/facebook/orca/d/af;->f:Lcom/facebook/common/time/a;

    .line 121
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/d/af;->g:Landroid/os/Handler;

    .line 122
    new-instance v0, Lcom/facebook/orca/d/ap;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/orca/d/ap;-><init>(Lcom/facebook/orca/d/af;Lcom/facebook/orca/d/ag;)V

    iput-object v0, p0, Lcom/facebook/orca/d/af;->i:Lcom/facebook/orca/d/ap;

    .line 124
    new-instance v0, Lcom/facebook/orca/d/ag;

    invoke-direct {v0, p0}, Lcom/facebook/orca/d/ag;-><init>(Lcom/facebook/orca/d/af;)V

    iput-object v0, p0, Lcom/facebook/orca/d/af;->j:Ljava/lang/Runnable;

    .line 139
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "audio_recorder_worker_thread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 140
    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/HandlerThread;->setPriority(I)V

    .line 141
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 142
    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/facebook/orca/d/af;->h:Landroid/os/Handler;

    .line 143
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/d/af;)Lcom/facebook/common/executors/a;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/orca/d/af;->c:Lcom/facebook/common/executors/a;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/d/af;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0, p1}, Lcom/facebook/orca/d/af;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private a(Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 257
    iget-object v0, p0, Lcom/facebook/orca/d/af;->c:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 259
    invoke-virtual {p0}, Lcom/facebook/orca/d/af;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 277
    :goto_0
    return-void

    .line 263
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/d/af;->n:Z

    .line 264
    iget-object v0, p0, Lcom/facebook/orca/d/af;->g:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/d/af;->j:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 265
    invoke-direct {p0}, Lcom/facebook/orca/d/af;->g()V

    .line 268
    iget-object v0, p0, Lcom/facebook/orca/d/af;->h:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/orca/d/al;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/d/al;-><init>(Lcom/facebook/orca/d/af;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/d/af;Z)Z
    .locals 0

    .prologue
    .line 31
    iput-boolean p1, p0, Lcom/facebook/orca/d/af;->n:Z

    return p1
.end method

.method static synthetic b(Lcom/facebook/orca/d/af;)Ljava/io/File;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/orca/d/af;->o:Ljava/io/File;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/d/af;)Lcom/facebook/orca/d/ao;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/orca/d/af;->k:Lcom/facebook/orca/d/ao;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/orca/d/af;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/orca/d/af;->h()V

    return-void
.end method

.method static synthetic e(Lcom/facebook/orca/d/af;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/orca/d/af;->j()V

    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/d/af;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/orca/d/af;->g:Landroid/os/Handler;

    return-object v0
.end method

.method private f()V
    .locals 2

    .prologue
    .line 240
    iget-object v0, p0, Lcom/facebook/orca/d/af;->f:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/d/af;->l:J

    .line 241
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/orca/d/af;->m:J

    .line 242
    return-void
.end method

.method static synthetic g(Lcom/facebook/orca/d/af;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/orca/d/af;->j:Ljava/lang/Runnable;

    return-object v0
.end method

.method private g()V
    .locals 4

    .prologue
    .line 248
    iget-object v0, p0, Lcom/facebook/orca/d/af;->f:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/orca/d/af;->l:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/orca/d/af;->m:J

    .line 249
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/orca/d/af;->l:J

    .line 250
    return-void
.end method

.method private h()V
    .locals 3

    .prologue
    .line 288
    iget-object v0, p0, Lcom/facebook/orca/d/af;->c:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->b()V

    .line 292
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/d/af;->p:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_0

    .line 293
    invoke-direct {p0}, Lcom/facebook/orca/d/af;->j()V

    .line 294
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/d/af;->p:Landroid/media/MediaRecorder;

    .line 297
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/d/af;->i()Landroid/media/MediaRecorder;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/d/af;->p:Landroid/media/MediaRecorder;

    .line 300
    iget-object v0, p0, Lcom/facebook/orca/d/af;->g:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/orca/d/am;

    invoke-direct {v1, p0}, Lcom/facebook/orca/d/am;-><init>(Lcom/facebook/orca/d/af;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 330
    :goto_0
    return-void

    .line 311
    :catch_0
    move-exception v0

    .line 313
    invoke-direct {p0}, Lcom/facebook/orca/d/af;->j()V

    .line 316
    iget-object v1, p0, Lcom/facebook/orca/d/af;->g:Landroid/os/Handler;

    new-instance v2, Lcom/facebook/orca/d/an;

    invoke-direct {v2, p0, v0}, Lcom/facebook/orca/d/an;-><init>(Lcom/facebook/orca/d/af;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method static synthetic h(Lcom/facebook/orca/d/af;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/orca/d/af;->f()V

    return-void
.end method

.method private i()Landroid/media/MediaRecorder;
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    .line 341
    iget-object v0, p0, Lcom/facebook/orca/d/af;->c:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->b()V

    .line 343
    new-instance v0, Landroid/media/MediaRecorder;

    invoke-direct {v0}, Landroid/media/MediaRecorder;-><init>()V

    .line 346
    iget-object v1, p0, Lcom/facebook/orca/d/af;->d:Lcom/facebook/orca/j/c;

    const-string v2, "orca-audio-"

    const-string v3, ".mp4"

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/facebook/orca/j/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/io/File;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/d/af;->o:Ljava/io/File;

    .line 347
    invoke-virtual {v0, v5}, Landroid/media/MediaRecorder;->setAudioSource(I)V

    .line 348
    invoke-virtual {v0, v6}, Landroid/media/MediaRecorder;->setOutputFormat(I)V

    .line 349
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setAudioEncoder(I)V

    .line 350
    invoke-virtual {v0, v5}, Landroid/media/MediaRecorder;->setAudioChannels(I)V

    .line 351
    const/16 v1, 0x1f40

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setAudioSamplingRate(I)V

    .line 352
    iget-object v1, p0, Lcom/facebook/orca/d/af;->o:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setOutputFile(Ljava/lang/String;)V

    .line 353
    invoke-virtual {v0}, Landroid/media/MediaRecorder;->prepare()V

    .line 354
    iget-object v1, p0, Lcom/facebook/orca/d/af;->b:Landroid/media/AudioManager;

    iget-object v2, p0, Lcom/facebook/orca/d/af;->i:Lcom/facebook/orca/d/ap;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v6}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    move-result v1

    if-eq v5, v1, :cond_0

    .line 358
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Failed to acquire the audio focus."

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 360
    :cond_0
    invoke-virtual {v0}, Landroid/media/MediaRecorder;->start()V

    .line 362
    return-object v0
.end method

.method static synthetic i(Lcom/facebook/orca/d/af;)Z
    .locals 1

    .prologue
    .line 31
    iget-boolean v0, p0, Lcom/facebook/orca/d/af;->n:Z

    return v0
.end method

.method static synthetic j(Lcom/facebook/orca/d/af;)Lcom/facebook/analytics/av;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/orca/d/af;->e:Lcom/facebook/analytics/av;

    return-object v0
.end method

.method private j()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 369
    iget-object v0, p0, Lcom/facebook/orca/d/af;->c:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->b()V

    .line 371
    iget-object v0, p0, Lcom/facebook/orca/d/af;->p:Landroid/media/MediaRecorder;

    if-nez v0, :cond_0

    .line 392
    :goto_0
    return-void

    .line 378
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/d/af;->p:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->stop()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 382
    iget-object v0, p0, Lcom/facebook/orca/d/af;->p:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->reset()V

    .line 383
    iget-object v0, p0, Lcom/facebook/orca/d/af;->p:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    .line 384
    iput-object v3, p0, Lcom/facebook/orca/d/af;->p:Landroid/media/MediaRecorder;

    .line 388
    :goto_1
    :try_start_1
    iget-object v0, p0, Lcom/facebook/orca/d/af;->b:Landroid/media/AudioManager;

    iget-object v1, p0, Lcom/facebook/orca/d/af;->i:Lcom/facebook/orca/d/ap;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 389
    :catch_0
    move-exception v0

    .line 390
    sget-object v1, Lcom/facebook/orca/d/af;->a:Ljava/lang/Class;

    const-string v2, "Error in abandoning the audio focus."

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 379
    :catch_1
    move-exception v0

    .line 380
    :try_start_2
    sget-object v1, Lcom/facebook/orca/d/af;->a:Ljava/lang/Class;

    const-string v2, "Error in stopping the audio recorder."

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 382
    iget-object v0, p0, Lcom/facebook/orca/d/af;->p:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->reset()V

    .line 383
    iget-object v0, p0, Lcom/facebook/orca/d/af;->p:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    .line 384
    iput-object v3, p0, Lcom/facebook/orca/d/af;->p:Landroid/media/MediaRecorder;

    goto :goto_1

    .line 382
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/facebook/orca/d/af;->p:Landroid/media/MediaRecorder;

    invoke-virtual {v1}, Landroid/media/MediaRecorder;->reset()V

    .line 383
    iget-object v1, p0, Lcom/facebook/orca/d/af;->p:Landroid/media/MediaRecorder;

    invoke-virtual {v1}, Landroid/media/MediaRecorder;->release()V

    .line 384
    iput-object v3, p0, Lcom/facebook/orca/d/af;->p:Landroid/media/MediaRecorder;

    throw v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 172
    new-instance v0, Lcom/facebook/orca/d/aj;

    invoke-direct {v0, p0}, Lcom/facebook/orca/d/aj;-><init>(Lcom/facebook/orca/d/af;)V

    .line 179
    invoke-direct {p0, v0}, Lcom/facebook/orca/d/af;->a(Ljava/lang/Runnable;)V

    .line 180
    return-void
.end method

.method public a(Lcom/facebook/orca/d/ao;)V
    .locals 2

    .prologue
    .line 153
    iget-object v0, p0, Lcom/facebook/orca/d/af;->c:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 154
    iput-object p1, p0, Lcom/facebook/orca/d/af;->k:Lcom/facebook/orca/d/ao;

    .line 155
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/d/af;->n:Z

    .line 157
    iget-object v0, p0, Lcom/facebook/orca/d/af;->h:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/orca/d/ai;

    invoke-direct {v1, p0}, Lcom/facebook/orca/d/ai;-><init>(Lcom/facebook/orca/d/af;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 163
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 189
    new-instance v0, Lcom/facebook/orca/d/ak;

    invoke-direct {v0, p0}, Lcom/facebook/orca/d/ak;-><init>(Lcom/facebook/orca/d/af;)V

    .line 195
    invoke-direct {p0, v0}, Lcom/facebook/orca/d/af;->a(Ljava/lang/Runnable;)V

    .line 196
    return-void
.end method

.method public c()I
    .locals 2

    .prologue
    .line 204
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/d/af;->p:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/d/af;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lcom/facebook/orca/d/af;->p:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->getMaxAmplitude()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 210
    :goto_0
    return v0

    .line 207
    :catch_0
    move-exception v0

    .line 208
    sget-object v0, Lcom/facebook/orca/d/af;->a:Ljava/lang/Class;

    const-string v1, "Error occurred when querying the recorder amplitude."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 210
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 220
    iget-boolean v0, p0, Lcom/facebook/orca/d/af;->n:Z

    return v0
.end method

.method public e()J
    .locals 2

    .prologue
    .line 228
    iget-wide v0, p0, Lcom/facebook/orca/d/af;->m:J

    return-wide v0
.end method

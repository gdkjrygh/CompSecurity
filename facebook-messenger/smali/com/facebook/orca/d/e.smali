.class public Lcom/facebook/orca/d/e;
.super Ljava/lang/Object;
.source "AudioClipPlayer.java"


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
.field private final b:Lcom/facebook/common/executors/a;

.field private final c:Lcom/google/common/d/a/u;

.field private final d:Ljava/util/concurrent/Executor;

.field private final e:Lcom/facebook/orca/d/ae;

.field private final f:Landroid/os/Handler;

.field private final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/d/l;",
            ">;"
        }
    .end annotation
.end field

.field private h:Landroid/net/Uri;

.field private i:Landroid/media/MediaPlayer;

.field private j:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    const-class v0, Lcom/facebook/orca/d/e;

    sput-object v0, Lcom/facebook/orca/d/e;->a:Ljava/lang/Class;

    return-void
.end method

.method constructor <init>(Lcom/facebook/common/executors/a;Lcom/google/common/d/a/u;Ljava/util/concurrent/Executor;Lcom/facebook/orca/d/ae;Landroid/os/Handler;)V
    .locals 1

    .prologue
    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    new-instance v0, Lcom/facebook/orca/d/f;

    invoke-direct {v0, p0}, Lcom/facebook/orca/d/f;-><init>(Lcom/facebook/orca/d/e;)V

    iput-object v0, p0, Lcom/facebook/orca/d/e;->k:Ljava/lang/Runnable;

    .line 78
    iput-object p1, p0, Lcom/facebook/orca/d/e;->b:Lcom/facebook/common/executors/a;

    .line 79
    iput-object p2, p0, Lcom/facebook/orca/d/e;->c:Lcom/google/common/d/a/u;

    .line 80
    iput-object p3, p0, Lcom/facebook/orca/d/e;->d:Ljava/util/concurrent/Executor;

    .line 81
    iput-object p4, p0, Lcom/facebook/orca/d/e;->e:Lcom/facebook/orca/d/ae;

    .line 82
    iput-object p5, p0, Lcom/facebook/orca/d/e;->f:Landroid/os/Handler;

    .line 83
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/d/e;->g:Ljava/util/List;

    .line 84
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/d/e;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/orca/d/e;->f:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/d/e;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lcom/facebook/orca/d/e;->j:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/orca/d/e;Lcom/facebook/orca/d/k;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0, p1}, Lcom/facebook/orca/d/e;->a(Lcom/facebook/orca/d/k;)V

    return-void
.end method

.method private a(Lcom/facebook/orca/d/k;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 221
    iget-object v0, p0, Lcom/facebook/orca/d/e;->g:Ljava/util/List;

    new-array v2, v1, [Lcom/facebook/orca/d/l;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/d/l;

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    .line 222
    invoke-interface {v3, p1}, Lcom/facebook/orca/d/l;->a(Lcom/facebook/orca/d/k;)V

    .line 221
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 224
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/d/e;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/orca/d/e;->k()V

    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/d/e;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/orca/d/e;->j()V

    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/d/e;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/orca/d/e;->k:Ljava/lang/Runnable;

    return-object v0
.end method

.method private j()V
    .locals 3

    .prologue
    .line 195
    iget-object v0, p0, Lcom/facebook/orca/d/e;->b:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->b()V

    .line 197
    sget-object v0, Lcom/facebook/orca/d/e;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Playing the audio clip: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/d/e;->h:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 198
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/facebook/orca/d/e;->h:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 200
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 202
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;)V

    .line 203
    iget-object v0, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
    invoke-static {v1}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;)V

    .line 207
    iget-object v0, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 208
    return-void

    .line 205
    :catchall_0
    move-exception v0

    invoke-static {v1}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;)V

    throw v0
.end method

.method private k()V
    .locals 2

    .prologue
    .line 211
    iget-object v0, p0, Lcom/facebook/orca/d/e;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/d/e;->k:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 212
    iget-object v0, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 213
    iget-object v0, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 214
    iget-object v0, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 215
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    .line 217
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 100
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/d/e;->e:Lcom/facebook/orca/d/ae;

    iget-object v1, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/d/ae;->a(Landroid/media/MediaPlayer;)V

    .line 102
    iget-object v0, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    new-instance v1, Lcom/facebook/orca/d/g;

    invoke-direct {v1, p0}, Lcom/facebook/orca/d/g;-><init>(Lcom/facebook/orca/d/e;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 109
    iget-object v0, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    new-instance v1, Lcom/facebook/orca/d/h;

    invoke-direct {v1, p0}, Lcom/facebook/orca/d/h;-><init>(Lcom/facebook/orca/d/e;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 117
    iget-object v0, p0, Lcom/facebook/orca/d/e;->c:Lcom/google/common/d/a/u;

    new-instance v1, Lcom/facebook/orca/d/i;

    invoke-direct {v1, p0}, Lcom/facebook/orca/d/i;-><init>(Lcom/facebook/orca/d/e;)V

    invoke-interface {v0, v1}, Lcom/google/common/d/a/u;->c(Ljava/util/concurrent/Callable;)Lcom/google/common/d/a/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/d/e;->j:Lcom/google/common/d/a/s;

    .line 124
    new-instance v0, Lcom/facebook/orca/d/j;

    invoke-direct {v0, p0}, Lcom/facebook/orca/d/j;-><init>(Lcom/facebook/orca/d/e;)V

    .line 139
    iget-object v1, p0, Lcom/facebook/orca/d/e;->j:Lcom/google/common/d/a/s;

    iget-object v2, p0, Lcom/facebook/orca/d/e;->d:Ljava/util/concurrent/Executor;

    invoke-static {v1, v0, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    .line 140
    return-void
.end method

.method public a(Landroid/net/Uri;)V
    .locals 0

    .prologue
    .line 87
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    iput-object p1, p0, Lcom/facebook/orca/d/e;->h:Landroid/net/Uri;

    .line 89
    return-void
.end method

.method public a(Lcom/facebook/orca/d/l;)V
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/orca/d/e;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    return-void
.end method

.method public b()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lcom/facebook/orca/d/e;->h:Landroid/net/Uri;

    return-object v0
.end method

.method public b(Lcom/facebook/orca/d/l;)V
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/orca/d/e;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 97
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 147
    iget-object v0, p0, Lcom/facebook/orca/d/e;->j:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/facebook/orca/d/e;->j:Lcom/google/common/d/a/s;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/common/d/a/s;->cancel(Z)Z

    .line 151
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/d/e;->k()V

    .line 152
    sget-object v0, Lcom/facebook/orca/d/k;->PLAYBACK_STOPPED:Lcom/facebook/orca/d/k;

    invoke-direct {p0, v0}, Lcom/facebook/orca/d/e;->a(Lcom/facebook/orca/d/k;)V

    .line 153
    return-void
.end method

.method public d()V
    .locals 2

    .prologue
    .line 157
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 158
    iget-object v0, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/d/e;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/d/e;->k:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 164
    return-void

    .line 160
    :catch_0
    move-exception v0

    .line 161
    sget-object v0, Lcom/facebook/orca/d/e;->a:Ljava/lang/Class;

    const-string v1, "The player finished playing before pause() was called"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public e()V
    .locals 2

    .prologue
    .line 167
    iget-object v0, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 168
    iget-object v0, p0, Lcom/facebook/orca/d/e;->e:Lcom/facebook/orca/d/ae;

    invoke-virtual {v0}, Lcom/facebook/orca/d/ae;->b()V

    .line 169
    iget-object v0, p0, Lcom/facebook/orca/d/e;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/d/e;->k:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 170
    return-void
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 173
    iget-object v0, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()I
    .locals 1

    .prologue
    .line 177
    iget-object v0, p0, Lcom/facebook/orca/d/e;->e:Lcom/facebook/orca/d/ae;

    invoke-virtual {v0}, Lcom/facebook/orca/d/ae;->a()I

    move-result v0

    return v0
.end method

.method public h()I
    .locals 1

    .prologue
    .line 181
    iget-object v0, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Lcom/facebook/orca/d/e;->i:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

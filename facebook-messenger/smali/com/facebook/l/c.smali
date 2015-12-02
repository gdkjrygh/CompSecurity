.class public Lcom/facebook/l/c;
.super Ljava/lang/Object;
.source "MusicPresenceHandler.java"

# interfaces
.implements Lcom/facebook/base/c;


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
.field private final b:Landroid/content/Context;

.field private c:Lcom/facebook/l/b;

.field private final d:Lcom/facebook/common/time/a;

.field private final e:Landroid/support/v4/a/e;

.field private final f:Landroid/media/AudioManager;

.field private final g:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/facebook/common/e/h;

.field private final i:Landroid/os/Handler;

.field private j:Lcom/facebook/l/h;

.field private k:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    const-class v0, Lcom/facebook/l/c;

    sput-object v0, Lcom/facebook/l/c;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/time/a;Landroid/support/v4/a/e;Landroid/media/AudioManager;Lcom/facebook/l/b;Ljavax/inject/a;Lcom/facebook/common/e/h;Landroid/os/Handler;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/common/time/a;",
            "Landroid/support/v4/a/e;",
            "Landroid/media/AudioManager;",
            "Lcom/facebook/l/b;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/common/e/h;",
            "Landroid/os/Handler;",
            ")V"
        }
    .end annotation

    .prologue
    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    sget-object v0, Lcom/facebook/l/h;->UNKNOWN:Lcom/facebook/l/h;

    iput-object v0, p0, Lcom/facebook/l/c;->j:Lcom/facebook/l/h;

    .line 69
    iput-object p1, p0, Lcom/facebook/l/c;->b:Landroid/content/Context;

    .line 70
    iput-object p2, p0, Lcom/facebook/l/c;->d:Lcom/facebook/common/time/a;

    .line 71
    iput-object p3, p0, Lcom/facebook/l/c;->e:Landroid/support/v4/a/e;

    .line 72
    iput-object p4, p0, Lcom/facebook/l/c;->f:Landroid/media/AudioManager;

    .line 73
    iput-object p5, p0, Lcom/facebook/l/c;->c:Lcom/facebook/l/b;

    .line 74
    iput-object p6, p0, Lcom/facebook/l/c;->g:Ljavax/inject/a;

    .line 75
    iput-object p7, p0, Lcom/facebook/l/c;->h:Lcom/facebook/common/e/h;

    .line 76
    iput-object p8, p0, Lcom/facebook/l/c;->i:Landroid/os/Handler;

    .line 77
    return-void
.end method

.method static synthetic a(Lcom/facebook/l/c;)Landroid/media/AudioManager;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/l/c;->f:Landroid/media/AudioManager;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/l/c;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/l/c;->i:Landroid/os/Handler;

    return-object v0
.end method

.method private b()V
    .locals 2

    .prologue
    .line 89
    sget-object v0, Lcom/facebook/l/c;->a:Ljava/lang/Class;

    const-string v1, "Mqtt connected, try to send music-presence status"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 90
    iget-object v0, p0, Lcom/facebook/l/c;->c:Lcom/facebook/l/b;

    iget-object v1, p0, Lcom/facebook/l/c;->f:Landroid/media/AudioManager;

    invoke-virtual {v1}, Landroid/media/AudioManager;->isMusicActive()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/facebook/l/b;->a(Z)V

    .line 91
    return-void
.end method

.method private c()V
    .locals 15

    .prologue
    .line 118
    sget-object v0, Lcom/facebook/l/c;->a:Ljava/lang/Class;

    const-string v1, "Registered MusicPresenceReceiver"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 120
    const-string v0, "com.android.music.metachanged"

    const-string v1, "com.android.music.playstatechanged"

    const-string v2, "com.android.music.playbackcomplete"

    const-string v3, "com.android.music.queuechanged"

    const-string v4, "com.sec.android.app.music.playstatechanged"

    const-string v5, "com.nullsoft.winamp.playstatechanged"

    const-string v6, "com.amazon.mp3.playstatechanged"

    const-string v7, "com.htc.music.playstatechanged"

    const-string v8, "com.samsung.sec.android.MusicPlayer.playstatechanged"

    const-string v9, "com.samsung.music.playstatechanged"

    const-string v10, "com.samsung.MusicPlayer.playstatechanged"

    const-string v11, "com.samsung.sec.android.playstatechanged"

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/String;

    const/4 v13, 0x0

    const-string v14, "com.rdio.android.playstatechanged"

    aput-object v14, v12, v13

    invoke-static/range {v0 .. v12}, Lcom/google/common/a/es;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v1

    .line 136
    new-instance v2, Lcom/facebook/l/d;

    invoke-direct {v2, p0}, Lcom/facebook/l/d;-><init>(Lcom/facebook/l/c;)V

    .line 152
    new-instance v3, Lcom/google/common/a/ew;

    invoke-direct {v3}, Lcom/google/common/a/ew;-><init>()V

    .line 155
    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 156
    invoke-virtual {v3, v0, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_0

    .line 159
    :cond_0
    new-instance v2, Lcom/facebook/c/k;

    invoke-virtual {v3}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/facebook/c/k;-><init>(Ljava/util/Map;)V

    .line 162
    new-instance v3, Landroid/content/IntentFilter;

    invoke-direct {v3}, Landroid/content/IntentFilter;-><init>()V

    .line 163
    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 164
    invoke-virtual {v3, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    goto :goto_1

    .line 168
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/facebook/l/c;->b:Landroid/content/Context;

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 176
    :goto_2
    return-void

    .line 169
    :catch_0
    move-exception v0

    .line 170
    iget-object v1, p0, Lcom/facebook/l/c;->h:Lcom/facebook/common/e/h;

    sget-object v2, Lcom/facebook/l/c;->a:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "failed to register receiver for music playing events"

    invoke-interface {v1, v2, v3, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2
.end method

.method static synthetic c(Lcom/facebook/l/c;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/facebook/l/c;->b()V

    return-void
.end method

.method private d()V
    .locals 4

    .prologue
    .line 179
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 180
    const-string v1, "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 182
    new-instance v1, Lcom/facebook/l/f;

    invoke-direct {v1, p0}, Lcom/facebook/l/f;-><init>(Lcom/facebook/l/c;)V

    .line 197
    new-instance v2, Lcom/facebook/c/k;

    const-string v3, "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED"

    invoke-static {v3, v1}, Lcom/google/common/a/ev;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ev;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/facebook/c/k;-><init>(Ljava/util/Map;)V

    .line 201
    iget-object v1, p0, Lcom/facebook/l/c;->e:Landroid/support/v4/a/e;

    invoke-virtual {v1, v2, v0}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 202
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/l/c;->g:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    invoke-direct {p0}, Lcom/facebook/l/c;->c()V

    .line 83
    invoke-direct {p0}, Lcom/facebook/l/c;->d()V

    .line 85
    :cond_0
    return-void
.end method

.method protected a(Z)V
    .locals 7
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation

    .prologue
    .line 99
    sget-object v0, Lcom/facebook/l/c;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tryToReportMusicPresenceChange, isListeningToMusic="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 101
    iget-object v0, p0, Lcom/facebook/l/c;->d:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    .line 102
    if-eqz p1, :cond_2

    sget-object v0, Lcom/facebook/l/h;->MUSIC_IS_PLAYING:Lcom/facebook/l/h;

    .line 105
    :goto_0
    iget-object v3, p0, Lcom/facebook/l/c;->j:Lcom/facebook/l/h;

    if-ne v0, v3, :cond_0

    iget-wide v3, p0, Lcom/facebook/l/c;->k:J

    sub-long v3, v1, v3

    const-wide/16 v5, 0x2710

    cmp-long v3, v3, v5

    if-lez v3, :cond_1

    .line 107
    :cond_0
    iget-object v3, p0, Lcom/facebook/l/c;->c:Lcom/facebook/l/b;

    invoke-interface {v3, p1}, Lcom/facebook/l/b;->a(Z)V

    .line 108
    iput-wide v1, p0, Lcom/facebook/l/c;->k:J

    .line 109
    iput-object v0, p0, Lcom/facebook/l/c;->j:Lcom/facebook/l/h;

    .line 111
    :cond_1
    return-void

    .line 102
    :cond_2
    sget-object v0, Lcom/facebook/l/h;->MUSIC_IS_NOT_PLAYING:Lcom/facebook/l/h;

    goto :goto_0
.end method

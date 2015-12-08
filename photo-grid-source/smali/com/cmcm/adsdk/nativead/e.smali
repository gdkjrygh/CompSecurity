.class public final Lcom/cmcm/adsdk/nativead/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/os/Handler;

.field public volatile b:Z

.field public c:Lcom/cmcm/adsdk/nativead/g;

.field private d:J

.field private e:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/cmcm/adsdk/nativead/g;)V
    .locals 2

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Lcom/cmcm/adsdk/nativead/f;

    invoke-direct {v0, p0}, Lcom/cmcm/adsdk/nativead/f;-><init>(Lcom/cmcm/adsdk/nativead/e;)V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/e;->e:Ljava/lang/Runnable;

    .line 16
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/cmcm/adsdk/nativead/e;->b:Z

    .line 17
    const-wide/16 v0, 0x3e8

    iput-wide v0, p0, Lcom/cmcm/adsdk/nativead/e;->d:J

    .line 18
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/e;->c:Lcom/cmcm/adsdk/nativead/g;

    .line 19
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/e;->a:Landroid/os/Handler;

    .line 20
    return-void
.end method

.method static synthetic a(Lcom/cmcm/adsdk/nativead/e;)J
    .locals 2

    .prologue
    .line 8
    iget-wide v0, p0, Lcom/cmcm/adsdk/nativead/e;->d:J

    return-wide v0
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 4

    .prologue
    .line 34
    monitor-enter p0

    :try_start_0
    const-string v0, "CMCMADSDK"

    const-string v1, "CMNativeAdHandler scheduleImpressionRetry"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/e;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 44
    :goto_0
    monitor-exit p0

    return-void

    .line 39
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/e;->c:Lcom/cmcm/adsdk/nativead/g;

    invoke-interface {v0}, Lcom/cmcm/adsdk/nativead/g;->a()V

    .line 40
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/e;->a:Landroid/os/Handler;

    if-nez v0, :cond_1

    .line 41
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/e;->a:Landroid/os/Handler;

    .line 43
    :cond_1
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/e;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/e;->e:Ljava/lang/Runnable;

    iget-wide v2, p0, Lcom/cmcm/adsdk/nativead/e;->d:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b()V
    .locals 2

    .prologue
    .line 47
    monitor-enter p0

    :try_start_0
    const-string v0, "CMCMADSDK"

    const-string v1, "CMNativeAdHandler cancelImpressionRetry"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/e;->b:Z

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/e;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/e;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/e;->a:Landroid/os/Handler;

    .line 52
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/cmcm/adsdk/nativead/e;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    :cond_0
    monitor-exit p0

    return-void

    .line 47
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

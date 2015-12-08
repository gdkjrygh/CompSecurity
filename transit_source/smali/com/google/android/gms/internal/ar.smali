.class public final Lcom/google/android/gms/internal/ar;
.super Lcom/google/android/gms/internal/ay$a;


# instance fields
.field private final eJ:Ljava/lang/Object;

.field private fb:Lcom/google/android/gms/internal/at$a;

.field private fc:Lcom/google/android/gms/internal/aq;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ay$a;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ar;->eJ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/aq;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ar;->eJ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ar;->fc:Lcom/google/android/gms/internal/aq;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Lcom/google/android/gms/internal/at$a;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ar;->eJ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ar;->fb:Lcom/google/android/gms/internal/at$a;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onAdClosed()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ar;->eJ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ar;->fc:Lcom/google/android/gms/internal/aq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ar;->fc:Lcom/google/android/gms/internal/aq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/aq;->E()V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onAdFailedToLoad(I)V
    .locals 3
    .param p1, "error"    # I

    .prologue
    iget-object v1, p0, Lcom/google/android/gms/internal/ar;->eJ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ar;->fb:Lcom/google/android/gms/internal/at$a;

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ar;->fb:Lcom/google/android/gms/internal/at$a;

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/at$a;->d(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ar;->fb:Lcom/google/android/gms/internal/at$a;

    :cond_0
    monitor-exit v1

    return-void

    :cond_1
    const/4 v0, 0x2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onAdLeftApplication()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ar;->eJ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ar;->fc:Lcom/google/android/gms/internal/aq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ar;->fc:Lcom/google/android/gms/internal/aq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/aq;->F()V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onAdLoaded()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/ar;->eJ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ar;->fb:Lcom/google/android/gms/internal/at$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ar;->fb:Lcom/google/android/gms/internal/at$a;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/at$a;->d(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ar;->fb:Lcom/google/android/gms/internal/at$a;

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ar;->fc:Lcom/google/android/gms/internal/aq;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ar;->fc:Lcom/google/android/gms/internal/aq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/aq;->H()V

    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onAdOpened()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ar;->eJ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ar;->fc:Lcom/google/android/gms/internal/aq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ar;->fc:Lcom/google/android/gms/internal/aq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/aq;->G()V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public y()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ar;->eJ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ar;->fc:Lcom/google/android/gms/internal/aq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ar;->fc:Lcom/google/android/gms/internal/aq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/aq;->D()V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.class public final Lcom/google/android/gms/internal/ff$b;
.super Lcom/google/android/gms/internal/ff;

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ff;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final mH:Ljava/lang/Object;

.field private final tI:Lcom/google/android/gms/internal/fe$a;

.field private final tJ:Lcom/google/android/gms/internal/fg;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/fh;Lcom/google/android/gms/internal/fe$a;)V
    .locals 2

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ff;-><init>(Lcom/google/android/gms/internal/fh;Lcom/google/android/gms/internal/fe$a;)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ff$b;->mH:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/ff$b;->tI:Lcom/google/android/gms/internal/fe$a;

    new-instance v0, Lcom/google/android/gms/internal/fg;

    iget-object v1, p2, Lcom/google/android/gms/internal/fh;->lO:Lcom/google/android/gms/internal/gs;

    iget v1, v1, Lcom/google/android/gms/internal/gs;->wU:I

    invoke-direct {v0, p1, p0, p0, v1}, Lcom/google/android/gms/internal/fg;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ff$b;->tJ:Lcom/google/android/gms/internal/fg;

    iget-object v0, p0, Lcom/google/android/gms/internal/ff$b;->tJ:Lcom/google/android/gms/internal/fg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fg;->connect()V

    return-void
.end method


# virtual methods
.method public cJ()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ff$b;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ff$b;->tJ:Lcom/google/android/gms/internal/fg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fg;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ff$b;->tJ:Lcom/google/android/gms/internal/fg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fg;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ff$b;->tJ:Lcom/google/android/gms/internal/fg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fg;->disconnect()V

    :cond_1
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public cK()Lcom/google/android/gms/internal/fl;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ff$b;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ff$b;->tJ:Lcom/google/android/gms/internal/fg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fg;->cL()Lcom/google/android/gms/internal/fl;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    :try_start_1
    monitor-exit v1

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :goto_1
    const/4 v0, 0x0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public onConnected(Landroid/os/Bundle;)V
    .locals 0
    .param p1, "connectionHint"    # Landroid/os/Bundle;

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ff$b;->start()V

    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3
    .param p1, "result"    # Lcom/google/android/gms/common/ConnectionResult;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ff$b;->tI:Lcom/google/android/gms/internal/fe$a;

    new-instance v1, Lcom/google/android/gms/internal/fj;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/fj;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/fe$a;->a(Lcom/google/android/gms/internal/fj;)V

    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 1
    .param p1, "cause"    # I

    .prologue
    const-string v0, "Disconnected from remote ad request service."

    invoke-static {v0}, Lcom/google/android/gms/internal/gr;->S(Ljava/lang/String;)V

    return-void
.end method

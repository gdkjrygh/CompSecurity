.class public final Lcom/google/android/gms/internal/bs$b;
.super Lcom/google/android/gms/internal/bs;

# interfaces
.implements Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/bs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final eJ:Ljava/lang/Object;

.field private final gx:Lcom/google/android/gms/internal/br$a;

.field private final gy:Lcom/google/android/gms/internal/bt;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/bu;Lcom/google/android/gms/internal/br$a;)V
    .locals 2

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/bs;-><init>(Lcom/google/android/gms/internal/bu;Lcom/google/android/gms/internal/br$a;)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/bs$b;->eJ:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/bs$b;->gx:Lcom/google/android/gms/internal/br$a;

    new-instance v0, Lcom/google/android/gms/internal/bt;

    iget-object v1, p2, Lcom/google/android/gms/internal/bu;->eg:Lcom/google/android/gms/internal/co;

    iget v1, v1, Lcom/google/android/gms/internal/co;->hR:I

    invoke-direct {v0, p1, p0, p0, v1}, Lcom/google/android/gms/internal/bt;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/bs$b;->gy:Lcom/google/android/gms/internal/bt;

    iget-object v0, p0, Lcom/google/android/gms/internal/bs$b;->gy:Lcom/google/android/gms/internal/bt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/bt;->connect()V

    return-void
.end method


# virtual methods
.method public ae()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/bs$b;->eJ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bs$b;->gy:Lcom/google/android/gms/internal/bt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/bt;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bs$b;->gy:Lcom/google/android/gms/internal/bt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/bt;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bs$b;->gy:Lcom/google/android/gms/internal/bt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/bt;->disconnect()V

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

.method public af()Lcom/google/android/gms/internal/by;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/bs$b;->eJ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bs$b;->gy:Lcom/google/android/gms/internal/bt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/bt;->ai()Lcom/google/android/gms/internal/by;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    :try_start_1
    monitor-exit v1

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public onConnected(Landroid/os/Bundle;)V
    .locals 0
    .param p1, "connectionHint"    # Landroid/os/Bundle;

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/bs$b;->start()V

    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3
    .param p1, "result"    # Lcom/google/android/gms/common/ConnectionResult;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/bs$b;->gx:Lcom/google/android/gms/internal/br$a;

    new-instance v1, Lcom/google/android/gms/internal/bw;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/bw;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/br$a;->a(Lcom/google/android/gms/internal/bw;)V

    return-void
.end method

.method public onDisconnected()V
    .locals 1

    const-string v0, "Disconnected from remote ad request service."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->m(Ljava/lang/String;)V

    return-void
.end method

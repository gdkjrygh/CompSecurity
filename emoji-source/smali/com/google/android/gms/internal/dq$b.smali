.class public final Lcom/google/android/gms/internal/dq$b;
.super Lcom/google/android/gms/internal/dq;

# interfaces
.implements Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/dq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final ls:Ljava/lang/Object;

.field private final pT:Lcom/google/android/gms/internal/dp$a;

.field private final pU:Lcom/google/android/gms/internal/dr;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/dp$a;)V
    .locals 2

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/dq;-><init>(Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/dp$a;)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/dq$b;->ls:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/dq$b;->pT:Lcom/google/android/gms/internal/dp$a;

    new-instance v0, Lcom/google/android/gms/internal/dr;

    iget-object v1, p2, Lcom/google/android/gms/internal/ds;->kQ:Lcom/google/android/gms/internal/ev;

    iget v1, v1, Lcom/google/android/gms/internal/ev;->sy:I

    invoke-direct {v0, p1, p0, p0, v1}, Lcom/google/android/gms/internal/dr;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/dq$b;->pU:Lcom/google/android/gms/internal/dr;

    iget-object v0, p0, Lcom/google/android/gms/internal/dq$b;->pU:Lcom/google/android/gms/internal/dr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dr;->connect()V

    return-void
.end method


# virtual methods
.method public bs()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/dq$b;->ls:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dq$b;->pU:Lcom/google/android/gms/internal/dr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dr;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/dq$b;->pU:Lcom/google/android/gms/internal/dr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dr;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dq$b;->pU:Lcom/google/android/gms/internal/dr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dr;->disconnect()V

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

.method public bt()Lcom/google/android/gms/internal/dw;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/dq$b;->ls:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dq$b;->pU:Lcom/google/android/gms/internal/dr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dr;->bw()Lcom/google/android/gms/internal/dw;
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
    invoke-virtual {p0}, Lcom/google/android/gms/internal/dq$b;->start()V

    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3
    .param p1, "result"    # Lcom/google/android/gms/common/ConnectionResult;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/dq$b;->pT:Lcom/google/android/gms/internal/dp$a;

    new-instance v1, Lcom/google/android/gms/internal/du;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/du;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/dp$a;->a(Lcom/google/android/gms/internal/du;)V

    return-void
.end method

.method public onDisconnected()V
    .locals 1

    const-string v0, "Disconnected from remote ad request service."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->z(Ljava/lang/String;)V

    return-void
.end method

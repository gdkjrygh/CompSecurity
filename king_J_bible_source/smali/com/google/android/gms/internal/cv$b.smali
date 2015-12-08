.class public final Lcom/google/android/gms/internal/cv$b;
.super Lcom/google/android/gms/internal/cv;

# interfaces
.implements Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/cv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final li:Ljava/lang/Object;

.field private final pc:Lcom/google/android/gms/internal/cu$a;

.field private final pd:Lcom/google/android/gms/internal/cw;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/cx;Lcom/google/android/gms/internal/cu$a;)V
    .locals 2

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/cv;-><init>(Lcom/google/android/gms/internal/cx;Lcom/google/android/gms/internal/cu$a;)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/cv$b;->li:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/cv$b;->pc:Lcom/google/android/gms/internal/cu$a;

    new-instance v0, Lcom/google/android/gms/internal/cw;

    iget-object v1, p2, Lcom/google/android/gms/internal/cx;->kK:Lcom/google/android/gms/internal/dx;

    iget v1, v1, Lcom/google/android/gms/internal/dx;->rs:I

    invoke-direct {v0, p1, p0, p0, v1}, Lcom/google/android/gms/internal/cw;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/cv$b;->pd:Lcom/google/android/gms/internal/cw;

    iget-object v0, p0, Lcom/google/android/gms/internal/cv$b;->pd:Lcom/google/android/gms/internal/cw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cw;->connect()V

    return-void
.end method


# virtual methods
.method public be()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/cv$b;->li:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cv$b;->pd:Lcom/google/android/gms/internal/cw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cw;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cv$b;->pd:Lcom/google/android/gms/internal/cw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cw;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cv$b;->pd:Lcom/google/android/gms/internal/cw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cw;->disconnect()V

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

.method public bf()Lcom/google/android/gms/internal/db;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/cv$b;->li:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cv$b;->pd:Lcom/google/android/gms/internal/cw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cw;->bi()Lcom/google/android/gms/internal/db;
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
    invoke-virtual {p0}, Lcom/google/android/gms/internal/cv$b;->start()V

    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3
    .param p1, "result"    # Lcom/google/android/gms/common/ConnectionResult;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/cv$b;->pc:Lcom/google/android/gms/internal/cu$a;

    new-instance v1, Lcom/google/android/gms/internal/cz;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/cz;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/cu$a;->a(Lcom/google/android/gms/internal/cz;)V

    return-void
.end method

.method public onDisconnected()V
    .locals 1

    const-string v0, "Disconnected from remote ad request service."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->v(Ljava/lang/String;)V

    return-void
.end method

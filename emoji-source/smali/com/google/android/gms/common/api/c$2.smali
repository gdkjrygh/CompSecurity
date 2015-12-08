.class Lcom/google/android/gms/common/api/c$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/api/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Ek:Lcom/google/android/gms/common/api/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/c$2;->Ek:Lcom/google/android/gms/common/api/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnected(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "connectionHint"    # Landroid/os/Bundle;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/common/api/c$2;->Ek:Lcom/google/android/gms/common/api/c;

    invoke-static {v0}, Lcom/google/android/gms/common/api/c;->a(Lcom/google/android/gms/common/api/c;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/c$2;->Ek:Lcom/google/android/gms/common/api/c;

    invoke-static {v0}, Lcom/google/android/gms/common/api/c;->b(Lcom/google/android/gms/common/api/c;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/c$2;->Ek:Lcom/google/android/gms/common/api/c;

    invoke-static {v0}, Lcom/google/android/gms/common/api/c;->c(Lcom/google/android/gms/common/api/c;)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/c$2;->Ek:Lcom/google/android/gms/common/api/c;

    invoke-static {v0}, Lcom/google/android/gms/common/api/c;->d(Lcom/google/android/gms/common/api/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/c$2;->Ek:Lcom/google/android/gms/common/api/c;

    invoke-static {v0}, Lcom/google/android/gms/common/api/c;->a(Lcom/google/android/gms/common/api/c;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/c$2;->Ek:Lcom/google/android/gms/common/api/c;

    invoke-static {v1}, Lcom/google/android/gms/common/api/c;->a(Lcom/google/android/gms/common/api/c;)Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public onConnectionSuspended(I)V
    .locals 4
    .param p1, "cause"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/common/api/c$2;->Ek:Lcom/google/android/gms/common/api/c;

    invoke-static {v0}, Lcom/google/android/gms/common/api/c;->a(Lcom/google/android/gms/common/api/c;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/c$2;->Ek:Lcom/google/android/gms/common/api/c;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/c;->a(Lcom/google/android/gms/common/api/c;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    packed-switch p1, :pswitch_data_0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/c$2;->Ek:Lcom/google/android/gms/common/api/c;

    invoke-static {v0}, Lcom/google/android/gms/common/api/c;->a(Lcom/google/android/gms/common/api/c;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    :goto_1
    return-void

    :pswitch_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/c$2;->Ek:Lcom/google/android/gms/common/api/c;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/c;->connect()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/c$2;->Ek:Lcom/google/android/gms/common/api/c;

    invoke-static {v1}, Lcom/google/android/gms/common/api/c;->a(Lcom/google/android/gms/common/api/c;)Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :pswitch_1
    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/common/api/c$2;->Ek:Lcom/google/android/gms/common/api/c;

    invoke-static {v0}, Lcom/google/android/gms/common/api/c;->e(Lcom/google/android/gms/common/api/c;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/c$2;->Ek:Lcom/google/android/gms/common/api/c;

    invoke-static {v0}, Lcom/google/android/gms/common/api/c;->a(Lcom/google/android/gms/common/api/c;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_1

    :cond_0
    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/common/api/c$2;->Ek:Lcom/google/android/gms/common/api/c;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/c;->b(Lcom/google/android/gms/common/api/c;I)I

    iget-object v0, p0, Lcom/google/android/gms/common/api/c$2;->Ek:Lcom/google/android/gms/common/api/c;

    iget-object v0, v0, Lcom/google/android/gms/common/api/c;->Ec:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/common/api/c$2;->Ek:Lcom/google/android/gms/common/api/c;

    iget-object v1, v1, Lcom/google/android/gms/common/api/c;->Ec:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/common/api/c$2;->Ek:Lcom/google/android/gms/common/api/c;

    invoke-static {v2}, Lcom/google/android/gms/common/api/c;->f(Lcom/google/android/gms/common/api/c;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

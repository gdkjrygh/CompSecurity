.class final Lcom/google/android/gms/internal/de$a;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/de;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic kP:Lcom/google/android/gms/internal/de;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/de;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/de$a;->kP:Lcom/google/android/gms/internal/de;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/de$a;, "Lcom/google/android/gms/internal/de<TT;>.a;"
    const/4 v4, 0x2

    const/4 v3, 0x1

    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/de$a;->kP:Lcom/google/android/gms/internal/de;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/de;->isConnecting()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/de$b;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/de$b;->aF()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/de$b;->unregister()V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/de$a;->kP:Lcom/google/android/gms/internal/de;

    invoke-static {v0}, Lcom/google/android/gms/internal/de;->a(Lcom/google/android/gms/internal/de;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/de$a;->kP:Lcom/google/android/gms/internal/de;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/google/android/gms/internal/de;->kM:Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/de$a;->kP:Lcom/google/android/gms/internal/de;

    new-instance v2, Lcom/google/android/gms/common/ConnectionResult;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/de;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/de$a;->kP:Lcom/google/android/gms/internal/de;

    invoke-static {v0}, Lcom/google/android/gms/internal/de;->b(Lcom/google/android/gms/internal/de;)Ljava/util/ArrayList;

    move-result-object v1

    monitor-enter v1

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/de$a;->kP:Lcom/google/android/gms/internal/de;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/de;->kL:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/de$a;->kP:Lcom/google/android/gms/internal/de;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/de;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/de$a;->kP:Lcom/google/android/gms/internal/de;

    invoke-static {v0}, Lcom/google/android/gms/internal/de;->b(Lcom/google/android/gms/internal/de;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;

    iget-object v2, p0, Lcom/google/android/gms/internal/de$a;->kP:Lcom/google/android/gms/internal/de;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/de;->ba()Landroid/os/Bundle;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;->onConnected(Landroid/os/Bundle;)V

    :cond_2
    monitor-exit v1

    goto :goto_0

    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v4, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/de$a;->kP:Lcom/google/android/gms/internal/de;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/de;->isConnected()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/de$b;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/de$b;->aF()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/de$b;->unregister()V

    goto :goto_0

    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    if-eq v0, v4, :cond_5

    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v3, :cond_6

    :cond_5
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/de$b;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/de$b;->be()V

    goto/16 :goto_0

    :cond_6
    const-string v0, "GmsClient"

    const-string v1, "Don\'t know how to handle this message."

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0
.end method

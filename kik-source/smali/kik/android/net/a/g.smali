.class final Lkik/android/net/a/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/net/a/e;


# direct methods
.method constructor <init>(Lkik/android/net/a/e;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lkik/android/net/a/g;->a:Lkik/android/net/a/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 101
    :try_start_0
    iget-object v0, p0, Lkik/android/net/a/g;->a:Lkik/android/net/a/e;

    invoke-static {v0}, Lkik/android/net/a/e;->b(Lkik/android/net/a/e;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 108
    invoke-static {}, Lkik/android/net/a/e;->b()Lorg/c/b;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "File upload manager thread ending: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lkik/android/net/a/g;->a:Lkik/android/net/a/e;

    invoke-static {v1}, Lkik/android/net/a/e;->c(Lkik/android/net/a/e;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    invoke-static {}, Lkik/android/net/a/e;->c()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 110
    :try_start_1
    invoke-static {}, Lkik/android/net/a/e;->d()Lkik/android/net/a/e;

    .line 111
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    :goto_0
    iget-object v0, p0, Lkik/android/net/a/g;->a:Lkik/android/net/a/e;

    invoke-static {v0}, Lkik/android/net/a/e;->d(Lkik/android/net/a/e;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 114
    iget-object v0, p0, Lkik/android/net/a/g;->a:Lkik/android/net/a/e;

    invoke-static {v0}, Lkik/android/net/a/e;->d(Lkik/android/net/a/e;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    goto :goto_0

    .line 111
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 103
    :catch_0
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 108
    invoke-static {}, Lkik/android/net/a/e;->b()Lorg/c/b;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "File upload manager thread ending: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lkik/android/net/a/g;->a:Lkik/android/net/a/e;

    invoke-static {v1}, Lkik/android/net/a/e;->c(Lkik/android/net/a/e;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    invoke-static {}, Lkik/android/net/a/e;->c()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 110
    :try_start_4
    invoke-static {}, Lkik/android/net/a/e;->d()Lkik/android/net/a/e;

    .line 111
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 113
    :goto_1
    iget-object v0, p0, Lkik/android/net/a/g;->a:Lkik/android/net/a/e;

    invoke-static {v0}, Lkik/android/net/a/e;->d(Lkik/android/net/a/e;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 114
    iget-object v0, p0, Lkik/android/net/a/g;->a:Lkik/android/net/a/e;

    invoke-static {v0}, Lkik/android/net/a/e;->d(Lkik/android/net/a/e;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    goto :goto_1

    .line 111
    :catchall_1
    move-exception v0

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0

    .line 108
    :catchall_2
    move-exception v0

    invoke-static {}, Lkik/android/net/a/e;->b()Lorg/c/b;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "File upload manager thread ending: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lkik/android/net/a/g;->a:Lkik/android/net/a/e;

    invoke-static {v2}, Lkik/android/net/a/e;->c(Lkik/android/net/a/e;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    invoke-static {}, Lkik/android/net/a/e;->c()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 110
    :try_start_6
    invoke-static {}, Lkik/android/net/a/e;->d()Lkik/android/net/a/e;

    .line 111
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 113
    :goto_2
    iget-object v1, p0, Lkik/android/net/a/g;->a:Lkik/android/net/a/e;

    invoke-static {v1}, Lkik/android/net/a/e;->d(Lkik/android/net/a/e;)Landroid/os/PowerManager$WakeLock;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 114
    iget-object v1, p0, Lkik/android/net/a/g;->a:Lkik/android/net/a/e;

    invoke-static {v1}, Lkik/android/net/a/e;->d(Lkik/android/net/a/e;)Landroid/os/PowerManager$WakeLock;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    goto :goto_2

    .line 111
    :catchall_3
    move-exception v0

    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v0

    .line 114
    :cond_0
    throw v0

    .line 117
    :cond_1
    return-void
.end method

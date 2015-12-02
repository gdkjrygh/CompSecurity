.class Lcom/qihoo360/mobilesafe/support/a/c$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/support/a/c;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLcom/qihoo360/mobilesafe/support/a/a;J)[B
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/support/a/c;

.field private final synthetic b:Lcom/qihoo360/mobilesafe/support/a/c$a;

.field private final synthetic c:Z

.field private final synthetic d:Lcom/qihoo360/mobilesafe/support/a/a;

.field private final synthetic e:[B


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/support/a/c;Lcom/qihoo360/mobilesafe/support/a/c$a;ZLcom/qihoo360/mobilesafe/support/a/a;[B)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    iput-boolean p3, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->c:Z

    iput-object p4, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    iput-object p5, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->e:[B

    .line 421
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 425
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-boolean v0, v0, Lcom/qihoo360/mobilesafe/support/a/c;->f:Z

    if-eqz v0, :cond_0

    .line 426
    const-string/jumbo v0, "RootClient"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Connecting "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-object v2, v2, Lcom/qihoo360/mobilesafe/support/a/c;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 428
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a/c;->b(Lcom/qihoo360/mobilesafe/support/a/c;)Landroid/net/LocalSocket;

    move-result-object v1

    .line 430
    if-nez v1, :cond_2

    .line 433
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    monitor-enter v1

    .line 434
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    .line 435
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 433
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 438
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    if-eqz v0, :cond_1

    .line 440
    :try_start_1
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/support/a/a;->a(IZ[B)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_5

    .line 495
    :cond_1
    :goto_0
    return-void

    .line 433
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 448
    :cond_2
    :try_start_3
    invoke-virtual {v1}, Landroid/net/LocalSocket;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 450
    invoke-virtual {v1}, Landroid/net/LocalSocket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->e:[B

    invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write([B)V

    .line 452
    new-instance v0, Ljava/io/DataInputStream;

    invoke-virtual {v1}, Landroid/net/LocalSocket;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 454
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Ljava/io/InputStream;)[B

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo360/mobilesafe/support/a/c$a;->c:[B

    .line 463
    invoke-virtual {v0}, Ljava/io/DataInputStream;->close()V

    .line 467
    :cond_3
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->c:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    if-eqz v0, :cond_4

    .line 468
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    const/4 v2, 0x2

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    iget-object v4, v4, Lcom/qihoo360/mobilesafe/support/a/c$a;->c:[B

    invoke-interface {v0, v2, v3, v4}, Lcom/qihoo360/mobilesafe/support/a/a;->a(IZ[B)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 482
    :cond_4
    :try_start_4
    invoke-virtual {v1}, Landroid/net/LocalSocket;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 487
    :goto_1
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    monitor-enter v1

    .line 488
    :try_start_5
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    .line 489
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 487
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 492
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-boolean v0, v0, Lcom/qihoo360/mobilesafe/support/a/c;->f:Z

    if-eqz v0, :cond_1

    .line 493
    const-string/jumbo v0, "RootClient"

    const-string/jumbo v1, "Exec thread finished."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 470
    :catch_0
    move-exception v0

    .line 471
    :try_start_6
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-boolean v2, v2, Lcom/qihoo360/mobilesafe/support/a/c;->f:Z

    if-eqz v2, :cond_5

    .line 472
    const-string/jumbo v2, "RootClient"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 473
    :cond_5
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->c:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->d:Lcom/qihoo360/mobilesafe/support/a/a;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v0, :cond_6

    .line 475
    :try_start_7
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$3;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v4}, Lcom/qihoo360/mobilesafe/support/a/a;->a(IZ[B)V
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 482
    :cond_6
    :goto_2
    :try_start_8
    invoke-virtual {v1}, Landroid/net/LocalSocket;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    goto :goto_1

    .line 483
    :catch_1
    move-exception v0

    goto :goto_1

    .line 480
    :catchall_1
    move-exception v0

    .line 482
    :try_start_9
    invoke-virtual {v1}, Landroid/net/LocalSocket;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2

    .line 485
    :goto_3
    throw v0

    .line 487
    :catchall_2
    move-exception v0

    :try_start_a
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    throw v0

    .line 483
    :catch_2
    move-exception v1

    goto :goto_3

    :catch_3
    move-exception v0

    goto :goto_1

    .line 476
    :catch_4
    move-exception v0

    goto :goto_2

    .line 441
    :catch_5
    move-exception v0

    goto/16 :goto_0
.end method

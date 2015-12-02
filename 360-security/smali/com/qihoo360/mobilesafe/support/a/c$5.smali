.class Lcom/qihoo360/mobilesafe/support/a/c$5;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/support/a/c;->b(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/support/a/c;

.field private final synthetic b:Landroid/content/Context;

.field private final synthetic c:Ljava/lang/String;

.field private final synthetic d:Landroid/os/Handler;

.field private final synthetic e:Ljava/lang/Runnable;

.field private final synthetic f:Lcom/qihoo360/mobilesafe/support/a/c$a;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/support/a/c;Landroid/content/Context;Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;Lcom/qihoo360/mobilesafe/support/a/c$a;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->d:Landroid/os/Handler;

    iput-object p5, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->e:Ljava/lang/Runnable;

    iput-object p6, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->f:Lcom/qihoo360/mobilesafe/support/a/c$a;

    .line 654
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 658
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a/h;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 661
    if-eqz v0, :cond_0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-object v3, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->c:Ljava/lang/String;

    invoke-virtual {v1, v0, v3}, Lcom/qihoo360/mobilesafe/support/a/c;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 662
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-boolean v0, v0, Lcom/qihoo360/mobilesafe/support/a/c;->e:Z

    if-eqz v0, :cond_1

    .line 663
    const-string/jumbo v0, "RootClient"

    const-string/jumbo v1, "libsu has been modified or can\'t fetch su"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 664
    :cond_1
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->d:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 666
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/support/a/c;->c:Landroid/net/LocalServerSocket;

    invoke-virtual {v0}, Landroid/net/LocalServerSocket;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_c

    .line 669
    :goto_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iput-object v2, v0, Lcom/qihoo360/mobilesafe/support/a/c;->c:Landroid/net/LocalServerSocket;

    .line 670
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->f:Lcom/qihoo360/mobilesafe/support/a/c$a;

    monitor-enter v1

    .line 671
    :try_start_1
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->f:Lcom/qihoo360/mobilesafe/support/a/c$a;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    .line 672
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->f:Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 670
    monitor-exit v1

    .line 737
    :cond_2
    :goto_1
    return-void

    .line 670
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 677
    :cond_3
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-boolean v0, v0, Lcom/qihoo360/mobilesafe/support/a/c;->e:Z

    if-eqz v0, :cond_4

    .line 678
    const-string/jumbo v0, "RootClient"

    const-string/jumbo v1, "Listener thread started."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 687
    :cond_4
    :try_start_2
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/support/a/c;->c:Landroid/net/LocalServerSocket;

    invoke-virtual {v0}, Landroid/net/LocalServerSocket;->accept()Landroid/net/LocalSocket;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_a
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move-result-object v3

    .line 688
    :try_start_3
    invoke-virtual {v3}, Landroid/net/LocalSocket;->getPeerCredentials()Landroid/net/Credentials;

    move-result-object v0

    .line 689
    invoke-virtual {v0}, Landroid/net/Credentials;->getUid()I

    move-result v1

    .line 690
    iget-object v4, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-boolean v4, v4, Lcom/qihoo360/mobilesafe/support/a/c;->e:Z

    if-eqz v4, :cond_5

    .line 691
    const-string/jumbo v4, "RootClient"

    const-string/jumbo v5, "Connected by pid = %d, uid = %d, gid = %d"

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    .line 692
    invoke-virtual {v0}, Landroid/net/Credentials;->getPid()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v6, v7

    const/4 v7, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v6, v7

    const/4 v7, 0x2

    invoke-virtual {v0}, Landroid/net/Credentials;->getGid()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v7

    .line 691
    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 694
    :cond_5
    if-nez v1, :cond_9

    .line 695
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    invoke-virtual {v3}, Landroid/net/LocalSocket;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_b
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 697
    :try_start_4
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Lcom/qihoo360/mobilesafe/support/a/c;->d:Ljava/lang/String;

    .line 698
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-boolean v0, v0, Lcom/qihoo360/mobilesafe/support/a/c;->e:Z

    if-eqz v0, :cond_6

    .line 699
    const-string/jumbo v0, "RootClient"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string/jumbo v5, "Server Name = "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-object v5, v5, Lcom/qihoo360/mobilesafe/support/a/c;->d:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 701
    :cond_6
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/support/a/c;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 703
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->b:Landroid/content/Context;

    new-instance v4, Landroid/content/Intent;

    const-string/jumbo v5, "com.qihoo.action.ROOT_SERVICE_READY"

    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 709
    :goto_2
    iget-object v4, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->f:Lcom/qihoo360/mobilesafe/support/a/c$a;

    monitor-enter v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 710
    :try_start_5
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->f:Lcom/qihoo360/mobilesafe/support/a/c$a;

    const/4 v5, 0x0

    iput-boolean v5, v0, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    .line 711
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->f:Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 709
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 718
    :try_start_6
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 722
    :goto_3
    :try_start_7
    invoke-virtual {v3}, Landroid/net/LocalSocket;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    .line 726
    :goto_4
    :try_start_8
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/support/a/c;->c:Landroid/net/LocalServerSocket;

    invoke-virtual {v0}, Landroid/net/LocalServerSocket;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    .line 729
    :goto_5
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iput-object v2, v0, Lcom/qihoo360/mobilesafe/support/a/c;->c:Landroid/net/LocalServerSocket;

    .line 732
    :goto_6
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->d:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 734
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-boolean v0, v0, Lcom/qihoo360/mobilesafe/support/a/c;->e:Z

    if-eqz v0, :cond_2

    .line 735
    const-string/jumbo v0, "RootClient"

    const-string/jumbo v1, "Listener thread finished."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 705
    :cond_7
    :try_start_9
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    const/4 v4, 0x0

    iput-object v4, v0, Lcom/qihoo360/mobilesafe/support/a/c;->d:Ljava/lang/String;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto :goto_2

    .line 713
    :catch_0
    move-exception v0

    .line 714
    :goto_7
    :try_start_a
    iget-object v4, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-boolean v4, v4, Lcom/qihoo360/mobilesafe/support/a/c;->e:Z

    if-eqz v4, :cond_8

    .line 715
    const-string/jumbo v4, "RootClient"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 718
    :cond_8
    :try_start_b
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1

    .line 722
    :goto_8
    :try_start_c
    invoke-virtual {v3}, Landroid/net/LocalSocket;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_2

    .line 726
    :goto_9
    :try_start_d
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/support/a/c;->c:Landroid/net/LocalServerSocket;

    invoke-virtual {v0}, Landroid/net/LocalServerSocket;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_9

    .line 729
    :goto_a
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iput-object v2, v0, Lcom/qihoo360/mobilesafe/support/a/c;->c:Landroid/net/LocalServerSocket;

    goto :goto_6

    .line 709
    :catchall_1
    move-exception v0

    :try_start_e
    monitor-exit v4
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    :try_start_f
    throw v0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 716
    :catchall_2
    move-exception v0

    .line 718
    :goto_b
    :try_start_10
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_3

    .line 722
    :goto_c
    :try_start_11
    invoke-virtual {v3}, Landroid/net/LocalSocket;->close()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_4

    .line 726
    :goto_d
    :try_start_12
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-object v1, v1, Lcom/qihoo360/mobilesafe/support/a/c;->c:Landroid/net/LocalServerSocket;

    invoke-virtual {v1}, Landroid/net/LocalServerSocket;->close()V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_8

    .line 729
    :goto_e
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c$5;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iput-object v2, v1, Lcom/qihoo360/mobilesafe/support/a/c;->c:Landroid/net/LocalServerSocket;

    .line 730
    throw v0

    .line 719
    :catch_1
    move-exception v0

    goto :goto_8

    .line 723
    :catch_2
    move-exception v0

    goto :goto_9

    .line 719
    :catch_3
    move-exception v1

    goto :goto_c

    .line 723
    :catch_4
    move-exception v1

    goto :goto_d

    .line 719
    :catch_5
    move-exception v0

    goto :goto_3

    .line 723
    :catch_6
    move-exception v0

    goto :goto_4

    .line 727
    :catch_7
    move-exception v0

    goto :goto_5

    :catch_8
    move-exception v1

    goto :goto_e

    .line 716
    :catchall_3
    move-exception v0

    move-object v1, v2

    move-object v3, v2

    goto :goto_b

    :catchall_4
    move-exception v0

    move-object v1, v2

    goto :goto_b

    .line 727
    :catch_9
    move-exception v0

    goto :goto_a

    .line 713
    :catch_a
    move-exception v0

    move-object v1, v2

    move-object v3, v2

    goto :goto_7

    :catch_b
    move-exception v0

    move-object v1, v2

    goto :goto_7

    .line 667
    :catch_c
    move-exception v0

    goto/16 :goto_0

    :cond_9
    move-object v1, v2

    goto/16 :goto_2
.end method

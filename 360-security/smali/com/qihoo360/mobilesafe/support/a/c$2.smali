.class Lcom/qihoo360/mobilesafe/support/a/c$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/support/a/c;->b()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/support/a/c;

.field private final synthetic b:Lcom/qihoo360/mobilesafe/support/a/c$a;

.field private final synthetic c:[B


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/support/a/c;Lcom/qihoo360/mobilesafe/support/a/c$a;[B)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a/c$2;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/support/a/c$2;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    iput-object p3, p0, Lcom/qihoo360/mobilesafe/support/a/c$2;->c:[B

    .line 279
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 287
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$2;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a/c;->b(Lcom/qihoo360/mobilesafe/support/a/c;)Landroid/net/LocalSocket;

    move-result-object v1

    .line 289
    if-nez v1, :cond_1

    .line 291
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c$2;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    monitor-enter v1

    .line 292
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$2;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    .line 293
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$2;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 291
    monitor-exit v1

    .line 329
    :cond_0
    :goto_0
    return-void

    .line 291
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 299
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Landroid/net/LocalSocket;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 301
    invoke-virtual {v1}, Landroid/net/LocalSocket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/c$2;->c:[B

    invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write([B)V

    .line 303
    new-instance v0, Ljava/io/DataInputStream;

    invoke-virtual {v1}, Landroid/net/LocalSocket;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 305
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readLine()Ljava/lang/String;

    move-result-object v0

    .line 306
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/c$2;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-boolean v2, v2, Lcom/qihoo360/mobilesafe/support/a/c;->f:Z

    if-eqz v2, :cond_2

    .line 307
    const-string/jumbo v2, "RootClient"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "Response = "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 309
    :cond_2
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$2;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    const/4 v2, 0x0

    iput v2, v0, Lcom/qihoo360/mobilesafe/support/a/c$a;->a:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 316
    :cond_3
    :try_start_2
    invoke-virtual {v1}, Landroid/net/LocalSocket;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 321
    :goto_1
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c$2;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    monitor-enter v1

    .line 322
    :try_start_3
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$2;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    .line 323
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$2;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 321
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 326
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$2;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-boolean v0, v0, Lcom/qihoo360/mobilesafe/support/a/c;->f:Z

    if-eqz v0, :cond_0

    .line 327
    const-string/jumbo v0, "RootClient"

    const-string/jumbo v1, "Exec thread finished."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 311
    :catch_0
    move-exception v0

    .line 312
    :try_start_4
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/c$2;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-boolean v2, v2, Lcom/qihoo360/mobilesafe/support/a/c;->f:Z

    if-eqz v2, :cond_4

    .line 313
    const-string/jumbo v2, "RootClient"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 316
    :cond_4
    :try_start_5
    invoke-virtual {v1}, Landroid/net/LocalSocket;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_1

    .line 317
    :catch_1
    move-exception v0

    goto :goto_1

    .line 314
    :catchall_1
    move-exception v0

    .line 316
    :try_start_6
    invoke-virtual {v1}, Landroid/net/LocalSocket;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 319
    :goto_2
    throw v0

    .line 321
    :catchall_2
    move-exception v0

    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw v0

    .line 317
    :catch_2
    move-exception v1

    goto :goto_2

    :catch_3
    move-exception v0

    goto :goto_1
.end method

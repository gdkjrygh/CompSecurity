.class final Lcom/ijoysoft/appwall/f;
.super Ljava/lang/Thread;


# instance fields
.field final synthetic a:Lcom/ijoysoft/appwall/d;


# direct methods
.method constructor <init>(Lcom/ijoysoft/appwall/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/appwall/f;->a:Lcom/ijoysoft/appwall/d;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    :goto_0
    iget-object v0, p0, Lcom/ijoysoft/appwall/f;->a:Lcom/ijoysoft/appwall/d;

    invoke-static {v0}, Lcom/ijoysoft/appwall/d;->a(Lcom/ijoysoft/appwall/d;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/ijoysoft/appwall/f;->a:Lcom/ijoysoft/appwall/d;

    invoke-static {v0}, Lcom/ijoysoft/appwall/d;->b(Lcom/ijoysoft/appwall/d;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ijoysoft/appwall/h;

    invoke-static {v0}, Lcom/ijoysoft/appwall/h;->b(Lcom/ijoysoft/appwall/h;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/ijoysoft/appwall/u;->b(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Lcom/ijoysoft/appwall/i;->a([B)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ijoysoft/appwall/h;->a(Lcom/ijoysoft/appwall/h;Landroid/graphics/Bitmap;)V

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, Landroid/os/Message;->what:I

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v2, p0, Lcom/ijoysoft/appwall/f;->a:Lcom/ijoysoft/appwall/d;

    invoke-static {v2}, Lcom/ijoysoft/appwall/d;->c(Lcom/ijoysoft/appwall/d;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    iget-object v1, p0, Lcom/ijoysoft/appwall/f;->a:Lcom/ijoysoft/appwall/d;

    invoke-static {v1}, Lcom/ijoysoft/appwall/d;->d(Lcom/ijoysoft/appwall/d;)Ljava/util/HashMap;

    move-result-object v1

    invoke-static {v0}, Lcom/ijoysoft/appwall/h;->b(Lcom/ijoysoft/appwall/h;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/ref/SoftReference;

    invoke-static {v0}, Lcom/ijoysoft/appwall/h;->c(Lcom/ijoysoft/appwall/h;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lcom/ijoysoft/appwall/h;->c(Lcom/ijoysoft/appwall/h;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v0}, Lcom/ijoysoft/appwall/h;->d(Lcom/ijoysoft/appwall/h;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    :try_start_1
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    if-eqz v0, :cond_4

    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/ijoysoft/appwall/f;->a:Lcom/ijoysoft/appwall/d;

    invoke-static {v0}, Lcom/ijoysoft/appwall/d;->b(Lcom/ijoysoft/appwall/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    iget-object v0, p0, Lcom/ijoysoft/appwall/f;->a:Lcom/ijoysoft/appwall/d;

    invoke-static {v0}, Lcom/ijoysoft/appwall/d;->a(Lcom/ijoysoft/appwall/d;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_3
    iget-object v0, p0, Lcom/ijoysoft/appwall/f;->a:Lcom/ijoysoft/appwall/d;

    invoke-static {v0}, Lcom/ijoysoft/appwall/d;->a(Lcom/ijoysoft/appwall/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    monitor-enter p0

    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_4
    :try_start_4
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_5
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    :cond_6
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x64

    invoke-virtual {v1, v2, v3, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_5
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    :catch_2
    move-exception v0

    :try_start_6
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_1

    :catch_3
    move-exception v0

    :try_start_7
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_2
.end method

.class Lcom/arist/util/AsyncImageLoader$2;
.super Ljava/lang/Thread;
.source "AsyncImageLoader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/util/AsyncImageLoader;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/util/AsyncImageLoader;


# direct methods
.method constructor <init>(Lcom/arist/util/AsyncImageLoader;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/util/AsyncImageLoader$2;->this$0:Lcom/arist/util/AsyncImageLoader;

    .line 38
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    .line 41
    :goto_0
    iget-object v4, p0, Lcom/arist/util/AsyncImageLoader$2;->this$0:Lcom/arist/util/AsyncImageLoader;

    # getter for: Lcom/arist/util/AsyncImageLoader;->isLoop:Z
    invoke-static {v4}, Lcom/arist/util/AsyncImageLoader;->access$0(Lcom/arist/util/AsyncImageLoader;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 78
    :cond_0
    return-void

    .line 46
    :cond_1
    :try_start_0
    iget-object v4, p0, Lcom/arist/util/AsyncImageLoader$2;->this$0:Lcom/arist/util/AsyncImageLoader;

    # getter for: Lcom/arist/util/AsyncImageLoader;->tasks:Ljava/util/ArrayList;
    invoke-static {v4}, Lcom/arist/util/AsyncImageLoader;->access$1(Lcom/arist/util/AsyncImageLoader;)Ljava/util/ArrayList;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;

    .line 47
    .local v3, "task":Lcom/arist/util/AsyncImageLoader$ImageLoadTask;
    # getter for: Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->netPath:Ljava/lang/String;
    invoke-static {v3}, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->access$1(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;)Ljava/lang/String;

    move-result-object v4

    .line 48
    const/4 v5, 0x0

    const/4 v6, 0x1

    .line 47
    invoke-static {v4, v5, v6}, Lcom/arist/util/HttpService;->getBytes(Ljava/lang/String;Ljava/util/ArrayList;I)[B

    move-result-object v0

    .line 49
    .local v0, "data":[B
    const/16 v4, 0xc8

    .line 50
    const/16 v5, 0xc8

    .line 49
    invoke-static {v0, v4, v5}, Lcom/arist/util/BitmapService;->getBitmap([BII)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->access$3(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;Landroid/graphics/Bitmap;)V

    .line 52
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 53
    .local v2, "msg":Landroid/os/Message;
    const/4 v4, 0x0

    iput v4, v2, Landroid/os/Message;->what:I

    .line 54
    iput-object v3, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 55
    iget-object v4, p0, Lcom/arist/util/AsyncImageLoader$2;->this$0:Lcom/arist/util/AsyncImageLoader;

    # getter for: Lcom/arist/util/AsyncImageLoader;->handler:Landroid/os/Handler;
    invoke-static {v4}, Lcom/arist/util/AsyncImageLoader;->access$2(Lcom/arist/util/AsyncImageLoader;)Landroid/os/Handler;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 57
    iget-object v4, p0, Lcom/arist/util/AsyncImageLoader$2;->this$0:Lcom/arist/util/AsyncImageLoader;

    # getter for: Lcom/arist/util/AsyncImageLoader;->caches:Ljava/util/HashMap;
    invoke-static {v4}, Lcom/arist/util/AsyncImageLoader;->access$3(Lcom/arist/util/AsyncImageLoader;)Ljava/util/HashMap;

    move-result-object v4

    # getter for: Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->netPath:Ljava/lang/String;
    invoke-static {v3}, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->access$1(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/ref/SoftReference;

    .line 58
    # getter for: Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;
    invoke-static {v3}, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->access$2(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;)Landroid/graphics/Bitmap;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 57
    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    # getter for: Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;
    invoke-static {v3}, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->access$2(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;)Landroid/graphics/Bitmap;

    move-result-object v4

    # getter for: Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->savePath:Ljava/lang/String;
    invoke-static {v3}, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->access$4(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/arist/util/BitmapService;->save(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .end local v0    # "data":[B
    .end local v2    # "msg":Landroid/os/Message;
    .end local v3    # "task":Lcom/arist/util/AsyncImageLoader$ImageLoadTask;
    :cond_2
    :goto_1
    iget-object v4, p0, Lcom/arist/util/AsyncImageLoader$2;->this$0:Lcom/arist/util/AsyncImageLoader;

    # getter for: Lcom/arist/util/AsyncImageLoader;->tasks:Ljava/util/ArrayList;
    invoke-static {v4}, Lcom/arist/util/AsyncImageLoader;->access$1(Lcom/arist/util/AsyncImageLoader;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_3

    iget-object v4, p0, Lcom/arist/util/AsyncImageLoader$2;->this$0:Lcom/arist/util/AsyncImageLoader;

    # getter for: Lcom/arist/util/AsyncImageLoader;->isLoop:Z
    invoke-static {v4}, Lcom/arist/util/AsyncImageLoader;->access$0(Lcom/arist/util/AsyncImageLoader;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 66
    :cond_3
    iget-object v4, p0, Lcom/arist/util/AsyncImageLoader$2;->this$0:Lcom/arist/util/AsyncImageLoader;

    # getter for: Lcom/arist/util/AsyncImageLoader;->isLoop:Z
    invoke-static {v4}, Lcom/arist/util/AsyncImageLoader;->access$0(Lcom/arist/util/AsyncImageLoader;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 70
    monitor-enter p0

    .line 72
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    :goto_2
    :try_start_2
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v4

    .line 61
    :catch_0
    move-exception v1

    .line 62
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 73
    .end local v1    # "e":Ljava/lang/Exception;
    :catch_1
    move-exception v1

    .line 74
    .local v1, "e":Ljava/lang/InterruptedException;
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2
.end method

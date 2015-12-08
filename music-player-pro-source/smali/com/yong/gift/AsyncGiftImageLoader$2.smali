.class Lcom/yong/gift/AsyncGiftImageLoader$2;
.super Ljava/lang/Thread;
.source "AsyncGiftImageLoader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yong/gift/AsyncGiftImageLoader;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/yong/gift/AsyncGiftImageLoader;


# direct methods
.method constructor <init>(Lcom/yong/gift/AsyncGiftImageLoader;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/yong/gift/AsyncGiftImageLoader$2;->this$0:Lcom/yong/gift/AsyncGiftImageLoader;

    .line 45
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    .line 48
    :goto_0
    iget-object v4, p0, Lcom/yong/gift/AsyncGiftImageLoader$2;->this$0:Lcom/yong/gift/AsyncGiftImageLoader;

    # getter for: Lcom/yong/gift/AsyncGiftImageLoader;->isLoop:Z
    invoke-static {v4}, Lcom/yong/gift/AsyncGiftImageLoader;->access$0(Lcom/yong/gift/AsyncGiftImageLoader;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 86
    :cond_0
    return-void

    .line 53
    :cond_1
    :try_start_0
    iget-object v4, p0, Lcom/yong/gift/AsyncGiftImageLoader$2;->this$0:Lcom/yong/gift/AsyncGiftImageLoader;

    # getter for: Lcom/yong/gift/AsyncGiftImageLoader;->tasks:Ljava/util/ArrayList;
    invoke-static {v4}, Lcom/yong/gift/AsyncGiftImageLoader;->access$1(Lcom/yong/gift/AsyncGiftImageLoader;)Ljava/util/ArrayList;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;

    .line 55
    .local v3, "task":Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;
    # getter for: Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;
    invoke-static {v3}, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->access$1(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    .line 56
    const/4 v6, 0x1

    .line 54
    invoke-static {v4, v5, v6}, Lcom/arist/util/HttpService;->getBytes(Ljava/lang/String;Ljava/util/ArrayList;I)[B

    move-result-object v0

    .line 57
    .local v0, "data":[B
    const/16 v4, 0xc8

    .line 58
    const/16 v5, 0xc8

    .line 57
    invoke-static {v0, v4, v5}, Lcom/arist/util/BitmapService;->getBitmap([BII)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->access$3(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;Landroid/graphics/Bitmap;)V

    .line 60
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 61
    .local v2, "msg":Landroid/os/Message;
    const/4 v4, 0x0

    iput v4, v2, Landroid/os/Message;->what:I

    .line 62
    iput-object v3, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 63
    iget-object v4, p0, Lcom/yong/gift/AsyncGiftImageLoader$2;->this$0:Lcom/yong/gift/AsyncGiftImageLoader;

    # getter for: Lcom/yong/gift/AsyncGiftImageLoader;->handler:Landroid/os/Handler;
    invoke-static {v4}, Lcom/yong/gift/AsyncGiftImageLoader;->access$2(Lcom/yong/gift/AsyncGiftImageLoader;)Landroid/os/Handler;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 65
    iget-object v4, p0, Lcom/yong/gift/AsyncGiftImageLoader$2;->this$0:Lcom/yong/gift/AsyncGiftImageLoader;

    # getter for: Lcom/yong/gift/AsyncGiftImageLoader;->caches:Ljava/util/HashMap;
    invoke-static {v4}, Lcom/yong/gift/AsyncGiftImageLoader;->access$3(Lcom/yong/gift/AsyncGiftImageLoader;)Ljava/util/HashMap;

    move-result-object v4

    # getter for: Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;
    invoke-static {v3}, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->access$1(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;)Ljava/lang/String;

    move-result-object v5

    .line 66
    new-instance v6, Ljava/lang/ref/SoftReference;

    # getter for: Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;
    invoke-static {v3}, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->access$2(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;)Landroid/graphics/Bitmap;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 65
    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    # getter for: Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;
    invoke-static {v3}, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->access$2(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;)Landroid/graphics/Bitmap;

    move-result-object v4

    # getter for: Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->savePath:Ljava/lang/String;
    invoke-static {v3}, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->access$4(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/yong/gift/AsyncGiftImageLoader;->save(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .end local v0    # "data":[B
    .end local v2    # "msg":Landroid/os/Message;
    .end local v3    # "task":Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;
    :cond_2
    :goto_1
    iget-object v4, p0, Lcom/yong/gift/AsyncGiftImageLoader$2;->this$0:Lcom/yong/gift/AsyncGiftImageLoader;

    # getter for: Lcom/yong/gift/AsyncGiftImageLoader;->tasks:Ljava/util/ArrayList;
    invoke-static {v4}, Lcom/yong/gift/AsyncGiftImageLoader;->access$1(Lcom/yong/gift/AsyncGiftImageLoader;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_3

    iget-object v4, p0, Lcom/yong/gift/AsyncGiftImageLoader$2;->this$0:Lcom/yong/gift/AsyncGiftImageLoader;

    # getter for: Lcom/yong/gift/AsyncGiftImageLoader;->isLoop:Z
    invoke-static {v4}, Lcom/yong/gift/AsyncGiftImageLoader;->access$0(Lcom/yong/gift/AsyncGiftImageLoader;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 74
    :cond_3
    iget-object v4, p0, Lcom/yong/gift/AsyncGiftImageLoader$2;->this$0:Lcom/yong/gift/AsyncGiftImageLoader;

    # getter for: Lcom/yong/gift/AsyncGiftImageLoader;->isLoop:Z
    invoke-static {v4}, Lcom/yong/gift/AsyncGiftImageLoader;->access$0(Lcom/yong/gift/AsyncGiftImageLoader;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 78
    monitor-enter p0

    .line 80
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
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

    .line 69
    :catch_0
    move-exception v1

    .line 70
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 81
    .end local v1    # "e":Ljava/lang/Exception;
    :catch_1
    move-exception v1

    .line 82
    .local v1, "e":Ljava/lang/InterruptedException;
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2
.end method

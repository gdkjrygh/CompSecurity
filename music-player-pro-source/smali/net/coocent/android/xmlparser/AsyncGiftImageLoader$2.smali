.class Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$2;
.super Ljava/lang/Thread;
.source "AsyncGiftImageLoader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;


# direct methods
.method constructor <init>(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$2;->this$0:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;

    .line 55
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    .line 58
    :goto_0
    iget-object v4, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$2;->this$0:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;

    # getter for: Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->isLoop:Z
    invoke-static {v4}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->access$0(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 96
    :cond_0
    return-void

    .line 63
    :cond_1
    :try_start_0
    iget-object v4, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$2;->this$0:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;

    # getter for: Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->tasks:Ljava/util/ArrayList;
    invoke-static {v4}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->access$1(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;)Ljava/util/ArrayList;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;

    .line 65
    .local v3, "task":Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;
    # getter for: Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;
    invoke-static {v3}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->access$1(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    .line 66
    const/4 v6, 0x1

    .line 64
    invoke-static {v4, v5, v6}, Lnet/coocent/android/xmlparser/HttpService;->getBytes(Ljava/lang/String;Ljava/util/ArrayList;I)[B

    move-result-object v0

    .line 67
    .local v0, "data":[B
    const/16 v4, 0xc8

    .line 68
    const/16 v5, 0xc8

    .line 67
    invoke-static {v0, v4, v5}, Lnet/coocent/android/xmlparser/BitmapService;->getBitmap([BII)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-static {v3, v4}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->access$3(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;Landroid/graphics/Bitmap;)V

    .line 70
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 71
    .local v2, "msg":Landroid/os/Message;
    const/4 v4, 0x0

    iput v4, v2, Landroid/os/Message;->what:I

    .line 72
    iput-object v3, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 73
    iget-object v4, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$2;->this$0:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;

    # getter for: Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->handler:Landroid/os/Handler;
    invoke-static {v4}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->access$2(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;)Landroid/os/Handler;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 75
    iget-object v4, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$2;->this$0:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;

    # getter for: Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->caches:Ljava/util/HashMap;
    invoke-static {v4}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->access$3(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;)Ljava/util/HashMap;

    move-result-object v4

    # getter for: Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;
    invoke-static {v3}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->access$1(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;)Ljava/lang/String;

    move-result-object v5

    .line 76
    new-instance v6, Ljava/lang/ref/SoftReference;

    # getter for: Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;
    invoke-static {v3}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->access$2(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;)Landroid/graphics/Bitmap;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 75
    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    # getter for: Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;
    invoke-static {v3}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->access$2(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;)Landroid/graphics/Bitmap;

    move-result-object v4

    # getter for: Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->savePath:Ljava/lang/String;
    invoke-static {v3}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->access$4(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->save(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .end local v0    # "data":[B
    .end local v2    # "msg":Landroid/os/Message;
    .end local v3    # "task":Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;
    :cond_2
    :goto_1
    iget-object v4, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$2;->this$0:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;

    # getter for: Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->tasks:Ljava/util/ArrayList;
    invoke-static {v4}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->access$1(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_3

    iget-object v4, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$2;->this$0:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;

    # getter for: Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->isLoop:Z
    invoke-static {v4}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->access$0(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 84
    :cond_3
    iget-object v4, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$2;->this$0:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;

    # getter for: Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->isLoop:Z
    invoke-static {v4}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->access$0(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 88
    monitor-enter p0

    .line 90
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
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

    .line 79
    :catch_0
    move-exception v1

    .line 80
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 91
    .end local v1    # "e":Ljava/lang/Exception;
    :catch_1
    move-exception v1

    .line 92
    .local v1, "e":Ljava/lang/InterruptedException;
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2
.end method

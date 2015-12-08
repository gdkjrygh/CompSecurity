.class public Lcom/yong/gift/AsyncGiftImageLoader;
.super Ljava/lang/Object;
.source "AsyncGiftImageLoader.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yong/gift/AsyncGiftImageLoader$Callback;,
        Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;
    }
.end annotation


# instance fields
.field private caches:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/SoftReference",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation
.end field

.field private handler:Landroid/os/Handler;

.field private isLoop:Z

.field private tasks:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;",
            ">;"
        }
    .end annotation
.end field

.field private workThread:Ljava/lang/Thread;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/yong/gift/AsyncGiftImageLoader;->caches:Ljava/util/HashMap;

    .line 29
    new-instance v0, Lcom/yong/gift/AsyncGiftImageLoader$1;

    invoke-direct {v0, p0}, Lcom/yong/gift/AsyncGiftImageLoader$1;-><init>(Lcom/yong/gift/AsyncGiftImageLoader;)V

    iput-object v0, p0, Lcom/yong/gift/AsyncGiftImageLoader;->handler:Landroid/os/Handler;

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/yong/gift/AsyncGiftImageLoader;->tasks:Ljava/util/ArrayList;

    .line 44
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/yong/gift/AsyncGiftImageLoader;->isLoop:Z

    .line 45
    new-instance v0, Lcom/yong/gift/AsyncGiftImageLoader$2;

    invoke-direct {v0, p0}, Lcom/yong/gift/AsyncGiftImageLoader$2;-><init>(Lcom/yong/gift/AsyncGiftImageLoader;)V

    iput-object v0, p0, Lcom/yong/gift/AsyncGiftImageLoader;->workThread:Ljava/lang/Thread;

    .line 88
    iget-object v0, p0, Lcom/yong/gift/AsyncGiftImageLoader;->workThread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 89
    return-void
.end method

.method static synthetic access$0(Lcom/yong/gift/AsyncGiftImageLoader;)Z
    .locals 1

    .prologue
    .line 25
    iget-boolean v0, p0, Lcom/yong/gift/AsyncGiftImageLoader;->isLoop:Z

    return v0
.end method

.method static synthetic access$1(Lcom/yong/gift/AsyncGiftImageLoader;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/yong/gift/AsyncGiftImageLoader;->tasks:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$2(Lcom/yong/gift/AsyncGiftImageLoader;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/yong/gift/AsyncGiftImageLoader;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$3(Lcom/yong/gift/AsyncGiftImageLoader;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/yong/gift/AsyncGiftImageLoader;->caches:Ljava/util/HashMap;

    return-object v0
.end method

.method public static getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1
    .param p0, "path"    # Ljava/lang/String;

    .prologue
    .line 147
    invoke-static {p0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static save(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 5
    .param p0, "bm"    # Landroid/graphics/Bitmap;
    .param p1, "savePath"    # Ljava/lang/String;

    .prologue
    .line 127
    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 128
    .local v1, "file":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 144
    .end local v1    # "file":Ljava/io/File;
    :goto_0
    return-void

    .line 130
    .restart local v1    # "file":Ljava/io/File;
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_1

    .line 131
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 133
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_2

    .line 134
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    .line 136
    :cond_2
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 137
    .local v2, "out":Ljava/io/FileOutputStream;
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x64

    invoke-virtual {p0, v3, v4, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 138
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 139
    .end local v1    # "file":Ljava/io/File;
    .end local v2    # "out":Ljava/io/FileOutputStream;
    :catch_0
    move-exception v0

    .line 140
    .local v0, "e":Ljava/io/FileNotFoundException;
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    goto :goto_0

    .line 141
    .end local v0    # "e":Ljava/io/FileNotFoundException;
    :catch_1
    move-exception v0

    .line 142
    .local v0, "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public loadImage(Lcom/yong/gift/GiftEntity;Lcom/yong/gift/AsyncGiftImageLoader$Callback;)Landroid/graphics/Bitmap;
    .locals 6
    .param p1, "gift"    # Lcom/yong/gift/GiftEntity;
    .param p2, "callback"    # Lcom/yong/gift/AsyncGiftImageLoader$Callback;

    .prologue
    .line 92
    const/4 v0, 0x0

    .line 94
    .local v0, "bm":Landroid/graphics/Bitmap;
    iget-object v4, p0, Lcom/yong/gift/AsyncGiftImageLoader;->caches:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/yong/gift/GiftEntity;->getIcon_imagePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 95
    iget-object v4, p0, Lcom/yong/gift/AsyncGiftImageLoader;->caches:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/yong/gift/GiftEntity;->getIcon_imagePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/SoftReference;

    invoke-virtual {v4}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "bm":Landroid/graphics/Bitmap;
    check-cast v0, Landroid/graphics/Bitmap;

    .line 96
    .restart local v0    # "bm":Landroid/graphics/Bitmap;
    if-eqz v0, :cond_0

    move-object v1, v0

    .line 122
    .end local v0    # "bm":Landroid/graphics/Bitmap;
    .local v1, "bm":Landroid/graphics/Bitmap;
    :goto_0
    return-object v1

    .line 99
    .end local v1    # "bm":Landroid/graphics/Bitmap;
    .restart local v0    # "bm":Landroid/graphics/Bitmap;
    :cond_0
    iget-object v4, p0, Lcom/yong/gift/AsyncGiftImageLoader;->caches:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/yong/gift/GiftEntity;->getIcon_imagePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    sget-object v5, Lcom/yong/gift/GiftActivity;->DOWNLOAD_ICON_PATH:Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/yong/gift/GiftEntity;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 105
    const-string v5, ".png"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 104
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 106
    .local v2, "savePath":Ljava/lang/String;
    invoke-static {v2}, Lcom/yong/gift/AsyncGiftImageLoader;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 107
    if-eqz v0, :cond_2

    move-object v1, v0

    .line 108
    .end local v0    # "bm":Landroid/graphics/Bitmap;
    .restart local v1    # "bm":Landroid/graphics/Bitmap;
    goto :goto_0

    .line 111
    .end local v1    # "bm":Landroid/graphics/Bitmap;
    .restart local v0    # "bm":Landroid/graphics/Bitmap;
    :cond_2
    new-instance v3, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;

    invoke-direct {v3, p0}, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;-><init>(Lcom/yong/gift/AsyncGiftImageLoader;)V

    .line 112
    .local v3, "task":Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;
    invoke-virtual {p1}, Lcom/yong/gift/GiftEntity;->getIcon_imagePath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->access$5(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;Ljava/lang/String;)V

    .line 113
    invoke-static {v3, v2}, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->access$6(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;Ljava/lang/String;)V

    .line 114
    invoke-static {v3, p2}, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->access$7(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;Lcom/yong/gift/AsyncGiftImageLoader$Callback;)V

    .line 116
    iget-object v4, p0, Lcom/yong/gift/AsyncGiftImageLoader;->tasks:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 117
    iget-object v4, p0, Lcom/yong/gift/AsyncGiftImageLoader;->tasks:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    iget-object v5, p0, Lcom/yong/gift/AsyncGiftImageLoader;->workThread:Ljava/lang/Thread;

    monitor-enter v5

    .line 119
    :try_start_0
    iget-object v4, p0, Lcom/yong/gift/AsyncGiftImageLoader;->workThread:Ljava/lang/Thread;

    invoke-virtual {v4}, Ljava/lang/Object;->notify()V

    .line 118
    monitor-exit v5

    :cond_3
    move-object v1, v0

    .line 122
    .end local v0    # "bm":Landroid/graphics/Bitmap;
    .restart local v1    # "bm":Landroid/graphics/Bitmap;
    goto :goto_0

    .line 118
    .end local v1    # "bm":Landroid/graphics/Bitmap;
    .restart local v0    # "bm":Landroid/graphics/Bitmap;
    :catchall_0
    move-exception v4

    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v4
.end method

.method public quit()V
    .locals 2

    .prologue
    .line 188
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/yong/gift/AsyncGiftImageLoader;->isLoop:Z

    .line 189
    iget-object v1, p0, Lcom/yong/gift/AsyncGiftImageLoader;->workThread:Ljava/lang/Thread;

    monitor-enter v1

    .line 190
    :try_start_0
    iget-object v0, p0, Lcom/yong/gift/AsyncGiftImageLoader;->workThread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 189
    monitor-exit v1

    .line 192
    return-void

    .line 189
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

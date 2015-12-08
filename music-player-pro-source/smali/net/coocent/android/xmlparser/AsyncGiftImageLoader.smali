.class public Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;
.super Ljava/lang/Object;
.source "AsyncGiftImageLoader.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;,
        Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;
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
            "Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;",
            ">;"
        }
    .end annotation
.end field

.field private workThread:Ljava/lang/Thread;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->caches:Ljava/util/HashMap;

    .line 26
    new-instance v0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$1;

    invoke-direct {v0, p0}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$1;-><init>(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;)V

    iput-object v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->handler:Landroid/os/Handler;

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->tasks:Ljava/util/ArrayList;

    .line 54
    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->isLoop:Z

    .line 55
    new-instance v0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$2;

    invoke-direct {v0, p0}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$2;-><init>(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;)V

    iput-object v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->workThread:Ljava/lang/Thread;

    .line 98
    iget-object v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->workThread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 99
    return-void
.end method

.method static synthetic access$0(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;)Z
    .locals 1

    .prologue
    .line 22
    iget-boolean v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->isLoop:Z

    return v0
.end method

.method static synthetic access$1(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->tasks:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$2(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$3(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->caches:Ljava/util/HashMap;

    return-object v0
.end method

.method public static getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1
    .param p0, "path"    # Ljava/lang/String;

    .prologue
    .line 157
    invoke-static {p0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static save(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 5
    .param p0, "bm"    # Landroid/graphics/Bitmap;
    .param p1, "savePath"    # Ljava/lang/String;

    .prologue
    .line 137
    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 138
    .local v1, "file":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 154
    .end local v1    # "file":Ljava/io/File;
    :goto_0
    return-void

    .line 140
    .restart local v1    # "file":Ljava/io/File;
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_1

    .line 141
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 143
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_2

    .line 144
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    .line 146
    :cond_2
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 147
    .local v2, "out":Ljava/io/FileOutputStream;
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x64

    invoke-virtual {p0, v3, v4, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 148
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 149
    .end local v1    # "file":Ljava/io/File;
    .end local v2    # "out":Ljava/io/FileOutputStream;
    :catch_0
    move-exception v0

    .line 150
    .local v0, "e":Ljava/io/FileNotFoundException;
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    goto :goto_0

    .line 151
    .end local v0    # "e":Ljava/io/FileNotFoundException;
    :catch_1
    move-exception v0

    .line 152
    .local v0, "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public loadImage(Lnet/coocent/android/xmlparser/GiftEntity;Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;)Landroid/graphics/Bitmap;
    .locals 6
    .param p1, "gift"    # Lnet/coocent/android/xmlparser/GiftEntity;
    .param p2, "callback"    # Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;

    .prologue
    .line 102
    const/4 v0, 0x0

    .line 104
    .local v0, "bm":Landroid/graphics/Bitmap;
    iget-object v4, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->caches:Ljava/util/HashMap;

    invoke-virtual {p1}, Lnet/coocent/android/xmlparser/GiftEntity;->getIcon_imagePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 105
    iget-object v4, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->caches:Ljava/util/HashMap;

    invoke-virtual {p1}, Lnet/coocent/android/xmlparser/GiftEntity;->getIcon_imagePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/SoftReference;

    invoke-virtual {v4}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "bm":Landroid/graphics/Bitmap;
    check-cast v0, Landroid/graphics/Bitmap;

    .line 106
    .restart local v0    # "bm":Landroid/graphics/Bitmap;
    if-eqz v0, :cond_0

    move-object v1, v0

    .line 132
    .end local v0    # "bm":Landroid/graphics/Bitmap;
    .local v1, "bm":Landroid/graphics/Bitmap;
    :goto_0
    return-object v1

    .line 109
    .end local v1    # "bm":Landroid/graphics/Bitmap;
    .restart local v0    # "bm":Landroid/graphics/Bitmap;
    :cond_0
    iget-object v4, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->caches:Ljava/util/HashMap;

    invoke-virtual {p1}, Lnet/coocent/android/xmlparser/GiftEntity;->getIcon_imagePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    sget-object v5, Lnet/coocent/android/xmlparser/PromotionSDK;->DOWNLOAD_ICON_PATH:Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    invoke-virtual {p1}, Lnet/coocent/android/xmlparser/GiftEntity;->getPackagename()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ".png"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 114
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 116
    .local v2, "savePath":Ljava/lang/String;
    invoke-static {v2}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 117
    if-eqz v0, :cond_2

    move-object v1, v0

    .line 118
    .end local v0    # "bm":Landroid/graphics/Bitmap;
    .restart local v1    # "bm":Landroid/graphics/Bitmap;
    goto :goto_0

    .line 121
    .end local v1    # "bm":Landroid/graphics/Bitmap;
    .restart local v0    # "bm":Landroid/graphics/Bitmap;
    :cond_2
    new-instance v3, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;

    invoke-direct {v3, p0}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;-><init>(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;)V

    .line 122
    .local v3, "task":Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;
    invoke-virtual {p1}, Lnet/coocent/android/xmlparser/GiftEntity;->getIcon_imagePath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->access$5(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;Ljava/lang/String;)V

    .line 123
    invoke-static {v3, v2}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->access$6(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;Ljava/lang/String;)V

    .line 124
    invoke-static {v3, p2}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->access$7(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;)V

    .line 126
    iget-object v4, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->tasks:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 127
    iget-object v4, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->tasks:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    iget-object v5, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->workThread:Ljava/lang/Thread;

    monitor-enter v5

    .line 129
    :try_start_0
    iget-object v4, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->workThread:Ljava/lang/Thread;

    invoke-virtual {v4}, Ljava/lang/Object;->notify()V

    .line 128
    monitor-exit v5

    :cond_3
    move-object v1, v0

    .line 132
    .end local v0    # "bm":Landroid/graphics/Bitmap;
    .restart local v1    # "bm":Landroid/graphics/Bitmap;
    goto :goto_0

    .line 128
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
    .line 198
    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->isLoop:Z

    .line 199
    iget-object v1, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->workThread:Ljava/lang/Thread;

    monitor-enter v1

    .line 200
    :try_start_0
    iget-object v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->workThread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 199
    monitor-exit v1

    .line 202
    return-void

    .line 199
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

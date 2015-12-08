.class public Lcom/arist/util/AsyncImageLoader;
.super Ljava/lang/Object;
.source "AsyncImageLoader.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/arist/util/AsyncImageLoader$Callback;,
        Lcom/arist/util/AsyncImageLoader$ImageLoadTask;
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
            "Lcom/arist/util/AsyncImageLoader$ImageLoadTask;",
            ">;"
        }
    .end annotation
.end field

.field private workThread:Ljava/lang/Thread;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/arist/util/AsyncImageLoader;->caches:Ljava/util/HashMap;

    .line 22
    new-instance v0, Lcom/arist/util/AsyncImageLoader$1;

    invoke-direct {v0, p0}, Lcom/arist/util/AsyncImageLoader$1;-><init>(Lcom/arist/util/AsyncImageLoader;)V

    iput-object v0, p0, Lcom/arist/util/AsyncImageLoader;->handler:Landroid/os/Handler;

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/util/AsyncImageLoader;->tasks:Ljava/util/ArrayList;

    .line 37
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arist/util/AsyncImageLoader;->isLoop:Z

    .line 38
    new-instance v0, Lcom/arist/util/AsyncImageLoader$2;

    invoke-direct {v0, p0}, Lcom/arist/util/AsyncImageLoader$2;-><init>(Lcom/arist/util/AsyncImageLoader;)V

    iput-object v0, p0, Lcom/arist/util/AsyncImageLoader;->workThread:Ljava/lang/Thread;

    .line 80
    iget-object v0, p0, Lcom/arist/util/AsyncImageLoader;->workThread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 81
    return-void
.end method

.method static synthetic access$0(Lcom/arist/util/AsyncImageLoader;)Z
    .locals 1

    .prologue
    .line 18
    iget-boolean v0, p0, Lcom/arist/util/AsyncImageLoader;->isLoop:Z

    return v0
.end method

.method static synthetic access$1(Lcom/arist/util/AsyncImageLoader;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 16
    iget-object v0, p0, Lcom/arist/util/AsyncImageLoader;->tasks:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$2(Lcom/arist/util/AsyncImageLoader;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/arist/util/AsyncImageLoader;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$3(Lcom/arist/util/AsyncImageLoader;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/arist/util/AsyncImageLoader;->caches:Ljava/util/HashMap;

    return-object v0
.end method


# virtual methods
.method public loadImage(Lcom/yong/jamendo/api/JamendoMusic;Lcom/arist/util/AsyncImageLoader$Callback;)Landroid/graphics/Bitmap;
    .locals 6
    .param p1, "jamendoMusic"    # Lcom/yong/jamendo/api/JamendoMusic;
    .param p2, "callback"    # Lcom/arist/util/AsyncImageLoader$Callback;

    .prologue
    .line 84
    const/4 v0, 0x0

    .line 86
    .local v0, "bm":Landroid/graphics/Bitmap;
    iget-object v4, p0, Lcom/arist/util/AsyncImageLoader;->caches:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/yong/jamendo/api/JamendoMusic;->getAlbum_image()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 87
    iget-object v4, p0, Lcom/arist/util/AsyncImageLoader;->caches:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/yong/jamendo/api/JamendoMusic;->getAlbum_image()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/SoftReference;

    invoke-virtual {v4}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "bm":Landroid/graphics/Bitmap;
    check-cast v0, Landroid/graphics/Bitmap;

    .line 88
    .restart local v0    # "bm":Landroid/graphics/Bitmap;
    if-eqz v0, :cond_0

    move-object v1, v0

    .line 115
    .end local v0    # "bm":Landroid/graphics/Bitmap;
    .local v1, "bm":Landroid/graphics/Bitmap;
    :goto_0
    return-object v1

    .line 91
    .end local v1    # "bm":Landroid/graphics/Bitmap;
    .restart local v0    # "bm":Landroid/graphics/Bitmap;
    :cond_0
    iget-object v4, p0, Lcom/arist/util/AsyncImageLoader;->caches:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/yong/jamendo/api/JamendoMusic;->getAlbum_image()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    sget-object v5, Lcom/arist/util/Constant;->BASE_ABLUM_CACHES_PATH:Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    invoke-virtual {p1}, Lcom/yong/jamendo/api/JamendoMusic;->getMusic_name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "-"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 98
    invoke-virtual {p1}, Lcom/yong/jamendo/api/JamendoMusic;->getAlbum_name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ".jpg"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 96
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 99
    .local v2, "savePath":Ljava/lang/String;
    invoke-static {v2}, Lcom/arist/util/BitmapService;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 100
    if-eqz v0, :cond_2

    move-object v1, v0

    .line 101
    .end local v0    # "bm":Landroid/graphics/Bitmap;
    .restart local v1    # "bm":Landroid/graphics/Bitmap;
    goto :goto_0

    .line 104
    .end local v1    # "bm":Landroid/graphics/Bitmap;
    .restart local v0    # "bm":Landroid/graphics/Bitmap;
    :cond_2
    new-instance v3, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;

    invoke-direct {v3, p0}, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;-><init>(Lcom/arist/util/AsyncImageLoader;)V

    .line 105
    .local v3, "task":Lcom/arist/util/AsyncImageLoader$ImageLoadTask;
    invoke-virtual {p1}, Lcom/yong/jamendo/api/JamendoMusic;->getAlbum_image()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->access$5(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;Ljava/lang/String;)V

    .line 106
    invoke-static {v3, v2}, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->access$6(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;Ljava/lang/String;)V

    .line 107
    invoke-static {v3, p2}, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->access$7(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;Lcom/arist/util/AsyncImageLoader$Callback;)V

    .line 109
    iget-object v4, p0, Lcom/arist/util/AsyncImageLoader;->tasks:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 110
    iget-object v4, p0, Lcom/arist/util/AsyncImageLoader;->tasks:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    iget-object v5, p0, Lcom/arist/util/AsyncImageLoader;->workThread:Ljava/lang/Thread;

    monitor-enter v5

    .line 112
    :try_start_0
    iget-object v4, p0, Lcom/arist/util/AsyncImageLoader;->workThread:Ljava/lang/Thread;

    invoke-virtual {v4}, Ljava/lang/Object;->notify()V

    .line 111
    monitor-exit v5

    :cond_3
    move-object v1, v0

    .line 115
    .end local v0    # "bm":Landroid/graphics/Bitmap;
    .restart local v1    # "bm":Landroid/graphics/Bitmap;
    goto :goto_0

    .line 111
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
    .line 156
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/util/AsyncImageLoader;->isLoop:Z

    .line 157
    iget-object v1, p0, Lcom/arist/util/AsyncImageLoader;->workThread:Ljava/lang/Thread;

    monitor-enter v1

    .line 158
    :try_start_0
    iget-object v0, p0, Lcom/arist/util/AsyncImageLoader;->workThread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 157
    monitor-exit v1

    .line 160
    return-void

    .line 157
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

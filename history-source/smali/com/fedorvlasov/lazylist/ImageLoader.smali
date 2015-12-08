.class public Lcom/fedorvlasov/lazylist/ImageLoader;
.super Ljava/lang/Object;
.source "ImageLoader.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fedorvlasov/lazylist/ImageLoader$BitmapDisplayer;,
        Lcom/fedorvlasov/lazylist/ImageLoader$PhotosLoader;,
        Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;
    }
.end annotation


# instance fields
.field executorService:Ljava/util/concurrent/ExecutorService;

.field fileCache:Lcom/fedorvlasov/lazylist/FileCache;

.field private imageViews:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/widget/ImageView;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private maxSize:I

.field memoryCache:Lcom/fedorvlasov/lazylist/MemoryCache;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Lcom/fedorvlasov/lazylist/MemoryCache;

    invoke-direct {v0}, Lcom/fedorvlasov/lazylist/MemoryCache;-><init>()V

    iput-object v0, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->memoryCache:Lcom/fedorvlasov/lazylist/MemoryCache;

    .line 28
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->imageViews:Ljava/util/Map;

    .line 33
    const/16 v0, 0x46

    iput v0, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->maxSize:I

    .line 34
    new-instance v0, Lcom/fedorvlasov/lazylist/FileCache;

    invoke-direct {v0, p1}, Lcom/fedorvlasov/lazylist/FileCache;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->fileCache:Lcom/fedorvlasov/lazylist/FileCache;

    .line 35
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "maxSize"    # I

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Lcom/fedorvlasov/lazylist/MemoryCache;

    invoke-direct {v0}, Lcom/fedorvlasov/lazylist/MemoryCache;-><init>()V

    iput-object v0, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->memoryCache:Lcom/fedorvlasov/lazylist/MemoryCache;

    .line 28
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->imageViews:Ljava/util/Map;

    .line 39
    iput p2, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->maxSize:I

    .line 40
    new-instance v0, Lcom/fedorvlasov/lazylist/FileCache;

    invoke-direct {v0, p1}, Lcom/fedorvlasov/lazylist/FileCache;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->fileCache:Lcom/fedorvlasov/lazylist/FileCache;

    .line 41
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 42
    return-void
.end method

.method static synthetic access$000(Lcom/fedorvlasov/lazylist/ImageLoader;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1
    .param p0, "x0"    # Lcom/fedorvlasov/lazylist/ImageLoader;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 23
    invoke-direct {p0, p1}, Lcom/fedorvlasov/lazylist/ImageLoader;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private decodeFile(Ljava/io/File;)Landroid/graphics/Bitmap;
    .locals 8
    .param p1, "f"    # Ljava/io/File;

    .prologue
    const/4 v5, 0x0

    .line 98
    :try_start_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 99
    .local v1, "o":Landroid/graphics/BitmapFactory$Options;
    const/4 v6, 0x1

    iput-boolean v6, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 100
    new-instance v6, Ljava/io/FileInputStream;

    invoke-direct {v6, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/4 v7, 0x0

    invoke-static {v6, v7, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 104
    iget v4, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .local v4, "width_tmp":I
    iget v0, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 105
    .local v0, "height_tmp":I
    const/4 v3, 0x1

    .line 107
    .local v3, "scale":I
    :goto_0
    div-int/lit8 v6, v4, 0x2

    iget v7, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->maxSize:I

    if-lt v6, v7, :cond_0

    div-int/lit8 v6, v0, 0x2

    iget v7, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->maxSize:I

    if-ge v6, v7, :cond_1

    .line 114
    :cond_0
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 115
    .local v2, "o2":Landroid/graphics/BitmapFactory$Options;
    iput v3, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 116
    new-instance v6, Ljava/io/FileInputStream;

    invoke-direct {v6, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/4 v7, 0x0

    invoke-static {v6, v7, v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 118
    .end local v0    # "height_tmp":I
    .end local v1    # "o":Landroid/graphics/BitmapFactory$Options;
    .end local v2    # "o2":Landroid/graphics/BitmapFactory$Options;
    .end local v3    # "scale":I
    .end local v4    # "width_tmp":I
    :goto_1
    return-object v5

    .line 109
    .restart local v0    # "height_tmp":I
    .restart local v1    # "o":Landroid/graphics/BitmapFactory$Options;
    .restart local v3    # "scale":I
    .restart local v4    # "width_tmp":I
    :cond_1
    div-int/lit8 v4, v4, 0x2

    .line 110
    div-int/lit8 v0, v0, 0x2
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    mul-int/lit8 v3, v3, 0x2

    goto :goto_0

    .line 117
    .end local v0    # "height_tmp":I
    .end local v1    # "o":Landroid/graphics/BitmapFactory$Options;
    .end local v3    # "scale":I
    .end local v4    # "width_tmp":I
    :catch_0
    move-exception v6

    goto :goto_1
.end method

.method private getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 9
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 67
    iget-object v8, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->fileCache:Lcom/fedorvlasov/lazylist/FileCache;

    invoke-virtual {v8, p1}, Lcom/fedorvlasov/lazylist/FileCache;->getFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    .line 70
    .local v4, "f":Ljava/io/File;
    invoke-direct {p0, v4}, Lcom/fedorvlasov/lazylist/ImageLoader;->decodeFile(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 71
    .local v0, "b":Landroid/graphics/Bitmap;
    if-eqz v0, :cond_0

    .line 90
    .end local v0    # "b":Landroid/graphics/Bitmap;
    :goto_0
    return-object v0

    .line 76
    .restart local v0    # "b":Landroid/graphics/Bitmap;
    :cond_0
    const/4 v1, 0x0

    .line 77
    .local v1, "bitmap":Landroid/graphics/Bitmap;
    :try_start_0
    new-instance v5, Ljava/net/URL;

    invoke-direct {v5, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 78
    .local v5, "imageUrl":Ljava/net/URL;
    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    check-cast v2, Ljava/net/HttpURLConnection;

    .line 79
    .local v2, "conn":Ljava/net/HttpURLConnection;
    const/16 v8, 0x7530

    invoke-virtual {v2, v8}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 80
    const/16 v8, 0x7530

    invoke-virtual {v2, v8}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 81
    const/4 v8, 0x1

    invoke-virtual {v2, v8}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 82
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v6

    .line 83
    .local v6, "is":Ljava/io/InputStream;
    new-instance v7, Ljava/io/FileOutputStream;

    invoke-direct {v7, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 84
    .local v7, "os":Ljava/io/OutputStream;
    invoke-static {v6, v7}, Lcom/fedorvlasov/lazylist/Utils;->CopyStream(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 85
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V

    .line 86
    invoke-direct {p0, v4}, Lcom/fedorvlasov/lazylist/ImageLoader;->decodeFile(Ljava/io/File;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    move-object v0, v1

    .line 87
    goto :goto_0

    .line 88
    .end local v2    # "conn":Ljava/net/HttpURLConnection;
    .end local v5    # "imageUrl":Ljava/net/URL;
    .end local v6    # "is":Ljava/io/InputStream;
    .end local v7    # "os":Ljava/io/OutputStream;
    :catch_0
    move-exception v3

    .line 89
    .local v3, "ex":Ljava/lang/Exception;
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 90
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private queuePhoto(Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 3
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "imageView"    # Landroid/widget/ImageView;

    .prologue
    .line 61
    new-instance v0, Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;

    invoke-direct {v0, p0, p1, p2}, Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;-><init>(Lcom/fedorvlasov/lazylist/ImageLoader;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 62
    .local v0, "p":Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;
    iget-object v1, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lcom/fedorvlasov/lazylist/ImageLoader$PhotosLoader;

    invoke-direct {v2, p0, v0}, Lcom/fedorvlasov/lazylist/ImageLoader$PhotosLoader;-><init>(Lcom/fedorvlasov/lazylist/ImageLoader;Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 63
    return-void
.end method


# virtual methods
.method public DisplayImage(Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 2
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "imageView"    # Landroid/widget/ImageView;

    .prologue
    .line 47
    const/4 v1, 0x4

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 48
    iget-object v1, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->imageViews:Ljava/util/Map;

    invoke-interface {v1, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    iget-object v1, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->memoryCache:Lcom/fedorvlasov/lazylist/MemoryCache;

    invoke-virtual {v1, p1}, Lcom/fedorvlasov/lazylist/MemoryCache;->get(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 50
    .local v0, "bitmap":Landroid/graphics/Bitmap;
    if-eqz v0, :cond_0

    .line 51
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 52
    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 57
    :goto_0
    return-void

    .line 54
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/fedorvlasov/lazylist/ImageLoader;->queuePhoto(Ljava/lang/String;Landroid/widget/ImageView;)V

    goto :goto_0
.end method

.method public clearCache()V
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->memoryCache:Lcom/fedorvlasov/lazylist/MemoryCache;

    invoke-virtual {v0}, Lcom/fedorvlasov/lazylist/MemoryCache;->clear()V

    .line 180
    iget-object v0, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->fileCache:Lcom/fedorvlasov/lazylist/FileCache;

    invoke-virtual {v0}, Lcom/fedorvlasov/lazylist/FileCache;->clear()V

    .line 181
    return-void
.end method

.method imageViewReused(Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;)Z
    .locals 3
    .param p1, "photoToLoad"    # Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;

    .prologue
    .line 153
    iget-object v1, p0, Lcom/fedorvlasov/lazylist/ImageLoader;->imageViews:Ljava/util/Map;

    iget-object v2, p1, Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;->imageView:Landroid/widget/ImageView;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 154
    .local v0, "tag":Ljava/lang/String;
    if-eqz v0, :cond_0

    iget-object v1, p1, Lcom/fedorvlasov/lazylist/ImageLoader$PhotoToLoad;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 155
    :cond_0
    const/4 v1, 0x1

    .line 156
    :goto_0
    return v1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

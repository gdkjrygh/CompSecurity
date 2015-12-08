.class public final Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;
.super Ljava/lang/Object;
.source "UrlImageViewHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;,
        Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;,
        Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static final CACHE_DURATION_FIVE_DAYS:I = 0x19bfcc00

.field public static final CACHE_DURATION_FOUR_DAYS:I = 0x14997000

.field public static final CACHE_DURATION_INFINITE:I = 0x7fffffff

.field public static final CACHE_DURATION_ONE_DAY:I = 0x5265c00

.field public static final CACHE_DURATION_ONE_WEEK:I = 0x240c8400

.field public static final CACHE_DURATION_SIX_DAYS:I = 0x1ee62800

.field public static final CACHE_DURATION_THREE_DAYS:I = 0xf731400

.field public static final CACHE_DURATION_TWO_DAYS:I = 0xa4cb800

.field private static mAllCache:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private static mAssetDownloader:Lcom/koushikdutta/urlimageviewhelper/AssetUrlDownloader;

.field private static mContactDownloader:Lcom/koushikdutta/urlimageviewhelper/ContactContentUrlDownloader;

.field private static mContentDownloader:Lcom/koushikdutta/urlimageviewhelper/ContentUrlDownloader;

.field private static mDeadCache:Lcom/koushikdutta/urlimageviewhelper/LruBitmapCache;

.field private static mDownloaders:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/koushikdutta/urlimageviewhelper/UrlDownloader;",
            ">;"
        }
    .end annotation
.end field

.field private static mFileDownloader:Lcom/koushikdutta/urlimageviewhelper/FileUrlDownloader;

.field private static mHasCleaned:Z

.field private static mHttpDownloader:Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;

.field private static mLiveCache:Lcom/koushikdutta/urlimageviewhelper/DrawableCache;

.field static mMetrics:Landroid/util/DisplayMetrics;

.field private static mPendingDownloads:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/widget/ImageView;",
            ">;>;"
        }
    .end annotation
.end field

.field private static mPendingViews:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable",
            "<",
            "Landroid/widget/ImageView;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static mRequestPropertiesCallback:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;

.field static mResources:Landroid/content/res/Resources;

.field private static mUseBitmapScaling:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 27
    const-class v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    sput-boolean v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->$assertionsDisabled:Z

    .line 65
    sput-boolean v1, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mUseBitmapScaling:Z

    .line 368
    sput-boolean v2, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mHasCleaned:Z

    .line 681
    new-instance v0, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;

    invoke-direct {v0}, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;-><init>()V

    sput-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mHttpDownloader:Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;

    .line 682
    new-instance v0, Lcom/koushikdutta/urlimageviewhelper/ContentUrlDownloader;

    invoke-direct {v0}, Lcom/koushikdutta/urlimageviewhelper/ContentUrlDownloader;-><init>()V

    sput-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mContentDownloader:Lcom/koushikdutta/urlimageviewhelper/ContentUrlDownloader;

    .line 683
    new-instance v0, Lcom/koushikdutta/urlimageviewhelper/ContactContentUrlDownloader;

    invoke-direct {v0}, Lcom/koushikdutta/urlimageviewhelper/ContactContentUrlDownloader;-><init>()V

    sput-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mContactDownloader:Lcom/koushikdutta/urlimageviewhelper/ContactContentUrlDownloader;

    .line 684
    new-instance v0, Lcom/koushikdutta/urlimageviewhelper/AssetUrlDownloader;

    invoke-direct {v0}, Lcom/koushikdutta/urlimageviewhelper/AssetUrlDownloader;-><init>()V

    sput-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mAssetDownloader:Lcom/koushikdutta/urlimageviewhelper/AssetUrlDownloader;

    .line 685
    new-instance v0, Lcom/koushikdutta/urlimageviewhelper/FileUrlDownloader;

    invoke-direct {v0}, Lcom/koushikdutta/urlimageviewhelper/FileUrlDownloader;-><init>()V

    sput-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mFileDownloader:Lcom/koushikdutta/urlimageviewhelper/FileUrlDownloader;

    .line 686
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mDownloaders:Ljava/util/ArrayList;

    .line 692
    sget-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mDownloaders:Ljava/util/ArrayList;

    sget-object v1, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mHttpDownloader:Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 693
    sget-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mDownloaders:Ljava/util/ArrayList;

    sget-object v1, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mContactDownloader:Lcom/koushikdutta/urlimageviewhelper/ContactContentUrlDownloader;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 694
    sget-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mDownloaders:Ljava/util/ArrayList;

    sget-object v1, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mContentDownloader:Lcom/koushikdutta/urlimageviewhelper/ContentUrlDownloader;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 695
    sget-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mDownloaders:Ljava/util/ArrayList;

    sget-object v1, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mAssetDownloader:Lcom/koushikdutta/urlimageviewhelper/AssetUrlDownloader;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 696
    sget-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mDownloaders:Ljava/util/ArrayList;

    sget-object v1, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mFileDownloader:Lcom/koushikdutta/urlimageviewhelper/FileUrlDownloader;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 713
    invoke-static {}, Lcom/koushikdutta/urlimageviewhelper/DrawableCache;->getInstance()Lcom/koushikdutta/urlimageviewhelper/DrawableCache;

    move-result-object v0

    sput-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mLiveCache:Lcom/koushikdutta/urlimageviewhelper/DrawableCache;

    .line 715
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mAllCache:Ljava/util/HashSet;

    .line 812
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mPendingViews:Ljava/util/Hashtable;

    .line 813
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mPendingDownloads:Ljava/util/Hashtable;

    return-void

    :cond_0
    move v0, v2

    .line 27
    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 744
    return-void
.end method

.method static synthetic access$100(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 1
    .param p0, "x0"    # Landroid/content/Context;
    .param p1, "x1"    # Ljava/lang/String;
    .param p2, "x2"    # Ljava/lang/String;
    .param p3, "x3"    # I
    .param p4, "x4"    # I

    .prologue
    .line 27
    invoke-static {p0, p1, p2, p3, p4}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->loadBitmapFromStream(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$200()Lcom/koushikdutta/urlimageviewhelper/DrawableCache;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mLiveCache:Lcom/koushikdutta/urlimageviewhelper/DrawableCache;

    return-object v0
.end method

.method static synthetic access$300()Ljava/util/Hashtable;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mPendingDownloads:Ljava/util/Hashtable;

    return-object v0
.end method

.method static synthetic access$400()Ljava/util/Hashtable;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mPendingViews:Ljava/util/Hashtable;

    return-object v0
.end method

.method static synthetic access$600()Ljava/util/HashSet;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mAllCache:Ljava/util/HashSet;

    return-object v0
.end method

.method static synthetic access$700()Lcom/koushikdutta/urlimageviewhelper/LruBitmapCache;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mDeadCache:Lcom/koushikdutta/urlimageviewhelper/LruBitmapCache;

    return-object v0
.end method

.method private static checkCacheDuration(Ljava/io/File;J)Z
    .locals 4
    .param p0, "file"    # Ljava/io/File;
    .param p1, "cacheDurationMs"    # J

    .prologue
    .line 416
    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    add-long/2addr v2, p1

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static cleanup(Landroid/content/Context;)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 412
    const-wide/32 v0, 0x240c8400

    invoke-static {p0, v0, v1}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->cleanup(Landroid/content/Context;J)V

    .line 413
    return-void
.end method

.method public static cleanup(Landroid/content/Context;J)V
    .locals 11
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "age"    # J

    .prologue
    .line 381
    sget-boolean v7, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mHasCleaned:Z

    if-eqz v7, :cond_1

    .line 404
    :cond_0
    :goto_0
    return-void

    .line 384
    :cond_1
    const/4 v7, 0x1

    sput-boolean v7, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mHasCleaned:Z

    .line 387
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v7

    invoke-virtual {v7}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v4

    .line 388
    .local v4, "files":[Ljava/lang/String;
    if-eqz v4, :cond_0

    .line 391
    move-object v0, v4

    .local v0, "arr$":[Ljava/lang/String;
    array-length v6, v0

    .local v6, "len$":I
    const/4 v5, 0x0

    .local v5, "i$":I
    :goto_1
    if-ge v5, v6, :cond_0

    aget-object v3, v0, v5

    .line 392
    .local v3, "file":Ljava/lang/String;
    const-string v7, ".urlimage"

    invoke-virtual {v3, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_3

    .line 391
    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 396
    :cond_3
    new-instance v2, Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v8

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const/16 v8, 0x2f

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v2, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 397
    .local v2, "f":Ljava/io/File;
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    move-result-wide v9

    add-long/2addr v9, p1

    cmp-long v7, v7, v9

    if-lez v7, :cond_2

    .line 398
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 401
    .end local v0    # "arr$":[Ljava/lang/String;
    .end local v2    # "f":Ljava/io/File;
    .end local v3    # "file":Ljava/lang/String;
    .end local v4    # "files":[Ljava/lang/String;
    .end local v5    # "i$":I
    .end local v6    # "len$":I
    :catch_0
    move-exception v1

    .line 402
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method static varargs clog(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2
    .param p0, "format"    # Ljava/lang/String;
    .param p1, "args"    # [Ljava/lang/Object;

    .prologue
    .line 30
    array-length v1, p1

    if-nez v1, :cond_0

    .line 31
    move-object v0, p0

    .line 36
    .local v0, "log":Ljava/lang/String;
    :goto_0
    return-void

    .line 33
    .end local v0    # "log":Ljava/lang/String;
    :cond_0
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .restart local v0    # "log":Ljava/lang/String;
    goto :goto_0
.end method

.method public static copyStream(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    .locals 4
    .param p0, "input"    # Ljava/io/InputStream;
    .param p1, "output"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 39
    const/16 v3, 0x2000

    new-array v1, v3, [B

    .line 41
    .local v1, "stuff":[B
    const/4 v2, 0x0

    .line 42
    .local v2, "total":I
    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v0

    .local v0, "read":I
    const/4 v3, -0x1

    if-eq v0, v3, :cond_0

    .line 44
    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 45
    add-int/2addr v2, v0

    goto :goto_0

    .line 47
    :cond_0
    return v2
.end method

.method static executeTask(Landroid/os/AsyncTask;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/AsyncTask",
            "<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 796
    .local p0, "task":Landroid/os/AsyncTask;, "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/Void;>;"
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    .line 797
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 801
    :goto_0
    return-void

    .line 799
    :cond_0
    invoke-static {p0}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->executeTaskHoneycomb(Landroid/os/AsyncTask;)V

    goto :goto_0
.end method

.method private static executeTaskHoneycomb(Landroid/os/AsyncTask;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/AsyncTask",
            "<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 805
    .local p0, "task":Landroid/os/AsyncTask;, "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/Void;>;"
    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {p0, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 806
    return-void
.end method

.method public static getCachedBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 4
    .param p0, "url"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x0

    .line 420
    if-nez p0, :cond_1

    move-object v1, v2

    .line 432
    :cond_0
    :goto_0
    return-object v1

    .line 422
    :cond_1
    const/4 v1, 0x0

    .line 423
    .local v1, "ret":Landroid/graphics/Bitmap;
    sget-object v3, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mDeadCache:Lcom/koushikdutta/urlimageviewhelper/LruBitmapCache;

    if-eqz v3, :cond_2

    .line 424
    sget-object v3, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mDeadCache:Lcom/koushikdutta/urlimageviewhelper/LruBitmapCache;

    invoke-virtual {v3, p0}, Lcom/koushikdutta/urlimageviewhelper/LruBitmapCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .end local v1    # "ret":Landroid/graphics/Bitmap;
    check-cast v1, Landroid/graphics/Bitmap;

    .line 425
    .restart local v1    # "ret":Landroid/graphics/Bitmap;
    :cond_2
    if-nez v1, :cond_0

    .line 427
    sget-object v3, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mLiveCache:Lcom/koushikdutta/urlimageviewhelper/DrawableCache;

    if-eqz v3, :cond_3

    .line 428
    sget-object v3, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mLiveCache:Lcom/koushikdutta/urlimageviewhelper/DrawableCache;

    invoke-virtual {v3, p0}, Lcom/koushikdutta/urlimageviewhelper/DrawableCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 429
    .local v0, "drawable":Landroid/graphics/drawable/Drawable;
    instance-of v3, v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;

    if-eqz v3, :cond_3

    .line 430
    check-cast v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;

    .end local v0    # "drawable":Landroid/graphics/drawable/Drawable;
    invoke-virtual {v0}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_0

    :cond_3
    move-object v1, v2

    .line 432
    goto :goto_0
.end method

.method public static getDownloaders()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/koushikdutta/urlimageviewhelper/UrlDownloader;",
            ">;"
        }
    .end annotation

    .prologue
    .line 688
    sget-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mDownloaders:Ljava/util/ArrayList;

    return-object v0
.end method

.method public static getFilenameForUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "url"    # Ljava/lang/String;

    .prologue
    .line 371
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".urlimage"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static getHeapSize(Landroid/content/Context;)I
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 718
    const-string v0, "activity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    invoke-virtual {v0}, Landroid/app/ActivityManager;->getMemoryClass()I

    move-result v0

    mul-int/lit16 v0, v0, 0x400

    mul-int/lit16 v0, v0, 0x400

    return v0
.end method

.method public static getPendingDownloads()I
    .locals 1

    .prologue
    .line 809
    sget-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mPendingDownloads:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->size()I

    move-result v0

    return v0
.end method

.method public static getRequestPropertiesCallback()Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;
    .locals 1

    .prologue
    .line 706
    sget-object v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mRequestPropertiesCallback:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;

    return-object v0
.end method

.method public static getUseBitmapScaling()Z
    .locals 1

    .prologue
    .line 83
    sget-boolean v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mUseBitmapScaling:Z

    return v0
.end method

.method private static isNullOrEmpty(Ljava/lang/CharSequence;)Z
    .locals 1
    .param p0, "s"    # Ljava/lang/CharSequence;

    .prologue
    .line 365
    if-eqz p0, :cond_0

    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "null"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "NULL"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static loadBitmapFromStream(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 11
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "filename"    # Ljava/lang/String;
    .param p3, "targetWidth"    # I
    .param p4, "targetHeight"    # I

    .prologue
    .line 87
    invoke-static {p0}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->prepareResources(Landroid/content/Context;)V

    .line 91
    const/4 v5, 0x0

    .line 92
    .local v5, "stream":Ljava/io/InputStream;
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Decoding: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    new-array v8, v8, [Ljava/lang/Object;

    invoke-static {v7, v8}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->clog(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    const/4 v2, 0x0

    .line 95
    .local v2, "o":Landroid/graphics/BitmapFactory$Options;
    :try_start_0
    sget-boolean v7, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mUseBitmapScaling:Z

    if-eqz v7, :cond_4

    .line 96
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    .end local v2    # "o":Landroid/graphics/BitmapFactory$Options;
    .local v3, "o":Landroid/graphics/BitmapFactory$Options;
    const/4 v7, 0x1

    :try_start_1
    iput-boolean v7, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 98
    new-instance v6, Ljava/io/BufferedInputStream;

    new-instance v7, Ljava/io/FileInputStream;

    invoke-direct {v7, p2}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    const/16 v8, 0x2000

    invoke-direct {v6, v7, v8}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    .end local v5    # "stream":Ljava/io/InputStream;
    .local v6, "stream":Ljava/io/InputStream;
    const/4 v7, 0x0

    :try_start_2
    invoke-static {v6, v7, v3}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 100
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 101
    const/4 v4, 0x0

    .line 102
    .local v4, "scale":I
    :goto_0
    iget v7, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    shr-int/2addr v7, v4

    if-gt v7, p3, :cond_0

    iget v7, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    shr-int/2addr v7, v4

    if-le v7, p4, :cond_1

    .line 103
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 105
    :cond_1
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 106
    .end local v3    # "o":Landroid/graphics/BitmapFactory$Options;
    .restart local v2    # "o":Landroid/graphics/BitmapFactory$Options;
    const/4 v7, 0x1

    shl-int/2addr v7, v4

    :try_start_3
    iput v7, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 108
    .end local v4    # "scale":I
    :goto_1
    new-instance v5, Ljava/io/BufferedInputStream;

    new-instance v7, Ljava/io/FileInputStream;

    invoke-direct {v7, p2}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    const/16 v8, 0x2000

    invoke-direct {v5, v7, v8}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 109
    .end local v6    # "stream":Ljava/io/InputStream;
    .restart local v5    # "stream":Ljava/io/InputStream;
    const/4 v7, 0x0

    :try_start_4
    invoke-static {v5, v7, v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 110
    .local v0, "bitmap":Landroid/graphics/Bitmap;
    const-string v7, "Loaded bitmap (%dx%d)."

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    new-array v8, v8, [Ljava/lang/Object;

    invoke-static {v7, v8}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->clog(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 115
    if-eqz v5, :cond_2

    .line 117
    :try_start_5
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 120
    .end local v0    # "bitmap":Landroid/graphics/Bitmap;
    :cond_2
    :goto_2
    return-object v0

    .line 118
    .restart local v0    # "bitmap":Landroid/graphics/Bitmap;
    :catch_0
    move-exception v1

    .line 119
    .local v1, "e":Ljava/io/IOException;
    const-string v7, "UrlImageViewHelper"

    const-string v8, "Failed to close FileInputStream"

    invoke-static {v7, v8, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    .line 112
    .end local v0    # "bitmap":Landroid/graphics/Bitmap;
    .end local v1    # "e":Ljava/io/IOException;
    :catch_1
    move-exception v1

    .line 113
    .restart local v1    # "e":Ljava/io/IOException;
    :goto_3
    const/4 v0, 0x0

    .line 115
    if-eqz v5, :cond_2

    .line 117
    :try_start_6
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_2

    .line 118
    :catch_2
    move-exception v1

    .line 119
    const-string v7, "UrlImageViewHelper"

    const-string v8, "Failed to close FileInputStream"

    invoke-static {v7, v8, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    .line 115
    .end local v1    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v7

    :goto_4
    if-eqz v5, :cond_3

    .line 117
    :try_start_7
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3

    .line 120
    :cond_3
    :goto_5
    throw v7

    .line 118
    :catch_3
    move-exception v1

    .line 119
    .restart local v1    # "e":Ljava/io/IOException;
    const-string v8, "UrlImageViewHelper"

    const-string v9, "Failed to close FileInputStream"

    invoke-static {v8, v9, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_5

    .line 115
    .end local v1    # "e":Ljava/io/IOException;
    .end local v2    # "o":Landroid/graphics/BitmapFactory$Options;
    .restart local v3    # "o":Landroid/graphics/BitmapFactory$Options;
    :catchall_1
    move-exception v7

    move-object v2, v3

    .end local v3    # "o":Landroid/graphics/BitmapFactory$Options;
    .restart local v2    # "o":Landroid/graphics/BitmapFactory$Options;
    goto :goto_4

    .end local v2    # "o":Landroid/graphics/BitmapFactory$Options;
    .end local v5    # "stream":Ljava/io/InputStream;
    .restart local v3    # "o":Landroid/graphics/BitmapFactory$Options;
    .restart local v6    # "stream":Ljava/io/InputStream;
    :catchall_2
    move-exception v7

    move-object v2, v3

    .end local v3    # "o":Landroid/graphics/BitmapFactory$Options;
    .restart local v2    # "o":Landroid/graphics/BitmapFactory$Options;
    move-object v5, v6

    .end local v6    # "stream":Ljava/io/InputStream;
    .restart local v5    # "stream":Ljava/io/InputStream;
    goto :goto_4

    .end local v5    # "stream":Ljava/io/InputStream;
    .restart local v6    # "stream":Ljava/io/InputStream;
    :catchall_3
    move-exception v7

    move-object v5, v6

    .end local v6    # "stream":Ljava/io/InputStream;
    .restart local v5    # "stream":Ljava/io/InputStream;
    goto :goto_4

    .line 112
    .end local v2    # "o":Landroid/graphics/BitmapFactory$Options;
    .restart local v3    # "o":Landroid/graphics/BitmapFactory$Options;
    :catch_4
    move-exception v1

    move-object v2, v3

    .end local v3    # "o":Landroid/graphics/BitmapFactory$Options;
    .restart local v2    # "o":Landroid/graphics/BitmapFactory$Options;
    goto :goto_3

    .end local v2    # "o":Landroid/graphics/BitmapFactory$Options;
    .end local v5    # "stream":Ljava/io/InputStream;
    .restart local v3    # "o":Landroid/graphics/BitmapFactory$Options;
    .restart local v6    # "stream":Ljava/io/InputStream;
    :catch_5
    move-exception v1

    move-object v2, v3

    .end local v3    # "o":Landroid/graphics/BitmapFactory$Options;
    .restart local v2    # "o":Landroid/graphics/BitmapFactory$Options;
    move-object v5, v6

    .end local v6    # "stream":Ljava/io/InputStream;
    .restart local v5    # "stream":Ljava/io/InputStream;
    goto :goto_3

    .end local v5    # "stream":Ljava/io/InputStream;
    .restart local v6    # "stream":Ljava/io/InputStream;
    :catch_6
    move-exception v1

    move-object v5, v6

    .end local v6    # "stream":Ljava/io/InputStream;
    .restart local v5    # "stream":Ljava/io/InputStream;
    goto :goto_3

    :cond_4
    move-object v6, v5

    .end local v5    # "stream":Ljava/io/InputStream;
    .restart local v6    # "stream":Ljava/io/InputStream;
    goto :goto_1
.end method

.method public static loadUrlDrawable(Landroid/content/Context;Ljava/lang/String;)V
    .locals 7
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    .line 161
    const-wide/32 v4, 0xf731400

    move-object v0, p0

    move-object v2, p1

    move-object v3, v1

    move-object v6, v1

    invoke-static/range {v0 .. v6}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;JLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V

    .line 162
    return-void
.end method

.method public static loadUrlDrawable(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 7
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "cacheDurationMs"    # J

    .prologue
    const/4 v1, 0x0

    .line 197
    move-object v0, p0

    move-object v2, p1

    move-object v3, v1

    move-wide v4, p2

    move-object v6, v1

    invoke-static/range {v0 .. v6}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;JLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V

    .line 198
    return-void
.end method

.method public static loadUrlDrawable(Landroid/content/Context;Ljava/lang/String;JLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V
    .locals 7
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "cacheDurationMs"    # J
    .param p4, "callback"    # Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;

    .prologue
    const/4 v1, 0x0

    .line 315
    move-object v0, p0

    move-object v2, p1

    move-object v3, v1

    move-wide v4, p2

    move-object v6, p4

    invoke-static/range {v0 .. v6}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;JLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V

    .line 316
    return-void
.end method

.method public static loadUrlDrawable(Landroid/content/Context;Ljava/lang/String;Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V
    .locals 7
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "callback"    # Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;

    .prologue
    const/4 v1, 0x0

    .line 273
    const-wide/32 v4, 0xf731400

    move-object v0, p0

    move-object v2, p1

    move-object v3, v1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;JLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V

    .line 274
    return-void
.end method

.method private static prepareResources(Landroid/content/Context;)V
    .locals 4
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 53
    sget-object v1, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mMetrics:Landroid/util/DisplayMetrics;

    if-eqz v1, :cond_0

    .line 63
    :goto_0
    return-void

    .line 56
    :cond_0
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    sput-object v1, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mMetrics:Landroid/util/DisplayMetrics;

    .line 59
    const-string v1, "window"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/WindowManager;

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    sget-object v2, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mMetrics:Landroid/util/DisplayMetrics;

    invoke-virtual {v1, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 61
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    .line 62
    .local v0, "mgr":Landroid/content/res/AssetManager;
    new-instance v1, Landroid/content/res/Resources;

    sget-object v2, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mMetrics:Landroid/util/DisplayMetrics;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3}, Landroid/content/res/Resources;-><init>(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V

    sput-object v1, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mResources:Landroid/content/res/Resources;

    goto :goto_0
.end method

.method public static remove(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 5
    .param p0, "url"    # Ljava/lang/String;

    .prologue
    .line 727
    new-instance v3, Ljava/io/File;

    invoke-static {p0}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->getFilenameForUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 729
    sget-object v3, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mLiveCache:Lcom/koushikdutta/urlimageviewhelper/DrawableCache;

    invoke-virtual {v3, p0}, Lcom/koushikdutta/urlimageviewhelper/DrawableCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 730
    .local v0, "drawable":Landroid/graphics/drawable/Drawable;
    instance-of v3, v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;

    if-eqz v3, :cond_0

    move-object v2, v0

    .line 731
    check-cast v2, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;

    .line 732
    .local v2, "zombie":Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;
    invoke-virtual {v2}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    .line 733
    .local v1, "ret":Landroid/graphics/Bitmap;
    invoke-virtual {v2}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;->headshot()V

    .line 737
    .end local v1    # "ret":Landroid/graphics/Bitmap;
    .end local v2    # "zombie":Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static setRequestPropertiesCallback(Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;)V
    .locals 0
    .param p0, "callback"    # Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;

    .prologue
    .line 710
    sput-object p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mRequestPropertiesCallback:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;

    .line 711
    return-void
.end method

.method private static setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;IJ)V
    .locals 7
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "imageView"    # Landroid/widget/ImageView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "defaultResource"    # I
    .param p4, "cacheDurationMs"    # J

    .prologue
    .line 233
    const/4 v3, 0x0

    .line 234
    .local v3, "d":Landroid/graphics/drawable/Drawable;
    if-eqz p3, :cond_0

    .line 235
    invoke-virtual {p1}, Landroid/widget/ImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 237
    :cond_0
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v4, p4

    invoke-static/range {v0 .. v6}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;JLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V

    .line 238
    return-void
.end method

.method private static setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;IJLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V
    .locals 7
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "imageView"    # Landroid/widget/ImageView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "defaultResource"    # I
    .param p4, "cacheDurationMs"    # J
    .param p6, "callback"    # Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;

    .prologue
    .line 357
    const/4 v3, 0x0

    .line 358
    .local v3, "d":Landroid/graphics/drawable/Drawable;
    if-eqz p3, :cond_0

    .line 359
    invoke-virtual {p1}, Landroid/widget/ImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v4, p4

    move-object v6, p6

    .line 361
    invoke-static/range {v0 .. v6}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;JLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V

    .line 362
    return-void
.end method

.method private static setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;JLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V
    .locals 31
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "imageView"    # Landroid/widget/ImageView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "defaultDrawable"    # Landroid/graphics/drawable/Drawable;
    .param p4, "cacheDurationMs"    # J
    .param p6, "callback"    # Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;

    .prologue
    .line 455
    sget-boolean v6, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->$assertionsDisabled:Z

    if-nez v6, :cond_0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v6

    invoke-virtual {v6}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v7

    if-eq v6, v7, :cond_0

    new-instance v6, Ljava/lang/AssertionError;

    const-string v7, "setUrlDrawable and loadUrlDrawable should only be called from the main thread."

    invoke-direct {v6, v7}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v6

    .line 456
    :cond_0
    invoke-static/range {p0 .. p0}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->cleanup(Landroid/content/Context;)V

    .line 458
    invoke-static/range {p2 .. p2}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->isNullOrEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 459
    if-eqz p1, :cond_1

    .line 460
    sget-object v6, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mPendingViews:Ljava/util/Hashtable;

    move-object/from16 v0, p1

    invoke-virtual {v6, v0}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    move-object/from16 v0, p1

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 675
    :cond_1
    :goto_0
    return-void

    .line 468
    :cond_2
    sget-object v6, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mMetrics:Landroid/util/DisplayMetrics;

    if-nez v6, :cond_3

    .line 469
    invoke-static/range {p0 .. p0}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->prepareResources(Landroid/content/Context;)V

    .line 470
    :cond_3
    sget-object v6, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mMetrics:Landroid/util/DisplayMetrics;

    iget v0, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    move/from16 v30, v0

    .line 471
    .local v30, "tw":I
    sget-object v6, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mMetrics:Landroid/util/DisplayMetrics;

    iget v0, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    move/from16 v29, v0

    .line 473
    .local v29, "th":I
    invoke-static/range {p2 .. p2}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->getFilenameForUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p0

    invoke-virtual {v0, v6}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v6

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    .line 474
    .local v5, "filename":Ljava/lang/String;
    new-instance v26, Ljava/io/File;

    move-object/from16 v0, v26

    invoke-direct {v0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 477
    .local v26, "file":Ljava/io/File;
    sget-object v6, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mDeadCache:Lcom/koushikdutta/urlimageviewhelper/LruBitmapCache;

    if-nez v6, :cond_4

    .line 478
    new-instance v6, Lcom/koushikdutta/urlimageviewhelper/LruBitmapCache;

    invoke-static/range {p0 .. p0}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->getHeapSize(Landroid/content/Context;)I

    move-result v7

    div-int/lit8 v7, v7, 0x8

    invoke-direct {v6, v7}, Lcom/koushikdutta/urlimageviewhelper/LruBitmapCache;-><init>(I)V

    sput-object v6, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mDeadCache:Lcom/koushikdutta/urlimageviewhelper/LruBitmapCache;

    .line 480
    :cond_4
    const/16 v25, 0x0

    .line 481
    .local v25, "drawable":Landroid/graphics/drawable/Drawable;
    sget-object v6, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mDeadCache:Lcom/koushikdutta/urlimageviewhelper/LruBitmapCache;

    move-object/from16 v0, p2

    invoke-virtual {v6, v0}, Lcom/koushikdutta/urlimageviewhelper/LruBitmapCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Landroid/graphics/Bitmap;

    .line 482
    .local v23, "bitmap":Landroid/graphics/Bitmap;
    if-eqz v23, :cond_c

    .line 483
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "zombie load: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    move-object/from16 v0, p2

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v6, v7}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->clog(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 489
    :goto_1
    if-nez v25, :cond_5

    if-eqz v23, :cond_7

    .line 490
    :cond_5
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Cache hit on: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    move-object/from16 v0, p2

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v6, v7}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->clog(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    invoke-virtual/range {v26 .. v26}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_d

    move-object/from16 v0, v26

    move-wide/from16 v1, p4

    invoke-static {v0, v1, v2}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->checkCacheDuration(Ljava/io/File;J)Z

    move-result v6

    if-nez v6, :cond_d

    .line 496
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Cache hit, but file is stale. Forcing reload: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    move-object/from16 v0, p2

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v6, v7}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->clog(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    if-eqz v25, :cond_6

    move-object/from16 v0, v25

    instance-of v6, v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;

    if-eqz v6, :cond_6

    .line 498
    check-cast v25, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;

    .end local v25    # "drawable":Landroid/graphics/drawable/Drawable;
    invoke-virtual/range {v25 .. v25}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;->headshot()V

    .line 499
    :cond_6
    const/16 v25, 0x0

    .line 500
    .restart local v25    # "drawable":Landroid/graphics/drawable/Drawable;
    const/16 v23, 0x0

    .line 508
    :cond_7
    :goto_2
    if-nez v25, :cond_8

    if-eqz v23, :cond_f

    .line 509
    :cond_8
    if-eqz p1, :cond_a

    .line 510
    sget-object v6, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mPendingViews:Ljava/util/Hashtable;

    move-object/from16 v0, p1

    invoke-virtual {v6, v0}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 511
    move-object/from16 v0, v25

    instance-of v6, v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;

    if-eqz v6, :cond_e

    .line 512
    check-cast v25, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;

    .end local v25    # "drawable":Landroid/graphics/drawable/Drawable;
    sget-object v6, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mResources:Landroid/content/res/Resources;

    move-object/from16 v0, v25

    invoke-virtual {v0, v6}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;->clone(Landroid/content/res/Resources;)Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;

    move-result-object v25

    .line 516
    .restart local v25    # "drawable":Landroid/graphics/drawable/Drawable;
    :cond_9
    :goto_3
    move-object/from16 v0, p1

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 519
    :cond_a
    if-eqz p6, :cond_1

    .line 524
    if-nez v23, :cond_b

    move-object/from16 v0, v25

    instance-of v6, v0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;

    if-eqz v6, :cond_b

    .line 525
    check-cast v25, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;

    .end local v25    # "drawable":Landroid/graphics/drawable/Drawable;
    invoke-virtual/range {v25 .. v25}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v23

    .line 526
    :cond_b
    const/4 v6, 0x1

    move-object/from16 v0, p6

    move-object/from16 v1, p1

    move-object/from16 v2, v23

    move-object/from16 v3, p2

    invoke-interface {v0, v1, v2, v3, v6}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;->onLoaded(Landroid/widget/ImageView;Landroid/graphics/Bitmap;Ljava/lang/String;Z)V

    goto/16 :goto_0

    .line 485
    .restart local v25    # "drawable":Landroid/graphics/drawable/Drawable;
    :cond_c
    sget-object v6, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mLiveCache:Lcom/koushikdutta/urlimageviewhelper/DrawableCache;

    move-object/from16 v0, p2

    invoke-virtual {v6, v0}, Lcom/koushikdutta/urlimageviewhelper/DrawableCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v25

    .end local v25    # "drawable":Landroid/graphics/drawable/Drawable;
    check-cast v25, Landroid/graphics/drawable/Drawable;

    .restart local v25    # "drawable":Landroid/graphics/drawable/Drawable;
    goto/16 :goto_1

    .line 503
    :cond_d
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Using cached: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    move-object/from16 v0, p2

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v6, v7}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->clog(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 513
    :cond_e
    if-eqz v23, :cond_9

    .line 514
    new-instance v25, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;

    .end local v25    # "drawable":Landroid/graphics/drawable/Drawable;
    sget-object v6, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mResources:Landroid/content/res/Resources;

    move-object/from16 v0, v25

    move-object/from16 v1, p2

    move-object/from16 v2, v23

    invoke-direct {v0, v1, v6, v2}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$ZombieDrawable;-><init>(Ljava/lang/String;Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .restart local v25    # "drawable":Landroid/graphics/drawable/Drawable;
    goto :goto_3

    .line 538
    :cond_f
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Waiting for "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    move-object/from16 v0, p2

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    move-object/from16 v0, p1

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v6, v7}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->clog(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 539
    if-eqz p1, :cond_10

    .line 540
    move-object/from16 v0, p1

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 541
    sget-object v6, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mPendingViews:Ljava/util/Hashtable;

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-virtual {v6, v0, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    :cond_10
    sget-object v6, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mPendingDownloads:Ljava/util/Hashtable;

    move-object/from16 v0, p2

    invoke-virtual {v6, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v24

    check-cast v24, Ljava/util/ArrayList;

    .line 545
    .local v24, "currentDownload":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/widget/ImageView;>;"
    if-eqz v24, :cond_11

    .line 551
    if-eqz p1, :cond_1

    .line 552
    move-object/from16 v0, v24

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 557
    :cond_11
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 558
    .local v16, "downloads":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/widget/ImageView;>;"
    if-eqz p1, :cond_12

    .line 559
    move-object/from16 v0, v16

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 561
    :cond_12
    sget-object v6, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mPendingDownloads:Ljava/util/Hashtable;

    move-object/from16 v0, p2

    move-object/from16 v1, v16

    invoke-virtual {v6, v0, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 563
    if-gtz v30, :cond_15

    const v8, 0x7fffffff

    .line 564
    .local v8, "targetWidth":I
    :goto_4
    if-gtz v29, :cond_16

    const v9, 0x7fffffff

    .line 565
    .local v9, "targetHeight":I
    :goto_5
    new-instance v4, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;

    move-object/from16 v6, p0

    move-object/from16 v7, p2

    invoke-direct/range {v4 .. v9}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;II)V

    .line 598
    .local v4, "loader":Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;
    new-instance v10, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;

    move-object v11, v4

    move-object/from16 v12, p2

    move-object/from16 v13, p3

    move-object/from16 v14, p6

    move-object/from16 v15, p1

    invoke-direct/range {v10 .. v16}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$2;-><init>(Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;Landroid/widget/ImageView;Ljava/util/ArrayList;)V

    .line 640
    .local v10, "completion":Ljava/lang/Runnable;
    invoke-virtual/range {v26 .. v26}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_13

    .line 642
    :try_start_0
    move-object/from16 v0, v26

    move-wide/from16 v1, p4

    invoke-static {v0, v1, v2}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->checkCacheDuration(Ljava/io/File;J)Z

    move-result v6

    if-eqz v6, :cond_17

    .line 643
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "File Cache hit on: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    move-object/from16 v0, p2

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ". "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    invoke-virtual/range {v26 .. v26}, Ljava/io/File;->lastModified()J

    move-result-wide v13

    sub-long/2addr v11, v13

    invoke-virtual {v6, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "ms old."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v6, v7}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->clog(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 645
    new-instance v27, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$3;

    move-object/from16 v0, v27

    invoke-direct {v0, v4, v5, v10}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$3;-><init>(Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 656
    .local v27, "fileloader":Landroid/os/AsyncTask;, "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/Void;>;"
    invoke-static/range {v27 .. v27}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->executeTask(Landroid/os/AsyncTask;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 663
    .end local v27    # "fileloader":Landroid/os/AsyncTask;, "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/Void;>;"
    :catch_0
    move-exception v6

    .line 667
    :cond_13
    :goto_6
    sget-object v6, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mDownloaders:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v28

    .local v28, "i$":Ljava/util/Iterator;
    :cond_14
    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/koushikdutta/urlimageviewhelper/UrlDownloader;

    .line 668
    .local v17, "downloader":Lcom/koushikdutta/urlimageviewhelper/UrlDownloader;
    move-object/from16 v0, v17

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Lcom/koushikdutta/urlimageviewhelper/UrlDownloader;->canDownloadUrl(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_14

    move-object/from16 v18, p0

    move-object/from16 v19, p2

    move-object/from16 v20, v5

    move-object/from16 v21, v4

    move-object/from16 v22, v10

    .line 669
    invoke-interface/range {v17 .. v22}, Lcom/koushikdutta/urlimageviewhelper/UrlDownloader;->download(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/koushikdutta/urlimageviewhelper/UrlDownloader$UrlDownloaderCallback;Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .end local v4    # "loader":Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;
    .end local v8    # "targetWidth":I
    .end local v9    # "targetHeight":I
    .end local v10    # "completion":Ljava/lang/Runnable;
    .end local v17    # "downloader":Lcom/koushikdutta/urlimageviewhelper/UrlDownloader;
    .end local v28    # "i$":Ljava/util/Iterator;
    :cond_15
    move/from16 v8, v30

    .line 563
    goto/16 :goto_4

    .restart local v8    # "targetWidth":I
    :cond_16
    move/from16 v9, v29

    .line 564
    goto/16 :goto_5

    .line 660
    .restart local v4    # "loader":Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;
    .restart local v9    # "targetHeight":I
    .restart local v10    # "completion":Ljava/lang/Runnable;
    :cond_17
    :try_start_1
    const-string v6, "File cache has expired. Refreshing."

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v6, v7}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->clog(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_6

    .line 674
    .restart local v28    # "i$":Ljava/util/Iterator;
    :cond_18
    move-object/from16 v0, p1

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_0
.end method

.method public static setUrlDrawable(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 7
    .param p0, "imageView"    # Landroid/widget/ImageView;
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    const/4 v3, 0x0

    .line 157
    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-wide/32 v4, 0xf731400

    move-object v1, p0

    move-object v2, p1

    move-object v6, v3

    invoke-static/range {v0 .. v6}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;JLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V

    .line 158
    return-void
.end method

.method public static setUrlDrawable(Landroid/widget/ImageView;Ljava/lang/String;I)V
    .locals 6
    .param p0, "imageView"    # Landroid/widget/ImageView;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "defaultResource"    # I

    .prologue
    .line 145
    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-wide/32 v4, 0xf731400

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-static/range {v0 .. v5}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;IJ)V

    .line 146
    return-void
.end method

.method public static setUrlDrawable(Landroid/widget/ImageView;Ljava/lang/String;IJ)V
    .locals 6
    .param p0, "imageView"    # Landroid/widget/ImageView;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "defaultResource"    # I
    .param p3, "cacheDurationMs"    # J

    .prologue
    .line 193
    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    invoke-static/range {v0 .. v5}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;IJ)V

    .line 194
    return-void
.end method

.method public static setUrlDrawable(Landroid/widget/ImageView;Ljava/lang/String;IJLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V
    .locals 7
    .param p0, "imageView"    # Landroid/widget/ImageView;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "defaultResource"    # I
    .param p3, "cacheDurationMs"    # J
    .param p5, "callback"    # Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;

    .prologue
    .line 311
    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;IJLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V

    .line 312
    return-void
.end method

.method public static setUrlDrawable(Landroid/widget/ImageView;Ljava/lang/String;ILcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V
    .locals 7
    .param p0, "imageView"    # Landroid/widget/ImageView;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "defaultResource"    # I
    .param p3, "callback"    # Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;

    .prologue
    .line 254
    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-wide/32 v4, 0xf731400

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v6, p3

    invoke-static/range {v0 .. v6}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;IJLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V

    .line 255
    return-void
.end method

.method public static setUrlDrawable(Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
    .locals 7
    .param p0, "imageView"    # Landroid/widget/ImageView;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "defaultDrawable"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 177
    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-wide/32 v4, 0xf731400

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v0 .. v6}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;JLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V

    .line 178
    return-void
.end method

.method public static setUrlDrawable(Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;J)V
    .locals 7
    .param p0, "imageView"    # Landroid/widget/ImageView;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "defaultDrawable"    # Landroid/graphics/drawable/Drawable;
    .param p3, "cacheDurationMs"    # J

    .prologue
    .line 215
    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    invoke-static/range {v0 .. v6}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;JLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V

    .line 216
    return-void
.end method

.method public static setUrlDrawable(Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;JLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V
    .locals 7
    .param p0, "imageView"    # Landroid/widget/ImageView;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "defaultDrawable"    # Landroid/graphics/drawable/Drawable;
    .param p3, "cacheDurationMs"    # J
    .param p5, "callback"    # Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;

    .prologue
    .line 336
    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;JLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V

    .line 337
    return-void
.end method

.method public static setUrlDrawable(Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V
    .locals 7
    .param p0, "imageView"    # Landroid/widget/ImageView;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "defaultDrawable"    # Landroid/graphics/drawable/Drawable;
    .param p3, "callback"    # Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;

    .prologue
    .line 292
    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-wide/32 v4, 0xf731400

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v6, p3

    invoke-static/range {v0 .. v6}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;JLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V

    .line 293
    return-void
.end method

.method public static setUrlDrawable(Landroid/widget/ImageView;Ljava/lang/String;Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V
    .locals 7
    .param p0, "imageView"    # Landroid/widget/ImageView;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "callback"    # Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;

    .prologue
    .line 269
    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v3, 0x0

    const-wide/32 v4, 0xf731400

    move-object v1, p0

    move-object v2, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;JLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V

    .line 270
    return-void
.end method

.method public static setUseBitmapScaling(Z)V
    .locals 0
    .param p0, "useBitmapScaling"    # Z

    .prologue
    .line 74
    sput-boolean p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->mUseBitmapScaling:Z

    .line 75
    return-void
.end method

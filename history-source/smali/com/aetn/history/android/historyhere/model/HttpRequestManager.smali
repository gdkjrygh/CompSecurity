.class public Lcom/aetn/history/android/historyhere/model/HttpRequestManager;
.super Ljava/lang/Object;
.source "HttpRequestManager.java"


# static fields
.field private static mInstance:Lcom/aetn/history/android/historyhere/model/HttpRequestManager;


# instance fields
.field private mContext:Landroid/content/Context;

.field private mImageLoader:Lcom/android/volley/toolbox/ImageLoader;

.field private mRequestQueue:Lcom/android/volley/RequestQueue;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->mContext:Landroid/content/Context;

    .line 19
    return-void
.end method

.method public static declared-synchronized getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/HttpRequestManager;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 22
    const-class v1, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->mInstance:Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    if-nez v0, :cond_0

    .line 23
    new-instance v0, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->mInstance:Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    .line 25
    :cond_0
    sget-object v0, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->mInstance:Lcom/aetn/history/android/historyhere/model/HttpRequestManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 22
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public getImageLoader()Lcom/android/volley/toolbox/ImageLoader;
    .locals 4

    .prologue
    .line 38
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->mImageLoader:Lcom/android/volley/toolbox/ImageLoader;

    if-nez v0, :cond_0

    .line 40
    new-instance v0, Lcom/android/volley/toolbox/ImageLoader;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->mRequestQueue:Lcom/android/volley/RequestQueue;

    new-instance v2, Lcom/aetn/history/android/historyhere/utils/LruBitmapCache;

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->mContext:Landroid/content/Context;

    .line 41
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/utils/LruBitmapCache;->getCacheSize(Landroid/content/Context;)I

    move-result v3

    invoke-direct {v2, v3}, Lcom/aetn/history/android/historyhere/utils/LruBitmapCache;-><init>(I)V

    invoke-direct {v0, v1, v2}, Lcom/android/volley/toolbox/ImageLoader;-><init>(Lcom/android/volley/RequestQueue;Lcom/android/volley/toolbox/ImageLoader$ImageCache;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->mImageLoader:Lcom/android/volley/toolbox/ImageLoader;

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->mImageLoader:Lcom/android/volley/toolbox/ImageLoader;

    return-object v0
.end method

.method public getRequestQueue()Lcom/android/volley/RequestQueue;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->mRequestQueue:Lcom/android/volley/RequestQueue;

    if-nez v0, :cond_0

    .line 32
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/android/volley/toolbox/Volley;->newRequestQueue(Landroid/content/Context;)Lcom/android/volley/RequestQueue;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->mRequestQueue:Lcom/android/volley/RequestQueue;

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->mRequestQueue:Lcom/android/volley/RequestQueue;

    return-object v0
.end method

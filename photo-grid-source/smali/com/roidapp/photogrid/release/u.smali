.class final Lcom/roidapp/photogrid/release/u;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Void;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/r;

.field private b:Ljava/lang/String;

.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/photogrid/release/GridImageView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/r;Lcom/roidapp/photogrid/release/GridImageView;)V
    .locals 1

    .prologue
    .line 292
    iput-object p1, p0, Lcom/roidapp/photogrid/release/u;->a:Lcom/roidapp/photogrid/release/r;

    .line 293
    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 289
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/u;->b:Ljava/lang/String;

    .line 295
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/u;->c:Ljava/lang/ref/WeakReference;

    .line 296
    return-void
.end method

.method private varargs a([Ljava/lang/Integer;)Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 302
    .line 303
    iget-object v0, p0, Lcom/roidapp/photogrid/release/u;->a:Lcom/roidapp/photogrid/release/r;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/r;->b(Lcom/roidapp/photogrid/release/r;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 304
    iget-object v0, p0, Lcom/roidapp/photogrid/release/u;->a:Lcom/roidapp/photogrid/release/r;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/r;->b(Lcom/roidapp/photogrid/release/r;)Ljava/util/ArrayList;

    move-result-object v2

    monitor-enter v2

    .line 305
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/u;->a:Lcom/roidapp/photogrid/release/r;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/r;->b(Lcom/roidapp/photogrid/release/r;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/release/u;->a:Lcom/roidapp/photogrid/release/r;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/r;->b(Lcom/roidapp/photogrid/release/r;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/release/u;->a:Lcom/roidapp/photogrid/release/r;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/r;->b(Lcom/roidapp/photogrid/release/r;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    const/4 v0, 0x0

    aget-object v0, p1, v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v3, p0, Lcom/roidapp/photogrid/release/u;->a:Lcom/roidapp/photogrid/release/r;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/r;->b(Lcom/roidapp/photogrid/release/r;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_5

    .line 306
    iget-object v0, p0, Lcom/roidapp/photogrid/release/u;->a:Lcom/roidapp/photogrid/release/r;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/r;->b(Lcom/roidapp/photogrid/release/r;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v3, 0x0

    aget-object v3, p1, v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/b;

    .line 308
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 310
    :goto_1
    iget-object v2, p0, Lcom/roidapp/photogrid/release/u;->a:Lcom/roidapp/photogrid/release/r;

    invoke-static {v2, v0}, Lcom/roidapp/photogrid/release/r;->a(Lcom/roidapp/photogrid/release/r;Lcom/roidapp/photogrid/release/b;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 311
    iget-object v3, p0, Lcom/roidapp/photogrid/release/u;->a:Lcom/roidapp/photogrid/release/r;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/r;->c(Lcom/roidapp/photogrid/release/r;)Landroid/support/v4/util/LruCache;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 312
    iget-object v3, p0, Lcom/roidapp/photogrid/release/u;->a:Lcom/roidapp/photogrid/release/r;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/r;->c(Lcom/roidapp/photogrid/release/r;)Landroid/support/v4/util/LruCache;

    move-result-object v3

    monitor-enter v3

    .line 313
    if-eqz v0, :cond_3

    .line 314
    :try_start_1
    iget-boolean v4, v0, Lcom/roidapp/photogrid/release/b;->g:Z

    if-eqz v4, :cond_1

    .line 315
    iget-object v0, v0, Lcom/roidapp/photogrid/release/b;->e:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/u;->b:Ljava/lang/String;

    .line 319
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/u;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    if-nez v2, :cond_2

    .line 320
    :cond_0
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 328
    :goto_3
    return-object v1

    .line 308
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 317
    :cond_1
    :try_start_3
    iget v0, v0, Lcom/roidapp/photogrid/release/b;->a:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/u;->b:Ljava/lang/String;

    goto :goto_2

    .line 325
    :catchall_1
    move-exception v0

    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    .line 322
    :cond_2
    :try_start_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/u;->a:Lcom/roidapp/photogrid/release/r;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/r;->c(Lcom/roidapp/photogrid/release/r;)Landroid/support/v4/util/LruCache;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/u;->a:Lcom/roidapp/photogrid/release/r;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/r;->c(Lcom/roidapp/photogrid/release/r;)Landroid/support/v4/util/LruCache;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/u;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    .line 323
    iget-object v0, p0, Lcom/roidapp/photogrid/release/u;->a:Lcom/roidapp/photogrid/release/r;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/r;->c(Lcom/roidapp/photogrid/release/r;)Landroid/support/v4/util/LruCache;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/u;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    :cond_3
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_4
    move-object v1, v2

    .line 328
    goto :goto_3

    :cond_5
    move-object v0, v1

    goto :goto_0

    :cond_6
    move-object v0, v1

    goto :goto_1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/u;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 288
    iget-object v0, p0, Lcom/roidapp/photogrid/release/u;->b:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 288
    check-cast p1, [Ljava/lang/Integer;

    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/u;->a([Ljava/lang/Integer;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected final bridge synthetic onCancelled(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 288
    check-cast p1, Landroid/graphics/Bitmap;

    .line 1352
    invoke-super {p0, p1}, Lcom/roidapp/baselib/c/c;->onCancelled(Ljava/lang/Object;)V

    .line 288
    return-void
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 288
    check-cast p1, Landroid/graphics/Bitmap;

    .line 2334
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/u;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2335
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 2336
    const/4 p1, 0x0

    .line 2338
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/u;->c:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    .line 2339
    iget-object v0, p0, Lcom/roidapp/photogrid/release/u;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/GridImageView;

    .line 2340
    invoke-static {v0}, Lcom/roidapp/photogrid/release/r;->a(Lcom/roidapp/photogrid/release/GridImageView;)Lcom/roidapp/photogrid/release/u;

    move-result-object v1

    .line 2342
    if-ne p0, v1, :cond_1

    .line 2343
    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/GridImageView;->a(Landroid/graphics/Bitmap;)V

    .line 2347
    :cond_1
    invoke-super {p0, p1}, Lcom/roidapp/baselib/c/c;->onPostExecute(Ljava/lang/Object;)V

    .line 288
    return-void
.end method

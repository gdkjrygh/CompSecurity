.class final Lcom/roidapp/imagelib/c/g;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/roidapp/imagelib/c/h;

.field private final c:Lcom/roidapp/baselib/b/i;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Lcom/roidapp/imagelib/c/h;Lcom/roidapp/baselib/b/i;)V
    .locals 1

    .prologue
    .line 60
    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 61
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/c/g;->a:Ljava/lang/ref/WeakReference;

    .line 62
    iput-object p2, p0, Lcom/roidapp/imagelib/c/g;->b:Lcom/roidapp/imagelib/c/h;

    .line 63
    iput-object p3, p0, Lcom/roidapp/imagelib/c/g;->c:Lcom/roidapp/baselib/b/i;

    .line 64
    return-void
.end method

.method private varargs a([Ljava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 10

    .prologue
    const/4 v7, 0x0

    .line 68
    invoke-virtual {p0}, Lcom/roidapp/imagelib/c/g;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, v7

    .line 111
    :goto_0
    return-object v0

    .line 69
    :cond_0
    invoke-static {}, Lcom/roidapp/imagelib/c/b;->a()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 71
    const/4 v0, 0x0

    :try_start_0
    aget-object v0, p1, v0

    check-cast v0, Ljava/lang/Boolean;

    .line 72
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 111
    invoke-static {}, Lcom/roidapp/imagelib/c/b;->a()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    move-object v0, v7

    goto :goto_0

    .line 75
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/imagelib/c/g;->b:Lcom/roidapp/imagelib/c/h;

    iget-object v0, v0, Lcom/roidapp/imagelib/c/h;->d:Lcom/roidapp/imagelib/c/a;

    iget v8, v0, Lcom/roidapp/imagelib/c/a;->a:I

    .line 76
    iget-object v0, p0, Lcom/roidapp/imagelib/c/g;->b:Lcom/roidapp/imagelib/c/h;

    iget-object v0, v0, Lcom/roidapp/imagelib/c/h;->d:Lcom/roidapp/imagelib/c/a;

    iget v9, v0, Lcom/roidapp/imagelib/c/a;->b:I

    .line 77
    const/4 v0, 0x1

    aget-object v0, p1, v0

    check-cast v0, Lcom/roidapp/imagelib/c/f;

    .line 78
    invoke-interface {v0}, Lcom/roidapp/imagelib/c/f;->a()Ljava/io/FileInputStream;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 79
    if-nez v0, :cond_2

    .line 111
    invoke-static {}, Lcom/roidapp/imagelib/c/b;->a()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    move-object v0, v7

    goto :goto_0

    .line 80
    :cond_2
    :try_start_2
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    iget-object v1, p0, Lcom/roidapp/imagelib/c/g;->b:Lcom/roidapp/imagelib/c/h;

    iget-object v1, v1, Lcom/roidapp/imagelib/c/h;->d:Lcom/roidapp/imagelib/c/a;

    iget-object v1, v1, Lcom/roidapp/imagelib/c/a;->c:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v8, v9, v1}, Lcom/roidapp/baselib/a/a;->a(Ljava/io/FileInputStream;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    .line 81
    if-nez v0, :cond_3

    .line 111
    invoke-static {}, Lcom/roidapp/imagelib/c/b;->a()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    move-object v0, v7

    goto :goto_0

    .line 82
    :cond_3
    :try_start_3
    iget-object v1, p0, Lcom/roidapp/imagelib/c/g;->b:Lcom/roidapp/imagelib/c/h;

    iget-object v1, v1, Lcom/roidapp/imagelib/c/h;->d:Lcom/roidapp/imagelib/c/a;

    iget v1, v1, Lcom/roidapp/imagelib/c/a;->d:I

    .line 83
    if-lez v1, :cond_5

    .line 84
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 85
    int-to-float v1, v1

    invoke-virtual {v5, v1}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 86
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 88
    if-eq v1, v0, :cond_4

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_4

    .line 89
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_4
    move-object v0, v1

    .line 92
    :cond_5
    iget-object v1, p0, Lcom/roidapp/imagelib/c/g;->b:Lcom/roidapp/imagelib/c/h;

    iget-object v1, v1, Lcom/roidapp/imagelib/c/h;->c:Lcom/roidapp/imagelib/c/e;

    if-eqz v1, :cond_9

    .line 93
    iget-object v1, p0, Lcom/roidapp/imagelib/c/g;->b:Lcom/roidapp/imagelib/c/h;

    iget-object v1, v1, Lcom/roidapp/imagelib/c/h;->c:Lcom/roidapp/imagelib/c/e;

    iget-object v2, p0, Lcom/roidapp/imagelib/c/g;->b:Lcom/roidapp/imagelib/c/h;

    invoke-interface {v1, v0, v2}, Lcom/roidapp/imagelib/c/e;->a(Landroid/graphics/Bitmap;Lcom/roidapp/imagelib/c/h;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 94
    if-eqz v1, :cond_7

    if-eq v0, v1, :cond_7

    .line 95
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_6

    .line 96
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_6
    move-object v0, v1

    .line 101
    :cond_7
    if-eqz v1, :cond_8

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 102
    :cond_8
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    move-object v0, v7

    .line 107
    :cond_9
    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_a

    .line 108
    const/4 v1, 0x2

    invoke-static {v0, v8, v9, v1}, Landroid/media/ThumbnailUtils;->extractThumbnail(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v0

    .line 111
    :cond_a
    invoke-static {}, Lcom/roidapp/imagelib/c/b;->a()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    invoke-static {}, Lcom/roidapp/imagelib/c/b;->a()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method static synthetic a(Lcom/roidapp/imagelib/c/g;)Lcom/roidapp/imagelib/c/h;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/roidapp/imagelib/c/g;->b:Lcom/roidapp/imagelib/c/h;

    return-object v0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 55
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/c/g;->a([Ljava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 55
    check-cast p1, Landroid/graphics/Bitmap;

    .line 1117
    invoke-virtual {p0}, Lcom/roidapp/imagelib/c/g;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1118
    if-eqz p1, :cond_0

    .line 1119
    iget-object v0, p0, Lcom/roidapp/imagelib/c/g;->c:Lcom/roidapp/baselib/b/i;

    iget-object v1, p0, Lcom/roidapp/imagelib/c/g;->b:Lcom/roidapp/imagelib/c/h;

    iget-object v1, v1, Lcom/roidapp/imagelib/c/h;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/roidapp/baselib/b/i;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 1120
    iget-object v0, p0, Lcom/roidapp/imagelib/c/g;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 1121
    if-eqz v0, :cond_0

    .line 1122
    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/imagelib/c/g;

    .line 1123
    if-eqz v1, :cond_0

    if-eq v1, p0, :cond_1

    :cond_0
    :goto_0
    return-void

    .line 1124
    :cond_1
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

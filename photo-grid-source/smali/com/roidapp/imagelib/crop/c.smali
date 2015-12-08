.class final Lcom/roidapp/imagelib/crop/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/graphics/Bitmap;

.field final synthetic b:Ljava/util/concurrent/CountDownLatch;

.field final synthetic c:Lcom/roidapp/imagelib/crop/b;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/crop/b;Landroid/graphics/Bitmap;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .prologue
    .line 98
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/c;->c:Lcom/roidapp/imagelib/crop/b;

    iput-object p2, p0, Lcom/roidapp/imagelib/crop/c;->a:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lcom/roidapp/imagelib/crop/c;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 100
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/c;->a:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/c;->c:Lcom/roidapp/imagelib/crop/b;

    iget-object v1, v1, Lcom/roidapp/imagelib/crop/b;->a:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/a;->a(Lcom/roidapp/imagelib/crop/a;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/c;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/c;->c:Lcom/roidapp/imagelib/crop/b;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/b;->a:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/a;->b(Lcom/roidapp/imagelib/crop/a;)Lcom/roidapp/imagelib/crop/CropImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/c;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/crop/CropImageView;->a(Landroid/graphics/Bitmap;)V

    .line 102
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/c;->c:Lcom/roidapp/imagelib/crop/b;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/b;->a:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/a;->a(Lcom/roidapp/imagelib/crop/a;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 103
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/c;->c:Lcom/roidapp/imagelib/crop/b;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/b;->a:Lcom/roidapp/imagelib/crop/a;

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/c;->a:Landroid/graphics/Bitmap;

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/crop/a;->a(Lcom/roidapp/imagelib/crop/a;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 105
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/c;->c:Lcom/roidapp/imagelib/crop/b;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/b;->a:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/a;->b(Lcom/roidapp/imagelib/crop/a;)Lcom/roidapp/imagelib/crop/CropImageView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/CropImageView;->b()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 106
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/c;->c:Lcom/roidapp/imagelib/crop/b;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/b;->a:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/a;->b(Lcom/roidapp/imagelib/crop/a;)Lcom/roidapp/imagelib/crop/CropImageView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/CropImageView;->a()V

    .line 108
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/c;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 109
    return-void
.end method

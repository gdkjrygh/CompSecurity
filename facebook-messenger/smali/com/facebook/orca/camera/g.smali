.class Lcom/facebook/orca/camera/g;
.super Ljava/lang/Object;
.source "CropImage.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/camera/CropImage;


# direct methods
.method constructor <init>(Lcom/facebook/orca/camera/CropImage;)V
    .locals 0

    .prologue
    .line 182
    iput-object p1, p0, Lcom/facebook/orca/camera/g;->a:Lcom/facebook/orca/camera/CropImage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 184
    new-instance v1, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {v1, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 185
    iget-object v0, p0, Lcom/facebook/orca/camera/g;->a:Lcom/facebook/orca/camera/CropImage;

    invoke-static {v0}, Lcom/facebook/orca/camera/CropImage;->b(Lcom/facebook/orca/camera/CropImage;)Lcom/facebook/orca/camera/a/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/camera/g;->a:Lcom/facebook/orca/camera/CropImage;

    invoke-static {v0}, Lcom/facebook/orca/camera/CropImage;->b(Lcom/facebook/orca/camera/CropImage;)Lcom/facebook/orca/camera/a/c;

    move-result-object v0

    const/4 v2, -0x1

    const/high16 v3, 0x100000

    invoke-interface {v0, v2, v3}, Lcom/facebook/orca/camera/a/c;->a(II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 189
    :goto_0
    iget-object v2, p0, Lcom/facebook/orca/camera/g;->a:Lcom/facebook/orca/camera/CropImage;

    invoke-static {v2}, Lcom/facebook/orca/camera/CropImage;->e(Lcom/facebook/orca/camera/CropImage;)Landroid/os/Handler;

    move-result-object v2

    new-instance v3, Lcom/facebook/orca/camera/h;

    invoke-direct {v3, p0, v0, v1}, Lcom/facebook/orca/camera/h;-><init>(Lcom/facebook/orca/camera/g;Landroid/graphics/Bitmap;Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 203
    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 207
    iget-object v0, p0, Lcom/facebook/orca/camera/g;->a:Lcom/facebook/orca/camera/CropImage;

    iget-object v0, v0, Lcom/facebook/orca/camera/CropImage;->d:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 208
    return-void

    .line 185
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/camera/g;->a:Lcom/facebook/orca/camera/CropImage;

    invoke-static {v0}, Lcom/facebook/orca/camera/CropImage;->c(Lcom/facebook/orca/camera/CropImage;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    .line 204
    :catch_0
    move-exception v0

    .line 205
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

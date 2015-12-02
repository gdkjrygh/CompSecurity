.class Lcom/facebook/orca/camera/j;
.super Ljava/lang/Object;
.source "CropImage.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/graphics/Bitmap;

.field final synthetic b:Lcom/facebook/orca/camera/CropImage;


# direct methods
.method constructor <init>(Lcom/facebook/orca/camera/CropImage;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 393
    iput-object p1, p0, Lcom/facebook/orca/camera/j;->b:Lcom/facebook/orca/camera/CropImage;

    iput-object p2, p0, Lcom/facebook/orca/camera/j;->a:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 395
    iget-object v0, p0, Lcom/facebook/orca/camera/j;->b:Lcom/facebook/orca/camera/CropImage;

    invoke-static {v0}, Lcom/facebook/orca/camera/CropImage;->d(Lcom/facebook/orca/camera/CropImage;)Lcom/facebook/orca/camera/CropImageView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/camera/CropImageView;->a()V

    .line 396
    iget-object v0, p0, Lcom/facebook/orca/camera/j;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 397
    return-void
.end method

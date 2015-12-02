.class Lcom/facebook/orca/camera/i;
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
    .line 314
    iput-object p1, p0, Lcom/facebook/orca/camera/i;->b:Lcom/facebook/orca/camera/CropImage;

    iput-object p2, p0, Lcom/facebook/orca/camera/i;->a:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 316
    iget-object v0, p0, Lcom/facebook/orca/camera/i;->b:Lcom/facebook/orca/camera/CropImage;

    iget-object v1, p0, Lcom/facebook/orca/camera/i;->a:Landroid/graphics/Bitmap;

    invoke-static {v0, v1}, Lcom/facebook/orca/camera/CropImage;->b(Lcom/facebook/orca/camera/CropImage;Landroid/graphics/Bitmap;)V

    .line 317
    return-void
.end method

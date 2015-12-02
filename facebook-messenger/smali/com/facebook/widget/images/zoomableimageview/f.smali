.class Lcom/facebook/widget/images/zoomableimageview/f;
.super Ljava/lang/Object;
.source "ImageViewTouchBase.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/graphics/drawable/Drawable;

.field final synthetic b:Z

.field final synthetic c:Landroid/graphics/Matrix;

.field final synthetic d:F

.field final synthetic e:Lcom/facebook/widget/images/zoomableimageview/e;


# direct methods
.method constructor <init>(Lcom/facebook/widget/images/zoomableimageview/e;Landroid/graphics/drawable/Drawable;ZLandroid/graphics/Matrix;F)V
    .locals 0

    .prologue
    .line 177
    iput-object p1, p0, Lcom/facebook/widget/images/zoomableimageview/f;->e:Lcom/facebook/widget/images/zoomableimageview/e;

    iput-object p2, p0, Lcom/facebook/widget/images/zoomableimageview/f;->a:Landroid/graphics/drawable/Drawable;

    iput-boolean p3, p0, Lcom/facebook/widget/images/zoomableimageview/f;->b:Z

    iput-object p4, p0, Lcom/facebook/widget/images/zoomableimageview/f;->c:Landroid/graphics/Matrix;

    iput p5, p0, Lcom/facebook/widget/images/zoomableimageview/f;->d:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 181
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/f;->e:Lcom/facebook/widget/images/zoomableimageview/e;

    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/f;->a:Landroid/graphics/drawable/Drawable;

    iget-boolean v2, p0, Lcom/facebook/widget/images/zoomableimageview/f;->b:Z

    iget-object v3, p0, Lcom/facebook/widget/images/zoomableimageview/f;->c:Landroid/graphics/Matrix;

    iget v4, p0, Lcom/facebook/widget/images/zoomableimageview/f;->d:F

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/widget/images/zoomableimageview/e;->b(Landroid/graphics/drawable/Drawable;ZLandroid/graphics/Matrix;F)V

    .line 182
    return-void
.end method

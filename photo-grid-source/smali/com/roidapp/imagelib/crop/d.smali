.class final Lcom/roidapp/imagelib/crop/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field a:F

.field b:Landroid/graphics/Matrix;

.field final synthetic c:Lcom/roidapp/imagelib/crop/a;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/crop/a;)V
    .locals 1

    .prologue
    .line 357
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 358
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/imagelib/crop/d;->a:F

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 501
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/a;->b(Lcom/roidapp/imagelib/crop/a;)Lcom/roidapp/imagelib/crop/CropImageView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/CropImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/d;->b:Landroid/graphics/Matrix;

    .line 504
    const/high16 v0, 0x3f800000    # 1.0f

    iget v1, p0, Lcom/roidapp/imagelib/crop/d;->a:F

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/imagelib/crop/d;->a:F

    .line 514
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/d;->c:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/a;->c(Lcom/roidapp/imagelib/crop/a;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/roidapp/imagelib/crop/e;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/crop/e;-><init>(Lcom/roidapp/imagelib/crop/d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 538
    return-void
.end method

.class public Lcom/facebook/ui/images/d/e;
.super Ljava/lang/Object;
.source "CropRegionGraphicOp.java"

# interfaces
.implements Lcom/facebook/ui/images/d/g;


# instance fields
.field private final a:Lcom/facebook/ui/images/d/b;

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(Lcom/facebook/ui/images/d/b;II)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/ui/images/d/e;->a:Lcom/facebook/ui/images/d/b;

    .line 22
    iput p2, p0, Lcom/facebook/ui/images/d/e;->b:I

    .line 23
    iput p3, p0, Lcom/facebook/ui/images/d/e;->c:I

    .line 24
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 28
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 29
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 31
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2, v4, v4, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 32
    iget-object v0, p0, Lcom/facebook/ui/images/d/e;->a:Lcom/facebook/ui/images/d/b;

    iget v1, p0, Lcom/facebook/ui/images/d/e;->b:I

    iget v3, p0, Lcom/facebook/ui/images/d/e;->c:I

    invoke-virtual {v0, v2, v1, v3, v2}, Lcom/facebook/ui/images/d/b;->a(Landroid/graphics/Rect;IILandroid/graphics/Rect;)V

    .line 33
    new-instance v1, Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v3

    invoke-direct {v1, v4, v4, v0, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 36
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    .line 38
    :goto_0
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v3

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v4

    invoke-static {v3, v4, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 39
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 40
    const/4 v4, 0x0

    invoke-virtual {v3, p1, v2, v1, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 41
    return-object v0

    .line 36
    :cond_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_0
.end method

.method public a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V
    .locals 3

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/ui/images/d/e;->a:Lcom/facebook/ui/images/d/b;

    iget v1, p0, Lcom/facebook/ui/images/d/e;->b:I

    iget v2, p0, Lcom/facebook/ui/images/d/e;->c:I

    invoke-virtual {v0, p1, v1, v2, p2}, Lcom/facebook/ui/images/d/b;->a(Landroid/graphics/Rect;IILandroid/graphics/Rect;)V

    .line 47
    return-void
.end method

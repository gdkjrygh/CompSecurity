.class public Lcom/facebook/ui/images/d/a;
.super Ljava/lang/Object;
.source "CropRectGraphicOp.java"

# interfaces
.implements Lcom/facebook/ui/images/d/g;


# instance fields
.field private final a:Lcom/facebook/ui/images/d/f;


# direct methods
.method public constructor <init>(Lcom/facebook/ui/images/d/f;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/facebook/ui/images/d/a;->a:Lcom/facebook/ui/images/d/f;

    .line 18
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 22
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 23
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 25
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2, v6, v6, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 26
    iget-object v0, p0, Lcom/facebook/ui/images/d/a;->a:Lcom/facebook/ui/images/d/f;

    invoke-virtual {v0, v2, v2}, Lcom/facebook/ui/images/d/f;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 27
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v1

    .line 28
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v3

    .line 30
    if-lez v3, :cond_0

    if-gtz v1, :cond_1

    .line 42
    :cond_0
    :goto_0
    return-object p1

    .line 36
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    .line 38
    :goto_1
    invoke-static {v1, v3, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 39
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 40
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5, v6, v6, v1, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 41
    const/4 v1, 0x0

    invoke-virtual {v4, p1, v2, v5, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    move-object p1, v0

    .line 42
    goto :goto_0

    .line 36
    :cond_2
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_1
.end method

.method public a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/ui/images/d/a;->a:Lcom/facebook/ui/images/d/f;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/ui/images/d/f;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 48
    return-void
.end method

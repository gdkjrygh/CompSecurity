.class public abstract Lcom/facebook/reflex/Image;
.super Lcom/facebook/reflex/d;
.source "Image.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/facebook/reflex/d;-><init>()V

    .line 21
    invoke-direct {p0}, Lcom/facebook/reflex/Image;->initialize()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/Image;->a(I)V

    .line 22
    return-void
.end method

.method private native initialize()I
.end method

.method private native nativeSetBitmap(Landroid/graphics/Bitmap;III)V
.end method


# virtual methods
.method protected a()V
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/Image;->a(Landroid/graphics/Bitmap;)V

    .line 28
    return-void
.end method

.method protected a(Landroid/graphics/Bitmap;)V
    .locals 3

    .prologue
    .line 37
    if-nez p1, :cond_0

    .line 41
    :goto_0
    return-void

    .line 40
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    sget-object v2, Lcom/facebook/reflex/u;->Unknown:Lcom/facebook/reflex/u;

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/facebook/reflex/Image;->a(Landroid/graphics/Bitmap;IILcom/facebook/reflex/u;)V

    goto :goto_0
.end method

.method protected a(Landroid/graphics/Bitmap;II)V
    .locals 1

    .prologue
    .line 63
    sget-object v0, Lcom/facebook/reflex/u;->Unknown:Lcom/facebook/reflex/u;

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/facebook/reflex/Image;->a(Landroid/graphics/Bitmap;IILcom/facebook/reflex/u;)V

    .line 64
    return-void
.end method

.method protected a(Landroid/graphics/Bitmap;IILcom/facebook/reflex/u;)V
    .locals 1

    .prologue
    .line 76
    invoke-virtual {p0}, Lcom/facebook/reflex/Image;->e()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    .line 80
    :goto_0
    return-void

    .line 79
    :cond_0
    invoke-virtual {p4}, Lcom/facebook/reflex/u;->ordinal()I

    move-result v0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/reflex/Image;->nativeSetBitmap(Landroid/graphics/Bitmap;III)V

    goto :goto_0
.end method

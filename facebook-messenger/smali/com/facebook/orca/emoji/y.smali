.class public Lcom/facebook/orca/emoji/y;
.super Landroid/text/style/ImageSpan;
.source "EmojiSpan.java"


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/BitmapDrawable;)V
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;I)V

    .line 26
    return-void
.end method

.method private a(Landroid/graphics/Paint;I)I
    .locals 2

    .prologue
    .line 69
    check-cast p1, Landroid/text/TextPaint;

    .line 70
    int-to-float v0, p2

    iget v1, p1, Landroid/text/TextPaint;->density:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private a()Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 29
    iget-object v1, p0, Lcom/facebook/orca/emoji/y;->a:Ljava/lang/ref/WeakReference;

    .line 30
    const/4 v0, 0x0

    .line 32
    if-eqz v1, :cond_0

    .line 33
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 35
    :cond_0
    if-nez v0, :cond_1

    .line 36
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/y;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 37
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/facebook/orca/emoji/y;->a:Ljava/lang/ref/WeakReference;

    .line 40
    :cond_1
    return-object v0
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 3

    .prologue
    .line 58
    invoke-direct {p0}, Lcom/facebook/orca/emoji/y;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 59
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 61
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int v1, p8, v1

    const/4 v2, 0x2

    invoke-direct {p0, p9, v2}, Lcom/facebook/orca/emoji/y;->a(Landroid/graphics/Paint;I)I

    move-result v2

    sub-int/2addr v1, v2

    .line 62
    const/4 v2, 0x1

    invoke-direct {p0, p9, v2}, Lcom/facebook/orca/emoji/y;->a(Landroid/graphics/Paint;I)I

    move-result v2

    .line 63
    int-to-float v2, v2

    add-float/2addr v2, p5

    int-to-float v1, v1

    invoke-virtual {p1, v2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 64
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 65
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 66
    return-void
.end method

.method public getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 2

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/orca/emoji/y;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 49
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 50
    const/4 v1, 0x2

    invoke-direct {p0, p1, v1}, Lcom/facebook/orca/emoji/y;->a(Landroid/graphics/Paint;I)I

    move-result v1

    .line 51
    iget v0, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v0, v1

    return v0
.end method

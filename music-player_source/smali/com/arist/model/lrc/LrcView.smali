.class public Lcom/arist/model/lrc/LrcView;
.super Landroid/view/View;

# interfaces
.implements Lcom/arist/model/skin/m;


# instance fields
.field protected a:Lcom/arist/model/lrc/f;

.field protected b:I

.field protected c:I

.field protected d:I

.field protected e:I

.field protected f:I

.field protected g:F

.field protected h:F

.field protected i:F

.field protected j:Landroid/text/TextPaint;

.field protected k:Landroid/text/TextPaint;

.field protected l:Z

.field protected m:[Ljava/lang/String;

.field protected n:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x3

    iput v0, p0, Lcom/arist/model/lrc/LrcView;->e:I

    iput v1, p0, Lcom/arist/model/lrc/LrcView;->f:I

    iput-boolean v1, p0, Lcom/arist/model/lrc/LrcView;->l:Z

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/arist/model/lrc/LrcView;->a(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x3

    iput v0, p0, Lcom/arist/model/lrc/LrcView;->e:I

    iput v1, p0, Lcom/arist/model/lrc/LrcView;->f:I

    iput-boolean v1, p0, Lcom/arist/model/lrc/LrcView;->l:Z

    invoke-direct {p0, p2}, Lcom/arist/model/lrc/LrcView;->a(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x3

    iput v0, p0, Lcom/arist/model/lrc/LrcView;->e:I

    iput v1, p0, Lcom/arist/model/lrc/LrcView;->f:I

    iput-boolean v1, p0, Lcom/arist/model/lrc/LrcView;->l:Z

    invoke-direct {p0, p2}, Lcom/arist/model/lrc/LrcView;->a(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private a(Landroid/util/AttributeSet;)V
    .locals 8

    const/4 v7, 0x5

    const/4 v5, 0x4

    const/4 v1, -0x1

    const/high16 v4, 0x41a00000    # 20.0f

    const/4 v6, 0x1

    const/16 v0, 0xf9

    const/16 v2, 0xef

    const/16 v3, 0x7c

    invoke-static {v0, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/arist/model/lrc/LrcView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v2, La/a/a/a/b;->f:[I

    invoke-virtual {v0, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    const/4 v0, 0x0

    invoke-virtual {v2, v0, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/arist/model/lrc/LrcView;->g:F

    const/high16 v0, 0x41f00000    # 30.0f

    invoke-virtual {v2, v6, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/arist/model/lrc/LrcView;->h:F

    invoke-virtual {v2, v7, v7}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v0

    iput v0, p0, Lcom/arist/model/lrc/LrcView;->e:I

    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {v2, v5, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/arist/model/lrc/LrcView;->i:F

    const/4 v0, 0x2

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    const/4 v0, 0x3

    const/16 v3, 0xf9

    const/16 v4, 0xef

    const/16 v5, 0x7c

    invoke-static {v3, v4, v5}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-virtual {v2, v0, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    :goto_0
    invoke-virtual {p0}, Lcom/arist/model/lrc/LrcView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0900ca

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/arist/model/lrc/LrcView;->m:[Ljava/lang/String;

    invoke-virtual {p0}, Lcom/arist/model/lrc/LrcView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0900f2

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/arist/model/lrc/LrcView;->n:[Ljava/lang/String;

    iget v2, p0, Lcom/arist/model/lrc/LrcView;->h:F

    iget v3, p0, Lcom/arist/model/lrc/LrcView;->e:I

    int-to-float v3, v3

    mul-float/2addr v2, v3

    iget v3, p0, Lcom/arist/model/lrc/LrcView;->i:F

    iget v4, p0, Lcom/arist/model/lrc/LrcView;->e:I

    add-int/lit8 v4, v4, 0x1

    int-to-float v4, v4

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    float-to-int v2, v2

    iput v2, p0, Lcom/arist/model/lrc/LrcView;->d:I

    new-instance v2, Landroid/text/TextPaint;

    invoke-direct {v2, v6}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v2, p0, Lcom/arist/model/lrc/LrcView;->j:Landroid/text/TextPaint;

    new-instance v2, Landroid/text/TextPaint;

    invoke-direct {v2, v6}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v2, p0, Lcom/arist/model/lrc/LrcView;->k:Landroid/text/TextPaint;

    iget-object v2, p0, Lcom/arist/model/lrc/LrcView;->j:Landroid/text/TextPaint;

    iget v3, p0, Lcom/arist/model/lrc/LrcView;->g:F

    invoke-virtual {v2, v3}, Landroid/text/TextPaint;->setTextSize(F)V

    iget-object v2, p0, Lcom/arist/model/lrc/LrcView;->j:Landroid/text/TextPaint;

    sget-object v3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v2, v3}, Landroid/text/TextPaint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v2, p0, Lcom/arist/model/lrc/LrcView;->j:Landroid/text/TextPaint;

    invoke-virtual {v2, v1}, Landroid/text/TextPaint;->setColor(I)V

    iget-object v1, p0, Lcom/arist/model/lrc/LrcView;->j:Landroid/text/TextPaint;

    sget-object v2, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {v1, v2}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object v1, p0, Lcom/arist/model/lrc/LrcView;->k:Landroid/text/TextPaint;

    iget v2, p0, Lcom/arist/model/lrc/LrcView;->h:F

    invoke-virtual {v1, v2}, Landroid/text/TextPaint;->setTextSize(F)V

    iget-object v1, p0, Lcom/arist/model/lrc/LrcView;->k:Landroid/text/TextPaint;

    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v1, v2}, Landroid/text/TextPaint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v1, p0, Lcom/arist/model/lrc/LrcView;->k:Landroid/text/TextPaint;

    invoke-virtual {v1, v0}, Landroid/text/TextPaint;->setColor(I)V

    iget-object v0, p0, Lcom/arist/model/lrc/LrcView;->k:Landroid/text/TextPaint;

    sget-object v1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    new-instance v0, Lcom/arist/model/lrc/f;

    invoke-direct {v0}, Lcom/arist/model/lrc/f;-><init>()V

    iput-object v0, p0, Lcom/arist/model/lrc/LrcView;->a:Lcom/arist/model/lrc/f;

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/arist/model/lrc/LrcView;->getContext()Landroid/content/Context;

    move-result-object v2

    const/high16 v3, 0x41900000    # 18.0f

    invoke-static {v2, v3}, Lcom/arist/c/g;->b(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    iput v2, p0, Lcom/arist/model/lrc/LrcView;->g:F

    invoke-virtual {p0}, Lcom/arist/model/lrc/LrcView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v4}, Lcom/arist/c/g;->b(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    iput v2, p0, Lcom/arist/model/lrc/LrcView;->h:F

    iput v5, p0, Lcom/arist/model/lrc/LrcView;->e:I

    invoke-virtual {p0}, Lcom/arist/model/lrc/LrcView;->getContext()Landroid/content/Context;

    move-result-object v2

    const/high16 v3, 0x40c00000    # 6.0f

    invoke-static {v2, v3}, Lcom/arist/c/g;->a(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    iput v2, p0, Lcom/arist/model/lrc/LrcView;->i:F

    goto/16 :goto_0
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-object v0, p0, Lcom/arist/model/lrc/LrcView;->k:Landroid/text/TextPaint;

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setColor(I)V

    return-void
.end method

.method public final declared-synchronized a(J)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/arist/model/lrc/LrcView;->a:Lcom/arist/model/lrc/f;

    invoke-virtual {v0, p1, p2}, Lcom/arist/model/lrc/f;->a(J)I

    move-result v0

    iput v0, p0, Lcom/arist/model/lrc/LrcView;->f:I

    iget v0, p0, Lcom/arist/model/lrc/LrcView;->f:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/arist/model/lrc/LrcView;->postInvalidate()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/model/lrc/LrcView;->l:Z

    iget-object v0, p0, Lcom/arist/model/lrc/LrcView;->a:Lcom/arist/model/lrc/f;

    invoke-virtual {v0, p1}, Lcom/arist/model/lrc/f;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/arist/model/lrc/LrcView;->postInvalidate()V

    return-void
.end method

.method public final b()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arist/model/lrc/LrcView;->l:Z

    iget-object v0, p0, Lcom/arist/model/lrc/LrcView;->a:Lcom/arist/model/lrc/f;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/arist/model/lrc/f;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/arist/model/lrc/LrcView;->postInvalidate()V

    return-void
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, Lcom/arist/model/lrc/LrcView;->a:Lcom/arist/model/lrc/f;

    invoke-virtual {v0}, Lcom/arist/model/lrc/f;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-static {}, Lcom/arist/model/skin/b;->a()Lcom/arist/model/skin/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/b;->a(Lcom/arist/model/skin/m;)V

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    invoke-static {}, Lcom/arist/model/skin/b;->a()Lcom/arist/model/skin/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/b;->b(Lcom/arist/model/skin/m;)V

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    const/16 v4, 0xff

    const/16 v12, 0x14

    const/4 v1, 0x0

    const/high16 v10, 0x40000000    # 2.0f

    iget-object v0, p0, Lcom/arist/model/lrc/LrcView;->a:Lcom/arist/model/lrc/f;

    invoke-virtual {v0}, Lcom/arist/model/lrc/f;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/arist/model/lrc/LrcView;->l:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/lrc/LrcView;->m:[Ljava/lang/String;

    move-object v2, v0

    :goto_0
    if-eqz v2, :cond_0

    array-length v0, v2

    if-nez v0, :cond_2

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/arist/model/lrc/LrcView;->n:[Ljava/lang/String;

    move-object v2, v0

    goto :goto_0

    :cond_2
    array-length v0, v2

    int-to-float v0, v0

    iget v3, p0, Lcom/arist/model/lrc/LrcView;->g:F

    mul-float/2addr v0, v3

    iget v3, p0, Lcom/arist/model/lrc/LrcView;->i:F

    array-length v4, v2

    add-int/lit8 v4, v4, -0x1

    int-to-float v4, v4

    mul-float/2addr v3, v4

    add-float/2addr v0, v3

    invoke-virtual {p0}, Lcom/arist/model/lrc/LrcView;->getHeight()I

    move-result v3

    int-to-float v3, v3

    sub-float v0, v3, v0

    div-float/2addr v0, v10

    iget v3, p0, Lcom/arist/model/lrc/LrcView;->g:F

    div-float/2addr v3, v10

    add-float/2addr v0, v3

    iget v3, p0, Lcom/arist/model/lrc/LrcView;->i:F

    add-float/2addr v0, v3

    array-length v3, v2

    :goto_1
    if-ge v1, v3, :cond_0

    aget-object v4, v2, v1

    invoke-virtual {p0}, Lcom/arist/model/lrc/LrcView;->getWidth()I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    int-to-float v5, v5

    iget-object v6, p0, Lcom/arist/model/lrc/LrcView;->j:Landroid/text/TextPaint;

    invoke-virtual {p1, v4, v5, v0, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget v4, p0, Lcom/arist/model/lrc/LrcView;->g:F

    iget v5, p0, Lcom/arist/model/lrc/LrcView;->i:F

    add-float/2addr v4, v5

    add-float/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/arist/model/lrc/LrcView;->a:Lcom/arist/model/lrc/f;

    iget-boolean v0, v0, Lcom/arist/model/lrc/f;->a:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/arist/model/lrc/LrcView;->a:Lcom/arist/model/lrc/f;

    iget-object v2, p0, Lcom/arist/model/lrc/LrcView;->k:Landroid/text/TextPaint;

    iget v3, p0, Lcom/arist/model/lrc/LrcView;->b:I

    invoke-virtual {v0, v2, v3}, Lcom/arist/model/lrc/f;->a(Landroid/graphics/Paint;I)V

    :cond_4
    iget v0, p0, Lcom/arist/model/lrc/LrcView;->c:I

    int-to-float v0, v0

    iget v2, p0, Lcom/arist/model/lrc/LrcView;->g:F

    sub-float/2addr v0, v2

    div-float v3, v0, v10

    iget v0, p0, Lcom/arist/model/lrc/LrcView;->b:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v7, v0

    iget v0, p0, Lcom/arist/model/lrc/LrcView;->g:F

    iget v2, p0, Lcom/arist/model/lrc/LrcView;->i:F

    add-float v8, v0, v2

    iget-object v0, p0, Lcom/arist/model/lrc/LrcView;->a:Lcom/arist/model/lrc/f;

    iget v2, p0, Lcom/arist/model/lrc/LrcView;->f:I

    invoke-virtual {v0, v2}, Lcom/arist/model/lrc/f;->a(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    move v0, v1

    move v2, v3

    :goto_2
    array-length v6, v5

    if-lt v0, v6, :cond_6

    iget v0, p0, Lcom/arist/model/lrc/LrcView;->h:F

    div-float/2addr v0, v10

    iget v5, p0, Lcom/arist/model/lrc/LrcView;->g:F

    sub-float/2addr v0, v5

    iget v5, p0, Lcom/arist/model/lrc/LrcView;->i:F

    mul-float/2addr v5, v10

    add-float/2addr v0, v5

    sub-float/2addr v3, v0

    iget v0, p0, Lcom/arist/model/lrc/LrcView;->h:F

    div-float/2addr v0, v10

    iget v5, p0, Lcom/arist/model/lrc/LrcView;->g:F

    sub-float/2addr v0, v5

    iget v5, p0, Lcom/arist/model/lrc/LrcView;->i:F

    mul-float/2addr v5, v10

    add-float/2addr v0, v5

    iget-object v5, p0, Lcom/arist/model/lrc/LrcView;->k:Landroid/text/TextPaint;

    invoke-virtual {v5}, Landroid/text/TextPaint;->descent()F

    move-result v5

    sub-float/2addr v0, v5

    add-float v5, v2, v0

    iget v0, p0, Lcom/arist/model/lrc/LrcView;->f:I

    add-int/lit8 v0, v0, -0x1

    move v6, v0

    move v2, v3

    move v0, v4

    :goto_3
    if-gez v6, :cond_8

    :cond_5
    iget v0, p0, Lcom/arist/model/lrc/LrcView;->f:I

    add-int/lit8 v0, v0, 0x1

    move v2, v4

    move v3, v5

    :goto_4
    iget-object v4, p0, Lcom/arist/model/lrc/LrcView;->a:Lcom/arist/model/lrc/f;

    invoke-virtual {v4}, Lcom/arist/model/lrc/f;->b()I

    move-result v4

    if-ge v0, v4, :cond_0

    iget-object v4, p0, Lcom/arist/model/lrc/LrcView;->a:Lcom/arist/model/lrc/f;

    invoke-virtual {v4, v0}, Lcom/arist/model/lrc/f;->a(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "\n"

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    move v4, v1

    :goto_5
    array-length v5, v6

    if-lt v4, v5, :cond_b

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_6
    aget-object v6, v5, v0

    iget-object v9, p0, Lcom/arist/model/lrc/LrcView;->k:Landroid/text/TextPaint;

    invoke-virtual {p1, v6, v7, v2, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    array-length v6, v5

    add-int/lit8 v6, v6, -0x1

    if-ge v0, v6, :cond_7

    iget v6, p0, Lcom/arist/model/lrc/LrcView;->h:F

    iget v9, p0, Lcom/arist/model/lrc/LrcView;->i:F

    add-float/2addr v6, v9

    add-float/2addr v2, v6

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_8
    iget-object v3, p0, Lcom/arist/model/lrc/LrcView;->a:Lcom/arist/model/lrc/f;

    invoke-virtual {v3, v6}, Lcom/arist/model/lrc/f;->a(I)Ljava/lang/String;

    move-result-object v3

    const-string v9, "\n"

    invoke-virtual {v3, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    move v3, v2

    move v2, v0

    move v0, v1

    :goto_6
    array-length v10, v9

    if-lt v0, v10, :cond_9

    add-int/lit8 v0, v6, -0x1

    move v6, v0

    move v0, v2

    move v2, v3

    goto :goto_3

    :cond_9
    sub-float/2addr v3, v8

    if-ge v2, v12, :cond_a

    move v2, v1

    :goto_7
    iget-object v10, p0, Lcom/arist/model/lrc/LrcView;->j:Landroid/text/TextPaint;

    invoke-virtual {v10, v2}, Landroid/text/TextPaint;->setAlpha(I)V

    aget-object v10, v9, v0

    iget-object v11, p0, Lcom/arist/model/lrc/LrcView;->j:Landroid/text/TextPaint;

    invoke-virtual {p1, v10, v7, v3, v11}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    const/4 v10, 0x0

    cmpg-float v10, v3, v10

    if-ltz v10, :cond_5

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_a
    add-int/lit8 v2, v2, -0x14

    goto :goto_7

    :cond_b
    add-float v5, v3, v8

    if-ge v2, v12, :cond_c

    move v3, v1

    :goto_8
    iget-object v2, p0, Lcom/arist/model/lrc/LrcView;->j:Landroid/text/TextPaint;

    invoke-virtual {v2, v3}, Landroid/text/TextPaint;->setAlpha(I)V

    aget-object v2, v6, v4

    iget-object v9, p0, Lcom/arist/model/lrc/LrcView;->j:Landroid/text/TextPaint;

    invoke-virtual {p1, v2, v7, v5, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget v2, p0, Lcom/arist/model/lrc/LrcView;->c:I

    int-to-float v2, v2

    cmpl-float v2, v5, v2

    if-gtz v2, :cond_0

    add-int/lit8 v2, v4, 0x1

    move v4, v2

    move v2, v3

    move v3, v5

    goto :goto_5

    :cond_c
    add-int/lit8 v3, v2, -0x14

    goto :goto_8
.end method

.method protected onSizeChanged(IIII)V
    .locals 1

    invoke-virtual {p0}, Lcom/arist/model/lrc/LrcView;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lcom/arist/model/lrc/LrcView;->b:I

    invoke-virtual {p0}, Lcom/arist/model/lrc/LrcView;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lcom/arist/model/lrc/LrcView;->c:I

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    return-void
.end method

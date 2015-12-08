.class public Lcom/arist/model/equize/VisualizerView;
.super Landroid/view/View;

# interfaces
.implements Lcom/arist/model/equize/o;
.implements Lcom/arist/model/skin/m;


# instance fields
.field private a:Lcom/arist/model/equize/n;

.field private b:[I

.field private final c:Ljava/lang/Object;

.field private d:Landroid/graphics/Paint;

.field private e:[I

.field private f:[I

.field private g:I

.field private h:I

.field private i:I

.field private j:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const/4 v1, 0x1

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/arist/model/equize/VisualizerView;->c:Ljava/lang/Object;

    const/4 v0, 0x5

    iput v0, p0, Lcom/arist/model/equize/VisualizerView;->h:I

    iput v1, p0, Lcom/arist/model/equize/VisualizerView;->i:I

    new-instance v0, Lcom/arist/model/equize/p;

    invoke-direct {v0, p0}, Lcom/arist/model/equize/p;-><init>(Lcom/arist/model/equize/VisualizerView;)V

    iput-object v0, p0, Lcom/arist/model/equize/VisualizerView;->j:Ljava/lang/Runnable;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/arist/model/equize/VisualizerView;->d:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/arist/model/equize/VisualizerView;->d:Landroid/graphics/Paint;

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v0, p0, Lcom/arist/model/equize/VisualizerView;->d:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/arist/model/equize/VisualizerView;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/arist/model/equize/VisualizerView;->d:Landroid/graphics/Paint;

    iget v1, p0, Lcom/arist/model/equize/VisualizerView;->h:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/high16 v0, 0x40a00000    # 5.0f

    invoke-static {p1, v0}, Lcom/arist/c/g;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/arist/model/equize/VisualizerView;->h:I

    return-void
.end method

.method private a()[I
    .locals 2

    iget-object v1, p0, Lcom/arist/model/equize/VisualizerView;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/arist/model/equize/VisualizerView;->b:[I

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-object v0, p0, Lcom/arist/model/equize/VisualizerView;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public final a(Lcom/arist/model/equize/n;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/equize/VisualizerView;->a:Lcom/arist/model/equize/n;

    invoke-virtual {p1, p0}, Lcom/arist/model/equize/n;->a(Lcom/arist/model/equize/o;)V

    return-void
.end method

.method public final a([B)V
    .locals 5

    iget-object v1, p0, Lcom/arist/model/equize/VisualizerView;->c:Ljava/lang/Object;

    monitor-enter v1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/arist/model/equize/VisualizerView;->b:[I

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget v0, p0, Lcom/arist/model/equize/VisualizerView;->g:I

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/arist/model/equize/VisualizerView;->b:[I

    array-length v2, p1

    const/4 v0, 0x0

    :goto_1
    iget v3, p0, Lcom/arist/model/equize/VisualizerView;->g:I

    if-lt v0, v3, :cond_1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :cond_1
    if-ge v0, v2, :cond_2

    :try_start_1
    iget-object v3, p0, Lcom/arist/model/equize/VisualizerView;->b:[I

    aget-byte v4, p1, v0

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    aput v4, v3, v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method protected onAttachedToWindow()V
    .locals 4

    invoke-static {}, Lcom/arist/model/skin/b;->a()Lcom/arist/model/skin/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/b;->a(Lcom/arist/model/skin/m;)V

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/arist/model/equize/VisualizerView;->j:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lcom/arist/model/equize/VisualizerView;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lcom/arist/model/equize/VisualizerView;->j:Ljava/lang/Runnable;

    const-wide/16 v2, 0x0

    invoke-virtual {p0, v0, v2, v3}, Lcom/arist/model/equize/VisualizerView;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    invoke-static {}, Lcom/arist/model/skin/b;->a()Lcom/arist/model/skin/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/b;->b(Lcom/arist/model/skin/m;)V

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/arist/model/equize/VisualizerView;->j:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lcom/arist/model/equize/VisualizerView;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/high16 v8, 0x40000000    # 2.0f

    invoke-direct {p0}, Lcom/arist/model/equize/VisualizerView;->a()[I

    move-result-object v1

    if-eqz v1, :cond_9

    iget v1, p0, Lcom/arist/model/equize/VisualizerView;->g:I

    if-lez v1, :cond_9

    invoke-direct {p0}, Lcom/arist/model/equize/VisualizerView;->a()[I

    move-result-object v1

    iget v3, p0, Lcom/arist/model/equize/VisualizerView;->g:I

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_0

    iget-object v3, p0, Lcom/arist/model/equize/VisualizerView;->a:Lcom/arist/model/equize/n;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/arist/model/equize/VisualizerView;->e:[I

    if-nez v3, :cond_2

    :cond_0
    move-object v6, v0

    :goto_1
    iget-object v0, p0, Lcom/arist/model/equize/VisualizerView;->a:Lcom/arist/model/equize/n;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/equize/VisualizerView;->a:Lcom/arist/model/equize/n;

    invoke-virtual {v0}, Lcom/arist/model/equize/n;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez v6, :cond_7

    :cond_1
    :goto_2
    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/arist/model/equize/VisualizerView;->getWidth()I

    move-result v0

    iget v3, p0, Lcom/arist/model/equize/VisualizerView;->h:I

    mul-int/lit8 v3, v3, 0x2

    sub-int/2addr v0, v3

    div-int/lit16 v0, v0, 0x80

    if-gtz v0, :cond_3

    const/4 v0, 0x1

    :cond_3
    array-length v4, v1

    move v3, v2

    :goto_3
    if-lt v3, v4, :cond_4

    move v0, v2

    :goto_4
    if-lt v0, v4, :cond_5

    move-object v6, v1

    goto :goto_1

    :cond_4
    aget v5, v1, v3

    mul-int/2addr v5, v0

    aput v5, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_5
    iget-object v3, p0, Lcom/arist/model/equize/VisualizerView;->f:[I

    aget v3, v3, v0

    iget-object v5, p0, Lcom/arist/model/equize/VisualizerView;->e:[I

    iget-object v6, p0, Lcom/arist/model/equize/VisualizerView;->e:[I

    aget v6, v6, v0

    iget v7, p0, Lcom/arist/model/equize/VisualizerView;->i:I

    mul-int/2addr v7, v3

    mul-int/2addr v7, v3

    div-int/lit8 v7, v7, 0x2

    sub-int/2addr v6, v7

    aput v6, v5, v0

    iget-object v5, p0, Lcom/arist/model/equize/VisualizerView;->f:[I

    add-int/lit8 v3, v3, 0x1

    aput v3, v5, v0

    iget-object v3, p0, Lcom/arist/model/equize/VisualizerView;->e:[I

    aget v3, v3, v0

    aget v5, v1, v0

    iget v6, p0, Lcom/arist/model/equize/VisualizerView;->h:I

    add-int/2addr v5, v6

    if-gt v3, v5, :cond_6

    iget-object v3, p0, Lcom/arist/model/equize/VisualizerView;->e:[I

    aget v5, v1, v0

    iget v6, p0, Lcom/arist/model/equize/VisualizerView;->h:I

    add-int/2addr v5, v6

    aput v5, v3, v0

    iget-object v3, p0, Lcom/arist/model/equize/VisualizerView;->f:[I

    aput v2, v3, v0

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_7
    const/high16 v0, 0x43340000    # 180.0f

    invoke-virtual {p0}, Lcom/arist/model/equize/VisualizerView;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v8

    invoke-virtual {p0}, Lcom/arist/model/equize/VisualizerView;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v8

    invoke-virtual {p1, v0, v1, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    invoke-virtual {p0}, Lcom/arist/model/equize/VisualizerView;->getWidth()I

    move-result v0

    iget v1, p0, Lcom/arist/model/equize/VisualizerView;->g:I

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, -0x1

    iget v3, p0, Lcom/arist/model/equize/VisualizerView;->h:I

    mul-int/2addr v1, v3

    sub-int/2addr v0, v1

    int-to-float v0, v0

    div-float v1, v0, v8

    move v7, v2

    :goto_5
    iget v0, p0, Lcom/arist/model/equize/VisualizerView;->g:I

    if-lt v7, v0, :cond_8

    const/high16 v0, -0x3ccc0000    # -180.0f

    invoke-virtual {p0}, Lcom/arist/model/equize/VisualizerView;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v8

    invoke-virtual {p0}, Lcom/arist/model/equize/VisualizerView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v8

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    goto/16 :goto_2

    :cond_8
    iget-object v0, p0, Lcom/arist/model/equize/VisualizerView;->e:[I

    aget v0, v0, v7

    int-to-float v0, v0

    iget-object v2, p0, Lcom/arist/model/equize/VisualizerView;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v0, v2}, Landroid/graphics/Canvas;->drawPoint(FFLandroid/graphics/Paint;)V

    aget v0, v6, v7

    int-to-float v2, v0

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/arist/model/equize/VisualizerView;->d:Landroid/graphics/Paint;

    move-object v0, p1

    move v3, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v0, p0, Lcom/arist/model/equize/VisualizerView;->h:I

    mul-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    add-float/2addr v1, v0

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_5

    :cond_9
    move-object v1, v0

    goto/16 :goto_0
.end method

.method protected onSizeChanged(IIII)V
    .locals 1

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iget v0, p0, Lcom/arist/model/equize/VisualizerView;->h:I

    mul-int/lit8 v0, v0, 0x2

    div-int v0, p1, v0

    iput v0, p0, Lcom/arist/model/equize/VisualizerView;->g:I

    iget v0, p0, Lcom/arist/model/equize/VisualizerView;->g:I

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/arist/model/equize/VisualizerView;->e:[I

    iget v0, p0, Lcom/arist/model/equize/VisualizerView;->g:I

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/arist/model/equize/VisualizerView;->f:[I

    return-void
.end method

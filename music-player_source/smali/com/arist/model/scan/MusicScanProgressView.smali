.class public Lcom/arist/model/scan/MusicScanProgressView;
.super Landroid/view/View;

# interfaces
.implements Lcom/arist/model/skin/m;


# instance fields
.field a:F

.field b:Z

.field c:Landroid/graphics/Paint;

.field d:Landroid/graphics/SweepGradient;

.field e:Landroid/graphics/Paint;

.field f:Z

.field g:I

.field h:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const/4 v2, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 v0, 0x43870000    # 270.0f

    iput v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->a:F

    iput-boolean v1, p0, Lcom/arist/model/scan/MusicScanProgressView;->b:Z

    iput-boolean v1, p0, Lcom/arist/model/scan/MusicScanProgressView;->f:Z

    const v0, -0xf26901

    iput v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->g:I

    new-instance v0, Lcom/arist/model/scan/g;

    invoke-direct {v0, p0}, Lcom/arist/model/scan/g;-><init>(Lcom/arist/model/scan/MusicScanProgressView;)V

    iput-object v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->h:Landroid/os/Handler;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->c:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->e:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->e:Landroid/graphics/Paint;

    const/high16 v1, 0x40400000    # 3.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    const/4 v1, 0x0

    iget-boolean v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->b:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->b:Z

    iget-object v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->h:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->h:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    return-void
.end method

.method public final a(I)V
    .locals 1

    iput p1, p0, Lcom/arist/model/scan/MusicScanProgressView;->g:I

    iget-object v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public final b()V
    .locals 2

    const/4 v1, 0x0

    iget-boolean v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->b:Z

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lcom/arist/model/scan/MusicScanProgressView;->b:Z

    iget-object v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->h:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 1

    iget-boolean v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->b:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->f:Z

    :cond_0
    return-void
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

    const/4 v1, 0x3

    const/high16 v6, 0x40000000    # 2.0f

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Lcom/arist/model/scan/MusicScanProgressView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/arist/model/scan/MusicScanProgressView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float v10, v0, v6

    div-float v9, v2, v6

    cmpl-float v0, v10, v9

    if-lez v0, :cond_0

    move v8, v9

    :goto_0
    move v2, v1

    :goto_1
    if-gez v2, :cond_1

    float-to-double v0, v8

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    div-double/2addr v0, v2

    double-to-float v11, v0

    sub-float v1, v10, v8

    sub-float v12, v9, v8

    add-float v2, v12, v8

    mul-float v0, v8, v6

    add-float v3, v1, v0

    add-float v4, v12, v8

    iget-object v5, p0, Lcom/arist/model/scan/MusicScanProgressView;->e:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-float v3, v1, v8

    add-float v5, v1, v8

    add-float v0, v12, v1

    mul-float v2, v8, v6

    add-float v6, v0, v2

    iget-object v7, p0, Lcom/arist/model/scan/MusicScanProgressView;->e:Landroid/graphics/Paint;

    move-object v2, p1

    move v4, v12

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-float v0, v1, v8

    sub-float v3, v0, v11

    add-float v0, v12, v8

    sub-float v4, v0, v11

    add-float v0, v1, v8

    add-float v5, v0, v11

    add-float v0, v12, v8

    add-float v6, v0, v11

    iget-object v7, p0, Lcom/arist/model/scan/MusicScanProgressView;->e:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-float v0, v1, v8

    add-float v6, v0, v11

    add-float v0, v12, v8

    sub-float v2, v0, v11

    add-float v0, v1, v8

    sub-float v3, v0, v11

    add-float v0, v12, v8

    add-float v4, v0, v11

    iget-object v5, p0, Lcom/arist/model/scan/MusicScanProgressView;->e:Landroid/graphics/Paint;

    move-object v0, p1

    move v1, v6

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->a:F

    invoke-virtual {p1, v0, v10, v9}, Landroid/graphics/Canvas;->rotate(FFF)V

    iget-object v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v10, v9, v8, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void

    :cond_0
    move v8, v10

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lcom/arist/model/scan/MusicScanProgressView;->e:Landroid/graphics/Paint;

    if-ge v2, v1, :cond_2

    const/4 v0, 0x2

    :goto_2
    int-to-float v0, v0

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    add-int/lit8 v0, v2, 0x1

    int-to-float v0, v0

    mul-float/2addr v0, v8

    const/high16 v3, 0x40800000    # 4.0f

    div-float/2addr v0, v3

    sub-float/2addr v0, v6

    iget-object v3, p0, Lcom/arist/model/scan/MusicScanProgressView;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v10, v9, v0, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto/16 :goto_1

    :cond_2
    move v0, v1

    goto :goto_2
.end method

.method protected onSizeChanged(IIII)V
    .locals 6

    const v5, 0xffffff

    const/high16 v3, 0x40000000    # 2.0f

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    new-instance v0, Landroid/graphics/SweepGradient;

    int-to-float v1, p1

    div-float/2addr v1, v3

    int-to-float v2, p2

    div-float/2addr v2, v3

    const/4 v3, 0x3

    new-array v3, v3, [I

    const/4 v4, 0x0

    aput v5, v3, v4

    const/4 v4, 0x1

    aput v5, v3, v4

    const/4 v4, 0x2

    iget v5, p0, Lcom/arist/model/scan/MusicScanProgressView;->g:I

    aput v5, v3, v4

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    iput-object v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->d:Landroid/graphics/SweepGradient;

    iget-object v0, p0, Lcom/arist/model/scan/MusicScanProgressView;->c:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/arist/model/scan/MusicScanProgressView;->d:Landroid/graphics/SweepGradient;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void
.end method

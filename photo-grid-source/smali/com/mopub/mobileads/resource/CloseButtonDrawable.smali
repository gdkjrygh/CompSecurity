.class public Lcom/mopub/mobileads/resource/CloseButtonDrawable;
.super Lcom/mopub/mobileads/resource/CircleDrawable;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Point;

.field private b:Landroid/graphics/Point;

.field private c:Landroid/graphics/Point;

.field private d:Landroid/graphics/Point;

.field private e:Landroid/graphics/Point;

.field private final f:Landroid/graphics/Paint;

.field private g:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/mopub/mobileads/resource/CircleDrawable;-><init>()V

    .line 19
    new-instance v0, Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->a()Landroid/graphics/Paint;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->f:Landroid/graphics/Paint;

    .line 20
    iget-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->f:Landroid/graphics/Paint;

    const/high16 v1, 0x40900000    # 4.5f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 21
    iget-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->f:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 22
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 6

    .prologue
    .line 26
    invoke-super {p0, p1}, Lcom/mopub/mobileads/resource/CircleDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 28
    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {p0}, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->d()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-float v1, v2

    div-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->g:I

    .line 30
    new-instance v0, Landroid/graphics/Point;

    invoke-virtual {p0}, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->b()I

    move-result v1

    invoke-virtual {p0}, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->c()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->a:Landroid/graphics/Point;

    .line 32
    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->a:Landroid/graphics/Point;

    invoke-direct {v0, v1}, Landroid/graphics/Point;-><init>(Landroid/graphics/Point;)V

    iput-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->b:Landroid/graphics/Point;

    .line 33
    iget-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->b:Landroid/graphics/Point;

    iget v1, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->g:I

    neg-int v1, v1

    iget v2, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->g:I

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Point;->offset(II)V

    .line 35
    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->a:Landroid/graphics/Point;

    invoke-direct {v0, v1}, Landroid/graphics/Point;-><init>(Landroid/graphics/Point;)V

    iput-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->c:Landroid/graphics/Point;

    .line 36
    iget-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->c:Landroid/graphics/Point;

    iget v1, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->g:I

    neg-int v1, v1

    iget v2, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->g:I

    neg-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Point;->offset(II)V

    .line 38
    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->a:Landroid/graphics/Point;

    invoke-direct {v0, v1}, Landroid/graphics/Point;-><init>(Landroid/graphics/Point;)V

    iput-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->d:Landroid/graphics/Point;

    .line 39
    iget-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->d:Landroid/graphics/Point;

    iget v1, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->g:I

    iget v2, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->g:I

    neg-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Point;->offset(II)V

    .line 41
    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->a:Landroid/graphics/Point;

    invoke-direct {v0, v1}, Landroid/graphics/Point;-><init>(Landroid/graphics/Point;)V

    iput-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->e:Landroid/graphics/Point;

    .line 42
    iget-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->e:Landroid/graphics/Point;

    iget v1, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->g:I

    iget v2, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->g:I

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Point;->offset(II)V

    .line 44
    iget-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->b:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v1, v0

    iget-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->b:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v2, v0

    iget-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->d:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v3, v0

    iget-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->d:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v4, v0

    iget-object v5, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->f:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 45
    iget-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->c:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v1, v0

    iget-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->c:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v2, v0

    iget-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->e:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v3, v0

    iget-object v0, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->e:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v4, v0

    iget-object v5, p0, Lcom/mopub/mobileads/resource/CloseButtonDrawable;->f:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 46
    return-void
.end method

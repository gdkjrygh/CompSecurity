.class public Lcom/roidapp/photogrid/release/ProgressView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:Landroid/graphics/Paint;

.field private d:Landroid/graphics/Paint;

.field private e:Landroid/graphics/RectF;

.field private f:Landroid/graphics/Path;

.field private g:F

.field private h:Landroid/graphics/Matrix;

.field private i:Landroid/graphics/RectF;

.field private j:Landroid/graphics/Paint;

.field private k:F

.field private l:F

.field private m:Landroid/text/TextPaint;

.field private n:Ljava/lang/String;

.field private o:F

.field private p:F

.field private q:F

.field private r:I

.field private s:Z

.field private t:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 55
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 24
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->c:Landroid/graphics/Paint;

    .line 25
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->d:Landroid/graphics/Paint;

    .line 26
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->e:Landroid/graphics/RectF;

    .line 27
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->f:Landroid/graphics/Path;

    .line 28
    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->g:F

    .line 31
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->h:Landroid/graphics/Matrix;

    .line 33
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->i:Landroid/graphics/RectF;

    .line 34
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->j:Landroid/graphics/Paint;

    .line 44
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->m:Landroid/text/TextPaint;

    .line 46
    const-string v0, "1"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->n:Ljava/lang/String;

    .line 48
    const/high16 v0, 0x3fc00000    # 1.5f

    iput v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->p:F

    .line 217
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->t:Z

    .line 56
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    .line 57
    invoke-static {p0}, Lcom/roidapp/photogrid/common/bl;->a(Landroid/view/View;)V

    .line 59
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    .line 62
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->c:Landroid/graphics/Paint;

    .line 25
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->d:Landroid/graphics/Paint;

    .line 26
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->e:Landroid/graphics/RectF;

    .line 27
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->f:Landroid/graphics/Path;

    .line 28
    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->g:F

    .line 31
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->h:Landroid/graphics/Matrix;

    .line 33
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->i:Landroid/graphics/RectF;

    .line 34
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->j:Landroid/graphics/Paint;

    .line 44
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->m:Landroid/text/TextPaint;

    .line 46
    const-string v0, "1"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->n:Ljava/lang/String;

    .line 48
    const/high16 v0, 0x3fc00000    # 1.5f

    iput v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->p:F

    .line 217
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->t:Z

    .line 63
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    .line 64
    invoke-static {p0}, Lcom/roidapp/photogrid/common/bl;->a(Landroid/view/View;)V

    .line 66
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 70
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 24
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->c:Landroid/graphics/Paint;

    .line 25
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->d:Landroid/graphics/Paint;

    .line 26
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->e:Landroid/graphics/RectF;

    .line 27
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->f:Landroid/graphics/Path;

    .line 28
    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->g:F

    .line 31
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->h:Landroid/graphics/Matrix;

    .line 33
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->i:Landroid/graphics/RectF;

    .line 34
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->j:Landroid/graphics/Paint;

    .line 44
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->m:Landroid/text/TextPaint;

    .line 46
    const-string v0, "1"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->n:Ljava/lang/String;

    .line 48
    const/high16 v0, 0x3fc00000    # 1.5f

    iput v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->p:F

    .line 217
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->t:Z

    .line 71
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    .line 72
    invoke-static {p0}, Lcom/roidapp/photogrid/common/bl;->a(Landroid/view/View;)V

    .line 74
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 210
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->e:Landroid/graphics/RectF;

    iget v1, p0, Lcom/roidapp/photogrid/release/ProgressView;->b:I

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/photogrid/release/ProgressView;->g:F

    sub-float/2addr v1, v2

    int-to-float v2, p1

    iget v3, p0, Lcom/roidapp/photogrid/release/ProgressView;->q:F

    mul-float/2addr v2, v3

    iget v3, p0, Lcom/roidapp/photogrid/release/ProgressView;->b:I

    int-to-float v3, v3

    invoke-virtual {v0, v4, v1, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 213
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->h:Landroid/graphics/Matrix;

    iget v1, p0, Lcom/roidapp/photogrid/release/ProgressView;->q:F

    invoke-virtual {v0, v1, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 215
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ProgressView;->invalidate()V

    .line 216
    return-void
.end method

.method public final a(II)V
    .locals 5

    .prologue
    .line 85
    iput p1, p0, Lcom/roidapp/photogrid/release/ProgressView;->a:I

    .line 86
    iput p2, p0, Lcom/roidapp/photogrid/release/ProgressView;->b:I

    .line 87
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ProgressView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->p:F

    .line 88
    iget v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->p:F

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->g:F

    .line 90
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->c:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->reset()V

    .line 91
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 92
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->c:Landroid/graphics/Paint;

    iget v1, p0, Lcom/roidapp/photogrid/release/ProgressView;->g:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 93
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->c:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ProgressView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c0085

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 95
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->d:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->reset()V

    .line 96
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 97
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->d:Landroid/graphics/Paint;

    iget v1, p0, Lcom/roidapp/photogrid/release/ProgressView;->g:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 98
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->d:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ProgressView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c0086

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 104
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->j:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 105
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->j:Landroid/graphics/Paint;

    iget v1, p0, Lcom/roidapp/photogrid/release/ProgressView;->g:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 106
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->j:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ProgressView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c0084

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 108
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->i:Landroid/graphics/RectF;

    const/4 v1, 0x0

    iget v2, p0, Lcom/roidapp/photogrid/release/ProgressView;->b:I

    int-to-float v2, v2

    iget v3, p0, Lcom/roidapp/photogrid/release/ProgressView;->g:F

    sub-float/2addr v2, v3

    iget v3, p0, Lcom/roidapp/photogrid/release/ProgressView;->a:I

    int-to-float v3, v3

    iget v4, p0, Lcom/roidapp/photogrid/release/ProgressView;->b:I

    int-to-float v4, v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 142
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->m:Landroid/text/TextPaint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 143
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->m:Landroid/text/TextPaint;

    const/high16 v1, 0x41400000    # 12.0f

    iget v2, p0, Lcom/roidapp/photogrid/release/ProgressView;->p:F

    mul-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 144
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->m:Landroid/text/TextPaint;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ProgressView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c0087

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 147
    return-void
.end method

.method public final a(IIF)V
    .locals 8

    .prologue
    const/4 v5, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v7, 0x40000000    # 2.0f

    const/4 v6, 0x0

    .line 150
    iput p1, p0, Lcom/roidapp/photogrid/release/ProgressView;->r:I

    .line 153
    int-to-float v0, p2

    div-float v0, v4, v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ProgressView;->a:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->q:F

    .line 154
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->h:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 155
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->h:Landroid/graphics/Matrix;

    iget v1, p0, Lcom/roidapp/photogrid/release/ProgressView;->k:F

    neg-float v1, v1

    iget v2, p0, Lcom/roidapp/photogrid/release/ProgressView;->q:F

    add-float/2addr v1, v2

    iget v2, p0, Lcom/roidapp/photogrid/release/ProgressView;->p:F

    mul-float/2addr v2, v7

    add-float/2addr v1, v2

    iget v2, p0, Lcom/roidapp/photogrid/release/ProgressView;->b:I

    int-to-float v2, v2

    iget v3, p0, Lcom/roidapp/photogrid/release/ProgressView;->g:F

    sub-float/2addr v2, v3

    iget v3, p0, Lcom/roidapp/photogrid/release/ProgressView;->l:F

    sub-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 157
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->e:Landroid/graphics/RectF;

    iget v1, p0, Lcom/roidapp/photogrid/release/ProgressView;->b:I

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/photogrid/release/ProgressView;->g:F

    sub-float/2addr v1, v2

    iget v2, p0, Lcom/roidapp/photogrid/release/ProgressView;->b:I

    int-to-float v2, v2

    invoke-virtual {v0, v6, v1, v6, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 158
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/ProgressView;->t:Z

    .line 159
    const-string v0, "1"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->n:Ljava/lang/String;

    .line 161
    iget v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->p:F

    mul-float/2addr v0, v7

    .line 162
    iget v1, p0, Lcom/roidapp/photogrid/release/ProgressView;->a:I

    int-to-float v1, v1

    mul-float/2addr v1, p3

    int-to-float v2, p2

    div-float/2addr v1, v2

    .line 163
    iget v2, p0, Lcom/roidapp/photogrid/release/ProgressView;->a:I

    int-to-float v2, v2

    sub-float v1, v2, v1

    .line 165
    int-to-float v2, p1

    sub-float/2addr v2, v4

    mul-float/2addr v2, v0

    sub-float v2, v1, v2

    int-to-float v3, p1

    div-float/2addr v2, v3

    .line 168
    new-instance v3, Landroid/graphics/DashPathEffect;

    const/4 v4, 0x4

    new-array v4, v4, [F

    aput v6, v4, v5

    const/4 v5, 0x1

    aput v6, v4, v5

    const/4 v5, 0x2

    aput v0, v4, v5

    const/4 v5, 0x3

    aput v2, v4, v5

    invoke-direct {v3, v4, v0}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 169
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ProgressView;->f:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 170
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ProgressView;->f:Landroid/graphics/Path;

    iget v4, p0, Lcom/roidapp/photogrid/release/ProgressView;->b:I

    int-to-float v4, v4

    iget v5, p0, Lcom/roidapp/photogrid/release/ProgressView;->g:F

    div-float/2addr v5, v7

    sub-float/2addr v4, v5

    invoke-virtual {v2, v6, v4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 184
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ProgressView;->f:Landroid/graphics/Path;

    add-float/2addr v0, v1

    iget v1, p0, Lcom/roidapp/photogrid/release/ProgressView;->b:I

    int-to-float v1, v1

    iget v4, p0, Lcom/roidapp/photogrid/release/ProgressView;->g:F

    div-float/2addr v4, v7

    sub-float/2addr v1, v4

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 185
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 187
    const/high16 v0, 0x40b00000    # 5.5f

    iget v1, p0, Lcom/roidapp/photogrid/release/ProgressView;->p:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->o:F

    .line 191
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 309
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/ProgressView;->s:Z

    .line 310
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .prologue
    .line 260
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->i:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ProgressView;->j:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 264
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->e:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ProgressView;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 269
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->s:Z

    if-eqz v0, :cond_0

    .line 270
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ProgressView;->f:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ProgressView;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 301
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 302
    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .prologue
    .line 80
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 81
    return-void
.end method

.class public Lcom/arist/model/skin/ColorPickerView;
.super Landroid/view/View;


# instance fields
.field private A:I

.field private B:F

.field private C:Landroid/graphics/RectF;

.field private D:Landroid/graphics/RectF;

.field private E:Landroid/graphics/RectF;

.field private F:Landroid/graphics/RectF;

.field private G:Lcom/arist/model/skin/a;

.field private H:Landroid/graphics/Point;

.field private a:F

.field private b:F

.field private c:F

.field private d:F

.field private e:F

.field private f:F

.field private g:Lcom/arist/model/skin/k;

.field private h:Landroid/graphics/Paint;

.field private i:Landroid/graphics/Paint;

.field private j:Landroid/graphics/Paint;

.field private k:Landroid/graphics/Paint;

.field private l:Landroid/graphics/Paint;

.field private m:Landroid/graphics/Paint;

.field private n:Landroid/graphics/Paint;

.field private o:Landroid/graphics/Shader;

.field private p:Landroid/graphics/Shader;

.field private q:Landroid/graphics/Shader;

.field private r:Landroid/graphics/Shader;

.field private s:I

.field private t:F

.field private u:F

.field private v:F

.field private w:Ljava/lang/String;

.field private x:I

.field private y:I

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/arist/model/skin/ColorPickerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/arist/model/skin/ColorPickerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    const v5, -0xe3e3e4

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    const/high16 v2, 0x40000000    # 2.0f

    const/4 v3, 0x1

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 v0, 0x41f00000    # 30.0f

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->a:F

    const/high16 v0, 0x41a00000    # 20.0f

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->b:F

    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->c:F

    const/high16 v0, 0x40a00000    # 5.0f

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->d:F

    iput v2, p0, Lcom/arist/model/skin/ColorPickerView;->e:F

    iput v4, p0, Lcom/arist/model/skin/ColorPickerView;->f:F

    const/16 v0, 0xff

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->s:I

    const/high16 v0, 0x43b40000    # 360.0f

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->t:F

    iput v1, p0, Lcom/arist/model/skin/ColorPickerView;->u:F

    iput v1, p0, Lcom/arist/model/skin/ColorPickerView;->v:F

    const-string v0, ""

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->w:Ljava/lang/String;

    iput v5, p0, Lcom/arist/model/skin/ColorPickerView;->x:I

    const v0, -0x919192

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->y:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/model/skin/ColorPickerView;->z:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->A:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->H:Landroid/graphics/Point;

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->f:F

    iget v0, p0, Lcom/arist/model/skin/ColorPickerView;->d:F

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->f:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->d:F

    iget v0, p0, Lcom/arist/model/skin/ColorPickerView;->e:F

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->f:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->e:F

    iget v0, p0, Lcom/arist/model/skin/ColorPickerView;->a:F

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->f:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->a:F

    iget v0, p0, Lcom/arist/model/skin/ColorPickerView;->b:F

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->f:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->b:F

    iget v0, p0, Lcom/arist/model/skin/ColorPickerView;->c:F

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->f:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->c:F

    iget v0, p0, Lcom/arist/model/skin/ColorPickerView;->d:F

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->e:F

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->f:F

    mul-float/2addr v1, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const/high16 v1, 0x3fc00000    # 1.5f

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->B:F

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->h:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->i:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->j:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->k:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->l:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->m:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->n:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->i:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->i:Landroid/graphics/Paint;

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->f:F

    mul-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->i:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->k:Landroid/graphics/Paint;

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->x:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->k:Landroid/graphics/Paint;

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->f:F

    mul-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->k:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->m:Landroid/graphics/Paint;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->m:Landroid/graphics/Paint;

    const/high16 v1, 0x41600000    # 14.0f

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->f:F

    mul-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->m:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->m:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->m:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    invoke-virtual {p0, v3}, Lcom/arist/model/skin/ColorPickerView;->setFocusable(Z)V

    invoke-virtual {p0, v3}, Lcom/arist/model/skin/ColorPickerView;->setFocusableInTouchMode(Z)V

    return-void
.end method

.method private a(Landroid/view/MotionEvent;)Z
    .locals 11

    const/high16 v8, 0x43b40000    # 360.0f

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerView;->H:Landroid/graphics/Point;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v4

    :cond_1
    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerView;->H:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    iget-object v2, p0, Lcom/arist/model/skin/ColorPickerView;->H:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    iget-object v3, p0, Lcom/arist/model/skin/ColorPickerView;->E:Landroid/graphics/RectF;

    int-to-float v6, v1

    int-to-float v7, v2

    invoke-virtual {v3, v6, v7}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v3

    if-eqz v3, :cond_4

    iput v5, p0, Lcom/arist/model/skin/ColorPickerView;->A:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iget-object v3, p0, Lcom/arist/model/skin/ColorPickerView;->E:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v1

    iget v4, v3, Landroid/graphics/RectF;->top:F

    cmpg-float v4, v2, v4

    if-gez v4, :cond_2

    :goto_1
    mul-float/2addr v0, v8

    div-float/2addr v0, v1

    sub-float v0, v8, v0

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->t:F

    move v4, v5

    goto :goto_0

    :cond_2
    iget v0, v3, Landroid/graphics/RectF;->bottom:F

    cmpl-float v0, v2, v0

    if-lez v0, :cond_3

    move v0, v1

    goto :goto_1

    :cond_3
    iget v0, v3, Landroid/graphics/RectF;->top:F

    sub-float v0, v2, v0

    goto :goto_1

    :cond_4
    iget-object v3, p0, Lcom/arist/model/skin/ColorPickerView;->D:Landroid/graphics/RectF;

    int-to-float v6, v1

    int-to-float v7, v2

    invoke-virtual {v3, v6, v7}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v3

    if-eqz v3, :cond_9

    iput v4, p0, Lcom/arist/model/skin/ColorPickerView;->A:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    iget-object v7, p0, Lcom/arist/model/skin/ColorPickerView;->D:Landroid/graphics/RectF;

    const/4 v2, 0x2

    new-array v8, v2, [F

    invoke-virtual {v7}, Landroid/graphics/RectF;->width()F

    move-result v2

    invoke-virtual {v7}, Landroid/graphics/RectF;->height()F

    move-result v3

    iget v9, v7, Landroid/graphics/RectF;->left:F

    cmpg-float v9, v1, v9

    if-gez v9, :cond_5

    move v1, v0

    :goto_2
    iget v9, v7, Landroid/graphics/RectF;->top:F

    cmpg-float v9, v6, v9

    if-gez v9, :cond_7

    :goto_3
    div-float v2, v10, v2

    mul-float/2addr v1, v2

    aput v1, v8, v4

    div-float v1, v10, v3

    mul-float/2addr v0, v1

    sub-float v0, v10, v0

    aput v0, v8, v5

    aget v0, v8, v4

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->u:F

    aget v0, v8, v5

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->v:F

    move v4, v5

    goto :goto_0

    :cond_5
    iget v9, v7, Landroid/graphics/RectF;->right:F

    cmpl-float v9, v1, v9

    if-lez v9, :cond_6

    move v1, v2

    goto :goto_2

    :cond_6
    iget v9, v7, Landroid/graphics/RectF;->left:F

    sub-float/2addr v1, v9

    goto :goto_2

    :cond_7
    iget v0, v7, Landroid/graphics/RectF;->bottom:F

    cmpl-float v0, v6, v0

    if-lez v0, :cond_8

    move v0, v3

    goto :goto_3

    :cond_8
    iget v0, v7, Landroid/graphics/RectF;->top:F

    sub-float v0, v6, v0

    goto :goto_3

    :cond_9
    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->F:Landroid/graphics/RectF;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->F:Landroid/graphics/RectF;

    int-to-float v1, v1

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->A:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    iget-object v2, p0, Lcom/arist/model/skin/ColorPickerView;->F:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v1

    float-to-int v1, v1

    int-to-float v3, v0

    iget v6, v2, Landroid/graphics/RectF;->left:F

    cmpg-float v3, v3, v6

    if-gez v3, :cond_a

    move v0, v4

    :goto_4
    mul-int/lit16 v0, v0, 0xff

    div-int/2addr v0, v1

    rsub-int v0, v0, 0xff

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->s:I

    move v4, v5

    goto/16 :goto_0

    :cond_a
    int-to-float v3, v0

    iget v4, v2, Landroid/graphics/RectF;->right:F

    cmpl-float v3, v3, v4

    if-lez v3, :cond_b

    move v0, v1

    goto :goto_4

    :cond_b
    iget v2, v2, Landroid/graphics/RectF;->left:F

    float-to-int v2, v2

    sub-int/2addr v0, v2

    goto :goto_4
.end method

.method private static e()[I
    .locals 7

    const/4 v2, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    const/16 v0, 0x169

    new-array v3, v0, [I

    array-length v0, v3

    add-int/lit8 v0, v0, -0x1

    move v1, v2

    :goto_0
    if-gez v0, :cond_0

    return-object v3

    :cond_0
    const/4 v4, 0x3

    new-array v4, v4, [F

    int-to-float v5, v0

    aput v5, v4, v2

    const/4 v5, 0x1

    aput v6, v4, v5

    const/4 v5, 0x2

    aput v6, v4, v5

    invoke-static {v4}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v4

    aput v4, v3, v1

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method private f()I
    .locals 3

    const/high16 v0, 0x43480000    # 200.0f

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->f:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iget-boolean v1, p0, Lcom/arist/model/skin/ColorPickerView;->z:Z

    if-eqz v1, :cond_0

    int-to-float v0, v0

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->c:F

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->b:F

    add-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-int v0, v0

    :cond_0
    return v0
.end method


# virtual methods
.method public final a()I
    .locals 4

    iget v0, p0, Lcom/arist/model/skin/ColorPickerView;->s:I

    const/4 v1, 0x3

    new-array v1, v1, [F

    const/4 v2, 0x0

    iget v3, p0, Lcom/arist/model/skin/ColorPickerView;->t:F

    aput v3, v1, v2

    const/4 v2, 0x1

    iget v3, p0, Lcom/arist/model/skin/ColorPickerView;->u:F

    aput v3, v1, v2

    const/4 v2, 0x2

    iget v3, p0, Lcom/arist/model/skin/ColorPickerView;->v:F

    aput v3, v1, v2

    invoke-static {v0, v1}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result v0

    return v0
.end method

.method public final a(I)V
    .locals 7

    const/4 v2, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    new-array v1, v2, [F

    invoke-static {p1, v1}, Landroid/graphics/Color;->colorToHSV(I[F)V

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->s:I

    aget v0, v1, v4

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->t:F

    aget v0, v1, v5

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->u:F

    aget v0, v1, v6

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->v:F

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->g:Lcom/arist/model/skin/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->g:Lcom/arist/model/skin/k;

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->s:I

    new-array v2, v2, [F

    iget v3, p0, Lcom/arist/model/skin/ColorPickerView;->t:F

    aput v3, v2, v4

    iget v3, p0, Lcom/arist/model/skin/ColorPickerView;->u:F

    aput v3, v2, v5

    iget v3, p0, Lcom/arist/model/skin/ColorPickerView;->v:F

    aput v3, v2, v6

    invoke-static {v1, v2}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/arist/model/skin/k;->a(I)V

    :cond_0
    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerView;->invalidate()V

    return-void
.end method

.method public final a(Lcom/arist/model/skin/k;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/skin/ColorPickerView;->g:Lcom/arist/model/skin/k;

    return-void
.end method

.method public final b()F
    .locals 1

    iget v0, p0, Lcom/arist/model/skin/ColorPickerView;->B:F

    return v0
.end method

.method public final c()V
    .locals 3

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-boolean v0, p0, Lcom/arist/model/skin/ColorPickerView;->z:Z

    if-eq v0, v2, :cond_0

    iput-boolean v2, p0, Lcom/arist/model/skin/ColorPickerView;->z:Z

    iput-object v1, p0, Lcom/arist/model/skin/ColorPickerView;->o:Landroid/graphics/Shader;

    iput-object v1, p0, Lcom/arist/model/skin/ColorPickerView;->p:Landroid/graphics/Shader;

    iput-object v1, p0, Lcom/arist/model/skin/ColorPickerView;->q:Landroid/graphics/Shader;

    iput-object v1, p0, Lcom/arist/model/skin/ColorPickerView;->r:Landroid/graphics/Shader;

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerView;->requestLayout()V

    :cond_0
    return-void
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/arist/model/skin/ColorPickerView;->z:Z

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    const/4 v1, 0x0

    const/4 v12, 0x0

    const/high16 v11, 0x40800000    # 4.0f

    const/high16 v10, 0x40000000    # 2.0f

    const/high16 v9, 0x3f800000    # 1.0f

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->C:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    cmpg-float v0, v0, v1

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->C:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v8, p0, Lcom/arist/model/skin/ColorPickerView;->D:Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->n:Landroid/graphics/Paint;

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->y:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->C:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->C:Landroid/graphics/RectF;

    iget v2, v0, Landroid/graphics/RectF;->top:F

    iget v0, v8, Landroid/graphics/RectF;->right:F

    add-float v3, v0, v9

    iget v0, v8, Landroid/graphics/RectF;->bottom:F

    add-float v4, v0, v9

    iget-object v5, p0, Lcom/arist/model/skin/ColorPickerView;->n:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->o:Landroid/graphics/Shader;

    if-nez v0, :cond_2

    new-instance v0, Landroid/graphics/LinearGradient;

    iget v1, v8, Landroid/graphics/RectF;->left:F

    iget v2, v8, Landroid/graphics/RectF;->top:F

    iget v3, v8, Landroid/graphics/RectF;->left:F

    iget v4, v8, Landroid/graphics/RectF;->bottom:F

    const/4 v5, -0x1

    const/high16 v6, -0x1000000

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->o:Landroid/graphics/Shader;

    :cond_2
    const/4 v0, 0x3

    new-array v0, v0, [F

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->t:F

    aput v1, v0, v12

    const/4 v1, 0x1

    aput v9, v0, v1

    const/4 v1, 0x2

    aput v9, v0, v1

    invoke-static {v0}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v6

    new-instance v0, Landroid/graphics/LinearGradient;

    iget v1, v8, Landroid/graphics/RectF;->left:F

    iget v2, v8, Landroid/graphics/RectF;->top:F

    iget v3, v8, Landroid/graphics/RectF;->right:F

    iget v4, v8, Landroid/graphics/RectF;->top:F

    const/4 v5, -0x1

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->p:Landroid/graphics/Shader;

    new-instance v0, Landroid/graphics/ComposeShader;

    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerView;->o:Landroid/graphics/Shader;

    iget-object v2, p0, Lcom/arist/model/skin/ColorPickerView;->p:Landroid/graphics/Shader;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1, v2, v3}, Landroid/graphics/ComposeShader;-><init>(Landroid/graphics/Shader;Landroid/graphics/Shader;Landroid/graphics/PorterDuff$Mode;)V

    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerView;->h:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v8, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget v0, p0, Lcom/arist/model/skin/ColorPickerView;->u:F

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->v:F

    iget-object v2, p0, Lcom/arist/model/skin/ColorPickerView;->D:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v3

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v4

    new-instance v5, Landroid/graphics/Point;

    invoke-direct {v5}, Landroid/graphics/Point;-><init>()V

    mul-float/2addr v0, v4

    iget v4, v2, Landroid/graphics/RectF;->left:F

    add-float/2addr v0, v4

    float-to-int v0, v0

    iput v0, v5, Landroid/graphics/Point;->x:I

    sub-float v0, v9, v1

    mul-float/2addr v0, v3

    iget v1, v2, Landroid/graphics/RectF;->top:F

    add-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, v5, Landroid/graphics/Point;->y:I

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->i:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v0, v5, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, v5, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->d:F

    iget v3, p0, Lcom/arist/model/skin/ColorPickerView;->f:F

    mul-float/2addr v3, v9

    sub-float/2addr v2, v3

    iget-object v3, p0, Lcom/arist/model/skin/ColorPickerView;->i:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->i:Landroid/graphics/Paint;

    const v1, -0x222223

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v0, v5, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, v5, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->d:F

    iget-object v3, p0, Lcom/arist/model/skin/ColorPickerView;->i:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v8, p0, Lcom/arist/model/skin/ColorPickerView;->E:Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->n:Landroid/graphics/Paint;

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->y:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v0, v8, Landroid/graphics/RectF;->left:F

    sub-float v1, v0, v9

    iget v0, v8, Landroid/graphics/RectF;->top:F

    sub-float v2, v0, v9

    iget v0, v8, Landroid/graphics/RectF;->right:F

    add-float v3, v0, v9

    iget v0, v8, Landroid/graphics/RectF;->bottom:F

    add-float v4, v0, v9

    iget-object v5, p0, Lcom/arist/model/skin/ColorPickerView;->n:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->q:Landroid/graphics/Shader;

    if-nez v0, :cond_3

    new-instance v0, Landroid/graphics/LinearGradient;

    iget v1, v8, Landroid/graphics/RectF;->left:F

    iget v2, v8, Landroid/graphics/RectF;->top:F

    iget v3, v8, Landroid/graphics/RectF;->left:F

    iget v4, v8, Landroid/graphics/RectF;->bottom:F

    invoke-static {}, Lcom/arist/model/skin/ColorPickerView;->e()[I

    move-result-object v5

    const/4 v6, 0x0

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->q:Landroid/graphics/Shader;

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->j:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerView;->q:Landroid/graphics/Shader;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    :cond_3
    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->j:Landroid/graphics/Paint;

    invoke-virtual {p1, v8, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget v0, p0, Lcom/arist/model/skin/ColorPickerView;->f:F

    mul-float/2addr v0, v11

    div-float/2addr v0, v10

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->t:F

    iget-object v2, p0, Lcom/arist/model/skin/ColorPickerView;->E:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v3

    new-instance v4, Landroid/graphics/Point;

    invoke-direct {v4}, Landroid/graphics/Point;-><init>()V

    mul-float/2addr v1, v3

    const/high16 v5, 0x43b40000    # 360.0f

    div-float/2addr v1, v5

    sub-float v1, v3, v1

    iget v3, v2, Landroid/graphics/RectF;->top:F

    add-float/2addr v1, v3

    float-to-int v1, v1

    iput v1, v4, Landroid/graphics/Point;->y:I

    iget v1, v2, Landroid/graphics/RectF;->left:F

    float-to-int v1, v1

    iput v1, v4, Landroid/graphics/Point;->x:I

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iget v2, v8, Landroid/graphics/RectF;->left:F

    iget v3, p0, Lcom/arist/model/skin/ColorPickerView;->e:F

    sub-float/2addr v2, v3

    iput v2, v1, Landroid/graphics/RectF;->left:F

    iget v2, v8, Landroid/graphics/RectF;->right:F

    iget v3, p0, Lcom/arist/model/skin/ColorPickerView;->e:F

    add-float/2addr v2, v3

    iput v2, v1, Landroid/graphics/RectF;->right:F

    iget v2, v4, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    sub-float/2addr v2, v0

    iput v2, v1, Landroid/graphics/RectF;->top:F

    iget v2, v4, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    add-float/2addr v0, v2

    iput v0, v1, Landroid/graphics/RectF;->bottom:F

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v10, v10, v0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget-boolean v0, p0, Lcom/arist/model/skin/ColorPickerView;->z:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->F:Landroid/graphics/RectF;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->G:Lcom/arist/model/skin/a;

    if-eqz v0, :cond_0

    iget-object v8, p0, Lcom/arist/model/skin/ColorPickerView;->F:Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->n:Landroid/graphics/Paint;

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->y:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v0, v8, Landroid/graphics/RectF;->left:F

    sub-float v1, v0, v9

    iget v0, v8, Landroid/graphics/RectF;->top:F

    sub-float v2, v0, v9

    iget v0, v8, Landroid/graphics/RectF;->right:F

    add-float v3, v0, v9

    iget v0, v8, Landroid/graphics/RectF;->bottom:F

    add-float v4, v0, v9

    iget-object v5, p0, Lcom/arist/model/skin/ColorPickerView;->n:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->G:Lcom/arist/model/skin/a;

    invoke-virtual {v0, p1}, Lcom/arist/model/skin/a;->draw(Landroid/graphics/Canvas;)V

    const/4 v0, 0x3

    new-array v0, v0, [F

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->t:F

    aput v1, v0, v12

    const/4 v1, 0x1

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->u:F

    aput v2, v0, v1

    const/4 v1, 0x2

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->v:F

    aput v2, v0, v1

    invoke-static {v0}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v5

    invoke-static {v12, v0}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result v6

    new-instance v0, Landroid/graphics/LinearGradient;

    iget v1, v8, Landroid/graphics/RectF;->left:F

    iget v2, v8, Landroid/graphics/RectF;->top:F

    iget v3, v8, Landroid/graphics/RectF;->right:F

    iget v4, v8, Landroid/graphics/RectF;->top:F

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->r:Landroid/graphics/Shader;

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->l:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerView;->r:Landroid/graphics/Shader;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->l:Landroid/graphics/Paint;

    invoke-virtual {p1, v8, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->w:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->w:Ljava/lang/String;

    const-string v1, ""

    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->w:Ljava/lang/String;

    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    invoke-virtual {v8}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    iget v3, p0, Lcom/arist/model/skin/ColorPickerView;->f:F

    mul-float/2addr v3, v11

    add-float/2addr v2, v3

    iget-object v3, p0, Lcom/arist/model/skin/ColorPickerView;->m:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_4
    iget v0, p0, Lcom/arist/model/skin/ColorPickerView;->f:F

    mul-float/2addr v0, v11

    div-float/2addr v0, v10

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->s:I

    iget-object v2, p0, Lcom/arist/model/skin/ColorPickerView;->F:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v3

    new-instance v4, Landroid/graphics/Point;

    invoke-direct {v4}, Landroid/graphics/Point;-><init>()V

    int-to-float v1, v1

    mul-float/2addr v1, v3

    const/high16 v5, 0x437f0000    # 255.0f

    div-float/2addr v1, v5

    sub-float v1, v3, v1

    iget v3, v2, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v3

    float-to-int v1, v1

    iput v1, v4, Landroid/graphics/Point;->x:I

    iget v1, v2, Landroid/graphics/RectF;->top:F

    float-to-int v1, v1

    iput v1, v4, Landroid/graphics/Point;->y:I

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iget v2, v4, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    sub-float/2addr v2, v0

    iput v2, v1, Landroid/graphics/RectF;->left:F

    iget v2, v4, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    add-float/2addr v0, v2

    iput v0, v1, Landroid/graphics/RectF;->right:F

    iget v0, v8, Landroid/graphics/RectF;->top:F

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->e:F

    sub-float/2addr v0, v2

    iput v0, v1, Landroid/graphics/RectF;->top:F

    iget v0, v8, Landroid/graphics/RectF;->bottom:F

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->e:F

    add-float/2addr v0, v2

    iput v0, v1, Landroid/graphics/RectF;->bottom:F

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v10, v10, v0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto/16 :goto_0
.end method

.method protected onMeasure(II)V
    .locals 7

    const/high16 v6, 0x40000000    # 2.0f

    const/high16 v5, -0x80000000

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    if-eq v0, v5, :cond_0

    if-ne v0, v6, :cond_4

    :cond_0
    :goto_0
    if-eq v3, v5, :cond_1

    if-ne v3, v6, :cond_6

    :cond_1
    move v0, v1

    :goto_1
    iget-boolean v1, p0, Lcom/arist/model/skin/ColorPickerView;->z:Z

    if-nez v1, :cond_8

    int-to-float v1, v2

    iget v3, p0, Lcom/arist/model/skin/ColorPickerView;->c:F

    sub-float/2addr v1, v3

    iget v3, p0, Lcom/arist/model/skin/ColorPickerView;->a:F

    sub-float/2addr v1, v3

    float-to-int v1, v1

    if-gt v1, v0, :cond_2

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerView;->getTag()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "landscape"

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_2
    int-to-float v1, v0

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->c:F

    add-float/2addr v1, v2

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->a:F

    add-float/2addr v1, v2

    float-to-int v1, v1

    :cond_3
    :goto_2
    invoke-virtual {p0, v1, v0}, Lcom/arist/model/skin/ColorPickerView;->setMeasuredDimension(II)V

    return-void

    :cond_4
    invoke-direct {p0}, Lcom/arist/model/skin/ColorPickerView;->f()I

    move-result v0

    iget-boolean v2, p0, Lcom/arist/model/skin/ColorPickerView;->z:Z

    if-eqz v2, :cond_5

    int-to-float v0, v0

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->c:F

    iget v4, p0, Lcom/arist/model/skin/ColorPickerView;->b:F

    add-float/2addr v2, v4

    sub-float/2addr v0, v2

    float-to-int v0, v0

    :cond_5
    int-to-float v0, v0

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->a:F

    add-float/2addr v0, v2

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->c:F

    add-float/2addr v0, v2

    float-to-int v2, v0

    goto :goto_0

    :cond_6
    invoke-direct {p0}, Lcom/arist/model/skin/ColorPickerView;->f()I

    move-result v0

    goto :goto_1

    :cond_7
    move v0, v1

    move v1, v2

    goto :goto_2

    :cond_8
    int-to-float v1, v0

    iget v3, p0, Lcom/arist/model/skin/ColorPickerView;->b:F

    sub-float/2addr v1, v3

    iget v3, p0, Lcom/arist/model/skin/ColorPickerView;->a:F

    add-float/2addr v1, v3

    float-to-int v1, v1

    if-le v1, v2, :cond_3

    int-to-float v0, v2

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->a:F

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->b:F

    add-float/2addr v0, v1

    float-to-int v0, v0

    move v1, v2

    goto :goto_2
.end method

.method protected onSizeChanged(IIII)V
    .locals 7

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->C:Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->C:Landroid/graphics/RectF;

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->B:F

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerView;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->left:F

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->C:Landroid/graphics/RectF;

    int-to-float v1, p1

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->B:F

    sub-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerView;->getPaddingRight()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->right:F

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->C:Landroid/graphics/RectF;

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->B:F

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerView;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->top:F

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->C:Landroid/graphics/RectF;

    int-to-float v1, p2

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->B:F

    sub-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerView;->getPaddingBottom()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerView;->C:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v0

    const/high16 v2, 0x40000000    # 2.0f

    sub-float/2addr v0, v2

    iget-boolean v2, p0, Lcom/arist/model/skin/ColorPickerView;->z:Z

    if-eqz v2, :cond_0

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->c:F

    iget v3, p0, Lcom/arist/model/skin/ColorPickerView;->b:F

    add-float/2addr v2, v3

    sub-float/2addr v0, v2

    :cond_0
    iget v2, v1, Landroid/graphics/RectF;->left:F

    add-float/2addr v2, v6

    iget v1, v1, Landroid/graphics/RectF;->top:F

    add-float/2addr v1, v6

    add-float v3, v1, v0

    add-float/2addr v0, v2

    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4, v2, v1, v0, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v4, p0, Lcom/arist/model/skin/ColorPickerView;->D:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerView;->C:Landroid/graphics/RectF;

    iget v0, v1, Landroid/graphics/RectF;->right:F

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->a:F

    sub-float/2addr v0, v2

    add-float v2, v0, v6

    iget v0, v1, Landroid/graphics/RectF;->top:F

    add-float v3, v0, v6

    iget v0, v1, Landroid/graphics/RectF;->bottom:F

    sub-float v4, v0, v6

    iget-boolean v0, p0, Lcom/arist/model/skin/ColorPickerView;->z:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/arist/model/skin/ColorPickerView;->c:F

    iget v5, p0, Lcom/arist/model/skin/ColorPickerView;->b:F

    add-float/2addr v0, v5

    :goto_0
    sub-float v0, v4, v0

    iget v1, v1, Landroid/graphics/RectF;->right:F

    sub-float/2addr v1, v6

    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4, v2, v3, v1, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v4, p0, Lcom/arist/model/skin/ColorPickerView;->E:Landroid/graphics/RectF;

    iget-boolean v0, p0, Lcom/arist/model/skin/ColorPickerView;->z:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->C:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v6

    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    iget v3, p0, Lcom/arist/model/skin/ColorPickerView;->b:F

    sub-float/2addr v2, v3

    add-float/2addr v2, v6

    iget v3, v0, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v3, v6

    iget v0, v0, Landroid/graphics/RectF;->right:F

    sub-float/2addr v0, v6

    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4, v1, v2, v0, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v4, p0, Lcom/arist/model/skin/ColorPickerView;->F:Landroid/graphics/RectF;

    new-instance v0, Lcom/arist/model/skin/a;

    const/high16 v1, 0x40a00000    # 5.0f

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->f:F

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-direct {v0, v1}, Lcom/arist/model/skin/a;-><init>(I)V

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->G:Lcom/arist/model/skin/a;

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->G:Lcom/arist/model/skin/a;

    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerView;->F:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget-object v2, p0, Lcom/arist/model/skin/ColorPickerView;->F:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget-object v3, p0, Lcom/arist/model/skin/ColorPickerView;->F:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget-object v4, p0, Lcom/arist/model/skin/ColorPickerView;->F:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/arist/model/skin/a;->setBounds(IIII)V

    :cond_1
    return-void

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    move v1, v2

    :goto_0
    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerView;->g:Lcom/arist/model/skin/k;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerView;->g:Lcom/arist/model/skin/k;

    iget v3, p0, Lcom/arist/model/skin/ColorPickerView;->s:I

    const/4 v4, 0x3

    new-array v4, v4, [F

    iget v5, p0, Lcom/arist/model/skin/ColorPickerView;->t:F

    aput v5, v4, v2

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->u:F

    aput v2, v4, v0

    const/4 v2, 0x2

    iget v5, p0, Lcom/arist/model/skin/ColorPickerView;->v:F

    aput v5, v4, v2

    invoke-static {v3, v4}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result v2

    invoke-interface {v1, v2}, Lcom/arist/model/skin/k;->a(I)V

    :cond_0
    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerView;->invalidate()V

    :goto_1
    return v0

    :pswitch_0
    new-instance v1, Landroid/graphics/Point;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    invoke-direct {v1, v3, v4}, Landroid/graphics/Point;-><init>(II)V

    iput-object v1, p0, Lcom/arist/model/skin/ColorPickerView;->H:Landroid/graphics/Point;

    invoke-direct {p0, p1}, Lcom/arist/model/skin/ColorPickerView;->a(Landroid/view/MotionEvent;)Z

    move-result v1

    goto :goto_0

    :pswitch_1
    invoke-direct {p0, p1}, Lcom/arist/model/skin/ColorPickerView;->a(Landroid/view/MotionEvent;)Z

    move-result v1

    goto :goto_0

    :pswitch_2
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/arist/model/skin/ColorPickerView;->H:Landroid/graphics/Point;

    invoke-direct {p0, p1}, Lcom/arist/model/skin/ColorPickerView;->a(Landroid/view/MotionEvent;)Z

    move-result v1

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public onTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    const/high16 v8, 0x41200000    # 10.0f

    const/4 v3, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v4, 0x1

    const/4 v0, 0x0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    const/4 v7, 0x2

    if-ne v5, v7, :cond_0

    iget v5, p0, Lcom/arist/model/skin/ColorPickerView;->A:I

    packed-switch v5, :pswitch_data_0

    :cond_0
    move v0, v3

    :goto_0
    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->g:Lcom/arist/model/skin/k;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->g:Lcom/arist/model/skin/k;

    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->s:I

    const/4 v2, 0x3

    new-array v2, v2, [F

    iget v5, p0, Lcom/arist/model/skin/ColorPickerView;->t:F

    aput v5, v2, v3

    iget v3, p0, Lcom/arist/model/skin/ColorPickerView;->u:F

    aput v3, v2, v4

    const/4 v3, 0x2

    iget v5, p0, Lcom/arist/model/skin/ColorPickerView;->v:F

    aput v5, v2, v3

    invoke-static {v1, v2}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/arist/model/skin/k;->a(I)V

    :cond_1
    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerView;->invalidate()V

    move v0, v4

    :goto_1
    return v0

    :pswitch_0
    iget v5, p0, Lcom/arist/model/skin/ColorPickerView;->u:F

    const/high16 v7, 0x42480000    # 50.0f

    div-float/2addr v2, v7

    add-float/2addr v5, v2

    iget v2, p0, Lcom/arist/model/skin/ColorPickerView;->v:F

    const/high16 v7, 0x42480000    # 50.0f

    div-float/2addr v6, v7

    sub-float/2addr v2, v6

    cmpg-float v6, v5, v0

    if-gez v6, :cond_3

    move v5, v0

    :cond_2
    :goto_2
    cmpg-float v6, v2, v0

    if-gez v6, :cond_4

    :goto_3
    iput v5, p0, Lcom/arist/model/skin/ColorPickerView;->u:F

    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->v:F

    move v0, v4

    goto :goto_0

    :cond_3
    cmpl-float v6, v5, v1

    if-lez v6, :cond_2

    move v5, v1

    goto :goto_2

    :cond_4
    cmpl-float v0, v2, v1

    if-lez v0, :cond_c

    move v0, v1

    goto :goto_3

    :pswitch_1
    iget v1, p0, Lcom/arist/model/skin/ColorPickerView;->t:F

    mul-float v2, v6, v8

    sub-float/2addr v1, v2

    cmpg-float v2, v1, v0

    if-gez v2, :cond_5

    :goto_4
    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->t:F

    move v0, v4

    goto :goto_0

    :cond_5
    const/high16 v0, 0x43b40000    # 360.0f

    cmpl-float v0, v1, v0

    if-lez v0, :cond_b

    const/high16 v0, 0x43b40000    # 360.0f

    goto :goto_4

    :pswitch_2
    iget-boolean v0, p0, Lcom/arist/model/skin/ColorPickerView;->z:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerView;->F:Landroid/graphics/RectF;

    if-nez v0, :cond_7

    :cond_6
    move v0, v3

    goto :goto_0

    :cond_7
    iget v0, p0, Lcom/arist/model/skin/ColorPickerView;->s:I

    int-to-float v0, v0

    mul-float v1, v2, v8

    sub-float/2addr v0, v1

    float-to-int v0, v0

    if-gez v0, :cond_9

    move v0, v3

    :cond_8
    :goto_5
    iput v0, p0, Lcom/arist/model/skin/ColorPickerView;->s:I

    move v0, v4

    goto :goto_0

    :cond_9
    const/16 v1, 0xff

    if-le v0, v1, :cond_8

    const/16 v0, 0xff

    goto :goto_5

    :cond_a
    invoke-super {p0, p1}, Landroid/view/View;->onTrackballEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_1

    :cond_b
    move v0, v1

    goto :goto_4

    :cond_c
    move v0, v2

    goto :goto_3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

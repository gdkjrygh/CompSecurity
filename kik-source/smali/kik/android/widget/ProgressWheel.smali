.class public Lkik/android/widget/ProgressWheel;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/ProgressWheel$a;,
        Lkik/android/widget/ProgressWheel$WheelSavedState;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:I

.field private c:I

.field private d:I

.field private final e:I

.field private final f:I

.field private g:Z

.field private h:D

.field private i:D

.field private j:F

.field private k:Z

.field private l:J

.field private final m:J

.field private n:I

.field private o:I

.field private p:Landroid/graphics/Paint;

.field private q:Landroid/graphics/Paint;

.field private r:Landroid/graphics/RectF;

.field private s:F

.field private t:J

.field private u:Z

.field private v:F

.field private w:F

.field private x:F

.field private y:Z

.field private z:Lkik/android/widget/ProgressWheel$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const-class v0, Lkik/android/widget/ProgressWheel;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkik/android/widget/ProgressWheel;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v1, 0x3

    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 98
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 33
    const/16 v0, 0x1c

    iput v0, p0, Lkik/android/widget/ProgressWheel;->b:I

    .line 34
    iput v1, p0, Lkik/android/widget/ProgressWheel;->c:I

    .line 35
    iput v1, p0, Lkik/android/widget/ProgressWheel;->d:I

    .line 37
    const/16 v0, 0x10

    iput v0, p0, Lkik/android/widget/ProgressWheel;->e:I

    .line 38
    const/16 v0, 0x10e

    iput v0, p0, Lkik/android/widget/ProgressWheel;->f:I

    .line 40
    iput-boolean v3, p0, Lkik/android/widget/ProgressWheel;->g:Z

    .line 42
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkik/android/widget/ProgressWheel;->h:D

    .line 43
    const-wide v0, 0x407cc00000000000L    # 460.0

    iput-wide v0, p0, Lkik/android/widget/ProgressWheel;->i:D

    .line 44
    iput v2, p0, Lkik/android/widget/ProgressWheel;->j:F

    .line 45
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/ProgressWheel;->k:Z

    .line 47
    iput-wide v4, p0, Lkik/android/widget/ProgressWheel;->l:J

    .line 48
    const-wide/16 v0, 0xc8

    iput-wide v0, p0, Lkik/android/widget/ProgressWheel;->m:J

    .line 51
    const/high16 v0, -0x56000000

    iput v0, p0, Lkik/android/widget/ProgressWheel;->n:I

    .line 52
    const v0, 0xffffff

    iput v0, p0, Lkik/android/widget/ProgressWheel;->o:I

    .line 55
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkik/android/widget/ProgressWheel;->p:Landroid/graphics/Paint;

    .line 56
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkik/android/widget/ProgressWheel;->q:Landroid/graphics/Paint;

    .line 59
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lkik/android/widget/ProgressWheel;->r:Landroid/graphics/RectF;

    .line 63
    const/high16 v0, 0x43660000    # 230.0f

    iput v0, p0, Lkik/android/widget/ProgressWheel;->s:F

    .line 66
    iput-wide v4, p0, Lkik/android/widget/ProgressWheel;->t:J

    .line 70
    iput v2, p0, Lkik/android/widget/ProgressWheel;->v:F

    .line 71
    iput v2, p0, Lkik/android/widget/ProgressWheel;->w:F

    .line 72
    iput v2, p0, Lkik/android/widget/ProgressWheel;->x:F

    .line 73
    iput-boolean v3, p0, Lkik/android/widget/ProgressWheel;->y:Z

    .line 99
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .prologue
    const/high16 v6, 0x43b40000    # 360.0f

    const/4 v3, 0x3

    const/4 v2, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 85
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 33
    const/16 v0, 0x1c

    iput v0, p0, Lkik/android/widget/ProgressWheel;->b:I

    .line 34
    iput v3, p0, Lkik/android/widget/ProgressWheel;->c:I

    .line 35
    iput v3, p0, Lkik/android/widget/ProgressWheel;->d:I

    .line 37
    const/16 v0, 0x10

    iput v0, p0, Lkik/android/widget/ProgressWheel;->e:I

    .line 38
    const/16 v0, 0x10e

    iput v0, p0, Lkik/android/widget/ProgressWheel;->f:I

    .line 40
    iput-boolean v4, p0, Lkik/android/widget/ProgressWheel;->g:Z

    .line 42
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkik/android/widget/ProgressWheel;->h:D

    .line 43
    const-wide v0, 0x407cc00000000000L    # 460.0

    iput-wide v0, p0, Lkik/android/widget/ProgressWheel;->i:D

    .line 44
    iput v2, p0, Lkik/android/widget/ProgressWheel;->j:F

    .line 45
    iput-boolean v5, p0, Lkik/android/widget/ProgressWheel;->k:Z

    .line 47
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkik/android/widget/ProgressWheel;->l:J

    .line 48
    const-wide/16 v0, 0xc8

    iput-wide v0, p0, Lkik/android/widget/ProgressWheel;->m:J

    .line 51
    const/high16 v0, -0x56000000

    iput v0, p0, Lkik/android/widget/ProgressWheel;->n:I

    .line 52
    const v0, 0xffffff

    iput v0, p0, Lkik/android/widget/ProgressWheel;->o:I

    .line 55
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkik/android/widget/ProgressWheel;->p:Landroid/graphics/Paint;

    .line 56
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkik/android/widget/ProgressWheel;->q:Landroid/graphics/Paint;

    .line 59
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lkik/android/widget/ProgressWheel;->r:Landroid/graphics/RectF;

    .line 63
    const/high16 v0, 0x43660000    # 230.0f

    iput v0, p0, Lkik/android/widget/ProgressWheel;->s:F

    .line 66
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkik/android/widget/ProgressWheel;->t:J

    .line 70
    iput v2, p0, Lkik/android/widget/ProgressWheel;->v:F

    .line 71
    iput v2, p0, Lkik/android/widget/ProgressWheel;->w:F

    .line 72
    iput v2, p0, Lkik/android/widget/ProgressWheel;->x:F

    .line 73
    iput-boolean v4, p0, Lkik/android/widget/ProgressWheel;->y:Z

    .line 87
    sget-object v0, Lkik/android/ag$b;->n:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/widget/ProgressWheel;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v2, p0, Lkik/android/widget/ProgressWheel;->c:I

    int-to-float v2, v2

    invoke-static {v5, v2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    float-to-int v2, v2

    iput v2, p0, Lkik/android/widget/ProgressWheel;->c:I

    iget v2, p0, Lkik/android/widget/ProgressWheel;->d:I

    int-to-float v2, v2

    invoke-static {v5, v2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    float-to-int v2, v2

    iput v2, p0, Lkik/android/widget/ProgressWheel;->d:I

    iget v2, p0, Lkik/android/widget/ProgressWheel;->b:I

    int-to-float v2, v2

    invoke-static {v5, v2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lkik/android/widget/ProgressWheel;->b:I

    const/4 v1, 0x6

    iget v2, p0, Lkik/android/widget/ProgressWheel;->b:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lkik/android/widget/ProgressWheel;->b:I

    const/4 v1, 0x7

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lkik/android/widget/ProgressWheel;->g:Z

    const/16 v1, 0x8

    iget v2, p0, Lkik/android/widget/ProgressWheel;->c:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lkik/android/widget/ProgressWheel;->c:I

    iget v1, p0, Lkik/android/widget/ProgressWheel;->d:I

    int-to-float v1, v1

    invoke-virtual {v0, v3, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lkik/android/widget/ProgressWheel;->d:I

    const/4 v1, 0x4

    iget v2, p0, Lkik/android/widget/ProgressWheel;->s:F

    div-float/2addr v2, v6

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    mul-float/2addr v1, v6

    iput v1, p0, Lkik/android/widget/ProgressWheel;->s:F

    const/4 v1, 0x5

    iget-wide v2, p0, Lkik/android/widget/ProgressWheel;->i:D

    double-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    int-to-double v2, v1

    iput-wide v2, p0, Lkik/android/widget/ProgressWheel;->i:D

    iget v1, p0, Lkik/android/widget/ProgressWheel;->n:I

    invoke-virtual {v0, v5, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lkik/android/widget/ProgressWheel;->n:I

    const/4 v1, 0x2

    iget v2, p0, Lkik/android/widget/ProgressWheel;->o:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lkik/android/widget/ProgressWheel;->o:I

    const/16 v1, 0x9

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lkik/android/widget/ProgressWheel;->u:Z

    invoke-virtual {v0, v4, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lkik/android/widget/ProgressWheel;->t:J

    iput-boolean v5, p0, Lkik/android/widget/ProgressWheel;->y:Z

    invoke-virtual {p0}, Lkik/android/widget/ProgressWheel;->invalidate()V

    :cond_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 89
    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 428
    iget-object v0, p0, Lkik/android/widget/ProgressWheel;->z:Lkik/android/widget/ProgressWheel$a;

    if-eqz v0, :cond_0

    .line 429
    iget v0, p0, Lkik/android/widget/ProgressWheel;->w:F

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x43b40000    # 360.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 430
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 400
    iput v0, p0, Lkik/android/widget/ProgressWheel;->w:F

    .line 401
    iput v0, p0, Lkik/android/widget/ProgressWheel;->x:F

    .line 402
    invoke-virtual {p0}, Lkik/android/widget/ProgressWheel;->invalidate()V

    .line 403
    return-void
.end method

.method public final a(F)V
    .locals 4

    .prologue
    const/high16 v3, 0x43b40000    # 360.0f

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    .line 442
    iget-boolean v1, p0, Lkik/android/widget/ProgressWheel;->y:Z

    if-eqz v1, :cond_0

    .line 443
    iput v0, p0, Lkik/android/widget/ProgressWheel;->w:F

    .line 444
    const/4 v1, 0x0

    iput-boolean v1, p0, Lkik/android/widget/ProgressWheel;->y:Z

    .line 446
    invoke-direct {p0}, Lkik/android/widget/ProgressWheel;->d()V

    .line 449
    :cond_0
    cmpl-float v1, p1, v2

    if-lez v1, :cond_2

    .line 450
    sub-float/2addr p1, v2

    .line 456
    :cond_1
    :goto_0
    iget v0, p0, Lkik/android/widget/ProgressWheel;->x:F

    cmpl-float v0, p1, v0

    if-nez v0, :cond_3

    .line 470
    :goto_1
    return-void

    .line 452
    :cond_2
    cmpg-float v1, p1, v0

    if-gez v1, :cond_1

    move p1, v0

    .line 453
    goto :goto_0

    .line 463
    :cond_3
    iget v0, p0, Lkik/android/widget/ProgressWheel;->w:F

    iget v1, p0, Lkik/android/widget/ProgressWheel;->x:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_4

    .line 464
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/widget/ProgressWheel;->t:J

    .line 467
    :cond_4
    mul-float v0, p1, v3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lkik/android/widget/ProgressWheel;->x:F

    .line 469
    invoke-virtual {p0}, Lkik/android/widget/ProgressWheel;->invalidate()V

    goto :goto_1
.end method

.method public final b()F
    .locals 2

    .prologue
    .line 560
    iget-boolean v0, p0, Lkik/android/widget/ProgressWheel;->y:Z

    if-eqz v0, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lkik/android/widget/ProgressWheel;->w:F

    const/high16 v1, 0x43b40000    # 360.0f

    div-float/2addr v0, v1

    goto :goto_0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 681
    const v0, 0x42efc290    # 119.880005f

    iput v0, p0, Lkik/android/widget/ProgressWheel;->s:F

    .line 682
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .prologue
    const/high16 v12, 0x437e0000    # 254.0f

    const/high16 v11, 0x42b40000    # 90.0f

    const/high16 v10, 0x40000000    # 2.0f

    const/4 v4, 0x0

    const/high16 v2, 0x43b40000    # 360.0f

    .line 273
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 275
    iget-object v1, p0, Lkik/android/widget/ProgressWheel;->r:Landroid/graphics/RectF;

    iget-object v5, p0, Lkik/android/widget/ProgressWheel;->q:Landroid/graphics/Paint;

    move-object v0, p1

    move v3, v2

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 277
    iget-boolean v0, p0, Lkik/android/widget/ProgressWheel;->y:Z

    if-eqz v0, :cond_2

    .line 281
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v6, p0, Lkik/android/widget/ProgressWheel;->t:J

    sub-long/2addr v0, v6

    .line 284
    long-to-float v0, v0

    iget v1, p0, Lkik/android/widget/ProgressWheel;->s:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    .line 286
    iget v1, p0, Lkik/android/widget/ProgressWheel;->w:F

    add-float/2addr v0, v1

    iput v0, p0, Lkik/android/widget/ProgressWheel;->w:F

    .line 287
    iget v0, p0, Lkik/android/widget/ProgressWheel;->w:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_0

    .line 288
    iget v0, p0, Lkik/android/widget/ProgressWheel;->w:F

    sub-float/2addr v0, v2

    iput v0, p0, Lkik/android/widget/ProgressWheel;->w:F

    .line 290
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/widget/ProgressWheel;->t:J

    .line 292
    iget v0, p0, Lkik/android/widget/ProgressWheel;->w:F

    sub-float v2, v0, v11

    .line 293
    const/high16 v0, 0x41800000    # 16.0f

    iget v1, p0, Lkik/android/widget/ProgressWheel;->j:F

    add-float v3, v0, v1

    .line 295
    invoke-virtual {p0}, Lkik/android/widget/ProgressWheel;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 296
    const/4 v2, 0x0

    .line 297
    const/high16 v3, 0x43070000    # 135.0f

    .line 300
    :cond_1
    iget-object v1, p0, Lkik/android/widget/ProgressWheel;->r:Landroid/graphics/RectF;

    iget-object v5, p0, Lkik/android/widget/ProgressWheel;->p:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 339
    :goto_0
    invoke-virtual {p0}, Lkik/android/widget/ProgressWheel;->invalidate()V

    .line 342
    return-void

    .line 306
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v6, p0, Lkik/android/widget/ProgressWheel;->t:J

    sub-long/2addr v0, v6

    .line 308
    long-to-float v3, v0

    iget v5, p0, Lkik/android/widget/ProgressWheel;->s:F

    mul-float/2addr v3, v5

    const/high16 v5, 0x447a0000    # 1000.0f

    div-float/2addr v3, v5

    .line 311
    iget v5, p0, Lkik/android/widget/ProgressWheel;->w:F

    .line 313
    iget v6, p0, Lkik/android/widget/ProgressWheel;->w:F

    iget v7, p0, Lkik/android/widget/ProgressWheel;->x:F

    cmpl-float v6, v6, v7

    if-eqz v6, :cond_3

    .line 315
    iget v6, p0, Lkik/android/widget/ProgressWheel;->w:F

    add-float/2addr v6, v3

    iget v7, p0, Lkik/android/widget/ProgressWheel;->x:F

    invoke-static {v6, v7}, Ljava/lang/Math;->min(FF)F

    move-result v6

    iput v6, p0, Lkik/android/widget/ProgressWheel;->w:F

    .line 320
    :cond_3
    iget v6, p0, Lkik/android/widget/ProgressWheel;->w:F

    cmpl-float v5, v5, v6

    if-eqz v5, :cond_4

    .line 321
    invoke-direct {p0}, Lkik/android/widget/ProgressWheel;->d()V

    .line 326
    :cond_4
    iget-wide v6, p0, Lkik/android/widget/ProgressWheel;->l:J

    const-wide/16 v8, 0xc8

    cmp-long v5, v6, v8

    if-ltz v5, :cond_9

    iget-wide v6, p0, Lkik/android/widget/ProgressWheel;->h:D

    long-to-double v0, v0

    add-double/2addr v0, v6

    iput-wide v0, p0, Lkik/android/widget/ProgressWheel;->h:D

    iget-wide v0, p0, Lkik/android/widget/ProgressWheel;->h:D

    iget-wide v6, p0, Lkik/android/widget/ProgressWheel;->i:D

    cmpl-double v0, v0, v6

    if-lez v0, :cond_5

    iget-wide v0, p0, Lkik/android/widget/ProgressWheel;->h:D

    iget-wide v6, p0, Lkik/android/widget/ProgressWheel;->i:D

    sub-double/2addr v0, v6

    iput-wide v0, p0, Lkik/android/widget/ProgressWheel;->h:D

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkik/android/widget/ProgressWheel;->l:J

    iget-boolean v0, p0, Lkik/android/widget/ProgressWheel;->k:Z

    if-nez v0, :cond_7

    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lkik/android/widget/ProgressWheel;->k:Z

    :cond_5
    iget-wide v0, p0, Lkik/android/widget/ProgressWheel;->h:D

    iget-wide v6, p0, Lkik/android/widget/ProgressWheel;->i:D

    div-double/2addr v0, v6

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, v6

    const-wide v6, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v0, v6

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    double-to-float v0, v0

    div-float/2addr v0, v10

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    iget-boolean v1, p0, Lkik/android/widget/ProgressWheel;->k:Z

    if-eqz v1, :cond_8

    mul-float/2addr v0, v12

    iput v0, p0, Lkik/android/widget/ProgressWheel;->j:F

    .line 328
    :goto_2
    iget v0, p0, Lkik/android/widget/ProgressWheel;->v:F

    mul-float v1, v3, v10

    add-float/2addr v0, v1

    iput v0, p0, Lkik/android/widget/ProgressWheel;->v:F

    .line 329
    iget v0, p0, Lkik/android/widget/ProgressWheel;->v:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_6

    .line 330
    iget v0, p0, Lkik/android/widget/ProgressWheel;->v:F

    sub-float/2addr v0, v2

    iput v0, p0, Lkik/android/widget/ProgressWheel;->v:F

    .line 334
    :cond_6
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/widget/ProgressWheel;->t:J

    .line 336
    iget-object v1, p0, Lkik/android/widget/ProgressWheel;->r:Landroid/graphics/RectF;

    iget v0, p0, Lkik/android/widget/ProgressWheel;->v:F

    sub-float v2, v0, v11

    iget v3, p0, Lkik/android/widget/ProgressWheel;->w:F

    iget-object v5, p0, Lkik/android/widget/ProgressWheel;->p:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto/16 :goto_0

    :cond_7
    move v0, v4

    .line 326
    goto :goto_1

    :cond_8
    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v0, v1, v0

    mul-float/2addr v0, v12

    iget v1, p0, Lkik/android/widget/ProgressWheel;->v:F

    iget v5, p0, Lkik/android/widget/ProgressWheel;->j:F

    sub-float/2addr v5, v0

    add-float/2addr v1, v5

    iput v1, p0, Lkik/android/widget/ProgressWheel;->v:F

    iput v0, p0, Lkik/android/widget/ProgressWheel;->j:F

    goto :goto_2

    :cond_9
    iget-wide v6, p0, Lkik/android/widget/ProgressWheel;->l:J

    add-long/2addr v0, v6

    iput-wide v0, p0, Lkik/android/widget/ProgressWheel;->l:J

    goto :goto_2
.end method

.method protected onMeasure(II)V
    .locals 8

    .prologue
    const/high16 v7, -0x80000000

    const/high16 v6, 0x40000000    # 2.0f

    .line 108
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 110
    iget v0, p0, Lkik/android/widget/ProgressWheel;->b:I

    invoke-virtual {p0}, Lkik/android/widget/ProgressWheel;->getPaddingLeft()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lkik/android/widget/ProgressWheel;->getPaddingRight()I

    move-result v1

    add-int v2, v0, v1

    .line 111
    iget v0, p0, Lkik/android/widget/ProgressWheel;->b:I

    invoke-virtual {p0}, Lkik/android/widget/ProgressWheel;->getPaddingTop()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lkik/android/widget/ProgressWheel;->getPaddingBottom()I

    move-result v1

    add-int/2addr v0, v1

    .line 113
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    .line 114
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 115
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    .line 116
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 122
    if-eq v4, v6, :cond_4

    .line 124
    if-ne v4, v7, :cond_0

    .line 128
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 136
    :cond_0
    :goto_0
    if-eq v5, v6, :cond_1

    if-ne v4, v6, :cond_3

    :cond_1
    move v0, v1

    .line 149
    :cond_2
    :goto_1
    invoke-virtual {p0, v2, v0}, Lkik/android/widget/ProgressWheel;->setMeasuredDimension(II)V

    .line 150
    return-void

    .line 140
    :cond_3
    if-ne v5, v7, :cond_2

    .line 142
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_1

    :cond_4
    move v2, v3

    goto :goto_0
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .prologue
    .line 529
    instance-of v0, p1, Lkik/android/widget/ProgressWheel$WheelSavedState;

    if-nez v0, :cond_0

    .line 530
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 548
    :goto_0
    return-void

    .line 534
    :cond_0
    check-cast p1, Lkik/android/widget/ProgressWheel$WheelSavedState;

    .line 535
    invoke-virtual {p1}, Lkik/android/widget/ProgressWheel$WheelSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 537
    iget v0, p1, Lkik/android/widget/ProgressWheel$WheelSavedState;->a:F

    iput v0, p0, Lkik/android/widget/ProgressWheel;->w:F

    .line 538
    iget v0, p1, Lkik/android/widget/ProgressWheel$WheelSavedState;->b:F

    iput v0, p0, Lkik/android/widget/ProgressWheel;->x:F

    .line 539
    iget-boolean v0, p1, Lkik/android/widget/ProgressWheel$WheelSavedState;->c:Z

    iput-boolean v0, p0, Lkik/android/widget/ProgressWheel;->y:Z

    .line 540
    iget v0, p1, Lkik/android/widget/ProgressWheel$WheelSavedState;->d:F

    iput v0, p0, Lkik/android/widget/ProgressWheel;->s:F

    .line 541
    iget v0, p1, Lkik/android/widget/ProgressWheel$WheelSavedState;->e:I

    iput v0, p0, Lkik/android/widget/ProgressWheel;->c:I

    .line 542
    iget v0, p1, Lkik/android/widget/ProgressWheel$WheelSavedState;->f:I

    iput v0, p0, Lkik/android/widget/ProgressWheel;->n:I

    .line 543
    iget v0, p1, Lkik/android/widget/ProgressWheel$WheelSavedState;->g:I

    iput v0, p0, Lkik/android/widget/ProgressWheel;->d:I

    .line 544
    iget v0, p1, Lkik/android/widget/ProgressWheel$WheelSavedState;->h:I

    iput v0, p0, Lkik/android/widget/ProgressWheel;->o:I

    .line 545
    iget v0, p1, Lkik/android/widget/ProgressWheel$WheelSavedState;->i:I

    iput v0, p0, Lkik/android/widget/ProgressWheel;->b:I

    .line 546
    iget-boolean v0, p1, Lkik/android/widget/ProgressWheel$WheelSavedState;->j:Z

    iput-boolean v0, p0, Lkik/android/widget/ProgressWheel;->u:Z

    .line 547
    iget-boolean v0, p1, Lkik/android/widget/ProgressWheel$WheelSavedState;->k:Z

    iput-boolean v0, p0, Lkik/android/widget/ProgressWheel;->g:Z

    goto :goto_0
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .prologue
    .line 506
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 508
    new-instance v1, Lkik/android/widget/ProgressWheel$WheelSavedState;

    invoke-direct {v1, v0}, Lkik/android/widget/ProgressWheel$WheelSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 511
    iget v0, p0, Lkik/android/widget/ProgressWheel;->w:F

    iput v0, v1, Lkik/android/widget/ProgressWheel$WheelSavedState;->a:F

    .line 512
    iget v0, p0, Lkik/android/widget/ProgressWheel;->x:F

    iput v0, v1, Lkik/android/widget/ProgressWheel$WheelSavedState;->b:F

    .line 513
    iget-boolean v0, p0, Lkik/android/widget/ProgressWheel;->y:Z

    iput-boolean v0, v1, Lkik/android/widget/ProgressWheel$WheelSavedState;->c:Z

    .line 514
    iget v0, p0, Lkik/android/widget/ProgressWheel;->s:F

    iput v0, v1, Lkik/android/widget/ProgressWheel$WheelSavedState;->d:F

    .line 515
    iget v0, p0, Lkik/android/widget/ProgressWheel;->c:I

    iput v0, v1, Lkik/android/widget/ProgressWheel$WheelSavedState;->e:I

    .line 516
    iget v0, p0, Lkik/android/widget/ProgressWheel;->n:I

    iput v0, v1, Lkik/android/widget/ProgressWheel$WheelSavedState;->f:I

    .line 517
    iget v0, p0, Lkik/android/widget/ProgressWheel;->d:I

    iput v0, v1, Lkik/android/widget/ProgressWheel$WheelSavedState;->g:I

    .line 518
    iget v0, p0, Lkik/android/widget/ProgressWheel;->o:I

    iput v0, v1, Lkik/android/widget/ProgressWheel$WheelSavedState;->h:I

    .line 519
    iget v0, p0, Lkik/android/widget/ProgressWheel;->b:I

    iput v0, v1, Lkik/android/widget/ProgressWheel$WheelSavedState;->i:I

    .line 520
    iget-boolean v0, p0, Lkik/android/widget/ProgressWheel;->u:Z

    iput-boolean v0, v1, Lkik/android/widget/ProgressWheel$WheelSavedState;->j:Z

    .line 521
    iget-boolean v0, p0, Lkik/android/widget/ProgressWheel;->g:Z

    iput-boolean v0, v1, Lkik/android/widget/ProgressWheel$WheelSavedState;->k:Z

    .line 523
    return-object v1
.end method

.method protected onSizeChanged(IIII)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    .line 160
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 162
    invoke-virtual {p0}, Lkik/android/widget/ProgressWheel;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Lkik/android/widget/ProgressWheel;->getPaddingBottom()I

    move-result v1

    invoke-virtual {p0}, Lkik/android/widget/ProgressWheel;->getPaddingLeft()I

    move-result v2

    invoke-virtual {p0}, Lkik/android/widget/ProgressWheel;->getPaddingRight()I

    move-result v3

    iget-boolean v4, p0, Lkik/android/widget/ProgressWheel;->g:Z

    if-nez v4, :cond_0

    sub-int v4, p1, v2

    sub-int/2addr v4, v3

    sub-int v5, p2, v1

    sub-int/2addr v5, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    iget v5, p0, Lkik/android/widget/ProgressWheel;->b:I

    mul-int/lit8 v5, v5, 0x2

    iget v6, p0, Lkik/android/widget/ProgressWheel;->c:I

    mul-int/lit8 v6, v6, 0x2

    sub-int/2addr v5, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    sub-int v5, p1, v2

    sub-int v3, v5, v3

    sub-int/2addr v3, v4

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    sub-int v3, p2, v0

    sub-int v1, v3, v1

    sub-int/2addr v1, v4

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    new-instance v1, Landroid/graphics/RectF;

    iget v3, p0, Lkik/android/widget/ProgressWheel;->c:I

    add-int/2addr v3, v2

    int-to-float v3, v3

    iget v5, p0, Lkik/android/widget/ProgressWheel;->c:I

    add-int/2addr v5, v0

    int-to-float v5, v5

    add-int/2addr v2, v4

    iget v6, p0, Lkik/android/widget/ProgressWheel;->c:I

    sub-int/2addr v2, v6

    int-to-float v2, v2

    add-int/2addr v0, v4

    iget v4, p0, Lkik/android/widget/ProgressWheel;->c:I

    sub-int/2addr v0, v4

    int-to-float v0, v0

    invoke-direct {v1, v3, v5, v2, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v1, p0, Lkik/android/widget/ProgressWheel;->r:Landroid/graphics/RectF;

    .line 163
    :goto_0
    iget-object v0, p0, Lkik/android/widget/ProgressWheel;->p:Landroid/graphics/Paint;

    iget v1, p0, Lkik/android/widget/ProgressWheel;->n:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lkik/android/widget/ProgressWheel;->p:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lkik/android/widget/ProgressWheel;->p:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lkik/android/widget/ProgressWheel;->p:Landroid/graphics/Paint;

    iget v1, p0, Lkik/android/widget/ProgressWheel;->c:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lkik/android/widget/ProgressWheel;->q:Landroid/graphics/Paint;

    iget v1, p0, Lkik/android/widget/ProgressWheel;->o:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lkik/android/widget/ProgressWheel;->q:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lkik/android/widget/ProgressWheel;->q:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lkik/android/widget/ProgressWheel;->q:Landroid/graphics/Paint;

    iget v1, p0, Lkik/android/widget/ProgressWheel;->d:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 164
    invoke-virtual {p0}, Lkik/android/widget/ProgressWheel;->invalidate()V

    .line 165
    return-void

    .line 162
    :cond_0
    new-instance v4, Landroid/graphics/RectF;

    iget v5, p0, Lkik/android/widget/ProgressWheel;->c:I

    add-int/2addr v2, v5

    int-to-float v2, v2

    iget v5, p0, Lkik/android/widget/ProgressWheel;->c:I

    add-int/2addr v0, v5

    int-to-float v0, v0

    sub-int v3, p1, v3

    iget v5, p0, Lkik/android/widget/ProgressWheel;->c:I

    sub-int/2addr v3, v5

    int-to-float v3, v3

    sub-int v1, p2, v1

    iget v5, p0, Lkik/android/widget/ProgressWheel;->c:I

    sub-int/2addr v1, v5

    int-to-float v1, v1

    invoke-direct {v4, v2, v0, v3, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v4, p0, Lkik/android/widget/ProgressWheel;->r:Landroid/graphics/RectF;

    goto :goto_0
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .locals 2

    .prologue
    .line 347
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    .line 349
    if-nez p2, :cond_0

    .line 350
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/widget/ProgressWheel;->t:J

    .line 352
    :cond_0
    return-void
.end method

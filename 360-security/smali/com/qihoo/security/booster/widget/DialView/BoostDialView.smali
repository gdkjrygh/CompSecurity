.class public Lcom/qihoo/security/booster/widget/DialView/BoostDialView;
.super Landroid/view/View;
.source "360Security"


# instance fields
.field private final a:Landroid/graphics/Paint;

.field private b:I

.field private final c:F

.field private final d:F

.field private final e:F

.field private f:F

.field private g:I

.field private h:Landroid/graphics/RectF;

.field private i:I

.field private j:Landroid/graphics/drawable/BitmapDrawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 62
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    iput v3, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->b:I

    .line 63
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->a:Landroid/graphics/Paint;

    .line 64
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->a:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 65
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->a:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 67
    sget-object v0, Lcom/qihoo/security/lite/a$a;->BoostDialView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 68
    invoke-virtual {v0, v3, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->g:I

    .line 70
    const/4 v1, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->f:F

    .line 71
    const/4 v1, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->e:F

    .line 72
    const/4 v1, 0x5

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->c:F

    .line 73
    const/4 v1, 0x7

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->d:F

    .line 75
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 76
    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020049

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    iput-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->j:Landroid/graphics/drawable/BitmapDrawable;

    .line 77
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/booster/widget/DialView/BoostDialView;Lcom/qihoo/security/booster/widget/DialView/b;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->b(Lcom/qihoo/security/booster/widget/DialView/b;)V

    return-void
.end method

.method private b(Lcom/qihoo/security/booster/widget/DialView/b;)V
    .locals 3

    .prologue
    .line 199
    const-string/jumbo v0, "progress"

    const/4 v1, 0x2

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    invoke-static {p0, v0, v1}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[I)Lcom/nineoldandroids/a/k;

    move-result-object v2

    .line 200
    sget-object v0, Lcom/qihoo/security/ui/b/c;->a:Landroid/view/animation/AccelerateInterpolator;

    invoke-virtual {v2, v0}, Lcom/nineoldandroids/a/a;->a(Landroid/view/animation/Interpolator;)V

    .line 202
    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/app/a;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x578

    :goto_0
    invoke-virtual {v2, v0, v1}, Lcom/nineoldandroids/a/a;->b(J)Lcom/nineoldandroids/a/a;

    .line 204
    new-instance v0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$3;

    invoke-direct {v0, p0, p1}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$3;-><init>(Lcom/qihoo/security/booster/widget/DialView/BoostDialView;Lcom/qihoo/security/booster/widget/DialView/b;)V

    invoke-virtual {v2, v0}, Lcom/nineoldandroids/a/a;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 218
    invoke-virtual {v2}, Lcom/nineoldandroids/a/a;->a()V

    .line 219
    return-void

    .line 202
    :cond_0
    const-wide/16 v0, 0xa28

    goto :goto_0

    .line 199
    :array_0
    .array-data 4
        0x0
        0x64
    .end array-data
.end method


# virtual methods
.method public a(IJLcom/qihoo/security/booster/widget/DialView/b;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 151
    const-string/jumbo v2, "progress"

    const/4 v0, 0x2

    new-array v3, v0, [I

    const-wide/16 v4, 0x0

    cmp-long v0, p2, v4

    if-lez v0, :cond_0

    move v0, v1

    :goto_0
    aput v0, v3, v1

    const/4 v0, 0x1

    aput p1, v3, v0

    invoke-static {p0, v2, v3}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[I)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 153
    const-wide/16 v2, 0x2bc

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/a;->b(J)Lcom/nineoldandroids/a/a;

    .line 154
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/a;->a(Landroid/view/animation/Interpolator;)V

    .line 155
    invoke-virtual {v0, p2, p3}, Lcom/nineoldandroids/a/a;->a(J)V

    .line 156
    new-instance v1, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$1;

    invoke-direct {v1, p0, p4}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$1;-><init>(Lcom/qihoo/security/booster/widget/DialView/BoostDialView;Lcom/qihoo/security/booster/widget/DialView/b;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/a;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 171
    invoke-virtual {v0}, Lcom/nineoldandroids/a/a;->a()V

    .line 172
    return-void

    .line 151
    :cond_0
    iget v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->b:I

    goto :goto_0
.end method

.method public a(ILcom/qihoo/security/booster/widget/DialView/b;)V
    .locals 2

    .prologue
    .line 147
    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->a(IJLcom/qihoo/security/booster/widget/DialView/b;)V

    .line 148
    return-void
.end method

.method public a(Lcom/qihoo/security/booster/widget/DialView/b;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 176
    const-string/jumbo v0, "progress"

    const/4 v1, 0x2

    new-array v1, v1, [I

    iget v2, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->b:I

    aput v2, v1, v3

    const/4 v2, 0x1

    aput v3, v1, v2

    invoke-static {p0, v0, v1}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[I)Lcom/nineoldandroids/a/k;

    move-result-object v2

    .line 177
    sget-object v0, Lcom/qihoo/security/ui/b/c;->b:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v2, v0}, Lcom/nineoldandroids/a/a;->a(Landroid/view/animation/Interpolator;)V

    .line 178
    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/app/a;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x190

    :goto_0
    invoke-virtual {v2, v0, v1}, Lcom/nineoldandroids/a/a;->b(J)Lcom/nineoldandroids/a/a;

    .line 179
    new-instance v0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$2;

    invoke-direct {v0, p0, p1}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$2;-><init>(Lcom/qihoo/security/booster/widget/DialView/BoostDialView;Lcom/qihoo/security/booster/widget/DialView/b;)V

    invoke-virtual {v2, v0}, Lcom/nineoldandroids/a/a;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 195
    invoke-virtual {v2}, Lcom/nineoldandroids/a/a;->a()V

    .line 196
    return-void

    .line 178
    :cond_0
    const-wide/16 v0, 0x1f4

    goto :goto_0
.end method

.method public getCricleColor()I
    .locals 1

    .prologue
    .line 122
    iget v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->g:I

    return v0
.end method

.method public declared-synchronized getProgress()I
    .locals 1

    .prologue
    .line 104
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getRoundWidth()F
    .locals 1

    .prologue
    .line 139
    iget v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->f:F

    return v0
.end method

.method public getSectorColor()I
    .locals 1

    .prologue
    .line 130
    iget v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->i:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .prologue
    const/high16 v3, 0x40000000    # 2.0f

    const/4 v4, 0x0

    .line 82
    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->getWidth()I

    move-result v0

    div-int/lit8 v6, v0, 0x2

    .line 83
    const/high16 v0, 0x43160000    # 150.0f

    int-to-float v1, v6

    int-to-float v2, v6

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 85
    int-to-float v0, v6

    iget v1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->c:F

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->d:F

    div-float/2addr v1, v3

    sub-float/2addr v0, v1

    float-to-int v0, v0

    .line 86
    int-to-float v0, v0

    iget v1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->f:F

    div-float/2addr v1, v3

    iget v2, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->e:F

    add-float/2addr v1, v2

    sub-float/2addr v0, v1

    float-to-int v0, v0

    .line 87
    iget-object v1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->h:Landroid/graphics/RectF;

    if-nez v1, :cond_0

    .line 88
    new-instance v1, Landroid/graphics/RectF;

    sub-int v2, v6, v0

    int-to-float v2, v2

    sub-int v3, v6, v0

    int-to-float v3, v3

    add-int v5, v6, v0

    int-to-float v5, v5

    add-int/2addr v0, v6

    int-to-float v0, v0

    invoke-direct {v1, v2, v3, v5, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->h:Landroid/graphics/RectF;

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->a:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->f:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 92
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->a:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->i:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 94
    iget-object v1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->h:Landroid/graphics/RectF;

    const/4 v2, 0x0

    iget v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->b:I

    mul-int/lit16 v0, v0, 0xf0

    div-int/lit8 v0, v0, 0x64

    int-to-float v3, v0

    iget-object v5, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->a:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 97
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->j:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->getHeight()I

    move-result v2

    invoke-virtual {v0, v4, v4, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;->setBounds(IIII)V

    .line 98
    iget v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->b:I

    mul-int/lit16 v0, v0, 0xf0

    div-int/lit8 v0, v0, 0x64

    add-int/lit8 v0, v0, 0x5a

    int-to-float v0, v0

    int-to-float v1, v6

    int-to-float v2, v6

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 99
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->j:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/BitmapDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 101
    return-void
.end method

.method public setCricleColor(I)V
    .locals 0

    .prologue
    .line 126
    iput p1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->g:I

    .line 127
    return-void
.end method

.method public declared-synchronized setProgress(I)V
    .locals 2

    .prologue
    const/16 v0, 0x64

    .line 108
    monitor-enter p0

    if-gez p1, :cond_0

    .line 109
    :try_start_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "progress not less than 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 111
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->clearAnimation()V

    .line 112
    if-le p1, v0, :cond_1

    move p1, v0

    .line 115
    :cond_1
    if-gt p1, v0, :cond_2

    .line 116
    iput p1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->b:I

    .line 117
    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->postInvalidate()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    :cond_2
    monitor-exit p0

    return-void
.end method

.method public setRoundWidth(F)V
    .locals 0

    .prologue
    .line 143
    iput p1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->f:F

    .line 144
    return-void
.end method

.method public setSectorColor(I)V
    .locals 0

    .prologue
    .line 134
    iput p1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->i:I

    .line 135
    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->postInvalidate()V

    .line 136
    return-void
.end method

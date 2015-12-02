.class public Lcom/qihoo/security/widget/ProgressView;
.super Landroid/widget/FrameLayout;
.source "360Security"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:F

.field private c:Landroid/widget/Scroller;

.field private d:Landroid/view/View;

.field private e:Landroid/view/View;

.field private f:Landroid/graphics/drawable/Drawable;

.field private g:Z

.field private h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/qihoo/security/widget/ProgressView;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/widget/ProgressView;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 44
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/widget/ProgressView;->b:F

    .line 37
    iput-object v1, p0, Lcom/qihoo/security/widget/ProgressView;->c:Landroid/widget/Scroller;

    .line 38
    iput-object v1, p0, Lcom/qihoo/security/widget/ProgressView;->e:Landroid/view/View;

    .line 39
    iput-object v1, p0, Lcom/qihoo/security/widget/ProgressView;->f:Landroid/graphics/drawable/Drawable;

    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/ProgressView;->g:Z

    .line 41
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/ProgressView;->h:Z

    .line 45
    invoke-direct {p0}, Lcom/qihoo/security/widget/ProgressView;->b()V

    .line 46
    return-void
.end method

.method private a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 6

    .prologue
    const/16 v5, 0x2710

    .line 179
    instance-of v0, p1, Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_1

    .line 180
    check-cast p1, Landroid/graphics/drawable/AnimationDrawable;

    .line 181
    invoke-virtual {p1}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I

    move-result v2

    .line 182
    new-instance v0, Landroid/graphics/drawable/AnimationDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/AnimationDrawable;-><init>()V

    .line 183
    invoke-virtual {p1}, Landroid/graphics/drawable/AnimationDrawable;->isOneShot()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/AnimationDrawable;->setOneShot(Z)V

    .line 185
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 186
    invoke-virtual {p1, v1}, Landroid/graphics/drawable/AnimationDrawable;->getFrame(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/qihoo/security/widget/ProgressView;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 187
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    .line 188
    invoke-virtual {p1, v1}, Landroid/graphics/drawable/AnimationDrawable;->getDuration(I)I

    move-result v4

    invoke-virtual {v0, v3, v4}, Landroid/graphics/drawable/AnimationDrawable;->addFrame(Landroid/graphics/drawable/Drawable;I)V

    .line 185
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 190
    :cond_0
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/AnimationDrawable;->setLevel(I)Z

    move-object p1, v0

    .line 193
    :cond_1
    return-object p1
.end method

.method private a()V
    .locals 1

    .prologue
    .line 59
    iget-boolean v0, p0, Lcom/qihoo/security/widget/ProgressView;->h:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/qihoo/security/widget/ProgressView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/qihoo/security/widget/ProgressView;->g:Z

    if-nez v0, :cond_1

    .line 60
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->f:Landroid/graphics/drawable/Drawable;

    check-cast v0, Landroid/graphics/drawable/Animatable;

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->start()V

    .line 61
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/ProgressView;->g:Z

    .line 68
    :cond_0
    :goto_0
    return-void

    .line 63
    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/widget/ProgressView;->g:Z

    if-eqz v0, :cond_0

    .line 64
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->f:Landroid/graphics/drawable/Drawable;

    check-cast v0, Landroid/graphics/drawable/Animatable;

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/ProgressView;->g:Z

    goto :goto_0
.end method

.method private b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 4

    .prologue
    .line 198
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    .line 199
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 201
    new-instance p1, Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/ProgressView;->getDrawableShape()Landroid/graphics/drawable/shapes/Shape;

    move-result-object v1

    invoke-direct {p1, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 203
    new-instance v1, Landroid/graphics/BitmapShader;

    sget-object v2, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    sget-object v3, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    invoke-direct {v1, v0, v2, v3}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 205
    invoke-virtual {p1}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 210
    :cond_0
    return-object p1
.end method

.method private b()V
    .locals 3

    .prologue
    .line 71
    invoke-virtual {p0}, Lcom/qihoo/security/widget/ProgressView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030088

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 72
    const v0, 0x7f0200e5

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/ProgressView;->setBackgroundResource(I)V

    .line 73
    new-instance v0, Landroid/widget/Scroller;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/ProgressView;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-direct {v0, v1, v2}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->c:Landroid/widget/Scroller;

    .line 74
    const v0, 0x7f0b01bf

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/ProgressView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->d:Landroid/view/View;

    .line 75
    const v0, 0x7f0b01c0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/ProgressView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->e:Landroid/view/View;

    .line 76
    invoke-virtual {p0}, Lcom/qihoo/security/widget/ProgressView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200e9

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->f:Landroid/graphics/drawable/Drawable;

    .line 78
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->f:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v0}, Lcom/qihoo/security/widget/ProgressView;->a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->f:Landroid/graphics/drawable/Drawable;

    .line 79
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 80
    invoke-direct {p0}, Lcom/qihoo/security/widget/ProgressView;->a()V

    .line 81
    return-void
.end method


# virtual methods
.method public a(FI)V
    .locals 6

    .prologue
    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    .line 109
    iput p1, p0, Lcom/qihoo/security/widget/ProgressView;->b:F

    .line 110
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->c:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->c:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, Lcom/qihoo/security/widget/ProgressView;->d:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lcom/qihoo/security/widget/ProgressView;->b:F

    sub-float v1, v4, v1

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/qihoo/security/widget/ProgressView;->e:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-int v3, v0

    .line 115
    if-gez v3, :cond_1

    .line 120
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    if-nez v0, :cond_3

    .line 121
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->e:Landroid/view/View;

    iget-object v1, p0, Lcom/qihoo/security/widget/ProgressView;->e:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iget-object v3, p0, Lcom/qihoo/security/widget/ProgressView;->d:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    sub-int/2addr v1, v3

    int-to-float v1, v1

    iget v3, p0, Lcom/qihoo/security/widget/ProgressView;->b:F

    sub-float v3, v4, v3

    mul-float/2addr v1, v3

    float-to-int v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->scrollTo(II)V

    .line 135
    :goto_0
    invoke-virtual {p0}, Lcom/qihoo/security/widget/ProgressView;->invalidate()V

    .line 136
    return-void

    .line 124
    :cond_3
    if-gez p2, :cond_4

    .line 125
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->c:Landroid/widget/Scroller;

    iget-object v1, p0, Lcom/qihoo/security/widget/ProgressView;->e:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    move-result v1

    mul-int/lit8 v4, v3, 0x3

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v5

    move v4, v2

    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 126
    invoke-virtual {p0}, Lcom/qihoo/security/widget/ProgressView;->invalidate()V

    goto :goto_0

    .line 127
    :cond_4
    if-nez p2, :cond_5

    .line 128
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->e:Landroid/view/View;

    iget-object v1, p0, Lcom/qihoo/security/widget/ProgressView;->e:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iget-object v3, p0, Lcom/qihoo/security/widget/ProgressView;->d:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    sub-int/2addr v1, v3

    int-to-float v1, v1

    iget v3, p0, Lcom/qihoo/security/widget/ProgressView;->b:F

    sub-float v3, v4, v3

    mul-float/2addr v1, v3

    float-to-int v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->scrollTo(II)V

    goto :goto_0

    .line 131
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->c:Landroid/widget/Scroller;

    iget-object v1, p0, Lcom/qihoo/security/widget/ProgressView;->e:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    move-result v1

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v5

    move v4, v2

    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 132
    invoke-virtual {p0}, Lcom/qihoo/security/widget/ProgressView;->invalidate()V

    goto :goto_0
.end method

.method public computeScroll()V
    .locals 3

    .prologue
    .line 220
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->c:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->e:Landroid/view/View;

    iget-object v1, p0, Lcom/qihoo/security/widget/ProgressView;->c:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrX()I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/widget/ProgressView;->c:Landroid/widget/Scroller;

    invoke-virtual {v2}, Landroid/widget/Scroller;->getCurrY()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->scrollTo(II)V

    .line 222
    invoke-virtual {p0}, Lcom/qihoo/security/widget/ProgressView;->postInvalidate()V

    .line 224
    :cond_0
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 175
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    .line 176
    return-void
.end method

.method getDrawableShape()Landroid/graphics/drawable/shapes/Shape;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 214
    const/16 v0, 0x8

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    .line 215
    new-instance v1, Landroid/graphics/drawable/shapes/RoundRectShape;

    invoke-direct {v1, v0, v2, v2}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V

    return-object v1

    .line 214
    :array_0
    .array-data 4
        0x41700000    # 15.0f
        0x41700000    # 15.0f
        0x41700000    # 15.0f
        0x41700000    # 15.0f
        0x41700000    # 15.0f
        0x41700000    # 15.0f
        0x41700000    # 15.0f
        0x41700000    # 15.0f
    .end array-data
.end method

.method public getProgress()F
    .locals 1

    .prologue
    .line 145
    iget v0, p0, Lcom/qihoo/security/widget/ProgressView;->b:F

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 167
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onDraw(Landroid/graphics/Canvas;)V

    .line 168
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 169
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 170
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 171
    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    .prologue
    .line 140
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 141
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->e:Landroid/view/View;

    iget-object v1, p0, Lcom/qihoo/security/widget/ProgressView;->e:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/widget/ProgressView;->d:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    iget v3, p0, Lcom/qihoo/security/widget/ProgressView;->b:F

    sub-float/2addr v2, v3

    mul-float/2addr v1, v2

    float-to-int v1, v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->scrollTo(II)V

    .line 142
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 156
    .line 159
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->f:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 160
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1, v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 163
    :cond_0
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 1

    .prologue
    .line 91
    invoke-virtual {p0}, Lcom/qihoo/security/widget/ProgressView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/qihoo/security/widget/ProgressView;->g:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/qihoo/security/widget/ProgressView;->h:Z

    if-eqz v0, :cond_1

    .line 92
    if-eqz p1, :cond_0

    .line 93
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->f:Landroid/graphics/drawable/Drawable;

    check-cast v0, Landroid/graphics/drawable/Animatable;

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->start()V

    .line 100
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onWindowFocusChanged(Z)V

    .line 101
    return-void

    .line 95
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->f:Landroid/graphics/drawable/Drawable;

    check-cast v0, Landroid/graphics/drawable/Animatable;

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V

    goto :goto_0

    .line 98
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->f:Landroid/graphics/drawable/Drawable;

    check-cast v0, Landroid/graphics/drawable/Animatable;

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V

    goto :goto_0
.end method

.method public setAnimation(Z)V
    .locals 0

    .prologue
    .line 54
    iput-boolean p1, p0, Lcom/qihoo/security/widget/ProgressView;->h:Z

    .line 55
    invoke-direct {p0}, Lcom/qihoo/security/widget/ProgressView;->a()V

    .line 56
    return-void
.end method

.method public setProgress(F)V
    .locals 1

    .prologue
    .line 104
    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0}, Lcom/qihoo/security/widget/ProgressView;->a(FI)V

    .line 105
    return-void
.end method

.method public setVisibility(I)V
    .locals 0

    .prologue
    .line 85
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 86
    invoke-direct {p0}, Lcom/qihoo/security/widget/ProgressView;->a()V

    .line 87
    return-void
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Lcom/qihoo/security/widget/ProgressView;->f:Landroid/graphics/drawable/Drawable;

    if-eq p1, v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

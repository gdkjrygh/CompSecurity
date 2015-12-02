.class public Lcom/qihoo/security/widget/switcher/Switch;
.super Landroid/widget/CompoundButton;
.source "360Security"


# static fields
.field private static final w:[I


# instance fields
.field private a:Landroid/graphics/drawable/Drawable;

.field private b:Landroid/graphics/drawable/Drawable;

.field private final c:I

.field private final d:I

.field private e:I

.field private final f:I

.field private g:F

.field private h:F

.field private final i:Landroid/view/VelocityTracker;

.field private final j:I

.field private k:F

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private final t:Landroid/graphics/Rect;

.field private u:Landroid/os/Handler;

.field private v:Z

.field private x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 67
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x10100a0

    aput v2, v0, v1

    sput-object v0, Lcom/qihoo/security/widget/switcher/Switch;->w:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 78
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/widget/switcher/Switch;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 79
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 91
    const v0, 0x7f010105

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/widget/switcher/Switch;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 92
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    const/4 v3, 0x4

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 107
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CompoundButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 48
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->i:Landroid/view/VelocityTracker;

    .line 63
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->t:Landroid/graphics/Rect;

    .line 65
    iput-boolean v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->v:Z

    .line 69
    iput-boolean v2, p0, Lcom/qihoo/security/widget/switcher/Switch;->x:Z

    .line 109
    sget-object v0, Lcom/qihoo/security/lite/a$a;->Switch:[I

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 111
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->a:Landroid/graphics/drawable/Drawable;

    .line 112
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->b:Landroid/graphics/drawable/Drawable;

    .line 113
    const/4 v1, 0x2

    const/16 v2, 0x30

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->c:I

    .line 114
    const/4 v1, 0x3

    const/16 v2, 0x10

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->d:I

    .line 115
    const/16 v1, 0x1c

    invoke-virtual {v0, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->n:I

    .line 116
    const/4 v1, 0x5

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->o:I

    .line 118
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 120
    iget-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->a:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 121
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020129

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->a:Landroid/graphics/drawable/Drawable;

    .line 123
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->b:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    .line 124
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200a6

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->b:Landroid/graphics/drawable/Drawable;

    .line 127
    :cond_1
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 128
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->f:I

    .line 129
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->j:I

    .line 132
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->refreshDrawableState()V

    .line 133
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->isChecked()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/switcher/Switch;->setChecked(Z)V

    .line 135
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/widget/switcher/Switch$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/widget/switcher/Switch$1;-><init>(Lcom/qihoo/security/widget/switcher/Switch;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->u:Landroid/os/Handler;

    .line 154
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/widget/switcher/Switch;F)F
    .locals 1

    .prologue
    .line 31
    iget v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->k:F

    sub-float/2addr v0, p1

    iput v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->k:F

    return v0
.end method

.method static synthetic a(Lcom/qihoo/security/widget/switcher/Switch;)I
    .locals 1

    .prologue
    .line 31
    iget v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->o:I

    return v0
.end method

.method private a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 157
    iget v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->k:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 158
    iput v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->k:F

    .line 162
    :cond_0
    :goto_0
    return-void

    .line 159
    :cond_1
    iget v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->k:F

    invoke-direct {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getThumbScrollRange()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 160
    invoke-direct {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getThumbScrollRange()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->k:F

    goto :goto_0
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 2

    .prologue
    .line 272
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    .line 273
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->setAction(I)V

    .line 274
    invoke-super {p0, v0}, Landroid/widget/CompoundButton;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 275
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 276
    return-void
.end method

.method private a(Z)V
    .locals 0

    .prologue
    .line 308
    invoke-virtual {p0, p1}, Lcom/qihoo/security/widget/switcher/Switch;->setChecked(Z)V

    .line 309
    return-void
.end method

.method private a(FF)Z
    .locals 5

    .prologue
    .line 188
    iget-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->a:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->t:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 189
    iget v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->q:I

    iget v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->f:I

    sub-int/2addr v0, v1

    .line 190
    iget v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->p:I

    iget v2, p0, Lcom/qihoo/security/widget/switcher/Switch;->k:F

    const/high16 v3, 0x3f000000    # 0.5f

    add-float/2addr v2, v3

    float-to-int v2, v2

    add-int/2addr v1, v2

    iget v2, p0, Lcom/qihoo/security/widget/switcher/Switch;->f:I

    sub-int/2addr v1, v2

    .line 191
    iget v2, p0, Lcom/qihoo/security/widget/switcher/Switch;->n:I

    add-int/2addr v2, v1

    iget-object v3, p0, Lcom/qihoo/security/widget/switcher/Switch;->t:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    add-int/2addr v2, v3

    iget-object v3, p0, Lcom/qihoo/security/widget/switcher/Switch;->t:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    iget v3, p0, Lcom/qihoo/security/widget/switcher/Switch;->f:I

    add-int/2addr v2, v3

    .line 192
    iget v3, p0, Lcom/qihoo/security/widget/switcher/Switch;->s:I

    iget v4, p0, Lcom/qihoo/security/widget/switcher/Switch;->f:I

    add-int/2addr v3, v4

    .line 193
    int-to-float v1, v1

    cmpl-float v1, p1, v1

    if-lez v1, :cond_0

    int-to-float v1, v2

    cmpg-float v1, p1, v1

    if-gez v1, :cond_0

    int-to-float v0, v0

    cmpl-float v0, p2, v0

    if-lez v0, :cond_0

    int-to-float v0, v3

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/widget/switcher/Switch;F)F
    .locals 1

    .prologue
    .line 31
    iget v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->k:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->k:F

    return v0
.end method

.method private b(Landroid/view/MotionEvent;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 285
    iput v2, p0, Lcom/qihoo/security/widget/switcher/Switch;->e:I

    .line 287
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 289
    :goto_0
    invoke-direct {p0, p1}, Lcom/qihoo/security/widget/switcher/Switch;->a(Landroid/view/MotionEvent;)V

    .line 291
    if-eqz v0, :cond_3

    .line 293
    iget-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->i:Landroid/view/VelocityTracker;

    const/16 v3, 0x3e8

    invoke-virtual {v0, v3}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 294
    iget-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->i:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v0

    .line 295
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v4, p0, Lcom/qihoo/security/widget/switcher/Switch;->j:I

    int-to-float v4, v4

    cmpl-float v3, v3, v4

    if-lez v3, :cond_2

    .line 296
    const/4 v3, 0x0

    cmpl-float v0, v0, v3

    if-lez v0, :cond_1

    .line 300
    :goto_1
    invoke-direct {p0, v1}, Lcom/qihoo/security/widget/switcher/Switch;->a(Z)V

    .line 304
    :goto_2
    return-void

    :cond_0
    move v0, v2

    .line 287
    goto :goto_0

    :cond_1
    move v1, v2

    .line 296
    goto :goto_1

    .line 298
    :cond_2
    invoke-direct {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getTargetCheckedState()Z

    move-result v1

    goto :goto_1

    .line 302
    :cond_3
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->isChecked()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/widget/switcher/Switch;->a(Z)V

    goto :goto_2
.end method

.method static synthetic b(Lcom/qihoo/security/widget/switcher/Switch;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/qihoo/security/widget/switcher/Switch;->a()V

    return-void
.end method

.method private getTargetCheckedState()Z
    .locals 2

    .prologue
    .line 312
    iget v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->k:F

    invoke-direct {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getThumbScrollRange()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private getThumbScrollRange()I
    .locals 2

    .prologue
    .line 434
    iget-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->b:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 435
    const/4 v0, 0x0

    .line 438
    :goto_0
    return v0

    .line 437
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->b:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->t:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 438
    iget v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->l:I

    iget v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->n:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->t:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->t:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v0, v1

    goto :goto_0
.end method


# virtual methods
.method protected drawableStateChanged()V
    .locals 2

    .prologue
    .line 452
    invoke-super {p0}, Landroid/widget/CompoundButton;->drawableStateChanged()V

    .line 454
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getDrawableState()[I

    move-result-object v0

    .line 458
    iget-object v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    .line 459
    iget-object v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 461
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1

    .line 462
    iget-object v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 465
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->invalidate()V

    .line 466
    return-void
.end method

.method public getCompoundPaddingRight()I
    .locals 2

    .prologue
    .line 426
    invoke-super {p0}, Landroid/widget/CompoundButton;->getCompoundPaddingRight()I

    move-result v0

    iget v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->l:I

    add-int/2addr v0, v1

    .line 427
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 428
    iget v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->d:I

    add-int/2addr v0, v1

    .line 430
    :cond_0
    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .prologue
    .line 317
    invoke-super {p0}, Landroid/widget/CompoundButton;->onAttachedToWindow()V

    .line 318
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->v:Z

    .line 319
    return-void
.end method

.method protected onCreateDrawableState(I)[I
    .locals 2

    .prologue
    .line 443
    add-int/lit8 v0, p1, 0x1

    invoke-super {p0, v0}, Landroid/widget/CompoundButton;->onCreateDrawableState(I)[I

    move-result-object v0

    .line 444
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 445
    sget-object v1, Lcom/qihoo/security/widget/switcher/Switch;->w:[I

    invoke-static {v0, v1}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    .line 447
    :cond_0
    return-object v0
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 323
    invoke-super {p0}, Landroid/widget/CompoundButton;->onDetachedFromWindow()V

    .line 324
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->v:Z

    .line 325
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0xc

    .line 387
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onDraw(Landroid/graphics/Canvas;)V

    .line 389
    iget v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->p:I

    .line 390
    iget v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->q:I

    .line 391
    iget v2, p0, Lcom/qihoo/security/widget/switcher/Switch;->r:I

    .line 392
    iget v3, p0, Lcom/qihoo/security/widget/switcher/Switch;->s:I

    .line 394
    iget-object v4, p0, Lcom/qihoo/security/widget/switcher/Switch;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 395
    iget-object v4, p0, Lcom/qihoo/security/widget/switcher/Switch;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 397
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 399
    iget-object v4, p0, Lcom/qihoo/security/widget/switcher/Switch;->b:Landroid/graphics/drawable/Drawable;

    iget-object v5, p0, Lcom/qihoo/security/widget/switcher/Switch;->t:Landroid/graphics/Rect;

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 400
    iget-object v4, p0, Lcom/qihoo/security/widget/switcher/Switch;->t:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->left:I

    add-int/2addr v0, v4

    .line 401
    iget-object v4, p0, Lcom/qihoo/security/widget/switcher/Switch;->t:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->right:I

    sub-int/2addr v2, v4

    .line 402
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 404
    iget-object v2, p0, Lcom/qihoo/security/widget/switcher/Switch;->a:Landroid/graphics/drawable/Drawable;

    iget-object v4, p0, Lcom/qihoo/security/widget/switcher/Switch;->t:Landroid/graphics/Rect;

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 405
    iget v2, p0, Lcom/qihoo/security/widget/switcher/Switch;->k:F

    const/high16 v4, 0x3f000000    # 0.5f

    add-float/2addr v2, v4

    float-to-int v2, v2

    .line 406
    iget-object v4, p0, Lcom/qihoo/security/widget/switcher/Switch;->t:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->left:I

    sub-int v4, v0, v4

    add-int/2addr v4, v2

    .line 407
    add-int/2addr v0, v2

    iget v2, p0, Lcom/qihoo/security/widget/switcher/Switch;->n:I

    add-int/2addr v0, v2

    iget-object v2, p0, Lcom/qihoo/security/widget/switcher/Switch;->t:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    add-int/2addr v0, v2

    .line 409
    iget-object v2, p0, Lcom/qihoo/security/widget/switcher/Switch;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, v4, v1, v0, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 410
    iget-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 412
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 413
    iget v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->e:I

    if-nez v0, :cond_0

    .line 414
    iget v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->k:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->k:F

    invoke-direct {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getThumbScrollRange()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 415
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 416
    iget-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->u:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v6, v7}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 422
    :cond_0
    :goto_0
    return-void

    .line 418
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->u:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v6, v7}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 356
    invoke-super/range {p0 .. p5}, Landroid/widget/CompoundButton;->onLayout(ZIIII)V

    .line 358
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getThumbScrollRange()I

    move-result v0

    int-to-float v0, v0

    :goto_0
    iput v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->k:F

    .line 360
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getPaddingRight()I

    move-result v2

    sub-int v2, v0, v2

    .line 361
    iget v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->l:I

    sub-int v3, v2, v0

    .line 364
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getGravity()I

    move-result v0

    and-int/lit8 v0, v0, 0x70

    sparse-switch v0, :sswitch_data_0

    move v0, v1

    .line 379
    :goto_1
    iput v3, p0, Lcom/qihoo/security/widget/switcher/Switch;->p:I

    .line 380
    iput v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->q:I

    .line 381
    iput v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->s:I

    .line 382
    iput v2, p0, Lcom/qihoo/security/widget/switcher/Switch;->r:I

    .line 383
    return-void

    .line 358
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 366
    :sswitch_0
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getPaddingTop()I

    move-result v1

    .line 367
    iget v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->m:I

    add-int/2addr v0, v1

    .line 368
    goto :goto_1

    .line 370
    :sswitch_1
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getHeight()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->m:I

    div-int/lit8 v1, v1, 0x2

    sub-int v1, v0, v1

    .line 371
    iget v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->m:I

    add-int/2addr v0, v1

    .line 372
    goto :goto_1

    .line 374
    :sswitch_2
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    .line 375
    iget v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->m:I

    sub-int v1, v0, v1

    goto :goto_1

    .line 364
    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_1
        0x30 -> :sswitch_0
        0x50 -> :sswitch_2
    .end sparse-switch
.end method

.method public onMeasure(II)V
    .locals 3

    .prologue
    .line 166
    iget-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->b:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->t:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 167
    iget v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->c:I

    iget v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->n:I

    mul-int/lit8 v1, v1, 0x2

    iget-object v2, p0, Lcom/qihoo/security/widget/switcher/Switch;->t:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/qihoo/security/widget/switcher/Switch;->t:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 168
    iget-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    .line 170
    iget v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->c:I

    iput v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->l:I

    .line 171
    iput v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->m:I

    .line 173
    invoke-super {p0, p1, p2}, Landroid/widget/CompoundButton;->onMeasure(II)V

    .line 174
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getMeasuredHeight()I

    move-result v1

    .line 175
    if-ge v1, v0, :cond_0

    .line 176
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-ge v1, v2, :cond_1

    .line 177
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0, v1, v0}, Lcom/qihoo/security/widget/switcher/Switch;->setMeasuredDimension(II)V

    .line 182
    :cond_0
    :goto_0
    return-void

    .line 179
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getMeasuredWidthAndState()I

    move-result v1

    invoke-virtual {p0, v1, v0}, Lcom/qihoo/security/widget/switcher/Switch;->setMeasuredDimension(II)V

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v0, 0x1

    .line 198
    iget-object v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->i:Landroid/view/VelocityTracker;

    invoke-virtual {v1, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 201
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x8

    if-ge v1, v2, :cond_2

    .line 202
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    .line 207
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 268
    :cond_0
    :goto_1
    :pswitch_0
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :cond_1
    :goto_2
    return v0

    .line 204
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    goto :goto_0

    .line 209
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    .line 210
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    .line 211
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-direct {p0, v1, v2}, Lcom/qihoo/security/widget/switcher/Switch;->a(FF)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 212
    iput v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->e:I

    .line 213
    iput v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->g:F

    .line 214
    iput v2, p0, Lcom/qihoo/security/widget/switcher/Switch;->h:F

    goto :goto_1

    .line 220
    :pswitch_2
    iget-boolean v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->x:Z

    if-eqz v1, :cond_0

    .line 223
    iget v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->e:I

    packed-switch v1, :pswitch_data_1

    goto :goto_1

    .line 229
    :pswitch_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    .line 230
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    .line 231
    iget v3, p0, Lcom/qihoo/security/widget/switcher/Switch;->g:F

    sub-float v3, v1, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v4, p0, Lcom/qihoo/security/widget/switcher/Switch;->f:I

    int-to-float v4, v4

    cmpl-float v3, v3, v4

    if-gtz v3, :cond_3

    iget v3, p0, Lcom/qihoo/security/widget/switcher/Switch;->h:F

    sub-float v3, v2, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v4, p0, Lcom/qihoo/security/widget/switcher/Switch;->f:I

    int-to-float v4, v4

    cmpl-float v3, v3, v4

    if-lez v3, :cond_0

    .line 232
    :cond_3
    iput v5, p0, Lcom/qihoo/security/widget/switcher/Switch;->e:I

    .line 233
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    invoke-interface {v3, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 234
    iput v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->g:F

    .line 235
    iput v2, p0, Lcom/qihoo/security/widget/switcher/Switch;->h:F

    goto :goto_2

    .line 242
    :pswitch_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    .line 243
    iget v2, p0, Lcom/qihoo/security/widget/switcher/Switch;->g:F

    sub-float v2, v1, v2

    .line 244
    const/4 v3, 0x0

    iget v4, p0, Lcom/qihoo/security/widget/switcher/Switch;->k:F

    add-float/2addr v2, v4

    invoke-direct {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getThumbScrollRange()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    .line 245
    iget v3, p0, Lcom/qihoo/security/widget/switcher/Switch;->k:F

    cmpl-float v3, v2, v3

    if-eqz v3, :cond_1

    .line 246
    iput v2, p0, Lcom/qihoo/security/widget/switcher/Switch;->k:F

    .line 247
    iput v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->g:F

    .line 248
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->invalidate()V

    goto/16 :goto_2

    .line 258
    :pswitch_5
    iget v1, p0, Lcom/qihoo/security/widget/switcher/Switch;->e:I

    if-ne v1, v5, :cond_4

    .line 259
    invoke-direct {p0, p1}, Lcom/qihoo/security/widget/switcher/Switch;->b(Landroid/view/MotionEvent;)V

    goto/16 :goto_2

    .line 262
    :cond_4
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->e:I

    .line 263
    iget-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->i:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    goto/16 :goto_1

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_5
        :pswitch_2
        :pswitch_5
    .end packed-switch

    .line 223
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public setChecked(Z)V
    .locals 4

    .prologue
    const-wide/16 v2, 0xc

    .line 329
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 332
    iget-boolean v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->v:Z

    if-eqz v0, :cond_0

    .line 333
    iget-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->u:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 334
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 335
    iget-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->u:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 341
    :cond_0
    :goto_0
    return-void

    .line 337
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->u:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0
.end method

.method public setCheckedWithoutAnim(Z)V
    .locals 1

    .prologue
    .line 349
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 350
    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/qihoo/security/widget/switcher/Switch;->getThumbScrollRange()I

    move-result v0

    int-to-float v0, v0

    :goto_0
    iput v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->k:F

    .line 351
    invoke-virtual {p0}, Lcom/qihoo/security/widget/switcher/Switch;->invalidate()V

    .line 352
    return-void

    .line 350
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setScrollable(Z)V
    .locals 0

    .prologue
    .line 474
    iput-boolean p1, p0, Lcom/qihoo/security/widget/switcher/Switch;->x:Z

    .line 475
    return-void
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .prologue
    .line 470
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->a:Landroid/graphics/drawable/Drawable;

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/widget/switcher/Switch;->b:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

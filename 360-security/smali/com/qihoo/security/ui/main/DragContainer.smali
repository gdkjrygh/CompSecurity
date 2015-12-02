.class public Lcom/qihoo/security/ui/main/DragContainer;
.super Landroid/widget/FrameLayout;
.source "360Security"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Landroid/view/VelocityTracker;

.field private c:F

.field private d:Landroid/view/View;

.field private e:Landroid/widget/ListView;

.field private f:Landroid/view/ViewGroup$MarginLayoutParams;

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/qihoo/security/ui/main/DragContainer;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/ui/main/DragContainer;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 51
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 31
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->b:Landroid/view/VelocityTracker;

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->c:F

    .line 34
    iput-object v1, p0, Lcom/qihoo/security/ui/main/DragContainer;->d:Landroid/view/View;

    .line 35
    iput-object v1, p0, Lcom/qihoo/security/ui/main/DragContainer;->e:Landroid/widget/ListView;

    .line 36
    iput-object v1, p0, Lcom/qihoo/security/ui/main/DragContainer;->f:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 52
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/DragContainer;->a(Landroid/content/Context;)V

    .line 53
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 56
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->b:Landroid/view/VelocityTracker;

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->c:F

    .line 34
    iput-object v1, p0, Lcom/qihoo/security/ui/main/DragContainer;->d:Landroid/view/View;

    .line 35
    iput-object v1, p0, Lcom/qihoo/security/ui/main/DragContainer;->e:Landroid/widget/ListView;

    .line 36
    iput-object v1, p0, Lcom/qihoo/security/ui/main/DragContainer;->f:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 57
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/DragContainer;->a(Landroid/content/Context;)V

    .line 58
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 61
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->b:Landroid/view/VelocityTracker;

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->c:F

    .line 34
    iput-object v1, p0, Lcom/qihoo/security/ui/main/DragContainer;->d:Landroid/view/View;

    .line 35
    iput-object v1, p0, Lcom/qihoo/security/ui/main/DragContainer;->e:Landroid/widget/ListView;

    .line 36
    iput-object v1, p0, Lcom/qihoo/security/ui/main/DragContainer;->f:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 62
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/DragContainer;->a(Landroid/content/Context;)V

    .line 63
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 66
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->j:I

    .line 67
    return-void
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 1

    .prologue
    .line 215
    iget-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->b:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 216
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->b:Landroid/view/VelocityTracker;

    .line 218
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->b:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 219
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/main/DragContainer;I)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/DragContainer;->setLayoutParams(I)V

    return-void
.end method

.method private a()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 122
    iget-object v1, p0, Lcom/qihoo/security/ui/main/DragContainer;->e:Landroid/widget/ListView;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/ui/main/DragContainer;->e:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getChildCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 123
    iget-object v1, p0, Lcom/qihoo/security/ui/main/DragContainer;->e:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 127
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    .line 129
    :cond_0
    return v0
.end method

.method private b()V
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->b:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 229
    iget-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->b:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 230
    iget-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->b:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 231
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->b:Landroid/view/VelocityTracker;

    .line 233
    :cond_0
    return-void
.end method

.method private setLayoutParams(I)V
    .locals 2

    .prologue
    .line 201
    iget-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->f:Landroid/view/ViewGroup$MarginLayoutParams;

    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 202
    iget-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->d:Landroid/view/View;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/DragContainer;->f:Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 203
    iget-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 204
    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 183
    .line 184
    iget v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->h:I

    if-lez v0, :cond_0

    .line 185
    sub-int v0, p1, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    iget v2, p0, Lcom/qihoo/security/ui/main/DragContainer;->h:I

    div-int/2addr v0, v2

    .line 187
    :goto_0
    const/4 v2, 0x2

    new-array v2, v2, [I

    aput p1, v2, v1

    const/4 v1, 0x1

    aput p2, v2, v1

    invoke-static {v2}, Lcom/nineoldandroids/a/o;->b([I)Lcom/nineoldandroids/a/o;

    move-result-object v1

    .line 188
    new-instance v2, Lcom/qihoo/security/ui/main/DragContainer$1;

    invoke-direct {v2, p0}, Lcom/qihoo/security/ui/main/DragContainer$1;-><init>(Lcom/qihoo/security/ui/main/DragContainer;)V

    invoke-virtual {v1, v2}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 195
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Lcom/nineoldandroids/a/o;->a(Landroid/view/animation/Interpolator;)V

    .line 196
    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Lcom/nineoldandroids/a/o;->d(J)Lcom/nineoldandroids/a/o;

    .line 197
    invoke-virtual {v1}, Lcom/nineoldandroids/a/o;->a()V

    .line 198
    return-void

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method protected onFinishInflate()V
    .locals 1

    .prologue
    .line 71
    invoke-super {p0}, Landroid/widget/FrameLayout;->onFinishInflate()V

    .line 75
    const v0, 0x7f0b00f1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/DragContainer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->d:Landroid/view/View;

    .line 76
    const v0, 0x7f0b00f2

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/DragContainer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->e:Landroid/widget/ListView;

    .line 77
    iget-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->f:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 78
    iget-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->f:Landroid/view/ViewGroup$MarginLayoutParams;

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->g:I

    iput v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->h:I

    .line 79
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 83
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    .line 87
    packed-switch v1, :pswitch_data_0

    .line 118
    :cond_0
    :goto_0
    :pswitch_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :cond_1
    :goto_1
    return v0

    .line 89
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->k:I

    .line 90
    iget-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->f:Landroid/view/ViewGroup$MarginLayoutParams;

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->g:I

    goto :goto_0

    .line 96
    :pswitch_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    .line 97
    iget v2, p0, Lcom/qihoo/security/ui/main/DragContainer;->k:I

    sub-int/2addr v1, v2

    .line 101
    iget v2, p0, Lcom/qihoo/security/ui/main/DragContainer;->g:I

    if-nez v2, :cond_2

    .line 102
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/DragContainer;->a()Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lcom/qihoo/security/ui/main/DragContainer;->j:I

    if-gt v1, v2, :cond_1

    .line 106
    :cond_2
    iget v2, p0, Lcom/qihoo/security/ui/main/DragContainer;->g:I

    iget v3, p0, Lcom/qihoo/security/ui/main/DragContainer;->h:I

    if-ne v2, v3, :cond_0

    .line 107
    iget v2, p0, Lcom/qihoo/security/ui/main/DragContainer;->j:I

    neg-int v2, v2

    if-ge v1, v2, :cond_0

    goto :goto_1

    .line 87
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 134
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 138
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/DragContainer;->a(Landroid/view/MotionEvent;)V

    .line 139
    packed-switch v0, :pswitch_data_0

    .line 173
    :goto_0
    :pswitch_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 143
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->b:Landroid/view/VelocityTracker;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 144
    iget-object v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->b:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v0

    .line 148
    cmpl-float v1, v0, v2

    if-eqz v1, :cond_0

    .line 149
    iput v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->c:F

    .line 151
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget v1, p0, Lcom/qihoo/security/ui/main/DragContainer;->k:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->l:I

    .line 152
    iget v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->g:I

    iget v1, p0, Lcom/qihoo/security/ui/main/DragContainer;->l:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->i:I

    .line 153
    iget v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->i:I

    if-gez v0, :cond_1

    .line 154
    iput v3, p0, Lcom/qihoo/security/ui/main/DragContainer;->i:I

    .line 156
    :cond_1
    iget v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->i:I

    iget v1, p0, Lcom/qihoo/security/ui/main/DragContainer;->h:I

    if-le v0, v1, :cond_2

    .line 157
    iget v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->h:I

    iput v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->i:I

    .line 159
    :cond_2
    iget v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->i:I

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/DragContainer;->setLayoutParams(I)V

    goto :goto_0

    .line 163
    :pswitch_2
    iget v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->c:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_3

    .line 164
    iget v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->i:I

    iget v1, p0, Lcom/qihoo/security/ui/main/DragContainer;->h:I

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/main/DragContainer;->a(II)V

    .line 168
    :goto_1
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/DragContainer;->b()V

    goto :goto_0

    .line 166
    :cond_3
    iget v0, p0, Lcom/qihoo/security/ui/main/DragContainer;->i:I

    invoke-virtual {p0, v0, v3}, Lcom/qihoo/security/ui/main/DragContainer;->a(II)V

    goto :goto_1

    .line 139
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

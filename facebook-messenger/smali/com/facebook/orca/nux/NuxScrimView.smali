.class public Lcom/facebook/orca/nux/NuxScrimView;
.super Lcom/facebook/orca/nux/e;
.source "NuxScrimView.java"


# instance fields
.field private d:Landroid/view/View;

.field private e:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0, p1}, Lcom/facebook/orca/nux/e;-><init>(Landroid/content/Context;)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/nux/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/nux/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 24
    return-void
.end method

.method private a(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxScrimView;->e:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxScrimView;->e:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 86
    const/4 v0, 0x0

    .line 89
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/nux/NuxScrimView;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/orca/nux/NuxScrimView;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method protected a()V
    .locals 2

    .prologue
    .line 36
    sget v0, Lcom/facebook/k;->orca_nux_scrim:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxScrimView;->setContentView(I)V

    .line 38
    sget v0, Lcom/facebook/i;->nux_scrim_title_bar_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxScrimView;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/nux/NuxScrimView;->d:Landroid/view/View;

    .line 40
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxScrimView;->d:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/nux/g;

    invoke-direct {v1, p0}, Lcom/facebook/orca/nux/g;-><init>(Lcom/facebook/orca/nux/NuxScrimView;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 46
    return-void
.end method

.method public b()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 68
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxScrimView;->e:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/nux/NuxScrimView;->e:Landroid/view/View;

    .line 72
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 73
    const-wide/16 v1, 0xfa

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 74
    invoke-virtual {v0, v3}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    .line 75
    invoke-virtual {v0, v3}, Landroid/view/animation/AlphaAnimation;->setFillEnabled(Z)V

    .line 76
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 77
    iget-object v1, p0, Lcom/facebook/orca/nux/NuxScrimView;->d:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 79
    :cond_0
    return-void
.end method

.method public setOnTitleBarButtonClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxScrimView;->d:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    return-void
.end method

.class public Lcom/hmobile/common/ExpandAnimation;
.super Landroid/view/animation/TranslateAnimation;
.source "ExpandAnimation.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field panelWidth:I

.field private slidingLayout:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;IIFIFIFIF)V
    .locals 9
    .param p1, "layout"    # Landroid/widget/LinearLayout;
    .param p2, "width"    # I
    .param p3, "fromXType"    # I
    .param p4, "fromXValue"    # F
    .param p5, "toXType"    # I
    .param p6, "toXValue"    # F
    .param p7, "fromYType"    # I
    .param p8, "fromYValue"    # F
    .param p9, "toYType"    # I
    .param p10, "toYValue"    # F

    .prologue
    .line 25
    move-object v0, p0

    move v1, p3

    move v2, p4

    move v3, p5

    move v4, p6

    move/from16 v5, p7

    move/from16 v6, p8

    move/from16 v7, p9

    move/from16 v8, p10

    .line 26
    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    .line 29
    iput-object p1, p0, Lcom/hmobile/common/ExpandAnimation;->slidingLayout:Landroid/widget/LinearLayout;

    .line 30
    iput p2, p0, Lcom/hmobile/common/ExpandAnimation;->panelWidth:I

    .line 31
    const-wide/16 v0, 0x190

    invoke-virtual {p0, v0, v1}, Lcom/hmobile/common/ExpandAnimation;->setDuration(J)V

    .line 32
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/hmobile/common/ExpandAnimation;->setFillAfter(Z)V

    .line 33
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {p0, v0}, Lcom/hmobile/common/ExpandAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 34
    invoke-virtual {p0, p0}, Lcom/hmobile/common/ExpandAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 35
    iget-object v0, p0, Lcom/hmobile/common/ExpandAnimation;->slidingLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 36
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2
    .param p1, "arg0"    # Landroid/view/animation/Animation;

    .prologue
    .line 41
    iget-object v1, p0, Lcom/hmobile/common/ExpandAnimation;->slidingLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 42
    .local v0, "params":Landroid/widget/FrameLayout$LayoutParams;
    iget v1, p0, Lcom/hmobile/common/ExpandAnimation;->panelWidth:I

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 43
    const/4 v1, 0x3

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 44
    iget-object v1, p0, Lcom/hmobile/common/ExpandAnimation;->slidingLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->clearAnimation()V

    .line 45
    iget-object v1, p0, Lcom/hmobile/common/ExpandAnimation;->slidingLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 46
    iget-object v1, p0, Lcom/hmobile/common/ExpandAnimation;->slidingLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->requestLayout()V

    .line 48
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "arg0"    # Landroid/view/animation/Animation;

    .prologue
    .line 52
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "arg0"    # Landroid/view/animation/Animation;

    .prologue
    .line 56
    return-void
.end method

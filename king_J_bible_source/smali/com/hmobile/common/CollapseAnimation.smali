.class public Lcom/hmobile/common/CollapseAnimation;
.super Landroid/view/animation/TranslateAnimation;
.source "CollapseAnimation.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field panelWidth:I

.field private slidingLayout:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;IIFIFIFIF)V
    .locals 10
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
    .line 24
    move-object v0, p0

    move v1, p3

    move v2, p4

    move v3, p5

    move/from16 v4, p6

    move/from16 v5, p7

    move/from16 v6, p8

    move/from16 v7, p9

    move/from16 v8, p10

    .line 25
    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    .line 28
    iput-object p1, p0, Lcom/hmobile/common/CollapseAnimation;->slidingLayout:Landroid/widget/LinearLayout;

    .line 29
    iput p2, p0, Lcom/hmobile/common/CollapseAnimation;->panelWidth:I

    .line 30
    const-wide/16 v0, 0x190

    invoke-virtual {p0, v0, v1}, Lcom/hmobile/common/CollapseAnimation;->setDuration(J)V

    .line 31
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/hmobile/common/CollapseAnimation;->setFillAfter(Z)V

    .line 32
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {p0, v0}, Lcom/hmobile/common/CollapseAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 33
    invoke-virtual {p0, p0}, Lcom/hmobile/common/CollapseAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 36
    iget-object v0, p0, Lcom/hmobile/common/CollapseAnimation;->slidingLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Landroid/widget/FrameLayout$LayoutParams;

    .line 37
    .local v9, "params":Landroid/widget/FrameLayout$LayoutParams;
    const/4 v0, 0x0

    iput v0, v9, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 38
    const/4 v0, 0x0

    iput v0, v9, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 39
    iget-object v0, p0, Lcom/hmobile/common/CollapseAnimation;->slidingLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v9}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    iget-object v0, p0, Lcom/hmobile/common/CollapseAnimation;->slidingLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->requestLayout()V

    .line 41
    iget-object v0, p0, Lcom/hmobile/common/CollapseAnimation;->slidingLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 43
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 47
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 51
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 55
    return-void
.end method

.class public final Lcom/thetransitapp/droid/util/ExpandCollapseAnimation;
.super Ljava/lang/Object;
.source "ExpandCollapseAnimation.java"


# static fields
.field private static final DURATION:J = 0xc8L


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    return-void
.end method

.method public static collapse(Landroid/view/View;)V
    .locals 4
    .param p0, "v"    # Landroid/view/View;

    .prologue
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    .line 45
    .local v1, "initialHeight":I
    new-instance v0, Lcom/thetransitapp/droid/util/ExpandCollapseAnimation$2;

    invoke-direct {v0, p0, v1}, Lcom/thetransitapp/droid/util/ExpandCollapseAnimation$2;-><init>(Landroid/view/View;I)V

    .line 62
    .local v0, "a":Landroid/view/animation/Animation;
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v2}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 63
    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 64
    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 65
    return-void
.end method

.method public static expand(Landroid/view/View;Landroid/view/animation/Animation$AnimationListener;)V
    .locals 5
    .param p0, "v"    # Landroid/view/View;
    .param p1, "listener"    # Landroid/view/animation/Animation$AnimationListener;

    .prologue
    const/4 v4, 0x0

    .line 17
    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-virtual {p0, v2, v3}, Landroid/view/View;->measure(II)V

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    .line 20
    .local v1, "targtetHeight":I
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iput v4, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 21
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 22
    new-instance v0, Lcom/thetransitapp/droid/util/ExpandCollapseAnimation$1;

    invoke-direct {v0, p0, v1}, Lcom/thetransitapp/droid/util/ExpandCollapseAnimation$1;-><init>(Landroid/view/View;I)V

    .line 36
    .local v0, "a":Landroid/view/animation/Animation;
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v2}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 37
    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 38
    invoke-virtual {v0, p1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 39
    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 40
    return-void
.end method

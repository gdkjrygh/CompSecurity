.class Lcom/thetransitapp/droid/util/ExpandCollapseAnimation$2;
.super Landroid/view/animation/Animation;
.source "ExpandCollapseAnimation.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/util/ExpandCollapseAnimation;->collapse(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic val$initialHeight:I

.field private final synthetic val$v:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/view/View;I)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/util/ExpandCollapseAnimation$2;->val$v:Landroid/view/View;

    iput p2, p0, Lcom/thetransitapp/droid/util/ExpandCollapseAnimation$2;->val$initialHeight:I

    .line 45
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method protected applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 3
    .param p1, "interpolatedTime"    # F
    .param p2, "t"    # Landroid/view/animation/Transformation;

    .prologue
    .line 48
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/thetransitapp/droid/util/ExpandCollapseAnimation$2;->val$v:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 54
    :goto_0
    return-void

    .line 51
    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/util/ExpandCollapseAnimation$2;->val$v:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v1, p0, Lcom/thetransitapp/droid/util/ExpandCollapseAnimation$2;->val$initialHeight:I

    iget v2, p0, Lcom/thetransitapp/droid/util/ExpandCollapseAnimation$2;->val$initialHeight:I

    int-to-float v2, v2

    mul-float/2addr v2, p1

    float-to-int v2, v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 52
    iget-object v0, p0, Lcom/thetransitapp/droid/util/ExpandCollapseAnimation$2;->val$v:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    goto :goto_0
.end method

.method public willChangeBounds()Z
    .locals 1

    .prologue
    .line 58
    const/4 v0, 0x1

    return v0
.end method

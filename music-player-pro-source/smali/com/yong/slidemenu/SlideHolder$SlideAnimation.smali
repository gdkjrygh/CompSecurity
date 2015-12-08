.class Lcom/yong/slidemenu/SlideHolder$SlideAnimation;
.super Landroid/view/animation/Animation;
.source "SlideHolder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yong/slidemenu/SlideHolder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SlideAnimation"
.end annotation


# static fields
.field private static final SPEED:F = 0.6f


# instance fields
.field private mEnd:F

.field private mStart:F

.field final synthetic this$0:Lcom/yong/slidemenu/SlideHolder;


# direct methods
.method public constructor <init>(Lcom/yong/slidemenu/SlideHolder;FF)V
    .locals 4
    .param p2, "fromX"    # F
    .param p3, "toX"    # F

    .prologue
    .line 694
    iput-object p1, p0, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;->this$0:Lcom/yong/slidemenu/SlideHolder;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 695
    iput p2, p0, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;->mStart:F

    .line 696
    iput p3, p0, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;->mEnd:F

    .line 698
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {p0, v1}, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 700
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;->mEnd:F

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;->mStart:F

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const v2, 0x3f19999a    # 0.6f

    div-float v0, v1, v2

    .line 701
    .local v0, "duration":F
    float-to-long v2, v0

    invoke-virtual {p0, v2, v3}, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;->setDuration(J)V

    .line 702
    return-void
.end method


# virtual methods
.method protected applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 3
    .param p1, "interpolatedTime"    # F
    .param p2, "t"    # Landroid/view/animation/Transformation;

    .prologue
    .line 707
    invoke-super {p0, p1, p2}, Landroid/view/animation/Animation;->applyTransformation(FLandroid/view/animation/Transformation;)V

    .line 709
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;->mEnd:F

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;->mStart:F

    sub-float/2addr v1, v2

    mul-float/2addr v1, p1

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;->mStart:F

    add-float v0, v1, v2

    .line 710
    .local v0, "offset":F
    iget-object v1, p0, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;->this$0:Lcom/yong/slidemenu/SlideHolder;

    float-to-int v2, v0

    invoke-static {v1, v2}, Lcom/yong/slidemenu/SlideHolder;->access$2(Lcom/yong/slidemenu/SlideHolder;I)V

    .line 712
    iget-object v1, p0, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;->this$0:Lcom/yong/slidemenu/SlideHolder;

    invoke-virtual {v1}, Lcom/yong/slidemenu/SlideHolder;->postInvalidate()V

    .line 713
    return-void
.end method

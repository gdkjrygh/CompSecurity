.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$5;
.super Ljava/lang/Object;
.source "MapOverlayDetailFragment.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->animateInMainLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

.field final synthetic val$animator2:Landroid/animation/ObjectAnimator;

.field final synthetic val$photoMaskScaleXEnd:Landroid/animation/ObjectAnimator;

.field final synthetic val$photoMaskScaleYEnd:Landroid/animation/ObjectAnimator;

.field final synthetic val$set2:Landroid/animation/AnimatorSet;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;Landroid/animation/AnimatorSet;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 539
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    iput-object p2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$5;->val$set2:Landroid/animation/AnimatorSet;

    iput-object p3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$5;->val$photoMaskScaleXEnd:Landroid/animation/ObjectAnimator;

    iput-object p4, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$5;->val$photoMaskScaleYEnd:Landroid/animation/ObjectAnimator;

    iput-object p5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$5;->val$animator2:Landroid/animation/ObjectAnimator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 552
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 545
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$700(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mImageWidth:I
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$600(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setPivotX(F)V

    .line 546
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$700(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mImageWidth:I
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$600(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setPivotY(F)V

    .line 547
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$5;->val$set2:Landroid/animation/AnimatorSet;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$5;->val$photoMaskScaleXEnd:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$5;->val$photoMaskScaleYEnd:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$5;->val$animator2:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 548
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$5;->val$set2:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 549
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 555
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 541
    return-void
.end method

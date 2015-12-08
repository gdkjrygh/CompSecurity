.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;
.super Ljava/lang/Object;
.source "MapOverlayDetailFragment.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->animateOutMainLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

.field final synthetic val$photoMaskScaleX:Landroid/animation/ObjectAnimator;

.field final synthetic val$photoMaskScaleY:Landroid/animation/ObjectAnimator;

.field final synthetic val$photoMaskX:Landroid/animation/ObjectAnimator;

.field final synthetic val$photoMaskY:Landroid/animation/ObjectAnimator;

.field final synthetic val$photoScaleX:Landroid/animation/ObjectAnimator;

.field final synthetic val$photoScaleY:Landroid/animation/ObjectAnimator;

.field final synthetic val$photoX:Landroid/animation/ObjectAnimator;

.field final synthetic val$photoY:Landroid/animation/ObjectAnimator;

.field final synthetic val$set:Landroid/animation/AnimatorSet;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;Landroid/animation/AnimatorSet;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 643
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    iput-object p2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$set:Landroid/animation/AnimatorSet;

    iput-object p3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$photoScaleX:Landroid/animation/ObjectAnimator;

    iput-object p4, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$photoScaleY:Landroid/animation/ObjectAnimator;

    iput-object p5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$photoX:Landroid/animation/ObjectAnimator;

    iput-object p6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$photoY:Landroid/animation/ObjectAnimator;

    iput-object p7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$photoMaskScaleX:Landroid/animation/ObjectAnimator;

    iput-object p8, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$photoMaskScaleY:Landroid/animation/ObjectAnimator;

    iput-object p9, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$photoMaskX:Landroid/animation/ObjectAnimator;

    iput-object p10, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$photoMaskY:Landroid/animation/ObjectAnimator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 657
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    const/4 v1, 0x0

    .line 649
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$700(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setPivotX(F)V

    .line 650
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$700(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setPivotY(F)V

    .line 651
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$set:Landroid/animation/AnimatorSet;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$photoScaleX:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$photoScaleY:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$photoX:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$photoY:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$photoMaskScaleX:Landroid/animation/ObjectAnimator;

    .line 652
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$photoMaskScaleY:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$photoMaskX:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$photoMaskY:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 653
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;->val$set:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 654
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 660
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 645
    return-void
.end method

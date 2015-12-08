.class Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$2;
.super Ljava/lang/Object;
.source "TourDetailFragment.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->animateOutMainLayout(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

.field final synthetic val$showTourInMap:Z


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;Z)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    .prologue
    .line 437
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$2;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    iput-boolean p2, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$2;->val$showTourInMap:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 449
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 443
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$2;->val$showTourInMap:Z

    if-nez v0, :cond_0

    .line 444
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$2;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->popBackStack()V

    .line 446
    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 452
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 439
    return-void
.end method

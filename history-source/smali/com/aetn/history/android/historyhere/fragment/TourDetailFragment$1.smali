.class Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$1;
.super Ljava/lang/Object;
.source "TourDetailFragment.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->animateInMainLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    .prologue
    .line 377
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 397
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 385
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mDataLoaded:Z
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 386
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->animateInBottomNav()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->access$100(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)V

    .line 390
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    const/4 v1, 0x1

    # setter for: Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mBeginningAnimationFinished:Z
    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->access$202(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;Z)Z

    .line 392
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 402
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 381
    return-void
.end method

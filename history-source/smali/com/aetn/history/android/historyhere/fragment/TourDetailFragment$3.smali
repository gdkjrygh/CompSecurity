.class Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$3;
.super Ljava/lang/Object;
.source "TourDetailFragment.java"

# interfaces
.implements Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->setListeners()V
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
    .line 478
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollReachedEnd(Z)V
    .locals 12
    .param p1, "tf"    # Z

    .prologue
    const v11, 0x3fa66666    # 1.3f

    const/high16 v10, 0x3f800000    # 1.0f

    const-wide/16 v8, 0xc8

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 482
    if-eqz p1, :cond_0

    .line 483
    # getter for: Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->access$300()Ljava/lang/String;

    move-result-object v3

    const-string v4, "make the start tour button bigger"

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 484
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mStartTourBtn:Landroid/widget/Button;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->access$400(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)Landroid/widget/Button;

    move-result-object v3

    const-string v4, "scaleY"

    new-array v5, v7, [F

    aput v11, v5, v6

    invoke-static {v3, v4, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    .line 485
    .local v1, "scaleY":Landroid/animation/ObjectAnimator;
    invoke-virtual {v1, v8, v9}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 486
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mStartTourBtn:Landroid/widget/Button;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->access$400(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)Landroid/widget/Button;

    move-result-object v3

    const-string v4, "scaleX"

    new-array v5, v7, [F

    aput v11, v5, v6

    invoke-static {v3, v4, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 487
    .local v0, "scaleX":Landroid/animation/ObjectAnimator;
    invoke-virtual {v0, v8, v9}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 488
    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    .line 489
    .local v2, "set":Landroid/animation/AnimatorSet;
    invoke-virtual {v2, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 490
    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->start()V

    .line 501
    :goto_0
    return-void

    .line 492
    .end local v0    # "scaleX":Landroid/animation/ObjectAnimator;
    .end local v1    # "scaleY":Landroid/animation/ObjectAnimator;
    .end local v2    # "set":Landroid/animation/AnimatorSet;
    :cond_0
    # getter for: Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->access$300()Ljava/lang/String;

    move-result-object v3

    const-string v4, "make the start tour button smaller"

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 493
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mStartTourBtn:Landroid/widget/Button;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->access$400(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)Landroid/widget/Button;

    move-result-object v3

    const-string v4, "scaleY"

    new-array v5, v7, [F

    aput v10, v5, v6

    invoke-static {v3, v4, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    .line 494
    .restart local v1    # "scaleY":Landroid/animation/ObjectAnimator;
    invoke-virtual {v1, v8, v9}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 495
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mStartTourBtn:Landroid/widget/Button;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->access$400(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)Landroid/widget/Button;

    move-result-object v3

    const-string v4, "scaleX"

    new-array v5, v7, [F

    aput v10, v5, v6

    invoke-static {v3, v4, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 496
    .restart local v0    # "scaleX":Landroid/animation/ObjectAnimator;
    invoke-virtual {v0, v8, v9}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 497
    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    .line 498
    .restart local v2    # "set":Landroid/animation/AnimatorSet;
    invoke-virtual {v2, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 499
    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->start()V

    goto :goto_0
.end method

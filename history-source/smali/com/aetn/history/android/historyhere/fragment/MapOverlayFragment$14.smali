.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$14;
.super Ljava/lang/Object;
.source "MapOverlayFragment.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->animateCloseDetail()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .prologue
    .line 797
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$14;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 11
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 805
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$14;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v5}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$600(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 806
    const/16 v4, 0x12c

    .line 809
    .local v4, "speed":I
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$14;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTourHeader:Landroid/view/ViewGroup;
    invoke-static {v5}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$1600(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Landroid/view/ViewGroup;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    .line 811
    .local v2, "heightOfHeader":I
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$14;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPager:Landroid/view/ViewGroup;
    invoke-static {v5}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$1200(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Landroid/view/ViewGroup;

    move-result-object v5

    const-string v6, "translationY"

    new-array v7, v10, [F

    int-to-float v8, v2

    aput v8, v7, v9

    invoke-static {v5, v6, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 812
    .local v0, "animator1":Landroid/animation/ObjectAnimator;
    int-to-long v5, v4

    invoke-virtual {v0, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 813
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$14;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTourHeader:Landroid/view/ViewGroup;
    invoke-static {v5}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$1600(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Landroid/view/ViewGroup;

    move-result-object v5

    const-string v6, "translationY"

    new-array v7, v10, [F

    const/4 v8, 0x0

    aput v8, v7, v9

    invoke-static {v5, v6, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    .line 814
    .local v1, "animator2":Landroid/animation/ObjectAnimator;
    int-to-long v5, v4

    invoke-virtual {v1, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 816
    new-instance v3, Landroid/animation/AnimatorSet;

    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    .line 817
    .local v3, "set":Landroid/animation/AnimatorSet;
    invoke-virtual {v3, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 818
    invoke-virtual {v3, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 819
    invoke-virtual {v3}, Landroid/animation/AnimatorSet;->start()V

    .line 821
    .end local v0    # "animator1":Landroid/animation/ObjectAnimator;
    .end local v1    # "animator2":Landroid/animation/ObjectAnimator;
    .end local v2    # "heightOfHeader":I
    .end local v3    # "set":Landroid/animation/AnimatorSet;
    .end local v4    # "speed":I
    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 826
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 801
    return-void
.end method

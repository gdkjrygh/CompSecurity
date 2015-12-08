.class Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$5;
.super Ljava/lang/Object;
.source "ListOverlayDetailFragment.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->animateInMainLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 571
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 589
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    const/4 v1, 0x1

    .line 577
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mDataLoaded:Z
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->access$800(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 578
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->animateInNavItems()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->access$900(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    .line 579
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->setPhotoNumber()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->access$1000(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    .line 580
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryActive:Z
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->access$1100(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 581
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->animatePartialHidePhotoNumber()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    .line 582
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mScroller:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->access$1200(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->allowSwiping(Z)V

    .line 583
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->access$200(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->allowSwiping(Z)V

    .line 585
    :cond_1
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    # setter for: Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mBeginningAnimationFinished:Z
    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->access$1302(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;Z)Z

    .line 586
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 592
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 573
    return-void
.end method

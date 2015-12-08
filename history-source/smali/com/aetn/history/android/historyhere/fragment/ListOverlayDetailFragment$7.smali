.class Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$7;
.super Ljava/lang/Object;
.source "ListOverlayDetailFragment.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->animateOutMainLayout()V
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
    .line 674
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$7;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 686
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    const/4 v1, 0x0

    .line 680
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$7;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mScroller:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->access$1200(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->allowSwiping(Z)V

    .line 681
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$7;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->access$200(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->allowSwiping(Z)V

    .line 682
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$7;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mSmallDetailsView:Landroid/view/ViewGroup;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->access$1400(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 683
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 689
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 676
    return-void
.end method

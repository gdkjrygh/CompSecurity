.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;
.super Ljava/lang/Object;
.source "MapOverlayFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;->onAnimationEnd(Landroid/animation/Animator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;)V
    .locals 0
    .param p1, "this$1"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;

    .prologue
    .line 578
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 581
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$300(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 601
    :goto_0
    return-void

    .line 582
    :cond_0
    const/16 v0, 0x78

    .line 583
    .local v0, "dragAmount":I
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$400(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->getCurrentItem()I

    move-result v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;

    iget-object v2, v2, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$300(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_1

    .line 584
    const/16 v0, -0x8c

    .line 586
    :cond_1
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$400(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->beginFakeDrag()Z

    .line 587
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$400(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    move-result-object v1

    int-to-float v2, v0

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->fakeDragBy(F)V

    .line 588
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1$1;

    invoke-direct {v2, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1$1;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;)V

    const-wide/16 v3, 0x12c

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

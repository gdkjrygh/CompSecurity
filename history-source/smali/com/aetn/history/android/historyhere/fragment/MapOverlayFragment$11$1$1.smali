.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1$1;
.super Ljava/lang/Object;
.source "MapOverlayFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;)V
    .locals 0
    .param p1, "this$2"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;

    .prologue
    .line 588
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1$1;->this$2:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 592
    :try_start_0
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1$1;->this$2:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$400(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->fakeDragBy(F)V

    .line 593
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1$1;->this$2:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$400(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->endFakeDrag()V

    .line 594
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1$1;->this$2:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    const/4 v2, 0x1

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailSwiperShown:Z
    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$1402(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Z)Z

    .line 595
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1$1;->this$2:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$400(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setEnabled(Z)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 599
    :goto_0
    return-void

    .line 596
    :catch_0
    move-exception v0

    .line 597
    .local v0, "e":Ljava/lang/NullPointerException;
    invoke-virtual {v0}, Ljava/lang/NullPointerException;->printStackTrace()V

    goto :goto_0
.end method

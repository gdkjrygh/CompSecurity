.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$13;
.super Ljava/lang/Object;
.source "MapOverlayFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


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
    .line 789
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$13;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 792
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$13;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$600(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v0

    iput-boolean v2, v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mMapDetailActive:Z

    .line 793
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$13;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$13;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$400(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->getCurrentItem()I

    move-result v1

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setNextPreviousIcons(I)V
    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$1300(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;I)V

    .line 794
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$13;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->isDetailOpen:Z
    invoke-static {v0, v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$1502(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Z)Z

    .line 795
    return-void
.end method

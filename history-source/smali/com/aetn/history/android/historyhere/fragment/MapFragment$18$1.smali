.class Lcom/aetn/history/android/historyhere/fragment/MapFragment$18$1;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;)V
    .locals 0
    .param p1, "this$1"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;

    .prologue
    .line 663
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 667
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setPlacesMapListeners()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2700(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    .line 668
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;->val$poi:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setSelectedMarkerByPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 669
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;->val$poi:Lcom/aetn/history/android/historyhere/model/POIDetail;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->showDetailPager(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2600(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 670
    return-void
.end method

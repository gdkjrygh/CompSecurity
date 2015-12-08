.class Lcom/aetn/history/android/historyhere/fragment/MapFragment$17;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapFragment;->displayTargetedPOI(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

.field final synthetic val$poi:Lcom/aetn/history/android/historyhere/model/POIDetail;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 623
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$17;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    iput-object p2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$17;->val$poi:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 627
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$17;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$17;->val$poi:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setSelectedMarkerByPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 628
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$17;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$17;->val$poi:Lcom/aetn/history/android/historyhere/model/POIDetail;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->showDetailPager(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2600(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 629
    return-void
.end method

.class Lcom/aetn/history/android/historyhere/fragment/MapFragment$5;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setTourMapListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 293
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMarkerClick(Lcom/google/android/gms/maps/model/Marker;)Z
    .locals 4
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;

    .prologue
    const/4 v3, 0x1

    .line 296
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "the marker was clicked"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->getTitle()Ljava/lang/String;

    move-result-object v2

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getPoiById(Ljava/lang/String;)Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1600(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Ljava/lang/String;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v0

    .line 298
    .local v0, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v1, v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showDetailPager(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 300
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-virtual {v1, v0, v3}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setSelectedToursMarkerByPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;Z)V

    .line 301
    return v3
.end method

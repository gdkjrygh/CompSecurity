.class Lcom/aetn/history/android/historyhere/fragment/MapFragment$3;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapFragment;->initMap()V
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
    .line 194
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 197
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$100(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 200
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->isUsersLocationKnown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 201
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$100(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setMyLocationEnabled(Z)V

    .line 202
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$100(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/UiSettings;->setMyLocationButtonEnabled(Z)V

    .line 204
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setInitialMapLocation()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$200(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    .line 205
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    new-instance v1, Lcom/google/maps/android/clustering/ClusterManager;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$100(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/google/maps/android/clustering/ClusterManager;-><init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMap;)V

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;
    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$302(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Lcom/google/maps/android/clustering/ClusterManager;)Lcom/google/maps/android/clustering/ClusterManager;

    .line 206
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-direct {v1, v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mPoiRenderer:Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;
    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$402(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;)Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;

    .line 209
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$300(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/maps/android/clustering/ClusterManager;

    move-result-object v0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mPoiRenderer:Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$400(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/maps/android/clustering/ClusterManager;->setRenderer(Lcom/google/maps/android/clustering/view/ClusterRenderer;)V

    .line 210
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$300(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/maps/android/clustering/ClusterManager;

    move-result-object v0

    new-instance v1, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;

    invoke-direct {v1}, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/maps/android/clustering/ClusterManager;->setAlgorithm(Lcom/google/maps/android/clustering/algo/Algorithm;)V

    .line 211
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setListeners()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$500(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    .line 213
    :cond_1
    return-void
.end method

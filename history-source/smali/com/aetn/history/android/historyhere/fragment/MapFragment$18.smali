.class Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapFragment;->showSurpriseMePoi(Lcom/aetn/history/android/historyhere/model/POIDetail;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

.field final synthetic val$ll:Lcom/google/android/gms/maps/model/LatLng;

.field final synthetic val$poi:Lcom/aetn/history/android/historyhere/model/POIDetail;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Lcom/google/android/gms/maps/model/LatLng;Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 657
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    iput-object p2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;->val$ll:Lcom/google/android/gms/maps/model/LatLng;

    iput-object p3, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;->val$poi:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 660
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$100(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;->val$ll:Lcom/google/android/gms/maps/model/LatLng;

    const/high16 v2, 0x41880000    # 17.0f

    invoke-static {v1, v2}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->animateCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 663
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18$1;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18$1;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 672
    return-void
.end method

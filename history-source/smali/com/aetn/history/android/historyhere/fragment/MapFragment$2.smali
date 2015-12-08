.class Lcom/aetn/history/android/historyhere/fragment/MapFragment$2;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Lcom/google/android/gms/maps/OnMapReadyCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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
    .line 179
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$2;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 1
    .param p1, "googleMap"    # Lcom/google/android/gms/maps/GoogleMap;

    .prologue
    .line 181
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$2;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;
    invoke-static {v0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$102(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Lcom/google/android/gms/maps/GoogleMap;)Lcom/google/android/gms/maps/GoogleMap;

    .line 182
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$2;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->initMap()V

    .line 183
    return-void
.end method

.class Lcom/aetn/history/android/historyhere/fragment/MapFragment$13;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$OnMapClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setListeners()V
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
    .line 401
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$13;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMapClick(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 2
    .param p1, "arg0"    # Lcom/google/android/gms/maps/model/LatLng;

    .prologue
    .line 404
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$13;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onMapClick()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 406
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$13;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->clearSelectedMarkerIcon()V

    .line 407
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$13;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideSearch()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1900(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    .line 408
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$13;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideDetailPager()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1800(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    .line 409
    return-void
.end method

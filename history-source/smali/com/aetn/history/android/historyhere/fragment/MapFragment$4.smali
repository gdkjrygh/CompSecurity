.class Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setPlacesMapListeners()V
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
    .line 231
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCameraChange(Lcom/google/android/gms/maps/model/CameraPosition;)V
    .locals 9
    .param p1, "camPos"    # Lcom/google/android/gms/maps/model/CameraPosition;

    .prologue
    const/4 v8, 0x0

    .line 235
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "onCameraChange():lat:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p1, Lcom/google/android/gms/maps/model/CameraPosition;->target:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v6, v6, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "|lng:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p1, Lcom/google/android/gms/maps/model/CameraPosition;->target:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v6, v6, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "|zoom level:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget v6, p1, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->cancelPOIRequest()V
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$600(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    .line 245
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapInited:Z
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$700(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 246
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->isCameraZoomedOutToMax()Z
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$800(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 247
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    const/4 v5, 0x1

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapInited:Z
    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$702(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Z)Z

    .line 256
    :cond_0
    iget-object v4, p1, Lcom/google/android/gms/maps/model/CameraPosition;->target:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v4, v4, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .line 257
    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;
    invoke-static {v6}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$900(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getCurrentSearchLatitude()D

    move-result-wide v6

    sub-double/2addr v4, v6

    .line 256
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    .line 258
    .local v0, "latDiff":D
    iget-object v4, p1, Lcom/google/android/gms/maps/model/CameraPosition;->target:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v4, v4, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .line 259
    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;
    invoke-static {v6}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$900(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getCurrentSearchLongitude()D

    move-result-wide v6

    sub-double/2addr v4, v6

    .line 258
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    .line 262
    .local v2, "lngDiff":D
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->latLngChangeAllowance:D
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)D

    move-result-wide v4

    cmpl-double v4, v0, v4

    if-gtz v4, :cond_1

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->latLngChangeAllowance:D
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)D

    move-result-wide v4

    cmpl-double v4, v2, v4

    if-lez v4, :cond_2

    :cond_1
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .line 263
    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->poiLoading:Ljava/lang/Boolean;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1100(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->selectedMarker:Z
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1200(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 264
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "onCameraChange(): different lat/lng -  UPDATE"

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mapUpdateHandler:Landroid/os/Handler;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1400(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Landroid/os/Handler;

    move-result-object v4

    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mapUpdateRunnable:Ljava/lang/Runnable;
    invoke-static {v5}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1300(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/Runnable;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 268
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mapUpdateHandler:Landroid/os/Handler;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1400(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Landroid/os/Handler;

    move-result-object v4

    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mapUpdateRunnable:Ljava/lang/Runnable;
    invoke-static {v5}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1300(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/Runnable;

    move-result-object v5

    const-wide/16 v6, 0x3e8

    invoke-virtual {v4, v5, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 271
    :cond_2
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->latLngChangeAllowance:D
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)D

    move-result-wide v4

    cmpl-double v4, v0, v4

    if-gtz v4, :cond_3

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->latLngChangeAllowance:D
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)D

    move-result-wide v4

    cmpl-double v4, v2, v4

    if-lez v4, :cond_4

    .line 272
    :cond_3
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->selectedMarker:Z
    invoke-static {v4, v8}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1202(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Z)Z

    .line 274
    :cond_4
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->checkRelocationButton()V
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1500(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    .line 275
    .end local v0    # "latDiff":D
    .end local v2    # "lngDiff":D
    :goto_0
    return-void

    .line 249
    :cond_5
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-virtual {v5}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    invoke-virtual {v5}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f0d004d

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v4

    invoke-virtual {v4}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

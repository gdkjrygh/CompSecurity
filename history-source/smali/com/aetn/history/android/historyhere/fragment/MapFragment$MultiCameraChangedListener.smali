.class public Lcom/aetn/history/android/historyhere/fragment/MapFragment$MultiCameraChangedListener;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/fragment/MapFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MultiCameraChangedListener"
.end annotation


# instance fields
.field mListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;


# direct methods
.method public constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V
    .locals 1
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 1364
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$MultiCameraChangedListener;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1365
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$MultiCameraChangedListener;->mListeners:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public addListener(Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;

    .prologue
    .line 1376
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$MultiCameraChangedListener;->mListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1377
    return-void
.end method

.method public onCameraChange(Lcom/google/android/gms/maps/model/CameraPosition;)V
    .locals 3
    .param p1, "arg0"    # Lcom/google/android/gms/maps/model/CameraPosition;

    .prologue
    .line 1370
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$MultiCameraChangedListener;->mListeners:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;

    .line 1371
    .local v0, "l":Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;
    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;->onCameraChange(Lcom/google/android/gms/maps/model/CameraPosition;)V

    goto :goto_0

    .line 1373
    .end local v0    # "l":Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;
    :cond_0
    return-void
.end method

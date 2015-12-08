.class public interface abstract Lcom/aetn/history/android/historyhere/model/PoiManager$OnUnclusteredMapMarkersListener;
.super Ljava/lang/Object;
.source "PoiManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/model/PoiManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OnUnclusteredMapMarkersListener"
.end annotation


# virtual methods
.method public abstract onUnclusteredPoisChanged()V
.end method

.method public abstract onUnclusteredPoisLoaded(Ljava/util/ArrayList;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;)V"
        }
    .end annotation
.end method

.class public interface abstract Lcom/google/maps/android/clustering/Cluster;
.super Ljava/lang/Object;
.source "Cluster.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/google/maps/android/clustering/ClusterItem;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract getItems()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<TT;>;"
        }
    .end annotation
.end method

.method public abstract getPosition()Lcom/google/android/gms/maps/model/LatLng;
.end method

.method public abstract getSize()I
.end method

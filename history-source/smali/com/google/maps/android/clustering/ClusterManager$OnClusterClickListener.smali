.class public interface abstract Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;
.super Ljava/lang/Object;
.source "ClusterManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/maps/android/clustering/ClusterManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OnClusterClickListener"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/google/maps/android/clustering/ClusterItem;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract onClusterClick(Lcom/google/maps/android/clustering/Cluster;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/Cluster",
            "<TT;>;)Z"
        }
    .end annotation
.end method

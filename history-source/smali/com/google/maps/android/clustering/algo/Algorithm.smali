.class public interface abstract Lcom/google/maps/android/clustering/algo/Algorithm;
.super Ljava/lang/Object;
.source "Algorithm.java"


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
.method public abstract addItem(Lcom/google/maps/android/clustering/ClusterItem;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public abstract addItems(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<TT;>;)V"
        }
    .end annotation
.end method

.method public abstract clearItems()V
.end method

.method public abstract getClusters(D)Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Ljava/util/Set",
            "<+",
            "Lcom/google/maps/android/clustering/Cluster",
            "<TT;>;>;"
        }
    .end annotation
.end method

.method public abstract getItems()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<TT;>;"
        }
    .end annotation
.end method

.method public abstract removeItem(Lcom/google/maps/android/clustering/ClusterItem;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

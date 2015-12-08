.class Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;
.super Ljava/lang/Object;
.source "DefaultClusterRenderer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "MarkerCache"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private mCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<TT;",
            "Lcom/google/android/gms/maps/model/Marker;",
            ">;"
        }
    .end annotation
.end field

.field private mCacheReverse:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/maps/model/Marker;",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 672
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 673
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;->mCache:Ljava/util/Map;

    .line 674
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;->mCacheReverse:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$1;

    .prologue
    .line 672
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache<TT;>;"
    invoke-direct {p0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;-><init>()V

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Lcom/google/android/gms/maps/model/Marker;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/google/android/gms/maps/model/Marker;"
        }
    .end annotation

    .prologue
    .line 677
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache<TT;>;"
    .local p1, "item":Ljava/lang/Object;, "TT;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;->mCache:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/Marker;

    return-object v0
.end method

.method public get(Lcom/google/android/gms/maps/model/Marker;)Ljava/lang/Object;
    .locals 1
    .param p1, "m"    # Lcom/google/android/gms/maps/model/Marker;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/maps/model/Marker;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 681
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache<TT;>;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;->mCacheReverse:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public put(Ljava/lang/Object;Lcom/google/android/gms/maps/model/Marker;)V
    .locals 1
    .param p2, "m"    # Lcom/google/android/gms/maps/model/Marker;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/android/gms/maps/model/Marker;",
            ")V"
        }
    .end annotation

    .prologue
    .line 685
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache<TT;>;"
    .local p1, "item":Ljava/lang/Object;, "TT;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;->mCache:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 686
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;->mCacheReverse:Ljava/util/Map;

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 687
    return-void
.end method

.method public remove(Lcom/google/android/gms/maps/model/Marker;)V
    .locals 2
    .param p1, "m"    # Lcom/google/android/gms/maps/model/Marker;

    .prologue
    .line 690
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache<TT;>;"
    iget-object v1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;->mCacheReverse:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 691
    .local v0, "item":Ljava/lang/Object;, "TT;"
    iget-object v1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;->mCacheReverse:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 692
    iget-object v1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;->mCache:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 693
    return-void
.end method

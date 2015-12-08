.class public Lcom/google/maps/android/MarkerManager;
.super Ljava/lang/Object;
.source "MarkerManager.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;
.implements Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;
.implements Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;
.implements Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/maps/android/MarkerManager$Collection;
    }
.end annotation


# instance fields
.field private final mAllMarkers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/maps/model/Marker;",
            "Lcom/google/maps/android/MarkerManager$Collection;",
            ">;"
        }
    .end annotation
.end field

.field private final mMap:Lcom/google/android/gms/maps/GoogleMap;

.field private final mNamedCollections:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/maps/android/MarkerManager$Collection;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 1
    .param p1, "map"    # Lcom/google/android/gms/maps/GoogleMap;

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/maps/android/MarkerManager;->mNamedCollections:Ljava/util/Map;

    .line 26
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/maps/android/MarkerManager;->mAllMarkers:Ljava/util/Map;

    .line 29
    iput-object p1, p0, Lcom/google/maps/android/MarkerManager;->mMap:Lcom/google/android/gms/maps/GoogleMap;

    .line 30
    return-void
.end method

.method static synthetic access$400(Lcom/google/maps/android/MarkerManager;)Lcom/google/android/gms/maps/GoogleMap;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/MarkerManager;

    .prologue
    .line 22
    iget-object v0, p0, Lcom/google/maps/android/MarkerManager;->mMap:Lcom/google/android/gms/maps/GoogleMap;

    return-object v0
.end method

.method static synthetic access$500(Lcom/google/maps/android/MarkerManager;)Ljava/util/Map;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/MarkerManager;

    .prologue
    .line 22
    iget-object v0, p0, Lcom/google/maps/android/MarkerManager;->mAllMarkers:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public getCollection(Ljava/lang/String;)Lcom/google/maps/android/MarkerManager$Collection;
    .locals 1
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 54
    iget-object v0, p0, Lcom/google/maps/android/MarkerManager;->mNamedCollections:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/maps/android/MarkerManager$Collection;

    return-object v0
.end method

.method public getInfoContents(Lcom/google/android/gms/maps/model/Marker;)Landroid/view/View;
    .locals 2
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;

    .prologue
    .line 68
    iget-object v1, p0, Lcom/google/maps/android/MarkerManager;->mAllMarkers:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/maps/android/MarkerManager$Collection;

    .line 69
    .local v0, "collection":Lcom/google/maps/android/MarkerManager$Collection;
    if-eqz v0, :cond_0

    # getter for: Lcom/google/maps/android/MarkerManager$Collection;->mInfoWindowAdapter:Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;
    invoke-static {v0}, Lcom/google/maps/android/MarkerManager$Collection;->access$000(Lcom/google/maps/android/MarkerManager$Collection;)Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 70
    # getter for: Lcom/google/maps/android/MarkerManager$Collection;->mInfoWindowAdapter:Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;
    invoke-static {v0}, Lcom/google/maps/android/MarkerManager$Collection;->access$000(Lcom/google/maps/android/MarkerManager$Collection;)Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;->getInfoContents(Lcom/google/android/gms/maps/model/Marker;)Landroid/view/View;

    move-result-object v1

    .line 72
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public getInfoWindow(Lcom/google/android/gms/maps/model/Marker;)Landroid/view/View;
    .locals 2
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;

    .prologue
    .line 59
    iget-object v1, p0, Lcom/google/maps/android/MarkerManager;->mAllMarkers:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/maps/android/MarkerManager$Collection;

    .line 60
    .local v0, "collection":Lcom/google/maps/android/MarkerManager$Collection;
    if-eqz v0, :cond_0

    # getter for: Lcom/google/maps/android/MarkerManager$Collection;->mInfoWindowAdapter:Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;
    invoke-static {v0}, Lcom/google/maps/android/MarkerManager$Collection;->access$000(Lcom/google/maps/android/MarkerManager$Collection;)Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 61
    # getter for: Lcom/google/maps/android/MarkerManager$Collection;->mInfoWindowAdapter:Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;
    invoke-static {v0}, Lcom/google/maps/android/MarkerManager$Collection;->access$000(Lcom/google/maps/android/MarkerManager$Collection;)Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;->getInfoWindow(Lcom/google/android/gms/maps/model/Marker;)Landroid/view/View;

    move-result-object v1

    .line 63
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public newCollection()Lcom/google/maps/android/MarkerManager$Collection;
    .locals 1

    .prologue
    .line 33
    new-instance v0, Lcom/google/maps/android/MarkerManager$Collection;

    invoke-direct {v0, p0}, Lcom/google/maps/android/MarkerManager$Collection;-><init>(Lcom/google/maps/android/MarkerManager;)V

    return-object v0
.end method

.method public newCollection(Ljava/lang/String;)Lcom/google/maps/android/MarkerManager$Collection;
    .locals 4
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 41
    iget-object v1, p0, Lcom/google/maps/android/MarkerManager;->mNamedCollections:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 42
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "collection id is not unique: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 44
    :cond_0
    new-instance v0, Lcom/google/maps/android/MarkerManager$Collection;

    invoke-direct {v0, p0}, Lcom/google/maps/android/MarkerManager$Collection;-><init>(Lcom/google/maps/android/MarkerManager;)V

    .line 45
    .local v0, "collection":Lcom/google/maps/android/MarkerManager$Collection;
    iget-object v1, p0, Lcom/google/maps/android/MarkerManager;->mNamedCollections:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    return-object v0
.end method

.method public onInfoWindowClick(Lcom/google/android/gms/maps/model/Marker;)V
    .locals 2
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;

    .prologue
    .line 77
    iget-object v1, p0, Lcom/google/maps/android/MarkerManager;->mAllMarkers:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/maps/android/MarkerManager$Collection;

    .line 78
    .local v0, "collection":Lcom/google/maps/android/MarkerManager$Collection;
    if-eqz v0, :cond_0

    # getter for: Lcom/google/maps/android/MarkerManager$Collection;->mInfoWindowClickListener:Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;
    invoke-static {v0}, Lcom/google/maps/android/MarkerManager$Collection;->access$100(Lcom/google/maps/android/MarkerManager$Collection;)Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 79
    # getter for: Lcom/google/maps/android/MarkerManager$Collection;->mInfoWindowClickListener:Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;
    invoke-static {v0}, Lcom/google/maps/android/MarkerManager$Collection;->access$100(Lcom/google/maps/android/MarkerManager$Collection;)Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;->onInfoWindowClick(Lcom/google/android/gms/maps/model/Marker;)V

    .line 81
    :cond_0
    return-void
.end method

.method public onMarkerClick(Lcom/google/android/gms/maps/model/Marker;)Z
    .locals 2
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;

    .prologue
    .line 85
    iget-object v1, p0, Lcom/google/maps/android/MarkerManager;->mAllMarkers:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/maps/android/MarkerManager$Collection;

    .line 86
    .local v0, "collection":Lcom/google/maps/android/MarkerManager$Collection;
    if-eqz v0, :cond_0

    # getter for: Lcom/google/maps/android/MarkerManager$Collection;->mMarkerClickListener:Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;
    invoke-static {v0}, Lcom/google/maps/android/MarkerManager$Collection;->access$200(Lcom/google/maps/android/MarkerManager$Collection;)Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 87
    # getter for: Lcom/google/maps/android/MarkerManager$Collection;->mMarkerClickListener:Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;
    invoke-static {v0}, Lcom/google/maps/android/MarkerManager$Collection;->access$200(Lcom/google/maps/android/MarkerManager$Collection;)Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;->onMarkerClick(Lcom/google/android/gms/maps/model/Marker;)Z

    move-result v1

    .line 89
    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public onMarkerDrag(Lcom/google/android/gms/maps/model/Marker;)V
    .locals 2
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;

    .prologue
    .line 102
    iget-object v1, p0, Lcom/google/maps/android/MarkerManager;->mAllMarkers:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/maps/android/MarkerManager$Collection;

    .line 103
    .local v0, "collection":Lcom/google/maps/android/MarkerManager$Collection;
    if-eqz v0, :cond_0

    # getter for: Lcom/google/maps/android/MarkerManager$Collection;->mMarkerDragListener:Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;
    invoke-static {v0}, Lcom/google/maps/android/MarkerManager$Collection;->access$300(Lcom/google/maps/android/MarkerManager$Collection;)Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 104
    # getter for: Lcom/google/maps/android/MarkerManager$Collection;->mMarkerDragListener:Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;
    invoke-static {v0}, Lcom/google/maps/android/MarkerManager$Collection;->access$300(Lcom/google/maps/android/MarkerManager$Collection;)Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;->onMarkerDrag(Lcom/google/android/gms/maps/model/Marker;)V

    .line 106
    :cond_0
    return-void
.end method

.method public onMarkerDragEnd(Lcom/google/android/gms/maps/model/Marker;)V
    .locals 2
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;

    .prologue
    .line 110
    iget-object v1, p0, Lcom/google/maps/android/MarkerManager;->mAllMarkers:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/maps/android/MarkerManager$Collection;

    .line 111
    .local v0, "collection":Lcom/google/maps/android/MarkerManager$Collection;
    if-eqz v0, :cond_0

    # getter for: Lcom/google/maps/android/MarkerManager$Collection;->mMarkerDragListener:Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;
    invoke-static {v0}, Lcom/google/maps/android/MarkerManager$Collection;->access$300(Lcom/google/maps/android/MarkerManager$Collection;)Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 112
    # getter for: Lcom/google/maps/android/MarkerManager$Collection;->mMarkerDragListener:Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;
    invoke-static {v0}, Lcom/google/maps/android/MarkerManager$Collection;->access$300(Lcom/google/maps/android/MarkerManager$Collection;)Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;->onMarkerDragEnd(Lcom/google/android/gms/maps/model/Marker;)V

    .line 114
    :cond_0
    return-void
.end method

.method public onMarkerDragStart(Lcom/google/android/gms/maps/model/Marker;)V
    .locals 2
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;

    .prologue
    .line 94
    iget-object v1, p0, Lcom/google/maps/android/MarkerManager;->mAllMarkers:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/maps/android/MarkerManager$Collection;

    .line 95
    .local v0, "collection":Lcom/google/maps/android/MarkerManager$Collection;
    if-eqz v0, :cond_0

    # getter for: Lcom/google/maps/android/MarkerManager$Collection;->mMarkerDragListener:Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;
    invoke-static {v0}, Lcom/google/maps/android/MarkerManager$Collection;->access$300(Lcom/google/maps/android/MarkerManager$Collection;)Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 96
    # getter for: Lcom/google/maps/android/MarkerManager$Collection;->mMarkerDragListener:Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;
    invoke-static {v0}, Lcom/google/maps/android/MarkerManager$Collection;->access$300(Lcom/google/maps/android/MarkerManager$Collection;)Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;->onMarkerDragStart(Lcom/google/android/gms/maps/model/Marker;)V

    .line 98
    :cond_0
    return-void
.end method

.method public remove(Lcom/google/android/gms/maps/model/Marker;)Z
    .locals 2
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;

    .prologue
    .line 123
    iget-object v1, p0, Lcom/google/maps/android/MarkerManager;->mAllMarkers:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/maps/android/MarkerManager$Collection;

    .line 124
    .local v0, "collection":Lcom/google/maps/android/MarkerManager$Collection;
    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/maps/android/MarkerManager$Collection;->remove(Lcom/google/android/gms/maps/model/Marker;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

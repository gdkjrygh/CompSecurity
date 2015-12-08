.class public Lcom/google/maps/android/MarkerManager$Collection;
.super Ljava/lang/Object;
.source "MarkerManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/maps/android/MarkerManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Collection"
.end annotation


# instance fields
.field private mInfoWindowAdapter:Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;

.field private mInfoWindowClickListener:Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;

.field private mMarkerClickListener:Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;

.field private mMarkerDragListener:Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;

.field private final mMarkers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/maps/model/Marker;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/google/maps/android/MarkerManager;


# direct methods
.method public constructor <init>(Lcom/google/maps/android/MarkerManager;)V
    .locals 1

    .prologue
    .line 134
    iput-object p1, p0, Lcom/google/maps/android/MarkerManager$Collection;->this$0:Lcom/google/maps/android/MarkerManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/maps/android/MarkerManager$Collection;->mMarkers:Ljava/util/Set;

    .line 135
    return-void
.end method

.method static synthetic access$000(Lcom/google/maps/android/MarkerManager$Collection;)Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/MarkerManager$Collection;

    .prologue
    .line 127
    iget-object v0, p0, Lcom/google/maps/android/MarkerManager$Collection;->mInfoWindowAdapter:Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;

    return-object v0
.end method

.method static synthetic access$100(Lcom/google/maps/android/MarkerManager$Collection;)Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/MarkerManager$Collection;

    .prologue
    .line 127
    iget-object v0, p0, Lcom/google/maps/android/MarkerManager$Collection;->mInfoWindowClickListener:Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;

    return-object v0
.end method

.method static synthetic access$200(Lcom/google/maps/android/MarkerManager$Collection;)Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/MarkerManager$Collection;

    .prologue
    .line 127
    iget-object v0, p0, Lcom/google/maps/android/MarkerManager$Collection;->mMarkerClickListener:Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;

    return-object v0
.end method

.method static synthetic access$300(Lcom/google/maps/android/MarkerManager$Collection;)Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/MarkerManager$Collection;

    .prologue
    .line 127
    iget-object v0, p0, Lcom/google/maps/android/MarkerManager$Collection;->mMarkerDragListener:Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;

    return-object v0
.end method


# virtual methods
.method public addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;
    .locals 2
    .param p1, "opts"    # Lcom/google/android/gms/maps/model/MarkerOptions;

    .prologue
    .line 138
    iget-object v1, p0, Lcom/google/maps/android/MarkerManager$Collection;->this$0:Lcom/google/maps/android/MarkerManager;

    # getter for: Lcom/google/maps/android/MarkerManager;->mMap:Lcom/google/android/gms/maps/GoogleMap;
    invoke-static {v1}, Lcom/google/maps/android/MarkerManager;->access$400(Lcom/google/maps/android/MarkerManager;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    .line 139
    .local v0, "marker":Lcom/google/android/gms/maps/model/Marker;
    iget-object v1, p0, Lcom/google/maps/android/MarkerManager$Collection;->mMarkers:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 140
    iget-object v1, p0, Lcom/google/maps/android/MarkerManager$Collection;->this$0:Lcom/google/maps/android/MarkerManager;

    # getter for: Lcom/google/maps/android/MarkerManager;->mAllMarkers:Ljava/util/Map;
    invoke-static {v1}, Lcom/google/maps/android/MarkerManager;->access$500(Lcom/google/maps/android/MarkerManager;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    return-object v0
.end method

.method public clear()V
    .locals 3

    .prologue
    .line 154
    iget-object v2, p0, Lcom/google/maps/android/MarkerManager$Collection;->mMarkers:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/Marker;

    .line 155
    .local v1, "marker":Lcom/google/android/gms/maps/model/Marker;
    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    .line 156
    iget-object v2, p0, Lcom/google/maps/android/MarkerManager$Collection;->this$0:Lcom/google/maps/android/MarkerManager;

    # getter for: Lcom/google/maps/android/MarkerManager;->mAllMarkers:Ljava/util/Map;
    invoke-static {v2}, Lcom/google/maps/android/MarkerManager;->access$500(Lcom/google/maps/android/MarkerManager;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 158
    .end local v1    # "marker":Lcom/google/android/gms/maps/model/Marker;
    :cond_0
    iget-object v2, p0, Lcom/google/maps/android/MarkerManager$Collection;->mMarkers:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->clear()V

    .line 159
    return-void
.end method

.method public getMarkers()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/maps/model/Marker;",
            ">;"
        }
    .end annotation

    .prologue
    .line 162
    iget-object v0, p0, Lcom/google/maps/android/MarkerManager$Collection;->mMarkers:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public remove(Lcom/google/android/gms/maps/model/Marker;)Z
    .locals 1
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;

    .prologue
    .line 145
    iget-object v0, p0, Lcom/google/maps/android/MarkerManager$Collection;->mMarkers:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    iget-object v0, p0, Lcom/google/maps/android/MarkerManager$Collection;->this$0:Lcom/google/maps/android/MarkerManager;

    # getter for: Lcom/google/maps/android/MarkerManager;->mAllMarkers:Ljava/util/Map;
    invoke-static {v0}, Lcom/google/maps/android/MarkerManager;->access$500(Lcom/google/maps/android/MarkerManager;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    .line 148
    const/4 v0, 0x1

    .line 150
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setOnInfoWindowAdapter(Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;)V
    .locals 0
    .param p1, "infoWindowAdapter"    # Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;

    .prologue
    .line 178
    iput-object p1, p0, Lcom/google/maps/android/MarkerManager$Collection;->mInfoWindowAdapter:Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;

    .line 179
    return-void
.end method

.method public setOnInfoWindowClickListener(Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;)V
    .locals 0
    .param p1, "infoWindowClickListener"    # Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;

    .prologue
    .line 166
    iput-object p1, p0, Lcom/google/maps/android/MarkerManager$Collection;->mInfoWindowClickListener:Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;

    .line 167
    return-void
.end method

.method public setOnMarkerClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;)V
    .locals 0
    .param p1, "markerClickListener"    # Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;

    .prologue
    .line 170
    iput-object p1, p0, Lcom/google/maps/android/MarkerManager$Collection;->mMarkerClickListener:Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;

    .line 171
    return-void
.end method

.method public setOnMarkerDragListener(Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;)V
    .locals 0
    .param p1, "markerDragListener"    # Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;

    .prologue
    .line 174
    iput-object p1, p0, Lcom/google/maps/android/MarkerManager$Collection;->mMarkerDragListener:Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;

    .line 175
    return-void
.end method

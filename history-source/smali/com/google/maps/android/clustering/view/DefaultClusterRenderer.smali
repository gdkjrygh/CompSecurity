.class public Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;
.super Ljava/lang/Object;
.source "DefaultClusterRenderer.java"

# interfaces
.implements Lcom/google/maps/android/clustering/view/ClusterRenderer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;,
        Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;,
        Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;,
        Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;,
        Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;,
        Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;,
        Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/google/maps/android/clustering/ClusterItem;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/maps/android/clustering/view/ClusterRenderer",
        "<TT;>;"
    }
.end annotation


# static fields
.field private static final ANIMATION_INTERP:Landroid/animation/TimeInterpolator;

.field private static final BUCKETS:[I

.field private static final MIN_CLUSTER_SIZE:I = 0x4

.field private static final SHOULD_ANIMATE:Z


# instance fields
.field private mClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/clustering/ClusterManager",
            "<TT;>;"
        }
    .end annotation
.end field

.field private mClusterToMarker:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/maps/android/clustering/Cluster",
            "<TT;>;",
            "Lcom/google/android/gms/maps/model/Marker;",
            ">;"
        }
    .end annotation
.end field

.field private mClusters:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<+",
            "Lcom/google/maps/android/clustering/Cluster",
            "<TT;>;>;"
        }
    .end annotation
.end field

.field private mColoredCircleBackground:Landroid/graphics/drawable/ShapeDrawable;

.field private final mDensity:F

.field private final mIconGenerator:Lcom/google/maps/android/ui/IconGenerator;

.field private mIcons:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/google/android/gms/maps/model/BitmapDescriptor;",
            ">;"
        }
    .end annotation
.end field

.field private mInfoWindowClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener",
            "<TT;>;"
        }
    .end annotation
.end field

.field private mItemClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener",
            "<TT;>;"
        }
    .end annotation
.end field

.field private mItemInfoWindowClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final mMap:Lcom/google/android/gms/maps/GoogleMap;

.field private mMarkerCache:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache",
            "<TT;>;"
        }
    .end annotation
.end field

.field private mMarkerToCluster:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/maps/model/Marker;",
            "Lcom/google/maps/android/clustering/Cluster",
            "<TT;>;>;"
        }
    .end annotation
.end field

.field private mMarkers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;",
            ">;"
        }
    .end annotation
.end field

.field private final mViewModifier:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer",
            "<TT;>.ViewModifier;"
        }
    .end annotation
.end field

.field private mZoom:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 61
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->SHOULD_ANIMATE:Z

    .line 67
    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->BUCKETS:[I

    .line 859
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->ANIMATION_INTERP:Landroid/animation/TimeInterpolator;

    return-void

    .line 61
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 67
    nop

    :array_0
    .array-data 4
        0xa
        0x14
        0x32
        0x64
        0xc8
        0x1f4
        0x3e8
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMap;Lcom/google/maps/android/clustering/ClusterManager;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "map"    # Lcom/google/android/gms/maps/GoogleMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/maps/GoogleMap;",
            "Lcom/google/maps/android/clustering/ClusterManager",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    .local p3, "clusterManager":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    const/4 v1, 0x0

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkers:Ljava/util/Set;

    .line 79
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mIcons:Landroid/util/SparseArray;

    .line 84
    new-instance v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;

    invoke-direct {v0, v1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;-><init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$1;)V

    iput-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkerCache:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;

    .line 99
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkerToCluster:Ljava/util/Map;

    .line 100
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusterToMarker:Ljava/util/Map;

    .line 107
    new-instance v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;

    invoke-direct {v0, p0, v1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;-><init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$1;)V

    iput-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mViewModifier:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;

    .line 115
    iput-object p2, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMap:Lcom/google/android/gms/maps/GoogleMap;

    .line 116
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mDensity:F

    .line 117
    new-instance v0, Lcom/google/maps/android/ui/IconGenerator;

    invoke-direct {v0, p1}, Lcom/google/maps/android/ui/IconGenerator;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mIconGenerator:Lcom/google/maps/android/ui/IconGenerator;

    .line 118
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mIconGenerator:Lcom/google/maps/android/ui/IconGenerator;

    invoke-direct {p0, p1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->makeSquareTextView(Landroid/content/Context;)Lcom/google/maps/android/ui/SquareTextView;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/maps/android/ui/IconGenerator;->setContentView(Landroid/view/View;)V

    .line 119
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mIconGenerator:Lcom/google/maps/android/ui/IconGenerator;

    sget v1, Lcom/google/maps/android/R$style;->ClusterIcon_TextAppearance:I

    invoke-virtual {v0, v1}, Lcom/google/maps/android/ui/IconGenerator;->setTextAppearance(I)V

    .line 120
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mIconGenerator:Lcom/google/maps/android/ui/IconGenerator;

    invoke-direct {p0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->makeClusterBackground()Landroid/graphics/drawable/LayerDrawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/maps/android/ui/IconGenerator;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 121
    iput-object p3, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    .line 122
    return-void
.end method

.method static synthetic access$1000(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)F
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    .prologue
    .line 60
    iget v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mZoom:F

    return v0
.end method

.method static synthetic access$1002(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;F)F
    .locals 0
    .param p0, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;
    .param p1, "x1"    # F

    .prologue
    .line 60
    iput p1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mZoom:F

    return p1
.end method

.method static synthetic access$1100(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Ljava/util/Set;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    .prologue
    .line 60
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusters:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic access$1102(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;Ljava/util/Set;)Ljava/util/Set;
    .locals 0
    .param p0, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;
    .param p1, "x1"    # Ljava/util/Set;

    .prologue
    .line 60
    iput-object p1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusters:Ljava/util/Set;

    return-object p1
.end method

.method static synthetic access$1300(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Ljava/util/Set;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    .prologue
    .line 60
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkers:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic access$1302(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;Ljava/util/Set;)Ljava/util/Set;
    .locals 0
    .param p0, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;
    .param p1, "x1"    # Ljava/util/Set;

    .prologue
    .line 60
    iput-object p1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkers:Ljava/util/Set;

    return-object p1
.end method

.method static synthetic access$1400()Z
    .locals 1

    .prologue
    .line 60
    sget-boolean v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->SHOULD_ANIMATE:Z

    return v0
.end method

.method static synthetic access$1500(Ljava/util/List;Lcom/google/maps/android/geometry/Point;)Lcom/google/maps/android/geometry/Point;
    .locals 1
    .param p0, "x0"    # Ljava/util/List;
    .param p1, "x1"    # Lcom/google/maps/android/geometry/Point;

    .prologue
    .line 60
    invoke-static {p0, p1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->findClosestCluster(Ljava/util/List;Lcom/google/maps/android/geometry/Point;)Lcom/google/maps/android/geometry/Point;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1900(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/maps/android/clustering/ClusterManager;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    .prologue
    .line 60
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    return-object v0
.end method

.method static synthetic access$200(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    .prologue
    .line 60
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mItemClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener;

    return-object v0
.end method

.method static synthetic access$2100(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Ljava/util/Map;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    .prologue
    .line 60
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusterToMarker:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$2300()Landroid/animation/TimeInterpolator;
    .locals 1

    .prologue
    .line 60
    sget-object v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->ANIMATION_INTERP:Landroid/animation/TimeInterpolator;

    return-object v0
.end method

.method static synthetic access$300(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    .prologue
    .line 60
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkerCache:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;

    return-object v0
.end method

.method static synthetic access$400(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    .prologue
    .line 60
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mItemInfoWindowClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;

    return-object v0
.end method

.method static synthetic access$500(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    .prologue
    .line 60
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;

    return-object v0
.end method

.method static synthetic access$600(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Ljava/util/Map;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    .prologue
    .line 60
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkerToCluster:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$700(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    .prologue
    .line 60
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mInfoWindowClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener;

    return-object v0
.end method

.method static synthetic access$800(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/android/gms/maps/GoogleMap;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    .prologue
    .line 60
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMap:Lcom/google/android/gms/maps/GoogleMap;

    return-object v0
.end method

.method private static distanceSquared(Lcom/google/maps/android/geometry/Point;Lcom/google/maps/android/geometry/Point;)D
    .locals 8
    .param p0, "a"    # Lcom/google/maps/android/geometry/Point;
    .param p1, "b"    # Lcom/google/maps/android/geometry/Point;

    .prologue
    .line 457
    iget-wide v0, p0, Lcom/google/maps/android/geometry/Point;->x:D

    iget-wide v2, p1, Lcom/google/maps/android/geometry/Point;->x:D

    sub-double/2addr v0, v2

    iget-wide v2, p0, Lcom/google/maps/android/geometry/Point;->x:D

    iget-wide v4, p1, Lcom/google/maps/android/geometry/Point;->x:D

    sub-double/2addr v2, v4

    mul-double/2addr v0, v2

    iget-wide v2, p0, Lcom/google/maps/android/geometry/Point;->y:D

    iget-wide v4, p1, Lcom/google/maps/android/geometry/Point;->y:D

    sub-double/2addr v2, v4

    iget-wide v4, p0, Lcom/google/maps/android/geometry/Point;->y:D

    iget-wide v6, p1, Lcom/google/maps/android/geometry/Point;->y:D

    sub-double/2addr v4, v6

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    return-wide v0
.end method

.method private static findClosestCluster(Ljava/util/List;Lcom/google/maps/android/geometry/Point;)Lcom/google/maps/android/geometry/Point;
    .locals 8
    .param p1, "point"    # Lcom/google/maps/android/geometry/Point;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/maps/android/geometry/Point;",
            ">;",
            "Lcom/google/maps/android/geometry/Point;",
            ")",
            "Lcom/google/maps/android/geometry/Point;"
        }
    .end annotation

    .prologue
    .line 461
    .local p0, "markers":Ljava/util/List;, "Ljava/util/List<Lcom/google/maps/android/geometry/Point;>;"
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_2

    :cond_0
    const/4 v1, 0x0

    .line 473
    :cond_1
    return-object v1

    .line 464
    :cond_2
    const-wide v5, 0x40c3880000000000L    # 10000.0

    .line 465
    .local v5, "minDistSquared":D
    const/4 v1, 0x0

    .line 466
    .local v1, "closest":Lcom/google/maps/android/geometry/Point;
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .local v4, "i$":Ljava/util/Iterator;
    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/maps/android/geometry/Point;

    .line 467
    .local v0, "candidate":Lcom/google/maps/android/geometry/Point;
    invoke-static {v0, p1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->distanceSquared(Lcom/google/maps/android/geometry/Point;Lcom/google/maps/android/geometry/Point;)D

    move-result-wide v2

    .line 468
    .local v2, "dist":D
    cmpg-double v7, v2, v5

    if-gez v7, :cond_3

    .line 469
    move-object v1, v0

    .line 470
    move-wide v5, v2

    goto :goto_0
.end method

.method private getColor(I)I
    .locals 7
    .param p1, "clusterSize"    # I

    .prologue
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    const/high16 v5, 0x43960000    # 300.0f

    .line 186
    const/high16 v1, 0x435c0000    # 220.0f

    .line 187
    .local v1, "hueRange":F
    const/high16 v3, 0x43960000    # 300.0f

    .line 188
    .local v3, "sizeRange":F
    int-to-float v4, p1

    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v2

    .line 189
    .local v2, "size":F
    sub-float v4, v5, v2

    sub-float/2addr v5, v2

    mul-float/2addr v4, v5

    const v5, 0x47afc800    # 90000.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x435c0000    # 220.0f

    mul-float v0, v4, v5

    .line 190
    .local v0, "hue":F
    const/4 v4, 0x3

    new-array v4, v4, [F

    const/4 v5, 0x0

    aput v0, v4, v5

    const/4 v5, 0x1

    const/high16 v6, 0x3f800000    # 1.0f

    aput v6, v4, v5

    const/4 v5, 0x2

    const v6, 0x3f19999a    # 0.6f

    aput v6, v4, v5

    invoke-static {v4}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v4

    return v4
.end method

.method private makeClusterBackground()Landroid/graphics/drawable/LayerDrawable;
    .locals 7

    .prologue
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    const/4 v1, 0x1

    .line 166
    new-instance v3, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v4, Landroid/graphics/drawable/shapes/OvalShape;

    invoke-direct {v4}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    invoke-direct {v3, v4}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    iput-object v3, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mColoredCircleBackground:Landroid/graphics/drawable/ShapeDrawable;

    .line 167
    new-instance v6, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v3, Landroid/graphics/drawable/shapes/OvalShape;

    invoke-direct {v3}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    invoke-direct {v6, v3}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 168
    .local v6, "outline":Landroid/graphics/drawable/ShapeDrawable;
    invoke-virtual {v6}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v3

    const v4, -0x7f000001

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 169
    new-instance v0, Landroid/graphics/drawable/LayerDrawable;

    const/4 v3, 0x2

    new-array v3, v3, [Landroid/graphics/drawable/Drawable;

    const/4 v4, 0x0

    aput-object v6, v3, v4

    iget-object v4, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mColoredCircleBackground:Landroid/graphics/drawable/ShapeDrawable;

    aput-object v4, v3, v1

    invoke-direct {v0, v3}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 170
    .local v0, "background":Landroid/graphics/drawable/LayerDrawable;
    iget v3, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mDensity:F

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v3, v4

    float-to-int v2, v3

    .local v2, "strokeWidth":I
    move v3, v2

    move v4, v2

    move v5, v2

    .line 171
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    .line 172
    return-object v0
.end method

.method private makeSquareTextView(Landroid/content/Context;)Lcom/google/maps/android/ui/SquareTextView;
    .locals 5
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    const/4 v3, -0x2

    .line 176
    new-instance v1, Lcom/google/maps/android/ui/SquareTextView;

    invoke-direct {v1, p1}, Lcom/google/maps/android/ui/SquareTextView;-><init>(Landroid/content/Context;)V

    .line 177
    .local v1, "squareTextView":Lcom/google/maps/android/ui/SquareTextView;
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 178
    .local v0, "layoutParams":Landroid/view/ViewGroup$LayoutParams;
    invoke-virtual {v1, v0}, Lcom/google/maps/android/ui/SquareTextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 179
    sget v3, Lcom/google/maps/android/R$id;->text:I

    invoke-virtual {v1, v3}, Lcom/google/maps/android/ui/SquareTextView;->setId(I)V

    .line 180
    const/high16 v3, 0x41400000    # 12.0f

    iget v4, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mDensity:F

    mul-float/2addr v3, v4

    float-to-int v2, v3

    .line 181
    .local v2, "twelveDpi":I
    invoke-virtual {v1, v2, v2, v2, v2}, Lcom/google/maps/android/ui/SquareTextView;->setPadding(IIII)V

    .line 182
    return-object v1
.end method


# virtual methods
.method protected getBucket(Lcom/google/maps/android/clustering/Cluster;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/Cluster",
            "<TT;>;)I"
        }
    .end annotation

    .prologue
    .line 207
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    .local p1, "cluster":Lcom/google/maps/android/clustering/Cluster;, "Lcom/google/maps/android/clustering/Cluster<TT;>;"
    invoke-interface {p1}, Lcom/google/maps/android/clustering/Cluster;->getSize()I

    move-result v1

    .line 208
    .local v1, "size":I
    sget-object v2, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->BUCKETS:[I

    const/4 v3, 0x0

    aget v2, v2, v3

    if-gt v1, v2, :cond_0

    .line 216
    .end local v1    # "size":I
    :goto_0
    return v1

    .line 211
    .restart local v1    # "size":I
    :cond_0
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    sget-object v2, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->BUCKETS:[I

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    if-ge v0, v2, :cond_2

    .line 212
    sget-object v2, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->BUCKETS:[I

    add-int/lit8 v3, v0, 0x1

    aget v2, v2, v3

    if-ge v1, v2, :cond_1

    .line 213
    sget-object v2, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->BUCKETS:[I

    aget v1, v2, v0

    goto :goto_0

    .line 211
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 216
    :cond_2
    sget-object v2, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->BUCKETS:[I

    sget-object v3, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->BUCKETS:[I

    array-length v3, v3

    add-int/lit8 v3, v3, -0x1

    aget v1, v2, v3

    goto :goto_0
.end method

.method public getCluster(Lcom/google/android/gms/maps/model/Marker;)Lcom/google/maps/android/clustering/Cluster;
    .locals 1
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/maps/model/Marker;",
            ")",
            "Lcom/google/maps/android/clustering/Cluster",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 763
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkerToCluster:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/maps/android/clustering/Cluster;

    return-object v0
.end method

.method public getClusterItem(Lcom/google/android/gms/maps/model/Marker;)Lcom/google/maps/android/clustering/ClusterItem;
    .locals 1
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/maps/model/Marker;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 745
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkerCache:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;

    invoke-virtual {v0, p1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;->get(Lcom/google/android/gms/maps/model/Marker;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/maps/android/clustering/ClusterItem;

    return-object v0
.end method

.method protected getClusterText(I)Ljava/lang/String;
    .locals 2
    .param p1, "bucket"    # I

    .prologue
    .line 196
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    sget-object v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->BUCKETS:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    if-ge p1, v0, :cond_0

    .line 197
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 199
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getMarker(Lcom/google/maps/android/clustering/Cluster;)Lcom/google/android/gms/maps/model/Marker;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/Cluster",
            "<TT;>;)",
            "Lcom/google/android/gms/maps/model/Marker;"
        }
    .end annotation

    .prologue
    .line 754
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    .local p1, "cluster":Lcom/google/maps/android/clustering/Cluster;, "Lcom/google/maps/android/clustering/Cluster<TT;>;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusterToMarker:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/Marker;

    return-object v0
.end method

.method public getMarker(Lcom/google/maps/android/clustering/ClusterItem;)Lcom/google/android/gms/maps/model/Marker;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/google/android/gms/maps/model/Marker;"
        }
    .end annotation

    .prologue
    .line 736
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    .local p1, "clusterItem":Lcom/google/maps/android/clustering/ClusterItem;, "TT;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkerCache:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;

    invoke-virtual {v0, p1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;->get(Ljava/lang/Object;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    return-object v0
.end method

.method public onAdd()V
    .locals 2

    .prologue
    .line 126
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    invoke-virtual {v0}, Lcom/google/maps/android/clustering/ClusterManager;->getMarkerCollection()Lcom/google/maps/android/MarkerManager$Collection;

    move-result-object v0

    new-instance v1, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$1;

    invoke-direct {v1, p0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$1;-><init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)V

    invoke-virtual {v0, v1}, Lcom/google/maps/android/MarkerManager$Collection;->setOnMarkerClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;)V

    .line 133
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    invoke-virtual {v0}, Lcom/google/maps/android/clustering/ClusterManager;->getMarkerCollection()Lcom/google/maps/android/MarkerManager$Collection;

    move-result-object v0

    new-instance v1, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$2;

    invoke-direct {v1, p0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$2;-><init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)V

    invoke-virtual {v0, v1}, Lcom/google/maps/android/MarkerManager$Collection;->setOnInfoWindowClickListener(Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;)V

    .line 142
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    invoke-virtual {v0}, Lcom/google/maps/android/clustering/ClusterManager;->getClusterMarkerCollection()Lcom/google/maps/android/MarkerManager$Collection;

    move-result-object v0

    new-instance v1, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$3;

    invoke-direct {v1, p0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$3;-><init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)V

    invoke-virtual {v0, v1}, Lcom/google/maps/android/MarkerManager$Collection;->setOnMarkerClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;)V

    .line 149
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    invoke-virtual {v0}, Lcom/google/maps/android/clustering/ClusterManager;->getClusterMarkerCollection()Lcom/google/maps/android/MarkerManager$Collection;

    move-result-object v0

    new-instance v1, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$4;

    invoke-direct {v1, p0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$4;-><init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)V

    invoke-virtual {v0, v1}, Lcom/google/maps/android/MarkerManager$Collection;->setOnInfoWindowClickListener(Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;)V

    .line 157
    return-void
.end method

.method protected onBeforeClusterItemRendered(Lcom/google/maps/android/clustering/ClusterItem;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 0
    .param p2, "markerOptions"    # Lcom/google/android/gms/maps/model/MarkerOptions;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/android/gms/maps/model/MarkerOptions;",
            ")V"
        }
    .end annotation

    .prologue
    .line 700
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    .local p1, "item":Lcom/google/maps/android/clustering/ClusterItem;, "TT;"
    return-void
.end method

.method protected onBeforeClusterRendered(Lcom/google/maps/android/clustering/Cluster;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 4
    .param p2, "markerOptions"    # Lcom/google/android/gms/maps/model/MarkerOptions;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/Cluster",
            "<TT;>;",
            "Lcom/google/android/gms/maps/model/MarkerOptions;",
            ")V"
        }
    .end annotation

    .prologue
    .line 707
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    .local p1, "cluster":Lcom/google/maps/android/clustering/Cluster;, "Lcom/google/maps/android/clustering/Cluster<TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->getBucket(Lcom/google/maps/android/clustering/Cluster;)I

    move-result v0

    .line 708
    .local v0, "bucket":I
    iget-object v2, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mIcons:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/BitmapDescriptor;

    .line 709
    .local v1, "descriptor":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    if-nez v1, :cond_0

    .line 710
    iget-object v2, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mColoredCircleBackground:Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v2

    invoke-direct {p0, v0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 711
    iget-object v2, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mIconGenerator:Lcom/google/maps/android/ui/IconGenerator;

    invoke-virtual {p0, v0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->getClusterText(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/maps/android/ui/IconGenerator;->makeIcon(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromBitmap(Landroid/graphics/Bitmap;)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    .line 712
    iget-object v2, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mIcons:Landroid/util/SparseArray;

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 715
    :cond_0
    invoke-virtual {p2, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 716
    return-void
.end method

.method protected onClusterItemRendered(Lcom/google/maps/android/clustering/ClusterItem;Lcom/google/android/gms/maps/model/Marker;)V
    .locals 0
    .param p2, "marker"    # Lcom/google/android/gms/maps/model/Marker;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/android/gms/maps/model/Marker;",
            ")V"
        }
    .end annotation

    .prologue
    .line 728
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    .local p1, "clusterItem":Lcom/google/maps/android/clustering/ClusterItem;, "TT;"
    return-void
.end method

.method protected onClusterRendered(Lcom/google/maps/android/clustering/Cluster;Lcom/google/android/gms/maps/model/Marker;)V
    .locals 0
    .param p2, "marker"    # Lcom/google/android/gms/maps/model/Marker;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/Cluster",
            "<TT;>;",
            "Lcom/google/android/gms/maps/model/Marker;",
            ")V"
        }
    .end annotation

    .prologue
    .line 722
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    .local p1, "cluster":Lcom/google/maps/android/clustering/Cluster;, "Lcom/google/maps/android/clustering/Cluster<TT;>;"
    return-void
.end method

.method public onClustersChanged(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<+",
            "Lcom/google/maps/android/clustering/Cluster",
            "<TT;>;>;)V"
        }
    .end annotation

    .prologue
    .line 433
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    .local p1, "clusters":Ljava/util/Set;, "Ljava/util/Set<+Lcom/google/maps/android/clustering/Cluster<TT;>;>;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mViewModifier:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;

    invoke-virtual {v0, p1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->queue(Ljava/util/Set;)V

    .line 434
    return-void
.end method

.method public onRemove()V
    .locals 2

    .prologue
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    const/4 v1, 0x0

    .line 161
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    invoke-virtual {v0}, Lcom/google/maps/android/clustering/ClusterManager;->getMarkerCollection()Lcom/google/maps/android/MarkerManager$Collection;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/maps/android/MarkerManager$Collection;->setOnMarkerClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;)V

    .line 162
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    invoke-virtual {v0}, Lcom/google/maps/android/clustering/ClusterManager;->getClusterMarkerCollection()Lcom/google/maps/android/MarkerManager$Collection;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/maps/android/MarkerManager$Collection;->setOnMarkerClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;)V

    .line 163
    return-void
.end method

.method public setOnClusterClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 438
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    .local p1, "listener":Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;, "Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener<TT;>;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;

    .line 439
    return-void
.end method

.method public setOnClusterInfoWindowClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 443
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    .local p1, "listener":Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener;, "Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener<TT;>;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mInfoWindowClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener;

    .line 444
    return-void
.end method

.method public setOnClusterItemClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 448
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    .local p1, "listener":Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener;, "Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener<TT;>;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mItemClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener;

    .line 449
    return-void
.end method

.method public setOnClusterItemInfoWindowClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 453
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    .local p1, "listener":Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;, "Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener<TT;>;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mItemInfoWindowClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;

    .line 454
    return-void
.end method

.method protected shouldRenderAsCluster(Lcom/google/maps/android/clustering/Cluster;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/Cluster",
            "<TT;>;)Z"
        }
    .end annotation

    .prologue
    .line 283
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>;"
    .local p1, "cluster":Lcom/google/maps/android/clustering/Cluster;, "Lcom/google/maps/android/clustering/Cluster<TT;>;"
    invoke-interface {p1}, Lcom/google/maps/android/clustering/Cluster;->getSize()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

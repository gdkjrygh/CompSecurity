.class public Lcom/thetransitapp/droid/util/DropMarkerAnimator;
.super Ljava/lang/Object;
.source "DropMarkerAnimator.java"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final DURATION:J = 0x12cL


# instance fields
.field private endLatLng:Lcom/google/android/gms/maps/model/LatLng;

.field private final handler:Landroid/os/Handler;

.field private final interpolator:Landroid/view/animation/Interpolator;

.field private final marker:Lcom/google/android/gms/maps/model/Marker;

.field private start:J

.field private startLatLng:Lcom/google/android/gms/maps/model/LatLng;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/maps/model/Marker;Lcom/google/android/gms/maps/Projection;)V
    .locals 3
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;
    .param p2, "projection"    # Lcom/google/android/gms/maps/Projection;

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    iput-object v1, p0, Lcom/thetransitapp/droid/util/DropMarkerAnimator;->interpolator:Landroid/view/animation/Interpolator;

    .line 17
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Lcom/thetransitapp/droid/util/DropMarkerAnimator;->handler:Landroid/os/Handler;

    .line 25
    iput-object p1, p0, Lcom/thetransitapp/droid/util/DropMarkerAnimator;->marker:Lcom/google/android/gms/maps/model/Marker;

    .line 27
    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/google/android/gms/maps/Projection;->toScreenLocation(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/Point;

    move-result-object v0

    .line 28
    .local v0, "startPoint":Landroid/graphics/Point;
    iget v1, v0, Landroid/graphics/Point;->x:I

    const/16 v2, -0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Point;->set(II)V

    .line 29
    invoke-virtual {p2, v0}, Lcom/google/android/gms/maps/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    iput-object v1, p0, Lcom/thetransitapp/droid/util/DropMarkerAnimator;->startLatLng:Lcom/google/android/gms/maps/model/LatLng;

    .line 30
    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    iput-object v1, p0, Lcom/thetransitapp/droid/util/DropMarkerAnimator;->endLatLng:Lcom/google/android/gms/maps/model/LatLng;

    .line 31
    return-void
.end method


# virtual methods
.method public drop()V
    .locals 2

    .prologue
    .line 51
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/thetransitapp/droid/util/DropMarkerAnimator;->start:J

    .line 53
    iget-object v0, p0, Lcom/thetransitapp/droid/util/DropMarkerAnimator;->handler:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 54
    return-void
.end method

.method public run()V
    .locals 14

    .prologue
    const/high16 v13, 0x3f800000    # 1.0f

    .line 35
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v7

    iget-wide v9, p0, Lcom/thetransitapp/droid/util/DropMarkerAnimator;->start:J

    sub-long v0, v7, v9

    .line 36
    .local v0, "elapsed":J
    iget-object v7, p0, Lcom/thetransitapp/droid/util/DropMarkerAnimator;->interpolator:Landroid/view/animation/Interpolator;

    long-to-float v8, v0

    const/high16 v9, 0x43960000    # 300.0f

    div-float/2addr v8, v9

    invoke-interface {v7, v8}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v6

    .line 37
    .local v6, "t":F
    float-to-double v7, v6

    iget-object v9, p0, Lcom/thetransitapp/droid/util/DropMarkerAnimator;->endLatLng:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v9, v9, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    mul-double/2addr v7, v9

    sub-float v9, v13, v6

    float-to-double v9, v9

    iget-object v11, p0, Lcom/thetransitapp/droid/util/DropMarkerAnimator;->startLatLng:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v11, v11, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    mul-double/2addr v9, v11

    add-double v4, v7, v9

    .line 38
    .local v4, "lng":D
    float-to-double v7, v6

    iget-object v9, p0, Lcom/thetransitapp/droid/util/DropMarkerAnimator;->endLatLng:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v9, v9, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    mul-double/2addr v7, v9

    sub-float v9, v13, v6

    float-to-double v9, v9

    iget-object v11, p0, Lcom/thetransitapp/droid/util/DropMarkerAnimator;->startLatLng:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v11, v11, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    mul-double/2addr v9, v11

    add-double v2, v7, v9

    .line 40
    .local v2, "lat":D
    iget-object v7, p0, Lcom/thetransitapp/droid/util/DropMarkerAnimator;->marker:Lcom/google/android/gms/maps/model/Marker;

    new-instance v8, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v8, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v7, v8}, Lcom/google/android/gms/maps/model/Marker;->setPosition(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 41
    iget-object v7, p0, Lcom/thetransitapp/droid/util/DropMarkerAnimator;->marker:Lcom/google/android/gms/maps/model/Marker;

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Lcom/google/android/gms/maps/model/Marker;->setVisible(Z)V

    .line 43
    float-to-double v7, v6

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    cmpg-double v7, v7, v9

    if-gez v7, :cond_0

    .line 44
    iget-object v7, p0, Lcom/thetransitapp/droid/util/DropMarkerAnimator;->handler:Landroid/os/Handler;

    const-wide/16 v8, 0x10

    invoke-virtual {v7, p0, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 48
    :goto_0
    return-void

    .line 46
    :cond_0
    iget-object v7, p0, Lcom/thetransitapp/droid/util/DropMarkerAnimator;->marker:Lcom/google/android/gms/maps/model/Marker;

    iget-object v8, p0, Lcom/thetransitapp/droid/util/DropMarkerAnimator;->endLatLng:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v7, v8}, Lcom/google/android/gms/maps/model/Marker;->setPosition(Lcom/google/android/gms/maps/model/LatLng;)V

    goto :goto_0
.end method

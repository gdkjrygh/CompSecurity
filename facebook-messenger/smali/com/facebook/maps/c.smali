.class public Lcom/facebook/maps/c;
.super Lcom/google/android/maps/MyLocationOverlay;
.source "FixedMyLocationOverlay.java"


# instance fields
.field private a:Z

.field private b:Landroid/graphics/Paint;

.field private c:Landroid/graphics/Point;

.field private d:Landroid/graphics/Point;

.field private e:Landroid/graphics/drawable/Drawable;

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/maps/MapView;)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0, p1, p2}, Lcom/google/android/maps/MyLocationOverlay;-><init>(Landroid/content/Context;Lcom/google/android/maps/MapView;)V

    .line 22
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/maps/c;->a:Z

    .line 33
    return-void
.end method


# virtual methods
.method protected drawMyLocation(Landroid/graphics/Canvas;Lcom/google/android/maps/MapView;Landroid/location/Location;Lcom/google/android/maps/GeoPoint;J)V
    .locals 11

    .prologue
    .line 37
    iget-boolean v0, p0, Lcom/facebook/maps/c;->a:Z

    if-nez v0, :cond_0

    .line 39
    :try_start_0
    invoke-super/range {p0 .. p6}, Lcom/google/android/maps/MyLocationOverlay;->drawMyLocation(Landroid/graphics/Canvas;Lcom/google/android/maps/MapView;Landroid/location/Location;Lcom/google/android/maps/GeoPoint;J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lcom/facebook/maps/c;->a:Z

    if-eqz v0, :cond_2

    .line 46
    iget-object v0, p0, Lcom/facebook/maps/c;->e:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    .line 47
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/facebook/maps/c;->b:Landroid/graphics/Paint;

    .line 48
    iget-object v0, p0, Lcom/facebook/maps/c;->b:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 49
    iget-object v0, p0, Lcom/facebook/maps/c;->b:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 51
    invoke-virtual {p2}, Lcom/google/android/maps/MapView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/h;->orca_mylocation:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/maps/c;->e:Landroid/graphics/drawable/Drawable;

    .line 52
    iget-object v0, p0, Lcom/facebook/maps/c;->e:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    iput v0, p0, Lcom/facebook/maps/c;->f:I

    .line 53
    iget-object v0, p0, Lcom/facebook/maps/c;->e:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    iput v0, p0, Lcom/facebook/maps/c;->g:I

    .line 54
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/facebook/maps/c;->c:Landroid/graphics/Point;

    .line 55
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/facebook/maps/c;->d:Landroid/graphics/Point;

    .line 57
    :cond_1
    invoke-virtual {p2}, Lcom/google/android/maps/MapView;->getProjection()Lcom/google/android/maps/Projection;

    move-result-object v9

    .line 59
    invoke-virtual {p3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    .line 60
    invoke-virtual {p3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    .line 61
    invoke-virtual {p3}, Landroid/location/Location;->getAccuracy()F

    move-result v10

    .line 63
    const/4 v4, 0x1

    new-array v8, v4, [F

    .line 65
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    add-double v6, v2, v4

    move-wide v4, v0

    invoke-static/range {v0 .. v8}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    .line 66
    const/4 v4, 0x0

    aget v4, v8, v4

    .line 68
    new-instance v5, Lcom/google/android/maps/GeoPoint;

    const-wide v6, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v0, v6

    double-to-int v0, v0

    div-float v1, v10, v4

    float-to-double v6, v1

    sub-double v1, v2, v6

    const-wide v3, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v5, v0, v1}, Lcom/google/android/maps/GeoPoint;-><init>(II)V

    .line 70
    iget-object v0, p0, Lcom/facebook/maps/c;->d:Landroid/graphics/Point;

    invoke-interface {v9, v5, v0}, Lcom/google/android/maps/Projection;->toPixels(Lcom/google/android/maps/GeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 71
    iget-object v0, p0, Lcom/facebook/maps/c;->c:Landroid/graphics/Point;

    invoke-interface {v9, p4, v0}, Lcom/google/android/maps/Projection;->toPixels(Lcom/google/android/maps/GeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 72
    iget-object v0, p0, Lcom/facebook/maps/c;->c:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    iget-object v1, p0, Lcom/facebook/maps/c;->d:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    sub-int/2addr v0, v1

    .line 74
    iget-object v1, p0, Lcom/facebook/maps/c;->b:Landroid/graphics/Paint;

    const v2, -0x999901

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 75
    iget-object v1, p0, Lcom/facebook/maps/c;->b:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 76
    iget-object v1, p0, Lcom/facebook/maps/c;->c:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/facebook/maps/c;->c:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    int-to-float v3, v0

    iget-object v4, p0, Lcom/facebook/maps/c;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 78
    iget-object v1, p0, Lcom/facebook/maps/c;->b:Landroid/graphics/Paint;

    const v2, 0x186666ff

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 79
    iget-object v1, p0, Lcom/facebook/maps/c;->b:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 80
    iget-object v1, p0, Lcom/facebook/maps/c;->c:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/facebook/maps/c;->c:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    int-to-float v0, v0

    iget-object v3, p0, Lcom/facebook/maps/c;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 82
    iget-object v0, p0, Lcom/facebook/maps/c;->e:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/facebook/maps/c;->c:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    iget v2, p0, Lcom/facebook/maps/c;->f:I

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/facebook/maps/c;->c:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    iget v3, p0, Lcom/facebook/maps/c;->g:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/facebook/maps/c;->c:Landroid/graphics/Point;

    iget v3, v3, Landroid/graphics/Point;->x:I

    iget v4, p0, Lcom/facebook/maps/c;->f:I

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v3, v4

    iget-object v4, p0, Lcom/facebook/maps/c;->c:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->y:I

    iget v5, p0, Lcom/facebook/maps/c;->g:I

    div-int/lit8 v5, v5, 0x2

    add-int/2addr v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 83
    iget-object v0, p0, Lcom/facebook/maps/c;->e:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 85
    :cond_2
    return-void

    .line 40
    :catch_0
    move-exception v0

    .line 41
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/maps/c;->a:Z

    goto/16 :goto_0
.end method

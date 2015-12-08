.class public Lcom/thetransitapp/droid/ui/CompassView;
.super Landroid/view/View;
.source "CompassView.java"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field private accelerometer:Landroid/hardware/Sensor;

.field private arrow:Landroid/graphics/drawable/Drawable;

.field private azimuth:Ljava/lang/Float;

.field private brokenArrow:Landroid/graphics/drawable/Drawable;

.field private current:Landroid/location/Location;

.field private dimension:I

.field private geoField:Landroid/hardware/GeomagneticField;

.field private geomagnetic:[F

.field private gravity:[F

.field private magnetometer:Landroid/hardware/Sensor;

.field private sensorManager:Landroid/hardware/SensorManager;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private target:Landroid/location/Location;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 45
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 47
    invoke-direct {p0}, Lcom/thetransitapp/droid/ui/CompassView;->init()V

    .line 48
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 51
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 53
    invoke-direct {p0}, Lcom/thetransitapp/droid/ui/CompassView;->init()V

    .line 54
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 57
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 59
    invoke-direct {p0}, Lcom/thetransitapp/droid/ui/CompassView;->init()V

    .line 60
    return-void
.end method

.method private init()V
    .locals 8

    .prologue
    const/4 v7, -0x1

    .line 160
    invoke-super {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "sensor"

    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/hardware/SensorManager;

    iput-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->sensorManager:Landroid/hardware/SensorManager;

    .line 161
    iget-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->sensorManager:Landroid/hardware/SensorManager;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v4

    iput-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->accelerometer:Landroid/hardware/Sensor;

    .line 162
    iget-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->sensorManager:Landroid/hardware/SensorManager;

    const/4 v5, 0x2

    invoke-virtual {v4, v5}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v4

    iput-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->magnetometer:Landroid/hardware/Sensor;

    .line 164
    invoke-super {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f020089

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iput-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->arrow:Landroid/graphics/drawable/Drawable;

    .line 165
    iget-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->arrow:Landroid/graphics/drawable/Drawable;

    new-instance v5, Landroid/graphics/PorterDuffColorFilter;

    sget-object v6, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v5, v7, v6}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 167
    invoke-super {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f02008a

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iput-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->brokenArrow:Landroid/graphics/drawable/Drawable;

    .line 168
    iget-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->brokenArrow:Landroid/graphics/drawable/Drawable;

    new-instance v5, Landroid/graphics/PorterDuffColorFilter;

    sget-object v6, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v5, v7, v6}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 170
    iget-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->arrow:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    .line 171
    .local v3, "width":I
    iget-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->arrow:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    .line 173
    .local v0, "height":I
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->dimension:I

    .line 175
    iget v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->dimension:I

    sub-int/2addr v4, v3

    div-int/lit8 v1, v4, 0x2

    .line 176
    .local v1, "left":I
    iget v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->dimension:I

    sub-int/2addr v4, v0

    div-int/lit8 v2, v4, 0x2

    .line 178
    .local v2, "top":I
    iget-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->arrow:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4, v1, v2, v3, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 179
    return-void
.end method


# virtual methods
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0
    .param p1, "sensor"    # Landroid/hardware/Sensor;
    .param p2, "accuracy"    # I

    .prologue
    .line 92
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 3

    .prologue
    const/4 v2, 0x2

    .line 103
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 105
    iget-object v0, p0, Lcom/thetransitapp/droid/ui/CompassView;->sensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/thetransitapp/droid/ui/CompassView;->accelerometer:Landroid/hardware/Sensor;

    invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 106
    iget-object v0, p0, Lcom/thetransitapp/droid/ui/CompassView;->sensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/thetransitapp/droid/ui/CompassView;->magnetometer:Landroid/hardware/Sensor;

    invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 107
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 111
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 113
    iget-object v0, p0, Lcom/thetransitapp/droid/ui/CompassView;->sensorManager:Landroid/hardware/SensorManager;

    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 114
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 11
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    const/high16 v10, 0x42b40000    # 90.0f

    .line 124
    iget v6, p0, Lcom/thetransitapp/droid/ui/CompassView;->dimension:I

    int-to-float v6, v6

    const/high16 v7, 0x3f000000    # 0.5f

    mul-float v1, v6, v7

    .line 125
    .local v1, "centerx":F
    iget v6, p0, Lcom/thetransitapp/droid/ui/CompassView;->dimension:I

    int-to-float v6, v6

    const v7, 0x3f0a3d71    # 0.54f

    mul-float v2, v6, v7

    .line 128
    .local v2, "centery":F
    iget-object v6, p0, Lcom/thetransitapp/droid/ui/CompassView;->azimuth:Ljava/lang/Float;

    if-eqz v6, :cond_3

    .line 129
    iget-object v6, p0, Lcom/thetransitapp/droid/ui/CompassView;->current:Landroid/location/Location;

    iget-object v7, p0, Lcom/thetransitapp/droid/ui/CompassView;->target:Landroid/location/Location;

    invoke-virtual {v6, v7}, Landroid/location/Location;->bearingTo(Landroid/location/Location;)F

    move-result v0

    .line 130
    .local v0, "bearing":F
    iget-object v6, p0, Lcom/thetransitapp/droid/ui/CompassView;->azimuth:Ljava/lang/Float;

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    float-to-double v6, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v6

    iget-object v8, p0, Lcom/thetransitapp/droid/ui/CompassView;->geoField:Landroid/hardware/GeomagneticField;

    invoke-virtual {v8}, Landroid/hardware/GeomagneticField;->getDeclination()F

    move-result v8

    float-to-double v8, v8

    add-double/2addr v6, v8

    double-to-float v4, v6

    .line 131
    .local v4, "heading":F
    sub-float v4, v0, v4

    .line 133
    const/4 v6, 0x0

    cmpg-float v6, v4, v6

    if-ltz v6, :cond_0

    const/high16 v6, 0x43340000    # 180.0f

    cmpl-float v6, v4, v6

    if-lez v6, :cond_1

    .line 134
    :cond_0
    const/high16 v6, 0x43b40000    # 360.0f

    add-float/2addr v4, v6

    .line 137
    :cond_1
    invoke-super {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const-string v7, "window"

    invoke-virtual {v6, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/WindowManager;

    .line 139
    .local v5, "windowManager":Landroid/view/WindowManager;
    if-eqz v5, :cond_2

    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 140
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v3

    .line 142
    .local v3, "display":Landroid/view/Display;
    invoke-virtual {v3}, Landroid/view/Display;->getOrientation()I

    move-result v6

    packed-switch v6, :pswitch_data_0

    .line 153
    .end local v3    # "display":Landroid/view/Display;
    :cond_2
    :goto_0
    :pswitch_0
    invoke-virtual {p1, v4, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 154
    iget-object v6, p0, Lcom/thetransitapp/droid/ui/CompassView;->arrow:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v6, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 157
    .end local v0    # "bearing":F
    .end local v4    # "heading":F
    .end local v5    # "windowManager":Landroid/view/WindowManager;
    :cond_3
    return-void

    .line 144
    .restart local v0    # "bearing":F
    .restart local v3    # "display":Landroid/view/Display;
    .restart local v4    # "heading":F
    .restart local v5    # "windowManager":Landroid/view/WindowManager;
    :pswitch_1
    sub-float/2addr v4, v10

    .line 145
    goto :goto_0

    .line 148
    :pswitch_2
    add-float/2addr v4, v10

    goto :goto_0

    .line 142
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method protected onMeasure(II)V
    .locals 2
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .prologue
    .line 118
    iget v0, p0, Lcom/thetransitapp/droid/ui/CompassView;->dimension:I

    iget v1, p0, Lcom/thetransitapp/droid/ui/CompassView;->dimension:I

    invoke-super {p0, v0, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 119
    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 7
    .param p1, "event"    # Landroid/hardware/SensorEvent;

    .prologue
    const/16 v6, 0x9

    .line 64
    iget-object v4, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v4}, Landroid/hardware/Sensor;->getType()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    .line 65
    iget-object v4, p1, Landroid/hardware/SensorEvent;->values:[F

    invoke-virtual {v4}, [F->clone()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [F

    iput-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->gravity:[F

    .line 68
    :cond_0
    iget-object v4, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v4}, Landroid/hardware/Sensor;->getType()I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_1

    .line 69
    iget-object v4, p1, Landroid/hardware/SensorEvent;->values:[F

    invoke-virtual {v4}, [F->clone()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [F

    iput-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->geomagnetic:[F

    .line 72
    :cond_1
    const/4 v4, 0x0

    iput-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->azimuth:Ljava/lang/Float;

    .line 74
    iget-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->gravity:[F

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->geomagnetic:[F

    if-eqz v4, :cond_2

    .line 75
    new-array v1, v6, [F

    .line 76
    .local v1, "R":[F
    new-array v0, v6, [F

    .line 77
    .local v0, "I":[F
    iget-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->gravity:[F

    iget-object v5, p0, Lcom/thetransitapp/droid/ui/CompassView;->geomagnetic:[F

    invoke-static {v1, v0, v4, v5}, Landroid/hardware/SensorManager;->getRotationMatrix([F[F[F[F)Z

    move-result v3

    .line 79
    .local v3, "success":Z
    if-eqz v3, :cond_2

    .line 80
    const/4 v4, 0x3

    new-array v2, v4, [F

    .line 81
    .local v2, "orientation":[F
    invoke-static {v1, v2}, Landroid/hardware/SensorManager;->getOrientation([F[F)[F

    .line 82
    const/4 v4, 0x0

    aget v4, v2, v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    iput-object v4, p0, Lcom/thetransitapp/droid/ui/CompassView;->azimuth:Ljava/lang/Float;

    .line 86
    .end local v0    # "I":[F
    .end local v1    # "R":[F
    .end local v2    # "orientation":[F
    .end local v3    # "success":Z
    :cond_2
    invoke-super {p0}, Landroid/view/View;->invalidate()V

    .line 87
    return-void
.end method

.method public setCurrent(Landroid/location/Location;)V
    .locals 6
    .param p1, "current"    # Landroid/location/Location;

    .prologue
    .line 95
    iput-object p1, p0, Lcom/thetransitapp/droid/ui/CompassView;->current:Landroid/location/Location;

    .line 96
    new-instance v0, Landroid/hardware/GeomagneticField;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->floatValue()F

    move-result v1

    .line 97
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->floatValue()F

    move-result v2

    invoke-virtual {p1}, Landroid/location/Location;->getAltitude()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Double;->floatValue()F

    move-result v3

    .line 98
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-direct/range {v0 .. v5}, Landroid/hardware/GeomagneticField;-><init>(FFFJ)V

    .line 96
    iput-object v0, p0, Lcom/thetransitapp/droid/ui/CompassView;->geoField:Landroid/hardware/GeomagneticField;

    .line 99
    return-void
.end method

.method public setTarget(Landroid/location/Location;)V
    .locals 0
    .param p1, "target"    # Landroid/location/Location;

    .prologue
    .line 30
    iput-object p1, p0, Lcom/thetransitapp/droid/ui/CompassView;->target:Landroid/location/Location;

    return-void
.end method

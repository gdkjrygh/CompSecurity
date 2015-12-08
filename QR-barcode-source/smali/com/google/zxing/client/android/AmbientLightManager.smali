.class final Lcom/google/zxing/client/android/AmbientLightManager;
.super Ljava/lang/Object;
.source "AmbientLightManager.java"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# static fields
.field private static final BRIGHT_ENOUGH_LUX:F = 450.0f

.field private static final TOO_DARK_LUX:F = 45.0f


# instance fields
.field private cameraManager:Lcom/google/zxing/client/android/camera/CameraManager;

.field private final context:Landroid/content/Context;

.field private lightSensor:Landroid/hardware/Sensor;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/google/zxing/client/android/AmbientLightManager;->context:Landroid/content/Context;

    .line 46
    return-void
.end method


# virtual methods
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0
    .param p1, "sensor"    # Landroid/hardware/Sensor;
    .param p2, "accuracy"    # I

    .prologue
    .line 84
    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 3
    .param p1, "sensorEvent"    # Landroid/hardware/SensorEvent;

    .prologue
    const/4 v2, 0x0

    .line 71
    iget-object v1, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v0, v1, v2

    .line 72
    .local v0, "ambientLightLux":F
    iget-object v1, p0, Lcom/google/zxing/client/android/AmbientLightManager;->cameraManager:Lcom/google/zxing/client/android/camera/CameraManager;

    if-eqz v1, :cond_0

    .line 73
    const/high16 v1, 0x42340000    # 45.0f

    cmpg-float v1, v0, v1

    if-gtz v1, :cond_1

    .line 74
    iget-object v1, p0, Lcom/google/zxing/client/android/AmbientLightManager;->cameraManager:Lcom/google/zxing/client/android/camera/CameraManager;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/zxing/client/android/camera/CameraManager;->setTorch(Z)V

    .line 79
    :cond_0
    :goto_0
    return-void

    .line 75
    :cond_1
    const/high16 v1, 0x43e10000    # 450.0f

    cmpl-float v1, v0, v1

    if-ltz v1, :cond_0

    .line 76
    iget-object v1, p0, Lcom/google/zxing/client/android/AmbientLightManager;->cameraManager:Lcom/google/zxing/client/android/camera/CameraManager;

    invoke-virtual {v1, v2}, Lcom/google/zxing/client/android/camera/CameraManager;->setTorch(Z)V

    goto :goto_0
.end method

.method start(Lcom/google/zxing/client/android/camera/CameraManager;)V
    .locals 4
    .param p1, "cameraManager"    # Lcom/google/zxing/client/android/camera/CameraManager;

    .prologue
    .line 49
    iput-object p1, p0, Lcom/google/zxing/client/android/AmbientLightManager;->cameraManager:Lcom/google/zxing/client/android/camera/CameraManager;

    .line 50
    iget-object v2, p0, Lcom/google/zxing/client/android/AmbientLightManager;->context:Landroid/content/Context;

    invoke-static {v2}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 51
    .local v1, "sharedPrefs":Landroid/content/SharedPreferences;
    invoke-static {v1}, Lcom/google/zxing/client/android/camera/FrontLightMode;->readPref(Landroid/content/SharedPreferences;)Lcom/google/zxing/client/android/camera/FrontLightMode;

    move-result-object v2

    sget-object v3, Lcom/google/zxing/client/android/camera/FrontLightMode;->AUTO:Lcom/google/zxing/client/android/camera/FrontLightMode;

    if-ne v2, v3, :cond_0

    .line 52
    iget-object v2, p0, Lcom/google/zxing/client/android/AmbientLightManager;->context:Landroid/content/Context;

    const-string v3, "sensor"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    .line 53
    .local v0, "sensorManager":Landroid/hardware/SensorManager;
    const/4 v2, 0x5

    invoke-virtual {v0, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    iput-object v2, p0, Lcom/google/zxing/client/android/AmbientLightManager;->lightSensor:Landroid/hardware/Sensor;

    .line 54
    iget-object v2, p0, Lcom/google/zxing/client/android/AmbientLightManager;->lightSensor:Landroid/hardware/Sensor;

    if-eqz v2, :cond_0

    .line 55
    iget-object v2, p0, Lcom/google/zxing/client/android/AmbientLightManager;->lightSensor:Landroid/hardware/Sensor;

    const/4 v3, 0x3

    invoke-virtual {v0, p0, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 58
    .end local v0    # "sensorManager":Landroid/hardware/SensorManager;
    :cond_0
    return-void
.end method

.method stop()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 61
    iget-object v1, p0, Lcom/google/zxing/client/android/AmbientLightManager;->lightSensor:Landroid/hardware/Sensor;

    if-eqz v1, :cond_0

    .line 62
    iget-object v1, p0, Lcom/google/zxing/client/android/AmbientLightManager;->context:Landroid/content/Context;

    const-string v2, "sensor"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    .line 63
    .local v0, "sensorManager":Landroid/hardware/SensorManager;
    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 64
    iput-object v3, p0, Lcom/google/zxing/client/android/AmbientLightManager;->cameraManager:Lcom/google/zxing/client/android/camera/CameraManager;

    .line 65
    iput-object v3, p0, Lcom/google/zxing/client/android/AmbientLightManager;->lightSensor:Landroid/hardware/Sensor;

    .line 67
    .end local v0    # "sensorManager":Landroid/hardware/SensorManager;
    :cond_0
    return-void
.end method

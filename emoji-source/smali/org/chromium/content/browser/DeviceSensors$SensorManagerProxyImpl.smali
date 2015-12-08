.class Lorg/chromium/content/browser/DeviceSensors$SensorManagerProxyImpl;
.super Ljava/lang/Object;
.source "DeviceSensors.java"

# interfaces
.implements Lorg/chromium/content/browser/DeviceSensors$SensorManagerProxy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/DeviceSensors;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SensorManagerProxyImpl"
.end annotation


# instance fields
.field private final mSensorManager:Landroid/hardware/SensorManager;


# direct methods
.method constructor <init>(Landroid/hardware/SensorManager;)V
    .locals 0
    .param p1, "sensorManager"    # Landroid/hardware/SensorManager;

    .prologue
    .line 539
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 540
    iput-object p1, p0, Lorg/chromium/content/browser/DeviceSensors$SensorManagerProxyImpl;->mSensorManager:Landroid/hardware/SensorManager;

    .line 541
    return-void
.end method


# virtual methods
.method public registerListener(Landroid/hardware/SensorEventListener;IILandroid/os/Handler;)Z
    .locals 3
    .param p1, "listener"    # Landroid/hardware/SensorEventListener;
    .param p2, "sensorType"    # I
    .param p3, "rate"    # I
    .param p4, "handler"    # Landroid/os/Handler;

    .prologue
    const/4 v1, 0x0

    .line 546
    iget-object v2, p0, Lorg/chromium/content/browser/DeviceSensors$SensorManagerProxyImpl;->mSensorManager:Landroid/hardware/SensorManager;

    invoke-virtual {v2, p2}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    move-result-object v0

    .line 547
    .local v0, "sensors":Ljava/util/List;, "Ljava/util/List<Landroid/hardware/Sensor;>;"
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 550
    :goto_0
    return v1

    :cond_0
    iget-object v2, p0, Lorg/chromium/content/browser/DeviceSensors$SensorManagerProxyImpl;->mSensorManager:Landroid/hardware/SensorManager;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/Sensor;

    invoke-virtual {v2, p1, v1, p3, p4}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;ILandroid/os/Handler;)Z

    move-result v1

    goto :goto_0
.end method

.method public unregisterListener(Landroid/hardware/SensorEventListener;I)V
    .locals 3
    .param p1, "listener"    # Landroid/hardware/SensorEventListener;
    .param p2, "sensorType"    # I

    .prologue
    .line 555
    iget-object v1, p0, Lorg/chromium/content/browser/DeviceSensors$SensorManagerProxyImpl;->mSensorManager:Landroid/hardware/SensorManager;

    invoke-virtual {v1, p2}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    move-result-object v0

    .line 556
    .local v0, "sensors":Ljava/util/List;, "Ljava/util/List<Landroid/hardware/Sensor;>;"
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 557
    iget-object v2, p0, Lorg/chromium/content/browser/DeviceSensors$SensorManagerProxyImpl;->mSensorManager:Landroid/hardware/SensorManager;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/Sensor;

    invoke-virtual {v2, p1, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 559
    :cond_0
    return-void
.end method

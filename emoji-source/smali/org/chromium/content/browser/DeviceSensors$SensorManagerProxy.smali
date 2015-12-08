.class interface abstract Lorg/chromium/content/browser/DeviceSensors$SensorManagerProxy;
.super Ljava/lang/Object;
.source "DeviceSensors.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/DeviceSensors;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "SensorManagerProxy"
.end annotation


# virtual methods
.method public abstract registerListener(Landroid/hardware/SensorEventListener;IILandroid/os/Handler;)Z
.end method

.method public abstract unregisterListener(Landroid/hardware/SensorEventListener;I)V
.end method

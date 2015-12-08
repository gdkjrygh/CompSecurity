.class Lorg/chromium/content/browser/DeviceSensors$1;
.super Ljava/lang/Object;
.source "DeviceSensors.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/DeviceSensors;->getSensorManagerProxy()Lorg/chromium/content/browser/DeviceSensors$SensorManagerProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Landroid/hardware/SensorManager;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/DeviceSensors;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/DeviceSensors;)V
    .locals 0

    .prologue
    .line 345
    iput-object p1, p0, Lorg/chromium/content/browser/DeviceSensors$1;->this$0:Lorg/chromium/content/browser/DeviceSensors;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Landroid/hardware/SensorManager;
    .locals 2

    .prologue
    .line 348
    iget-object v0, p0, Lorg/chromium/content/browser/DeviceSensors$1;->this$0:Lorg/chromium/content/browser/DeviceSensors;

    # getter for: Lorg/chromium/content/browser/DeviceSensors;->mAppContext:Landroid/content/Context;
    invoke-static {v0}, Lorg/chromium/content/browser/DeviceSensors;->access$000(Lorg/chromium/content/browser/DeviceSensors;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 345
    invoke-virtual {p0}, Lorg/chromium/content/browser/DeviceSensors$1;->call()Landroid/hardware/SensorManager;

    move-result-object v0

    return-object v0
.end method

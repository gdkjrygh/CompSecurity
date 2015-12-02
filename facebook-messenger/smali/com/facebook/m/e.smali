.class Lcom/facebook/m/e;
.super Ljava/lang/Object;
.source "RageSensorEventListener.java"


# instance fields
.field a:F

.field b:J


# direct methods
.method constructor <init>(Landroid/hardware/SensorEvent;)V
    .locals 0

    .prologue
    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    invoke-virtual {p0, p1}, Lcom/facebook/m/e;->a(Landroid/hardware/SensorEvent;)V

    .line 74
    return-void
.end method


# virtual methods
.method a(Landroid/hardware/SensorEvent;)V
    .locals 2

    .prologue
    .line 77
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    iput v0, p0, Lcom/facebook/m/e;->a:F

    .line 78
    iget-wide v0, p1, Landroid/hardware/SensorEvent;->timestamp:J

    iput-wide v0, p0, Lcom/facebook/m/e;->b:J

    .line 79
    return-void
.end method

.class public abstract Lcom/facebook/m/a;
.super Ljava/lang/Object;
.source "RageSensorEventListener.java"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field private a:Lcom/facebook/m/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Lcom/facebook/m/c;

    invoke-direct {v0}, Lcom/facebook/m/c;-><init>()V

    iput-object v0, p0, Lcom/facebook/m/a;->a:Lcom/facebook/m/c;

    .line 82
    return-void
.end method


# virtual methods
.method protected abstract a()V
.end method

.method public b()V
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/m/a;->a:Lcom/facebook/m/c;

    invoke-virtual {v0}, Lcom/facebook/m/c;->a()V

    .line 61
    return-void
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    .prologue
    .line 50
    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/m/a;->a:Lcom/facebook/m/c;

    invoke-virtual {v0, p1}, Lcom/facebook/m/c;->a(Landroid/hardware/SensorEvent;)V

    .line 41
    iget-object v0, p0, Lcom/facebook/m/a;->a:Lcom/facebook/m/c;

    invoke-virtual {v0}, Lcom/facebook/m/c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/facebook/m/a;->a:Lcom/facebook/m/c;

    invoke-virtual {v0}, Lcom/facebook/m/c;->a()V

    .line 43
    invoke-virtual {p0}, Lcom/facebook/m/a;->a()V

    .line 45
    :cond_0
    return-void
.end method

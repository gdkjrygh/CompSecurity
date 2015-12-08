.class public final Lcom/roidapp/photogrid/common/bc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field private a:Landroid/hardware/SensorManager;

.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/photogrid/release/PhotoGridActivity;",
            ">;"
        }
    .end annotation
.end field

.field private c:J

.field private d:J

.field private e:F

.field private f:F

.field private g:F

.field private h:F

.field private i:F

.field private j:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 64
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 65
    const-string v3, "SHAKE"

    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 66
    if-ne v2, v0, :cond_0

    .line 69
    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bc;->a:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bc;->a:Landroid/hardware/SensorManager;

    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 86
    iput-object v1, p0, Lcom/roidapp/photogrid/common/bc;->a:Landroid/hardware/SensorManager;

    .line 88
    :cond_0
    iput-object v1, p0, Lcom/roidapp/photogrid/common/bc;->b:Ljava/lang/ref/WeakReference;

    .line 89
    return-void
.end method

.method public final a(Ljava/lang/ref/WeakReference;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/photogrid/release/PhotoGridActivity;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 31
    iput-object p1, p0, Lcom/roidapp/photogrid/common/bc;->b:Ljava/lang/ref/WeakReference;

    .line 32
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 33
    if-eqz v0, :cond_1

    .line 1044
    iget-object v1, p0, Lcom/roidapp/photogrid/common/bc;->b:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/common/bc;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 1047
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/common/bc;->b:Ljava/lang/ref/WeakReference;

    if-nez v1, :cond_2

    const/4 v1, 0x0

    .line 1048
    :goto_0
    if-eqz v1, :cond_3

    .line 1050
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 1051
    const-string v4, "SHAKE"

    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 1052
    if-ne v1, v2, :cond_3

    move v1, v2

    .line 33
    :goto_1
    if-eqz v1, :cond_1

    .line 34
    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lcom/roidapp/photogrid/common/bc;->a:Landroid/hardware/SensorManager;

    .line 35
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bc;->a:Landroid/hardware/SensorManager;

    invoke-virtual {v0, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    .line 36
    iget-object v1, p0, Lcom/roidapp/photogrid/common/bc;->a:Landroid/hardware/SensorManager;

    invoke-virtual {v1, p0, v0, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 38
    :cond_1
    return-void

    .line 1047
    :cond_2
    iget-object v1, p0, Lcom/roidapp/photogrid/common/bc;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    goto :goto_0

    :cond_3
    move v1, v3

    .line 1055
    goto :goto_1
.end method

.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    .prologue
    .line 132
    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 10

    .prologue
    const-wide/16 v8, 0x64

    const/4 v7, 0x0

    .line 93
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bc;->b:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bc;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 95
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 96
    iget-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v1, :cond_1

    .line 127
    :cond_0
    :goto_0
    return-void

    .line 98
    :cond_1
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v2, 0x8

    if-ne v1, v2, :cond_2

    const-string v1, "FragmentTextEdit"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 101
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 102
    iget-wide v4, p0, Lcom/roidapp/photogrid/common/bc;->c:J

    sub-long v4, v2, v4

    cmp-long v1, v4, v8

    if-lez v1, :cond_0

    .line 103
    iget-wide v4, p0, Lcom/roidapp/photogrid/common/bc;->c:J

    sub-long v4, v2, v4

    .line 104
    iput-wide v2, p0, Lcom/roidapp/photogrid/common/bc;->c:J

    .line 106
    iget-object v1, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v1, v1, v7

    iput v1, p0, Lcom/roidapp/photogrid/common/bc;->e:F

    .line 107
    iget-object v1, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v6, 0x1

    aget v1, v1, v6

    iput v1, p0, Lcom/roidapp/photogrid/common/bc;->f:F

    .line 108
    iget-object v1, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v6, 0x2

    aget v1, v1, v6

    iput v1, p0, Lcom/roidapp/photogrid/common/bc;->g:F

    .line 110
    iget v1, p0, Lcom/roidapp/photogrid/common/bc;->e:F

    iget v6, p0, Lcom/roidapp/photogrid/common/bc;->f:F

    add-float/2addr v1, v6

    iget v6, p0, Lcom/roidapp/photogrid/common/bc;->g:F

    add-float/2addr v1, v6

    iget v6, p0, Lcom/roidapp/photogrid/common/bc;->h:F

    sub-float/2addr v1, v6

    iget v6, p0, Lcom/roidapp/photogrid/common/bc;->i:F

    sub-float/2addr v1, v6

    iget v6, p0, Lcom/roidapp/photogrid/common/bc;->j:F

    sub-float/2addr v1, v6

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    long-to-float v4, v4

    div-float/2addr v1, v4

    const v4, 0x461c4000    # 10000.0f

    mul-float/2addr v1, v4

    .line 111
    iget v4, p0, Lcom/roidapp/photogrid/common/bc;->e:F

    iput v4, p0, Lcom/roidapp/photogrid/common/bc;->h:F

    .line 112
    iget v4, p0, Lcom/roidapp/photogrid/common/bc;->f:F

    iput v4, p0, Lcom/roidapp/photogrid/common/bc;->i:F

    .line 113
    iget v4, p0, Lcom/roidapp/photogrid/common/bc;->g:F

    iput v4, p0, Lcom/roidapp/photogrid/common/bc;->j:F

    .line 115
    iget-wide v4, p0, Lcom/roidapp/photogrid/common/bc;->d:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    cmp-long v2, v2, v4

    if-lez v2, :cond_3

    const/high16 v2, 0x44960000    # 1200.0f

    cmpl-float v1, v1, v2

    if-lez v1, :cond_3

    .line 116
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/roidapp/photogrid/common/bc;->d:J

    .line 117
    const-string v1, "vibrator"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Vibrator;

    .line 118
    invoke-virtual {v1, v8, v9}, Landroid/os/Vibrator;->vibrate(J)V

    .line 119
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->w()V

    goto :goto_0

    .line 121
    :cond_3
    iput-boolean v7, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    goto/16 :goto_0
.end method

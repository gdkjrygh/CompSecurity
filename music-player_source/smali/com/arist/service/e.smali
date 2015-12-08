.class final Lcom/arist/service/e;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field final synthetic a:Lcom/arist/service/MusicPlayService;


# direct methods
.method constructor <init>(Lcom/arist/service/MusicPlayService;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/service/e;->a:Lcom/arist/service/MusicPlayService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 4

    const/high16 v3, 0x41980000    # 19.0f

    sget-object v0, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v0}, Lcom/arist/c/f;->g()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v1, 0x0

    aget v1, v0, v1

    const/4 v2, 0x1

    aget v0, v0, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v1, v1, v3

    if-lez v1, :cond_2

    iget-object v0, p0, Lcom/arist/service/e;->a:Lcom/arist/service/MusicPlayService;

    invoke-static {v0}, Lcom/arist/service/MusicPlayService;->a(Lcom/arist/service/MusicPlayService;)V

    goto :goto_0

    :cond_2
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v0, v3

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/arist/service/e;->a:Lcom/arist/service/MusicPlayService;

    invoke-static {v0}, Lcom/arist/service/MusicPlayService;->b(Lcom/arist/service/MusicPlayService;)V

    goto :goto_0
.end method

.class Lcom/arist/service/MusicPlayService$1;
.super Ljava/lang/Object;
.source "MusicPlayService.java"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/service/MusicPlayService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/service/MusicPlayService;


# direct methods
.method constructor <init>(Lcom/arist/service/MusicPlayService;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/service/MusicPlayService$1;->this$0:Lcom/arist/service/MusicPlayService;

    .line 644
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0
    .param p1, "sensor"    # Landroid/hardware/Sensor;
    .param p2, "accuracy"    # I

    .prologue
    .line 664
    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 7
    .param p1, "event"    # Landroid/hardware/SensorEvent;

    .prologue
    const/4 v6, 0x0

    .line 647
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v4

    .line 648
    const-string v5, "shake_to_change_song"

    .line 647
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    .line 648
    if-nez v4, :cond_1

    .line 660
    :cond_0
    :goto_0
    return-void

    .line 651
    :cond_1
    iget-object v1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 652
    .local v1, "values":[F
    aget v2, v1, v6

    .line 653
    .local v2, "x":F
    const/4 v4, 0x1

    aget v3, v1, v4

    .line 655
    .local v3, "y":F
    const/16 v0, 0x13

    .line 656
    .local v0, "medumValue":I
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v4

    int-to-float v5, v0

    cmpl-float v4, v4, v5

    if-lez v4, :cond_2

    .line 657
    iget-object v4, p0, Lcom/arist/service/MusicPlayService$1;->this$0:Lcom/arist/service/MusicPlayService;

    # invokes: Lcom/arist/service/MusicPlayService;->next()V
    invoke-static {v4}, Lcom/arist/service/MusicPlayService;->access$0(Lcom/arist/service/MusicPlayService;)V

    goto :goto_0

    .line 658
    :cond_2
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v4

    int-to-float v5, v0

    cmpl-float v4, v4, v5

    if-lez v4, :cond_0

    .line 659
    iget-object v4, p0, Lcom/arist/service/MusicPlayService$1;->this$0:Lcom/arist/service/MusicPlayService;

    # invokes: Lcom/arist/service/MusicPlayService;->previous()V
    invoke-static {v4}, Lcom/arist/service/MusicPlayService;->access$1(Lcom/arist/service/MusicPlayService;)V

    goto :goto_0
.end method

.class public Lcom/facebook/bugreporter/ae;
.super Lcom/facebook/base/activity/a;
.source "RageShakeDetector.java"


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/ab;

.field private b:Landroid/hardware/SensorManager;

.field private c:Lcom/facebook/m/a;


# direct methods
.method public constructor <init>(Lcom/facebook/bugreporter/ab;)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lcom/facebook/bugreporter/ae;->a:Lcom/facebook/bugreporter/ab;

    invoke-direct {p0}, Lcom/facebook/base/activity/a;-><init>()V

    return-void
.end method


# virtual methods
.method a()V
    .locals 1

    .prologue
    .line 175
    iget-object v0, p0, Lcom/facebook/bugreporter/ae;->c:Lcom/facebook/m/a;

    if-eqz v0, :cond_0

    .line 176
    iget-object v0, p0, Lcom/facebook/bugreporter/ae;->c:Lcom/facebook/m/a;

    invoke-virtual {v0}, Lcom/facebook/m/a;->b()V

    .line 178
    :cond_0
    return-void
.end method

.method public b(Landroid/app/Activity;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 140
    invoke-virtual {p1}, Landroid/app/Activity;->isChild()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 158
    :cond_0
    :goto_0
    return-void

    .line 143
    :cond_1
    iget-object v0, p0, Lcom/facebook/bugreporter/ae;->a:Lcom/facebook/bugreporter/ab;

    invoke-static {v0}, Lcom/facebook/bugreporter/ab;->d(Lcom/facebook/bugreporter/ab;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p0, Lcom/facebook/bugreporter/ae;->c:Lcom/facebook/m/a;

    if-nez v0, :cond_2

    .line 145
    new-instance v0, Lcom/facebook/bugreporter/af;

    invoke-direct {v0, p0}, Lcom/facebook/bugreporter/af;-><init>(Lcom/facebook/bugreporter/ae;)V

    iput-object v0, p0, Lcom/facebook/bugreporter/ae;->c:Lcom/facebook/m/a;

    .line 152
    :cond_2
    iget-object v0, p0, Lcom/facebook/bugreporter/ae;->b:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/facebook/bugreporter/ae;->c:Lcom/facebook/m/a;

    iget-object v2, p0, Lcom/facebook/bugreporter/ae;->b:Landroid/hardware/SensorManager;

    invoke-virtual {v2, v4}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 155
    iget-object v0, p0, Lcom/facebook/bugreporter/ae;->a:Lcom/facebook/bugreporter/ab;

    invoke-static {v0, v4}, Lcom/facebook/bugreporter/ab;->a(Lcom/facebook/bugreporter/ab;Z)Z

    .line 156
    iget-object v0, p0, Lcom/facebook/bugreporter/ae;->a:Lcom/facebook/bugreporter/ab;

    invoke-static {v0, p1}, Lcom/facebook/bugreporter/ab;->a(Lcom/facebook/bugreporter/ab;Landroid/app/Activity;)Landroid/app/Activity;

    goto :goto_0
.end method

.method public c(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 162
    invoke-virtual {p1}, Landroid/app/Activity;->isChild()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 172
    :cond_0
    :goto_0
    return-void

    .line 165
    :cond_1
    iget-object v0, p0, Lcom/facebook/bugreporter/ae;->c:Lcom/facebook/m/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/bugreporter/ae;->a:Lcom/facebook/bugreporter/ab;

    invoke-static {v0}, Lcom/facebook/bugreporter/ab;->e(Lcom/facebook/bugreporter/ab;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Lcom/facebook/bugreporter/ae;->a:Lcom/facebook/bugreporter/ab;

    invoke-static {v0}, Lcom/facebook/bugreporter/ab;->f(Lcom/facebook/bugreporter/ab;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 167
    iget-object v0, p0, Lcom/facebook/bugreporter/ae;->a:Lcom/facebook/bugreporter/ab;

    invoke-static {v0}, Lcom/facebook/bugreporter/ab;->g(Lcom/facebook/bugreporter/ab;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 168
    :cond_2
    iget-object v0, p0, Lcom/facebook/bugreporter/ae;->b:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/facebook/bugreporter/ae;->c:Lcom/facebook/m/a;

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 169
    iget-object v0, p0, Lcom/facebook/bugreporter/ae;->a:Lcom/facebook/bugreporter/ab;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/bugreporter/ab;->a(Lcom/facebook/bugreporter/ab;Z)Z

    .line 170
    iget-object v0, p0, Lcom/facebook/bugreporter/ae;->a:Lcom/facebook/bugreporter/ab;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/bugreporter/ab;->a(Lcom/facebook/bugreporter/ab;Landroid/app/Activity;)Landroid/app/Activity;

    goto :goto_0
.end method

.method public g(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 135
    const-string v0, "sensor"

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lcom/facebook/bugreporter/ae;->b:Landroid/hardware/SensorManager;

    .line 136
    return-void
.end method

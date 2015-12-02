.class Lcom/facebook/push/mqtt/bc;
.super Lcom/facebook/inject/d;
.source "MqttPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/mqtt/o;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/ax;


# direct methods
.method private constructor <init>(Lcom/facebook/push/mqtt/ax;)V
    .locals 0

    .prologue
    .line 224
    iput-object p1, p0, Lcom/facebook/push/mqtt/bc;->a:Lcom/facebook/push/mqtt/ax;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V
    .locals 0

    .prologue
    .line 224
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/bc;-><init>(Lcom/facebook/push/mqtt/ax;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/mqtt/o;
    .locals 6

    .prologue
    .line 228
    new-instance v4, Lcom/facebook/push/mqtt/o;

    invoke-virtual {p0}, Lcom/facebook/push/mqtt/bc;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {p0}, Lcom/facebook/push/mqtt/bc;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/app/AlarmManager;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/AlarmManager;

    const-class v2, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v2}, Lcom/facebook/push/mqtt/bc;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/time/a;

    const-class v3, Ljava/lang/Integer;

    const-class v5, Lcom/facebook/push/annotations/KeepaliveDelayAdjustmentPercentage;

    invoke-virtual {p0, v3, v5}, Lcom/facebook/push/mqtt/bc;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/push/mqtt/o;-><init>(Landroid/content/Context;Landroid/app/AlarmManager;Lcom/facebook/common/time/a;I)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 224
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/bc;->a()Lcom/facebook/push/mqtt/o;

    move-result-object v0

    return-object v0
.end method

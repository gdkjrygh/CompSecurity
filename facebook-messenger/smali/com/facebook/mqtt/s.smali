.class Lcom/facebook/mqtt/s;
.super Lcom/facebook/inject/d;
.source "MqttClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/mqtt/p;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/mqtt/r;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/facebook/mqtt/s;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/mqtt/p;
    .locals 6

    .prologue
    .line 33
    new-instance v0, Lcom/facebook/mqtt/p;

    const-class v1, Landroid/net/ConnectivityManager;

    invoke-virtual {p0, v1}, Lcom/facebook/mqtt/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    const-class v2, Lcom/facebook/mqtt/y;

    invoke-virtual {p0, v2}, Lcom/facebook/mqtt/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/mqtt/y;

    const-class v3, Lcom/facebook/analytics/cj;

    invoke-virtual {p0, v3}, Lcom/facebook/mqtt/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/analytics/cj;

    const-class v4, Lcom/facebook/k/a;

    invoke-virtual {p0, v4}, Lcom/facebook/mqtt/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/k/a;

    const-class v5, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v5}, Lcom/facebook/mqtt/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/time/a;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/mqtt/p;-><init>(Landroid/net/ConnectivityManager;Lcom/facebook/mqtt/y;Lcom/facebook/analytics/cj;Lcom/facebook/k/a;Lcom/facebook/common/time/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 29
    invoke-virtual {p0}, Lcom/facebook/mqtt/s;->a()Lcom/facebook/mqtt/p;

    move-result-object v0

    return-object v0
.end method

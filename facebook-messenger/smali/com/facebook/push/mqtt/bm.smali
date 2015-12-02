.class Lcom/facebook/push/mqtt/bm;
.super Lcom/facebook/inject/d;
.source "MqttPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/mqtt/abtest/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/ax;


# direct methods
.method private constructor <init>(Lcom/facebook/push/mqtt/ax;)V
    .locals 0

    .prologue
    .line 316
    iput-object p1, p0, Lcom/facebook/push/mqtt/bm;->a:Lcom/facebook/push/mqtt/ax;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V
    .locals 0

    .prologue
    .line 316
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/bm;-><init>(Lcom/facebook/push/mqtt/ax;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/mqtt/abtest/a;
    .locals 2

    .prologue
    .line 321
    new-instance v1, Lcom/facebook/push/mqtt/abtest/a;

    const-class v0, Lcom/facebook/abtest/qe/d/e;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/d/e;

    invoke-direct {v1, v0}, Lcom/facebook/push/mqtt/abtest/a;-><init>(Lcom/facebook/abtest/qe/d/e;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 316
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/bm;->a()Lcom/facebook/push/mqtt/abtest/a;

    move-result-object v0

    return-object v0
.end method

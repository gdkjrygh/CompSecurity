.class Lcom/facebook/push/mqtt/bj;
.super Lcom/facebook/inject/d;
.source "MqttPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/mqtt/at;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/ax;


# direct methods
.method private constructor <init>(Lcom/facebook/push/mqtt/ax;)V
    .locals 0

    .prologue
    .line 288
    iput-object p1, p0, Lcom/facebook/push/mqtt/bj;->a:Lcom/facebook/push/mqtt/ax;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V
    .locals 0

    .prologue
    .line 288
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/bj;-><init>(Lcom/facebook/push/mqtt/ax;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/mqtt/at;
    .locals 3

    .prologue
    .line 293
    new-instance v0, Lcom/facebook/push/mqtt/at;

    const-class v1, Lcom/facebook/push/mqtt/ar;

    const-class v2, Lcom/facebook/push/annotations/HighestMqttPersistence;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/push/mqtt/bj;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/push/mqtt/at;-><init>(Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 288
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/bj;->a()Lcom/facebook/push/mqtt/at;

    move-result-object v0

    return-object v0
.end method

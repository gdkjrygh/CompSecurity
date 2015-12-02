.class Lcom/facebook/push/mqtt/bb;
.super Lcom/facebook/inject/d;
.source "MqttPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/mqtt/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/ax;


# direct methods
.method private constructor <init>(Lcom/facebook/push/mqtt/ax;)V
    .locals 0

    .prologue
    .line 277
    iput-object p1, p0, Lcom/facebook/push/mqtt/bb;->a:Lcom/facebook/push/mqtt/ax;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V
    .locals 0

    .prologue
    .line 277
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/bb;-><init>(Lcom/facebook/push/mqtt/ax;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/mqtt/f;
    .locals 3

    .prologue
    .line 282
    new-instance v0, Lcom/facebook/push/mqtt/f;

    const-class v1, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/push/annotations/IsDeviceForegroundEnabled;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/push/mqtt/bb;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/push/mqtt/f;-><init>(Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 277
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/bb;->a()Lcom/facebook/push/mqtt/f;

    move-result-object v0

    return-object v0
.end method

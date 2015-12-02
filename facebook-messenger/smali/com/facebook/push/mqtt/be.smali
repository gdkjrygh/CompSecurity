.class Lcom/facebook/push/mqtt/be;
.super Lcom/facebook/inject/d;
.source "MqttPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/mqtt/u;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/ax;


# direct methods
.method private constructor <init>(Lcom/facebook/push/mqtt/ax;)V
    .locals 0

    .prologue
    .line 299
    iput-object p1, p0, Lcom/facebook/push/mqtt/be;->a:Lcom/facebook/push/mqtt/ax;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V
    .locals 0

    .prologue
    .line 299
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/be;-><init>(Lcom/facebook/push/mqtt/ax;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/mqtt/u;
    .locals 9

    .prologue
    .line 303
    new-instance v0, Lcom/facebook/push/mqtt/u;

    const-class v1, Lcom/facebook/mqtt/p;

    invoke-virtual {p0, v1}, Lcom/facebook/push/mqtt/be;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/mqtt/p;

    const-class v2, Lcom/facebook/mqtt/t;

    invoke-virtual {p0, v2}, Lcom/facebook/push/mqtt/be;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v3, Lcom/facebook/auth/credentials/UserTokenCredentials;

    invoke-virtual {p0, v3}, Lcom/facebook/push/mqtt/be;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v4, Lcom/facebook/device_id/l;

    invoke-virtual {p0, v4}, Lcom/facebook/push/mqtt/be;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/device_id/l;

    const-class v5, Lcom/facebook/common/v/a;

    invoke-virtual {p0, v5}, Lcom/facebook/push/mqtt/be;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/v/a;

    const-class v6, Ljava/lang/Boolean;

    const-class v7, Lcom/facebook/push/annotations/IsMobileOnlineAvailabilityEnabled;

    invoke-virtual {p0, v6, v7}, Lcom/facebook/push/mqtt/be;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v6

    const-class v7, Ljava/lang/String;

    const-class v8, Lcom/facebook/http/annotations/UserAgentString;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/push/mqtt/be;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v7

    const-class v8, Lcom/facebook/push/mqtt/abtest/a;

    invoke-virtual {p0, v8}, Lcom/facebook/push/mqtt/be;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/push/mqtt/abtest/a;

    invoke-direct/range {v0 .. v8}, Lcom/facebook/push/mqtt/u;-><init>(Lcom/facebook/mqtt/p;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/device_id/l;Lcom/facebook/common/v/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/push/mqtt/abtest/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 299
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/be;->a()Lcom/facebook/push/mqtt/u;

    move-result-object v0

    return-object v0
.end method

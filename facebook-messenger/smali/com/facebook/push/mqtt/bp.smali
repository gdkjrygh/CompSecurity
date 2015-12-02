.class Lcom/facebook/push/mqtt/bp;
.super Lcom/facebook/inject/d;
.source "MqttPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/mqtt/ci;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/ax;


# direct methods
.method private constructor <init>(Lcom/facebook/push/mqtt/ax;)V
    .locals 0

    .prologue
    .line 187
    iput-object p1, p0, Lcom/facebook/push/mqtt/bp;->a:Lcom/facebook/push/mqtt/ax;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V
    .locals 0

    .prologue
    .line 187
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/bp;-><init>(Lcom/facebook/push/mqtt/ax;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/mqtt/ci;
    .locals 3

    .prologue
    .line 191
    new-instance v2, Lcom/facebook/push/mqtt/ci;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/bp;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/c/j;

    invoke-virtual {p0, v1}, Lcom/facebook/push/mqtt/bp;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/c/j;

    invoke-direct {v2, v0, v1}, Lcom/facebook/push/mqtt/ci;-><init>(Landroid/content/Context;Lcom/facebook/c/j;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 187
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/bp;->a()Lcom/facebook/push/mqtt/ci;

    move-result-object v0

    return-object v0
.end method

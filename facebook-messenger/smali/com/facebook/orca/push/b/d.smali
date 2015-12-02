.class Lcom/facebook/orca/push/b/d;
.super Lcom/facebook/inject/d;
.source "OrcaMqttPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/mqtt/t;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/push/b/b;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/push/b/b;)V
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/facebook/orca/push/b/d;->a:Lcom/facebook/orca/push/b/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/push/b/b;Lcom/facebook/orca/push/b/c;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0, p1}, Lcom/facebook/orca/push/b/d;-><init>(Lcom/facebook/orca/push/b/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/mqtt/t;
    .locals 1

    .prologue
    .line 63
    const-class v0, Lcom/facebook/config/server/j;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/push/b/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/server/j;

    invoke-interface {v0}, Lcom/facebook/config/server/j;->d()Lcom/facebook/mqtt/t;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 59
    invoke-virtual {p0}, Lcom/facebook/orca/push/b/d;->a()Lcom/facebook/mqtt/t;

    move-result-object v0

    return-object v0
.end method

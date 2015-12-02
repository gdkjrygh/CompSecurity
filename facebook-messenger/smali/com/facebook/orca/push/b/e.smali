.class Lcom/facebook/orca/push/b/e;
.super Lcom/facebook/inject/d;
.source "OrcaMqttPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/push/b/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/push/b/b;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/push/b/b;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lcom/facebook/orca/push/b/e;->a:Lcom/facebook/orca/push/b/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/push/b/b;Lcom/facebook/orca/push/b/c;)V
    .locals 0

    .prologue
    .line 67
    invoke-direct {p0, p1}, Lcom/facebook/orca/push/b/e;-><init>(Lcom/facebook/orca/push/b/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/push/b/a;
    .locals 11

    .prologue
    .line 71
    const-class v0, Lcom/facebook/config/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/push/b/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/config/a/a;

    .line 72
    const/4 v9, 0x0

    .line 73
    invoke-virtual {v10}, Lcom/facebook/config/a/a;->i()Lcom/facebook/config/a/d;

    move-result-object v0

    sget-object v1, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    if-ne v0, v1, :cond_0

    .line 74
    const-class v0, Lcom/facebook/launcherbadges/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/push/b/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/launcherbadges/a;

    move-object v9, v0

    .line 77
    :cond_0
    new-instance v0, Lcom/facebook/orca/push/b/a;

    const-class v1, Lcom/facebook/orca/push/b;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/push/b/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/push/b;

    const-class v2, Lcom/facebook/orca/push/a/b;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/push/b/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/push/a/b;

    const-class v3, Lcom/facebook/orca/f/l;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/push/b/e;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v4, Lcom/facebook/l/k;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/push/b/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/l/k;

    const-class v5, Lcom/facebook/analytics/cn;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/push/b/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/analytics/cn;

    const-class v6, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/push/b/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-class v7, Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/push/b/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/orca/fbwebrtc/ag;

    const-class v8, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v8}, Lcom/facebook/orca/push/b/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/auth/b/b;

    invoke-direct/range {v0 .. v10}, Lcom/facebook/orca/push/b/a;-><init>(Lcom/facebook/orca/push/b;Lcom/facebook/orca/push/a/b;Ljavax/inject/a;Lcom/facebook/l/k;Lcom/facebook/analytics/cn;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/orca/fbwebrtc/ag;Lcom/facebook/auth/b/b;Lcom/facebook/launcherbadges/a;Lcom/facebook/config/a/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 67
    invoke-virtual {p0}, Lcom/facebook/orca/push/b/e;->a()Lcom/facebook/orca/push/b/a;

    move-result-object v0

    return-object v0
.end method

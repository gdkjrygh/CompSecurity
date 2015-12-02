.class public Lcom/facebook/push/mqtt/u;
.super Ljava/lang/Object;
.source "MqttClientForPushFactory.java"


# instance fields
.field private final a:Lcom/facebook/mqtt/p;

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/mqtt/t;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/credentials/UserTokenCredentials;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/device_id/l;

.field private final e:Lcom/facebook/common/v/a;

.field private final f:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/facebook/push/mqtt/abtest/a;


# direct methods
.method public constructor <init>(Lcom/facebook/mqtt/p;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/device_id/l;Lcom/facebook/common/v/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/push/mqtt/abtest/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/mqtt/p;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/mqtt/t;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/credentials/UserTokenCredentials;",
            ">;",
            "Lcom/facebook/device_id/l;",
            "Lcom/facebook/common/v/a;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/push/mqtt/abtest/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/facebook/push/mqtt/u;->a:Lcom/facebook/mqtt/p;

    .line 44
    iput-object p2, p0, Lcom/facebook/push/mqtt/u;->b:Ljavax/inject/a;

    .line 45
    iput-object p3, p0, Lcom/facebook/push/mqtt/u;->c:Ljavax/inject/a;

    .line 46
    iput-object p4, p0, Lcom/facebook/push/mqtt/u;->d:Lcom/facebook/device_id/l;

    .line 47
    iput-object p5, p0, Lcom/facebook/push/mqtt/u;->e:Lcom/facebook/common/v/a;

    .line 48
    iput-object p6, p0, Lcom/facebook/push/mqtt/u;->f:Ljavax/inject/a;

    .line 49
    iput-object p7, p0, Lcom/facebook/push/mqtt/u;->g:Ljavax/inject/a;

    .line 50
    iput-object p8, p0, Lcom/facebook/push/mqtt/u;->h:Lcom/facebook/push/mqtt/abtest/a;

    .line 51
    return-void
.end method


# virtual methods
.method public a(I)Lcom/facebook/mqtt/b;
    .locals 11

    .prologue
    const/4 v3, 0x0

    .line 54
    iget-object v0, p0, Lcom/facebook/push/mqtt/u;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/mqtt/t;

    .line 55
    if-nez v1, :cond_0

    move-object v0, v3

    .line 92
    :goto_0
    return-object v0

    .line 59
    :cond_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/u;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/facebook/auth/credentials/UserTokenCredentials;

    .line 60
    if-nez v4, :cond_1

    move-object v0, v3

    .line 61
    goto :goto_0

    .line 64
    :cond_1
    iget-object v0, p0, Lcom/facebook/push/mqtt/u;->d:Lcom/facebook/device_id/l;

    invoke-virtual {v0}, Lcom/facebook/device_id/l;->c()Ljava/lang/String;

    move-result-object v2

    .line 65
    if-nez v2, :cond_2

    move-object v0, v3

    .line 66
    goto :goto_0

    .line 69
    :cond_2
    iget-object v0, p0, Lcom/facebook/push/mqtt/u;->e:Lcom/facebook/common/v/a;

    const-wide/16 v5, 0x2710

    invoke-virtual {v0, v5, v6}, Lcom/facebook/common/v/a;->b(J)Z

    move-result v3

    .line 72
    iget-object v0, p0, Lcom/facebook/push/mqtt/u;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 73
    new-instance v10, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v5, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v10, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 74
    const-string v5, "make_user_available_when_in_foreground"

    invoke-virtual {v10, v5, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 75
    const-string v0, "no_automatic_foreground"

    const/4 v5, 0x1

    invoke-virtual {v10, v0, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 76
    const-string v0, "device_id"

    iget-object v5, p0, Lcom/facebook/push/mqtt/u;->d:Lcom/facebook/device_id/l;

    invoke-virtual {v5}, Lcom/facebook/device_id/l;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10, v0, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 77
    const-string v0, "initial_foreground_state"

    invoke-virtual {v10, v0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 79
    iget-object v0, p0, Lcom/facebook/push/mqtt/u;->h:Lcom/facebook/push/mqtt/abtest/a;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/abtest/a;->a()Lcom/facebook/push/mqtt/abtest/e;

    move-result-object v6

    .line 80
    new-instance v0, Lcom/facebook/mqtt/w;

    invoke-virtual {v4}, Lcom/facebook/auth/credentials/UserTokenCredentials;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4}, Lcom/facebook/auth/credentials/UserTokenCredentials;->b()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/facebook/push/mqtt/u;->g:Ljavax/inject/a;

    invoke-interface {v5}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v6}, Lcom/facebook/push/mqtt/abtest/e;->c()I

    move-result v7

    invoke-virtual {v6}, Lcom/facebook/push/mqtt/abtest/e;->b()I

    move-result v8

    invoke-virtual {v6}, Lcom/facebook/push/mqtt/abtest/e;->a()I

    move-result v9

    move v6, p1

    invoke-direct/range {v0 .. v10}, Lcom/facebook/mqtt/w;-><init>(Lcom/facebook/mqtt/t;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILcom/fasterxml/jackson/databind/node/ObjectNode;)V

    .line 92
    iget-object v1, p0, Lcom/facebook/push/mqtt/u;->a:Lcom/facebook/mqtt/p;

    invoke-virtual {v1, v0}, Lcom/facebook/mqtt/p;->a(Lcom/facebook/mqtt/w;)Lcom/facebook/mqtt/b;

    move-result-object v0

    goto :goto_0
.end method

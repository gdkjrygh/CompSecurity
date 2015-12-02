.class public Lcom/facebook/push/mqtt/bw;
.super Ljava/lang/Object;
.source "MqttPushServiceClient.java"


# instance fields
.field private final a:Lcom/facebook/push/mqtt/bx;

.field private volatile b:Lcom/facebook/push/mqtt/j;

.field private volatile c:Z


# direct methods
.method constructor <init>(Lcom/facebook/push/mqtt/bx;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/push/mqtt/bw;->a:Lcom/facebook/push/mqtt/bx;

    .line 25
    return-void
.end method

.method private d()Lcom/facebook/push/mqtt/j;
    .locals 2

    .prologue
    .line 145
    invoke-direct {p0}, Lcom/facebook/push/mqtt/bw;->e()V

    .line 146
    iget-object v0, p0, Lcom/facebook/push/mqtt/bw;->b:Lcom/facebook/push/mqtt/j;

    .line 147
    if-nez v0, :cond_0

    .line 148
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No service bound"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 150
    :cond_0
    return-object v0
.end method

.method private e()V
    .locals 2

    .prologue
    .line 154
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/bw;->c:Z

    if-eqz v0, :cond_0

    .line 155
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Closed already called"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 157
    :cond_0
    return-void
.end method


# virtual methods
.method a(Lcom/facebook/push/mqtt/j;)V
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/facebook/push/mqtt/bw;->b:Lcom/facebook/push/mqtt/j;

    .line 29
    return-void
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/facebook/push/mqtt/bw;->d()Lcom/facebook/push/mqtt/j;

    move-result-object v0

    .line 38
    invoke-interface {v0}, Lcom/facebook/push/mqtt/j;->a()Z

    move-result v0

    return v0
.end method

.method public a(J)Z
    .locals 1

    .prologue
    .line 60
    invoke-direct {p0}, Lcom/facebook/push/mqtt/bw;->d()Lcom/facebook/push/mqtt/j;

    move-result-object v0

    .line 61
    invoke-interface {v0, p1, p2}, Lcom/facebook/push/mqtt/j;->a(J)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;J)Z
    .locals 2

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/push/mqtt/bw;->d()Lcom/facebook/push/mqtt/j;

    move-result-object v0

    .line 91
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1, p3, p4}, Lcom/facebook/push/mqtt/j;->a(Ljava/lang/String;Ljava/lang/String;J)Z

    move-result v0

    return v0
.end method

.method public b()Lcom/facebook/push/mqtt/bu;
    .locals 1

    .prologue
    .line 123
    invoke-direct {p0}, Lcom/facebook/push/mqtt/bw;->e()V

    .line 124
    iget-object v0, p0, Lcom/facebook/push/mqtt/bw;->b:Lcom/facebook/push/mqtt/j;

    .line 125
    if-nez v0, :cond_0

    .line 126
    sget-object v0, Lcom/facebook/push/mqtt/bu;->DISCONNECTED:Lcom/facebook/push/mqtt/bu;

    .line 132
    :goto_0
    return-object v0

    .line 129
    :cond_0
    :try_start_0
    invoke-interface {v0}, Lcom/facebook/push/mqtt/j;->c()Ljava/lang/String;

    move-result-object v0

    .line 130
    invoke-static {v0}, Lcom/facebook/push/mqtt/bu;->valueOf(Ljava/lang/String;)Lcom/facebook/push/mqtt/bu;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 131
    :catch_0
    move-exception v0

    .line 132
    sget-object v0, Lcom/facebook/push/mqtt/bu;->DISCONNECTED:Lcom/facebook/push/mqtt/bu;

    goto :goto_0
.end method

.method public c()V
    .locals 1

    .prologue
    .line 140
    iget-object v0, p0, Lcom/facebook/push/mqtt/bw;->a:Lcom/facebook/push/mqtt/bx;

    invoke-virtual {v0, p0}, Lcom/facebook/push/mqtt/bx;->a(Lcom/facebook/push/mqtt/bw;)V

    .line 141
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/push/mqtt/bw;->c:Z

    .line 142
    return-void
.end method

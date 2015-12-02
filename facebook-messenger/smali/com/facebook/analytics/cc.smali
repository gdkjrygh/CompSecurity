.class public Lcom/facebook/analytics/cc;
.super Lcom/facebook/analytics/ca;
.source "HoneyExperimentEvent.java"


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lcom/fasterxml/jackson/databind/node/ObjectNode;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 28
    const-string v0, "AUTO_SET"

    invoke-direct {p0, p1, v0}, Lcom/facebook/analytics/cc;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 32
    const-string v0, "experiment"

    invoke-direct {p0, v0, p2}, Lcom/facebook/analytics/ca;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    iput-object p1, p0, Lcom/facebook/analytics/cc;->b:Ljava/lang/String;

    .line 34
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/analytics/cc;
    .locals 2

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/analytics/cc;->d:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    if-nez v0, :cond_0

    .line 65
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    iput-object v0, p0, Lcom/facebook/analytics/cc;->d:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 67
    :cond_0
    iget-object v0, p0, Lcom/facebook/analytics/cc;->d:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 68
    return-object p0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cc;
    .locals 2

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/analytics/cc;->d:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    if-nez v0, :cond_0

    .line 38
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    iput-object v0, p0, Lcom/facebook/analytics/cc;->d:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 41
    :cond_0
    if-eqz p2, :cond_1

    .line 42
    iget-object v0, p0, Lcom/facebook/analytics/cc;->d:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 44
    :cond_1
    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/facebook/analytics/cc;
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/facebook/analytics/cc;->c:Ljava/lang/String;

    .line 73
    return-object p0
.end method

.method public e()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 4

    .prologue
    .line 86
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 88
    const-string v1, "time"

    invoke-virtual {p0}, Lcom/facebook/analytics/cc;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/facebook/analytics/i/b;->a(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 90
    const-string v1, "log_type"

    invoke-virtual {p0}, Lcom/facebook/analytics/cc;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 92
    const-string v1, "name"

    iget-object v2, p0, Lcom/facebook/analytics/cc;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 94
    iget-object v1, p0, Lcom/facebook/analytics/cc;->c:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 95
    const-string v1, "exprID"

    iget-object v2, p0, Lcom/facebook/analytics/cc;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 98
    :cond_0
    iget-object v1, p0, Lcom/facebook/analytics/cc;->d:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    if-eqz v1, :cond_1

    .line 99
    const-string v1, "result"

    iget-object v2, p0, Lcom/facebook/analytics/cc;->d:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 102
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/analytics/cc;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 103
    const-string v1, "bg"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 106
    :cond_2
    return-object v0
.end method

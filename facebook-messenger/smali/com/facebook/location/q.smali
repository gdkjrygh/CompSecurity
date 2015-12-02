.class public Lcom/facebook/location/q;
.super Ljava/lang/Object;
.source "LocationAnalyticsFeatureStatusReporter.java"

# interfaces
.implements Lcom/facebook/analytics/d/a;


# instance fields
.field private final a:Lcom/facebook/location/aa;


# direct methods
.method public constructor <init>(Lcom/facebook/location/aa;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/facebook/location/q;->a:Lcom/facebook/location/aa;

    .line 23
    return-void
.end method

.method private a(Ljava/util/Collection;)Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/fasterxml/jackson/databind/node/ArrayNode;"
        }
    .end annotation

    .prologue
    .line 57
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 58
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 59
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_0

    .line 61
    :cond_0
    return-object v1
.end method

.method private d()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 3

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/location/q;->a:Lcom/facebook/location/aa;

    if-nez v0, :cond_0

    .line 44
    const/4 v0, 0x0

    .line 53
    :goto_0
    return-object v0

    .line 46
    :cond_0
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 47
    const-string v1, "all"

    iget-object v2, p0, Lcom/facebook/location/q;->a:Lcom/facebook/location/aa;

    invoke-virtual {v2}, Lcom/facebook/location/aa;->a()Ljava/util/Set;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/location/q;->a(Ljava/util/Collection;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 48
    const-string v1, "possible"

    iget-object v2, p0, Lcom/facebook/location/q;->a:Lcom/facebook/location/aa;

    invoke-virtual {v2}, Lcom/facebook/location/aa;->b()Ljava/util/Set;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/location/q;->a(Ljava/util/Collection;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 49
    const-string v1, "enabled"

    iget-object v2, p0, Lcom/facebook/location/q;->a:Lcom/facebook/location/aa;

    invoke-virtual {v2}, Lcom/facebook/location/aa;->c()Ljava/util/Set;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/location/q;->a(Ljava/util/Collection;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 50
    const-string v1, "disabled"

    iget-object v2, p0, Lcom/facebook/location/q;->a:Lcom/facebook/location/aa;

    invoke-virtual {v2}, Lcom/facebook/location/aa;->d()Ljava/util/Set;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/location/q;->a(Ljava/util/Collection;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 51
    const-string v1, "user_enabled"

    iget-object v2, p0, Lcom/facebook/location/q;->a:Lcom/facebook/location/aa;

    invoke-virtual {v2}, Lcom/facebook/location/aa;->e()Ljava/util/Set;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/location/q;->a(Ljava/util/Collection;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 52
    const-string v1, "user_disabled"

    iget-object v2, p0, Lcom/facebook/location/q;->a:Lcom/facebook/location/aa;

    invoke-virtual {v2}, Lcom/facebook/location/aa;->f()Ljava/util/Set;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/location/q;->a(Ljava/util/Collection;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    const-string v0, "location"

    return-object v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/location/q;->a:Lcom/facebook/location/aa;

    invoke-virtual {v0}, Lcom/facebook/location/aa;->e()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 3

    .prologue
    .line 37
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 38
    const-string v1, "providers"

    invoke-direct {p0}, Lcom/facebook/location/q;->d()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 39
    return-object v0
.end method

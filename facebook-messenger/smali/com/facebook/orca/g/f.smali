.class public Lcom/facebook/orca/g/f;
.super Ljava/lang/Object;
.source "DbCoordinatesSerialization.java"


# instance fields
.field private final a:Lcom/fasterxml/jackson/databind/ObjectMapper;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/orca/g/f;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 25
    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;)Lcom/facebook/location/Coordinates;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 54
    invoke-static {p1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    :goto_0
    return-object v1

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/g/f;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    .line 59
    invoke-static {}, Lcom/facebook/location/Coordinates;->newBuilder()Lcom/facebook/location/b;

    move-result-object v0

    const-string v3, "latitude"

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->e(Lcom/fasterxml/jackson/databind/JsonNode;)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/location/b;->a(Ljava/lang/Double;)Lcom/facebook/location/b;

    move-result-object v0

    const-string v3, "longitude"

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->e(Lcom/fasterxml/jackson/databind/JsonNode;)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/location/b;->b(Ljava/lang/Double;)Lcom/facebook/location/b;

    move-result-object v3

    const-string v0, "accuracy"

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "accuracy"

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->e(Lcom/fasterxml/jackson/databind/JsonNode;)D

    move-result-wide v4

    double-to-float v0, v4

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    :goto_1
    invoke-virtual {v3, v0}, Lcom/facebook/location/b;->a(Ljava/lang/Float;)Lcom/facebook/location/b;

    move-result-object v3

    const-string v0, "altitude"

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "altitude"

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->e(Lcom/fasterxml/jackson/databind/JsonNode;)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    :goto_2
    invoke-virtual {v3, v0}, Lcom/facebook/location/b;->c(Ljava/lang/Double;)Lcom/facebook/location/b;

    move-result-object v3

    const-string v0, "altitudeAccuracy"

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "altitudeAccuracy"

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->e(Lcom/fasterxml/jackson/databind/JsonNode;)D

    move-result-wide v4

    double-to-float v0, v4

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    :goto_3
    invoke-virtual {v3, v0}, Lcom/facebook/location/b;->b(Ljava/lang/Float;)Lcom/facebook/location/b;

    move-result-object v3

    const-string v0, "heading"

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "heading"

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->e(Lcom/fasterxml/jackson/databind/JsonNode;)D

    move-result-wide v4

    double-to-float v0, v4

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    :goto_4
    invoke-virtual {v3, v0}, Lcom/facebook/location/b;->c(Ljava/lang/Float;)Lcom/facebook/location/b;

    move-result-object v0

    const-string v3, "speed"

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v1, "speed"

    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->e(Lcom/fasterxml/jackson/databind/JsonNode;)D

    move-result-wide v1

    double-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    :cond_1
    invoke-virtual {v0, v1}, Lcom/facebook/location/b;->d(Ljava/lang/Float;)Lcom/facebook/location/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/location/b;->h()Lcom/facebook/location/Coordinates;

    move-result-object v1

    goto/16 :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_1

    :cond_3
    move-object v0, v1

    goto :goto_2

    :cond_4
    move-object v0, v1

    goto :goto_3

    :cond_5
    move-object v0, v1

    goto :goto_4
.end method

.method a(Lcom/facebook/location/Coordinates;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 29
    if-nez p1, :cond_0

    .line 30
    const/4 v0, 0x0

    .line 50
    :goto_0
    return-object v0

    .line 32
    :cond_0
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 33
    const-string v1, "latitude"

    invoke-virtual {p1}, Lcom/facebook/location/Coordinates;->b()D

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;D)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 34
    const-string v1, "longitude"

    invoke-virtual {p1}, Lcom/facebook/location/Coordinates;->c()D

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;D)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 35
    invoke-virtual {p1}, Lcom/facebook/location/Coordinates;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 36
    const-string v1, "accuracy"

    invoke-virtual {p1}, Lcom/facebook/location/Coordinates;->f()Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/Float;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 38
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/location/Coordinates;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 39
    const-string v1, "altitude"

    invoke-virtual {p1}, Lcom/facebook/location/Coordinates;->d()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/Double;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 41
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/location/Coordinates;->i()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 42
    const-string v1, "altitudeAccuracy"

    invoke-virtual {p1}, Lcom/facebook/location/Coordinates;->h()Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/Float;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 44
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/location/Coordinates;->k()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 45
    const-string v1, "heading"

    invoke-virtual {p1}, Lcom/facebook/location/Coordinates;->j()Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/Float;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 47
    :cond_4
    invoke-virtual {p1}, Lcom/facebook/location/Coordinates;->m()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 48
    const-string v1, "speed"

    invoke-virtual {p1}, Lcom/facebook/location/Coordinates;->l()Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/Float;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 50
    :cond_5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

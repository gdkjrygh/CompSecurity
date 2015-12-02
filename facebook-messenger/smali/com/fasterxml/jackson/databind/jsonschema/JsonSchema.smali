.class public Lcom/fasterxml/jackson/databind/jsonschema/JsonSchema;
.super Ljava/lang/Object;
.source "JsonSchema.java"


# instance fields
.field private final schema:Lcom/fasterxml/jackson/databind/node/ObjectNode;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/node/ObjectNode;)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
    .end annotation

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/jsonschema/JsonSchema;->schema:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 35
    return-void
.end method

.method public static getDefaultSchemaNode()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 3

    .prologue
    .line 79
    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->objectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v0

    .line 80
    const-string v1, "type"

    const-string v2, "any"

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 83
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 61
    if-ne p1, p0, :cond_1

    .line 69
    :cond_0
    :goto_0
    return v0

    .line 62
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    goto :goto_0

    .line 63
    :cond_2
    instance-of v2, p1, Lcom/fasterxml/jackson/databind/jsonschema/JsonSchema;

    if-nez v2, :cond_3

    move v0, v1

    goto :goto_0

    .line 65
    :cond_3
    check-cast p1, Lcom/fasterxml/jackson/databind/jsonschema/JsonSchema;

    .line 66
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/jsonschema/JsonSchema;->schema:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    if-nez v2, :cond_4

    .line 67
    iget-object v2, p1, Lcom/fasterxml/jackson/databind/jsonschema/JsonSchema;->schema:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    .line 69
    :cond_4
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/jsonschema/JsonSchema;->schema:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    iget-object v1, p1, Lcom/fasterxml/jackson/databind/jsonschema/JsonSchema;->schema:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public getSchemaNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonValue;
    .end annotation

    .prologue
    .line 49
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/jsonschema/JsonSchema;->schema:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/jsonschema/JsonSchema;->schema:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public Lcom/facebook/orca/g/a;
.super Ljava/lang/Object;
.source "DbAttachmentSerialization.java"


# instance fields
.field private final a:Lcom/fasterxml/jackson/databind/ObjectMapper;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/facebook/orca/g/a;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 31
    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;)Lcom/google/common/a/es;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/TitanAttachmentInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 55
    invoke-static {p1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 77
    :goto_0
    return-object v0

    .line 59
    :cond_0
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 60
    iget-object v0, p0, Lcom/facebook/orca/g/a;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 61
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 62
    new-instance v3, Lcom/facebook/messages/model/threads/k;

    invoke-direct {v3}, Lcom/facebook/messages/model/threads/k;-><init>()V

    const-string v4, "id"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/messages/model/threads/k;->a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/k;

    move-result-object v3

    const-string v4, "type"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/facebook/messages/model/threads/k;->a(I)Lcom/facebook/messages/model/threads/k;

    move-result-object v3

    const-string v4, "mime_type"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/messages/model/threads/k;->b(Ljava/lang/String;)Lcom/facebook/messages/model/threads/k;

    move-result-object v3

    const-string v4, "filename"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/messages/model/threads/k;->c(Ljava/lang/String;)Lcom/facebook/messages/model/threads/k;

    move-result-object v3

    const-string v4, "file_size"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/facebook/messages/model/threads/k;->b(I)Lcom/facebook/messages/model/threads/k;

    move-result-object v3

    .line 68
    const-string v4, "image_data_width"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "image_data_height"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 69
    new-instance v4, Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    const-string v5, "image_data_width"

    invoke-virtual {v0, v5}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    invoke-static {v5}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v5

    const-string v6, "image_data_height"

    invoke-virtual {v0, v6}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v0

    invoke-direct {v4, v5, v0}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;-><init>(II)V

    .line 73
    invoke-virtual {v3, v4}, Lcom/facebook/messages/model/threads/k;->a(Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;)Lcom/facebook/messages/model/threads/k;

    .line 75
    :cond_1
    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/k;->g()Lcom/facebook/messages/model/threads/TitanAttachmentInfo;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto/16 :goto_1

    .line 77
    :cond_2
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    goto/16 :goto_0
.end method

.method a(Ljava/util/List;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/TitanAttachmentInfo;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 34
    if-nez p1, :cond_0

    .line 35
    const/4 v0, 0x0

    .line 51
    :goto_0
    return-object v0

    .line 37
    :cond_0
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 38
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;

    .line 39
    new-instance v3, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v4, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 40
    const-string v4, "id"

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 41
    const-string v4, "type"

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->b()I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 42
    const-string v4, "mime_type"

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 43
    const-string v4, "filename"

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 44
    const-string v4, "file_size"

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->e()I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 45
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->f()Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 46
    const-string v4, "image_data_width"

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->f()Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    move-result-object v5

    invoke-virtual {v5}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;->a()I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 47
    const-string v4, "image_data_height"

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->f()Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;->b()I

    move-result v0

    invoke-virtual {v3, v4, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 49
    :cond_1
    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_1

    .line 51
    :cond_2
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

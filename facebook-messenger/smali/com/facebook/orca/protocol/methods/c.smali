.class public Lcom/facebook/orca/protocol/methods/c;
.super Ljava/lang/Object;
.source "AttachmentDeserializer.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/TitanAttachmentInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 22
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 23
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->fieldNames()Ljava/util/Iterator;

    move-result-object v2

    .line 24
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 26
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 27
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

    .line 33
    const-string v4, "image_data"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 34
    const-string v4, "image_data"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 35
    new-instance v4, Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    const-string v5, "width"

    invoke-virtual {v0, v5}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    invoke-static {v5}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v5

    const-string v6, "height"

    invoke-virtual {v0, v6}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v0

    invoke-direct {v4, v5, v0}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;-><init>(II)V

    invoke-virtual {v3, v4}, Lcom/facebook/messages/model/threads/k;->a(Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;)Lcom/facebook/messages/model/threads/k;

    .line 39
    :cond_0
    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/k;->g()Lcom/facebook/messages/model/threads/TitanAttachmentInfo;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto/16 :goto_0

    .line 41
    :cond_1
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

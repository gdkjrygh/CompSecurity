.class public Lcom/facebook/orca/g/g;
.super Ljava/lang/Object;
.source "DbDraftSerialization.java"


# instance fields
.field private final a:Lcom/facebook/orca/g/o;

.field private final b:Lcom/fasterxml/jackson/databind/ObjectMapper;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/g/o;Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/facebook/orca/g/g;->a:Lcom/facebook/orca/g/o;

    .line 28
    iput-object p2, p0, Lcom/facebook/orca/g/g;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 29
    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;)Lcom/facebook/orca/compose/MessageDraft;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 50
    invoke-static {p1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    :goto_0
    return-object v1

    .line 53
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/g/g;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    .line 54
    const-string v0, "text"

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    move-result-object v3

    .line 55
    const/4 v0, 0x0

    .line 56
    const-string v4, "cursorPosition"

    invoke-virtual {v2, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 57
    const-string v0, "cursorPosition"

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->intValue()I

    move-result v0

    .line 60
    :cond_1
    const-string v4, "offlineMessageId"

    invoke-virtual {v2, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 61
    const-string v1, "offlineMessageId"

    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    move-result-object v1

    .line 63
    :cond_2
    const-string v4, "attachmentData"

    invoke-virtual {v2, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 64
    const-string v4, "attachmentData"

    invoke-virtual {v2, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    move-result-object v2

    .line 65
    iget-object v4, p0, Lcom/facebook/orca/g/g;->a:Lcom/facebook/orca/g/o;

    invoke-virtual {v4, v2}, Lcom/facebook/orca/g/o;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 67
    new-instance v2, Lcom/facebook/orca/compose/MessageDraft;

    invoke-direct {v2, v3, v0, v4, v1}, Lcom/facebook/orca/compose/MessageDraft;-><init>(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;)V

    move-object v1, v2

    goto :goto_0

    .line 69
    :cond_3
    new-instance v2, Lcom/facebook/orca/compose/MessageDraft;

    invoke-direct {v2, v3, v0, v1}, Lcom/facebook/orca/compose/MessageDraft;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    move-object v1, v2

    goto :goto_0
.end method

.method a(Lcom/facebook/orca/compose/MessageDraft;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 32
    if-nez p1, :cond_0

    .line 33
    const/4 v0, 0x0

    .line 46
    :goto_0
    return-object v0

    .line 35
    :cond_0
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 36
    const-string v1, "text"

    invoke-virtual {p1}, Lcom/facebook/orca/compose/MessageDraft;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 37
    const-string v1, "cursorPosition"

    invoke-virtual {p1}, Lcom/facebook/orca/compose/MessageDraft;->b()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 38
    invoke-virtual {p1}, Lcom/facebook/orca/compose/MessageDraft;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 39
    iget-object v1, p0, Lcom/facebook/orca/g/g;->a:Lcom/facebook/orca/g/o;

    invoke-virtual {p1}, Lcom/facebook/orca/compose/MessageDraft;->c()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/g/o;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    .line 41
    const-string v2, "attachmentData"

    invoke-virtual {v0, v2, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 43
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/orca/compose/MessageDraft;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 44
    const-string v1, "offlineMessageId"

    invoke-virtual {p1}, Lcom/facebook/orca/compose/MessageDraft;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 46
    :cond_2
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.class public final Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;
.super Lcom/fasterxml/jackson/databind/node/NodeCursor;
.source "NodeCursor.java"


# instance fields
.field protected _contents:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<",
            "Ljava/lang/String;",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ">;>;"
        }
    .end annotation
.end field

.field protected _current:Ljava/util/Map$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map$Entry",
            "<",
            "Ljava/lang/String;",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ">;"
        }
    .end annotation
.end field

.field protected _needEntry:Z


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/node/NodeCursor;)V
    .locals 1

    .prologue
    .line 187
    const/4 v0, 0x2

    invoke-direct {p0, v0, p2}, Lcom/fasterxml/jackson/databind/node/NodeCursor;-><init>(ILcom/fasterxml/jackson/databind/node/NodeCursor;)V

    .line 188
    check-cast p1, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->fields()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->_contents:Ljava/util/Iterator;

    .line 189
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->_needEntry:Z

    .line 190
    return-void
.end method


# virtual methods
.method public currentHasChildren()Z
    .locals 1

    .prologue
    .line 231
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->currentNode()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/node/ContainerNode;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/node/ContainerNode;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public currentNode()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 1

    .prologue
    .line 226
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->_current:Ljava/util/Map$Entry;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->_current:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    goto :goto_0
.end method

.method public endToken()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 1

    .prologue
    .line 222
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    return-object v0
.end method

.method public bridge synthetic getParent()Lcom/fasterxml/jackson/core/JsonStreamContext;
    .locals 1

    .prologue
    .line 177
    invoke-super {p0}, Lcom/fasterxml/jackson/databind/node/NodeCursor;->getParent()Lcom/fasterxml/jackson/databind/node/NodeCursor;

    move-result-object v0

    return-object v0
.end method

.method public nextToken()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 196
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->_needEntry:Z

    if-eqz v0, :cond_2

    .line 197
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->_contents:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 198
    iput-object v1, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->_currentName:Ljava/lang/String;

    .line 199
    iput-object v1, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->_current:Ljava/util/Map$Entry;

    .line 208
    :goto_0
    return-object v1

    .line 202
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->_needEntry:Z

    .line 203
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->_contents:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->_current:Ljava/util/Map$Entry;

    .line 204
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->_current:Ljava/util/Map$Entry;

    if-nez v0, :cond_1

    move-object v0, v1

    :goto_1
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->_currentName:Ljava/lang/String;

    .line 205
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    goto :goto_0

    .line 204
    :cond_1
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->_current:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_1

    .line 207
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->_needEntry:Z

    .line 208
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->_current:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v1

    goto :goto_0
.end method

.method public nextValue()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 2

    .prologue
    .line 214
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    .line 215
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_0

    .line 216
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/NodeCursor$Object;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    .line 218
    :cond_0
    return-object v0
.end method

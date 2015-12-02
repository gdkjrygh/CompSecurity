.class public final Lcom/fasterxml/jackson/databind/node/NodeCursor$RootValue;
.super Lcom/fasterxml/jackson/databind/node/NodeCursor;
.source "NodeCursor.java"


# instance fields
.field protected _done:Z

.field protected _node:Lcom/fasterxml/jackson/databind/JsonNode;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/node/NodeCursor;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 105
    invoke-direct {p0, v0, p2}, Lcom/fasterxml/jackson/databind/node/NodeCursor;-><init>(ILcom/fasterxml/jackson/databind/node/NodeCursor;)V

    .line 102
    iput-boolean v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$RootValue;->_done:Z

    .line 106
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$RootValue;->_node:Lcom/fasterxml/jackson/databind/JsonNode;

    .line 107
    return-void
.end method


# virtual methods
.method public currentHasChildren()Z
    .locals 1

    .prologue
    .line 131
    const/4 v0, 0x0

    return v0
.end method

.method public currentNode()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$RootValue;->_node:Lcom/fasterxml/jackson/databind/JsonNode;

    return-object v0
.end method

.method public endToken()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 1

    .prologue
    .line 127
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic getParent()Lcom/fasterxml/jackson/core/JsonStreamContext;
    .locals 1

    .prologue
    .line 97
    invoke-super {p0}, Lcom/fasterxml/jackson/databind/node/NodeCursor;->getParent()Lcom/fasterxml/jackson/databind/node/NodeCursor;

    move-result-object v0

    return-object v0
.end method

.method public nextToken()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 116
    iget-boolean v1, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$RootValue;->_done:Z

    if-nez v1, :cond_0

    .line 117
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$RootValue;->_done:Z

    .line 118
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$RootValue;->_node:Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    .line 121
    :goto_0
    return-object v0

    .line 120
    :cond_0
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/node/NodeCursor$RootValue;->_node:Lcom/fasterxml/jackson/databind/JsonNode;

    goto :goto_0
.end method

.method public nextValue()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 1

    .prologue
    .line 125
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/NodeCursor$RootValue;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    return-object v0
.end method

.method public overrideCurrentName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 112
    return-void
.end method

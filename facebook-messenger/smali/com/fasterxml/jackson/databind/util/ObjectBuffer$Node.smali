.class final Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;
.super Ljava/lang/Object;
.source "ObjectBuffer.java"


# instance fields
.field final _data:[Ljava/lang/Object;

.field _next:Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;


# direct methods
.method public constructor <init>([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 236
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 237
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;->_data:[Ljava/lang/Object;

    .line 238
    return-void
.end method


# virtual methods
.method public getData()[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 240
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;->_data:[Ljava/lang/Object;

    return-object v0
.end method

.method public linkNext(Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;)V
    .locals 1

    .prologue
    .line 246
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;->_next:Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

    if-eqz v0, :cond_0

    .line 247
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 249
    :cond_0
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;->_next:Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

    .line 250
    return-void
.end method

.method public next()Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;
    .locals 1

    .prologue
    .line 242
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;->_next:Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

    return-object v0
.end method

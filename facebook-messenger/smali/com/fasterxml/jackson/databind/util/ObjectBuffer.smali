.class public final Lcom/fasterxml/jackson/databind/util/ObjectBuffer;
.super Ljava/lang/Object;
.source "ObjectBuffer.java"


# static fields
.field static final INITIAL_CHUNK_SIZE:I = 0xc

.field static final MAX_CHUNK_SIZE:I = 0x40000

.field static final SMALL_CHUNK_SIZE:I = 0x4000


# instance fields
.field private _bufferHead:Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

.field private _bufferTail:Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

.field private _bufferedEntryCount:I

.field private _freeBuffer:[Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected final _copyTo(Ljava/lang/Object;I[Ljava/lang/Object;I)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 201
    .line 203
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_bufferHead:Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

    move v1, v2

    :goto_0
    if-eqz v0, :cond_0

    .line 204
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;->getData()[Ljava/lang/Object;

    move-result-object v3

    .line 205
    array-length v4, v3

    .line 206
    invoke-static {v3, v2, p1, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 207
    add-int/2addr v1, v4

    .line 203
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;->next()Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

    move-result-object v0

    goto :goto_0

    .line 209
    :cond_0
    invoke-static {p3, v2, p1, v1, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 210
    add-int v0, v1, p4

    .line 213
    if-eq v0, p2, :cond_1

    .line 214
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Should have gotten "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " entries, got "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 216
    :cond_1
    return-void
.end method

.method protected _reset()V
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_bufferTail:Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

    if-eqz v0, :cond_0

    .line 191
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_bufferTail:Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;->getData()[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_freeBuffer:[Ljava/lang/Object;

    .line 194
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_bufferTail:Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_bufferHead:Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

    .line 195
    const/4 v0, 0x0

    iput v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_bufferedEntryCount:I

    .line 196
    return-void
.end method

.method public appendCompletedChunk([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    .prologue
    .line 96
    new-instance v0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

    invoke-direct {v0, p1}, Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;-><init>([Ljava/lang/Object;)V

    .line 97
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_bufferHead:Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

    if-nez v1, :cond_0

    .line 98
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_bufferTail:Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_bufferHead:Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

    .line 103
    :goto_0
    array-length v0, p1

    .line 104
    iget v1, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_bufferedEntryCount:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_bufferedEntryCount:I

    .line 106
    const/16 v1, 0x4000

    if-ge v0, v1, :cond_1

    .line 107
    add-int/2addr v0, v0

    .line 111
    :goto_1
    new-array v0, v0, [Ljava/lang/Object;

    return-object v0

    .line 100
    :cond_0
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_bufferTail:Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;->linkNext(Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;)V

    .line 101
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_bufferTail:Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

    goto :goto_0

    .line 109
    :cond_1
    shr-int/lit8 v1, v0, 0x2

    add-int/2addr v0, v1

    goto :goto_1
.end method

.method public bufferedSize()I
    .locals 1

    .prologue
    .line 179
    iget v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_bufferedEntryCount:I

    return v0
.end method

.method public completeAndClearBuffer([Ljava/lang/Object;ILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            "I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 152
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_bufferHead:Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_1

    .line 153
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;->getData()[Ljava/lang/Object;

    move-result-object v3

    .line 154
    array-length v4, v3

    move v1, v0

    :goto_1
    if-ge v1, v4, :cond_0

    .line 155
    aget-object v5, v3, v1

    invoke-interface {p3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 152
    :cond_0
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;->next()Lcom/fasterxml/jackson/databind/util/ObjectBuffer$Node;

    move-result-object v1

    move-object v2, v1

    goto :goto_0

    .line 159
    :cond_1
    :goto_2
    if-ge v0, p2, :cond_2

    .line 160
    aget-object v1, p1, v0

    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 159
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 162
    :cond_2
    return-void
.end method

.method public completeAndClearBuffer([Ljava/lang/Object;I)[Ljava/lang/Object;
    .locals 2

    .prologue
    .line 126
    iget v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_bufferedEntryCount:I

    add-int/2addr v0, p2

    .line 127
    new-array v1, v0, [Ljava/lang/Object;

    .line 128
    invoke-virtual {p0, v1, v0, p1, p2}, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_copyTo(Ljava/lang/Object;I[Ljava/lang/Object;I)V

    .line 129
    return-object v1
.end method

.method public completeAndClearBuffer([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            "I",
            "Ljava/lang/Class",
            "<TT;>;)[TT;"
        }
    .end annotation

    .prologue
    .line 142
    iget v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_bufferedEntryCount:I

    add-int v1, p2, v0

    .line 144
    invoke-static {p3, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    .line 145
    invoke-virtual {p0, v0, v1, p1, p2}, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_copyTo(Ljava/lang/Object;I[Ljava/lang/Object;I)V

    .line 146
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_reset()V

    .line 147
    return-object v0
.end method

.method public initialCapacity()I
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_freeBuffer:[Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_freeBuffer:[Ljava/lang/Object;

    array-length v0, v0

    goto :goto_0
.end method

.method public resetAndStart()[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 73
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_reset()V

    .line 74
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_freeBuffer:[Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 75
    const/16 v0, 0xc

    new-array v0, v0, [Ljava/lang/Object;

    .line 77
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ObjectBuffer;->_freeBuffer:[Ljava/lang/Object;

    goto :goto_0
.end method

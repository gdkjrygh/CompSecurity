.class public final Lcom/fasterxml/jackson/databind/node/BinaryNode;
.super Lcom/fasterxml/jackson/databind/node/ValueNode;
.source "BinaryNode.java"


# static fields
.field static final EMPTY_BINARY_NODE:Lcom/fasterxml/jackson/databind/node/BinaryNode;


# instance fields
.field final _data:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 17
    new-instance v0, Lcom/fasterxml/jackson/databind/node/BinaryNode;

    const/4 v1, 0x0

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/BinaryNode;-><init>([B)V

    sput-object v0, Lcom/fasterxml/jackson/databind/node/BinaryNode;->EMPTY_BINARY_NODE:Lcom/fasterxml/jackson/databind/node/BinaryNode;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/node/ValueNode;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/node/BinaryNode;->_data:[B

    .line 24
    return-void
.end method

.method public constructor <init>([BII)V
    .locals 2

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/node/ValueNode;-><init>()V

    .line 28
    if-nez p2, :cond_0

    array-length v0, p1

    if-ne p3, v0, :cond_0

    .line 29
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/node/BinaryNode;->_data:[B

    .line 34
    :goto_0
    return-void

    .line 31
    :cond_0
    new-array v0, p3, [B

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/node/BinaryNode;->_data:[B

    .line 32
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/BinaryNode;->_data:[B

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method

.method public static valueOf([B)Lcom/fasterxml/jackson/databind/node/BinaryNode;
    .locals 1

    .prologue
    .line 38
    if-nez p0, :cond_0

    .line 39
    const/4 v0, 0x0

    .line 44
    :goto_0
    return-object v0

    .line 41
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 42
    sget-object v0, Lcom/fasterxml/jackson/databind/node/BinaryNode;->EMPTY_BINARY_NODE:Lcom/fasterxml/jackson/databind/node/BinaryNode;

    goto :goto_0

    .line 44
    :cond_1
    new-instance v0, Lcom/fasterxml/jackson/databind/node/BinaryNode;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/node/BinaryNode;-><init>([B)V

    goto :goto_0
.end method

.method public static valueOf([BII)Lcom/fasterxml/jackson/databind/node/BinaryNode;
    .locals 1

    .prologue
    .line 49
    if-nez p0, :cond_0

    .line 50
    const/4 v0, 0x0

    .line 55
    :goto_0
    return-object v0

    .line 52
    :cond_0
    if-nez p2, :cond_1

    .line 53
    sget-object v0, Lcom/fasterxml/jackson/databind/node/BinaryNode;->EMPTY_BINARY_NODE:Lcom/fasterxml/jackson/databind/node/BinaryNode;

    goto :goto_0

    .line 55
    :cond_1
    new-instance v0, Lcom/fasterxml/jackson/databind/node/BinaryNode;

    invoke-direct {v0, p0, p1, p2}, Lcom/fasterxml/jackson/databind/node/BinaryNode;-><init>([BII)V

    goto :goto_0
.end method


# virtual methods
.method public asText()Ljava/lang/String;
    .locals 3

    .prologue
    .line 84
    invoke-static {}, Lcom/fasterxml/jackson/core/Base64Variants;->getDefaultVariant()Lcom/fasterxml/jackson/core/Base64Variant;

    move-result-object v0

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/node/BinaryNode;->_data:[B

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/core/Base64Variant;->encode([BZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public asToken()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 1

    .prologue
    .line 64
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_EMBEDDED_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    return-object v0
.end method

.method public binaryValue()[B
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/BinaryNode;->_data:[B

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 97
    if-ne p1, p0, :cond_1

    const/4 v0, 0x1

    .line 102
    :cond_0
    :goto_0
    return v0

    .line 98
    :cond_1
    if-eqz p1, :cond_0

    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_0

    .line 102
    check-cast p1, Lcom/fasterxml/jackson/databind/node/BinaryNode;

    iget-object v0, p1, Lcom/fasterxml/jackson/databind/node/BinaryNode;->_data:[B

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/node/BinaryNode;->_data:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/BinaryNode;->_data:[B

    if-nez v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/BinaryNode;->_data:[B

    array-length v0, v0

    goto :goto_0
.end method

.method public isBinary()Z
    .locals 1

    .prologue
    .line 68
    const/4 v0, 0x1

    return v0
.end method

.method public final serialize(Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/BinaryNode;->_data:[B

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeBinary([B)V

    .line 92
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 117
    invoke-static {}, Lcom/fasterxml/jackson/core/Base64Variants;->getDefaultVariant()Lcom/fasterxml/jackson/core/Base64Variant;

    move-result-object v0

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/node/BinaryNode;->_data:[B

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/core/Base64Variant;->encode([BZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

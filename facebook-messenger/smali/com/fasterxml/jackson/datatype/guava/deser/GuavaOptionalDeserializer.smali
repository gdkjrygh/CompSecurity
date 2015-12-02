.class public final Lcom/fasterxml/jackson/datatype/guava/deser/GuavaOptionalDeserializer;
.super Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;
.source "GuavaOptionalDeserializer.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer",
        "<",
        "Lcom/google/common/base/Optional",
        "<*>;>;"
    }
.end annotation


# instance fields
.field private final _referenceType:Lcom/fasterxml/jackson/databind/JavaType;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/JavaType;)V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;-><init>(Lcom/fasterxml/jackson/databind/JavaType;)V

    .line 17
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JavaType;->containedType(I)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaOptionalDeserializer;->_referenceType:Lcom/fasterxml/jackson/databind/JavaType;

    .line 18
    return-void
.end method


# virtual methods
.method public deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/google/common/base/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            ")",
            "Lcom/google/common/base/Optional",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 28
    iget-object v0, p0, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaOptionalDeserializer;->_referenceType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->findRootValueDeserializer(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v0

    .line 29
    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaOptionalDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/google/common/base/Optional;

    move-result-object v0

    return-object v0
.end method

.method public getNullValue()Lcom/google/common/base/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/base/Optional",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 22
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getNullValue()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 12
    invoke-virtual {p0}, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaOptionalDeserializer;->getNullValue()Lcom/google/common/base/Optional;

    move-result-object v0

    return-object v0
.end method

.class abstract Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMultisetDeserializer;
.super Lcom/fasterxml/jackson/datatype/guava/deser/GuavaCollectionDeserializer;
.source "GuavaMultisetDeserializer.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/google/common/a/jf",
        "<",
        "Ljava/lang/Object;",
        ">;>",
        "Lcom/fasterxml/jackson/datatype/guava/deser/GuavaCollectionDeserializer",
        "<TT;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/fasterxml/jackson/databind/type/CollectionType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/type/CollectionType;",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 17
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaCollectionDeserializer;-><init>(Lcom/fasterxml/jackson/databind/type/CollectionType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    .line 18
    return-void
.end method


# virtual methods
.method protected _deserializeContents(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/google/common/a/jf;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 25
    iget-object v1, p0, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMultisetDeserializer;->_valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    .line 27
    iget-object v2, p0, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMultisetDeserializer;->_typeDeserializerForValue:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    .line 28
    invoke-virtual {p0}, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMultisetDeserializer;->createMultiset()Lcom/google/common/a/jf;

    move-result-object v3

    .line 30
    :goto_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    sget-object v4, Lcom/fasterxml/jackson/core/JsonToken;->END_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v4, :cond_2

    .line 33
    sget-object v4, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v4, :cond_0

    .line 34
    const/4 v0, 0x0

    .line 40
    :goto_1
    invoke-interface {v3, v0}, Lcom/google/common/a/jf;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 35
    :cond_0
    if-nez v2, :cond_1

    .line 36
    invoke-virtual {v1, p1, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {v1, p1, p2, v2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserializeWithType(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    .line 42
    :cond_2
    return-object v3
.end method

.method protected bridge synthetic _deserializeContents(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMultisetDeserializer;->_deserializeContents(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/google/common/a/jf;

    move-result-object v0

    return-object v0
.end method

.method protected abstract createMultiset()Lcom/google/common/a/jf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

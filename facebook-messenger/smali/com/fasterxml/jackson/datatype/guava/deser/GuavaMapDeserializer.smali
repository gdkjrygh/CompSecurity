.class public abstract Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMapDeserializer;
.super Lcom/fasterxml/jackson/databind/JsonDeserializer;
.source "GuavaMapDeserializer.java"

# interfaces
.implements Lcom/fasterxml/jackson/databind/deser/ContextualDeserializer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/fasterxml/jackson/databind/JsonDeserializer",
        "<TT;>;",
        "Lcom/fasterxml/jackson/databind/deser/ContextualDeserializer;"
    }
.end annotation


# instance fields
.field protected _keyDeserializer:Lcom/fasterxml/jackson/databind/KeyDeserializer;

.field protected final _mapType:Lcom/fasterxml/jackson/databind/type/MapType;

.field protected final _typeDeserializerForValue:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

.field protected _valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/databind/JsonDeserializer",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lcom/fasterxml/jackson/databind/type/MapType;Lcom/fasterxml/jackson/databind/KeyDeserializer;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/type/MapType;",
            "Lcom/fasterxml/jackson/databind/KeyDeserializer;",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMapDeserializer;->_mapType:Lcom/fasterxml/jackson/databind/type/MapType;

    .line 45
    iput-object p2, p0, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMapDeserializer;->_keyDeserializer:Lcom/fasterxml/jackson/databind/KeyDeserializer;

    .line 46
    iput-object p3, p0, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMapDeserializer;->_typeDeserializerForValue:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    .line 47
    iput-object p4, p0, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMapDeserializer;->_valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    .line 48
    return-void
.end method


# virtual methods
.method protected abstract _deserializeEntries(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            ")TT;"
        }
    .end annotation
.end method

.method public createContextual(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Lcom/fasterxml/jackson/databind/BeanProperty;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 71
    iget-object v2, p0, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMapDeserializer;->_keyDeserializer:Lcom/fasterxml/jackson/databind/KeyDeserializer;

    .line 72
    iget-object v1, p0, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMapDeserializer;->_valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    .line 73
    iget-object v0, p0, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMapDeserializer;->_typeDeserializerForValue:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    .line 75
    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    if-nez v0, :cond_0

    .line 87
    :goto_0
    return-object p0

    .line 78
    :cond_0
    if-nez v2, :cond_1

    .line 79
    iget-object v2, p0, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMapDeserializer;->_mapType:Lcom/fasterxml/jackson/databind/type/MapType;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/type/MapType;->getKeyType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v2

    invoke-virtual {p1, v2, p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->findKeyDeserializer(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/KeyDeserializer;

    move-result-object v2

    .line 81
    :cond_1
    if-nez v1, :cond_2

    .line 82
    iget-object v1, p0, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMapDeserializer;->_mapType:Lcom/fasterxml/jackson/databind/type/MapType;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/type/MapType;->getContentType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->findContextualValueDeserializer(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object v1

    .line 84
    :cond_2
    if-eqz v0, :cond_3

    .line 85
    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;->forProperty(Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    move-result-object v0

    .line 87
    :cond_3
    invoke-virtual {p0, v2, v0, v1}, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMapDeserializer;->withResolved(Lcom/fasterxml/jackson/databind/KeyDeserializer;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMapDeserializer;

    move-result-object p0

    goto :goto_0
.end method

.method public deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 114
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    .line 115
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_0

    .line 116
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    .line 117
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v1, :cond_1

    .line 118
    iget-object v0, p0, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMapDeserializer;->_mapType:Lcom/fasterxml/jackson/databind/type/MapType;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/type/MapType;->getRawClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->mappingException(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JsonMappingException;

    move-result-object v0

    throw v0

    .line 120
    :cond_0
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v1, :cond_1

    .line 121
    iget-object v0, p0, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMapDeserializer;->_mapType:Lcom/fasterxml/jackson/databind/type/MapType;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/type/MapType;->getRawClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->mappingException(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JsonMappingException;

    move-result-object v0

    throw v0

    .line 123
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMapDeserializer;->_deserializeEntries(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public deserializeWithType(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 106
    invoke-virtual {p3, p1, p2}, Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;->deserializeTypedFromArray(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public abstract withResolved(Lcom/fasterxml/jackson/databind/KeyDeserializer;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMapDeserializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/KeyDeserializer;",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer",
            "<*>;)",
            "Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMapDeserializer",
            "<TT;>;"
        }
    .end annotation
.end method

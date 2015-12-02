.class public Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;
.super Lcom/fasterxml/jackson/databind/JsonSerializer;
.source "MultimapSerializer.java"

# interfaces
.implements Lcom/fasterxml/jackson/databind/ser/ContextualSerializer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/JsonSerializer",
        "<",
        "Lcom/google/common/a/iw",
        "<**>;>;",
        "Lcom/fasterxml/jackson/databind/ser/ContextualSerializer;"
    }
.end annotation


# instance fields
.field private final keySerializer:Lcom/fasterxml/jackson/databind/JsonSerializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/databind/JsonSerializer",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final property:Lcom/fasterxml/jackson/databind/BeanProperty;

.field private final type:Lcom/fasterxml/jackson/databind/type/MapLikeType;

.field private final valueSerializer:Lcom/fasterxml/jackson/databind/JsonSerializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/databind/JsonSerializer",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final valueTypeSerializer:Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/type/MapLikeType;Lcom/fasterxml/jackson/databind/BeanDescription;Lcom/fasterxml/jackson/databind/JsonSerializer;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;Lcom/fasterxml/jackson/databind/JsonSerializer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/SerializationConfig;",
            "Lcom/fasterxml/jackson/databind/type/MapLikeType;",
            "Lcom/fasterxml/jackson/databind/BeanDescription;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer",
            "<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer",
            "<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/JsonSerializer;-><init>()V

    .line 34
    iput-object p2, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->type:Lcom/fasterxml/jackson/databind/type/MapLikeType;

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->property:Lcom/fasterxml/jackson/databind/BeanProperty;

    .line 36
    iput-object p4, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->keySerializer:Lcom/fasterxml/jackson/databind/JsonSerializer;

    .line 37
    iput-object p5, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->valueTypeSerializer:Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;

    .line 38
    iput-object p6, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->valueSerializer:Lcom/fasterxml/jackson/databind/JsonSerializer;

    .line 39
    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;Lcom/fasterxml/jackson/databind/BeanProperty;Lcom/fasterxml/jackson/databind/JsonSerializer;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;Lcom/fasterxml/jackson/databind/JsonSerializer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;",
            "Lcom/fasterxml/jackson/databind/BeanProperty;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer",
            "<*>;",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/JsonSerializer;-><init>()V

    .line 46
    iget-object v0, p1, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->type:Lcom/fasterxml/jackson/databind/type/MapLikeType;

    iput-object v0, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->type:Lcom/fasterxml/jackson/databind/type/MapLikeType;

    .line 47
    iput-object p2, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->property:Lcom/fasterxml/jackson/databind/BeanProperty;

    .line 48
    iput-object p3, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->keySerializer:Lcom/fasterxml/jackson/databind/JsonSerializer;

    .line 49
    iput-object p4, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->valueTypeSerializer:Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;

    .line 50
    iput-object p5, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->valueSerializer:Lcom/fasterxml/jackson/databind/JsonSerializer;

    .line 51
    return-void
.end method

.method private final serializeFields(Lcom/google/common/a/iw;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/iw",
            "<**>;",
            "Lcom/fasterxml/jackson/core/JsonGenerator;",
            "Lcom/fasterxml/jackson/databind/SerializerProvider;",
            ")V"
        }
    .end annotation

    .prologue
    .line 124
    invoke-interface {p1}, Lcom/google/common/a/iw;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 125
    iget-object v2, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->keySerializer:Lcom/fasterxml/jackson/databind/JsonSerializer;

    if-eqz v2, :cond_0

    .line 126
    iget-object v2, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->keySerializer:Lcom/fasterxml/jackson/databind/JsonSerializer;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3, p2, p3}, Lcom/fasterxml/jackson/databind/JsonSerializer;->serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    .line 131
    :goto_1
    iget-object v2, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->valueSerializer:Lcom/fasterxml/jackson/databind/JsonSerializer;

    if-eqz v2, :cond_2

    .line 133
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartArray()V

    .line 134
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 135
    iget-object v3, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->valueSerializer:Lcom/fasterxml/jackson/databind/JsonSerializer;

    invoke-virtual {v3, v2, p2, p3}, Lcom/fasterxml/jackson/databind/JsonSerializer;->serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    goto :goto_2

    .line 128
    :cond_0
    const-class v2, Ljava/lang/String;

    invoke-virtual {p3, v2}, Lcom/fasterxml/jackson/databind/SerializerProvider;->constructType(Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v2

    iget-object v3, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->property:Lcom/fasterxml/jackson/databind/BeanProperty;

    invoke-virtual {p3, v2, v3}, Lcom/fasterxml/jackson/databind/SerializerProvider;->findKeySerializer(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3, p2, p3}, Lcom/fasterxml/jackson/databind/JsonSerializer;->serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    goto :goto_1

    .line 137
    :cond_1
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    goto :goto_0

    .line 139
    :cond_2
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p3, v0, p2}, Lcom/fasterxml/jackson/databind/SerializerProvider;->defaultSerializeValue(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;)V

    goto :goto_0

    .line 142
    :cond_3
    return-void
.end method


# virtual methods
.method public createContextual(Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/SerializerProvider;",
            "Lcom/fasterxml/jackson/databind/BeanProperty;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonSerializer",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 71
    iget-object v0, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->valueSerializer:Lcom/fasterxml/jackson/databind/JsonSerializer;

    .line 72
    if-nez v0, :cond_3

    .line 73
    iget-object v1, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->type:Lcom/fasterxml/jackson/databind/type/MapLikeType;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/type/MapLikeType;->getContentType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v1

    .line 74
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JavaType;->isFinal()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 75
    invoke-virtual {p1, v1, p2}, Lcom/fasterxml/jackson/databind/SerializerProvider;->findValueSerializer(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object v0

    :cond_0
    move-object v1, v0

    .line 80
    :goto_0
    iget-object v0, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->keySerializer:Lcom/fasterxml/jackson/databind/JsonSerializer;

    .line 81
    if-nez v0, :cond_4

    .line 82
    iget-object v0, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->type:Lcom/fasterxml/jackson/databind/type/MapLikeType;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/type/MapLikeType;->getKeyType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/fasterxml/jackson/databind/SerializerProvider;->findKeySerializer(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object v0

    .line 87
    :cond_1
    :goto_1
    iget-object v2, p0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->valueTypeSerializer:Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;

    .line 88
    if-eqz v2, :cond_2

    .line 89
    invoke-virtual {v2, p2}, Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;->forProperty(Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;

    move-result-object v2

    .line 91
    :cond_2
    invoke-virtual {p0, p2, v0, v2, v1}, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->withResolved(Lcom/fasterxml/jackson/databind/BeanProperty;Lcom/fasterxml/jackson/databind/JsonSerializer;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;Lcom/fasterxml/jackson/databind/JsonSerializer;)Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;

    move-result-object v0

    return-object v0

    .line 77
    :cond_3
    instance-of v1, v0, Lcom/fasterxml/jackson/databind/ser/ContextualSerializer;

    if-eqz v1, :cond_5

    .line 78
    check-cast v0, Lcom/fasterxml/jackson/databind/ser/ContextualSerializer;

    invoke-interface {v0, p1, p2}, Lcom/fasterxml/jackson/databind/ser/ContextualSerializer;->createContextual(Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    .line 83
    :cond_4
    instance-of v2, v0, Lcom/fasterxml/jackson/databind/ser/ContextualSerializer;

    if-eqz v2, :cond_1

    .line 84
    check-cast v0, Lcom/fasterxml/jackson/databind/ser/ContextualSerializer;

    invoke-interface {v0, p1, p2}, Lcom/fasterxml/jackson/databind/ser/ContextualSerializer;->createContextual(Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object v0

    goto :goto_1

    :cond_5
    move-object v1, v0

    goto :goto_0
.end method

.method public serialize(Lcom/google/common/a/iw;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/iw",
            "<**>;",
            "Lcom/fasterxml/jackson/core/JsonGenerator;",
            "Lcom/fasterxml/jackson/databind/SerializerProvider;",
            ")V"
        }
    .end annotation

    .prologue
    .line 104
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    .line 105
    invoke-interface {p1}, Lcom/google/common/a/iw;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 106
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->serializeFields(Lcom/google/common/a/iw;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    .line 108
    :cond_0
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    .line 109
    return-void
.end method

.method public bridge synthetic serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .locals 0

    .prologue
    .line 17
    check-cast p1, Lcom/google/common/a/iw;

    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->serialize(Lcom/google/common/a/iw;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    return-void
.end method

.method public serializeWithType(Lcom/google/common/a/iw;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/iw",
            "<**>;",
            "Lcom/fasterxml/jackson/core/JsonGenerator;",
            "Lcom/fasterxml/jackson/databind/SerializerProvider;",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;",
            ")V"
        }
    .end annotation

    .prologue
    .line 116
    invoke-virtual {p4, p1, p2}, Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;->writeTypePrefixForObject(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;)V

    .line 117
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->serializeFields(Lcom/google/common/a/iw;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    .line 118
    invoke-virtual {p4, p1, p2}, Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;->writeTypeSuffixForObject(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;)V

    .line 119
    return-void
.end method

.method public bridge synthetic serializeWithType(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;)V
    .locals 0

    .prologue
    .line 17
    check-cast p1, Lcom/google/common/a/iw;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;->serializeWithType(Lcom/google/common/a/iw;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;)V

    return-void
.end method

.method protected withResolved(Lcom/fasterxml/jackson/databind/BeanProperty;Lcom/fasterxml/jackson/databind/JsonSerializer;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;Lcom/fasterxml/jackson/databind/JsonSerializer;)Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/BeanProperty;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer",
            "<*>;",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer",
            "<*>;)",
            "Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;"
        }
    .end annotation

    .prologue
    .line 58
    new-instance v0, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;-><init>(Lcom/fasterxml/jackson/datatype/guava/ser/MultimapSerializer;Lcom/fasterxml/jackson/databind/BeanProperty;Lcom/fasterxml/jackson/databind/JsonSerializer;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;Lcom/fasterxml/jackson/databind/JsonSerializer;)V

    return-object v0
.end method

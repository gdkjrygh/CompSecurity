.class public Lcom/fasterxml/jackson/datatype/guava/deser/ImmutableListDeserializer;
.super Lcom/fasterxml/jackson/datatype/guava/deser/GuavaImmutableCollectionDeserializer;
.source "ImmutableListDeserializer.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/datatype/guava/deser/GuavaImmutableCollectionDeserializer",
        "<",
        "Lcom/google/common/a/es",
        "<",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/type/CollectionType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V
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
    .line 13
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaImmutableCollectionDeserializer;-><init>(Lcom/fasterxml/jackson/databind/type/CollectionType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    .line 14
    return-void
.end method


# virtual methods
.method protected bridge synthetic createBuilder()Lcom/google/common/a/eo;
    .locals 1

    .prologue
    .line 9
    invoke-virtual {p0}, Lcom/fasterxml/jackson/datatype/guava/deser/ImmutableListDeserializer;->createBuilder()Lcom/google/common/a/et;

    move-result-object v0

    return-object v0
.end method

.method protected createBuilder()Lcom/google/common/a/et;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/et",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 31
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v0

    .line 32
    return-object v0
.end method

.method public bridge synthetic withResolved(Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/datatype/guava/deser/GuavaCollectionDeserializer;
    .locals 1

    .prologue
    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/datatype/guava/deser/ImmutableListDeserializer;->withResolved(Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/datatype/guava/deser/ImmutableListDeserializer;

    move-result-object v0

    return-object v0
.end method

.method public withResolved(Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/datatype/guava/deser/ImmutableListDeserializer;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer",
            "<*>;)",
            "Lcom/fasterxml/jackson/datatype/guava/deser/ImmutableListDeserializer;"
        }
    .end annotation

    .prologue
    .line 19
    new-instance v0, Lcom/fasterxml/jackson/datatype/guava/deser/ImmutableListDeserializer;

    iget-object v1, p0, Lcom/fasterxml/jackson/datatype/guava/deser/ImmutableListDeserializer;->_containerType:Lcom/fasterxml/jackson/databind/type/CollectionType;

    invoke-direct {v0, v1, p1, p2}, Lcom/fasterxml/jackson/datatype/guava/deser/ImmutableListDeserializer;-><init>(Lcom/fasterxml/jackson/databind/type/CollectionType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    return-object v0
.end method

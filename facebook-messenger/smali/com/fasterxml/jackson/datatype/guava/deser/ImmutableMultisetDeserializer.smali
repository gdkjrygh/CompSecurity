.class public Lcom/fasterxml/jackson/datatype/guava/deser/ImmutableMultisetDeserializer;
.super Lcom/fasterxml/jackson/datatype/guava/deser/GuavaImmutableCollectionDeserializer;
.source "ImmutableMultisetDeserializer.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/datatype/guava/deser/GuavaImmutableCollectionDeserializer",
        "<",
        "Lcom/google/common/a/fe",
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
    .line 12
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaImmutableCollectionDeserializer;-><init>(Lcom/fasterxml/jackson/databind/type/CollectionType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    .line 13
    return-void
.end method


# virtual methods
.method protected createBuilder()Lcom/google/common/a/eo;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/eo",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 17
    invoke-static {}, Lcom/google/common/a/fe;->k()Lcom/google/common/a/fg;

    move-result-object v0

    return-object v0
.end method

.method public withResolved(Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/datatype/guava/deser/GuavaCollectionDeserializer;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer",
            "<*>;)",
            "Lcom/fasterxml/jackson/datatype/guava/deser/GuavaCollectionDeserializer",
            "<",
            "Lcom/google/common/a/fe",
            "<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 23
    new-instance v0, Lcom/fasterxml/jackson/datatype/guava/deser/ImmutableMultisetDeserializer;

    iget-object v1, p0, Lcom/fasterxml/jackson/datatype/guava/deser/ImmutableMultisetDeserializer;->_containerType:Lcom/fasterxml/jackson/databind/type/CollectionType;

    invoke-direct {v0, v1, p1, p2}, Lcom/fasterxml/jackson/datatype/guava/deser/ImmutableMultisetDeserializer;-><init>(Lcom/fasterxml/jackson/databind/type/CollectionType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    return-object v0
.end method

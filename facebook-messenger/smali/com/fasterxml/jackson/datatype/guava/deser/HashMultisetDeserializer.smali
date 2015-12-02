.class public Lcom/fasterxml/jackson/datatype/guava/deser/HashMultisetDeserializer;
.super Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMultisetDeserializer;
.source "HashMultisetDeserializer.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMultisetDeserializer",
        "<",
        "Lcom/google/common/a/eg",
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
    .line 15
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMultisetDeserializer;-><init>(Lcom/fasterxml/jackson/databind/type/CollectionType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    .line 16
    return-void
.end method


# virtual methods
.method protected createMultiset()Lcom/google/common/a/eg;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/eg",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 27
    invoke-static {}, Lcom/google/common/a/eg;->h()Lcom/google/common/a/eg;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic createMultiset()Lcom/google/common/a/jf;
    .locals 1

    .prologue
    .line 9
    invoke-virtual {p0}, Lcom/fasterxml/jackson/datatype/guava/deser/HashMultisetDeserializer;->createMultiset()Lcom/google/common/a/eg;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic withResolved(Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/datatype/guava/deser/GuavaCollectionDeserializer;
    .locals 1

    .prologue
    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/datatype/guava/deser/HashMultisetDeserializer;->withResolved(Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/datatype/guava/deser/HashMultisetDeserializer;

    move-result-object v0

    return-object v0
.end method

.method public withResolved(Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/datatype/guava/deser/HashMultisetDeserializer;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer",
            "<*>;)",
            "Lcom/fasterxml/jackson/datatype/guava/deser/HashMultisetDeserializer;"
        }
    .end annotation

    .prologue
    .line 21
    new-instance v0, Lcom/fasterxml/jackson/datatype/guava/deser/HashMultisetDeserializer;

    iget-object v1, p0, Lcom/fasterxml/jackson/datatype/guava/deser/HashMultisetDeserializer;->_containerType:Lcom/fasterxml/jackson/databind/type/CollectionType;

    invoke-direct {v0, v1, p1, p2}, Lcom/fasterxml/jackson/datatype/guava/deser/HashMultisetDeserializer;-><init>(Lcom/fasterxml/jackson/databind/type/CollectionType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    return-object v0
.end method

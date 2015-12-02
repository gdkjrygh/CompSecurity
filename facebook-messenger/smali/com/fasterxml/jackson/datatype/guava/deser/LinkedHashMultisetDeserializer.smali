.class public Lcom/fasterxml/jackson/datatype/guava/deser/LinkedHashMultisetDeserializer;
.super Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMultisetDeserializer;
.source "LinkedHashMultisetDeserializer.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMultisetDeserializer",
        "<",
        "Lcom/google/common/a/gv",
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
    .line 11
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/datatype/guava/deser/GuavaMultisetDeserializer;-><init>(Lcom/fasterxml/jackson/databind/type/CollectionType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    .line 12
    return-void
.end method


# virtual methods
.method protected createMultiset()Lcom/google/common/a/gv;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/gv",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 16
    invoke-static {}, Lcom/google/common/a/gv;->h()Lcom/google/common/a/gv;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic createMultiset()Lcom/google/common/a/jf;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/fasterxml/jackson/datatype/guava/deser/LinkedHashMultisetDeserializer;->createMultiset()Lcom/google/common/a/gv;

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
            "Lcom/google/common/a/gv",
            "<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 22
    new-instance v0, Lcom/fasterxml/jackson/datatype/guava/deser/LinkedHashMultisetDeserializer;

    iget-object v1, p0, Lcom/fasterxml/jackson/datatype/guava/deser/LinkedHashMultisetDeserializer;->_containerType:Lcom/fasterxml/jackson/databind/type/CollectionType;

    invoke-direct {v0, v1, p1, p2}, Lcom/fasterxml/jackson/datatype/guava/deser/LinkedHashMultisetDeserializer;-><init>(Lcom/fasterxml/jackson/databind/type/CollectionType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    return-object v0
.end method

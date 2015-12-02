.class public final Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider$Impl;
.super Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider;
.source "DefaultSerializerProvider.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 365
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider;-><init>()V

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/ser/SerializerFactory;)V
    .locals 0

    .prologue
    .line 369
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider;-><init>(Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/ser/SerializerFactory;)V

    .line 370
    return-void
.end method


# virtual methods
.method public createInstance(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/ser/SerializerFactory;)Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider$Impl;
    .locals 1

    .prologue
    .line 375
    new-instance v0, Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider$Impl;

    invoke-direct {v0, p0, p1, p2}, Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider$Impl;-><init>(Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/ser/SerializerFactory;)V

    return-object v0
.end method

.method public bridge synthetic createInstance(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/ser/SerializerFactory;)Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider;
    .locals 1

    .prologue
    .line 363
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider$Impl;->createInstance(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/ser/SerializerFactory;)Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider$Impl;

    move-result-object v0

    return-object v0
.end method

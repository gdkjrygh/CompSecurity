.class public Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;
.super Ljava/lang/Object;
.source "AnyGetterWriter.java"


# instance fields
.field protected final _accessor:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

.field protected final _property:Lcom/fasterxml/jackson/databind/BeanProperty;

.field protected _serializer:Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/BeanProperty;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;->_accessor:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    .line 30
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;->_property:Lcom/fasterxml/jackson/databind/BeanProperty;

    .line 31
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;->_serializer:Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;

    .line 32
    return-void
.end method


# virtual methods
.method public getAndSerialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .locals 4

    .prologue
    .line 37
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;->_accessor:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 38
    if-nez v0, :cond_0

    .line 46
    :goto_0
    return-void

    .line 41
    :cond_0
    instance-of v1, v0, Ljava/util/Map;

    if-nez v1, :cond_1

    .line 42
    new-instance v1, Lcom/fasterxml/jackson/databind/JsonMappingException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Value returned by \'any-getter\' ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;->_accessor:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "()) not java.util.Map but "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/JsonMappingException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 45
    :cond_1
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;->_serializer:Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;

    check-cast v0, Ljava/util/Map;

    invoke-virtual {v1, v0, p2, p3}, Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;->serializeFields(Ljava/util/Map;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    goto :goto_0
.end method

.method public resolve(Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .locals 2

    .prologue
    .line 51
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;->_serializer:Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;->_property:Lcom/fasterxml/jackson/databind/BeanProperty;

    invoke-virtual {v0, p1, v1}, Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;->createContextual(Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;->_serializer:Lcom/fasterxml/jackson/databind/ser/std/MapSerializer;

    .line 52
    return-void
.end method

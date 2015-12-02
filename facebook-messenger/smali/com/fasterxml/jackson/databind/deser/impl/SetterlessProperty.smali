.class public final Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;
.super Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
.source "SetterlessProperty.java"


# instance fields
.field protected final _annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

.field protected final _getter:Ljava/lang/reflect/Method;


# direct methods
.method protected constructor <init>(Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 45
    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;-><init>(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    .line 46
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->_annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->_annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    .line 47
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->_getter:Ljava/lang/reflect/Method;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->_getter:Ljava/lang/reflect/Method;

    .line 48
    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;-><init>(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Ljava/lang/String;)V

    .line 52
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->_annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->_annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    .line 53
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->_getter:Ljava/lang/reflect/Method;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->_getter:Ljava/lang/reflect/Method;

    .line 54
    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/util/Annotations;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;)V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;-><init>(Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/util/Annotations;)V

    .line 40
    iput-object p5, p0, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->_annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    .line 41
    invoke-virtual {p5}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;->getAnnotated()Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->_getter:Ljava/lang/reflect/Method;

    .line 42
    return-void
.end method


# virtual methods
.method public final deserializeAndSet(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 90
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    .line 91
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_0

    .line 115
    :goto_0
    return-void

    .line 101
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->_getter:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p3, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 111
    if-nez v0, :cond_1

    .line 112
    new-instance v0, Lcom/fasterxml/jackson/databind/JsonMappingException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Problem deserializing \'setterless\' property \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\': get method returned null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/JsonMappingException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 102
    :catch_0
    move-exception v0

    .line 103
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->_throwAsIOE(Ljava/lang/Exception;)Ljava/io/IOException;

    goto :goto_0

    .line 114
    :cond_1
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->_valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    invoke-virtual {v1, p1, p2, v0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public deserializeSetAndReturn(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 122
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->deserializeAndSet(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V

    .line 123
    return-object p3
.end method

.method public getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class",
            "<TA;>;)TA;"
        }
    .end annotation

    .prologue
    .line 74
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->_annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    return-object v0
.end method

.method public getMember()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->_annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    return-object v0
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 130
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Should never call \'set\' on setterless property"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setAndReturn(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 137
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 138
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic withName(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
    .locals 1

    .prologue
    .line 25
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->withName(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;

    move-result-object v0

    return-object v0
.end method

.method public withName(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;
    .locals 1

    .prologue
    .line 58
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;

    invoke-direct {v0, p0, p1}, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;-><init>(Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic withValueDeserializer(Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
    .locals 1

    .prologue
    .line 25
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;->withValueDeserializer(Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;

    move-result-object v0

    return-object v0
.end method

.method public withValueDeserializer(Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer",
            "<*>;)",
            "Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;"
        }
    .end annotation

    .prologue
    .line 63
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;

    invoke-direct {v0, p0, p1}, Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;-><init>(Lcom/fasterxml/jackson/databind/deser/impl/SetterlessProperty;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    return-object v0
.end method

.class public final Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;
.super Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
.source "MethodProperty.java"


# instance fields
.field protected final _annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

.field protected final _setter:Ljava/lang/reflect/Method;


# direct methods
.method protected constructor <init>(Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;-><init>(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    .line 45
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->_annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->_annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    .line 46
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->_setter:Ljava/lang/reflect/Method;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->_setter:Ljava/lang/reflect/Method;

    .line 47
    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 50
    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;-><init>(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Ljava/lang/String;)V

    .line 51
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->_annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->_annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    .line 52
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->_setter:Ljava/lang/reflect/Method;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->_setter:Ljava/lang/reflect/Method;

    .line 53
    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/util/Annotations;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;)V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;-><init>(Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/util/Annotations;)V

    .line 39
    iput-object p5, p0, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->_annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    .line 40
    invoke-virtual {p5}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;->getAnnotated()Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->_setter:Ljava/lang/reflect/Method;

    .line 41
    return-void
.end method


# virtual methods
.method public deserializeAndSet(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 89
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p3, v0}, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    return-void
.end method

.method public deserializeSetAndReturn(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 97
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p3, v0}, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->setAndReturn(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
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
    .line 73
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->_annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    return-object v0
.end method

.method public getMember()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->_annotated:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;

    return-object v0
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 105
    :try_start_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->_setter:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    :goto_0
    return-void

    .line 106
    :catch_0
    move-exception v0

    .line 107
    invoke-virtual {p0, v0, p2}, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->_throwAsIOE(Ljava/lang/Exception;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public setAndReturn(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 116
    :try_start_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->_setter:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 117
    if-nez v0, :cond_0

    .line 120
    :goto_0
    return-object p1

    :cond_0
    move-object p1, v0

    .line 117
    goto :goto_0

    .line 118
    :catch_0
    move-exception v0

    .line 119
    invoke-virtual {p0, v0, p2}, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->_throwAsIOE(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 120
    const/4 p1, 0x0

    goto :goto_0
.end method

.method public bridge synthetic withName(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
    .locals 1

    .prologue
    .line 23
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->withName(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;

    move-result-object v0

    return-object v0
.end method

.method public withName(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;
    .locals 1

    .prologue
    .line 57
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;

    invoke-direct {v0, p0, p1}, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;-><init>(Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic withValueDeserializer(Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
    .locals 1

    .prologue
    .line 23
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;->withValueDeserializer(Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;

    move-result-object v0

    return-object v0
.end method

.method public withValueDeserializer(Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer",
            "<*>;)",
            "Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;"
        }
    .end annotation

    .prologue
    .line 62
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;

    invoke-direct {v0, p0, p1}, Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;-><init>(Lcom/fasterxml/jackson/databind/deser/impl/MethodProperty;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    return-object v0
.end method

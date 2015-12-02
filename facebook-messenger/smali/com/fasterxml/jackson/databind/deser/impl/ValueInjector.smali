.class public Lcom/fasterxml/jackson/databind/deser/impl/ValueInjector;
.super Lcom/fasterxml/jackson/databind/BeanProperty$Std;
.source "ValueInjector.java"


# instance fields
.field protected final _valueId:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/util/Annotations;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/fasterxml/jackson/databind/BeanProperty$Std;-><init>(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/util/Annotations;Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)V

    .line 31
    iput-object p5, p0, Lcom/fasterxml/jackson/databind/deser/impl/ValueInjector;->_valueId:Ljava/lang/Object;

    .line 32
    return-void
.end method


# virtual methods
.method public findValue(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/ValueInjector;->_valueId:Ljava/lang/Object;

    invoke-virtual {p1, v0, p0, p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->findInjectableValue(Ljava/lang/Object;Lcom/fasterxml/jackson/databind/BeanProperty;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public inject(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 42
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/ValueInjector;->_member:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/impl/ValueInjector;->findValue(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->setValue(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    return-void
.end method
